/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ListaConsultarMatriculaInfoCatastralWsDtoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: ListaConsultarMatriculaInfoCatastralWsDtoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.ListaMatriculasConsultarMatriculaInfoCatastralVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.ListaMatriculasConsultarMatriculaInfoCatastralWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Lista consultar
 * matricula info catastral ws dto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ListaConsultarMatriculaInfoCatastralWsDtoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ListaConsultarMatriculaInfoCatastralWsDtoConverter.
	 */
	private ListaConsultarMatriculaInfoCatastralWsDtoConverter() {
		// Constructor vacio de la clase
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b>
	 * ListaMatriculasConsultarMatriculaInfoCatastralVO <b>a</b>
	 * ListaMatriculasConsultarMatriculaInfoCatastralWSDTO, <br>
	 * En otras palabras, <b>de</b> Lista matriculas consultar matricula info
	 * catastral objeto con valores de servicio <b>a</b> Lista matriculas consultar
	 * matricula info catastral web service dto.
	 *
	 * @param almcmic_listaMatriculasConsultarMatriculaInfoCatastralVo el parametro
	 *                                                                 lista
	 *                                                                 matriculas
	 *                                                                 consultar
	 *                                                                 matricula
	 *                                                                 info
	 *                                                                 catastral vo
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como
	 *         ListaMatriculasConsultarMatriculaInfoCatastralWSDTO
	 */
	public static ListaMatriculasConsultarMatriculaInfoCatastralWSDTO voWsDto(
			ListaMatriculasConsultarMatriculaInfoCatastralVO almcmic_listaMatriculasConsultarMatriculaInfoCatastralVo) {

		ListaMatriculasConsultarMatriculaInfoCatastralWSDTO llmcmic_listaMatriculasConsultarMatriculaInfoCatastralWsDto = new ListaMatriculasConsultarMatriculaInfoCatastralWSDTO();
		llmcmic_listaMatriculasConsultarMatriculaInfoCatastralWsDto.setIi_numMatriculaInmobiliaria(
				almcmic_listaMatriculasConsultarMatriculaInfoCatastralVo.getIi_numMatriculaInmobiliaria());
		llmcmic_listaMatriculasConsultarMatriculaInfoCatastralWsDto.setIs_codCirculoRegistral(
				almcmic_listaMatriculasConsultarMatriculaInfoCatastralVo.getIs_codCirculoRegistral());
		llmcmic_listaMatriculasConsultarMatriculaInfoCatastralWsDto
				.setIs_esDerivada(almcmic_listaMatriculasConsultarMatriculaInfoCatastralVo.getIs_esDerivada());
		llmcmic_listaMatriculasConsultarMatriculaInfoCatastralWsDto
				.setIs_numPredial(almcmic_listaMatriculasConsultarMatriculaInfoCatastralVo.getIs_numPredial());
		return llmcmic_listaMatriculasConsultarMatriculaInfoCatastralWsDto;
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
	 * ListaMatriculasConsultarMatriculaInfoCatastralVO <b>a</b> una
	 * ListaMatriculasConsultarMatriculaInfoCatastralWSDTO, <br>
	 * En otras palabras, <b>de</b> una Lista matriculas consultar matricula info
	 * catastral objeto con valores de servicio <b>a</b> una Lista matriculas
	 * consultar matricula info catastral web service dto.
	 *
	 * @param allmcmic_listaMatriculasConsultarMatriculaInfoCatastralVo el parametro
	 *                                                                  lista
	 *                                                                  matriculas
	 *                                                                  consultar
	 *                                                                  matricula
	 *                                                                  info
	 *                                                                  catastral vo
	 * @return Resultado para convertir de lista de valores de servicio a lista de
	 *         web service dto, retornado como una lista de
	 *         ListaMatriculasConsultarMatriculaInfoCatastralWSDTO
	 */
	public static List<ListaMatriculasConsultarMatriculaInfoCatastralWSDTO> listaVoAListaWsDtolis(
			List<ListaMatriculasConsultarMatriculaInfoCatastralVO> allmcmic_listaMatriculasConsultarMatriculaInfoCatastralVo) {
		List<ListaMatriculasConsultarMatriculaInfoCatastralWSDTO> lllmcmic_listaMatriculasConsultarMatriculaInfoCatastralWsDto = new ArrayList<>();
		for (ListaMatriculasConsultarMatriculaInfoCatastralVO llmcmic_listaMatriculasConsultarMatriculaInfoCatastralVo : allmcmic_listaMatriculasConsultarMatriculaInfoCatastralVo) {
			lllmcmic_listaMatriculasConsultarMatriculaInfoCatastralWsDto
					.add(voWsDto(llmcmic_listaMatriculasConsultarMatriculaInfoCatastralVo));
		}
		return lllmcmic_listaMatriculasConsultarMatriculaInfoCatastralWsDto;
	}
}
