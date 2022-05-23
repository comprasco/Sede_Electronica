/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ConsultarDetalleSolicitudWsDtoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: ConsultarDetalleSolicitudWsDtoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import co.gov.supernotariado.bachue.clientebus.vo.consultarhistorialsolicitudespagadas.TipoEntradaConsultarDetalleSolicitudVO;
import co.gov.supernotariado.bachue.clientebus.vo.consultarhistorialsolicitudespagadas.TipoSalidaConsultarDetalleSolicitudVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarDetalleSolicitudWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarDetalleSolicitudWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Consultar
 * detalle solicitud ws dto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ConsultarDetalleSolicitudWsDtoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ConsultarDetalleSolicitudWsDtoConverter.
	 */
	private ConsultarDetalleSolicitudWsDtoConverter() {
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
	 * Especificamente convierte <b>de</b> TipoEntradaConsultarDetalleSolicitudWSDTO
	 * <b>a</b> TipoEntradaConsultarDetalleSolicitudVO, <br>
	 * En otras palabras, <b>de</b> Tipo entrada consultar detalle solicitud web
	 * service dto <b>a</b> Tipo entrada consultar detalle solicitud objeto con
	 * valores de servicio.
	 *
	 * @param atecds_consultarDetalleSolicitudWsdto el parametro consultar detalle
	 *                                              solicitud wsdto
	 * @return Resultado para convertir web service dto a objeto de valores de
	 *         servicio, retornado como TipoEntradaConsultarDetalleSolicitudVO
	 */
	public static TipoEntradaConsultarDetalleSolicitudVO wsdtoAVo(
			TipoEntradaConsultarDetalleSolicitudWSDTO atecds_consultarDetalleSolicitudWsdto) {
		TipoEntradaConsultarDetalleSolicitudVO ltecds_tipoEntradaConsultarDetalleSolicitudVo = new TipoEntradaConsultarDetalleSolicitudVO();
		ltecds_tipoEntradaConsultarDetalleSolicitudVo.setIs_nir(atecds_consultarDetalleSolicitudWsdto.getIs_nir());
		ltecds_tipoEntradaConsultarDetalleSolicitudVo
				.setIs_modulo(atecds_consultarDetalleSolicitudWsdto.getIs_modulo());
		ltecds_tipoEntradaConsultarDetalleSolicitudVo.setIsd_solicitanteDetalle(
				SolicitanteWsDtoConverter.wsdtoAVo(atecds_consultarDetalleSolicitudWsdto.getIs_solicitante()));
		return ltecds_tipoEntradaConsultarDetalleSolicitudVo;
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaConsultarDetalleSolicitudVO
	 * <b>a</b> TipoSalidaConsultarDetalleSolicitudWSDTO, <br>
	 * En otras palabras, <b>de</b> Tipo salida consultar detalle solicitud objeto
	 * con valores de servicio <b>a</b> Tipo salida consultar detalle solicitud web
	 * service dto.
	 *
	 * @param atscds_tipoEntradaConsultarDetalleSolicitudVo el parametro tipo
	 *                                                      entrada consultar
	 *                                                      detalle solicitud vo
	 * @param as_formatoFecha                               el parametro formato
	 *                                                      fecha
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como TipoSalidaConsultarDetalleSolicitudWSDTO
	 */
	public static TipoSalidaConsultarDetalleSolicitudWSDTO voAWsdto(
			TipoSalidaConsultarDetalleSolicitudVO atscds_tipoEntradaConsultarDetalleSolicitudVo,
			String as_formatoFecha) {
		TipoSalidaConsultarDetalleSolicitudWSDTO ltecds_consultarDetalleSolicitudWsdto = new TipoSalidaConsultarDetalleSolicitudWSDTO();
		ltecds_consultarDetalleSolicitudWsdto.setIltcds_listaTurnoConsultarDetallesSolicitudWsDto(
				TurnoConsultarDetallesSolicitudWsDtoConverter.listaVoAListaWsdto(
						atscds_tipoEntradaConsultarDetalleSolicitudVo.getIltd_listaTurno(), as_formatoFecha));
		ltecds_consultarDetalleSolicitudWsdto
				.setIs_codigoMensaje(atscds_tipoEntradaConsultarDetalleSolicitudVo.getIs_codigoMensaje());
		ltecds_consultarDetalleSolicitudWsdto
				.setIs_descripcionMensaje(atscds_tipoEntradaConsultarDetalleSolicitudVo.getIs_descripcionMensaje());

		return ltecds_consultarDetalleSolicitudWsdto;
	}

}
