/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IntegracionBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl
 * Nombre del elemento: IntegracionBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import org.apache.log4j.Logger;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IIntegracionBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IIntegracionTemporalBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.IntegracionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.IntegracionTemporalDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionIndividualDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IIntegracionDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.IntegracionHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Integracion;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IInterfacesFinancierasBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.EstadoLiquidacionSalidaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCodigosRespuestas;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumEstadoLiquidacion;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadAuditoria;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadExcepciones;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica de las operaciones del recurso Integracion.
 * <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "IntegracionBusiness", mappedName = "IntegracionBusiness")
@LocalBean
public class IntegracionBusiness implements IIntegracionBusiness {

	/**
	 * Atributo de instancia tipo IIntegracionDAO para definir la propiedad
	 * integracion DAO.
	 */
	@EJB
	private IIntegracionDAO iii_integracionDAO;
	
	/**
	 * Atributo de instancia tipo IIntegracionTemporalBusiness para definir la
	 * propiedad integracion temporal business.
	 */
	@EJB
	private IIntegracionTemporalBusiness iiit_integracionTemporalBusiness;
	
	/**
	 * Atributo de instancia tipo IInterfacesFinancierasBusiness para definir la
	 * propiedad interfaces financieras business.
	 */
	@EJB
	private IInterfacesFinancierasBusiness iiif_interfacesFinancierasBusiness;

	/**
	 * Define la constante CL_LOGGER.
	 */
	private static final Logger CL_LOGGER = Logger.getLogger(IntegracionBusiness.class);
	
