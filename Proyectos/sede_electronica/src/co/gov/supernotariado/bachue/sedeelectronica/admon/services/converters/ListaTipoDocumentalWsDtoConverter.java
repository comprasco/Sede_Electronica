/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ListaTipoDocumentalWsDtoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: ListaTipoDocumentalWsDtoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.vo.historialnotificaciones.TipoDocumentalVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.ListaTipoDocumentalWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Lista tipo
 * documental dto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ListaTipoDocumentalWsDtoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ListaTipoDocumentalWsDtoConverter.
	 */
	private ListaTipoDocumentalWsDtoConverter() {
		// Constructor vacio de la clase
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoDocumentalVO <b>a</b>
	 * ListaTipoDocumentalWSDTO, <br>
	 * En otras palabras, <b>de</b> Lista oficinas origen objeto con valores de
	 * servicio <b>a</b> Lista oficinas origen web service dto.
	 *
	 * @param atd_tipoDocumentalVo el parametro lista oficinas origen vo
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como ListaTipoDocumentalWSDTO
	 */
	public static ListaTipoDocumentalWSDTO voAWsDto(TipoDocumentalVO atd_tipoDocumentalVo) {
		ListaTipoDocumentalWSDTO lltd_listaTipoDocumentalWsDto = new ListaTipoDocumentalWSDTO();
		lltd_listaTipoDocumentalWsDto
				.setIs_nomTipoDocumentoPublico(atd_tipoDocumentalVo.getIs_nomTipoDocumentoPublico());
		return lltd_listaTipoDocumentalWsDto;
	}

	/**
	 * Metodo que convierte de una lista de VO a una lista de WSDTO (De Objetos de
	 * valores de Servicio, a Objetos de Transferencia de Datos de Servicio
	 * Web).<br>
	 * Se usa para convertir una lista de resultados o salidas de servicio(objetos
	 * VO) a una lista de objetos WSDTO para ser manipulados en la capa de negocio.
	 * <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> una TipoDocumentalVO <b>a</b> una
	 * ListaTipoDocumentalWSDTO, <br>
	 * En otras palabras, <b>de</b> una Lista oficinas origen objeto con valores de
	 * servicio <b>a</b> una Lista oficinas origen web service dto.
	 *
	 * @param altd_tipoDocumentalVo el parametro lista oficinas origen vo
	 * @return Resultado para convertir de lista de valores de servicio a lista de
	 *         web service dto, retornado como una lista de ListaTipoDocumentalWSDTO
	 */
	public static List<ListaTipoDocumentalWSDTO> listaOvAListaWsDto(List<TipoDocumentalVO> altd_tipoDocumentalVo) {
		List<ListaTipoDocumentalWSDTO> lltd_tipoDocumentalWsDto = new ArrayList<>();
		for (TipoDocumentalVO ltd_tipoDocumentalVo : altd_tipoDocumentalVo) {
			lltd_tipoDocumentalWsDto.add(voAWsDto(ltd_tipoDocumentalVo));
		}
		return lltd_tipoDocumentalWsDto;
	}
}
