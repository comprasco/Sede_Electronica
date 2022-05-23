/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: ObtenerProductoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: ObtenerProductoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import co.gov.supernotariado.bachue.clientebus.entregaproducto.types.obtenerproducto.TipoEntradaObtenerProducto;
import co.gov.supernotariado.bachue.clientebus.entregaproducto.types.obtenerproducto.TipoSalidaObtenerProducto;
import co.gov.supernotariado.bachue.clientebus.vo.entregaproducto.TipoEntradaObtenerProductoVO;
import co.gov.supernotariado.bachue.clientebus.vo.entregaproducto.TipoSalidaObtenerProductoVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Obtener
 * producto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ObtenerProductoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase ObtenerProductoConverter.
	 */
	private ObtenerProductoConverter() {
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
	 * Especificamente convierte <b>de</b> TipoEntradaObtenerProductoVO <b>a</b>
	 * TipoEntradaObtenerProducto, <br>
	 * En otras palabras, <b>de</b> Tipo entrada obtener producto objeto con valores
	 * de servicio <b>a</b> Tipo entrada obtener producto (ComplexType relacionado a
	 * la representacion XML del servicio).
	 *
	 * @param ateop_tipoEntradaObtenerProductoVo el parametro que representa el
	 *                                           objeto con valores de servicio a
	 *                                           convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como TipoEntradaObtenerProducto.
	 */
	public static TipoEntradaObtenerProducto voATipo(TipoEntradaObtenerProductoVO ateop_tipoEntradaObtenerProductoVo) {
		TipoEntradaObtenerProducto lteop_tipoEntradaObtenerProducto = new TipoEntradaObtenerProducto();

		lteop_tipoEntradaObtenerProducto.setTurno(ateop_tipoEntradaObtenerProductoVo.getIs_turno());
		lteop_tipoEntradaObtenerProducto
				.setCodigoVerificacion(ateop_tipoEntradaObtenerProductoVo.getIs_codigoVerificacion());
		lteop_tipoEntradaObtenerProducto.setReferenciaPago(ateop_tipoEntradaObtenerProductoVo.getIs_referenciaPago());

		return lteop_tipoEntradaObtenerProducto;
	}

	/**
	 * Metodo que convierte de ComplexType a VO ( De elemento especifico del esquema
	 * de un Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto con un resultado/salida de una peticion de
	 * Servicio SOAP, en un objeto de datos llamado VO; para ser retornado como
	 * resultado a la aplicacion o capa de negocio que consume el cliente de
	 * servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaObtenerProducto <b>a</b>
	 * TipoSalidaObtenerProductoVO, <br>
	 * En otras palabras, <b>de</b> Tipo salida obtener producto (ComplexType
	 * relacionado a la representacion XML del servicio) <b>a</b> Tipo salida
	 * obtener producto objeto con valores de servicio.
	 *
	 * @param atsop_tipoSalidaObtenerProducto el parametro que representa el complex
	 *                                        type a convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como TipoSalidaObtenerProductoVO.
	 */
	public static TipoSalidaObtenerProductoVO tipoAVo(TipoSalidaObtenerProducto atsop_tipoSalidaObtenerProducto) {
		TipoSalidaObtenerProductoVO ltsop_tipoSalidaObtenerProductoVo = new TipoSalidaObtenerProductoVO();

		ltsop_tipoSalidaObtenerProductoVo.setIb_archivo(atsop_tipoSalidaObtenerProducto.getArchivo());
		ltsop_tipoSalidaObtenerProductoVo.setIs_codigoMensaje(atsop_tipoSalidaObtenerProducto.getCodigoMensaje());
		ltsop_tipoSalidaObtenerProductoVo
				.setIs_descripcionMensaje(atsop_tipoSalidaObtenerProducto.getDescripcionMensaje());

		return ltsop_tipoSalidaObtenerProductoVo;
	}
}
