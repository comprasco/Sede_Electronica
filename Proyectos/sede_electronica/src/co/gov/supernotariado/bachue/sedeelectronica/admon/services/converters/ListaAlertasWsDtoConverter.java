/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ListaAlertasWsDtoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: ListaAlertasWsDtoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.ListaAlertasVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.ListaAlertasWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Lista alertas ws
 * dto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ListaAlertasWsDtoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase ListaAlertasWsDtoConverter.
	 */
	private ListaAlertasWsDtoConverter() {
		// Constructor vacio de la clase
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> ListaAlertasVO <b>a</b>
	 * ListaAlertasWSDTO, <br>
	 * En otras palabras, <b>de</b> Lista alertas objeto con valores de servicio
	 * <b>a</b> Lista alertas web service dto.
	 *
	 * @param ala_listaAlertasVo el parametro lista alertas vo
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como ListaAlertasWSDTO
	 */
	public static ListaAlertasWSDTO voAWsDto(ListaAlertasVO ala_listaAlertasVo) {
		ListaAlertasWSDTO lla_listaAlertasWsDto = new ListaAlertasWSDTO();
		lla_listaAlertasWsDto.setId_fechaInscripcion(ala_listaAlertasVo.getId_fechaInscripcion());
		lla_listaAlertasWsDto.setIi_idAlerta(ala_listaAlertasVo.getIi_idAlerta());
		lla_listaAlertasWsDto.setIs_codTipoDocumentoPublico(ala_listaAlertasVo.getIs_codTipoDocumentoPublico());
		lla_listaAlertasWsDto.setIs_estadoAlerta(ala_listaAlertasVo.getIs_estadoAlerta());
		lla_listaAlertasWsDto.setIs_nombreComunidadEtnica(ala_listaAlertasVo.getIs_nombreComunidadEtnica());
		lla_listaAlertasWsDto.setIs_nombreEntidad(ala_listaAlertasVo.getIs_nombreEntidad());
		return lla_listaAlertasWsDto;
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
	 * Especificamente convierte <b>de</b> una ListaAlertasVO <b>a</b> una
	 * ListaAlertasWSDTO, <br>
	 * En otras palabras, <b>de</b> una Lista alertas objeto con valores de servicio
	 * <b>a</b> una Lista alertas web service dto.
	 *
	 * @param alla_listaAlertasVo el parametro lista alertas vo
	 * @return Resultado para convertir de lista de valores de servicio a lista de
	 *         web service dto, retornado como una lista de ListaAlertasWSDTO
	 */
	public static List<ListaAlertasWSDTO> listaVOAListaWsDto(List<ListaAlertasVO> alla_listaAlertasVo) {
		List<ListaAlertasWSDTO> llla_listaAlertasWsDto = new ArrayList<>();
		for (ListaAlertasVO lla_listaAlertasWsDto : alla_listaAlertasVo) {
			llla_listaAlertasWsDto.add(voAWsDto(lla_listaAlertasWsDto));
		}
		return llla_listaAlertasWsDto;
	}
}
