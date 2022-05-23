/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: ServicioSolicitudCorreccion.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.fabrica
 * Nombre del elemento: ServicioSolicitudCorreccion
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.fabrica;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;

import org.apache.log4j.Logger;

import co.gov.supernotariado.bachue.clientebus.converter.IngresoSolicitudConverter;
import co.gov.supernotariado.bachue.clientebus.converter.ObtenerCausalesCorreccionConverter;
import co.gov.supernotariado.bachue.clientebus.enums.EnumLog;
import co.gov.supernotariado.bachue.clientebus.enums.EnumOperacionesSoap;
import co.gov.supernotariado.bachue.clientebus.servicios.SDIEESolicitudDeCorreccionService;
import co.gov.supernotariado.bachue.clientebus.solicituddecorreccion.operacion.SDIEESolicitudDeCorreccion;
import co.gov.supernotariado.bachue.clientebus.solicituddecorreccion.types.ingresosolicitud.TipoEntradaIngresoSolicitud;
import co.gov.supernotariado.bachue.clientebus.solicituddecorreccion.types.obtenercausalescorreccion.TipoObtenerCausalesCorreccion;
import co.gov.supernotariado.bachue.clientebus.util.UtilidadClienteSoap;
import co.gov.supernotariado.bachue.clientebus.util.UtilidadLog;
import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;
import co.gov.supernotariado.bachue.clientebus.vo.solicitudcorreccion.TipoEntradaIngresoSolicitudVO;
import co.gov.supernotariado.bachue.clientebus.vo.solicitudcorreccion.TipoObtenerCausalesCorreccionVO;
import co.gov.supernotariado.bachue.clientebus.vo.solicitudcorreccion.TipoSalidaIngresoSolicitudVO;
import co.gov.supernotariado.bachue.clientebus.vo.solicitudcorreccion.TipoSalidaObtenerCausalesCorreccionVO;

