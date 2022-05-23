/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: NotificacionPagoSalidaWsDtoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: NotificacionPagoSalidaWsDtoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import co.gov.supernotariado.bachue.clientebus.vo.operacionesfinancieras.TipoSalidaNotificarPagoVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.NotificacionPagoSalidaWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Notificacion
 * pago salida ws dto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class NotificacionPagoSalidaWsDtoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * NotificacionPagoSalidaWsDtoConverter.
	 */
	private NotificacionPagoSalidaWsDtoConverter() {
		// Constructor vacio de la clase
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaNotificarPagoVO <b>a</b>
	 * NotificacionPagoSalidaWSDTO, <br>
	 * En otras palabras, <b>de</b> Tipo salida notificar pago objeto con valores de
	 * servicio <b>a</b> Notificacion pago salida web service dto.
	 *
	 * @param atsnp_salidaNotificarPago el parametro salida notificar pago
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como NotificacionPagoSalidaWSDTO
	 */
	public static NotificacionPagoSalidaWSDTO entidadAVo(TipoSalidaNotificarPagoVO atsnp_salidaNotificarPago) {
		NotificacionPagoSalidaWSDTO lnps_notificacionPagoSalidaVo = new NotificacionPagoSalidaWSDTO();
		lnps_notificacionPagoSalidaVo.setIs_codigoMensaje(atsnp_salidaNotificarPago.getIs_codigoMensaje());
		lnps_notificacionPagoSalidaVo.setIs_descripcionMensaje(atsnp_salidaNotificarPago.getIs_descripcionMensaje());
		return lnps_notificacionPagoSalidaVo;
	}
}
