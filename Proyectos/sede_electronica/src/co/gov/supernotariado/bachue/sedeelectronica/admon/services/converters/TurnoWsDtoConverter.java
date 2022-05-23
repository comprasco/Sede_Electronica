/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TurnoWsDtoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: TurnoWsDtoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.vo.entregaproducto.TurnoVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TurnoWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Turno ws dto.
 * <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TurnoWsDtoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase TurnoWsDtoConverter.
	 */
	private TurnoWsDtoConverter() {
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
	 * Especificamente convierte <b>de</b> una TurnoVO <b>a</b> una TurnoWSDTO, <br>
	 * En otras palabras, <b>de</b> una Turno objeto con valores de servicio
	 * <b>a</b> una Turno web service dto.
	 *
	 * @param alt_listaTurnoVo el parametro lista turno vo
	 * @return Resultado para convertir de lista de valores de servicio a lista de
	 *         web service dto, retornado como una lista de TurnoWSDTO
	 */
	public static List<TurnoWSDTO> listaEntidadAListaVo(List<TurnoVO> alt_listaTurnoVo) {

		List<TurnoWSDTO> llt_turnoWsDto = new ArrayList<>();
		for (TurnoVO lt_turnoVo : alt_listaTurnoVo)
			llt_turnoWsDto.add(entidadAVo(lt_turnoVo));

		return llt_turnoWsDto;
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TurnoVO <b>a</b> TurnoWSDTO, <br>
	 * En otras palabras, <b>de</b> Turno objeto con valores de servicio <b>a</b>
	 * Turno web service dto.
	 *
	 * @param at_turnoVo el parametro turno vo
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como TurnoWSDTO
	 */
	public static TurnoWSDTO entidadAVo(TurnoVO at_turnoVo) {
		TurnoWSDTO lt_turnoWsDto = new TurnoWSDTO();
		lt_turnoWsDto.setIs_identificadorTurno(at_turnoVo.getIs_identificadorTurno());
		return lt_turnoWsDto;
	}
}
