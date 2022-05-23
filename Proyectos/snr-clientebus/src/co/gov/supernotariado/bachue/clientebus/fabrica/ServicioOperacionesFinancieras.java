/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: ServicioOperacionesFinancieras.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.fabrica
 * Nombre del elemento: ServicioOperacionesFinancieras
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.fabrica;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;

import org.apache.log4j.Logger;

import co.gov.supernotariado.bachue.clientebus.converter.ActualizarDatosSolicitanteConverter;
import co.gov.supernotariado.bachue.clientebus.converter.ConsultaEstadoLiquidacionConverter;
import co.gov.supernotariado.bachue.clientebus.converter.ConsultarTarifaServicioConverter;
import co.gov.supernotariado.bachue.clientebus.converter.GenerarLiquidacionConverter;
import co.gov.supernotariado.bachue.clientebus.converter.NotificarPagoConverter;
import co.gov.supernotariado.bachue.clientebus.converter.ObtenerPdfLiquidacionConverter;
import co.gov.supernotariado.bachue.clientebus.enums.EnumLog;
import co.gov.supernotariado.bachue.clientebus.enums.EnumOperacionesSoap;
import co.gov.supernotariado.bachue.clientebus.operacionesfinancieras.operacion.SBBEFOperacionesFinancieras;
import co.gov.supernotariado.bachue.clientebus.operacionesfinancieras.types.actualizardatossolicitantes.TipoEntradaActualizarDatosSolicitante;
import co.gov.supernotariado.bachue.clientebus.operacionesfinancieras.types.consultarestadoliquidacion.TipoEntradaConsultarEstadoLiquidacion;
import co.gov.supernotariado.bachue.clientebus.operacionesfinancieras.types.consultarestadoliquidacion.TipoSalidaConsultarEstadoLiquidacion;
import co.gov.supernotariado.bachue.clientebus.operacionesfinancieras.types.consultartarifaservicio.TipoEntradaConsultarTarifaServicio;
import co.gov.supernotariado.bachue.clientebus.operacionesfinancieras.types.generarliquidacion.TipoEntradaGenerarLiquidacion;
import co.gov.supernotariado.bachue.clientebus.operacionesfinancieras.types.notificarpago.TipoEntradaNotificarPago;
import co.gov.supernotariado.bachue.clientebus.operacionesfinancieras.types.obtenerpdfliquidacion.TipoEntradaObtenerPDFLiquidacion;
import co.gov.supernotariado.bachue.clientebus.servicios.SBBEFOperacionesFinancierasService;
import co.gov.supernotariado.bachue.clientebus.util.UtilidadClienteSoap;
import co.gov.supernotariado.bachue.clientebus.util.UtilidadLog;
import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;
import co.gov.supernotariado.bachue.clientebus.vo.operacionesfinancieras.TipoEntradaActualizarDatosSolicitanteVO;
import co.gov.supernotariado.bachue.clientebus.vo.operacionesfinancieras.TipoEntradaConsultarEstadoLiquidacionVO;
import co.gov.supernotariado.bachue.clientebus.vo.operacionesfinancieras.TipoEntradaConsultarTarifaServicioVO;
import co.gov.supernotariado.bachue.clientebus.vo.operacionesfinancieras.TipoEntradaGenerarLiquidacionVO;
import co.gov.supernotariado.bachue.clientebus.vo.operacionesfinancieras.TipoEntradaNotificarPagoVO;
import co.gov.supernotariado.bachue.clientebus.vo.operacionesfinancieras.TipoEntradaObtenerPDFLiquidacionVO;
import co.gov.supernotariado.bachue.clientebus.vo.operacionesfinancieras.TipoSalidaActualizarDatosSolicitanteVO;
import co.gov.supernotariado.bachue.clientebus.vo.operacionesfinancieras.TipoSalidaConsultaEstadoLiquidacionVO;
import co.gov.supernotariado.bachue.clientebus.vo.operacionesfinancieras.TipoSalidaConsultarTarifaServicioVO;
import co.gov.supernotariado.bachue.clientebus.vo.operacionesfinancieras.TipoSalidaGenerarLiquidacionVO;
import co.gov.supernotariado.bachue.clientebus.vo.operacionesfinancieras.TipoSalidaNotificarPagoVO;
import co.gov.supernotariado.bachue.clientebus.vo.operacionesfinancieras.TipoSalidaObtenerPDFLiquidacionVO;

