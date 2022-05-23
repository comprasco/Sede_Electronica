/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: SolicitudCorreccionesBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.impl
 * Nombre del elemento: SolicitudCorreccionesBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.impl;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import co.gov.supernotariado.bachue.clientebus.vo.solicitudcorreccion.TipoEntradaIngresoSolicitudVO;
import co.gov.supernotariado.bachue.clientebus.vo.solicitudcorreccion.TipoObtenerCausalesCorreccionVO;
import co.gov.supernotariado.bachue.clientebus.vo.solicitudcorreccion.TipoSalidaIngresoSolicitudVO;
import co.gov.supernotariado.bachue.clientebus.vo.solicitudcorreccion.TipoSalidaObtenerCausalesCorreccionVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters.IngresoSolicitudWsDtoConverter;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters.ObtenerCausalesCorreccionWsDtoConverter;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.ISolicitudCorreccionesBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaIngresoSolicitudWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaIngresoSolicitudWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaObtenerCausalesCorreccionWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumOperacionesWs;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumServiciosWs;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadBusCliente;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadHistoricoConsulta;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica para consumir operaciones del servicio
 * Solicitud correcciones. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "SolicitudCorreccionesBusiness", mappedName = "SolicitudCorreccionesBusiness")
@LocalBean
public class SolicitudCorreccionesBusiness implements ISolicitudCorreccionesBusiness{

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.ISolicitudCorreccionesBusiness#ingresoSolicitud(co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaIngresoSolicitudWSDTO)
	 */
	@Override
	public TipoSalidaIngresoSolicitudWSDTO ingresoSolicitud(
			TipoEntradaIngresoSolicitudWSDTO ateis_tipoEntradaIngresoSolicitudWsdto) {
		TipoEntradaIngresoSolicitudVO lteis_tipoEntradaIngresoSolicitudVo = IngresoSolicitudWsDtoConverter.wsdtoAVo(ateis_tipoEntradaIngresoSolicitudWsdto);
		TipoSalidaIngresoSolicitudVO ltsis_tipoSalidaIngresoSolicitudVo = (TipoSalidaIngresoSolicitudVO) UtilidadBusCliente.crearEntradaClienteIntegracionBase(EnumServiciosWs.SOLICITUD_CORRECCION,EnumOperacionesWs.SOLICITUD_CORRECCION_INGRESO_SOLICITUD,lteis_tipoEntradaIngresoSolicitudVo);
		return IngresoSolicitudWsDtoConverter.voAWsdto(ltsis_tipoSalidaIngresoSolicitudVo);
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.ISolicitudCorreccionesBusiness#obtenerCausalesCorreccion()
	 */
	@Override
	public TipoSalidaObtenerCausalesCorreccionWSDTO obtenerCausalesCorreccion() {
		TipoSalidaObtenerCausalesCorreccionVO ltsocc_tipoSalidaObtenerCausalesCorreccionVo = (TipoSalidaObtenerCausalesCorreccionVO) UtilidadBusCliente.crearEntradaClienteIntegracionBase(EnumServiciosWs.SOLICITUD_CORRECCION,EnumOperacionesWs.SOLICITUD_CORRECCION_OBTENER_CAUSALES, new TipoObtenerCausalesCorreccionVO());
		TipoSalidaObtenerCausalesCorreccionWSDTO ltsocc_tipoSalidaObtenerCausalesCorreccionWSDTO = ObtenerCausalesCorreccionWsDtoConverter.entidaAWsdto(ltsocc_tipoSalidaObtenerCausalesCorreccionVo);
		UtilidadHistoricoConsulta.registrarHistorioConsulta(
				EnumOperacionesWs.COPIAS_CONSULTAR_SOLICITUD.getIs_nombreServicio(), 
				null, 
				ltsocc_tipoSalidaObtenerCausalesCorreccionWSDTO);	
		
		return ltsocc_tipoSalidaObtenerCausalesCorreccionWSDTO;
	}

} 