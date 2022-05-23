/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: SolicitudesSinPagoBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.impl
 * Nombre del elemento: SolicitudesSinPagoBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.impl;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import co.gov.supernotariado.bachue.clientebus.vo.generacionsolicitud.TipoEntradaConsultarEstadoSolicitudVO;
import co.gov.supernotariado.bachue.clientebus.vo.generacionsolicitud.TipoEntradaGenerarSolicitudVO;
import co.gov.supernotariado.bachue.clientebus.vo.generacionsolicitud.TipoSalidaConsultarEstadoSolicitudVO;
import co.gov.supernotariado.bachue.clientebus.vo.generacionsolicitud.TipoSalidaGenerarSolicitudVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters.GenerarSolicitudConverter;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters.TipoConsultarEstadoSolicitudConverter;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.ISolicitudesSinPagoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarEstadoSolicitudWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaGenerarSolicitudWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarEstadoSolicitudWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaGenerarSolicitudWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumOperacionesWs;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumServiciosWs;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadBusCliente;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadHistoricoConsulta;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica para consumir operaciones del servicio
 * Solicitudes sin pago. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "SolicitudesSinPagoBusiness", mappedName = "SolicitudesSinPagoBusiness")
@LocalBean
public class SolicitudesSinPagoBusiness implements ISolicitudesSinPagoBusiness{

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.ISolicitudesSinPagoBusiness#generarSolicitud(co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaGenerarSolicitudWSDTO)
	 */
	@Override
	public TipoSalidaGenerarSolicitudWSDTO generarSolicitud(TipoEntradaGenerarSolicitudWSDTO ategs_tipoEntradaGenerarSolicitudWsdto) {
		TipoEntradaGenerarSolicitudVO ltegs_tipoEntradaGenerarSolicitudVo = GenerarSolicitudConverter.wsdtoAVo(ategs_tipoEntradaGenerarSolicitudWsdto);
		TipoSalidaGenerarSolicitudVO ltsgs_tipoSalidaGenerarSolicitudVo = (TipoSalidaGenerarSolicitudVO)
				UtilidadBusCliente.crearEntradaClienteIntegracionBase(EnumServiciosWs.GENERACION_SOLICITUD, EnumOperacionesWs.SOLICITUD_SIN_PAGO_GENERAR_SOLICITUD, ltegs_tipoEntradaGenerarSolicitudVo);
		TipoSalidaGenerarSolicitudWSDTO ltsgs_tipoSalidaGenerarSolicitudWsdto;
		ltsgs_tipoSalidaGenerarSolicitudWsdto = GenerarSolicitudConverter.voAWsdto(ltsgs_tipoSalidaGenerarSolicitudVo);
		return ltsgs_tipoSalidaGenerarSolicitudWsdto;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.ISolicitudesSinPagoBusiness#consultarEstadoSolicitud(co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarEstadoSolicitudWSDTO)
	 */
	@Override
	public TipoSalidaConsultarEstadoSolicitudWSDTO consultarEstadoSolicitud(TipoEntradaConsultarEstadoSolicitudWSDTO ateces_tipoEntradaConsultarEstadoSolicitudWsdto) {
		TipoEntradaConsultarEstadoSolicitudVO lteces_tipoEntradaConsultarEstadoSolicitudVo = TipoConsultarEstadoSolicitudConverter.wsdtoAVo(ateces_tipoEntradaConsultarEstadoSolicitudWsdto);
		TipoSalidaConsultarEstadoSolicitudVO ltsces_tipoSalidaConsultarEstadoSolicitudVo = (TipoSalidaConsultarEstadoSolicitudVO) UtilidadBusCliente.crearEntradaClienteIntegracionBase(EnumServiciosWs.GENERACION_SOLICITUD, EnumOperacionesWs.SOLICITUD_SIN_PAGO_CONSULTAR_ESTADO_SOLICITUD, lteces_tipoEntradaConsultarEstadoSolicitudVo);
		
		TipoSalidaConsultarEstadoSolicitudWSDTO ltsces_tipoSalidaConsultarEstadoSolicitudWsdto;
		ltsces_tipoSalidaConsultarEstadoSolicitudWsdto = TipoConsultarEstadoSolicitudConverter.voAWsdto(ltsces_tipoSalidaConsultarEstadoSolicitudVo);
		
		UtilidadHistoricoConsulta.registrarHistorioConsulta(
				EnumOperacionesWs.SOLICITUD_SIN_PAGO_CONSULTAR_ESTADO_SOLICITUD.getIs_nombreServicio(), 
				ateces_tipoEntradaConsultarEstadoSolicitudWsdto.toString(), 
				ltsces_tipoSalidaConsultarEstadoSolicitudWsdto);	
		
		return ltsces_tipoSalidaConsultarEstadoSolicitudWsdto;
	}
}
