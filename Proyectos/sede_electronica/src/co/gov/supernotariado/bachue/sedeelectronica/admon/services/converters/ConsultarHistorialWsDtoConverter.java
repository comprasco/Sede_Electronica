/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ConsultarHistorialWsDtoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: ConsultarHistorialWsDtoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import co.gov.supernotariado.bachue.clientebus.vo.historialnotificaciones.TipoEntradaConsultarHistorialVO;
import co.gov.supernotariado.bachue.clientebus.vo.historialnotificaciones.TipoSalidaConsultarHistorialVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarHistorialWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarHistorialWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto consultar
 * historial ws dto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ConsultarHistorialWsDtoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ConsultarHistorialWsDtoConverter.
	 */
	private ConsultarHistorialWsDtoConverter() {
		// Constructor vacio de la clase
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaConsultarHistorialVO <b>a</b>
	 * TipoSalidaConsultarHistorialWSDTO, <br>
	 * En otras palabras, <b>de</b> Tipo salida activar alerta tierras objeto con
	 * valores de servicio <b>a</b> Tipo salida activar alerta tierras web service
	 * dto.
	 *
	 * @param atsch_tipoSalidaConsultarHistorialVo el parametro tipo salida activar
	 *                                             alerta tierras vo
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como TipoSalidaConsultarHistorialWSDTO
	 */
	public static TipoSalidaConsultarHistorialWSDTO voAWsDto(
			TipoSalidaConsultarHistorialVO atsch_tipoSalidaConsultarHistorialVo) {
		TipoSalidaConsultarHistorialWSDTO ltsch_tipoSalidaConsultarHistorialWsDto = new TipoSalidaConsultarHistorialWSDTO();
		ltsch_tipoSalidaConsultarHistorialWsDto.setIbi_numeroRegistros(atsch_tipoSalidaConsultarHistorialVo.getIbi_numeroRegistros());
		ltsch_tipoSalidaConsultarHistorialWsDto.setIllmhn_listaMensajesHitorialNotificacionesWsDto(ListaMensajesWsDtoConverter
						.listaOvAListaWsDto(atsch_tipoSalidaConsultarHistorialVo.getIlm_listaMensajes()));
		ltsch_tipoSalidaConsultarHistorialWsDto.setIbi_codigoMensaje(atsch_tipoSalidaConsultarHistorialVo.getIbi_codMensaje());
		ltsch_tipoSalidaConsultarHistorialWsDto.setIs_descripcionMensaje(atsch_tipoSalidaConsultarHistorialVo.getIs_descripcionMensaje());

		return ltsch_tipoSalidaConsultarHistorialWsDto;
	}

	/**
	 * Metodo que convierte de WSDTO a VO ( De Objeto de Transferencia de Datos de
	 * Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto WSDTO manipulado en la capa de negocio, en
	 * una entrada de datos para consumir una operacion de un servicio(objeto VO).
	 * <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoEntradaConsultarHistorialWSDTO
	 * <b>a</b> TipoEntradaConsultarHistorialVO, <br>
	 * En otras palabras, <b>de</b> Tipo entrada activar alerta tierras web service
	 * dto <b>a</b> Tipo entrada activar alerta tierras objeto con valores de
	 * servicio.
	 *
	 * @param atech_tipoEntradaConsultarHistorialWsDto el parametro tipo entrada
	 *                                                    activar alerta tierrasws
	 *                                                    dto
	 * @return Resultado para convertir web service dto a objeto de valores de
	 *         servicio, retornado como TipoEntradaConsultarHistorialVO
	 */
	public static TipoEntradaConsultarHistorialVO wsDtoAVo(
			TipoEntradaConsultarHistorialWSDTO atech_tipoEntradaConsultarHistorialWsDto) {
		TipoEntradaConsultarHistorialVO ltech_tipoEntradaConsultarHistorialVo = new TipoEntradaConsultarHistorialVO();
		ltech_tipoEntradaConsultarHistorialVo.setIbi_numeroTelefonoDestinatario(atech_tipoEntradaConsultarHistorialWsDto.getIbi_numeroTelefonoDestinatario());
		ltech_tipoEntradaConsultarHistorialVo.setId_fechaFinal(atech_tipoEntradaConsultarHistorialWsDto.getId_fechaFinal());
		ltech_tipoEntradaConsultarHistorialVo.setId_fechaInicial(atech_tipoEntradaConsultarHistorialWsDto.getId_fechaInicial());
		ltech_tipoEntradaConsultarHistorialVo.setIs_direccionCorreoElectronicoDestinatario(atech_tipoEntradaConsultarHistorialWsDto.getIs_direccionCorreoElectronicoDestinatario());
		ltech_tipoEntradaConsultarHistorialVo.setIs_identificador(atech_tipoEntradaConsultarHistorialWsDto.getIs_identificador());
		ltech_tipoEntradaConsultarHistorialVo.setIs_pagina(atech_tipoEntradaConsultarHistorialWsDto.getIs_pagina());
		ltech_tipoEntradaConsultarHistorialVo.setIs_tipoID(atech_tipoEntradaConsultarHistorialWsDto.getIs_tipoId());
		
		return ltech_tipoEntradaConsultarHistorialVo;
	}
}
