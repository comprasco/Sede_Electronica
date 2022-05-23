/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ListaMatriculasSalidaWsDtoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: ListaMatriculasSalidaWsDtoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.ListaMatriculasConsultarListaMatriculasVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.ListaMatriculasSalidaWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Lista matriculas
 * salida ws dto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ListaMatriculasSalidaWsDtoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ListaMatriculasSalidaWsDtoConverter.
	 */
	private ListaMatriculasSalidaWsDtoConverter() {
		// Constructor vacio de la clase
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> ListaMatriculasConsultarListaMatriculasVO
	 * <b>a</b> ListaMatriculasSalidaWSDTO, <br>
	 * En otras palabras, <b>de</b> Lista matriculas consultar lista matriculas
	 * objeto con valores de servicio <b>a</b> Lista matriculas salida web service
	 * dto.
	 *
	 * @param almclm_listaMatriculasConsultarListaMatriculaVo el parametro lista
	 *                                                        matriculas consultar
	 *                                                        lista matricula vo
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como ListaMatriculasSalidaWSDTO
	 */
	public static ListaMatriculasSalidaWSDTO voAWsDto(
			ListaMatriculasConsultarListaMatriculasVO almclm_listaMatriculasConsultarListaMatriculaVo) {

		ListaMatriculasSalidaWSDTO llms_listaMatriculasSalidaWsDto = new ListaMatriculasSalidaWSDTO();
		llms_listaMatriculasSalidaWsDto
				.setIs_codCirculoRegistral(almclm_listaMatriculasConsultarListaMatriculaVo.getIs_codCirculoRegistral());
		llms_listaMatriculasSalidaWsDto.setIs_numMatriculaInmobiliaria(
				almclm_listaMatriculasConsultarListaMatriculaVo.getIi_numMatriculaInmobiliaria());
		llms_listaMatriculasSalidaWsDto
				.setIi_esDerivada(almclm_listaMatriculasConsultarListaMatriculaVo.getIs_esDerivada());
		llms_listaMatriculasSalidaWsDto
				.setIs_numPredial(almclm_listaMatriculasConsultarListaMatriculaVo.getIs_numPredial());

		return llms_listaMatriculasSalidaWsDto;
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
	 * ListaMatriculasConsultarListaMatriculasVO <b>a</b> una
	 * ListaMatriculasSalidaWSDTO, <br>
	 * En otras palabras, <b>de</b> una Lista matriculas consultar lista matriculas
	 * objeto con valores de servicio <b>a</b> una Lista matriculas salida web
	 * service dto.
	 *
	 * @param allmclm_listaMatriculasConsultarListaMatriculaVo el parametro lista
	 *                                                         matriculas consultar
	 *                                                         lista matricula vo
	 * @return Resultado para convertir de lista de valores de servicio a lista de
	 *         web service dto, retornado como una lista de
	 *         ListaMatriculasSalidaWSDTO
	 */
	public static List<ListaMatriculasSalidaWSDTO> listaVOAListaWsDto(
			List<ListaMatriculasConsultarListaMatriculasVO> allmclm_listaMatriculasConsultarListaMatriculaVo) {
		List<ListaMatriculasSalidaWSDTO> lllms_listaMatriculasSalidaWsDto = new ArrayList<>();
		for (ListaMatriculasConsultarListaMatriculasVO llmclm_listaMatriculasConsultarListaMatriculaVo : allmclm_listaMatriculasConsultarListaMatriculaVo) {
			lllms_listaMatriculasSalidaWsDto.add(voAWsDto(llmclm_listaMatriculasConsultarListaMatriculaVo));
		}
		return lllms_listaMatriculasSalidaWsDto;
	}

}
