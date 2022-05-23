/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ListaOficinasOrigenWsDtoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: ListaOficinasOrigenWsDtoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.ListaOficinasOrigenVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.ListaOficinasOrigenWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Lista oficinas
 * origen ws dto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ListaOficinasOrigenWsDtoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ListaOficinasOrigenWsDtoConverter.
	 */
	private ListaOficinasOrigenWsDtoConverter() {
		// Constructor vacio de la clase
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> ListaOficinasOrigenVO <b>a</b>
	 * ListaOficinasOrigenWSDTO, <br>
	 * En otras palabras, <b>de</b> Lista oficinas origen objeto con valores de
	 * servicio <b>a</b> Lista oficinas origen web service dto.
	 *
	 * @param aloo_listaOficinasOrigenVo el parametro lista oficinas origen vo
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como ListaOficinasOrigenWSDTO
	 */
	public static ListaOficinasOrigenWSDTO voAWsDto(ListaOficinasOrigenVO aloo_listaOficinasOrigenVo) {
		ListaOficinasOrigenWSDTO lloo_listaOficinasOrigenWsDto = new ListaOficinasOrigenWSDTO();
		lloo_listaOficinasOrigenWsDto.setIs_nombreOficinaOrigen(aloo_listaOficinasOrigenVo.getIs_nombreOficinaOrigen());
		lloo_listaOficinasOrigenWsDto.setIs_oficinaOrigen(aloo_listaOficinasOrigenVo.getIs_oficinaOrigen());
		return lloo_listaOficinasOrigenWsDto;
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
	 * Especificamente convierte <b>de</b> una ListaOficinasOrigenVO <b>a</b> una
	 * ListaOficinasOrigenWSDTO, <br>
	 * En otras palabras, <b>de</b> una Lista oficinas origen objeto con valores de
	 * servicio <b>a</b> una Lista oficinas origen web service dto.
	 *
	 * @param alloo_listaOficinasOrigenVo el parametro lista oficinas origen vo
	 * @return Resultado para convertir de lista de valores de servicio a lista de
	 *         web service dto, retornado como una lista de ListaOficinasOrigenWSDTO
	 */
	public static List<ListaOficinasOrigenWSDTO> listaOvAListaWsDto(
			List<ListaOficinasOrigenVO> alloo_listaOficinasOrigenVo) {
		List<ListaOficinasOrigenWSDTO> llloo_listaOficinasOrigenWsDto = new ArrayList<>();
		for (ListaOficinasOrigenVO lloo_listaOficinasOrigenVo : alloo_listaOficinasOrigenVo) {
			llloo_listaOficinasOrigenWsDto.add(voAWsDto(lloo_listaOficinasOrigenVo));
		}
		return llloo_listaOficinasOrigenWsDto;
	}
}
