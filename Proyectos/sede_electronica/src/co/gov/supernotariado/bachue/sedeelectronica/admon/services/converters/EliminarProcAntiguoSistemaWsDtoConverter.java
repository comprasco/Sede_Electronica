/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EliminarProcAntiguoSistemaWsDtoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: EliminarProcAntiguoSistemaWsDtoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoEntradaEliminarProcAntiguoSistemaVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoSalidaEliminarProcAntiguoSistemaVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaEliminarProcAntiguoSistemaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaEliminarProcAntiguoSistemaWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Eliminar proc
 * antiguo sistema ws dto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class EliminarProcAntiguoSistemaWsDtoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * EliminarProcAntiguoSistemaWsDtoConverter.
	 */
	private EliminarProcAntiguoSistemaWsDtoConverter() {
		// Constructor vacio de la clase
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaEliminarProcAntiguoSistemaVO
	 * <b>a</b> TipoSalidaEliminarProcAntiguoSistemaWSDTO, <br>
	 * En otras palabras, <b>de</b> Tipo salida eliminar proc antiguo sistema objeto
	 * con valores de servicio <b>a</b> Tipo salida eliminar proc antiguo sistema
	 * web service dto.
	 *
	 * @param atsepas_tipoSalidaEliminarProcAntiguoSistemaVo el parametro tipo
	 *                                                       salida eliminar proc
	 *                                                       antiguo sistema vo
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como TipoSalidaEliminarProcAntiguoSistemaWSDTO
	 */
	public static TipoSalidaEliminarProcAntiguoSistemaWSDTO voAWsDto(
			TipoSalidaEliminarProcAntiguoSistemaVO atsepas_tipoSalidaEliminarProcAntiguoSistemaVo) {
		TipoSalidaEliminarProcAntiguoSistemaWSDTO ltsepas_tipoSalidaEliminarProcAntiguoSistemaWsDto = new TipoSalidaEliminarProcAntiguoSistemaWSDTO();
		ltsepas_tipoSalidaEliminarProcAntiguoSistemaWsDto
				.setIs_codigoMensaje(atsepas_tipoSalidaEliminarProcAntiguoSistemaVo.getIs_codigo());
		ltsepas_tipoSalidaEliminarProcAntiguoSistemaWsDto
				.setIs_descripcionMensaje(atsepas_tipoSalidaEliminarProcAntiguoSistemaVo.getIs_mensaje());
		return ltsepas_tipoSalidaEliminarProcAntiguoSistemaWsDto;
	}

	/**
	 * Metodo que convierte de WSDTO a VO ( De Objeto de Transferencia de Datos de
	 * Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto WSDTO manipulado en la capa de negocio, en
	 * una entrada de datos para consumir una operacion de un servicio(objeto VO).
	 * <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b>
	 * TipoEntradaEliminarProcAntiguoSistemaWSDTO <b>a</b>
	 * TipoEntradaEliminarProcAntiguoSistemaVO, <br>
	 * En otras palabras, <b>de</b> Tipo entrada eliminar proc antiguo sistema web
	 * service dto <b>a</b> Tipo entrada eliminar proc antiguo sistema objeto con
	 * valores de servicio.
	 *
	 * @param ateepas_tipoEntradaEliminarProcAntiguoSistemaWsDto el parametro tipo
	 *                                                           entrada eliminar
	 *                                                           proc antiguo
	 *                                                           sistema ws dto
	 * @return Resultado para convertir web service dto a objeto de valores de
	 *         servicio, retornado como TipoEntradaEliminarProcAntiguoSistemaVO
	 */
	public static TipoEntradaEliminarProcAntiguoSistemaVO wsDtoAVo(
			TipoEntradaEliminarProcAntiguoSistemaWSDTO ateepas_tipoEntradaEliminarProcAntiguoSistemaWsDto) {
		TipoEntradaEliminarProcAntiguoSistemaVO lteepas_tipoEntradaEliminarProcAntiguoSistemaVo = new TipoEntradaEliminarProcAntiguoSistemaVO();
		lteepas_tipoEntradaEliminarProcAntiguoSistemaVo
				.setIi_idAlerta(ateepas_tipoEntradaEliminarProcAntiguoSistemaWsDto.getIi_idAlerta());
		lteepas_tipoEntradaEliminarProcAntiguoSistemaVo.setIi_idAntiguoSistemaTierras(
				ateepas_tipoEntradaEliminarProcAntiguoSistemaWsDto.getIi_idAntiguoSistemaTierras());
		return lteepas_tipoEntradaEliminarProcAntiguoSistemaVo;
	}
}
