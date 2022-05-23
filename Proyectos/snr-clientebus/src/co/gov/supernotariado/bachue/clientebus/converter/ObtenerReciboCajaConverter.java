/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: ObtenerReciboCajaConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: ObtenerReciboCajaConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import co.gov.supernotariado.bachue.clientebus.entregaproducto.types.obtenerrecibocaja.TipoEntradaObtenerReciboCaja;
import co.gov.supernotariado.bachue.clientebus.entregaproducto.types.obtenerrecibocaja.TipoSalidaObtenerReciboCaja;
import co.gov.supernotariado.bachue.clientebus.vo.entregaproducto.TipoEntradaObtenerReciboCajaVO;
import co.gov.supernotariado.bachue.clientebus.vo.entregaproducto.TipoSalidaObtenerReciboCajaVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Obtener
 * recibo caja. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ObtenerReciboCajaConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase ObtenerReciboCajaConverter.
	 */
	private ObtenerReciboCajaConverter() {
		// Metodo constructor privado y vacio
	}

	/**
	 * Metodo que convierte de VO a ComplexType (De Objeto de valores de Servicio,
	 * entrada del cliente bus; a elemento especifico del esquema de un Servicio
	 * Web, entrada de una peticion de Servicio SOAP).<br>
	 * Se usa para convertir un objeto con las entradas de un servicio web (objeto
	 * VO), a un objeto ComplexType para ser enviado en una operacion de un
	 * servicio. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoEntradaObtenerReciboCajaVO <b>a</b>
	 * TipoEntradaObtenerReciboCaja, <br>
	 * En otras palabras, <b>de</b> Tipo entrada obtener recibo caja objeto con
	 * valores de servicio <b>a</b> Tipo entrada obtener recibo caja (ComplexType
	 * relacionado a la representacion XML del servicio).
	 *
	 * @param ateorc_tipoEntradaObtenerReciboCajaVo el parametro que representa el
	 *                                              objeto con valores de servicio a
	 *                                              convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como TipoEntradaObtenerReciboCaja.
	 */
	public static TipoEntradaObtenerReciboCaja voATipo(
			TipoEntradaObtenerReciboCajaVO ateorc_tipoEntradaObtenerReciboCajaVo) {
		TipoEntradaObtenerReciboCaja lteorc_tipoEntradaObtenerReciboCaja = new TipoEntradaObtenerReciboCaja();

		lteorc_tipoEntradaObtenerReciboCaja.setNIR(ateorc_tipoEntradaObtenerReciboCajaVo.getIs_nir());
		lteorc_tipoEntradaObtenerReciboCaja
				.setReferenciaPago(ateorc_tipoEntradaObtenerReciboCajaVo.getIs_referenciaPago());

		return lteorc_tipoEntradaObtenerReciboCaja;
	}

	/**
	 * Metodo que convierte de ComplexType a VO ( De elemento especifico del esquema
	 * de un Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto con un resultado/salida de una peticion de
	 * Servicio SOAP, en un objeto de datos llamado VO; para ser retornado como
	 * resultado a la aplicacion o capa de negocio que consume el cliente de
	 * servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaObtenerReciboCaja <b>a</b>
	 * TipoSalidaObtenerReciboCajaVO, <br>
	 * En otras palabras, <b>de</b> Tipo salida obtener recibo caja (ComplexType
	 * relacionado a la representacion XML del servicio) <b>a</b> Tipo salida
	 * obtener recibo caja objeto con valores de servicio.
	 *
	 * @param atsorc_tipoSalidaObtenerReciboCaja el parametro que representa el
	 *                                           complex type a convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como TipoSalidaObtenerReciboCajaVO.
	 */
	public static TipoSalidaObtenerReciboCajaVO tipoAVo(
			TipoSalidaObtenerReciboCaja atsorc_tipoSalidaObtenerReciboCaja) {
		TipoSalidaObtenerReciboCajaVO ltsorc_tipoSalidaObtenerReciboCajaVo = new TipoSalidaObtenerReciboCajaVO();

		ltsorc_tipoSalidaObtenerReciboCajaVo.setIb_archivo(atsorc_tipoSalidaObtenerReciboCaja.getArchivo());
		ltsorc_tipoSalidaObtenerReciboCajaVo
				.setIbi_codigoMensaje(atsorc_tipoSalidaObtenerReciboCaja.getCodigoMensaje());
		ltsorc_tipoSalidaObtenerReciboCajaVo
				.setIs_descripcionMensaje(atsorc_tipoSalidaObtenerReciboCaja.getDescripcionMensaje());

		return ltsorc_tipoSalidaObtenerReciboCajaVo;
	}
}
