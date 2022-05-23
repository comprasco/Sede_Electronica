/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: LogConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: LogConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import co.gov.supernotariado.bachue.clientebus.pasarela.types.aceptartransaccion.LogDTO;
import co.gov.supernotariado.bachue.clientebus.vo.pasarela.SalidaLogVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Log. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class LogConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase LogConverter.
	 */
	private LogConverter() {
		// Metodo constructor privado y vacio
	}

	/**
	 * Metodo que convierte de ComplexType a VO ( De elemento especifico del esquema
	 * de un Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto con un resultado/salida de una peticion de
	 * Servicio SOAP, en un objeto de datos llamado VO; para ser retornado como
	 * resultado a la aplicacion o capa de negocio que consume el cliente de
	 * servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> LogDTO <b>a</b> SalidaLogVO, <br>
	 * En otras palabras, <b>de</b> Log DTO (ComplexType relacionado a la
	 * representacion XML del servicio) <b>a</b> Salida log objeto con valores de
	 * servicio.
	 *
	 * @param al_tipoServicio el parametro que representa el complex type a
	 *                        convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como SalidaLogVO.
	 */
	public static SalidaLogVO tipoAVo(LogDTO al_tipoServicio) {

		SalidaLogVO lsl_log = new SalidaLogVO();

		lsl_log.setIs_codigo(Long.toString(al_tipoServicio.getCode()));
		lsl_log.setIs_mensajeTecnologia(al_tipoServicio.getTechMessage());
		lsl_log.setIs_tipo(al_tipoServicio.getType());
		lsl_log.setIs_mensajeUsuario(al_tipoServicio.getUserMessage());

		return lsl_log;
	}

}
