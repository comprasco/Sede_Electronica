package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl;

import java.util.ArrayList;
import java.util.Base64;
import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesNegocio;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITransaccionBancarizacionBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionBancarizacionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TurnosBancarizacionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.ITransaccionBancarizacionDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.TransaccionBancarizacionHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.TurnosBancarizacionHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.TransaccionBancarizacion;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.TurnosBancarizacion;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.TurnosBancarizacionPK;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IBancarizacionBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.bancarizacion.ConsultarCertificadosTransaccionWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.bancarizacion.EntidadConsultarCertificadoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.bancarizacion.EntidadConsultarCertificadosTransaccionWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumEstadoBancarizacion;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumSubServicios;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoServicio;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesBancarizacion;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadAuditoria;

/**
 * 
 * @version 1.0
 * @author Smartsoft Solutions S.A.S Nota: Implementacion de la interface de la
 *         capa de negocio.
 */
@Stateless(name = "TransaccionBancarizacionBusiness", mappedName = "TransaccionBancarizacionBusiness")
@LocalBean
public class TransaccionBancarizacionBusiness implements ITransaccionBancarizacionBusiness {

	@EJB
	private ITransaccionBancarizacionDAO itb_transaccionBancarizacionDAO;
	@EJB
	private IBancarizacionBusiness itb_transaccionBancarizacionBusiness;

	@Override
	public List<TransaccionBancarizacionDTO> consultarTransaccionBancarizacion(String as_IdUsuario,
			Date ad_fechaInicial, Date ad_fechaFinal) {

		List<TransaccionBancarizacion> lltb_transaccionBancarizacion = itb_transaccionBancarizacionDAO
				.consultarTransaccionBancarizacion(as_IdUsuario, ad_fechaInicial, ad_fechaFinal);
		List<TransaccionBancarizacionDTO> lltb_transaccionBancarizacionDto = TransaccionBancarizacionHelper
				.listaEntidadADtoSimple(lltb_transaccionBancarizacion);

		// Se les indica los servicios y subservicios - al ser de bancarizacion aplican
		// solo certificados por medios eletronicos
		lltb_transaccionBancarizacionDto.forEach(ltb_transaccionBancaria -> {
			completarServicioBancarizacion(ltb_transaccionBancaria);
		});
		return lltb_transaccionBancarizacionDto;

	}

	@Override
	public Boolean insertarTransaccionBancarizacion(TransaccionBancarizacionDTO atb_transaccionBancarizacion) {
		Boolean lb_estadoTransaccion = itb_transaccionBancarizacionDAO
				.insertarTransaccionBancarizacion(TransaccionBancarizacionHelper
						.dtoAEntidadCompleto(atb_transaccionBancarizacion, new TransaccionBancarizacion()));
		return lb_estadoTransaccion;

	}

	@Override
	public Boolean insertarTurnosTransaccionBancarizacion(
			List<TurnosBancarizacionDTO> altb_turnosTransaccionBancarizacion, String as_referenciaPago) {
		Boolean lb_estadoTransaccion = itb_transaccionBancarizacionDAO.insertarTransaccionBancarizacion(
				TransaccionBancarizacionHelper.dtoAEntidadCompleto(null, new TransaccionBancarizacion()));
		return lb_estadoTransaccion;

	}

