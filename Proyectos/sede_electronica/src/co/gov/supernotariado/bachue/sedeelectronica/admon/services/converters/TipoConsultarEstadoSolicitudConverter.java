/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TipoConsultarEstadoSolicitudConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: TipoConsultarEstadoSolicitudConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import co.gov.supernotariado.bachue.clientebus.vo.generacionsolicitud.TipoEntradaConsultarEstadoSolicitudVO;
import co.gov.supernotariado.bachue.clientebus.vo.generacionsolicitud.TipoSalidaConsultarEstadoSolicitudVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarEstadoSolicitudWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarEstadoSolicitudWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Tipo consultar
 * estado solicitud. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoConsultarEstadoSolicitudConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * TipoConsultarEstadoSolicitudConverter.
	 */
	private TipoConsultarEstadoSolicitudConverter() {
		// Constructor vacio de la clase
	}

	/**
	 * Metodo que convierte de WSDTO a VO ( De Objeto de Transferencia de Datos de
	 * Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto WSDTO manipulado en la capa de negocio, en
	 * una entrada de datos para consumir una operacion de un servicio(objeto VO).
	 * <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoEntradaConsultarEstadoSolicitudWSDTO
	 * <b>a</b> TipoEntradaConsultarEstadoSolicitudVO, <br>
	 * En otras palabras, <b>de</b> Tipo entrada consultar estado solicitud web
	 * service dto <b>a</b> Tipo entrada consultar estado solicitud objeto con
	 * valores de servicio.
	 *
	 * @param ateces_entradaConsultarEstadoSolicitud el parametro entrada consultar
	 *                                               estado solicitud
	 * @return Resultado para convertir web service dto a objeto de valores de
	 *         servicio, retornado como TipoEntradaConsultarEstadoSolicitudVO
	 */
	public static TipoEntradaConsultarEstadoSolicitudVO wsdtoAVo(
			TipoEntradaConsultarEstadoSolicitudWSDTO ateces_entradaConsultarEstadoSolicitud) {

		TipoEntradaConsultarEstadoSolicitudVO lteces_tipoEntradaConsultarEstadoSolicitudVo = new TipoEntradaConsultarEstadoSolicitudVO();

		lteces_tipoEntradaConsultarEstadoSolicitudVo
				.setIs_modulo(ateces_entradaConsultarEstadoSolicitud.getIs_modulo());
		lteces_tipoEntradaConsultarEstadoSolicitudVo.setIs_nir(ateces_entradaConsultarEstadoSolicitud.getIs_nir());
		lteces_tipoEntradaConsultarEstadoSolicitudVo.setItscv_solicitante(TipoSolicitanteCESIWsDtoConverter
				.wsdtoAVo(ateces_entradaConsultarEstadoSolicitud.getItsc_solicitante()));

		return lteces_tipoEntradaConsultarEstadoSolicitudVo;
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaConsultarEstadoSolicitudVO
	 * <b>a</b> TipoSalidaConsultarEstadoSolicitudWSDTO, <br>
	 * En otras palabras, <b>de</b> Tipo salida consultar estado solicitud objeto
	 * con valores de servicio <b>a</b> Tipo salida consultar estado solicitud web
	 * service dto.
	 *
	 * @param atsces_salidaConsultarEstadoSolicitud el parametro salida consultar
	 *                                              estado solicitud
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como TipoSalidaConsultarEstadoSolicitudWSDTO
	 */
	public static TipoSalidaConsultarEstadoSolicitudWSDTO voAWsdto(
			TipoSalidaConsultarEstadoSolicitudVO atsces_salidaConsultarEstadoSolicitud) {

		TipoSalidaConsultarEstadoSolicitudWSDTO ltsces_tipoSalidaConsultarEstadoSolicitudDto = new TipoSalidaConsultarEstadoSolicitudWSDTO();

		ltsces_tipoSalidaConsultarEstadoSolicitudDto.setIs_nir(atsces_salidaConsultarEstadoSolicitud.getIs_nir());
		ltsces_tipoSalidaConsultarEstadoSolicitudDto
				.setIs_idEtapa(atsces_salidaConsultarEstadoSolicitud.getIs_idEtapa());
		ltsces_tipoSalidaConsultarEstadoSolicitudDto
				.setIs_nombreEtapa(atsces_salidaConsultarEstadoSolicitud.getIs_nombreEtapa());
		ltsces_tipoSalidaConsultarEstadoSolicitudDto
				.setIs_idMotivo(atsces_salidaConsultarEstadoSolicitud.getIs_idMotivo());
		ltsces_tipoSalidaConsultarEstadoSolicitudDto
				.setIs_descripcionMotivo(atsces_salidaConsultarEstadoSolicitud.getIs_descripcionMotivo());
		ltsces_tipoSalidaConsultarEstadoSolicitudDto.setIs_estado(atsces_salidaConsultarEstadoSolicitud.getIs_estado());
		ltsces_tipoSalidaConsultarEstadoSolicitudDto
				.setId_fechaFin(atsces_salidaConsultarEstadoSolicitud.getId_fechaFin());
		ltsces_tipoSalidaConsultarEstadoSolicitudDto
				.setIs_codigoMensaje(atsces_salidaConsultarEstadoSolicitud.getIs_codigoMensaje());
		ltsces_tipoSalidaConsultarEstadoSolicitudDto
				.setIs_descripcionMensaje(atsces_salidaConsultarEstadoSolicitud.getIs_descripcionMensaje());

		return ltsces_tipoSalidaConsultarEstadoSolicitudDto;
	}

}
