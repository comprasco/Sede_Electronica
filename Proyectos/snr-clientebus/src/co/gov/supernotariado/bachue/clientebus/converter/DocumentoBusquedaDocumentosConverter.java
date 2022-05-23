/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: DocumentoBusquedaDocumentosConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: DocumentoBusquedaDocumentosConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.busquedadocumentos.types.consultar.TipoDocumento;
import co.gov.supernotariado.bachue.clientebus.vo.busquedadocumentos.DocumentoVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Documento
 * busqueda documentos. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class DocumentoBusquedaDocumentosConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * DocumentoBusquedaDocumentosConverter.
	 */
	private DocumentoBusquedaDocumentosConverter() {
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
	 * Especificamente convierte <b>de</b> TipoDocumento <b>a</b> DocumentoVO, <br>
	 * En otras palabras, <b>de</b> Tipo documento (ComplexType relacionado a la
	 * representacion XML del servicio) <b>a</b> Documento objeto con valores de
	 * servicio.
	 *
	 * @param atd_documento el parametro que representa el complex type a convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como DocumentoVO.
	 */
	public static DocumentoVO tipoAVo(TipoDocumento atd_documento) {

		DocumentoVO ld_documentoVo = new DocumentoVO();

		ld_documentoVo.setIs_dId(atd_documento.getDID());
		ld_documentoVo.setIs_docName(atd_documento.getDocName());
		if (atd_documento.getTipoDocumental() != null)
			ld_documentoVo.setIs_tipoDocumental(atd_documento.getTipoDocumental().getValue());
		if (atd_documento.getOrip() != null)
			ld_documentoVo.setIs_orip(atd_documento.getOrip().getValue());
		if (atd_documento.getNir() != null)
			ld_documentoVo.setIs_nir(atd_documento.getNir().getValue());
		if (atd_documento.getCodOrip() != null)
			ld_documentoVo.setIs_codOrip(atd_documento.getCodOrip().getValue());
		if (atd_documento.getTurno() != null)
			ld_documentoVo.setIs_turno(atd_documento.getTurno().getValue());
		if (atd_documento.getUrlVisor() != null)
			ld_documentoVo.setIs_urlVisor(atd_documento.getUrlVisor().getValue());
		if (atd_documento.getFechaVigencia() != null)
			ld_documentoVo.setIs_fechaVigencia(atd_documento.getFechaVigencia().getValue());
		if (atd_documento.getFechaPublicacion() != null)
			ld_documentoVo.setIs_fechaPublicacion(atd_documento.getFechaPublicacion().getValue());
		if (atd_documento.getNombreInterviniente() != null)
			ld_documentoVo.setIs_nombreInterviniente(atd_documento.getNombreInterviniente().getValue());
		if (atd_documento.getIdentificacionInterviniente() != null)
			ld_documentoVo.setIs_identificacionInterviniente(atd_documento.getIdentificacionInterviniente().getValue());
		if (atd_documento.getNumeroPagina() != null)
			ld_documentoVo.setIs_numeroPagina(atd_documento.getNumeroPagina().getValue());
		if (atd_documento.getMatricula() != null)
			ld_documentoVo.setIs_matricula(atd_documento.getMatricula().getValue());
		if (atd_documento.getEntidadOrigen() != null)
			ld_documentoVo.setIs_entidadOrigen(atd_documento.getEntidadOrigen().getValue());
		if (atd_documento.getDocumentoRegistrado() != null)
			ld_documentoVo.setIs_documentoRegistrado(atd_documento.getDocumentoRegistrado().getValue());
		if (atd_documento.getNumeroDocumento() != null)
			ld_documentoVo.setIs_numeroDocumento(atd_documento.getNumeroDocumento().getValue());
		if (atd_documento.getFechaDocumento() != null)
			ld_documentoVo.setIs_fechaDocumento(atd_documento.getFechaDocumento().getValue());
		if (atd_documento.getPais() != null)
			ld_documentoVo.setIs_pais(atd_documento.getPais().getValue());
		if (atd_documento.getDepartamento() != null)
			ld_documentoVo.setIs_departamento(atd_documento.getDepartamento().getValue());
		if (atd_documento.getMunicipio() != null)
			ld_documentoVo.setIs_municipio(atd_documento.getMunicipio().getValue());
		if (atd_documento.getAnotacion() != null)
			ld_documentoVo.setIs_anotacion(atd_documento.getAnotacion().getValue());
		if (atd_documento.getNumeroFolios() != null)
			ld_documentoVo.setIs_numeroFolios(atd_documento.getNumeroFolios().getValue());
		if (atd_documento.getTipoOficina() != null)
			ld_documentoVo.setIs_tipoOficina(atd_documento.getTipoOficina().getValue());
		if (atd_documento.getActoNaturalezaJuridica() != null)
			ld_documentoVo.setIs_actoNaturalezaJuridica(atd_documento.getActoNaturalezaJuridica().getValue());
		if (atd_documento.getProceso() != null)
			ld_documentoVo.setIs_proceso(atd_documento.getProceso().getValue());
		if (atd_documento.getNirVinculado() != null)
			ld_documentoVo.setIs_nirVinculado(atd_documento.getNirVinculado().getValue());
		if (atd_documento.getTurnoVinculado() != null)
			ld_documentoVo.setIs_turnoVinculado(atd_documento.getTurnoVinculado().getValue());
		return ld_documentoVo;
	}

	/**
	 * Metodo que convierte de una lista de ComplexType a una lista de VO ( De una
	 * lista de elementos especificos del esquema de un Servicio Web, a una lista de
	 * Objetos de valores de Servicio).<br>
	 * Se usa para convertir una lista de objetos con un resultado/salida de una
	 * peticion de Servicio SOAP, en una lista de objetos de datos llamados VOs;
	 * para ser retornado como resultado a la aplicacion o capa de negocio que
	 * consume el cliente de servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoDocumento <b>a</b> DocumentoVO, <br>
	 * En otras palabras, <b>de</b> Tipo documento (ComplexType relacionado a la
	 * representacion XML del servicio) <b>a</b> Documento objeto con valores de
	 * servicio.
	 *
	 * @param altd_listaTipoDocumento el parametro que representa la lista de
	 *                                complex types a convertir.
	 * @return Resultado para la conversion de lista de complex types a lista de
	 *         objetos con valores de servicio, en este caso como lista de
	 *         DocumentoVO.
	 */
	public static List<DocumentoVO> listaTipoAListaVo(List<TipoDocumento> altd_listaTipoDocumento) {
		List<DocumentoVO> lld_listaDocumentoVo = new ArrayList<>();
		for (TipoDocumento ltd_documento : altd_listaTipoDocumento) {
			lld_listaDocumentoVo.add(tipoAVo(ltd_documento));
		}
		return lld_listaDocumentoVo;
	}

}
