/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: ServicioGeneracionSolicitud.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.fabrica
 * Nombre del elemento: ServicioGeneracionSolicitud
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.fabrica;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;

import org.apache.log4j.Logger;

import co.gov.supernotariado.bachue.clientebus.converter.ConsultarEstadoSolicitudConverter;
import co.gov.supernotariado.bachue.clientebus.converter.TipoGenerarSolicitudConverter;
import co.gov.supernotariado.bachue.clientebus.enums.EnumLog;
import co.gov.supernotariado.bachue.clientebus.enums.EnumOperacionesSoap;
import co.gov.supernotariado.bachue.clientebus.generacionsolicitud.operacion.SBBEEGeneracionSolicitud;
import co.gov.supernotariado.bachue.clientebus.generacionsolicitud.types.consultarestadosolicitud.TipoEntradaConsultarEstadoSolicitud;
import co.gov.supernotariado.bachue.clientebus.generacionsolicitud.types.generarsolicitud.TipoEntradaGenerarSolicitud;
import co.gov.supernotariado.bachue.clientebus.servicios.SBBEEGeneracionSolicitudService;
import co.gov.supernotariado.bachue.clientebus.util.UtilidadClienteSoap;
import co.gov.supernotariado.bachue.clientebus.util.UtilidadLog;
import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;
import co.gov.supernotariado.bachue.clientebus.vo.generacionsolicitud.TipoEntradaConsultarEstadoSolicitudVO;
import co.gov.supernotariado.bachue.clientebus.vo.generacionsolicitud.TipoEntradaGenerarSolicitudVO;
import co.gov.supernotariado.bachue.clientebus.vo.generacionsolicitud.TipoSalidaConsultarEstadoSolicitudVO;
import co.gov.supernotariado.bachue.clientebus.vo.generacionsolicitud.TipoSalidaGenerarSolicitudVO;