/**
 * Implementacion de interfaces para el servicio operaciones financieras.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ServicioOperacionesFinancieras implements IServicioWeb {

	/**
	 * Define la constante CL_LOGGER.
	 */
	static final Logger CL_LOGGER = Logger.getLogger(ServicioOperacionesFinancieras.class);

	/**
	 * Metodo que realiza la operacion de actualizar datos solicitante.
	 *
	 * @param aci_clienteIntegracionVO   datos para consumir el servicio
	 * @param aof_operacionesFinancieras servicio a consumir en este caso
	 *                                   operaciones financieras
	 * @return TipoSalidaActualizarDatosSolicitanteVO Datos de respuesta del
	 *         servicio
	 */
	private TipoSalidaActualizarDatosSolicitanteVO actualizaDatosSolicitante(
			ClienteIntegracionVO aci_clienteIntegracionVO, SBBEFOperacionesFinancieras aof_operacionesFinancieras) {
		if (!(aci_clienteIntegracionVO instanceof TipoEntradaActualizarDatosSolicitanteVO)) {
			throw new IllegalArgumentException();
		}

		TipoEntradaActualizarDatosSolicitanteVO lteads_tipoEntradaActualizarDatosSolicitanteVo = (TipoEntradaActualizarDatosSolicitanteVO) aci_clienteIntegracionVO;
		TipoEntradaActualizarDatosSolicitante lteads_tipoEntradaActualizarDatosSolicitante = ActualizarDatosSolicitanteConverter
				.voATipo(lteads_tipoEntradaActualizarDatosSolicitanteVo);

		UtilidadLog<TipoEntradaActualizarDatosSolicitanteVO> lul_utilidadLogEntrada = new UtilidadLog<>();
		lul_utilidadLogEntrada.generarDebugObjeto(lteads_tipoEntradaActualizarDatosSolicitanteVo,
				TipoEntradaActualizarDatosSolicitanteVO.class, EnumLog.ENTRADA_SERVICIO.getIs_codigo());

		TipoSalidaActualizarDatosSolicitanteVO ltsads_tipoSalidaActualizarDatosSolicitante;
		ltsads_tipoSalidaActualizarDatosSolicitante = ActualizarDatosSolicitanteConverter.tipoAVo(
				aof_operacionesFinancieras.actualizarDatosSolicitante(lteads_tipoEntradaActualizarDatosSolicitante));

		UtilidadLog<TipoSalidaActualizarDatosSolicitanteVO> lul_utilidadLogSalida = new UtilidadLog<>();
		lul_utilidadLogSalida.generarDebugObjeto(ltsads_tipoSalidaActualizarDatosSolicitante,
				TipoSalidaActualizarDatosSolicitanteVO.class, EnumLog.SALIDA_SERVICIO.getIs_codigo());

		return ltsads_tipoSalidaActualizarDatosSolicitante;
	}

	/**
	 * Metodo que realiza la operacion de consultar estado liquidacion.
	 *
	 * @param aci_clienteIntegracionVO   datos para consumir el servicio
	 * @param aof_operacionesFinancieras servicio a consumir en este caso
	 *                                   operaciones financieras
	 * @return TipoSalidaConsultaEstadoLiquidacionVO Datos de respuesta del servicio
	 */
	private TipoSalidaConsultaEstadoLiquidacionVO consultarEstadoLiquidacion(
			ClienteIntegracionVO aci_clienteIntegracionVO, SBBEFOperacionesFinancieras aof_operacionesFinancieras) {
		if (!(aci_clienteIntegracionVO instanceof TipoEntradaConsultarEstadoLiquidacionVO)) {
			throw new IllegalArgumentException();
		}
		TipoEntradaConsultarEstadoLiquidacionVO ltecel_tipoEntradaConsultarEstadoLiquidacion = (TipoEntradaConsultarEstadoLiquidacionVO) aci_clienteIntegracionVO;
		TipoEntradaConsultarEstadoLiquidacion ltecel_consultarEstadoLiquidacion = ConsultaEstadoLiquidacionConverter
				.voATipo(ltecel_tipoEntradaConsultarEstadoLiquidacion);

		UtilidadLog<TipoEntradaConsultarEstadoLiquidacionVO> lul_utilidadLogEntrada = new UtilidadLog<>();
		lul_utilidadLogEntrada.generarDebugObjeto(ltecel_tipoEntradaConsultarEstadoLiquidacion,
				TipoEntradaConsultarEstadoLiquidacionVO.class, EnumLog.ENTRADA_SERVICIO.getIs_codigo());

		TipoSalidaConsultarEstadoLiquidacion ltscel_salidaConsultarEstadoLiquidacion = aof_operacionesFinancieras
				.consultarEstadoLiquidacion(ltecel_consultarEstadoLiquidacion);
		TipoSalidaConsultaEstadoLiquidacionVO ltscel_consultarEstadoLiquidacionVo;

		ltscel_consultarEstadoLiquidacionVo = ConsultaEstadoLiquidacionConverter
				.tipoAVo(ltscel_salidaConsultarEstadoLiquidacion);

		UtilidadLog<TipoSalidaConsultaEstadoLiquidacionVO> lul_utilidadLogSalida = new UtilidadLog<>();
		lul_utilidadLogSalida.generarDebugObjeto(ltscel_consultarEstadoLiquidacionVo,
				TipoSalidaConsultaEstadoLiquidacionVO.class, EnumLog.SALIDA_SERVICIO.getIs_codigo());

		return ltscel_consultarEstadoLiquidacionVo;
	}

	/**
	 * Metodo que realiza la operacion de consultar tarifa servicio.
	 *
	 * @param aci_clienteIntegracionVO   datos para consumir el servicio
	 * @param aof_operacionesFinancieras servicio a consumir en este caso
	 *                                   operaciones financieras
	 * @return TipoSalidaConsultarTarifaServicioVO Datos de respuesta del servicio
	 */
	private TipoSalidaConsultarTarifaServicioVO consultaTarifaServicio(ClienteIntegracionVO aci_clienteIntegracionVO,
			SBBEFOperacionesFinancieras aof_operacionesFinancieras) {
		if (!(aci_clienteIntegracionVO instanceof TipoEntradaConsultarTarifaServicioVO)) {
			throw new IllegalArgumentException();
		}
		TipoEntradaConsultarTarifaServicioVO ltects_tipoEntradaConsultarTarifaServicioVo = (TipoEntradaConsultarTarifaServicioVO) aci_clienteIntegracionVO;
		TipoEntradaConsultarTarifaServicio ltects_tipoEntradaConsultarTarifaServicio = ConsultarTarifaServicioConverter
				.voATipo(ltects_tipoEntradaConsultarTarifaServicioVo);

		UtilidadLog<TipoEntradaConsultarTarifaServicioVO> lul_utilidadLogEntrada = new UtilidadLog<>();
		lul_utilidadLogEntrada.generarDebugObjeto(ltects_tipoEntradaConsultarTarifaServicioVo,
				TipoEntradaConsultarTarifaServicioVO.class, EnumLog.ENTRADA_SERVICIO.getIs_codigo());

		TipoSalidaConsultarTarifaServicioVO ltscts_tipoSalidaConsultarTarifaServicioVo;
		ltscts_tipoSalidaConsultarTarifaServicioVo = ConsultarTarifaServicioConverter
				.tipoAVo(aof_operacionesFinancieras.consultarTarifaServicio(ltects_tipoEntradaConsultarTarifaServicio));

		UtilidadLog<TipoSalidaConsultarTarifaServicioVO> lul_utilidadLogSalida = new UtilidadLog<>();
		lul_utilidadLogSalida.generarDebugObjeto(ltscts_tipoSalidaConsultarTarifaServicioVo,
				TipoSalidaConsultarTarifaServicioVO.class, EnumLog.SALIDA_SERVICIO.getIs_codigo());

		return ltscts_tipoSalidaConsultarTarifaServicioVo;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * co.gov.supernotariado.bachue.clientebus.fabrica.IServicioWeb#ejecutar(co.gov.
	 * supernotariado.bachue.clientebus.vo.ClienteIntegracionVO, java.lang.String,
	 * org.apache.log4j.Logger)
	 */
	@Override
	public ClienteIntegracionVO ejecutar(ClienteIntegracionVO aci_clienteIntegracionVO, String as_operacion,
			Logger al_logger) {
		try {
			ClienteIntegracionVO lci_clienteIntegracionVO = new ClienteIntegracionVO();

			QName qname = new QName(aci_clienteIntegracionVO.getIs_espacioNombre(),
					aci_clienteIntegracionVO.getIs_nombreServicioSoap());
			SBBEFOperacionesFinancierasService lsofs_oeracionesFinancierasService = new SBBEFOperacionesFinancierasService(
					null, qname);
			SBBEFOperacionesFinancieras lof_operacionesFinancieras = lsofs_oeracionesFinancierasService
					.getSBBEFOperacionesFinancierasSOAP12BindingQSPort();
			UtilidadClienteSoap.insertarPropiedadesConexion(aci_clienteIntegracionVO,
					(BindingProvider) lof_operacionesFinancieras);

			if (as_operacion.equalsIgnoreCase(
					EnumOperacionesSoap.OPERACIONES_FINANCIERAS_CONSULTAR_ESTADO_LIQUIDACION.getIs_nombreOperacion())) {
				lci_clienteIntegracionVO = consultarEstadoLiquidacion(aci_clienteIntegracionVO,
						lof_operacionesFinancieras);
			} else if (as_operacion.equalsIgnoreCase(
					EnumOperacionesSoap.OPERACIONES_FINANCIERAS_CONSULTAR_TARIFA_SERVICIO.getIs_nombreOperacion())) {
				lci_clienteIntegracionVO = consultaTarifaServicio(aci_clienteIntegracionVO, lof_operacionesFinancieras);
			} else if (as_operacion.equalsIgnoreCase(
					EnumOperacionesSoap.OPERACIONES_FINANCIERAS_GENERAR_LIQUIDACION.getIs_nombreOperacion())) {
				lci_clienteIntegracionVO = generarLiquidacion(aci_clienteIntegracionVO, lof_operacionesFinancieras);
			} else if (as_operacion.equalsIgnoreCase(
					EnumOperacionesSoap.OPERACIONES_FINANCIERAS_NOTIFICAR_PAGO.getIs_nombreOperacion())) {
				lci_clienteIntegracionVO = notificarPago(aci_clienteIntegracionVO, lof_operacionesFinancieras);
			} else if (as_operacion.equalsIgnoreCase(
					EnumOperacionesSoap.OPERACIONES_FINANCIERAS_OBTENER_PDF_LIQUIDACION.getIs_nombreOperacion())) {
				lci_clienteIntegracionVO = obtenerPdfLiquidacion(aci_clienteIntegracionVO, lof_operacionesFinancieras);
			} else if (as_operacion.equalsIgnoreCase(
					EnumOperacionesSoap.OPERACIONES_FINANCIERAS_ACTUALIZAR_DATOS_SOLICITANTE.getIs_nombreOperacion())) {
				lci_clienteIntegracionVO = actualizaDatosSolicitante(aci_clienteIntegracionVO,
						lof_operacionesFinancieras);
			}
			return lci_clienteIntegracionVO;
		} catch (Exception ae_excepcion) {
			CL_LOGGER.error(ae_excepcion.getMessage(), ae_excepcion);

			throw ae_excepcion;
		}
	}

	/**
	 * Metodo que realiza la operacion de generar liquidacion.
	 *
	 * @param aci_clienteIntegracionVO   datos para consumir el servicio
	 * @param aof_operacionesFinancieras servicio a consumir en este caso
	 *                                   operaciones financieras
	 * @return TipoSalidaGenerarLiquidacionVO Datos de respuesta del servicio
	 */
	private TipoSalidaGenerarLiquidacionVO generarLiquidacion(ClienteIntegracionVO aci_clienteIntegracionVO,
			SBBEFOperacionesFinancieras aof_operacionesFinancieras) {
		if (!(aci_clienteIntegracionVO instanceof TipoEntradaGenerarLiquidacionVO)) {
			throw new IllegalArgumentException();
		}

		TipoEntradaGenerarLiquidacionVO ltegl_tipoEntradaGenerarLiquidacionVo = (TipoEntradaGenerarLiquidacionVO) aci_clienteIntegracionVO;
		TipoEntradaGenerarLiquidacion ltegl_tipoEntradaGenerarLiquidacion = GenerarLiquidacionConverter
				.voAtipo(ltegl_tipoEntradaGenerarLiquidacionVo);

		UtilidadLog<TipoEntradaGenerarLiquidacionVO> lul_utilidadLogEntrada = new UtilidadLog<>();
		lul_utilidadLogEntrada.generarDebugObjeto(ltegl_tipoEntradaGenerarLiquidacionVo,
				TipoEntradaGenerarLiquidacionVO.class, EnumLog.ENTRADA_SERVICIO.getIs_codigo());

		TipoSalidaGenerarLiquidacionVO ltsgl_tipoSalidaGenerarLiquidacionVo;
		ltsgl_tipoSalidaGenerarLiquidacionVo = GenerarLiquidacionConverter
				.tipoAVo(aof_operacionesFinancieras.generarLiquidacion(ltegl_tipoEntradaGenerarLiquidacion));

		UtilidadLog<TipoSalidaGenerarLiquidacionVO> lul_utilidadLogSalida = new UtilidadLog<>();
		lul_utilidadLogSalida.generarDebugObjeto(ltsgl_tipoSalidaGenerarLiquidacionVo,
				TipoSalidaGenerarLiquidacionVO.class, EnumLog.SALIDA_SERVICIO.getIs_codigo());

		return ltsgl_tipoSalidaGenerarLiquidacionVo;
	}

	/**
	 * Metodo que realiza la operacion de notificar pago.
	 *
	 * @param aci_clienteIntegracionVO   datos para consumir el servicio
	 * @param aof_operacionesFinancieras servicio a consumir en este caso
	 *                                   operaciones financieras
	 * @return TipoSalidaNotificarPagoVO Datos de respuesta del servicio
	 */
	private TipoSalidaNotificarPagoVO notificarPago(ClienteIntegracionVO aci_clienteIntegracionVO,
			SBBEFOperacionesFinancieras aof_operacionesFinancieras) {
		if (!(aci_clienteIntegracionVO instanceof TipoEntradaNotificarPagoVO)) {
			throw new IllegalArgumentException();
		}

		TipoEntradaNotificarPagoVO ltenp_tipoEntradaNotificarPagoVo = (TipoEntradaNotificarPagoVO) aci_clienteIntegracionVO;
		TipoEntradaNotificarPago ltenp_tipoEntradaNotificarPago = NotificarPagoConverter
				.voATipo(ltenp_tipoEntradaNotificarPagoVo);

		UtilidadLog<TipoEntradaNotificarPagoVO> lul_utilidadLogEntrada = new UtilidadLog<>();
		lul_utilidadLogEntrada.generarDebugObjeto(ltenp_tipoEntradaNotificarPagoVo, TipoEntradaNotificarPagoVO.class,
				EnumLog.ENTRADA_SERVICIO.getIs_codigo());

		TipoSalidaNotificarPagoVO ltsnp_tipoSalidaNotificarPagoVo;
		ltsnp_tipoSalidaNotificarPagoVo = NotificarPagoConverter
				.tipoAVo(aof_operacionesFinancieras.notificarPago(ltenp_tipoEntradaNotificarPago));

		UtilidadLog<TipoSalidaNotificarPagoVO> lul_utilidadLogSalida = new UtilidadLog<>();
		lul_utilidadLogSalida.generarDebugObjeto(ltsnp_tipoSalidaNotificarPagoVo, TipoSalidaNotificarPagoVO.class,
				EnumLog.SALIDA_SERVICIO.getIs_codigo());

		return ltsnp_tipoSalidaNotificarPagoVo;
	}

	/**
	 * Metodo que realiza la operacion de obtener pdf liquidacion.
	 *
	 * @param aci_clienteIntegracionVO   datos para consumir el servicio
	 * @param aof_operacionesFinancieras servicio a consumir en este caso
	 *                                   operaciones financieras
	 * @return TipoSalidaObtenerPDFLiquidacionVO Datos de respuesta del servicio
	 */
	private TipoSalidaObtenerPDFLiquidacionVO obtenerPdfLiquidacion(ClienteIntegracionVO aci_clienteIntegracionVO,
			SBBEFOperacionesFinancieras aof_operacionesFinancieras) {
		if (!(aci_clienteIntegracionVO instanceof TipoEntradaObtenerPDFLiquidacionVO)) {
			throw new IllegalArgumentException();
		}
		TipoEntradaObtenerPDFLiquidacionVO lteopdfl_tipoEntradaObtenerPdfLiquidacionVo = (TipoEntradaObtenerPDFLiquidacionVO) aci_clienteIntegracionVO;
		TipoEntradaObtenerPDFLiquidacion lteopdfl_tipoEntradaObtenerPdfLiquidacion = ObtenerPdfLiquidacionConverter
				.voATipo(lteopdfl_tipoEntradaObtenerPdfLiquidacionVo);

		UtilidadLog<TipoEntradaObtenerPDFLiquidacionVO> lul_utilidadLogEntrada = new UtilidadLog<>();
		lul_utilidadLogEntrada.generarDebugObjeto(lteopdfl_tipoEntradaObtenerPdfLiquidacionVo,
				TipoEntradaObtenerPDFLiquidacionVO.class, EnumLog.ENTRADA_SERVICIO.getIs_codigo());

		TipoSalidaObtenerPDFLiquidacionVO ltsopdfl_tipoSalidaObtenerPdfLiquidacionVo;
		ltsopdfl_tipoSalidaObtenerPdfLiquidacionVo = ObtenerPdfLiquidacionConverter
				.tipoAVo(aof_operacionesFinancieras.obtenerPDFLiquidacion(lteopdfl_tipoEntradaObtenerPdfLiquidacion));

		UtilidadLog<TipoSalidaObtenerPDFLiquidacionVO> lul_utilidadLogSalida = new UtilidadLog<>();
		lul_utilidadLogSalida.generarDebugObjeto(ltsopdfl_tipoSalidaObtenerPdfLiquidacionVo,
				TipoSalidaObtenerPDFLiquidacionVO.class, EnumLog.SALIDA_SERVICIO.getIs_codigo());

		return ltsopdfl_tipoSalidaObtenerPdfLiquidacionVo;
	}
}
