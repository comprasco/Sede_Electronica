/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: ObtenerPdfLiquidacionConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: ObtenerPdfLiquidacionConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import co.gov.supernotariado.bachue.clientebus.operacionesfinancieras.types.obtenerpdfliquidacion.TipoEntradaObtenerPDFLiquidacion;
import co.gov.supernotariado.bachue.clientebus.operacionesfinancieras.types.obtenerpdfliquidacion.TipoSalidaObtenerPDFLiquidacion;
import co.gov.supernotariado.bachue.clientebus.vo.operacionesfinancieras.TipoEntradaObtenerPDFLiquidacionVO;
import co.gov.supernotariado.bachue.clientebus.vo.operacionesfinancieras.TipoSalidaObtenerPDFLiquidacionVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Obtener pdf
 * liquidacion. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ObtenerPdfLiquidacionConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ObtenerPdfLiquidacionConverter.
	 */
	private ObtenerPdfLiquidacionConverter() {
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
	 * Especificamente convierte <b>de</b> TipoSalidaObtenerPDFLiquidacion <b>a</b>
	 * TipoSalidaObtenerPDFLiquidacionVO, <br>
	 * En otras palabras, <b>de</b> Tipo salida obtener PDF liquidacion (ComplexType
	 * relacionado a la representacion XML del servicio) <b>a</b> Tipo salida
	 * obtener PDF liquidacion objeto con valores de servicio.
	 *
	 * @param atsopl_salidaObtenerPdfLiquidacion el parametro que representa el
	 *                                           complex type a convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como TipoSalidaObtenerPDFLiquidacionVO.
	 */
	public static TipoSalidaObtenerPDFLiquidacionVO tipoAVo(
			TipoSalidaObtenerPDFLiquidacion atsopl_salidaObtenerPdfLiquidacion) {
		TipoSalidaObtenerPDFLiquidacionVO ltsopl_obtenerPdfLiquidacionSalidaVo = new TipoSalidaObtenerPDFLiquidacionVO();

		ltsopl_obtenerPdfLiquidacionSalidaVo
				.setIb_documentoSerializado(atsopl_salidaObtenerPdfLiquidacion.getDocumentoSerializado());
		ltsopl_obtenerPdfLiquidacionSalidaVo
				.setIs_codigoMensaje(atsopl_salidaObtenerPdfLiquidacion.getCodigoMensaje().toString());
		if (atsopl_salidaObtenerPdfLiquidacion.getDescripcionMensaje() != null)
			ltsopl_obtenerPdfLiquidacionSalidaVo
					.setIs_descripcionMensaje(atsopl_salidaObtenerPdfLiquidacion.getDescripcionMensaje().getValue());

		return ltsopl_obtenerPdfLiquidacionSalidaVo;
	}

	/**
	 * Metodo que convierte de VO a ComplexType (De Objeto de valores de Servicio,
	 * entrada del cliente bus; a elemento especifico del esquema de un Servicio
	 * Web, entrada de una peticion de Servicio SOAP).<br>
	 * Se usa para convertir un objeto con las entradas de un servicio web (objeto
	 * VO), a un objeto ComplexType para ser enviado en una operacion de un
	 * servicio. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoEntradaObtenerPDFLiquidacionVO
	 * <b>a</b> TipoEntradaObtenerPDFLiquidacion, <br>
	 * En otras palabras, <b>de</b> Tipo entrada obtener PDF liquidacion objeto con
	 * valores de servicio <b>a</b> Tipo entrada obtener PDF liquidacion
	 * (ComplexType relacionado a la representacion XML del servicio).
	 *
	 * @param ateopl_obtenerPdfLiquidacionVo el parametro que representa el objeto
	 *                                       con valores de servicio a convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como TipoEntradaObtenerPDFLiquidacion.
	 */
	public static TipoEntradaObtenerPDFLiquidacion voATipo(
			TipoEntradaObtenerPDFLiquidacionVO ateopl_obtenerPdfLiquidacionVo) {
		TipoEntradaObtenerPDFLiquidacion lteopl_entradaObtenerPdfLiquidacion = new TipoEntradaObtenerPDFLiquidacion();
		lteopl_entradaObtenerPdfLiquidacion
				.setNumeroReferencia(ateopl_obtenerPdfLiquidacionVo.getIs_numeroReferencia());
		return lteopl_entradaObtenerPdfLiquidacion;
	}

}
