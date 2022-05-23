/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TipoServicioGSIWSDtoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: TipoServicioGSIWSDtoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.vo.generacionsolicitud.TipoServicioGSIVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoServicioGSIWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Tipo servicio
 * GSIWS dto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoServicioGSIWSDtoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * TipoServicioGSIWSDtoConverter.
	 */
	private TipoServicioGSIWSDtoConverter() {
		// Constructor vacio de la clase
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoServicioGSIVO <b>a</b>
	 * TipoServicioGSIWSDTO, <br>
	 * En otras palabras, <b>de</b> Tipo servicio GSIVO <b>a</b> Tipo servicio
	 * GSIWSDTO.
	 *
	 * @param ats_tipoServicio el parametro tipo servicio
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como TipoServicioGSIWSDTO
	 */
	public static TipoServicioGSIWSDTO voAWsdto(TipoServicioGSIVO ats_tipoServicio) {

		TipoServicioGSIWSDTO lts_tipoServicio = new TipoServicioGSIWSDTO();

		lts_tipoServicio.setIs_subTipoServicio(ats_tipoServicio.getIs_subtipoServicio());
		lts_tipoServicio.setIs_tipoServicio(ats_tipoServicio.getIs_tipoServicio());
		lts_tipoServicio.setIltc_tipoCriterio(
				TipoCriterioWsDtoConverter.listaVoAListaWsdto(ats_tipoServicio.getIltc_tipoCriterio()));

		return lts_tipoServicio;
	}

	/**
	 * Metodo que convierte de WSDTO a VO ( De Objeto de Transferencia de Datos de
	 * Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto WSDTO manipulado en la capa de negocio, en
	 * una entrada de datos para consumir una operacion de un servicio(objeto VO).
	 * <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoServicioGSIWSDTO <b>a</b>
	 * TipoServicioGSIVO, <br>
	 * En otras palabras, <b>de</b> Tipo servicio GSIWSDTO <b>a</b> Tipo servicio
	 * GSIVO.
	 *
	 * @param ats_tipoServicio el parametro tipo servicio
	 * @return Resultado para convertir web service dto a objeto de valores de
	 *         servicio, retornado como TipoServicioGSIVO
	 */
	public static TipoServicioGSIVO wsdtoAVo(TipoServicioGSIWSDTO ats_tipoServicio) {

		TipoServicioGSIVO lts_tipoServicio = new TipoServicioGSIVO();

		lts_tipoServicio.setIs_subtipoServicio(ats_tipoServicio.getIs_subTipoServicio());
		lts_tipoServicio.setIs_tipoServicio(ats_tipoServicio.getIs_tipoServicio());
		lts_tipoServicio.setIltc_tipoCriterio(
				TipoCriterioWsDtoConverter.listaWsdtoAListaVo(ats_tipoServicio.getIltc_tipoCriterio()));

		return lts_tipoServicio;
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
	 * Especificamente convierte <b>de</b> una TipoServicioGSIVO <b>a</b> una
	 * TipoServicioGSIWSDTO, <br>
	 * En otras palabras, <b>de</b> una Tipo servicio GSIVO <b>a</b> una Tipo
	 * servicio GSIWSDTO.
	 *
	 * @param alts_listaTipoServicioGSIVO el parametro lista tipo servicio GSIVO
	 * @return Resultado para convertir de lista de valores de servicio a lista de
	 *         web service dto, retornado como una lista de TipoServicioGSIWSDTO
	 */
	public static List<TipoServicioGSIWSDTO> listaVoAListaWsdto(List<TipoServicioGSIVO> alts_listaTipoServicioGSIVO) {

		List<TipoServicioGSIWSDTO> llts_tipoServicioGSIWSDTO = new ArrayList<>();

		for (TipoServicioGSIVO ltsg_solicitud : alts_listaTipoServicioGSIVO)
			llts_tipoServicioGSIWSDTO.add(voAWsdto(ltsg_solicitud));

		return llts_tipoServicioGSIWSDTO;
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
	 * Especificamente convierte <b>de</b> TipoServicioGSIWSDTO <b>a</b>
	 * TipoServicioGSIVO, <br>
	 * En otras palabras, <b>de</b> Tipo servicio GSIWSDTO <b>a</b> Tipo servicio
	 * GSIVO.
	 *
	 * @param alts_listaTipoServicioDto el parametro lista tipo servicio dto
	 * @return Resultado para convertir de lista de web service dto a lista de
	 *         valores de servicio, retornado como una lista de TipoServicioGSIVO
	 */
	public static List<TipoServicioGSIVO> listaWsdtoAListaVo(List<TipoServicioGSIWSDTO> alts_listaTipoServicioDto) {

		List<TipoServicioGSIVO> llts_tipoServicio = new ArrayList<>();

		for (TipoServicioGSIWSDTO ltsgw_solicitud : alts_listaTipoServicioDto)
			llts_tipoServicio.add(wsdtoAVo(ltsgw_solicitud));

		return llts_tipoServicio;
	}
}