/**
 * Implementacion de interfaces para el servicio generacion solicitud.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ServicioGeneracionSolicitud implements IServicioWeb {

	/**
	 * Define la constante CL_LOGGER.
	 */
	static final Logger CL_LOGGER = Logger.getLogger(ServicioGeneracionSolicitud.class);

	/**
	 * Metodo que permite generar una solicitud.
	 *
	 * @param aci_clienteIntegracionVo datos a consumir
	 * @param asgs_generarSolicitud    servicio a consumir
	 * @return TipoSalidaGenerarSolicitudVO Datos de respuesta del servicio
	 */
	private TipoSalidaGenerarSolicitudVO generarSolicitud(ClienteIntegracionVO aci_clienteIntegracionVo,
			SBBEEGeneracionSolicitud asgs_generarSolicitud) {
		if (!(aci_clienteIntegracionVo instanceof TipoEntradaGenerarSolicitudVO))
			throw new IllegalArgumentException();

		TipoEntradaGenerarSolicitudVO ltegs_tipoEntradaGenerarSolicitudVo = (TipoEntradaGenerarSolicitudVO) aci_clienteIntegracionVo;
		TipoEntradaGenerarSolicitud ltegs_tipoEntradaGenerarSolicitud = TipoGenerarSolicitudConverter
				.voATipo(ltegs_tipoEntradaGenerarSolicitudVo);

		UtilidadLog<TipoEntradaGenerarSolicitudVO> lultegs_utilidadLogEntrada = new UtilidadLog<>();
		lultegs_utilidadLogEntrada.generarDebugObjeto(ltegs_tipoEntradaGenerarSolicitudVo,
				TipoEntradaGenerarSolicitudVO.class, EnumLog.ENTRADA_SERVICIO.getIs_codigo());

		TipoSalidaGenerarSolicitudVO ltsgs_tipoSalidaGenerarSolicitud;
		ltsgs_tipoSalidaGenerarSolicitud = TipoGenerarSolicitudConverter
				.tipoAVo(asgs_generarSolicitud.generarSolicitud(ltegs_tipoEntradaGenerarSolicitud));

		UtilidadLog<TipoSalidaGenerarSolicitudVO> lultsgs_utilidadLogSalida = new UtilidadLog<>();
		lultsgs_utilidadLogSalida.generarDebugObjeto(ltsgs_tipoSalidaGenerarSolicitud,
				TipoSalidaGenerarSolicitudVO.class, EnumLog.SALIDA_SERVICIO.getIs_codigo());

		return ltsgs_tipoSalidaGenerarSolicitud;
	}

	/**
	 * Metodo que permite consultar estado solicitud.
	 *
	 * @param aci_clienteIntegracionVo datos a consumir
	 * @param asgs_consultarEstado     servicio a consumir
	 * @return TipoSalidaConsultarEstadoSolicitudVO Datos de respuesta del servicio
	 */
	private TipoSalidaConsultarEstadoSolicitudVO consultarEstadoSolicitud(ClienteIntegracionVO aci_clienteIntegracionVo,
			SBBEEGeneracionSolicitud asgs_consultarEstado) {
		if (!(aci_clienteIntegracionVo instanceof TipoEntradaConsultarEstadoSolicitudVO))
			throw new IllegalArgumentException();

		TipoEntradaConsultarEstadoSolicitudVO lteces_tipoEntradaconsultarEstadoVo = (TipoEntradaConsultarEstadoSolicitudVO) aci_clienteIntegracionVo;
		TipoEntradaConsultarEstadoSolicitud lteces_tipoConsultarEstado = ConsultarEstadoSolicitudConverter
				.voATipo(lteces_tipoEntradaconsultarEstadoVo);

		UtilidadLog<TipoEntradaConsultarEstadoSolicitudVO> lulteces_utilidadLogEntrada = new UtilidadLog<>();
		lulteces_utilidadLogEntrada.generarDebugObjeto(lteces_tipoEntradaconsultarEstadoVo,
				TipoEntradaConsultarEstadoSolicitudVO.class, EnumLog.ENTRADA_SERVICIO.getIs_codigo());

		TipoSalidaConsultarEstadoSolicitudVO ltsces_tipoSalidaConsultarEstado;
		ltsces_tipoSalidaConsultarEstado = ConsultarEstadoSolicitudConverter
				.tipoAVo(asgs_consultarEstado.consultarEstadoSolicitud(lteces_tipoConsultarEstado));

		UtilidadLog<TipoSalidaConsultarEstadoSolicitudVO> lultsces_utilidadLogSalida = new UtilidadLog<>();
		lultsces_utilidadLogSalida.generarDebugObjeto(ltsces_tipoSalidaConsultarEstado,
				TipoSalidaConsultarEstadoSolicitudVO.class, EnumLog.SALIDA_SERVICIO.getIs_codigo());

		return ltsces_tipoSalidaConsultarEstado;
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
			ClienteIntegracionVO lci_clienteIntegracionVo = new ClienteIntegracionVO();

			QName qname = new QName(aci_clienteIntegracionVO.getIs_espacioNombre(),
					aci_clienteIntegracionVO.getIs_nombreServicioSoap());
			SBBEEGeneracionSolicitudService lsgss_generacionSolicitudService = new SBBEEGeneracionSolicitudService(null,
					qname);
			SBBEEGeneracionSolicitud lgs_generacionSolicitud = lsgss_generacionSolicitudService
					.getSBBEEGeneracionSolicitudSOAP12BindingQSPort();
			UtilidadClienteSoap.insertarPropiedadesConexion(aci_clienteIntegracionVO,
					(BindingProvider) lgs_generacionSolicitud);

			if (as_operacion.equalsIgnoreCase(
					EnumOperacionesSoap.SOLICITUD_SIN_PAGO_CONSULTAR_ESTADO_SOLICITUD.getIs_nombreOperacion())) {
				lci_clienteIntegracionVo = consultarEstadoSolicitud(aci_clienteIntegracionVO, lgs_generacionSolicitud);
			} else if (as_operacion.equalsIgnoreCase(
					EnumOperacionesSoap.SOLICITUD_SIN_PAGO_GENERAR_SOLICITUD.getIs_nombreOperacion())) {
				lci_clienteIntegracionVo = generarSolicitud(aci_clienteIntegracionVO, lgs_generacionSolicitud);
			}

			return lci_clienteIntegracionVo;
		} catch (Exception ae_excepcion) {
			CL_LOGGER.error(ae_excepcion.getMessage(), ae_excepcion);

			throw ae_excepcion;
		}
	}

}
