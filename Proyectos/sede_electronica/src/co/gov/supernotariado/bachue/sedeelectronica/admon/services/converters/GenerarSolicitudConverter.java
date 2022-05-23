/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: GenerarSolicitudConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: GenerarSolicitudConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import co.gov.supernotariado.bachue.clientebus.vo.generacionsolicitud.TipoEntradaGenerarSolicitudVO;
import co.gov.supernotariado.bachue.clientebus.vo.generacionsolicitud.TipoSalidaGenerarSolicitudVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaGenerarSolicitudWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaGenerarSolicitudWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Generar
 * solicitud. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class GenerarSolicitudConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase GenerarSolicitudConverter.
	 */
	private GenerarSolicitudConverter() {
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
	 * Especificamente convierte <b>de</b> TipoEntradaGenerarSolicitudWSDTO <b>a</b>
	 * TipoEntradaGenerarSolicitudVO, <br>
	 * En otras palabras, <b>de</b> Tipo entrada generar solicitud web service dto
	 * <b>a</b> Tipo entrada generar solicitud objeto con valores de servicio.
	 *
	 * @param ategs_entradaGenerarSolicitudWsdto el parametro entrada generar
	 *                                           solicitud wsdto
	 * @return Resultado para convertir web service dto a objeto de valores de
	 *         servicio, retornado como TipoEntradaGenerarSolicitudVO
	 */
	public static TipoEntradaGenerarSolicitudVO wsdtoAVo(
			TipoEntradaGenerarSolicitudWSDTO ategs_entradaGenerarSolicitudWsdto) {

		TipoEntradaGenerarSolicitudVO ltegs_tipoEntradaGenerarSolicitud = new TipoEntradaGenerarSolicitudVO();

		ltegs_tipoEntradaGenerarSolicitud.setIs_modulo(ategs_entradaGenerarSolicitudWsdto.getIs_modulo());
		ltegs_tipoEntradaGenerarSolicitud.setItsgv_solicitante(
				TipoSolicitanteGSIWsDtoConverter.wsdtoAVo(ategs_entradaGenerarSolicitudWsdto.getItsgv_solicitante()));
		ltegs_tipoEntradaGenerarSolicitud.setIltsgsv_servicios(TipoServicioGSIWSDtoConverter
				.listaWsdtoAListaVo(ategs_entradaGenerarSolicitudWsdto.getIltsgw_servicios()));

		return ltegs_tipoEntradaGenerarSolicitud;
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaGenerarSolicitudVO <b>a</b>
	 * TipoSalidaGenerarSolicitudWSDTO, <br>
	 * En otras palabras, <b>de</b> Tipo salida generar solicitud objeto con valores
	 * de servicio <b>a</b> Tipo salida generar solicitud web service dto.
	 *
	 * @param atsgs_salidaGenerarSolicitud el parametro salida generar solicitud
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como TipoSalidaGenerarSolicitudWSDTO
	 */
	public static TipoSalidaGenerarSolicitudWSDTO voAWsdto(TipoSalidaGenerarSolicitudVO atsgs_salidaGenerarSolicitud) {

		TipoSalidaGenerarSolicitudWSDTO ltsgs_tipoSalidaGenerarSolicitudDto = new TipoSalidaGenerarSolicitudWSDTO();

		ltsgs_tipoSalidaGenerarSolicitudDto.setIs_nir(atsgs_salidaGenerarSolicitud.getIs_nir());
		ltsgs_tipoSalidaGenerarSolicitudDto
				.setIs_codigoEstadoSolicitud(atsgs_salidaGenerarSolicitud.getIs_codigoEstadoSolicitud());
		ltsgs_tipoSalidaGenerarSolicitudDto
				.setIs_descripcionEstadoSolicitud(atsgs_salidaGenerarSolicitud.getIs_descripcionEstadoSolicitud());
		ltsgs_tipoSalidaGenerarSolicitudDto
				.setIs_mensajeAlSolicitante(atsgs_salidaGenerarSolicitud.getIs_mensajeAlSolicitante());
		ltsgs_tipoSalidaGenerarSolicitudDto.setIs_codigoMensaje(atsgs_salidaGenerarSolicitud.getIs_codigoMensaje());
		ltsgs_tipoSalidaGenerarSolicitudDto
				.setIs_descripcionMensaje(atsgs_salidaGenerarSolicitud.getIs_descripcionMensaje());

		return ltsgs_tipoSalidaGenerarSolicitudDto;
	}

}
