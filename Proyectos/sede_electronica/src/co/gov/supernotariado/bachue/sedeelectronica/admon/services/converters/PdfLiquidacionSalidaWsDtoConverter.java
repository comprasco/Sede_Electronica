/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: PdfLiquidacionSalidaWsDtoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: PdfLiquidacionSalidaWsDtoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import co.gov.supernotariado.bachue.clientebus.vo.operacionesfinancieras.TipoSalidaObtenerPDFLiquidacionVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.ObtenerPdfLiquidacionSalidaWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Pdf liquidacion
 * salida ws dto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class PdfLiquidacionSalidaWsDtoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * PdfLiquidacionSalidaWsDtoConverter.
	 */
	private PdfLiquidacionSalidaWsDtoConverter() {
		// Constructor vacio de la clase
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaObtenerPDFLiquidacionVO
	 * <b>a</b> ObtenerPdfLiquidacionSalidaWSDTO, <br>
	 * En otras palabras, <b>de</b> Tipo salida obtener PDF liquidacion objeto con
	 * valores de servicio <b>a</b> Obtener pdf liquidacion salida web service dto.
	 *
	 * @param atsopl_salidaObtenerPdfLiquidacionVo el parametro salida obtener pdf
	 *                                             liquidacion vo
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como ObtenerPdfLiquidacionSalidaWSDTO
	 */
	public static ObtenerPdfLiquidacionSalidaWSDTO entidadAVo(
			TipoSalidaObtenerPDFLiquidacionVO atsopl_salidaObtenerPdfLiquidacionVo) {
		ObtenerPdfLiquidacionSalidaWSDTO lopls_obtenerPdfLiquidacionSalidaVo = new ObtenerPdfLiquidacionSalidaWSDTO();

		lopls_obtenerPdfLiquidacionSalidaVo
				.setIb_documentoSerializado(atsopl_salidaObtenerPdfLiquidacionVo.getIb_documentoSerializado());
		lopls_obtenerPdfLiquidacionSalidaVo
				.setIs_codigoMensaje(atsopl_salidaObtenerPdfLiquidacionVo.getIs_codigoMensaje());
		lopls_obtenerPdfLiquidacionSalidaVo
				.setIs_descripcionMensaje(atsopl_salidaObtenerPdfLiquidacionVo.getIs_descripcionMensaje());

		return lopls_obtenerPdfLiquidacionSalidaVo;
	}
}
