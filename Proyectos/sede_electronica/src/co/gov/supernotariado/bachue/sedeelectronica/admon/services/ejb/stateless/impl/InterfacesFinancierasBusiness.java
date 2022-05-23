/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: InterfacesFinancierasBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.impl
 * Nombre del elemento: InterfacesFinancierasBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.impl;

import java.math.BigDecimal;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import org.apache.log4j.Logger;

import co.gov.supernotariado.bachue.clientebus.vo.operacionesfinancieras.TipoEntradaConsultarEstadoLiquidacionVO;
import co.gov.supernotariado.bachue.clientebus.vo.operacionesfinancieras.TipoEntradaConsultarTarifaServicioVO;
import co.gov.supernotariado.bachue.clientebus.vo.operacionesfinancieras.TipoEntradaGenerarLiquidacionVO;
import co.gov.supernotariado.bachue.clientebus.vo.operacionesfinancieras.TipoEntradaNotificarPagoVO;
import co.gov.supernotariado.bachue.clientebus.vo.operacionesfinancieras.TipoEntradaObtenerPDFLiquidacionVO;
import co.gov.supernotariado.bachue.clientebus.vo.operacionesfinancieras.TipoSalidaConsultaEstadoLiquidacionVO;
import co.gov.supernotariado.bachue.clientebus.vo.operacionesfinancieras.TipoSalidaConsultarTarifaServicioVO;
import co.gov.supernotariado.bachue.clientebus.vo.operacionesfinancieras.TipoSalidaGenerarLiquidacionVO;
import co.gov.supernotariado.bachue.clientebus.vo.operacionesfinancieras.TipoSalidaNotificarPagoVO;
import co.gov.supernotariado.bachue.clientebus.vo.operacionesfinancieras.TipoSalidaObtenerPDFLiquidacionVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IServicioIntegracionBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PersonaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters.EstadoLiquidacionWsDtoConverter;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters.LiquidacionWsDtoConverter;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters.NotificacionPagoEntradaWsDtoConverter;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters.NotificacionPagoSalidaWsDtoConverter;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters.PdfLiquidacionEntradaWsDtoConverter;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters.PdfLiquidacionSalidaWsDtoConverter;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters.TarifaServicioEntradaWsDtoConverter;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters.TarifaServicioSalidaWsDtoConverter;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IInterfacesFinancierasBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.EstadoLiquidacionSalidaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.NotificacionPagoSalidaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.ObtenerPdfLiquidacionSalidaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarTarifaServicioWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaGenerarLiquidacionWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaNotificarPagoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaObtenerPDFLiquidacionWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarTarifaServicioWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaGenerarLiquidacionWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoServicioCTSIWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCriterio;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumOperacionesWs;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumServiciosWs;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadBusCliente;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadHistoricoConsulta;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica para consumir operaciones del servicio
 * Interfaces financieras. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */	
@Stateless(name = "InterfacesFinancierasBusiness", mappedName = "InterfacesFinancierasBusiness")
@LocalBean
public class InterfacesFinancierasBusiness implements IInterfacesFinancierasBusiness{

	/**
	 * Atributo de instancia tipo IServicioIntegracionBusiness para definir la
	 * propiedad servicio integracion.
	 */
	@EJB
	private IServicioIntegracionBusiness iisib_servicioIntegracion;

