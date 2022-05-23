/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: VerificarProductoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: VerificarProductoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import co.gov.supernotariado.bachue.clientebus.entregaproducto.types.verificarproducto.TipoEntradaVerificarProducto;
import co.gov.supernotariado.bachue.clientebus.entregaproducto.types.verificarproducto.TipoSalidaVerificarProducto;
import co.gov.supernotariado.bachue.clientebus.vo.entregaproducto.TipoEntradaVerificarProductoVO;
import co.gov.supernotariado.bachue.clientebus.vo.entregaproducto.TipoSalidaVerificarProductoVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Verificar
 * producto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class VerificarProductoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase VerificarProductoConverter.
	 */
	private VerificarProductoConverter() {
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
	 * Especificamente convierte <b>de</b> TipoSalidaVerificarProducto <b>a</b>
	 * TipoSalidaVerificarProductoVO, <br>
	 * En otras palabras, <b>de</b> Tipo salida verificar producto (ComplexType
	 * relacionado a la representacion XML del servicio) <b>a</b> Tipo salida
	 * verificar producto objeto con valores de servicio.
	 *
	 * @param atsvp_tipoSalidaVerificarProducto el parametro que representa el
	 *                                          complex type a convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como TipoSalidaVerificarProductoVO.
	 */
	public static TipoSalidaVerificarProductoVO tipoAVo(TipoSalidaVerificarProducto atsvp_tipoSalidaVerificarProducto) {
		TipoSalidaVerificarProductoVO ltsvp_tipoSalidaVerificarProductoVo = new TipoSalidaVerificarProductoVO();

		ltsvp_tipoSalidaVerificarProductoVo.setIs_codigoMensaje(atsvp_tipoSalidaVerificarProducto.getCodigoMensaje());
		ltsvp_tipoSalidaVerificarProductoVo
				.setIs_descripcionMensaje(atsvp_tipoSalidaVerificarProducto.getDescripcionMensaje());

		return ltsvp_tipoSalidaVerificarProductoVo;
	}

	/**
	 * Metodo que convierte de VO a ComplexType (De Objeto de valores de Servicio,
	 * entrada del cliente bus; a elemento especifico del esquema de un Servicio
	 * Web, entrada de una peticion de Servicio SOAP).<br>
	 * Se usa para convertir un objeto con las entradas de un servicio web (objeto
	 * VO), a un objeto ComplexType para ser enviado en una operacion de un
	 * servicio. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoEntradaVerificarProductoVO <b>a</b>
	 * TipoEntradaVerificarProducto, <br>
	 * En otras palabras, <b>de</b> Tipo entrada verificar producto objeto con
	 * valores de servicio <b>a</b> Tipo entrada verificar producto (ComplexType
	 * relacionado a la representacion XML del servicio).
	 *
	 * @param atevp_tipoEntradaVerificarProductoVo el parametro que representa el
	 *                                             objeto con valores de servicio a
	 *                                             convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como TipoEntradaVerificarProducto.
	 */
	public static TipoEntradaVerificarProducto voATipo(
			TipoEntradaVerificarProductoVO atevp_tipoEntradaVerificarProductoVo) {
		TipoEntradaVerificarProducto ltevp_tipoEntradaVerificarProducto = new TipoEntradaVerificarProducto();
		ltevp_tipoEntradaVerificarProducto
				.setCodigoVerificacion(atevp_tipoEntradaVerificarProductoVo.getIs_codigoVerificacion());
		return ltevp_tipoEntradaVerificarProducto;
	}
}
