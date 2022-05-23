/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: VerificarProductoWsDtoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: VerificarProductoWsDtoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import co.gov.supernotariado.bachue.clientebus.vo.entregaproducto.TipoEntradaVerificarProductoVO;
import co.gov.supernotariado.bachue.clientebus.vo.entregaproducto.TipoSalidaVerificarProductoVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaVerificarProductoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaVerificarProductoWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Verificar
 * producto ws dto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class VerificarProductoWsDtoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * VerificarProductoWsDtoConverter.
	 */
	private VerificarProductoWsDtoConverter() {
		// Constructor vacio de la clase
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaVerificarProductoVO <b>a</b>
	 * TipoSalidaVerificarProductoWSDTO, <br>
	 * En otras palabras, <b>de</b> Tipo salida verificar producto objeto con
	 * valores de servicio <b>a</b> Tipo salida verificar producto web service dto.
	 *
	 * @param atsvp_tipoSalidaVerificarProductoVo el parametro tipo salida verificar
	 *                                            producto vo
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como TipoSalidaVerificarProductoWSDTO
	 */
	public static TipoSalidaVerificarProductoWSDTO entidadAVo(
			TipoSalidaVerificarProductoVO atsvp_tipoSalidaVerificarProductoVo) {
		TipoSalidaVerificarProductoWSDTO ltsvp_tipoSalidaVerificarProductoWsDto = new TipoSalidaVerificarProductoWSDTO();
		ltsvp_tipoSalidaVerificarProductoWsDto
				.setIs_codigoMensaje(atsvp_tipoSalidaVerificarProductoVo.getIs_codigoMensaje());
		ltsvp_tipoSalidaVerificarProductoWsDto
				.setIs_descripcionMensaje(atsvp_tipoSalidaVerificarProductoVo.getIs_descripcionMensaje());

		return ltsvp_tipoSalidaVerificarProductoWsDto;
	}

	/**
	 * Metodo que convierte de WSDTO a VO ( De Objeto de Transferencia de Datos de
	 * Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto WSDTO manipulado en la capa de negocio, en
	 * una entrada de datos para consumir una operacion de un servicio(objeto VO).
	 * <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoEntradaVerificarProductoWSDTO
	 * <b>a</b> TipoEntradaVerificarProductoVO, <br>
	 * En otras palabras, <b>de</b> Tipo entrada verificar producto web service dto
	 * <b>a</b> Tipo entrada verificar producto objeto con valores de servicio.
	 *
	 * @param atevp_tipoEntradaVerificarProductoWsDto el parametro tipo entrada
	 *                                                verificar producto ws dto
	 * @return Resultado para convertir web service dto a objeto de valores de
	 *         servicio, retornado como TipoEntradaVerificarProductoVO
	 */
	public static TipoEntradaVerificarProductoVO voAEntidad(
			TipoEntradaVerificarProductoWSDTO atevp_tipoEntradaVerificarProductoWsDto) {
		TipoEntradaVerificarProductoVO ltevp_tipoEntradaVerificarProductoVo = new TipoEntradaVerificarProductoVO();
		ltevp_tipoEntradaVerificarProductoVo
				.setIs_codigoVerificacion(atevp_tipoEntradaVerificarProductoWsDto.getIs_codigoVerificacion());
		return ltevp_tipoEntradaVerificarProductoVo;
	}
}
