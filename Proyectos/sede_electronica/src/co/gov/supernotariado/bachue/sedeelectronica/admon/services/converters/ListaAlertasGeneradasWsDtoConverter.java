/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ListaAlertasGeneradasWsDtoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: ListaAlertasGeneradasWsDtoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.ListaAlertasGeneradasVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.ListaAlertasGeneradasWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Lista alertas
 * generadas ws dto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ListaAlertasGeneradasWsDtoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ListaAlertasGeneradasWsDtoConverter.
	 */
	private ListaAlertasGeneradasWsDtoConverter() {
		// Constructor vacio de la clase
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> ListaAlertasGeneradasVO <b>a</b>
	 * ListaAlertasGeneradasWSDTO, <br>
	 * En otras palabras, <b>de</b> Lista alertas generadas objeto con valores de
	 * servicio <b>a</b> Lista alertas generadas web service dto.
	 *
	 * @param alag_listaAlertasGeneradasVo el parametro lista alertas generadas vo
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como ListaAlertasGeneradasWSDTO
	 */
	public static ListaAlertasGeneradasWSDTO voAWsDto(ListaAlertasGeneradasVO alag_listaAlertasGeneradasVo) {
		ListaAlertasGeneradasWSDTO llag_listaAlertasGeneradasWsDto = new ListaAlertasGeneradasWSDTO();
		llag_listaAlertasGeneradasWsDto
				.setIi_numMatriculaInmobiliaria(alag_listaAlertasGeneradasVo.getIi_numMatriculaInmobiliaria());
		llag_listaAlertasGeneradasWsDto
				.setIs_nomCirculoRegistral(alag_listaAlertasGeneradasVo.getIs_nomCirculoRegistral());
		llag_listaAlertasGeneradasWsDto.setIs_texto(alag_listaAlertasGeneradasVo.getIs_texto());
		llag_listaAlertasGeneradasWsDto.setIs_turno(alag_listaAlertasGeneradasVo.getIs_turno());
		llag_listaAlertasGeneradasWsDto.setIs_usuarioGenerador(alag_listaAlertasGeneradasVo.getIs_usuarioGenerador());
		return llag_listaAlertasGeneradasWsDto;
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
	 * Especificamente convierte <b>de</b> una ListaAlertasGeneradasVO <b>a</b> una
	 * ListaAlertasGeneradasWSDTO, <br>
	 * En otras palabras, <b>de</b> una Lista alertas generadas objeto con valores
	 * de servicio <b>a</b> una Lista alertas generadas web service dto.
	 *
	 * @param allag_listaAlertasGeneradasVo el parametro lista alertas generadas vo
	 * @return Resultado para convertir de lista de valores de servicio a lista de
	 *         web service dto, retornado como una lista de
	 *         ListaAlertasGeneradasWSDTO
	 */
	public static List<ListaAlertasGeneradasWSDTO> listaVOAListaWsDto(
			List<ListaAlertasGeneradasVO> allag_listaAlertasGeneradasVo) {
		List<ListaAlertasGeneradasWSDTO> lllag_listaAlertasGeneradasWsDto = new ArrayList<>();
		for (ListaAlertasGeneradasVO llag_listaAlertasGeneradasVo : allag_listaAlertasGeneradasVo) {
			lllag_listaAlertasGeneradasWsDto.add(voAWsDto(llag_listaAlertasGeneradasVo));
		}
		return lllag_listaAlertasGeneradasWsDto;
	}
}
