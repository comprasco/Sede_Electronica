package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IDevolucionServicioRegistralBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ActosDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CertificadosDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionServicioRegistralDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IInterfazTrazabilidadBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.ActoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.CertificadoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultaActosTurnoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultaDetalleCertificadoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultaActosTurnoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultaDetalleCertificadoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumBoolean;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadExcepciones;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica de las operaciones del recurso
 * Devolucion Servicio Registral. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */

@Stateless(name = "DevolucionServicioBusiness", mappedName = "DevolucionServicioBusiness")
@LocalBean
public class DevolucionServicioRegistralBusiness extends GenericoTransaccionModeloBusiness implements IDevolucionServicioRegistralBusiness {

	/**
	 * Atributo de instancia tipo IInterfazTrazabilidadBusiness para definir la
	 * propiedad interfaz trazabilidad business.
	 */
	@EJB
	private IInterfazTrazabilidadBusiness iitb_interfazTrazabilidadBusiness;

	private static final String CS_SIN_CUANTIA = "Sin Cuantia";
	private static final String CS_CON_CUANTIA = "Con Cuantia";

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITrasladoMatriculasBusiness#generarSolicitud(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TrasladoMatriculaDTO)
	 */
	@Override
	public String generarSolicitud(TransaccionServicioRegistralDTO atsr_transaccionServicioRegistralDto) {

		return "SNR2019000001575";
	}

	@Override
	public List<ActosDTO> cargarListaConsulta(TipoEntradaConsultaActosTurnoWSDTO atecat_tipoEntradaConsultaActosTurnoWsDto) {
		TipoSalidaConsultaActosTurnoWSDTO ltscat_tipoSalidaConsultaActosTurnoWsDto = iitb_interfazTrazabilidadBusiness
				.consultaActosTurno(atecat_tipoEntradaConsultaActosTurnoWsDto);
		UtilidadExcepciones.manejadorExcepcionesServicios(ltscat_tipoSalidaConsultaActosTurnoWsDto);
		List<ActosDTO> lla_listaActosDto = new ArrayList<>();

		for (ActoWSDTO la_actoWsDto : ltscat_tipoSalidaConsultaActosTurnoWsDto.getIla_actos()) {
			ActosDTO la_actosDto = new ActosDTO();
			la_actosDto.setIs_cantidadActos(la_actoWsDto.getIs_cantidadActos());
			la_actosDto.setIs_codigoActo(la_actoWsDto.getIs_codigoActo());
			la_actosDto.setIs_nombreTipoActo(la_actoWsDto.getIs_nombreTipoActo());
			
			la_actosDto.setIs_tieneCuantia((la_actoWsDto.getIs_tieneCuantia().equals(EnumBoolean.CHAR_S.getIs_codigo()))?CS_CON_CUANTIA:CS_SIN_CUANTIA);
			la_actosDto.setIs_tarifaExenta(la_actoWsDto.getIs_tarifaExenta());
			la_actosDto.setIs_valorAvaluo(la_actoWsDto.getIs_valorAvaluo());
			la_actosDto.setIs_valorConservacionDocumental(la_actoWsDto.getIs_valorConservacionDocumental());
			la_actosDto.setIs_valorCuantia(la_actoWsDto.getIs_valorCuantia());
			la_actosDto.setIs_valorDerechos(la_actoWsDto.getIs_valorDerechos());
			la_actosDto.setIs_valorTotal(la_actoWsDto.getIs_valorTotal());

			lla_listaActosDto.add(la_actosDto);

		}

		return lla_listaActosDto;
	}

	/**
	 * Metodo que se encarga de llamar al servicio de trazabilidad, operacion consulta detalle certificados y se carga la lista a usar
	 * 
	 * @param atecdc_tipoEntradaConsultaDetalleCertificadoWsDto datos para consumir el servicio
	 * @return List<CertificadosDTO> lista de certificados para uso en el aplicativo
	 */
	public List<CertificadosDTO> cargarListaConsultaDetalleCertificado(TipoEntradaConsultaDetalleCertificadoWSDTO atecdc_tipoEntradaConsultaDetalleCertificadoWsDto){
		TipoSalidaConsultaDetalleCertificadoWSDTO ltscdc_tipoSalidaConsultaDetalleCertificadoWsDto = iitb_interfazTrazabilidadBusiness
				.consultaDetalleCertificado(atecdc_tipoEntradaConsultaDetalleCertificadoWsDto);
		UtilidadExcepciones.manejadorExcepcionesServicios(ltscdc_tipoSalidaConsultaDetalleCertificadoWsDto);
		List<CertificadosDTO> llc_listaCertificadosDto = new ArrayList<>();

		for (CertificadoWSDTO lc_certificadoWsDto : ltscdc_tipoSalidaConsultaDetalleCertificadoWsDto.getIlc_certificados()) {
			CertificadosDTO lc_certificadosDto = new CertificadosDTO();
			lc_certificadosDto.setIs_cantidad(lc_certificadoWsDto.getIs_cantidad());
			lc_certificadosDto.setIs_codCirculoRegistral(lc_certificadoWsDto.getIs_codCirculoRegistral());
			lc_certificadosDto.setIs_nombre(lc_certificadoWsDto.getIs_nombre());
			lc_certificadosDto.setIs_numMatriculaInmobiliaria(lc_certificadoWsDto.getIs_numMatriculaInmobiliaria());
			lc_certificadosDto.setIs_proceso(lc_certificadoWsDto.getIs_proceso());
			lc_certificadosDto.setIs_subproceso(lc_certificadoWsDto.getIs_subproceso());
			lc_certificadosDto.setIs_tipoTarifa(lc_certificadoWsDto.getIs_tipoTarifa());
			lc_certificadosDto.setIs_valor(lc_certificadoWsDto.getIs_valor());
			lc_certificadosDto.setIs_valorTotal(lc_certificadoWsDto.getIs_valorTotal());
			llc_listaCertificadosDto.add(lc_certificadosDto);

		}

		return llc_listaCertificadosDto;


	}

}
