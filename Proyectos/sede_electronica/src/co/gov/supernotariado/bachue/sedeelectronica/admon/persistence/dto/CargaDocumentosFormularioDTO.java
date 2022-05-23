/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: CargaDocumentosFormularioDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: CargaDocumentosFormularioDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Carga documentos
 * formulario.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class CargaDocumentosFormularioDTO extends GenericoDTO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo CatalogoDocumentalDTO para definir la propiedad catalogo
	 * documento.
	 */
	private CatalogoDocumentalDTO icd_catalogoDocumentoDto;
	
	/**
	 * Atributo de instancia tipo ArchivoDTO para definir la propiedad archivo.
	 */
	private ArchivoDTO ia_archivoDto;
	
	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad
	 * desactivar botones carga.
	 */
	private Boolean ib_desactivarBotonesCarga;
	
	/**
	 * Obtiene el valor para la propiedad desactivar botones carga.
	 *
	 * @return El valor de la propiedad desactivar botones carga
	 */
	public Boolean getIb_desactivarBotonesCarga() {
		return ib_desactivarBotonesCarga;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad desactivar botones carga.
	 *
	 * @param ab_desactivarBotonesCarga el nuevo valor para la propiedad desactivar
	 *                                  botones carga
	 */
	public void setIb_desactivarBotonesCarga(Boolean ab_desactivarBotonesCarga) {
		this.ib_desactivarBotonesCarga = ab_desactivarBotonesCarga;
	}

	/**
	 * Obtiene el valor para la propiedad catalogo documento dto.
	 *
	 * @return El valor de la propiedad catalogo documento dto
	 */
	public CatalogoDocumentalDTO getIcd_catalogoDocumentoDto() {
		return icd_catalogoDocumentoDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad catalogo documento dto.
	 *
	 * @param acd_catalogoDocumentoDto el nuevo valor para la propiedad catalogo
	 *                                documento dto
	 */
	public void setIcd_catalogoDocumentoDto(CatalogoDocumentalDTO acd_catalogoDocumentoDto) {
		this.icd_catalogoDocumentoDto = acd_catalogoDocumentoDto;
	}
	
	/**
	 * Obtiene el valor para la propiedad archivo dto.
	 *
	 * @return El valor de la propiedad archivo dto
	 */
	public ArchivoDTO getIa_archivoDto() {
		return ia_archivoDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad archivo dto.
	 *
	 * @param aa_archivoDto el nuevo valor para la propiedad archivo dto
	 */
	public void setIa_archivoDto(ArchivoDTO aa_archivoDto) {
		this.ia_archivoDto = aa_archivoDto;
	}


}