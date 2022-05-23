/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TarifaWSDTOConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: TarifaWSDTOConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.vo.gestionalertastitulares.TarifaVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TarifaWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Tarifa WSDTO.
 * <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TarifaWSDTOConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase TarifaWSDTOConverter.
	 */
	private TarifaWSDTOConverter() {
		// Constructor vacio de la clase
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
	 * Especificamente convierte <b>de</b> una TarifaVO <b>a</b> una TarifaWSDTO,
	 * <br>
	 * En otras palabras, <b>de</b> una Tarifa objeto con valores de servicio
	 * <b>a</b> una Tarifa web service dto.
	 *
	 * @param alt_tarifaVo el parametro tarifa vo
	 * @return Resultado para convertir de lista de valores de servicio a lista de
	 *         web service dto, retornado como una lista de TarifaWSDTO
	 */
	public static List<TarifaWSDTO> listaEntidadAListaWsDto(List<TarifaVO> alt_tarifaVo) {

		List<TarifaWSDTO> llt_tarifaWsDto = new ArrayList<>();

		for (TarifaVO lt_tarifaVo : alt_tarifaVo)
			llt_tarifaWsDto.add(entidadAWsDto(lt_tarifaVo));

		return llt_tarifaWsDto;
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TarifaVO <b>a</b> TarifaWSDTO, <br>
	 * En otras palabras, <b>de</b> Tarifa objeto con valores de servicio <b>a</b>
	 * Tarifa web service dto.
	 *
	 * @param at_tarifaVo el parametro tarifa vo
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como TarifaWSDTO
	 */
	public static TarifaWSDTO entidadAWsDto(TarifaVO at_tarifaVo) {

		TarifaWSDTO lt_tarifaWsDto = new TarifaWSDTO();
		lt_tarifaWsDto.setIs_rango(at_tarifaVo.getIs_rango());
		lt_tarifaWsDto.setIs_valor(at_tarifaVo.getIs_valor());
		return lt_tarifaWsDto;
	}

}
