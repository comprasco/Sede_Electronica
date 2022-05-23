/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ObtenerReciboCajaWsDtoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: ObtenerReciboCajaWsDtoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import co.gov.supernotariado.bachue.clientebus.vo.entregaproducto.TipoEntradaObtenerReciboCajaVO;
import co.gov.supernotariado.bachue.clientebus.vo.entregaproducto.TipoSalidaObtenerReciboCajaVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaObtenerReciboCajaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaObtenerReciboCajaWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Obtener recibo
 * caja ws dto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ObtenerReciboCajaWsDtoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ObtenerReciboCajaWsDtoConverter.
	 */
	private ObtenerReciboCajaWsDtoConverter() {
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
	 * Especificamente convierte <b>de</b> TipoEntradaObtenerReciboCajaWSDTO
	 * <b>a</b> TipoEntradaObtenerReciboCajaVO, <br>
	 * En otras palabras, <b>de</b> Tipo entrada obtener recibo caja web service dto
	 * <b>a</b> Tipo entrada obtener recibo caja objeto con valores de servicio.
	 *
	 * @param ateorc_tipoEntradaObtenerReciboCajaWsDto el parametro tipo entrada
	 *                                                 obtener recibo caja ws dto
	 * @return Resultado para convertir web service dto a objeto de valores de
	 *         servicio, retornado como TipoEntradaObtenerReciboCajaVO
	 */
	public static TipoEntradaObtenerReciboCajaVO voAEntidad(
			TipoEntradaObtenerReciboCajaWSDTO ateorc_tipoEntradaObtenerReciboCajaWsDto) {
		TipoEntradaObtenerReciboCajaVO lteorc_tipoEntradaObtenerReciboCajaVo = new TipoEntradaObtenerReciboCajaVO();

		lteorc_tipoEntradaObtenerReciboCajaVo.setIs_nir(ateorc_tipoEntradaObtenerReciboCajaWsDto.getIs_nir());
		lteorc_tipoEntradaObtenerReciboCajaVo
				.setIs_referenciaPago(ateorc_tipoEntradaObtenerReciboCajaWsDto.getIs_referenciaPago());

		return lteorc_tipoEntradaObtenerReciboCajaVo;
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaObtenerReciboCajaVO <b>a</b>
	 * TipoSalidaObtenerReciboCajaWSDTO, <br>
	 * En otras palabras, <b>de</b> Tipo salida obtener recibo caja objeto con
	 * valores de servicio <b>a</b> Tipo salida obtener recibo caja web service dto.
	 *
	 * @param atsorc_tipoSalidaObtenerReciboCajaVo el parametro tipo salida obtener
	 *                                             recibo caja vo
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como TipoSalidaObtenerReciboCajaWSDTO
	 */
	public static TipoSalidaObtenerReciboCajaWSDTO entidadAVo(
			TipoSalidaObtenerReciboCajaVO atsorc_tipoSalidaObtenerReciboCajaVo) {
		TipoSalidaObtenerReciboCajaWSDTO ltsorc_tipoSalidaObtenerReciboCajaWsDto = new TipoSalidaObtenerReciboCajaWSDTO();

		ltsorc_tipoSalidaObtenerReciboCajaWsDto.setIb_archivo(atsorc_tipoSalidaObtenerReciboCajaVo.getIb_archivo());
		ltsorc_tipoSalidaObtenerReciboCajaWsDto
				.setIbi_codigoMensaje(atsorc_tipoSalidaObtenerReciboCajaVo.getIbi_codigoMensaje());
		ltsorc_tipoSalidaObtenerReciboCajaWsDto
				.setIs_descripcionMensaje(atsorc_tipoSalidaObtenerReciboCajaVo.getIs_descripcionMensaje());

		return ltsorc_tipoSalidaObtenerReciboCajaWsDto;
	}
}
