/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: NotificacionPagoEntradaWsDtoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: NotificacionPagoEntradaWsDtoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import co.gov.supernotariado.bachue.clientebus.vo.operacionesfinancieras.TipoEntradaNotificarPagoVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaNotificarPagoWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Notificacion
 * pago entrada ws dto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class NotificacionPagoEntradaWsDtoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * NotificacionPagoEntradaWsDtoConverter.
	 */
	private NotificacionPagoEntradaWsDtoConverter() {
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
	 * Especificamente convierte <b>de</b> TipoEntradaNotificarPagoWSDTO <b>a</b>
	 * TipoEntradaNotificarPagoVO, <br>
	 * En otras palabras, <b>de</b> Tipo entrada notificar pago web service dto
	 * <b>a</b> Tipo entrada notificar pago objeto con valores de servicio.
	 *
	 * @param atenp_notificacionPagoWsDto el parametro notificacion pago ws dto
	 * @return Resultado para convertir web service dto a objeto de valores de
	 *         servicio, retornado como TipoEntradaNotificarPagoVO
	 */
	public static TipoEntradaNotificarPagoVO dtoAVo(TipoEntradaNotificarPagoWSDTO atenp_notificacionPagoWsDto) {

		TipoEntradaNotificarPagoVO ltenp_entradaNotificarPago = new TipoEntradaNotificarPagoVO();

		ltenp_entradaNotificarPago
				.setIs_codigoEntidadRecaudadora(atenp_notificacionPagoWsDto.getIs_codigoEntidadRecaudadora());
		ltenp_entradaNotificarPago
				.setIs_codigoPuntoRecaudoEntidad(atenp_notificacionPagoWsDto.getIs_codigoPuntoRecaudoEntidad());
		ltenp_entradaNotificarPago.setIs_codigoTipoRecaudo(atenp_notificacionPagoWsDto.getIs_codigoTipoRecaudo());
		ltenp_entradaNotificarPago
				.setIs_codigoTransaccionRecaudador(atenp_notificacionPagoWsDto.getIs_codigoTransaccionRecaudador());
		ltenp_entradaNotificarPago.setId_fechaBancaria(atenp_notificacionPagoWsDto.getId_fechaBancaria());
		ltenp_entradaNotificarPago.setId_fechaTransaccion(atenp_notificacionPagoWsDto.getId_fechaTransaccion());
		ltenp_entradaNotificarPago.setIbd_montoTransaccion(atenp_notificacionPagoWsDto.getIbd_montoTransaccion());
		ltenp_entradaNotificarPago
				.setIs_numeroReferenciaBachue(atenp_notificacionPagoWsDto.getIs_numeroReferenciaBachue());

		return ltenp_entradaNotificarPago;
	}
}
