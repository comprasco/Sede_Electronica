/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: ObtenerTurnosRefPagoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: ObtenerTurnosRefPagoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import co.gov.supernotariado.bachue.clientebus.entregaproducto.types.obtenerturnosrefpago.TipoEntradaObtenerTurnosRefPago;
import co.gov.supernotariado.bachue.clientebus.entregaproducto.types.obtenerturnosrefpago.TipoSalidaObtenerTurnosRefPago;
import co.gov.supernotariado.bachue.clientebus.vo.entregaproducto.TipoEntradaObtenerTurnosRefPagoVO;
import co.gov.supernotariado.bachue.clientebus.vo.entregaproducto.TipoSalidaObtenerTurnosRefPagoVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Obtener
 * turnos ref pago. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ObtenerTurnosRefPagoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ObtenerTurnosRefPagoConverter.
	 */
	private ObtenerTurnosRefPagoConverter() {
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
	 * Especificamente convierte <b>de</b> TipoSalidaObtenerTurnosRefPago <b>a</b>
	 * TipoSalidaObtenerTurnosRefPagoVO, <br>
	 * En otras palabras, <b>de</b> Tipo salida obtener turnos referencia pago
	 * (ComplexType relacionado a la representacion XML del servicio) <b>a</b> Tipo
	 * salida obtener turnos referencia pago objeto con valores de servicio.
	 *
	 * @param atsotrp_tipoSalidaObtenerTurnosRefPago el parametro que representa el
	 *                                               complex type a convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como TipoSalidaObtenerTurnosRefPagoVO.
	 */
	public static TipoSalidaObtenerTurnosRefPagoVO tipoAVo(
			TipoSalidaObtenerTurnosRefPago atsotrp_tipoSalidaObtenerTurnosRefPago) {
		TipoSalidaObtenerTurnosRefPagoVO ltsotrp_tipoSalidaObtenerTurnosRefPagoVo = new TipoSalidaObtenerTurnosRefPagoVO();

		ltsotrp_tipoSalidaObtenerTurnosRefPagoVo.setIlt_listaTurnoVo(
				TurnoConverter.listaTipoAListaVo(atsotrp_tipoSalidaObtenerTurnosRefPago.getTurnos().getTurno()));
		ltsotrp_tipoSalidaObtenerTurnosRefPagoVo
				.setIs_codigoMensaje(atsotrp_tipoSalidaObtenerTurnosRefPago.getCodigoMensaje());
		ltsotrp_tipoSalidaObtenerTurnosRefPagoVo
				.setIs_descripcionMensaje(atsotrp_tipoSalidaObtenerTurnosRefPago.getDescripcionMensaje());
		return ltsotrp_tipoSalidaObtenerTurnosRefPagoVo;
	}

	/**
	 * Metodo que convierte de VO a ComplexType (De Objeto de valores de Servicio,
	 * entrada del cliente bus; a elemento especifico del esquema de un Servicio
	 * Web, entrada de una peticion de Servicio SOAP).<br>
	 * Se usa para convertir un objeto con las entradas de un servicio web (objeto
	 * VO), a un objeto ComplexType para ser enviado en una operacion de un
	 * servicio. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoEntradaObtenerTurnosRefPagoVO
	 * <b>a</b> TipoEntradaObtenerTurnosRefPago, <br>
	 * En otras palabras, <b>de</b> Tipo entrada obtener turnos referencia pago
	 * objeto con valores de servicio <b>a</b> Tipo entrada obtener turnos
	 * referencia pago (ComplexType relacionado a la representacion XML del
	 * servicio).
	 *
	 * @param ateotrp_tipoEntradaObtenerTurnosRefPagoVo el parametro que representa
	 *                                                  el objeto con valores de
	 *                                                  servicio a convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como TipoEntradaObtenerTurnosRefPago.
	 */
	public static TipoEntradaObtenerTurnosRefPago voATipo(
			TipoEntradaObtenerTurnosRefPagoVO ateotrp_tipoEntradaObtenerTurnosRefPagoVo) {
		TipoEntradaObtenerTurnosRefPago lteotrp_tipoEntradaObtenerTurnosRefPago = new TipoEntradaObtenerTurnosRefPago();
		lteotrp_tipoEntradaObtenerTurnosRefPago
				.setReferenciaPago(ateotrp_tipoEntradaObtenerTurnosRefPagoVo.getIs_referenciaPago());
		return lteotrp_tipoEntradaObtenerTurnosRefPago;
	}
}
