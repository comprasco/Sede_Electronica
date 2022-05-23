/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: ServicioConsultarHistorialSolicitudesPagadas.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.fabrica
 * Nombre del elemento: ServicioConsultarHistorialSolicitudesPagadas
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.fabrica;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;

import org.apache.log4j.Logger;

import co.gov.supernotariado.bachue.clientebus.consultarhistorialsolicitudespagadas.operacion.SBBEEConsultaHistorialSolicitudesPagadas;
import co.gov.supernotariado.bachue.clientebus.consultarhistorialsolicitudespagadas.types.buscarsolicitudes.TipoEntradaBuscarSolicitudes;
import co.gov.supernotariado.bachue.clientebus.consultarhistorialsolicitudespagadas.types.consultardetallesolicitud.TipoEntradaConsultarDetalleSolicitud;
import co.gov.supernotariado.bachue.clientebus.converter.BuscarSolicitudesConverter;
import co.gov.supernotariado.bachue.clientebus.converter.ConsultarDetalleSolicitudConverter;
import co.gov.supernotariado.bachue.clientebus.enums.EnumLog;
import co.gov.supernotariado.bachue.clientebus.enums.EnumOperacionesSoap;
import co.gov.supernotariado.bachue.clientebus.servicios.SBBEEConsultaHistorialSolicitudesPagadasService;
import co.gov.supernotariado.bachue.clientebus.util.UtilidadClienteSoap;
import co.gov.supernotariado.bachue.clientebus.util.UtilidadLog;
import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;
import co.gov.supernotariado.bachue.clientebus.vo.consultarhistorialsolicitudespagadas.TipoEntradaBuscarSolicitudesVO;
import co.gov.supernotariado.bachue.clientebus.vo.consultarhistorialsolicitudespagadas.TipoEntradaConsultarDetalleSolicitudVO;
import co.gov.supernotariado.bachue.clientebus.vo.consultarhistorialsolicitudespagadas.TipoSalidaBuscarSolicitudesVO;
import co.gov.supernotariado.bachue.clientebus.vo.consultarhistorialsolicitudespagadas.TipoSalidaConsultarDetalleSolicitudVO;

