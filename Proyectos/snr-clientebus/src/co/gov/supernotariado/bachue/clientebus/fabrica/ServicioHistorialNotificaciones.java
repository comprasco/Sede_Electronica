/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: ServicioHistorialNotificaciones.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.fabrica
 * Nombre del elemento: ServicioHistorialNotificaciones
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.fabrica;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;

import org.apache.log4j.Logger;

import co.gov.supernotariado.bachue.clientebus.converter.ConsultarHistorialConverter;
import co.gov.supernotariado.bachue.clientebus.enums.EnumLog;
import co.gov.supernotariado.bachue.clientebus.enums.EnumOperacionesSoap;
import co.gov.supernotariado.bachue.clientebus.historialnotificaciones.operacion.SDIEEHistorialNotificaciones;
import co.gov.supernotariado.bachue.clientebus.historialnotificaciones.type.consultarhistorial.TipoEntradaConsultarHistorial;
import co.gov.supernotariado.bachue.clientebus.servicios.SDIEEHistorialNotificacionesService;
import co.gov.supernotariado.bachue.clientebus.util.UtilidadClienteSoap;
import co.gov.supernotariado.bachue.clientebus.util.UtilidadLog;
import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;
import co.gov.supernotariado.bachue.clientebus.vo.historialnotificaciones.TipoEntradaConsultarHistorialVO;
import co.gov.supernotariado.bachue.clientebus.vo.historialnotificaciones.TipoSalidaConsultarHistorialVO;

/**
 * Implementacion de interface para el servicio historial de notificaciones.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ServicioHistorialNotificaciones implements IServicioWeb {

	/**
	 * Define la constante CL_LOGGER.
	 */
	static final Logger CL_LOGGER = Logger.getLogger(ServicioHistorialNotificaciones.class);

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
			Logger al_logger) throws Exception {
		ClienteIntegracionVO lci_clienteIntegracionVO = new ClienteIntegracionVO();
		try {
			QName lqn_qname = new QName(aci_clienteIntegracionVO.getIs_espacioNombre(),
					aci_clienteIntegracionVO.getIs_nombreServicioSoap());
			SDIEEHistorialNotificacionesService lshns_historialNotificacionesServicio = new SDIEEHistorialNotificacionesService(
					null, lqn_qname);
			SDIEEHistorialNotificaciones lshn_historialNotificaciones = lshns_historialNotificacionesServicio
					.getSDIEEHistorialNotificacionesPort();

			UtilidadClienteSoap.insertarPropiedadesConexion(aci_clienteIntegracionVO,
					(BindingProvider) lshn_historialNotificaciones);

			if (as_operacion.equalsIgnoreCase(
					EnumOperacionesSoap.HISTORIAL_NOTIFICACIONES_CONSULTAR_HISTORIAL.getIs_nombreOperacion())) {
				lci_clienteIntegracionVO = consultarHistorial(aci_clienteIntegracionVO, lshn_historialNotificaciones);
			}

			return lci_clienteIntegracionVO;
		} catch (Exception ae_excepcion) {
			CL_LOGGER.debug(ae_excepcion.getMessage());
			throw ae_excepcion;
		}
	}

	/**
	 * Metodo que llama la operacion consultar historial de notiicaciones
	 *
	 * @param aci_clienteIntegracionVO     el parametro cliente integracion objeto
	 *                                     con valores de servicio
	 * @param ashn_historialNotiricaciones el parametro historial notiricaciones
	 * @return Resultado para consultar historial retornado como
	 *         TipoSalidaConsultarHistorialVO
	 */
	private TipoSalidaConsultarHistorialVO consultarHistorial(ClienteIntegracionVO aci_clienteIntegracionVO,
			SDIEEHistorialNotificaciones ashn_historialNotiricaciones) {
		if (!(aci_clienteIntegracionVO instanceof TipoEntradaConsultarHistorialVO)) {
			throw new IllegalArgumentException();
		}

		TipoEntradaConsultarHistorialVO ltech_tipoEntradaConsultarHistorialVo = (TipoEntradaConsultarHistorialVO) aci_clienteIntegracionVO;
		TipoEntradaConsultarHistorial ltech_tipoEntradaConsultarHistorial = ConsultarHistorialConverter
				.voATipo(ltech_tipoEntradaConsultarHistorialVo);
		UtilidadLog<TipoEntradaConsultarHistorialVO> lultech_utilidadLogEntrada = new UtilidadLog<>();
		lultech_utilidadLogEntrada.generarDebugObjeto(ltech_tipoEntradaConsultarHistorialVo,
				TipoEntradaConsultarHistorialVO.class, EnumLog.ENTRADA_SERVICIO.getIs_codigo());

		TipoSalidaConsultarHistorialVO ltsch_tipoSalidaConsultarHistorialVo;
		ltsch_tipoSalidaConsultarHistorialVo = ConsultarHistorialConverter
				.tipoAVo(ashn_historialNotiricaciones.consultarHistorial(ltech_tipoEntradaConsultarHistorial));
		UtilidadLog<TipoSalidaConsultarHistorialVO> lultsch_utilidadLogSalida = new UtilidadLog<>();
		lultsch_utilidadLogSalida.generarDebugObjeto(ltsch_tipoSalidaConsultarHistorialVo,
				TipoSalidaConsultarHistorialVO.class, EnumLog.SALIDA_SERVICIO.getIs_codigo());

		return ltsch_tipoSalidaConsultarHistorialVo;
	}
}
