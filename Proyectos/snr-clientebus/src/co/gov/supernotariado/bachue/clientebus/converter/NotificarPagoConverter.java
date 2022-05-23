/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: NotificarPagoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: NotificarPagoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import co.gov.supernotariado.bachue.clientebus.operacionesfinancieras.types.notificarpago.TipoEntradaNotificarPago;
import co.gov.supernotariado.bachue.clientebus.operacionesfinancieras.types.notificarpago.TipoSalidaNotificarPago;
import co.gov.supernotariado.bachue.clientebus.util.UtilidadFecha;
import co.gov.supernotariado.bachue.clientebus.vo.operacionesfinancieras.TipoEntradaNotificarPagoVO;
import co.gov.supernotariado.bachue.clientebus.vo.operacionesfinancieras.TipoSalidaNotificarPagoVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Notificar
 * pago. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class NotificarPagoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase NotificarPagoConverter.
	 */
	private NotificarPagoConverter() {
		// Metodo constructor privado y vacio
	}

	/**
	 * Metodo que convierte de ComplexType a VO ( De elemento especifico del esquema
	 * de un Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto con un resultado/salida de una peticion de
	 * Servicio SOAP, en un objeto de datos llamado VO; para ser retornado como
	 * resultado a la aplicacion o capa de negocio que consume el cliente de
	 * servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaNotificarPago <b>a</b>
	 * TipoSalidaNotificarPagoVO, <br>
	 * En otras palabras, <b>de</b> Tipo salida notificar pago (ComplexType
	 * relacionado a la representacion XML del servicio) <b>a</b> Tipo salida
	 * notificar pago objeto con valores de servicio.
	 *
	 * @param atsnp_salidaNotificarPago el parametro que representa el complex type
	 *                                  a convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como TipoSalidaNotificarPagoVO.
	 */
	public static TipoSalidaNotificarPagoVO tipoAVo(TipoSalidaNotificarPago atsnp_salidaNotificarPago) {
		TipoSalidaNotificarPagoVO ltsnp_notificacionPagoSalidaVo = new TipoSalidaNotificarPagoVO();
		ltsnp_notificacionPagoSalidaVo.setIs_codigoMensaje(atsnp_salidaNotificarPago.getCodigoMensaje().toString());
		if (atsnp_salidaNotificarPago.getDescripcionMensaje() != null)
			ltsnp_notificacionPagoSalidaVo
					.setIs_descripcionMensaje(atsnp_salidaNotificarPago.getDescripcionMensaje().getValue());
		return ltsnp_notificacionPagoSalidaVo;
	}

	/**
	 * Metodo que convierte de VO a ComplexType (De Objeto de valores de Servicio,
	 * entrada del cliente bus; a elemento especifico del esquema de un Servicio
	 * Web, entrada de una peticion de Servicio SOAP).<br>
	 * Se usa para convertir un objeto con las entradas de un servicio web (objeto
	 * VO), a un objeto ComplexType para ser enviado en una operacion de un
	 * servicio. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoEntradaNotificarPagoVO <b>a</b>
	 * TipoEntradaNotificarPago, <br>
	 * En otras palabras, <b>de</b> Tipo entrada notificar pago objeto con valores
	 * de servicio <b>a</b> Tipo entrada notificar pago (ComplexType relacionado a
	 * la representacion XML del servicio).
	 *
	 * @param atenp_notificacionPagoVo el parametro que representa el objeto con
	 *                                 valores de servicio a convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como TipoEntradaNotificarPago.
	 */
	public static TipoEntradaNotificarPago voATipo(TipoEntradaNotificarPagoVO atenp_notificacionPagoVo) {
		TipoEntradaNotificarPago ltenp_entradaNotificarPago = new TipoEntradaNotificarPago();
		ltenp_entradaNotificarPago
				.setCodigoEntidadRecaudadora(atenp_notificacionPagoVo.getIs_codigoEntidadRecaudadora());
		ltenp_entradaNotificarPago
				.setCodigoPuntoRecaudoEntidad(atenp_notificacionPagoVo.getIs_codigoPuntoRecaudoEntidad());
		ltenp_entradaNotificarPago.setCodigoTipoRecaudo(atenp_notificacionPagoVo.getIs_codigoTipoRecaudo());
		ltenp_entradaNotificarPago
				.setCodigoTransaccionRecaudador(atenp_notificacionPagoVo.getIs_codigoTransaccionRecaudador());
		ltenp_entradaNotificarPago.setFechaBancaria(
				UtilidadFecha.cambiarDateAXmlGregoriaCalender(atenp_notificacionPagoVo.getId_fechaBancaria()));
		ltenp_entradaNotificarPago.setFechaTransaccion(
				UtilidadFecha.cambiarDateAXmlGregoriaCalender(atenp_notificacionPagoVo.getId_fechaTransaccion()));
		ltenp_entradaNotificarPago.setMontoTransaccion(atenp_notificacionPagoVo.getIbd_montoTransaccion());
		ltenp_entradaNotificarPago.setNumeroReferenciaBachue(atenp_notificacionPagoVo.getIs_numeroReferenciaBachue());
		return ltenp_entradaNotificarPago;
	}
}
