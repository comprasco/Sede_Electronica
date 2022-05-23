/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ConsultarHistorialesSolicitudesPagadasBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.impl
 * Nombre del elemento: ConsultarHistorialesSolicitudesPagadasBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.impl;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import co.gov.supernotariado.bachue.clientebus.vo.consultarhistorialsolicitudespagadas.TipoEntradaBuscarSolicitudesVO;
import co.gov.supernotariado.bachue.clientebus.vo.consultarhistorialsolicitudespagadas.TipoEntradaConsultarDetalleSolicitudVO;
import co.gov.supernotariado.bachue.clientebus.vo.consultarhistorialsolicitudespagadas.TipoSalidaBuscarSolicitudesVO;
import co.gov.supernotariado.bachue.clientebus.vo.consultarhistorialsolicitudespagadas.TipoSalidaConsultarDetalleSolicitudVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IParametroBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ParametroDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters.BuscarSolicitudesWsDtoConverter;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters.ConsultarDetalleSolicitudWsDtoConverter;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IConsultarHistorialesSolicitudesPagadasBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaBuscarSolicitudesWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarDetalleSolicitudWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaBuscarSolicitudesWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarDetalleSolicitudWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumFormatoFecha;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumOperacionesWs;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumServiciosWs;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadBusCliente;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadHistoricoConsulta;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica para consumir operaciones del servicio
 * Consultar historiales solicitudes pagadas. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "ConsultarHistorialesSolicitudesPagadasBusiness", mappedName = "ConsultarHistorialesSolicitudesPagadasBusiness")
@LocalBean
public class ConsultarHistorialesSolicitudesPagadasBusiness implements IConsultarHistorialesSolicitudesPagadasBusiness{

	/**
	 * Atributo de instancia tipo IParametroBusiness para definir la propiedad
	 * parametro business.
	 */
	@EJB
	private IParametroBusiness iip_parametroBusiness;
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IConsultarHistorialesSolicitudesPagadasBusiness#buscarSolicitudes(co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaBuscarSolicitudesWSDTO)
	 */
	@Override
	public TipoSalidaBuscarSolicitudesWSDTO buscarSolicitudes(
			TipoEntradaBuscarSolicitudesWSDTO atebs_tipoEntradaBuscarSolicitudesWsdto) {
		ParametroDTO lp_parametroFechaEnvio = iip_parametroBusiness.consultarParametro(EnumFormatoFecha.FORMATO_PEDIDOS_PAGADOS_PET.getIs_formato());
		TipoEntradaBuscarSolicitudesVO ltebs_tipoEntradaBuscarSolicitudesVo = BuscarSolicitudesWsDtoConverter.wsdtoAVo(atebs_tipoEntradaBuscarSolicitudesWsdto,lp_parametroFechaEnvio.getIs_valor());
		TipoSalidaBuscarSolicitudesVO ltsbs_tipoSalidaBuscarSolicitudesVo = (TipoSalidaBuscarSolicitudesVO) 
				UtilidadBusCliente.crearEntradaClienteIntegracionBase(EnumServiciosWs.CONSULTAR_HISTORIAL_SOLICITUDES_PAGADAS, EnumOperacionesWs.HISTORIAL_SOLICITUDES_BUSCAR_SOLICITUDES, ltebs_tipoEntradaBuscarSolicitudesVo);
		TipoSalidaBuscarSolicitudesWSDTO ltsbs_tipoSalidaBuscarSolicitudesWsdto;
		ParametroDTO lp_parametroFechaResp = iip_parametroBusiness.consultarParametro(EnumFormatoFecha.FORMATO_PEDIDOS_PAGADOS_RESP.getIs_formato());
		ltsbs_tipoSalidaBuscarSolicitudesWsdto = BuscarSolicitudesWsDtoConverter.voAWsdto(ltsbs_tipoSalidaBuscarSolicitudesVo,lp_parametroFechaResp.getIs_valor());
		UtilidadHistoricoConsulta.registrarHistorioConsulta(
				EnumOperacionesWs.HISTORIAL_SOLICITUDES_BUSCAR_SOLICITUDES.getIs_nombreServicio(), 
				atebs_tipoEntradaBuscarSolicitudesWsdto.toString(), 
				ltsbs_tipoSalidaBuscarSolicitudesWsdto);
		return ltsbs_tipoSalidaBuscarSolicitudesWsdto;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IConsultarHistorialesSolicitudesPagadasBusiness#consultarDetalleSolicitud(co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarDetalleSolicitudWSDTO)
	 */
	@Override
	public TipoSalidaConsultarDetalleSolicitudWSDTO consultarDetalleSolicitud(
			TipoEntradaConsultarDetalleSolicitudWSDTO atecds_tipoEntradaConsultarDetalleSolicitudWsdto) {
		TipoEntradaConsultarDetalleSolicitudVO ltecds_tipoEntradaConsultarDetalleSolicitudVo = ConsultarDetalleSolicitudWsDtoConverter.wsdtoAVo(atecds_tipoEntradaConsultarDetalleSolicitudWsdto);
		TipoSalidaConsultarDetalleSolicitudVO ltscds_tipoSalidaConsultarDetalleSolicitudVo = (TipoSalidaConsultarDetalleSolicitudVO)
				UtilidadBusCliente.crearEntradaClienteIntegracionBase(EnumServiciosWs.CONSULTAR_HISTORIAL_SOLICITUDES_PAGADAS, EnumOperacionesWs.HISTORIAL_SOLICITUDES_CONSULTAR_DETALLE_SOLICITUD, ltecds_tipoEntradaConsultarDetalleSolicitudVo);
		TipoSalidaConsultarDetalleSolicitudWSDTO ltscds_tipoTipoSalidaConsultarDetalleSolicitudWsdto;
		
		ParametroDTO lp_parametroFechaEnvio = iip_parametroBusiness.consultarParametro(EnumFormatoFecha.FORMATO_PEDIDOS_PAGADOS_RESP.getIs_formato());
		ltscds_tipoTipoSalidaConsultarDetalleSolicitudWsdto = ConsultarDetalleSolicitudWsDtoConverter.voAWsdto(ltscds_tipoSalidaConsultarDetalleSolicitudVo,lp_parametroFechaEnvio.getIs_valor());
		
		UtilidadHistoricoConsulta.registrarHistorioConsulta(
				EnumOperacionesWs.HISTORIAL_SOLICITUDES_CONSULTAR_DETALLE_SOLICITUD.getIs_nombreServicio(), 
				atecds_tipoEntradaConsultarDetalleSolicitudWsdto.toString(), 
				ltscds_tipoTipoSalidaConsultarDetalleSolicitudWsdto);
		
		return ltscds_tipoTipoSalidaConsultarDetalleSolicitudWsdto;
	}

}
