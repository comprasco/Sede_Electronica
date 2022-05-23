/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: ServicioControlDigitalizacion.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.fabrica
 * Nombre del elemento: ServicioControlDigitalizacion
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.fabrica;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;

import org.apache.log4j.Logger;

import co.gov.supernotariado.bachue.clientebus.controldigitalizacion.operacion.SUTCIControlDigitalizacion;
import co.gov.supernotariado.bachue.clientebus.controldigitalizacion.types.notificardigitalizacion.TipoEntradaNotificarDigitalizacion;
import co.gov.supernotariado.bachue.clientebus.converter.NotificarDigitalizacionConverter;
import co.gov.supernotariado.bachue.clientebus.enums.EnumOperacionesSoap;
import co.gov.supernotariado.bachue.clientebus.servicios.SUTCIControlDigitalizacionService;
import co.gov.supernotariado.bachue.clientebus.util.UtilidadClienteSoap;
import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;
import co.gov.supernotariado.bachue.clientebus.vo.controldigitalizacion.TipoEntradaNotificarDigitalizacionVO;
import co.gov.supernotariado.bachue.clientebus.vo.controldigitalizacion.TipoSalidaNotificarDigitalizacionVO;

/**
 * Implementacion de interfaces para el servicio control digitalizacion.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ServicioControlDigitalizacion implements IServicioWeb {
	
	/**
	 * Define la constante CL_LOGGER.
	 */
	static final Logger CL_LOGGER = Logger.getLogger(ServicioControlDigitalizacion.class);

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.clientebus.fabrica.IServicioWeb#ejecutar(co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO, java.lang.String, org.apache.log4j.Logger)
	 */
	@Override
	public ClienteIntegracionVO ejecutar(ClienteIntegracionVO aci_clienteIntegracionVO, String as_operacion,
			Logger al_logger) {
		try {
			ClienteIntegracionVO lci_clienteIntegracionVo = new ClienteIntegracionVO();

			QName qname = new QName(aci_clienteIntegracionVO.getIs_espacioNombre(),
					aci_clienteIntegracionVO.getIs_nombreServicioSoap());
			SUTCIControlDigitalizacionService lscds_controlDigitalizacionService = new SUTCIControlDigitalizacionService(
					null, qname);
			SUTCIControlDigitalizacion lcd_controlDigitalizacion = lscds_controlDigitalizacionService
					.getSUTCIControlDigitalizacionSOAP12BindingQSPort();
			UtilidadClienteSoap.insertarPropiedadesConexion(aci_clienteIntegracionVO,
					(BindingProvider) lcd_controlDigitalizacion);

			if (as_operacion.equalsIgnoreCase(EnumOperacionesSoap.CONTROL_DIGITALIZACION_NOTIFICAR_DIGITALIZACION.getIs_nombreOperacion())) {
				lci_clienteIntegracionVo = notificarDigitalizacion(aci_clienteIntegracionVO, lcd_controlDigitalizacion);
			}
			return lci_clienteIntegracionVo;
		} catch (Exception ae_excepcion) {
			CL_LOGGER.debug(ae_excepcion.getMessage());
			throw ae_excepcion;
		}
	}

	/**
	 * Metodo encargado de invocar la operacion notificar digitalizacion del
	 * servicio Control Digitalizacion.
	 *
	 * @param aci_clienteIntegracionVo  datos para consumir el servicio
	 * @param acd_controlDigitalizacion servicio a consumir en este caso
	 *                                  consultaPazySalvoTributario
	 * @return TipoSalidaNotificarDigitalizacionVO Datos de respuesta del servicio
	 */
	private TipoSalidaNotificarDigitalizacionVO notificarDigitalizacion(ClienteIntegracionVO aci_clienteIntegracionVo,
			SUTCIControlDigitalizacion acd_controlDigitalizacion) {
		if (!(aci_clienteIntegracionVo instanceof TipoEntradaNotificarDigitalizacionVO)) {
			throw new IllegalArgumentException();
		}
		TipoEntradaNotificarDigitalizacionVO ltend_tipoEntradaNotificarDigitalizacionVo = (TipoEntradaNotificarDigitalizacionVO) aci_clienteIntegracionVo;
		TipoEntradaNotificarDigitalizacion ltend_tipoEntradaNotificarDigitalizacion = NotificarDigitalizacionConverter
				.voATipo(ltend_tipoEntradaNotificarDigitalizacionVo);
		TipoSalidaNotificarDigitalizacionVO ltsnd_tipoSalidaNotificarDigitalizacionVo;
		ltsnd_tipoSalidaNotificarDigitalizacionVo = NotificarDigitalizacionConverter
				.tipoAVo(acd_controlDigitalizacion.notificarDigitalizacion(ltend_tipoEntradaNotificarDigitalizacion));
		return ltsnd_tipoSalidaNotificarDigitalizacionVo;
	}

}