/**
 * Implementacion de interfaces para el servicio consulta historial de
 * solicitudes pagadas.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ServicioConsultarHistorialSolicitudesPagadas implements IServicioWeb {

	/**
	 * Define la constante CL_LOGGER.
	 */
	static final Logger CL_LOGGER = Logger.getLogger(ServicioConsultarHistorialSolicitudesPagadas.class);

	/**
	 * Metodo que encarga de ejecutar la busqueda de solicitudes.
	 *
	 * @param aci_clienteIntegracionVO                  datos para consumir el
	 *                                                  servicio
	 * @param achsp_consultaHistorialSolicitudesPagadas servicio a consumir en este
	 *                                                  caso consulta catalogos
	 * @return TipoSalidaBuscarSolicitudesVO Datos de respuesta del servicio
	 */
	private TipoSalidaBuscarSolicitudesVO buscarSolicitudes(ClienteIntegracionVO aci_clienteIntegracionVO,
			SBBEEConsultaHistorialSolicitudesPagadas achsp_consultaHistorialSolicitudesPagadas) {

		if (!(aci_clienteIntegracionVO instanceof TipoEntradaBuscarSolicitudesVO)) {
			throw new IllegalArgumentException();
		}
		TipoEntradaBuscarSolicitudesVO ltebs_tipoEntradaBuscarSolicitudesVo = (TipoEntradaBuscarSolicitudesVO) aci_clienteIntegracionVO;
		TipoEntradaBuscarSolicitudes ltebs_tipoEntradaBuscarSolicitudes = BuscarSolicitudesConverter
				.voATipo(ltebs_tipoEntradaBuscarSolicitudesVo);

		UtilidadLog<TipoEntradaBuscarSolicitudesVO> lul_utilidadLogEntrada = new UtilidadLog<>();
		lul_utilidadLogEntrada.generarDebugObjeto(ltebs_tipoEntradaBuscarSolicitudesVo,
				TipoEntradaBuscarSolicitudesVO.class, EnumLog.ENTRADA_SERVICIO.getIs_codigo());

		TipoSalidaBuscarSolicitudesVO ltsbs_tipoSalidaBuscarSolicitudesVo;
		ltsbs_tipoSalidaBuscarSolicitudesVo = BuscarSolicitudesConverter.tipoAVo(
				achsp_consultaHistorialSolicitudesPagadas.buscarSolicitudes(ltebs_tipoEntradaBuscarSolicitudes));

		UtilidadLog<TipoSalidaBuscarSolicitudesVO> lul_utilidadLogSalida = new UtilidadLog<>();
		lul_utilidadLogSalida.generarDebugObjeto(ltsbs_tipoSalidaBuscarSolicitudesVo,
				TipoSalidaBuscarSolicitudesVO.class, EnumLog.SALIDA_SERVICIO.getIs_codigo());

		return ltsbs_tipoSalidaBuscarSolicitudesVo;
	}

	/**
	 * Metodo que se encarga de ejecutar la consulta en detalle de una solicitud.
	 *
	 * @param aci_clienteIntegracionVO                  datos para consumir el
	 *                                                  servicio
	 * @param achsp_consultaHistorialSolicitudesPagadas servicio a consumir en este
	 *                                                  caso consulta catalogos
	 * @return TipoSalidaConsultarDetalleSolicitudVO Datos de respuesta del servicio
	 */
	private TipoSalidaConsultarDetalleSolicitudVO consultarDetalleSolicitud(
			ClienteIntegracionVO aci_clienteIntegracionVO,
			SBBEEConsultaHistorialSolicitudesPagadas achsp_consultaHistorialSolicitudesPagadas) {
		if (!(aci_clienteIntegracionVO instanceof TipoEntradaConsultarDetalleSolicitudVO)) {
			throw new IllegalArgumentException();
		}
		TipoEntradaConsultarDetalleSolicitudVO ltecds_tipoEntradaConsultarDetalleSolicitudVo = (TipoEntradaConsultarDetalleSolicitudVO) aci_clienteIntegracionVO;
		TipoEntradaConsultarDetalleSolicitud ltecds_tipoEntradaConsultarDetalleSolicitud = ConsultarDetalleSolicitudConverter
				.voATipo(ltecds_tipoEntradaConsultarDetalleSolicitudVo);

		UtilidadLog<TipoEntradaConsultarDetalleSolicitudVO> lul_utilidadLogEntrada = new UtilidadLog<>();
		lul_utilidadLogEntrada.generarDebugObjeto(ltecds_tipoEntradaConsultarDetalleSolicitudVo,
				TipoEntradaConsultarDetalleSolicitudVO.class, EnumLog.ENTRADA_SERVICIO.getIs_codigo());

		TipoSalidaConsultarDetalleSolicitudVO ltscds_tipoEntradaConsultarDetalleSolicitudVo;
		ltscds_tipoEntradaConsultarDetalleSolicitudVo = ConsultarDetalleSolicitudConverter
				.tipoAVo(achsp_consultaHistorialSolicitudesPagadas
						.consultarDetalleSolicitud(ltecds_tipoEntradaConsultarDetalleSolicitud));

		UtilidadLog<TipoSalidaConsultarDetalleSolicitudVO> lul_utilidadLogSalida = new UtilidadLog<>();
		lul_utilidadLogSalida.generarDebugObjeto(ltscds_tipoEntradaConsultarDetalleSolicitudVo,
				TipoSalidaConsultarDetalleSolicitudVO.class, EnumLog.SALIDA_SERVICIO.getIs_codigo());

		return ltscds_tipoEntradaConsultarDetalleSolicitudVo;
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
			ClienteIntegracionVO lci_clienteIntegracionRespuestaVO = new ClienteIntegracionVO();

			QName qname = new QName(aci_clienteIntegracionVO.getIs_espacioNombre(),
					aci_clienteIntegracionVO.getIs_nombreServicioSoap());
			SBBEEConsultaHistorialSolicitudesPagadasService lschsps_consultaHistorialSolicitudesPagadasService = new SBBEEConsultaHistorialSolicitudesPagadasService(
					null, qname);
			SBBEEConsultaHistorialSolicitudesPagadas lchsp_consultaHistorialSolicitudesPagadas = lschsps_consultaHistorialSolicitudesPagadasService
					.getSBBEEConsultaHistorialSolicitudesPagadasSOAP12BindingQSPort();
			UtilidadClienteSoap.insertarPropiedadesConexion(aci_clienteIntegracionVO,
					(BindingProvider) lchsp_consultaHistorialSolicitudesPagadas);

			if (as_operacion.equalsIgnoreCase(
					EnumOperacionesSoap.HISTORIAL_SOLICITUDES_CONSULTAR_DETALLE_SOLICITUD.getIs_nombreOperacion())) {
				lci_clienteIntegracionRespuestaVO = consultarDetalleSolicitud(aci_clienteIntegracionVO,
						lchsp_consultaHistorialSolicitudesPagadas);
			} else if (as_operacion.equalsIgnoreCase(
					EnumOperacionesSoap.HISTORIAL_SOLICITUDES_BUSCAR_SOLICITUDES.getIs_nombreOperacion())) {
				lci_clienteIntegracionRespuestaVO = buscarSolicitudes(aci_clienteIntegracionVO,
						lchsp_consultaHistorialSolicitudesPagadas);
			}

			return lci_clienteIntegracionRespuestaVO;
		} catch (Exception ae_excepcion) {
			CL_LOGGER.error(ae_excepcion.getMessage(), ae_excepcion);

			throw ae_excepcion;
		}

	}
}
