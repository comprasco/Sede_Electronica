/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: SolicitudCopiasBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.impl
 * Nombre del elemento: SolicitudCopiasBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.impl;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import org.apache.log4j.Logger;

import co.gov.supernotariado.bachue.clientebus.vo.solicitudcopias.TipoEntradaConsultarSolicitudVO;
import co.gov.supernotariado.bachue.clientebus.vo.solicitudcopias.TipoEntradaIngresoSolicitudVO;
import co.gov.supernotariado.bachue.clientebus.vo.solicitudcopias.TipoSalidaConsultarSolicitudVO;
import co.gov.supernotariado.bachue.clientebus.vo.solicitudcopias.TipoSalidaIngresoSolicitudVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesNegocio;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters.CopiasConsultarSolicitudWsDtoConverter;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters.CopiasIngresoSolicitudWSDTOConverter;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.ISolicitudCopiasBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarSolicitudWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaIngresoSolicitudCopiasWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarSolicitudWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaIngresoSolicitudCopiasWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumOperacionesWs;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumServiciosWs;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadBusCliente;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadHistoricoConsulta;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica para consumir operaciones del servicio
 * Solicitud copias. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "SolicitudCopiasBusiness", mappedName = "SolicitudCopiasBusiness")
@LocalBean
public class SolicitudCopiasBusiness implements ISolicitudCopiasBusiness{

	/**
	 * Define la constante CL_LOGGER.
	 */
	private static final Logger CL_LOGGER = Logger.getLogger(SolicitudCopiasBusiness.class);
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.ISolicitudCopiasBusiness#ingresoSolicitudCopias(co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaIngresoSolicitudCopiasWSDTO)
	 */
	@Override
	public TipoSalidaIngresoSolicitudCopiasWSDTO ingresoSolicitudCopias(
			TipoEntradaIngresoSolicitudCopiasWSDTO ateisc_tipoEntradaIngresoSolicitudCopiasWsDto) {
		TipoEntradaIngresoSolicitudVO lteis_tipoEntradaIngresoSolicitudVo = CopiasIngresoSolicitudWSDTOConverter.wsDtoAVo(ateisc_tipoEntradaIngresoSolicitudCopiasWsDto);
		TipoSalidaIngresoSolicitudVO ltsis_tipoSalidaIngresoSolicitudVo = 
				(TipoSalidaIngresoSolicitudVO) UtilidadBusCliente.crearEntradaClienteIntegracionBase(EnumServiciosWs.SOLICITUD_COPIAS, EnumOperacionesWs.COPIAS_INGRESO_SOLICITUD, lteis_tipoEntradaIngresoSolicitudVo);
		TipoSalidaIngresoSolicitudCopiasWSDTO ltsisc_tipoSalidaIngresoSolicitudCopiasWsDto;
		ltsisc_tipoSalidaIngresoSolicitudCopiasWsDto = CopiasIngresoSolicitudWSDTOConverter.voAWsDto(ltsis_tipoSalidaIngresoSolicitudVo);
		return ltsisc_tipoSalidaIngresoSolicitudCopiasWsDto;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.ISolicitudCopiasBusiness#consultarSolicitudCopias(co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarSolicitudWSDTO)
	 */
	@Override
	public TipoSalidaConsultarSolicitudWSDTO consultarSolicitudCopias(
			TipoEntradaConsultarSolicitudWSDTO atecs_tipoEntradaConsultarSolicitudWsDto) {
		TipoEntradaConsultarSolicitudVO ltecs_tipoEntradaConsultarSolicitudVo = CopiasConsultarSolicitudWsDtoConverter.wsDtoAVo(atecs_tipoEntradaConsultarSolicitudWsDto);
		TipoSalidaConsultarSolicitudVO ltscs_tipoSalidaConsultarSolicitudVo;
		try {
			ltscs_tipoSalidaConsultarSolicitudVo =
				(TipoSalidaConsultarSolicitudVO) UtilidadBusCliente.crearEntradaClienteIntegracionBase(EnumServiciosWs.SOLICITUD_COPIAS, EnumOperacionesWs.COPIAS_CONSULTAR_SOLICITUD, ltecs_tipoEntradaConsultarSolicitudVo);
		}catch(ExcepcionesNegocio aen_excepcionNegocio) {
			CL_LOGGER.error(aen_excepcionNegocio.getMessage());
			return null;
		}
		TipoSalidaConsultarSolicitudWSDTO ltscs_tipoSalidaConsultarSolicitudWsDto;
		ltscs_tipoSalidaConsultarSolicitudWsDto = CopiasConsultarSolicitudWsDtoConverter.voAWsDto(ltscs_tipoSalidaConsultarSolicitudVo);
		
		UtilidadHistoricoConsulta.registrarHistorioConsulta(
				EnumOperacionesWs.COPIAS_CONSULTAR_SOLICITUD.getIs_nombreServicio(), 
				atecs_tipoEntradaConsultarSolicitudWsDto.toString(), 
				ltscs_tipoSalidaConsultarSolicitudWsDto);	
		
		return ltscs_tipoSalidaConsultarSolicitudWsDto;
	}

}
