/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: LogWsDtoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: LogWsDtoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import co.gov.supernotariado.bachue.clientebus.vo.pasarela.SalidaLogVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.pasarelarealpay.wsdto.SalidaLogWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Log ws dto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class LogWsDtoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase LogWsDtoConverter.
	 */
	private LogWsDtoConverter() {
		// Constructor vacio de la clase
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> SalidaLogVO <b>a</b> SalidaLogWSDTO, <br>
	 * En otras palabras, <b>de</b> Salida log objeto con valores de servicio
	 * <b>a</b> Salida log web service dto.
	 *
	 * @param asl_salidaLogVO el parametro salida log VO
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como SalidaLogWSDTO
	 */
	public static SalidaLogWSDTO entidadAVo(SalidaLogVO asl_salidaLogVO) {

		SalidaLogWSDTO lsl_log = new SalidaLogWSDTO();

		lsl_log.setIs_code(asl_salidaLogVO.getIs_codigo());
		lsl_log.setIs_techMessage(asl_salidaLogVO.getIs_mensajeTecnologia());
		lsl_log.setIs_type(asl_salidaLogVO.getIs_tipo());
		lsl_log.setIs_userMessage(asl_salidaLogVO.getIs_mensajeUsuario());

		return lsl_log;
	}

}
