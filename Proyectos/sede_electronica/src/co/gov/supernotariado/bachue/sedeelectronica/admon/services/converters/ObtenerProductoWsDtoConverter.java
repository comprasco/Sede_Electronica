/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ObtenerProductoWsDtoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: ObtenerProductoWsDtoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import co.gov.supernotariado.bachue.clientebus.vo.entregaproducto.TipoEntradaObtenerProductoVO;
import co.gov.supernotariado.bachue.clientebus.vo.entregaproducto.TipoSalidaObtenerProductoVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaObtenerProductoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaObtenerProductoWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Obtener producto
 * ws dto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ObtenerProductoWsDtoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ObtenerProductoWsDtoConverter.
	 */
	private ObtenerProductoWsDtoConverter() {
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
	 * Especificamente convierte <b>de</b> TipoEntradaObtenerProductoWSDTO <b>a</b>
	 * TipoEntradaObtenerProductoVO, <br>
	 * En otras palabras, <b>de</b> Tipo entrada obtener producto web service dto
	 * <b>a</b> Tipo entrada obtener producto objeto con valores de servicio.
	 *
	 * @param ateop_tipoEntradaObtenerProductoWsDto el parametro tipo entrada
	 *                                              obtener producto ws dto
	 * @return Resultado para convertir web service dto a objeto de valores de
	 *         servicio, retornado como TipoEntradaObtenerProductoVO
	 */
	public static TipoEntradaObtenerProductoVO voAEntidad(
			TipoEntradaObtenerProductoWSDTO ateop_tipoEntradaObtenerProductoWsDto) {
		TipoEntradaObtenerProductoVO lteop_tipoEntradaObtenerProductoVo = new TipoEntradaObtenerProductoVO();

		lteop_tipoEntradaObtenerProductoVo.setIs_turno((ateop_tipoEntradaObtenerProductoWsDto.getIs_turno() != null)
				? ateop_tipoEntradaObtenerProductoWsDto.getIs_turno()
				: "");
		lteop_tipoEntradaObtenerProductoVo
				.setIs_codigoVerificacion((ateop_tipoEntradaObtenerProductoWsDto.getIs_codigoVerificacion() != null)
						? ateop_tipoEntradaObtenerProductoWsDto.getIs_codigoVerificacion()
						: "");
		lteop_tipoEntradaObtenerProductoVo
				.setIs_referenciaPago((ateop_tipoEntradaObtenerProductoWsDto.getIs_referenciaPago() != null)
						? ateop_tipoEntradaObtenerProductoWsDto.getIs_referenciaPago()
						: "");

		return lteop_tipoEntradaObtenerProductoVo;
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaObtenerProductoVO <b>a</b>
	 * TipoSalidaObtenerProductoWSDTO, <br>
	 * En otras palabras, <b>de</b> Tipo salida obtener producto objeto con valores
	 * de servicio <b>a</b> Tipo salida obtener producto web service dto.
	 *
	 * @param atsop_tipoSalidaObtenerProductoVo el parametro tipo salida obtener
	 *                                          producto vo
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como TipoSalidaObtenerProductoWSDTO
	 */
	public static TipoSalidaObtenerProductoWSDTO entidadAVo(
			TipoSalidaObtenerProductoVO atsop_tipoSalidaObtenerProductoVo) {
		TipoSalidaObtenerProductoWSDTO ltsop_tipoSalidaObtenerProductoWsDto = new TipoSalidaObtenerProductoWSDTO();

		ltsop_tipoSalidaObtenerProductoWsDto.setIb_archivo(atsop_tipoSalidaObtenerProductoVo.getIb_archivo());
		ltsop_tipoSalidaObtenerProductoWsDto
				.setIs_codigoMensaje(atsop_tipoSalidaObtenerProductoVo.getIs_codigoMensaje());
		ltsop_tipoSalidaObtenerProductoWsDto
				.setIs_descripcionMensaje(atsop_tipoSalidaObtenerProductoVo.getIs_descripcionMensaje());

		return ltsop_tipoSalidaObtenerProductoWsDto;
	}
}
