/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ListaAutoridadesJAWsDtoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: ListaAutoridadesJAWsDtoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.ListaAutoridadesJAVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.ListaAutoridadesJAWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Lista
 * autoridades JA ws dto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ListaAutoridadesJAWsDtoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ListaAutoridadesJAWsDtoConverter.
	 */
	private ListaAutoridadesJAWsDtoConverter() {
		// Constructor vacio de la clase
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> ListaAutoridadesJAVO <b>a</b>
	 * ListaAutoridadesJAWSDTO, <br>
	 * En otras palabras, <b>de</b> Lista autoridades JAVO <b>a</b> Lista
	 * autoridades JAWSDTO.
	 *
	 * @param alaja_listaAutoridadesJA el parametro lista autoridades JA
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como ListaAutoridadesJAWSDTO
	 */
	public static ListaAutoridadesJAWSDTO voAWsDto(ListaAutoridadesJAVO alaja_listaAutoridadesJA) {

		ListaAutoridadesJAWSDTO llaja_listaAutoridadesJAWsDto = new ListaAutoridadesJAWSDTO();
		llaja_listaAutoridadesJAWsDto.setIs_codigoAutoridad(alaja_listaAutoridadesJA.getIs_codigoAutoridad());
		llaja_listaAutoridadesJAWsDto
				.setIs_esAgenciaNacionalTierras(alaja_listaAutoridadesJA.getIs_esAgenciaNacionalTierras());
		llaja_listaAutoridadesJAWsDto.setIs_nombreAutoridad(alaja_listaAutoridadesJA.getIs_nombreAutoridad());
		return llaja_listaAutoridadesJAWsDto;
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
	 * Especificamente convierte <b>de</b> una ListaAutoridadesJAVO <b>a</b> una
	 * ListaAutoridadesJAWSDTO, <br>
	 * En otras palabras, <b>de</b> una Lista autoridades JAVO <b>a</b> una Lista
	 * autoridades JAWSDTO.
	 *
	 * @param allaja_listaAutoridadesJA el parametro lista autoridades JA
	 * @return Resultado para convertir de lista de valores de servicio a lista de
	 *         web service dto, retornado como una lista de ListaAutoridadesJAWSDTO
	 */
	public static List<ListaAutoridadesJAWSDTO> listaVOAListaWsDto(
			List<ListaAutoridadesJAVO> allaja_listaAutoridadesJA) {
		List<ListaAutoridadesJAWSDTO> lllaja_listaAutoridadesJAWsDto = new ArrayList<>();
		for (ListaAutoridadesJAVO llaja_documento : allaja_listaAutoridadesJA) {
			lllaja_listaAutoridadesJAWsDto.add(voAWsDto(llaja_documento));
		}
		return lllaja_listaAutoridadesJAWsDto;
	}

}