	/**
	 * Define la constante CL_LOGGER.
	 */
	private static final Logger CL_LOGGER = Logger.getLogger(InterfacesFinancierasBusiness.class);

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IInterfacesFinancierasBusiness#consultarEstadoLiquidacion(java.math.BigDecimal, java.lang.String)
	 */
	@Override
	public EstadoLiquidacionSalidaWSDTO consultarEstadoLiquidacion(BigDecimal abd_montoTransaccion, String as_numeroReferencia) {
		try {
			TipoEntradaConsultarEstadoLiquidacionVO ltecel_tipoEntradaConsultarEstadoLiquidacionVo = new TipoEntradaConsultarEstadoLiquidacionVO();
			ltecel_tipoEntradaConsultarEstadoLiquidacionVo.setIbd_montoTransaccion(abd_montoTransaccion);
			ltecel_tipoEntradaConsultarEstadoLiquidacionVo.setIs_numeroReferencia(as_numeroReferencia);

			TipoSalidaConsultaEstadoLiquidacionVO ltscel_consultarEstadoLiquidacionVo = (TipoSalidaConsultaEstadoLiquidacionVO) 
					UtilidadBusCliente.crearEntradaClienteIntegracionBase(EnumServiciosWs.INTERFACES_FINANCIERAS,EnumOperacionesWs.OPERACIONES_FINANCIERAS_CONSULTAR_ESTADO_LIQUIDACION,ltecel_tipoEntradaConsultarEstadoLiquidacionVo);		

			EstadoLiquidacionSalidaWSDTO lels_estadoLiquidacionSalidaWsDto;
			lels_estadoLiquidacionSalidaWsDto = EstadoLiquidacionWsDtoConverter.entidadAVo(ltscel_consultarEstadoLiquidacionVo);	
						
			UtilidadHistoricoConsulta.registrarHistorioConsulta(
					EnumOperacionesWs.OPERACIONES_FINANCIERAS_CONSULTAR_ESTADO_LIQUIDACION.getIs_nombreServicio(), 
					ltecel_tipoEntradaConsultarEstadoLiquidacionVo.toString(), 
					lels_estadoLiquidacionSalidaWsDto);	
			
			return lels_estadoLiquidacionSalidaWsDto;
		} catch (Exception ae_excepcion) {
			CL_LOGGER.error(ae_excepcion.getMessage(),ae_excepcion);
			return null;
		}
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IInterfacesFinancierasBusiness#consultarTarifaServicio(java.util.List, co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PersonaDTO)
	 */
	@Override
	public TipoSalidaConsultarTarifaServicioWSDTO consultarTarifaServicio(List<TipoServicioCTSIWSDTO> alts_listaServicioTarifaWsDto,PersonaDTO ap_persona) {		

		TipoEntradaConsultarTarifaServicioWSDTO ltects_consultarTarifaServicioEntradaWsDto = new TipoEntradaConsultarTarifaServicioWSDTO();
		ltects_consultarTarifaServicioEntradaWsDto.setIs_tipoDocSolicitante(ap_persona.getItd_tipoDocumentoDto().getIs_id());
		ltects_consultarTarifaServicioEntradaWsDto.setIs_numeroDocSolicitante(ap_persona.getIs_numeroDocumento());
		ltects_consultarTarifaServicioEntradaWsDto.setIs_canalOrigen(EnumCriterio.CANAL_ORIGEN_FINANCIERAS.getIs_criterio());
		ltects_consultarTarifaServicioEntradaWsDto.setIltsc_servicios(alts_listaServicioTarifaWsDto);
		TipoEntradaConsultarTarifaServicioVO ltects_entradaConsultarTarifaServicioVo = TarifaServicioEntradaWsDtoConverter.dtoAVo(ltects_consultarTarifaServicioEntradaWsDto);
		TipoSalidaConsultarTarifaServicioVO ltscts_salidaConsultarTarifaServicioVo;		
		ltscts_salidaConsultarTarifaServicioVo = (TipoSalidaConsultarTarifaServicioVO) UtilidadBusCliente.crearEntradaClienteIntegracionBase(EnumServiciosWs.INTERFACES_FINANCIERAS,EnumOperacionesWs.OPERACIONES_FINANCIERAS_CONSULTAR_TARIFA_SERVICIO,ltects_entradaConsultarTarifaServicioVo);
		TipoSalidaConsultarTarifaServicioWSDTO ltscts_consultarTarifaServicioSalidaWsDto;
		ltscts_consultarTarifaServicioSalidaWsDto = TarifaServicioSalidaWsDtoConverter.entidadAVo(ltscts_salidaConsultarTarifaServicioVo);
		return ltscts_consultarTarifaServicioSalidaWsDto;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IInterfacesFinancierasBusiness#generarLiquidacion(co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaGenerarLiquidacionWSDTO)
	 */
	@Override
	public TipoSalidaGenerarLiquidacionWSDTO generarLiquidacion(TipoEntradaGenerarLiquidacionWSDTO ategl_tipoEntradaGenerarLiquidacionWsDto) {		
		TipoEntradaGenerarLiquidacionVO ltegl_tipoEntradaGenerarLiquidacionVo = LiquidacionWsDtoConverter.dtoAVo(ategl_tipoEntradaGenerarLiquidacionWsDto);
		TipoSalidaGenerarLiquidacionVO ltsgl_generarLiqudacionVo = (TipoSalidaGenerarLiquidacionVO) UtilidadBusCliente.crearEntradaClienteIntegracionBase(EnumServiciosWs.INTERFACES_FINANCIERAS,EnumOperacionesWs.OPERACIONES_FINANCIERAS_GENERAR_LIQUIDACION,ltegl_tipoEntradaGenerarLiquidacionVo);
		TipoSalidaGenerarLiquidacionWSDTO ltsgl_generarLiquidacionSalidaWsDto;
		ltsgl_generarLiquidacionSalidaWsDto = LiquidacionWsDtoConverter.voADto(ltsgl_generarLiqudacionVo);
		return ltsgl_generarLiquidacionSalidaWsDto;

	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IInterfacesFinancierasBusiness#notificarPago(co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaNotificarPagoWSDTO)
	 */
	@Override
	public NotificacionPagoSalidaWSDTO notificarPago(TipoEntradaNotificarPagoWSDTO atenp_tipoEntradaNotificacionPagoWsDto) {

		TipoEntradaNotificarPagoVO ltenp_entradaNotificarPagoVo = NotificacionPagoEntradaWsDtoConverter.dtoAVo(atenp_tipoEntradaNotificacionPagoWsDto);
		TipoSalidaNotificarPagoVO ltsnp_salidaNitificarPagoVo = (TipoSalidaNotificarPagoVO) UtilidadBusCliente.crearEntradaClienteIntegracionBase(EnumServiciosWs.INTERFACES_FINANCIERAS,EnumOperacionesWs.OPERACIONES_FINANCIERAS_NOTIFICAR_PAGO,ltenp_entradaNotificarPagoVo);
		NotificacionPagoSalidaWSDTO lnps_notificacionPagoSalidaVo;
		lnps_notificacionPagoSalidaVo = NotificacionPagoSalidaWsDtoConverter.entidadAVo(ltsnp_salidaNitificarPagoVo);

		return lnps_notificacionPagoSalidaVo;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IInterfacesFinancierasBusiness#obtenerPDFLiquidacion(co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaObtenerPDFLiquidacionWSDTO)
	 */
	@Override
	public ObtenerPdfLiquidacionSalidaWSDTO obtenerPDFLiquidacion(TipoEntradaObtenerPDFLiquidacionWSDTO ateopl_obtenerPdfLiquidacionEntradaWsDto) {

		TipoEntradaObtenerPDFLiquidacionVO lteopl_entradaObtenerPdfLiquidacionVo = PdfLiquidacionEntradaWsDtoConverter.voAEntidad(ateopl_obtenerPdfLiquidacionEntradaWsDto);
		TipoSalidaObtenerPDFLiquidacionVO ltsopl_salidaOnbtenerPdfLiquidacionVo = (TipoSalidaObtenerPDFLiquidacionVO) UtilidadBusCliente.crearEntradaClienteIntegracionBase(EnumServiciosWs.INTERFACES_FINANCIERAS,EnumOperacionesWs.OPERACIONES_FINANCIERAS_OBTENER_PDF_LIQUIDACION,lteopl_entradaObtenerPdfLiquidacionVo);
		ObtenerPdfLiquidacionSalidaWSDTO lopls_obtenerPdfLiquidacion;
		lopls_obtenerPdfLiquidacion = PdfLiquidacionSalidaWsDtoConverter.entidadAVo(ltsopl_salidaOnbtenerPdfLiquidacionVo);
		
		UtilidadHistoricoConsulta.registrarHistorioConsulta(
				EnumOperacionesWs.OPERACIONES_FINANCIERAS_OBTENER_PDF_LIQUIDACION.getIs_nombreServicio(), 
				ateopl_obtenerPdfLiquidacionEntradaWsDto.toString(), 
				lopls_obtenerPdfLiquidacion);	
		
		return lopls_obtenerPdfLiquidacion;
	}
}
