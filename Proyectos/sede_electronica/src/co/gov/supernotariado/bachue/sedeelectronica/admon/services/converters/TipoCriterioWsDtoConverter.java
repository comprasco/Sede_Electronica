/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TipoCriterioWsDtoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: TipoCriterioWsDtoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.vo.generacionsolicitud.TipoCriterioVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoCriterioWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Tipo criterio ws
 * dto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoCriterioWsDtoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase TipoCriterioWsDtoConverter.
	 */
	private TipoCriterioWsDtoConverter() {
		// Constructor vacio de la clase
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoCriterioVO <b>a</b>
	 * TipoCriterioWSDTO, <br>
	 * En otras palabras, <b>de</b> Tipo criterio objeto con valores de servicio
	 * <b>a</b> Tipo criterio web service dto.
	 *
	 * @param atc_tipoCriterio el parametro tipo criterio
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como TipoCriterioWSDTO
	 */
	public static TipoCriterioWSDTO voAWsdto(TipoCriterioVO atc_tipoCriterio) {

		TipoCriterioWSDTO ltc_tipoCriterioDto = new TipoCriterioWSDTO();

		ltc_tipoCriterioDto.setIs_codigo(atc_tipoCriterio.getIs_codigo());
		ltc_tipoCriterioDto.setIs_valor(atc_tipoCriterio.getIs_valor());

		return ltc_tipoCriterioDto;
	}

	/**
	 * Metodo que convierte de WSDTO a VO ( De Objeto de Transferencia de Datos de
	 * Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto WSDTO manipulado en la capa de negocio, en
	 * una entrada de datos para consumir una operacion de un servicio(objeto VO).
	 * <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoCriterioWSDTO <b>a</b>
	 * TipoCriterioVO, <br>
	 * En otras palabras, <b>de</b> Tipo criterio web service dto <b>a</b> Tipo
	 * criterio objeto con valores de servicio.
	 *
	 * @param atc_tipoCriterioDto el parametro tipo criterio dto
	 * @return Resultado para convertir web service dto a objeto de valores de
	 *         servicio, retornado como TipoCriterioVO
	 */
	public static TipoCriterioVO wsdtoAVo(TipoCriterioWSDTO atc_tipoCriterioDto) {

		TipoCriterioVO ltc_tipoCriterio = new TipoCriterioVO();

		ltc_tipoCriterio.setIs_codigo(atc_tipoCriterioDto.getIs_codigo());
		ltc_tipoCriterio.setIs_valor(atc_tipoCriterioDto.getIs_valor());

		return ltc_tipoCriterio;
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
	 * Especificamente convierte <b>de</b> una TipoCriterioVO <b>a</b> una
	 * TipoCriterioWSDTO, <br>
	 * En otras palabras, <b>de</b> una Tipo criterio objeto con valores de servicio
	 * <b>a</b> una Tipo criterio web service dto.
	 *
	 * @param altc_listaTipoCriterioVo el parametro lista tipo criterio vo
	 * @return Resultado para convertir de lista de valores de servicio a lista de
	 *         web service dto, retornado como una lista de TipoCriterioWSDTO
	 */
	public static List<TipoCriterioWSDTO> listaVoAListaWsdto(List<TipoCriterioVO> altc_listaTipoCriterioVo) {

		List<TipoCriterioWSDTO> lltc_tipoCriterioWsDto = new ArrayList<>();

		for (TipoCriterioVO ls_solicitud : altc_listaTipoCriterioVo)
			lltc_tipoCriterioWsDto.add(voAWsdto(ls_solicitud));

		return lltc_tipoCriterioWsDto;
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
	 * Especificamente convierte <b>de</b> TipoCriterioWSDTO <b>a</b>
	 * TipoCriterioVO, <br>
	 * En otras palabras, <b>de</b> Tipo criterio web service dto <b>a</b> Tipo
	 * criterio objeto con valores de servicio.
	 *
	 * @param altc_listaTipoCriterioDto el parametro lista tipo criterio dto
	 * @return Resultado para convertir de lista de web service dto a lista de
	 *         valores de servicio, retornado como una lista de TipoCriterioVO
	 */
	public static List<TipoCriterioVO> listaWsdtoAListaVo(List<TipoCriterioWSDTO> altc_listaTipoCriterioDto) {

		List<TipoCriterioVO> lltc_tipoCriterio = new ArrayList<>();

		for (TipoCriterioWSDTO ls_solicitud : altc_listaTipoCriterioDto)
			lltc_tipoCriterio.add(wsdtoAVo(ls_solicitud));

		return lltc_tipoCriterio;
	}
}
