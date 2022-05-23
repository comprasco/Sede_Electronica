/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: NotificarDigitalizacionConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: NotificarDigitalizacionConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import co.gov.supernotariado.bachue.clientebus.controldigitalizacion.types.notificardigitalizacion.TipoEntradaNotificarDigitalizacion;
import co.gov.supernotariado.bachue.clientebus.controldigitalizacion.types.notificardigitalizacion.TipoSalidaNotificarDigitalizacion;
import co.gov.supernotariado.bachue.clientebus.vo.controldigitalizacion.TipoEntradaNotificarDigitalizacionVO;
import co.gov.supernotariado.bachue.clientebus.vo.controldigitalizacion.TipoSalidaNotificarDigitalizacionVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Notificar
 * digitalizacion. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class NotificarDigitalizacionConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * NotificarDigitalizacionConverter.
	 */
	private NotificarDigitalizacionConverter() {
		// Metodo constructor privado y vacio
	}

	/**
	 * Metodo que convierte de VO a ComplexType (De Objeto de valores de Servicio,
	 * entrada del cliente bus; a elemento especifico del esquema de un Servicio
	 * Web, entrada de una peticion de Servicio SOAP).<br>
	 * Se usa para convertir un objeto con las entradas de un servicio web (objeto
	 * VO), a un objeto ComplexType para ser enviado en una operacion de un
	 * servicio. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoEntradaNotificarDigitalizacionVO
	 * <b>a</b> TipoEntradaNotificarDigitalizacion, <br>
	 * En otras palabras, <b>de</b> Tipo entrada notificar digitalizacion objeto con
	 * valores de servicio <b>a</b> Tipo entrada notificar digitalizacion
	 * (ComplexType relacionado a la representacion XML del servicio).
	 *
	 * @param atend_tipoEntradaNotificarDigitalizacionVo el parametro que representa
	 *                                                   el objeto con valores de
	 *                                                   servicio a convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como TipoEntradaNotificarDigitalizacion.
	 */
	public static TipoEntradaNotificarDigitalizacion voATipo(
			TipoEntradaNotificarDigitalizacionVO atend_tipoEntradaNotificarDigitalizacionVo) {
		TipoEntradaNotificarDigitalizacion ltend_tipoEntradaNotificarDigitalizacion = new TipoEntradaNotificarDigitalizacion();

		ltend_tipoEntradaNotificarDigitalizacion
				.setSistemaOrigen(atend_tipoEntradaNotificarDigitalizacionVo.getIs_sistemaOrigen());
		ltend_tipoEntradaNotificarDigitalizacion
				.setIdentificadorTramite(atend_tipoEntradaNotificarDigitalizacionVo.getIs_identificadorTramite());
		ltend_tipoEntradaNotificarDigitalizacion.setEstado(atend_tipoEntradaNotificarDigitalizacionVo.getIs_estado());

		return ltend_tipoEntradaNotificarDigitalizacion;
	}

	/**
	 * Metodo que convierte de ComplexType a VO ( De elemento especifico del esquema
	 * de un Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto con un resultado/salida de una peticion de
	 * Servicio SOAP, en un objeto de datos llamado VO; para ser retornado como
	 * resultado a la aplicacion o capa de negocio que consume el cliente de
	 * servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaNotificarDigitalizacion
	 * <b>a</b> TipoSalidaNotificarDigitalizacionVO, <br>
	 * En otras palabras, <b>de</b> Tipo salida notificar digitalizacion
	 * (ComplexType relacionado a la representacion XML del servicio) <b>a</b> Tipo
	 * salida notificar digitalizacion objeto con valores de servicio.
	 *
	 * @param atsnd_tipoSalidaNotificarDigitalizacion el parametro que representa el
	 *                                                complex type a convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como TipoSalidaNotificarDigitalizacionVO.
	 */
	public static TipoSalidaNotificarDigitalizacionVO tipoAVo(
			TipoSalidaNotificarDigitalizacion atsnd_tipoSalidaNotificarDigitalizacion) {
		TipoSalidaNotificarDigitalizacionVO ltsnd_tipoSalidaNotificarDigitalizacionVo = new TipoSalidaNotificarDigitalizacionVO();

		ltsnd_tipoSalidaNotificarDigitalizacionVo
				.setIs_codigoMensaje(atsnd_tipoSalidaNotificarDigitalizacion.getCodigoMensaje());
		ltsnd_tipoSalidaNotificarDigitalizacionVo
				.setIs_descripcionMensaje(atsnd_tipoSalidaNotificarDigitalizacion.getDescripcionMensaje());

		return ltsnd_tipoSalidaNotificarDigitalizacionVo;
	}
}