	@Override
	public TransaccionBancarizacionDTO actualizarEstadoTurnos(String as_codigoTransaccion) {

		TransaccionBancarizacion ltb_transaccionBancarizacion = itb_transaccionBancarizacionDAO
				.consultarTransaccionBancarizacion(as_codigoTransaccion);

		if (!ltb_transaccionBancarizacion.getEstadoServicio().equals(EnumEstadoBancarizacion.OK.getIs_estado())) {

			ConsultarCertificadosTransaccionWSDTO lcct_ConsultarCertificadosTransaccionWSDTO = new ConsultarCertificadosTransaccionWSDTO();
			lcct_ConsultarCertificadosTransaccionWSDTO.setIl_codigoTransaccion(new Long(as_codigoTransaccion));
			EntidadConsultarCertificadosTransaccionWSDTO lecct_entidadConsultaCertificado = itb_transaccionBancarizacionBusiness
					.consultarCertificadosTransaccion(lcct_ConsultarCertificadosTransaccionWSDTO);

			if (lecct_entidadConsultaCertificado.getIs_estado().equals(EnumEstadoBancarizacion.OK.getIs_estado())) {

				ltb_transaccionBancarizacion.setTurnosBancarizacions(new ArrayList<TurnosBancarizacion>());
				List<EntidadConsultarCertificadoWSDTO> llecc_certificados = lecct_entidadConsultaCertificado
						.getIlecc_certificados();
				List<TurnosBancarizacion> lltb_turnos = new ArrayList<TurnosBancarizacion>();

				llecc_certificados.forEach(lecc_entidadConsultarCertificadoWSDTO -> {
					TurnosBancarizacion ltb_turnosBancarizacion = TurnosBancarizacionHelper.dtoAEntidadCompleto((TurnosBancarizacionDTO)UtilidadAuditoria.adicionarDatosCreacion(new TurnosBancarizacionDTO()), new TurnosBancarizacion());
					TurnosBancarizacionPK ltb_turnosBancarizacioPK = new TurnosBancarizacionPK();

					ltb_turnosBancarizacioPK.setIdTransaccionBancarizacion(ltb_transaccionBancarizacion.getId());
					ltb_turnosBancarizacioPK.setIdTurno(lecc_entidadConsultarCertificadoWSDTO.getIs_turno());

					ltb_turnosBancarizacion.setArchivo(new String(
							Base64.getEncoder().encode(lecc_entidadConsultarCertificadoWSDTO.getIb_archivo())));
					ltb_turnosBancarizacion.setId(ltb_turnosBancarizacioPK);
					ltb_turnosBancarizacion.setMatricula(lecc_entidadConsultarCertificadoWSDTO.getIs_matricula());
					ltb_turnosBancarizacion
							.setNumeroPaginas(lecc_entidadConsultarCertificadoWSDTO.getIi_numeroPaginas().toString());
					ltb_turnosBancarizacion.setPin(lecc_entidadConsultarCertificadoWSDTO.getIs_pin());
					ltb_turnosBancarizacion.setFechaServicio(ltb_transaccionBancarizacion.getFechaServicio());
					lltb_turnos.add(ltb_turnosBancarizacion);
					
				});

				ltb_transaccionBancarizacion.setEstadoServicio(EnumEstadoBancarizacion.OK.getIs_estado());
				Boolean lb_estadoTransaccion = itb_transaccionBancarizacionDAO
						.insertarTurnosBancarizacion(ltb_transaccionBancarizacion, lltb_turnos);
				

				if (!lb_estadoTransaccion) {
					throw new ExcepcionesNegocio(EnumExcepcionesBancarizacion.ERROR_ACTUALIZACION_TURNOS);
				}
				
				TransaccionBancarizacionDTO ltb_transaccionBancarizacionDto = generarDto(ltb_transaccionBancarizacion);
				ltb_transaccionBancarizacionDto.setIltb_turnosBancarizacion(TurnosBancarizacionHelper.listaentidadADtoSimple(lltb_turnos));

				return ltb_transaccionBancarizacionDto;

			} else {
				throw new ExcepcionesNegocio(EnumExcepcionesBancarizacion.CERTIFICADOS_NO_GENERADOS);
			}
		}

		TransaccionBancarizacionDTO ltb_transaccionBancarizacionDto = generarDto(ltb_transaccionBancarizacion);
		
		return ltb_transaccionBancarizacionDto;
	}
	
	private TransaccionBancarizacionDTO generarDto(	TransaccionBancarizacion atb_transaccionBancarizacion) {
	
		TransaccionBancarizacionDTO ltb_transaccionBancarizacionDto = TransaccionBancarizacionHelper
				.entidadADtoCompleto(atb_transaccionBancarizacion);
		completarServicioBancarizacion(ltb_transaccionBancarizacionDto);		
		return ltb_transaccionBancarizacionDto;
	}
	

	/**
	 * Metodo que completa el tipo de servicio y subservicio de bancarizacion (solo
	 * son certifficados)
	 * 
	 * @param atb_transaccionBancarizacion
	 */
	private void completarServicioBancarizacion(TransaccionBancarizacionDTO atb_transaccionBancarizacion) {
		atb_transaccionBancarizacion.setIs_servicio(EnumTipoServicio.CERTIFICADO.getIs_nombreLegible());
		atb_transaccionBancarizacion
				.setIs_subServicio(EnumSubServicios.CONSULTA_CERTIFICADOS_MEDIO_ELECTRONICO.getIs_codigo());
	}

}
