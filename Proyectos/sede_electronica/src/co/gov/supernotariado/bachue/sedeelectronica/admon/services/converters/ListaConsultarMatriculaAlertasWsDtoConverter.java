/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ListaConsultarMatriculaAlertasWsDtoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: ListaConsultarMatriculaAlertasWsDtoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.ListaMatriculasConsultarMatriculaAlertaVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.ListaConsultarMatriculaAlertasWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Lista consultar
 * matricula alertas ws dto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ListaConsultarMatriculaAlertasWsDtoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ListaConsultarMatriculaAlertasWsDtoConverter.
	 */
	private ListaConsultarMatriculaAlertasWsDtoConverter() {
		// Constructor vacio de la clase
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> ListaMatriculasConsultarMatriculaAlertaVO
	 * <b>a</b> ListaConsultarMatriculaAlertasWSDTO, <br>
	 * En otras palabras, <b>de</b> Lista matriculas consultar matricula alerta
	 * objeto con valores de servicio <b>a</b> Lista consultar matricula alertas web
	 * service dto.
	 *
	 * @param almcma_listaMatriculaConsultarMatriculaAlertaVo el parametro lista
	 *                                                        matricula consultar
	 *                                                        matricula alerta vo
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como ListaConsultarMatriculaAlertasWSDTO
	 */
	public static ListaConsultarMatriculaAlertasWSDTO voAWsDto(
			ListaMatriculasConsultarMatriculaAlertaVO almcma_listaMatriculaConsultarMatriculaAlertaVo) {
		ListaConsultarMatriculaAlertasWSDTO llcma_listaConsultarMatriculaWSDTO = new ListaConsultarMatriculaAlertasWSDTO();
		llcma_listaConsultarMatriculaWSDTO
				.setIs_codCirculoRegistral(almcma_listaMatriculaConsultarMatriculaAlertaVo.getIs_codCirculoRegistral());
		llcma_listaConsultarMatriculaWSDTO.setIs_numMatriculaInmobiliaria(
				almcma_listaMatriculaConsultarMatriculaAlertaVo.getIi_numMatriculaInmobiliaria());
		llcma_listaConsultarMatriculaWSDTO
				.setIs_numPredial(almcma_listaMatriculaConsultarMatriculaAlertaVo.getIs_numPredial());
		return llcma_listaConsultarMatriculaWSDTO;
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
	 * Especificamente convierte <b>de</b> una
	 * ListaMatriculasConsultarMatriculaAlertaVO <b>a</b> una
	 * ListaConsultarMatriculaAlertasWSDTO, <br>
	 * En otras palabras, <b>de</b> una Lista matriculas consultar matricula alerta
	 * objeto con valores de servicio <b>a</b> una Lista consultar matricula alertas
	 * web service dto.
	 *
	 * @param allmcma_listaMatriculasConsultarMatriculaAlertaVo el parametro lista
	 *                                                          matriculas consultar
	 *                                                          matricula alerta vo
	 * @return Resultado para convertir de lista de valores de servicio a lista de
	 *         web service dto, retornado como una lista de
	 *         ListaConsultarMatriculaAlertasWSDTO
	 */
	public static List<ListaConsultarMatriculaAlertasWSDTO> listaVOAListaWsDto(
			List<ListaMatriculasConsultarMatriculaAlertaVO> allmcma_listaMatriculasConsultarMatriculaAlertaVo) {
		List<ListaConsultarMatriculaAlertasWSDTO> lllcma_listaConsultarMatriculaWsDto = new ArrayList<>();
		for (ListaMatriculasConsultarMatriculaAlertaVO llmcma_listaMatriculasConsultarMatriculaAlertaVo : allmcma_listaMatriculasConsultarMatriculaAlertaVo) {
			lllcma_listaConsultarMatriculaWsDto.add(voAWsDto(llmcma_listaMatriculasConsultarMatriculaAlertaVo));
		}
		return lllcma_listaConsultarMatriculaWsDto;
	}

}
