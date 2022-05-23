/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: ServicioCopias.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.fabrica
 * Nombre del elemento: ServicioCopias
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.fabrica;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;

import org.apache.log4j.Logger;

import co.gov.supernotariado.bachue.clientebus.converter.CopiasConsultaSolicitudConverter;
import co.gov.supernotariado.bachue.clientebus.converter.CopiasIngresoSolicitudConverter;
import co.gov.supernotariado.bachue.clientebus.enums.EnumLog;
import co.gov.supernotariado.bachue.clientebus.enums.EnumOperacionesSoap;
import co.gov.supernotariado.bachue.clientebus.servicios.SDIEESolicitudDeCopiasService;
import co.gov.supernotariado.bachue.clientebus.solicituddecopias.operacion.SDIEESolicitudDeCopias;
import co.gov.supernotariado.bachue.clientebus.solicituddecopias.types.consultarsolicitud.TipoEntradaConsultarSolicitud;
import co.gov.supernotariado.bachue.clientebus.solicituddecopias.types.consultarsolicitud.TipoSalidaConsultarSolicitud;
import co.gov.supernotariado.bachue.clientebus.solicituddecopias.types.ingresosolicitud.TipoEntradaIngresoSolicitud;
import co.gov.supernotariado.bachue.clientebus.solicituddecopias.types.ingresosolicitud.TipoSalidaIngresoSolicitud;
import co.gov.supernotariado.bachue.clientebus.util.UtilidadClienteSoap;
import co.gov.supernotariado.bachue.clientebus.util.UtilidadLog;
import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;
import co.gov.supernotariado.bachue.clientebus.vo.solicitudcopias.TipoEntradaConsultarSolicitudVO;
import co.gov.supernotariado.bachue.clientebus.vo.solicitudcopias.TipoEntradaIngresoSolicitudVO;
import co.gov.supernotariado.bachue.clientebus.vo.solicitudcopias.TipoSalidaConsultarSolicitudVO;
import co.gov.supernotariado.bachue.clientebus.vo.solicitudcopias.TipoSalidaIngresoSolicitudVO;

