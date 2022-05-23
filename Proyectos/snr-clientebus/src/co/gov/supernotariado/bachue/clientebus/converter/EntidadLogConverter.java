/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: EntidadLogConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: EntidadLogConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import co.gov.supernotariado.bachue.clientebus.bancarizacion.type.generico.EntidadLog;
import co.gov.supernotariado.bachue.clientebus.util.UtilidadFecha;
import co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.generico.EntidadLogVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Entidad log.
 * <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class EntidadLogConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase EntidadLogConverter.
	 */
	public EntidadLogConverter() {
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
	 * Especificamente convierte <b>de</b> EntidadLog <b>a</b> EntidadLogVO, <br>
	 * En otras palabras, <b>de</b> Entidad log (ComplexType relacionado a la
	 * representacion XML del servicio) <b>a</b> Entidad log objeto con valores de
	 * servicio.
	 *
	 * @param ael_entidadLog el parametro que representa el complex type a
	 *                       convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como EntidadLogVO.
	 */
	public static EntidadLogVO tipoAVo(EntidadLog ael_entidadLog) {
		EntidadLogVO lel_entidadLogVO = new EntidadLogVO();

		lel_entidadLogVO.setId_fecha(UtilidadFecha.cambioGregorianADate(ael_entidadLog.getFecha()));
		lel_entidadLogVO.setIs_codigo(ael_entidadLog.getCodigo());
		lel_entidadLogVO.setIs_mensaje(ael_entidadLog.getMensaje());
		lel_entidadLogVO.setIs_mensajeTecnico(ael_entidadLog.getMensajeTecnico());
		lel_entidadLogVO.setIs_tipo(ael_entidadLog.getTipo());

		return lel_entidadLogVO;
	}

}
