/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: NotificarDigitalizacionWsDtoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: NotificarDigitalizacionWsDtoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import co.gov.supernotariado.bachue.clientebus.vo.controldigitalizacion.TipoEntradaNotificarDigitalizacionVO;
import co.gov.supernotariado.bachue.clientebus.vo.controldigitalizacion.TipoSalidaNotificarDigitalizacionVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaNotificarDigitalizacionWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaNotificarDigitalizacionWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Notificar
 * digitalizacion ws dto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class NotificarDigitalizacionWsDtoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * NotificarDigitalizacionWsDtoConverter.
	 */
	private NotificarDigitalizacionWsDtoConverter() {
		// Constructor vacio de la clase
	}

	/**
	 * Metodo que convierte de WSDTO a VO ( De Objeto de Transferencia de Datos de
	 * Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto WSDTO manipulado en la capa de negocio, en
	 * una entrada de datos para consumir una operacion de un servicio(objeto VO).
	 * <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoEntradaNotificarDigitalizacionWSDTO
	 * <b>a</b> TipoEntradaNotificarDigitalizacionVO, <br>
	 * En otras palabras, <b>de</b> Tipo entrada notificar digitalizacion web
	 * service dto <b>a</b> Tipo entrada notificar digitalizacion objeto con valores
	 * de servicio.
	 *
	 * @param atend_tipoEntradaNotificarDigitalizacionWsDto el parametro tipo
	 *                                                      entrada notificar
	 *                                                      digitalizacion ws dto
	 * @return Resultado para convertir web service dto a objeto de valores de
	 *         servicio, retornado como TipoEntradaNotificarDigitalizacionVO
	 */
	public static TipoEntradaNotificarDigitalizacionVO dtoAVo(
			TipoEntradaNotificarDigitalizacionWSDTO atend_tipoEntradaNotificarDigitalizacionWsDto) {
		TipoEntradaNotificarDigitalizacionVO ltend_tipoEntradaNotificarDigitalizacionVo = new TipoEntradaNotificarDigitalizacionVO();

		ltend_tipoEntradaNotificarDigitalizacionVo
				.setIs_sistemaOrigen(atend_tipoEntradaNotificarDigitalizacionWsDto.getIs_sistemaOrigen());
		ltend_tipoEntradaNotificarDigitalizacionVo
				.setIs_identificadorTramite(atend_tipoEntradaNotificarDigitalizacionWsDto.getIs_identificadorTramite());
		ltend_tipoEntradaNotificarDigitalizacionVo
				.setIs_estado(atend_tipoEntradaNotificarDigitalizacionWsDto.getIs_estado());

		return ltend_tipoEntradaNotificarDigitalizacionVo;
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaNotificarDigitalizacionVO
	 * <b>a</b> TipoSalidaNotificarDigitalizacionWSDTO, <br>
	 * En otras palabras, <b>de</b> Tipo salida notificar digitalizacion objeto con
	 * valores de servicio <b>a</b> Tipo salida notificar digitalizacion web service
	 * dto.
	 *
	 * @param atsnd_tipoSalidaNotificarDigitalizacionVo el parametro tipo salida
	 *                                                  notificar digitalizacion vo
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como TipoSalidaNotificarDigitalizacionWSDTO
	 */
	public static TipoSalidaNotificarDigitalizacionWSDTO voADto(
			TipoSalidaNotificarDigitalizacionVO atsnd_tipoSalidaNotificarDigitalizacionVo) {
		TipoSalidaNotificarDigitalizacionWSDTO ltsnd_tipoSalidaNotificarDigitalizacionWsDto = new TipoSalidaNotificarDigitalizacionWSDTO();

		ltsnd_tipoSalidaNotificarDigitalizacionWsDto
				.setIs_codigoMensaje(atsnd_tipoSalidaNotificarDigitalizacionVo.getIs_codigoMensaje());
		ltsnd_tipoSalidaNotificarDigitalizacionWsDto
				.setIs_descripcionMensaje(atsnd_tipoSalidaNotificarDigitalizacionVo.getIs_descripcionMensaje());

		return ltsnd_tipoSalidaNotificarDigitalizacionWsDto;
	}
}
