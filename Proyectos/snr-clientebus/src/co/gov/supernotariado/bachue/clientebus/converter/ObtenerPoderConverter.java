package co.gov.supernotariado.bachue.clientebus.converter;

import co.gov.supernotariado.bachue.clientebus.poderes.types.obtenerPoder.TipoEntradaObtenerPoder;
import co.gov.supernotariado.bachue.clientebus.poderes.types.obtenerPoder.TipoSalidaObtenerPoder;
import co.gov.supernotariado.bachue.clientebus.vo.poderes.obtenerpoder.TipoEntradaObtenerPoderVO;
import co.gov.supernotariado.bachue.clientebus.vo.poderes.obtenerpoder.TipoSalidaObtenerPoderVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Obtener
 * poder. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ObtenerPoderConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ObtenerPoderConverter.
	 */
	private ObtenerPoderConverter() {
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
	 * Especificamente convierte <b>de</b> TipoEntradaObtenerPoderVO <b>a</b>
	 * TipoEntradaObtenerPoder, <br>
	 * En otras palabras, <b>de</b> Tipo entrada obtener poder objeto con
	 * valores de servicio <b>a</b> Tipo entrada obtener poder (ComplexType
	 * relacionado a la representacion XML del servicio).
	 *
	 * @param ateop_tipoEntradaObtenerPoderVO el parametro que representa el
	 *                                              objeto con valores de servicio a
	 *                                              convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como TipoEntradaObtenerPoder.
	 */
	public static TipoEntradaObtenerPoder voATipo(
			TipoEntradaObtenerPoderVO ateop_tipoEntradaObtenerPoderVO) {
		TipoEntradaObtenerPoder lteop_tipoEntradaObtenerPoder = new TipoEntradaObtenerPoder();
		lteop_tipoEntradaObtenerPoder.setDID(ateop_tipoEntradaObtenerPoderVO.getIs_did());
		lteop_tipoEntradaObtenerPoder.setDDocName(ateop_tipoEntradaObtenerPoderVO.getIs_dDocName());
		return lteop_tipoEntradaObtenerPoder;
	}
	
	/**
	 * Metodo que convierte de ComplexType a VO ( De elemento especifico del esquema
	 * de un Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto con un resultado/salida de una peticion de
	 * Servicio SOAP, en un objeto de datos llamado VO; para ser retornado como
	 * resultado a la aplicacion o capa de negocio que consume el cliente de
	 * servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaObtenerPoder
	 * <b>a</b> TipoSalidaObtenerPoderVO, <br>
	 * En otras palabras, <b>de</b> Tipo salida obtener poder
	 * (ComplexType relacionado a la representacion XML del servicio) <b>a</b> Tipo
	 * salida obtener poder objeto con valores de servicio.
	 *
	 * @param atsop_tipoSalidaObtenerPoder el parametro que representa
	 *                                                   el complex type a
	 *                                                   convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como TipoSalidaObtenerPoderVO.
	 */
	public static TipoSalidaObtenerPoderVO tipoAVo(
			TipoSalidaObtenerPoder atsop_tipoSalidaObtenerPoder) {
		TipoSalidaObtenerPoderVO ltsop_tipoSalidaObtenerPoderVo = new TipoSalidaObtenerPoderVO();
		ltsop_tipoSalidaObtenerPoderVo.setIb_archivo(atsop_tipoSalidaObtenerPoder.getArchivo());
		ltsop_tipoSalidaObtenerPoderVo.setIi_codigoMensaje(atsop_tipoSalidaObtenerPoder.getCodigoMensaje());
		ltsop_tipoSalidaObtenerPoderVo.setIs_descripcionMensaje(atsop_tipoSalidaObtenerPoder.getDescripcionMensaje());
		return ltsop_tipoSalidaObtenerPoderVo;
	}
}
