/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ListaMatriculasWsDtoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: ListaMatriculasWsDtoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.ListaMatriculaConsultarListaMatriculasVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.ListaMatriculasWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Lista matriculas
 * ws dto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ListaMatriculasWsDtoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ListaMatriculasWsDtoConverter.
	 */
	private ListaMatriculasWsDtoConverter() {
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
	 * Especificamente convierte <b>de</b> ListaMatriculasWSDTO <b>a</b>
	 * ListaMatriculaConsultarListaMatriculasVO, <br>
	 * En otras palabras, <b>de</b> Lista matriculas web service dto <b>a</b> Lista
	 * matricula consultar lista matriculas objeto con valores de servicio.
	 *
	 * @param alm_listaMatriculasWsDto el parametro lista matriculas ws dto
	 * @return Resultado para convertir web service dto a objeto de valores de
	 *         servicio, retornado como ListaMatriculaConsultarListaMatriculasVO
	 */
	public static ListaMatriculaConsultarListaMatriculasVO wsDtoAVo(ListaMatriculasWSDTO alm_listaMatriculasWsDto) {

		ListaMatriculaConsultarListaMatriculasVO llmclm_listaMatriculaConsultarListaMatriculasVOVo = new ListaMatriculaConsultarListaMatriculasVO();
		llmclm_listaMatriculaConsultarListaMatriculasVOVo
				.setIi_numMatriculaInmobiliaria(alm_listaMatriculasWsDto.getIi_numMatriculaInmobiliaria());
		llmclm_listaMatriculaConsultarListaMatriculasVOVo
				.setIs_codCirculoRegistral(alm_listaMatriculasWsDto.getIs_codCirculoRegistral());
		return llmclm_listaMatriculaConsultarListaMatriculasVOVo;
	}

	/**
	 * Metodo que convierte de una lista de WSDTO a una lista de VO ( De Objetos de
	 * Transferencia de Datos de Servicio Web, a Objetos de valores de
	 * Servicio).<br>
	 * Se usa para convertir una lista de objetos WSDTO manipulados en la capa de
	 * negocio, en una lista de entrada de datos para consumir una operacion de un
	 * servicio(objetos VO). <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> ListaMatriculasWSDTO <b>a</b>
	 * ListaMatriculaConsultarListaMatriculasVO, <br>
	 * En otras palabras, <b>de</b> Lista matriculas web service dto <b>a</b> Lista
	 * matricula consultar lista matriculas objeto con valores de servicio.
	 *
	 * @param allm_listaMatriculasWsDto el parametro lista matriculas ws dto
	 * @return Resultado para convertir de lista de web service dto a lista de
	 *         valores de servicio, retornado como una lista de
	 *         ListaMatriculaConsultarListaMatriculasVO
	 */
	public static List<ListaMatriculaConsultarListaMatriculasVO> listaVoAListaWsdto(
			List<ListaMatriculasWSDTO> allm_listaMatriculasWsDto) {

		List<ListaMatriculaConsultarListaMatriculasVO> lllmclm_listaMatriculaConsultarListaMatriculasVo = new ArrayList<>();

		for (ListaMatriculasWSDTO llm_listaMatriculasWsDto : allm_listaMatriculasWsDto)
			lllmclm_listaMatriculaConsultarListaMatriculasVo.add(wsDtoAVo(llm_listaMatriculasWsDto));

		return lllmclm_listaMatriculaConsultarListaMatriculasVo;
	}

}
