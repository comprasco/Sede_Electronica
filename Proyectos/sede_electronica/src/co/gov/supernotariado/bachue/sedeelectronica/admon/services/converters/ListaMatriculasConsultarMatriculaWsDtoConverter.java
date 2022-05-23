/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ListaMatriculasConsultarMatriculaWsDtoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: ListaMatriculasConsultarMatriculaWsDtoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.ListaMatriculasConsultarMatriculaVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.ListaMatriculasConsultarMatriculaWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Lista matriculas
 * consultar matricula ws dto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ListaMatriculasConsultarMatriculaWsDtoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ListaMatriculasConsultarMatriculaWsDtoConverter.
	 */
	private ListaMatriculasConsultarMatriculaWsDtoConverter() {
		// Constructor vacio de la clase
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> ListaMatriculasConsultarMatriculaVO
	 * <b>a</b> ListaMatriculasConsultarMatriculaWSDTO, <br>
	 * En otras palabras, <b>de</b> Lista matriculas consultar matricula objeto con
	 * valores de servicio <b>a</b> Lista matriculas consultar matricula web service
	 * dto.
	 *
	 * @param almcm_listaMatriculasConsultarMatriculaVo el parametro lista
	 *                                                  matriculas consultar
	 *                                                  matricula vo
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como ListaMatriculasConsultarMatriculaWSDTO
	 */
	public static ListaMatriculasConsultarMatriculaWSDTO voAWsDto(
			ListaMatriculasConsultarMatriculaVO almcm_listaMatriculasConsultarMatriculaVo) {

		ListaMatriculasConsultarMatriculaWSDTO llmcm_listaMatriculasConsultarMatriculaWsDto = new ListaMatriculasConsultarMatriculaWSDTO();
		llmcm_listaMatriculasConsultarMatriculaWsDto
				.setIs_codCirculoRegistral(almcm_listaMatriculasConsultarMatriculaVo.getIs_codCirculoRegistral());
		llmcm_listaMatriculasConsultarMatriculaWsDto.setIi_numMatriculaInmobiliaria(
				almcm_listaMatriculasConsultarMatriculaVo.getIi_numMatriculaInmobiliaria());
		llmcm_listaMatriculasConsultarMatriculaWsDto
				.setIs_esDerivada(almcm_listaMatriculasConsultarMatriculaVo.getIs_esDerivada());
		llmcm_listaMatriculasConsultarMatriculaWsDto
				.setIs_numPredial(almcm_listaMatriculasConsultarMatriculaVo.getIs_numPredial());

		return llmcm_listaMatriculasConsultarMatriculaWsDto;
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
	 * Especificamente convierte <b>de</b> una ListaMatriculasConsultarMatriculaVO
	 * <b>a</b> una ListaMatriculasConsultarMatriculaWSDTO, <br>
	 * En otras palabras, <b>de</b> una Lista matriculas consultar matricula objeto
	 * con valores de servicio <b>a</b> una Lista matriculas consultar matricula web
	 * service dto.
	 *
	 * @param allmcm_listaMatriculasConsultarMatriculaVo el parametro lista
	 *                                                   matriculas consultar
	 *                                                   matricula vo
	 * @return Resultado para convertir de lista de valores de servicio a lista de
	 *         web service dto, retornado como una lista de
	 *         ListaMatriculasConsultarMatriculaWSDTO
	 */
	public static List<ListaMatriculasConsultarMatriculaWSDTO> listaVOAListaWsDto(
			List<ListaMatriculasConsultarMatriculaVO> allmcm_listaMatriculasConsultarMatriculaVo) {
		List<ListaMatriculasConsultarMatriculaWSDTO> lllmcm_listaMatriculasConsultarMatriculaWsDto = new ArrayList<>();
		for (ListaMatriculasConsultarMatriculaVO llmcm_listaMatriculasConsultarMatriculaVo : allmcm_listaMatriculasConsultarMatriculaVo) {
			lllmcm_listaMatriculasConsultarMatriculaWsDto.add(voAWsDto(llmcm_listaMatriculasConsultarMatriculaVo));
		}
		return lllmcm_listaMatriculasConsultarMatriculaWsDto;
	}

}
