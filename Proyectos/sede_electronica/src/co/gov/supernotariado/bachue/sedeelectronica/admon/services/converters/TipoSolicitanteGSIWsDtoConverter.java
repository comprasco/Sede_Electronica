/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TipoSolicitanteGSIWsDtoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: TipoSolicitanteGSIWsDtoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.vo.generacionsolicitud.TipoSolicitanteGSIVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSolicitanteGSIWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Tipo solicitante
 * GSI ws dto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoSolicitanteGSIWsDtoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * TipoSolicitanteGSIWsDtoConverter.
	 */
	private TipoSolicitanteGSIWsDtoConverter() {
		// Constructor vacio de la clase
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSolicitanteGSIVO <b>a</b>
	 * TipoSolicitanteGSIWSDTO, <br>
	 * En otras palabras, <b>de</b> Tipo solicitante GSIVO <b>a</b> Tipo solicitante
	 * GSIWSDTO.
	 *
	 * @param ats_tipoSolicitante el parametro tipo solicitante
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como TipoSolicitanteGSIWSDTO
	 */
	public static TipoSolicitanteGSIWSDTO voAWsdto(TipoSolicitanteGSIVO ats_tipoSolicitante) {

		TipoSolicitanteGSIWSDTO lts_tipoSolicitante = new TipoSolicitanteGSIWSDTO();

		lts_tipoSolicitante.setIs_numeroDocumento(ats_tipoSolicitante.getIs_numeroDocumento());
		lts_tipoSolicitante.setIs_tipoDocumento(ats_tipoSolicitante.getIs_tipoDocumento());
		lts_tipoSolicitante.setIs_tipoPersona(ats_tipoSolicitante.getIs_tipoPersona());

		return lts_tipoSolicitante;
	}

	/**
	 * Metodo que convierte de WSDTO a VO ( De Objeto de Transferencia de Datos de
	 * Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto WSDTO manipulado en la capa de negocio, en
	 * una entrada de datos para consumir una operacion de un servicio(objeto VO).
	 * <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSolicitanteGSIWSDTO <b>a</b>
	 * TipoSolicitanteGSIVO, <br>
	 * En otras palabras, <b>de</b> Tipo solicitante GSIWSDTO <b>a</b> Tipo
	 * solicitante GSIVO.
	 *
	 * @param ats_tipoSolicitanteDto el parametro tipo solicitante dto
	 * @return Resultado para convertir web service dto a objeto de valores de
	 *         servicio, retornado como TipoSolicitanteGSIVO
	 */
	public static TipoSolicitanteGSIVO wsdtoAVo(TipoSolicitanteGSIWSDTO ats_tipoSolicitanteDto) {

		TipoSolicitanteGSIVO lts_tipoSolicitante = new TipoSolicitanteGSIVO();

		lts_tipoSolicitante.setIs_numeroDocumento(ats_tipoSolicitanteDto.getIs_numeroDocumento());
		lts_tipoSolicitante.setIs_tipoDocumento(ats_tipoSolicitanteDto.getIs_tipoDocumento());
		lts_tipoSolicitante.setIs_tipoPersona(ats_tipoSolicitanteDto.getIs_tipoPersona());

		return lts_tipoSolicitante;
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
	 * Especificamente convierte <b>de</b> una TipoSolicitanteGSIVO <b>a</b> una
	 * TipoSolicitanteGSIWSDTO, <br>
	 * En otras palabras, <b>de</b> una Tipo solicitante GSIVO <b>a</b> una Tipo
	 * solicitante GSIWSDTO.
	 *
	 * @param alts_listaTipoSolicitanteVo el parametro lista tipo solicitante vo
	 * @return Resultado para convertir de lista de valores de servicio a lista de
	 *         web service dto, retornado como una lista de TipoSolicitanteGSIWSDTO
	 */
	public static List<TipoSolicitanteGSIWSDTO> listaVoAListaWsdto(
			List<TipoSolicitanteGSIVO> alts_listaTipoSolicitanteVo) {

		List<TipoSolicitanteGSIWSDTO> llts_tipoSolicitanteWsDto = new ArrayList<>();

		for (TipoSolicitanteGSIVO ltsg_solicitud : alts_listaTipoSolicitanteVo)
			llts_tipoSolicitanteWsDto.add(voAWsdto(ltsg_solicitud));

		return llts_tipoSolicitanteWsDto;
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
	 * Especificamente convierte <b>de</b> TipoSolicitanteGSIWSDTO <b>a</b>
	 * TipoSolicitanteGSIVO, <br>
	 * En otras palabras, <b>de</b> Tipo solicitante GSIWSDTO <b>a</b> Tipo
	 * solicitante GSIVO.
	 *
	 * @param alts_listaTipoSolicitanteDto el parametro lista tipo solicitante dto
	 * @return Resultado para convertir de lista de web service dto a lista de
	 *         valores de servicio, retornado como una lista de TipoSolicitanteGSIVO
	 */
	public static List<TipoSolicitanteGSIVO> listaWsdtoAListaVo(
			List<TipoSolicitanteGSIWSDTO> alts_listaTipoSolicitanteDto) {

		List<TipoSolicitanteGSIVO> llts_tipoSolicitante = new ArrayList<>();

		for (TipoSolicitanteGSIWSDTO ltsgw_solicitud : alts_listaTipoSolicitanteDto)
			llts_tipoSolicitante.add(wsdtoAVo(ltsgw_solicitud));

		return llts_tipoSolicitante;
	}
}
