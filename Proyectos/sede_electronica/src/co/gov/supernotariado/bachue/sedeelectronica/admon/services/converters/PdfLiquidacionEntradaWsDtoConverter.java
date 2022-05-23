/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: PdfLiquidacionEntradaWsDtoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: PdfLiquidacionEntradaWsDtoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import co.gov.supernotariado.bachue.clientebus.vo.operacionesfinancieras.TipoEntradaObtenerPDFLiquidacionVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaObtenerPDFLiquidacionWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Pdf liquidacion
 * entrada ws dto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class PdfLiquidacionEntradaWsDtoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * PdfLiquidacionEntradaWsDtoConverter.
	 */
	private PdfLiquidacionEntradaWsDtoConverter() {
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
	 * Especificamente convierte <b>de</b> TipoEntradaObtenerPDFLiquidacionWSDTO
	 * <b>a</b> TipoEntradaObtenerPDFLiquidacionVO, <br>
	 * En otras palabras, <b>de</b> Tipo entrada obtener PDF liquidacion web service
	 * dto <b>a</b> Tipo entrada obtener PDF liquidacion objeto con valores de
	 * servicio.
	 *
	 * @param ateopl_obtenerPdfLiquidacionWsDto el parametro obtener pdf liquidacion
	 *                                          ws dto
	 * @return Resultado para convertir web service dto a objeto de valores de
	 *         servicio, retornado como TipoEntradaObtenerPDFLiquidacionVO
	 */
	public static TipoEntradaObtenerPDFLiquidacionVO voAEntidad(
			TipoEntradaObtenerPDFLiquidacionWSDTO ateopl_obtenerPdfLiquidacionWsDto) {
		TipoEntradaObtenerPDFLiquidacionVO lteopl_entradaObtenerPdfLiquidacionVo = new TipoEntradaObtenerPDFLiquidacionVO();
		lteopl_entradaObtenerPdfLiquidacionVo
				.setIs_numeroReferencia(ateopl_obtenerPdfLiquidacionWsDto.getIs_numeroReferencia());
		return lteopl_entradaObtenerPdfLiquidacionVo;
	}
}