	/**
	 * Metodo que permite crear el objeto a una Entidad asociada a la capa DAO.
	 *
	 * @param ai_integracionDto el parametro integracion dto
	 * @return true si la operacion se realiza exitosamente.
	 */
	@Override
	public Boolean crearIntegracion(IntegracionDTO ai_integracionDto) {
		ai_integracionDto = (IntegracionDTO) UtilidadAuditoria.adicionarDatosCreacion(ai_integracionDto);
		return iii_integracionDAO
				.crearIntegracion(IntegracionHelper.dtoAEntidadCompleto(ai_integracionDto, new Integracion()));
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IIntegracionBusiness#consultarHistorico(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionIndividualDTO)
	 */
	@Override
	public List<TransaccionIndividualDTO> consultarHistorico(TransaccionIndividualDTO ati_transaccionDto) {
		List<IntegracionDTO> lli_listaIntegracionDto;
		lli_listaIntegracionDto = IntegracionHelper.listaEntidadADtoCompleto(iii_integracionDAO.consultarHistorico());
		List<TransaccionIndividualDTO> llti_listaTransaccionIndividualDto = new ArrayList<>();
		for (IntegracionDTO lit_integracionTemporalDto : lli_listaIntegracionDto) {
			TransaccionIndividualDTO lti_transaccionIndividualDto = new TransaccionIndividualDTO();
			lit_integracionTemporalDto.getId_fechaCreacion();
			llti_listaTransaccionIndividualDto.add(lti_transaccionIndividualDto);
		}
		return llti_listaTransaccionIndividualDto;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IIntegracionBusiness#consultarEstadoLiquidacion(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.IntegracionTemporalDTO)
	 */
	@Override
	public IntegracionDTO consultarEstadoLiquidacion(IntegracionTemporalDTO ait_integracionTemporalDto) {
		try {

			String ls_referenciaPago = (ait_integracionTemporalDto.getIs_referenciaPago() == null) ? ""
					: ait_integracionTemporalDto.getIs_referenciaPago();
			BigDecimal lbd_montoTransaccion = ait_integracionTemporalDto.getIbd_valorTotalServicio();
			EstadoLiquidacionSalidaWSDTO lels_resultado;
			lels_resultado = iiif_interfacesFinancierasBusiness.consultarEstadoLiquidacion(lbd_montoTransaccion,
					ls_referenciaPago);
			if ((lels_resultado.getIs_codigoMensaje().equals(EnumCodigosRespuestas.CODIGO_409.getIs_codigo()) && lels_resultado.getIs_estadoTransaccion()
					.equals(EnumEstadoLiquidacion.REFERENCIA_PAGADA.getIs_respuesta())) 
					|| lbd_montoTransaccion.compareTo(new BigDecimal(0)) == 0) {
				IntegracionDTO li_integracion = guardarTransaccionPermanente(ait_integracionTemporalDto, lels_resultado);
				iiit_integracionTemporalBusiness.eliminarTemporal(ait_integracionTemporalDto);
				return li_integracion;
			}
			UtilidadExcepciones.manejadorExcepcionesServicios(lels_resultado);
			return null;			
		} catch (Exception ae_excepcion) {
			CL_LOGGER.error(ae_excepcion.getMessage(),ae_excepcion);
			return null;
		}
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IIntegracionBusiness#confirmarIntegracionTemporal(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.IntegracionTemporalDTO, java.lang.String)
	 */
	@Override
	public Boolean confirmarIntegracionTemporal(IntegracionTemporalDTO ait_integracionTemporalDto,
			String as_operacion) {
		IntegracionDTO li_integracion = consultarEstadoLiquidacion(ait_integracionTemporalDto);
		if (li_integracion != null) {
			return iiit_integracionTemporalBusiness.eliminarTemporal(ait_integracionTemporalDto);
		}		
		return false;
	}


	/**
	 * Metodo que guarda en Integracion permanente si al consultar estado
	 * liquidacion el servicio devuelve que fue pagado.
	 *
	 * @param ait_integracionTemporalDto Datos de integracion Temporal que se van a
	 *                                   enviar a integracion permanente y que se va
	 *                                   a borrar
	 * @param aels_resultado             datos del resultado de la consulta de
	 *                                   estado de liquidacion
	 * @return Resultado para guardar transaccion permanente retornado como
	 *         IntegracionDTO
	 */
	private IntegracionDTO guardarTransaccionPermanente(IntegracionTemporalDTO ait_integracionTemporalDto,
			EstadoLiquidacionSalidaWSDTO aels_resultado) {
		IntegracionDTO li_integracionDto = new IntegracionDTO();
		li_integracionDto.setIs_nir(ait_integracionTemporalDto.getIs_nir());
		li_integracionDto.setIs_operacion(ait_integracionTemporalDto.getIs_operacion());
		li_integracionDto.setIs_referenciaPago(ait_integracionTemporalDto.getIs_referenciaPago());
		li_integracionDto.setIs_entrada(ait_integracionTemporalDto.getIs_entrada());
		li_integracionDto.setIs_modeloEntrada(ait_integracionTemporalDto.getIs_modeloEntrada());
		li_integracionDto.setIs_codigoRespuesta(EnumCodigosRespuestas.CODIGO_200.getIs_codigo());
		li_integracionDto.setItp_tipoProcesoDto(ait_integracionTemporalDto.getItp_tipoProcesoDto());
		li_integracionDto.setIs_resultadoGeneral(EnumEstadoLiquidacion.REFERENCIA_PAGADA.getIs_respuesta());
		li_integracionDto.setIs_salida(aels_resultado.toString());
		if(crearIntegracion(li_integracionDto) != null)
			return li_integracionDto;
		return null;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IIntegracionBusiness#administrarTransaccionesPagas()
	 */
	@Override
	public void administrarTransaccionesPagas() {
		List<IntegracionTemporalDTO> llit_listaIntegracionTemporalDto = iiit_integracionTemporalBusiness
				.consultarIntegraciones();
		if (Objects.nonNull(llit_listaIntegracionTemporalDto)) {
			for (IntegracionTemporalDTO lit_integracionTemporal : llit_listaIntegracionTemporalDto) {
				if (consultarEstadoLiquidacion(lit_integracionTemporal) != null) {
					iiit_integracionTemporalBusiness.eliminarTemporal(lit_integracionTemporal);
				}
			}
		}
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IIntegracionBusiness#anularRecargaCuenta(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.IntegracionTemporalDTO, java.lang.String, java.lang.String)
	 */
	@Override
	public Boolean anularRecargaCuenta(IntegracionTemporalDTO ait_integracionTemporalDto
			,String as_resultado, String as_salida) {
		IntegracionDTO li_integracionDto = new IntegracionDTO();
		li_integracionDto.setIs_nir(ait_integracionTemporalDto.getIs_nir());
		li_integracionDto.setIs_operacion(ait_integracionTemporalDto.getIs_operacion());
		li_integracionDto.setIs_referenciaPago(ait_integracionTemporalDto.getIs_referenciaPago());
		li_integracionDto.setIs_entrada(ait_integracionTemporalDto.getIs_entrada());
		li_integracionDto.setIs_modeloEntrada(ait_integracionTemporalDto.getIs_modeloEntrada());
		li_integracionDto.setIs_codigoRespuesta(EnumEstadoLiquidacion.REFERENCIA_ANULADA.getIs_respuesta());
		li_integracionDto.setItp_tipoProcesoDto(ait_integracionTemporalDto.getItp_tipoProcesoDto());
		li_integracionDto.setIs_resultadoGeneral(as_resultado);
		li_integracionDto.setIs_salida(as_salida);
		iiit_integracionTemporalBusiness.eliminarTemporal(ait_integracionTemporalDto);
		return crearIntegracion(li_integracionDto);
	}


}