/**
 * Implementacion de interfaces para el servicio copias.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ServicioCopias implements IServicioWeb {

	/**
	 * Define la constante CL_LOGGER.
	 */
	private static final Logger CL_LOGGER = Logger.getLogger(ServicioCopias.class);

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
			SDIEESolicitudDeCopiasService lsscs_solicitudDeCopiasService = new SDIEESolicitudDeCopiasService(null,
					qname);
			SDIEESolicitudDeCopias lsdc_solicitudDeCopias = lsscs_solicitudDeCopiasService
					.getSDIEESolicitudDeCopiasQSPort();
			UtilidadClienteSoap.insertarPropiedadesConexion(aci_clienteIntegracionVO,
					(BindingProvider) lsdc_solicitudDeCopias);

			if (as_operacion.equalsIgnoreCase(EnumOperacionesSoap.COPIAS_CONSULTAR_SOLICITUD.getIs_nombreOperacion())) {
				lci_clienteIntegracionVO = consultarSolicitud(aci_clienteIntegracionVO, lsdc_solicitudDeCopias);
			} else if (as_operacion
					.equalsIgnoreCase(EnumOperacionesSoap.COPIAS_INGRESO_SOLICITUD.getIs_nombreOperacion())) {
				lci_clienteIntegracionVO = ingresoSolicitud(aci_clienteIntegracionVO, lsdc_solicitudDeCopias);
			}

			return lci_clienteIntegracionVO;
		} catch (Exception ae_excepcion) {
			CL_LOGGER.error(ae_excepcion.getMessage(), ae_excepcion);
			throw ae_excepcion;
		}
	}

	/**
	 * Metodo que consume el servicio de ingreso solicitud de copias.
	 *
	 * @param aci_clienteIntegracionVO datos de entrada
	 * @param asdc_solicitudDeCopias   servicio para generar metodo
	 * @return TipoSalidaIngresoSolicitudVO Datos de respuesta del servicio
	 */
	private TipoSalidaIngresoSolicitudVO ingresoSolicitud(ClienteIntegracionVO aci_clienteIntegracionVO,
			SDIEESolicitudDeCopias asdc_solicitudDeCopias) {
		if (!(aci_clienteIntegracionVO instanceof TipoEntradaIngresoSolicitudVO))
			throw new IllegalArgumentException();

		TipoEntradaIngresoSolicitudVO lteis_tipoEntradaIngresoSolicitudVo = (TipoEntradaIngresoSolicitudVO) aci_clienteIntegracionVO;
		TipoEntradaIngresoSolicitud lteis_tipoEntradaIngresoSolicitud = CopiasIngresoSolicitudConverter
				.voATipo(lteis_tipoEntradaIngresoSolicitudVo);

		UtilidadLog<TipoEntradaIngresoSolicitudVO> lulteis_utilidadLogEntrada = new UtilidadLog<>();
		lulteis_utilidadLogEntrada.generarDebugObjeto(lteis_tipoEntradaIngresoSolicitudVo,
				TipoEntradaIngresoSolicitudVO.class, EnumLog.ENTRADA_SERVICIO.getIs_codigo());

		TipoSalidaIngresoSolicitudVO ltsis_tipoSalidaIngresoSolicitudVo;
		TipoSalidaIngresoSolicitud ltsis_tipoSalidaIngresoSolicitud = asdc_solicitudDeCopias
				.ingresoSolicitud(lteis_tipoEntradaIngresoSolicitud);
		ltsis_tipoSalidaIngresoSolicitudVo = CopiasIngresoSolicitudConverter.tipoAVo(ltsis_tipoSalidaIngresoSolicitud);

		UtilidadLog<TipoSalidaIngresoSolicitudVO> lultsis_utilidadLogSalida = new UtilidadLog<>();
		lultsis_utilidadLogSalida.generarDebugObjeto(ltsis_tipoSalidaIngresoSolicitudVo,
				TipoSalidaIngresoSolicitudVO.class, EnumLog.SALIDA_SERVICIO.getIs_codigo());

		return ltsis_tipoSalidaIngresoSolicitudVo;
	}

	/**
	 * Metodo que consume el servicio de consultar solicitud de copias.
	 *
	 * @param aci_clienteIntegracionVO datos de entrada
	 * @param asdc_solicitudDeCopias   servicio para generar metodo
	 * @return TipoSalidaConsultarSolicitudVO Datos de respuesta del servicio
	 */
	private TipoSalidaConsultarSolicitudVO consultarSolicitud(ClienteIntegracionVO aci_clienteIntegracionVO,
			SDIEESolicitudDeCopias asdc_solicitudDeCopias) {
		if (aci_clienteIntegracionVO instanceof TipoEntradaIngresoSolicitudVO)
			throw new IllegalArgumentException();
		TipoEntradaConsultarSolicitudVO ltecs_tipoEntradaConsultarSolicitudVo = (TipoEntradaConsultarSolicitudVO) aci_clienteIntegracionVO;
		TipoEntradaConsultarSolicitud ltecs_tipoEntradaConsultarSolicitud = CopiasConsultaSolicitudConverter
				.voATipo(ltecs_tipoEntradaConsultarSolicitudVo);

		UtilidadLog<TipoEntradaConsultarSolicitudVO> lultecs_utilidadLogEntrada = new UtilidadLog<>();
		lultecs_utilidadLogEntrada.generarDebugObjeto(ltecs_tipoEntradaConsultarSolicitudVo,
				TipoEntradaConsultarSolicitudVO.class, EnumLog.ENTRADA_SERVICIO.getIs_codigo());

		TipoSalidaConsultarSolicitudVO ltscs_tipoSalidaConsultarSolicitudVo;
		TipoSalidaConsultarSolicitud ltscs_tipoSalidaConsultarSolicitud = asdc_solicitudDeCopias
				.consultarSolicitud(ltecs_tipoEntradaConsultarSolicitud);
		ltscs_tipoSalidaConsultarSolicitudVo = CopiasConsultaSolicitudConverter
				.tipoAVo(ltscs_tipoSalidaConsultarSolicitud);

		UtilidadLog<TipoSalidaConsultarSolicitudVO> lultscs_utilidadaLogSalida = new UtilidadLog<>();
		lultscs_utilidadaLogSalida.generarDebugObjeto(ltscs_tipoSalidaConsultarSolicitudVo,
				TipoSalidaConsultarSolicitudVO.class, EnumLog.SALIDA_SERVICIO.getIs_codigo());

		return ltscs_tipoSalidaConsultarSolicitudVo;

	}

}
