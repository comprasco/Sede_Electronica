/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ListaMatriculasConsultarMatriculaFiltrosTierrasWsDtoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: ListaMatriculasConsultarMatriculaFiltrosTierrasWsDtoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.ListaMatriculasConsultarMatriculaFiltrosTierrasVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.ListaMatriculasConsultarMatriculaFiltrosTierrasWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Lista matriculas
 * consultar matricula filtros tierras ws dto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ListaMatriculasConsultarMatriculaFiltrosTierrasWsDtoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ListaMatriculasConsultarMatriculaFiltrosTierrasWsDtoConverter.
	 */
	private ListaMatriculasConsultarMatriculaFiltrosTierrasWsDtoConverter() {
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
	 * ListaMatriculasConsultarMatriculaFiltrosTierrasVO <b>a</b>
	 * ListaMatriculasConsultarMatriculaFiltrosTierrasWSDTO, <br>
	 * En otras palabras, <b>de</b> Lista matriculas consultar matricula filtros
	 * tierras objeto con valores de servicio <b>a</b> Lista matriculas consultar
	 * matricula filtros tierras web service dto.
	 *
	 * @param almcmft_listaMatriculasConsultarMatriculaFiltrosTierrasVo el parametro
	 *                                                                  lista
	 *                                                                  matriculas
	 *                                                                  consultar
	 *                                                                  matricula
	 *                                                                  filtros
	 *                                                                  tierras vo
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como
	 *         ListaMatriculasConsultarMatriculaFiltrosTierrasWSDTO
	 */
	public static ListaMatriculasConsultarMatriculaFiltrosTierrasWSDTO voWsDto(
			ListaMatriculasConsultarMatriculaFiltrosTierrasVO almcmft_listaMatriculasConsultarMatriculaFiltrosTierrasVo) {
		ListaMatriculasConsultarMatriculaFiltrosTierrasWSDTO llmcmft_listaMatriculasConsultarMatriculaFiltrosTierrasWsDto = new ListaMatriculasConsultarMatriculaFiltrosTierrasWSDTO();
		llmcmft_listaMatriculasConsultarMatriculaFiltrosTierrasWsDto.setIi_numMatriculaInmobiliaria(
				almcmft_listaMatriculasConsultarMatriculaFiltrosTierrasVo.getIi_numMatriculaInmobiliaria());
		llmcmft_listaMatriculasConsultarMatriculaFiltrosTierrasWsDto.setIs_codCirculoRegistral(
				almcmft_listaMatriculasConsultarMatriculaFiltrosTierrasVo.getIs_codCirculoRegistral());
		llmcmft_listaMatriculasConsultarMatriculaFiltrosTierrasWsDto
				.setIs_esDerivada(almcmft_listaMatriculasConsultarMatriculaFiltrosTierrasVo.getIs_numPredial());
		llmcmft_listaMatriculasConsultarMatriculaFiltrosTierrasWsDto
				.setIs_numPredial(almcmft_listaMatriculasConsultarMatriculaFiltrosTierrasVo.getIs_numPredial());
		return llmcmft_listaMatriculasConsultarMatriculaFiltrosTierrasWsDto;
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
	 * ListaMatriculasConsultarMatriculaFiltrosTierrasVO <b>a</b> una
	 * ListaMatriculasConsultarMatriculaFiltrosTierrasWSDTO, <br>
	 * En otras palabras, <b>de</b> una Lista matriculas consultar matricula filtros
	 * tierras objeto con valores de servicio <b>a</b> una Lista matriculas
	 * consultar matricula filtros tierras web service dto.
	 *
	 * @param allmcmft_listaMatriculasConsultarMatriculaFiltrosTierrasVo el
	 *                                                                   parametro
	 *                                                                   lista
	 *                                                                   matriculas
	 *                                                                   consultar
	 *                                                                   matricula
	 *                                                                   filtros
	 *                                                                   tierras vo
	 * @return Resultado para convertir de lista de valores de servicio a lista de
	 *         web service dto, retornado como una lista de
	 *         ListaMatriculasConsultarMatriculaFiltrosTierrasWSDTO
	 */
	public static List<ListaMatriculasConsultarMatriculaFiltrosTierrasWSDTO> listaVoAListaWsDtolis(
			List<ListaMatriculasConsultarMatriculaFiltrosTierrasVO> allmcmft_listaMatriculasConsultarMatriculaFiltrosTierrasVo) {
		List<ListaMatriculasConsultarMatriculaFiltrosTierrasWSDTO> lllmcmft_listaMatriculasConsultarMatriculaFiltrosTierrasWsDto = new ArrayList<>();
		for (ListaMatriculasConsultarMatriculaFiltrosTierrasVO llmcmft_listaMatriculasConsultarMatriculaFiltrosTierrasVo : allmcmft_listaMatriculasConsultarMatriculaFiltrosTierrasVo) {
			lllmcmft_listaMatriculasConsultarMatriculaFiltrosTierrasWsDto
					.add(voWsDto(llmcmft_listaMatriculasConsultarMatriculaFiltrosTierrasVo));
		}
		return lllmcmft_listaMatriculasConsultarMatriculaFiltrosTierrasWsDto;
	}
}
