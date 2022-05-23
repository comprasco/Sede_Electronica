/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ListaMensajesWsDtoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: ListaMensajesWsDtoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.vo.historialnotificaciones.MensajeVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.ListaMensajesHitorialNotificacionesWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Lista mensajes
 * ws dto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ListaMensajesWsDtoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ListaTipoDocumentalWsDtoConverter.
	 */
	private ListaMensajesWsDtoConverter() {
		// Constructor vacio de la clase
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> MensajeVO <b>a</b>
	 * ListaMensajesHitorialNotificacionesWSDTO, <br>
	 * En otras palabras, <b>de</b> Lista oficinas origen objeto con valores de
	 * servicio <b>a</b> Lista oficinas origen web service dto.
	 *
	 * @param am_mensajeVo el parametro lista oficinas origen vo
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como ListaMensajesHitorialNotificacionesWSDTO
	 */
	public static ListaMensajesHitorialNotificacionesWSDTO voAWsDto(MensajeVO am_mensajeVo) {
		ListaMensajesHitorialNotificacionesWSDTO llmhn_listaMensajesHitorialNotificacionesWsDto = new ListaMensajesHitorialNotificacionesWSDTO();
		llmhn_listaMensajesHitorialNotificacionesWsDto.setId_fechaEnvio(am_mensajeVo.getId_fechaEnvio());
		llmhn_listaMensajesHitorialNotificacionesWsDto.setIlltd_listaTipoDocumentalWsDto(ListaTipoDocumentalWsDtoConverter.listaOvAListaWsDto(am_mensajeVo.getIltd_listaTipoDocumental()));
		llmhn_listaMensajesHitorialNotificacionesWsDto.setIs_asunto(am_mensajeVo.getIs_asunto());
		llmhn_listaMensajesHitorialNotificacionesWsDto.setIs_cuerpo(am_mensajeVo.getIs_cuerpo());
		llmhn_listaMensajesHitorialNotificacionesWsDto.setIs_identificadorEE(am_mensajeVo.getIs_identificadorEE());
		llmhn_listaMensajesHitorialNotificacionesWsDto.setIs_nir(am_mensajeVo.getIs_nir());
		llmhn_listaMensajesHitorialNotificacionesWsDto.setIs_orip(am_mensajeVo.getIs_orip());
		llmhn_listaMensajesHitorialNotificacionesWsDto.setIs_para(am_mensajeVo.getIs_para());
		llmhn_listaMensajesHitorialNotificacionesWsDto.setIs_tipoTramiteCurso(am_mensajeVo.getIs_tipoTramiteCurso());
		llmhn_listaMensajesHitorialNotificacionesWsDto.setIs_turno(am_mensajeVo.getIs_turno());
		
		return llmhn_listaMensajesHitorialNotificacionesWsDto;
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
	 * Especificamente convierte <b>de</b> una MensajeVO <b>a</b> una
	 * ListaMensajesHitorialNotificacionesWSDTO, <br>
	 * En otras palabras, <b>de</b> una Lista oficinas origen objeto con valores de
	 * servicio <b>a</b> una Lista oficinas origen web service dto.
	 *
	 * @param alm_mensajeVo el parametro lista oficinas origen vo
	 * @return Resultado para convertir de lista de valores de servicio a lista de
	 *         web service dto, retornado como una lista de ListaMensajesHitorialNotificacionesWSDTO
	 */
	public static List<ListaMensajesHitorialNotificacionesWSDTO> listaOvAListaWsDto(List<MensajeVO> alm_mensajeVo) {
		List<ListaMensajesHitorialNotificacionesWSDTO> llmhn_listaMensajesHitorialNotificacionesWsDto = new ArrayList<>();
		for (MensajeVO lm_mensajeVo : alm_mensajeVo) {
			llmhn_listaMensajesHitorialNotificacionesWsDto.add(voAWsDto(lm_mensajeVo));
		}
		return llmhn_listaMensajesHitorialNotificacionesWsDto;
	}
}
