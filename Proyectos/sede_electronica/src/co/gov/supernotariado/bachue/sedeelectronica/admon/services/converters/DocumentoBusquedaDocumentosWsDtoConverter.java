/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: DocumentoBusquedaDocumentosWsDtoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: DocumentoBusquedaDocumentosWsDtoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.vo.busquedadocumentos.DocumentoVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.DocumentoBusquedaDocumentosWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Documento
 * busqueda documentos ws dto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class DocumentoBusquedaDocumentosWsDtoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * DocumentoBusquedaDocumentosWsDtoConverter.
	 */
	private DocumentoBusquedaDocumentosWsDtoConverter() {
		// Constructor vacio de la clase
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> DocumentoVO <b>a</b>
	 * DocumentoBusquedaDocumentosWSDTO, <br>
	 * En otras palabras, <b>de</b> Documento objeto con valores de servicio
	 * <b>a</b> Documento busqueda documentos web service dto.
	 *
	 * @param ad_documentoVo el parametro documento vo
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como DocumentoBusquedaDocumentosWSDTO
	 */
	public static DocumentoBusquedaDocumentosWSDTO voAWsDto(DocumentoVO ad_documentoVo) {

		DocumentoBusquedaDocumentosWSDTO ldbd_documentoBusquedaDocumentoWsDto = new DocumentoBusquedaDocumentosWSDTO();
		ldbd_documentoBusquedaDocumentoWsDto.setIs_dId(ad_documentoVo.getIs_dId());
		ldbd_documentoBusquedaDocumentoWsDto.setIs_docName(ad_documentoVo.getIs_docName());
		ldbd_documentoBusquedaDocumentoWsDto.setIs_tipoDocumental(ad_documentoVo.getIs_tipoDocumental());
		ldbd_documentoBusquedaDocumentoWsDto.setIs_orip(ad_documentoVo.getIs_orip());
		ldbd_documentoBusquedaDocumentoWsDto.setIs_nir(ad_documentoVo.getIs_nir());
		ldbd_documentoBusquedaDocumentoWsDto.setIs_codOrip(ad_documentoVo.getIs_codOrip());
		ldbd_documentoBusquedaDocumentoWsDto.setIs_turno(ad_documentoVo.getIs_turno());
		ldbd_documentoBusquedaDocumentoWsDto.setIs_urlVisor(ad_documentoVo.getIs_urlVisor());
		ldbd_documentoBusquedaDocumentoWsDto.setIs_fechaVigencia(ad_documentoVo.getIs_fechaVigencia());
		ldbd_documentoBusquedaDocumentoWsDto.setIs_fechaPublicacion(ad_documentoVo.getIs_fechaPublicacion());
		ldbd_documentoBusquedaDocumentoWsDto.setIs_nombreInterviniente(ad_documentoVo.getIs_nombreInterviniente());
		ldbd_documentoBusquedaDocumentoWsDto
				.setIs_identificacionInterviniente(ad_documentoVo.getIs_identificacionInterviniente());
		ldbd_documentoBusquedaDocumentoWsDto.setIs_numeroPagina(ad_documentoVo.getIs_numeroPagina());
		ldbd_documentoBusquedaDocumentoWsDto.setIs_matricula(ad_documentoVo.getIs_matricula());
		ldbd_documentoBusquedaDocumentoWsDto.setIs_entidadOrigen(ad_documentoVo.getIs_entidadOrigen());
		ldbd_documentoBusquedaDocumentoWsDto.setIs_documentoRegistrado(ad_documentoVo.getIs_documentoRegistrado());
		ldbd_documentoBusquedaDocumentoWsDto.setIs_numeroDocumento(ad_documentoVo.getIs_numeroDocumento());
		ldbd_documentoBusquedaDocumentoWsDto.setIs_fechaDocumento(ad_documentoVo.getIs_fechaDocumento());
		ldbd_documentoBusquedaDocumentoWsDto.setIs_pais(ad_documentoVo.getIs_pais());
		ldbd_documentoBusquedaDocumentoWsDto.setIs_departamento(ad_documentoVo.getIs_departamento());
		ldbd_documentoBusquedaDocumentoWsDto.setIs_municipio(ad_documentoVo.getIs_municipio());
		ldbd_documentoBusquedaDocumentoWsDto.setIs_anotacion(ad_documentoVo.getIs_anotacion());
		ldbd_documentoBusquedaDocumentoWsDto.setIs_numeroFolios(ad_documentoVo.getIs_numeroFolios());
		ldbd_documentoBusquedaDocumentoWsDto.setIs_tipoOficina(ad_documentoVo.getIs_tipoOficina());
		ldbd_documentoBusquedaDocumentoWsDto
				.setIs_actoNaturalezaJuridica(ad_documentoVo.getIs_actoNaturalezaJuridica());
		ldbd_documentoBusquedaDocumentoWsDto.setIs_proceso(ad_documentoVo.getIs_proceso());
		ldbd_documentoBusquedaDocumentoWsDto.setIs_nirVinculado(ad_documentoVo.getIs_nirVinculado());
		ldbd_documentoBusquedaDocumentoWsDto.setIs_turnoVinculado(ad_documentoVo.getIs_turnoVinculado());
		return ldbd_documentoBusquedaDocumentoWsDto;
	}

	/**
	 * Metodo que convierte de una lista de VO a una lista de WSDTO (De Objetos de
	 * valores de Servicio, a Objetos de Transferencia de Datos de Servicio
	 * Web).<br>
	 * Se usa para convertir una lista de resultados o salidas de servicio(objetos
	 * VO) a una lista de objetos WSDTO para ser manipulados en la capa de negocio.
	 * <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> una DocumentoVO <b>a</b> una
	 * DocumentoBusquedaDocumentosWSDTO, <br>
	 * En otras palabras, <b>de</b> una Documento objeto con valores de servicio
	 * <b>a</b> una Documento busqueda documentos web service dto.
	 *
	 * @param ald_listaDocumento el parametro lista documento
	 * @return Resultado para convertir de lista de valores de servicio a lista de
	 *         web service dto, retornado como una lista de
	 *         DocumentoBusquedaDocumentosWSDTO
	 */
	public static List<DocumentoBusquedaDocumentosWSDTO> listaVOAListaWsDto(List<DocumentoVO> ald_listaDocumento) {
		List<DocumentoBusquedaDocumentosWSDTO> lldbd_listaDocumentoBusquedaDocumentosWsDto = new ArrayList<>();
		for (DocumentoVO ld_documento : ald_listaDocumento) {
			lldbd_listaDocumentoBusquedaDocumentosWsDto.add(voAWsDto(ld_documento));
		}
		return lldbd_listaDocumentoBusquedaDocumentosWsDto;
	}

}
