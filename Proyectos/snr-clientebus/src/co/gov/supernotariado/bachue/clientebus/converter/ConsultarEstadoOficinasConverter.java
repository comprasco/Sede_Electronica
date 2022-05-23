/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: ConsultarEstadoOficinasConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: ConsultarEstadoOficinasConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import co.gov.supernotariado.bachue.clientebus.bancarizacion.type.consultarestadooficinasregistro.RespuestaConsultarEstadoOficinas;
import co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.consultarestadooficinasregistro.RespuestaConsultarEstadoOficinasVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Consultar
 * estado oficinas. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ConsultarEstadoOficinasConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ConsultarEstadoOficinasConverter.
	 */
	private ConsultarEstadoOficinasConverter() {
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
	 * Especificamente convierte <b>de</b> RespuestaConsultarEstadoOficinas <b>a</b>
	 * RespuestaConsultarEstadoOficinasVO, <br>
	 * En otras palabras, <b>de</b> Respuesta consultar estado oficinas (ComplexType
	 * relacionado a la representacion XML del servicio) <b>a</b> Respuesta
	 * consultar estado oficinas objeto con valores de servicio.
	 *
	 * @param arceo_respuestaconsutarEstado el parametro que representa el complex
	 *                                      type a convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como RespuestaConsultarEstadoOficinasVO.
	 */
	public static RespuestaConsultarEstadoOficinasVO tipoAVo(
			RespuestaConsultarEstadoOficinas arceo_respuestaconsutarEstado) {
		RespuestaConsultarEstadoOficinasVO lrceo_repuestaConsultaEstadoOficinaVO = new RespuestaConsultarEstadoOficinasVO();

		lrceo_repuestaConsultaEstadoOficinaVO.setIs_estado(arceo_respuestaconsutarEstado.getEstado());
		lrceo_repuestaConsultaEstadoOficinaVO
				.setIelv_log(EntidadLogConverter.tipoAVo(arceo_respuestaconsutarEstado.getLog()));

		return lrceo_repuestaConsultaEstadoOficinaVO;
	}

}