/**
 * Implementacion de interfaces para el servicio solicitud de correccion.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ServicioSolicitudCorreccion implements IServicioWeb {

	/**
	 * Define la constante CL_LOGGER.
	 */
	static final Logger CL_LOGGER = Logger.getLogger(ServicioSolicitudCorreccion.class);

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
			SDIEESolicitudDeCorreccionService lsscs_solicitudDeCorreccionService = new SDIEESolicitudDeCorreccionService(
					null, qname);
			SDIEESolicitudDeCorreccion lsdc_solicitudDeCorreccion = lsscs_solicitudDeCorreccionService
					.getSDIEESolicitudDeCorreccionQSPort();
			UtilidadClienteSoap.insertarPropiedadesConexion(aci_clienteIntegracionVO,
					(BindingProvider) lsdc_solicitudDeCorreccion);

			if (as_operacion.equalsIgnoreCase(
					EnumOperacionesSoap.SOLICITUD_CORRECCION_INGRESO_SOLICITUD.getIs_nombreOperacion())) {
				lci_clienteIntegracionVO = ingresoSolicitud(aci_clienteIntegracionVO, lsdc_solicitudDeCorreccion);
			} else if (as_operacion.equalsIgnoreCase(
					EnumOperacionesSoap.SOLICITUD_CORRECCION_OBTENER_CAUSALES.getIs_nombreOperacion())) {
				lci_clienteIntegracionVO = obtenerCausales(aci_clienteIntegracionVO, lsdc_solicitudDeCorreccion);
			}
			return lci_clienteIntegracionVO;
		} catch (Exception ae_excepcion) {
			CL_LOGGER.error(ae_excepcion.getMessage(), ae_excepcion);

			throw ae_excepcion;
		}
	}

	/**
	 * Metodo que llama la operacion de obtener causales del servicio correcciones.
	 *
	 * @param aci_clienteIntegracionVO   datos a consumir
	 * @param asdc_solicitudDeCorreccion servicio a consumir
	 * @return TipoSalidaObtenerCausalesCorreccionVO Datos de respuesta del servicio
	 */
	private TipoSalidaObtenerCausalesCorreccionVO obtenerCausales(ClienteIntegracionVO aci_clienteIntegracionVO,
			SDIEESolicitudDeCorreccion asdc_solicitudDeCorreccion) {
		if (!(aci_clienteIntegracionVO instanceof TipoObtenerCausalesCorreccionVO)) {
			throw new IllegalArgumentException();
		}
		TipoObtenerCausalesCorreccion ltocc_tipoObtenerCausalesCorreccion = new TipoObtenerCausalesCorreccion();

		UtilidadLog<TipoObtenerCausalesCorreccion> lul_utilidadLog = new UtilidadLog<>();
		lul_utilidadLog.generarDebugObjeto(ltocc_tipoObtenerCausalesCorreccion, TipoObtenerCausalesCorreccion.class,
				EnumLog.ENTRADA_SERVICIO.getIs_codigo());

		TipoSalidaObtenerCausalesCorreccionVO ltsocc_tipoSalidaObtenerCausalesCorreccionVo;
		ltsocc_tipoSalidaObtenerCausalesCorreccionVo = ObtenerCausalesCorreccionConverter
				.entidaAVo(asdc_solicitudDeCorreccion.obtenerCausalesCorreccion(ltocc_tipoObtenerCausalesCorreccion));

		UtilidadLog<TipoSalidaObtenerCausalesCorreccionVO> lul_utilidadSalidaLog = new UtilidadLog<>();
		lul_utilidadSalidaLog.generarDebugObjeto(ltsocc_tipoSalidaObtenerCausalesCorreccionVo,
				TipoSalidaObtenerCausalesCorreccionVO.class, EnumLog.SALIDA_SERVICIO.getIs_codigo());

		return ltsocc_tipoSalidaObtenerCausalesCorreccionVo;
	}

	/**
	 * Metodo que llama la operacion de ingreso solicitud del servicio correcciones.
	 *
	 * @param aci_clienteIntegracionVO   datos a consumir
	 * @param asdc_solicitudDeCorreccion servicio a consumir
	 * @return TipoSalidaIngresoSolicitudVO Datos de respuesta del servicio
	 */
	private TipoSalidaIngresoSolicitudVO ingresoSolicitud(ClienteIntegracionVO aci_clienteIntegracionVO,
			SDIEESolicitudDeCorreccion asdc_solicitudDeCorreccion) {
		if (!(aci_clienteIntegracionVO instanceof TipoEntradaIngresoSolicitudVO)) {
			throw new IllegalArgumentException();
		}
		TipoEntradaIngresoSolicitudVO lteis_tipoEntradaIngresoSolicitudVo = (TipoEntradaIngresoSolicitudVO) aci_clienteIntegracionVO;
		TipoEntradaIngresoSolicitud lteis_tipoEntradaIngresoSolicitud = IngresoSolicitudConverter
				.voATipo(lteis_tipoEntradaIngresoSolicitudVo);

		UtilidadLog<TipoEntradaIngresoSolicitudVO> lul_utilidadLog = new UtilidadLog<>();
		lul_utilidadLog.generarDebugObjeto(lteis_tipoEntradaIngresoSolicitudVo, TipoEntradaIngresoSolicitudVO.class,
				EnumLog.ENTRADA_SERVICIO.getIs_codigo());

		TipoSalidaIngresoSolicitudVO ltsis_tipoSalidaIngresoSolicitudVo;
		ltsis_tipoSalidaIngresoSolicitudVo = IngresoSolicitudConverter
				.tipoAVo(asdc_solicitudDeCorreccion.ingresoSolicitud(lteis_tipoEntradaIngresoSolicitud));

		UtilidadLog<TipoSalidaIngresoSolicitudVO> lul_utilidadSalidaLog = new UtilidadLog<>();
		lul_utilidadSalidaLog.generarDebugObjeto(ltsis_tipoSalidaIngresoSolicitudVo, TipoSalidaIngresoSolicitudVO.class,
				EnumLog.SALIDA_SERVICIO.getIs_codigo());

		return ltsis_tipoSalidaIngresoSolicitudVo;
	}

}
