/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: DocumentoWsDtoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: DocumentoWsDtoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import co.gov.supernotariado.bachue.clientebus.vo.consultartrazabilidad.DocumentoVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.DocumentoWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Documento ws
 * dto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class DocumentoWsDtoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase DocumentoWsDtoConverter.
	 */
	private DocumentoWsDtoConverter() {
		// Constructor vacio de la clase
	}
	
	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> DocumentoVO <b>a</b> DocumentoWSDTO, <br>
	 * En otras palabras, <b>de</b> Documento objeto con valores de servicio
	 * <b>a</b> Documento web service dto.
	 *
	 * @param ad_documento el parametro documento
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como DocumentoWSDTO
	 */
	public static DocumentoWSDTO entidadAVo(DocumentoVO ad_documento) {
		
		DocumentoWSDTO ld_documento = new DocumentoWSDTO();
		
		ld_documento.setIs_fechaDocumento(ad_documento.getIs_fechaDocumento());
		ld_documento.setIs_municipio(ad_documento.getIs_municipio());
		ld_documento.setIs_numeroDocumento(ad_documento.getIs_numeroDocumento());
		ld_documento.setIs_oficinaOrigen(ad_documento.getIs_oficinaOrigen());
		ld_documento.setIs_tipo(ad_documento.getIs_tipo());
		ld_documento.setIs_tipoEntidad(ad_documento.getIs_tipoEntidad());
		ld_documento.setIs_departamento(ad_documento.getIs_departamento());
		ld_documento.setIs_tipoOficina(ad_documento.getIs_tipoOficina());
		
		return ld_documento;
	}
}
