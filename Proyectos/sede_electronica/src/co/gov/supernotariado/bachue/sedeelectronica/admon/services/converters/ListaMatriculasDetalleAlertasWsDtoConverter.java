/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ListaMatriculasDetalleAlertasWsDtoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: ListaMatriculasDetalleAlertasWsDtoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.ListaMatriculasDetalleAlertasVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.ListaMatriculasDetalleAlertasWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Lista matriculas
 * detalle alertas ws dto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ListaMatriculasDetalleAlertasWsDtoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ListaMatriculasDetalleAlertasWsDtoConverter.
	 */
	private ListaMatriculasDetalleAlertasWsDtoConverter() {
		// Constructor vacio de la clase
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> ListaMatriculasDetalleAlertasVO <b>a</b>
	 * ListaMatriculasDetalleAlertasWSDTO, <br>
	 * En otras palabras, <b>de</b> Lista matriculas detalle alertas objeto con
	 * valores de servicio <b>a</b> Lista matriculas detalle alertas web service
	 * dto.
	 *
	 * @param almda_listaMatriculasDetalleAlertasVo el parametro lista matriculas
	 *                                              detalle alertas vo
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como ListaMatriculasDetalleAlertasWSDTO
	 */
	public static ListaMatriculasDetalleAlertasWSDTO voAWsDto(
			ListaMatriculasDetalleAlertasVO almda_listaMatriculasDetalleAlertasVo) {
		ListaMatriculasDetalleAlertasWSDTO llmda_listaMatriculasDetalleAlertasWsDto = new ListaMatriculasDetalleAlertasWSDTO();
		llmda_listaMatriculasDetalleAlertasWsDto
				.setIs_nomCirculoRegistral(almda_listaMatriculasDetalleAlertasVo.getIs_nomCirculoRegistral());
		llmda_listaMatriculasDetalleAlertasWsDto
				.setIs_numMatriculaInmobiliaria(almda_listaMatriculasDetalleAlertasVo.getIs_numMatriculaInmobiliaria());
		llmda_listaMatriculasDetalleAlertasWsDto
				.setIs_numPredial(almda_listaMatriculasDetalleAlertasVo.getIs_numPredial());
		return llmda_listaMatriculasDetalleAlertasWsDto;
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
	 * Especificamente convierte <b>de</b> una ListaMatriculasDetalleAlertasVO
	 * <b>a</b> una ListaMatriculasDetalleAlertasWSDTO, <br>
	 * En otras palabras, <b>de</b> una Lista matriculas detalle alertas objeto con
	 * valores de servicio <b>a</b> una Lista matriculas detalle alertas web service
	 * dto.
	 *
	 * @param allmda_listaMatriculasDetalleAlertasVo el parametro lista matriculas
	 *                                               detalle alertas vo
	 * @return Resultado para convertir de lista de valores de servicio a lista de
	 *         web service dto, retornado como una lista de
	 *         ListaMatriculasDetalleAlertasWSDTO
	 */
	public static List<ListaMatriculasDetalleAlertasWSDTO> listaWsDtoAListaVo(
			List<ListaMatriculasDetalleAlertasVO> allmda_listaMatriculasDetalleAlertasVo) {
		List<ListaMatriculasDetalleAlertasWSDTO> lllmda_listaMatriculasDetalleAlertasWsDto = new ArrayList<>();
		for (ListaMatriculasDetalleAlertasVO llmda_listaMatriculasDetalleAlertasVo : allmda_listaMatriculasDetalleAlertasVo) {
			lllmda_listaMatriculasDetalleAlertasWsDto.add(voAWsDto(llmda_listaMatriculasDetalleAlertasVo));
		}
		return lllmda_listaMatriculasDetalleAlertasWsDto;
	}
}
