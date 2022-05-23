/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: ObtenerArchivoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: ObtenerArchivoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import co.gov.supernotariado.bachue.clientebus.busquedadocumentos.types.obtenerarchivo.TipoEntradaObtenerArchivo;
import co.gov.supernotariado.bachue.clientebus.busquedadocumentos.types.obtenerarchivo.TipoSalidaObtenerArchivo;
import co.gov.supernotariado.bachue.clientebus.vo.busquedadocumentos.TipoEntradaObtenerArchivoVO;
import co.gov.supernotariado.bachue.clientebus.vo.busquedadocumentos.TipoSalidaObtenerArchivoVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Obtener
 * archivo. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ObtenerArchivoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase ObtenerArchivoConverter.
	 */
	private ObtenerArchivoConverter() {
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
	 * Especificamente convierte <b>de</b> TipoSalidaObtenerArchivo <b>a</b>
	 * TipoSalidaObtenerArchivoVO, <br>
	 * En otras palabras, <b>de</b> Tipo salida obtener archivo (ComplexType
	 * relacionado a la representacion XML del servicio) <b>a</b> Tipo salida
	 * obtener archivo objeto con valores de servicio.
	 *
	 * @param atsoa_tipoSalidaObtenerArchivo el parametro que representa el complex
	 *                                       type a convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como TipoSalidaObtenerArchivoVO.
	 */
	public static TipoSalidaObtenerArchivoVO tipoAVo(TipoSalidaObtenerArchivo atsoa_tipoSalidaObtenerArchivo) {
		TipoSalidaObtenerArchivoVO ltsoa_tipoSalidaObtenerArchivoVO = new TipoSalidaObtenerArchivoVO();
		ltsoa_tipoSalidaObtenerArchivoVO.setIb_archivo(atsoa_tipoSalidaObtenerArchivo.getArchivo());
		ltsoa_tipoSalidaObtenerArchivoVO
				.setIs_codigoMensaje(String.valueOf(atsoa_tipoSalidaObtenerArchivo.getCodigoMensaje()));
		ltsoa_tipoSalidaObtenerArchivoVO
				.setIs_descripcionMensaje(atsoa_tipoSalidaObtenerArchivo.getDescripcionMensaje());
		return ltsoa_tipoSalidaObtenerArchivoVO;
	}

	/**
	 * Metodo que convierte de VO a ComplexType (De Objeto de valores de Servicio,
	 * entrada del cliente bus; a elemento especifico del esquema de un Servicio
	 * Web, entrada de una peticion de Servicio SOAP).<br>
	 * Se usa para convertir un objeto con las entradas de un servicio web (objeto
	 * VO), a un objeto ComplexType para ser enviado en una operacion de un
	 * servicio. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoEntradaObtenerArchivoVO <b>a</b>
	 * TipoEntradaObtenerArchivo, <br>
	 * En otras palabras, <b>de</b> Tipo entrada obtener archivo objeto con valores
	 * de servicio <b>a</b> Tipo entrada obtener archivo (ComplexType relacionado a
	 * la representacion XML del servicio).
	 *
	 * @param ateoa_tipoEntradaObtenerArchivoVO el parametro que representa el
	 *                                          objeto con valores de servicio a
	 *                                          convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como TipoEntradaObtenerArchivo.
	 */
	public static TipoEntradaObtenerArchivo voATipo(TipoEntradaObtenerArchivoVO ateoa_tipoEntradaObtenerArchivoVO) {
		TipoEntradaObtenerArchivo lteoa_tipoEntradaObtenerArchivo = new TipoEntradaObtenerArchivo();
		lteoa_tipoEntradaObtenerArchivo.setDID(ateoa_tipoEntradaObtenerArchivoVO.getIs_dId());
		lteoa_tipoEntradaObtenerArchivo.setDDocName(ateoa_tipoEntradaObtenerArchivoVO.getIs_dDocName());
		return lteoa_tipoEntradaObtenerArchivo;
	}
}
