/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BusquedaCargandoArchivoDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: BusquedaCargandoArchivoDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Busqueda cargando
 * archivo.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class BusquedaCargandoArchivoDTO extends GenericoBaseDTO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad archivo
	 * cargado.
	 */
	private Boolean ib_archivoCargado;
	
	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad archivo
	 * no cargado.
	 */
	private Boolean ib_archivoNoCargado;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre archivo cargado.
	 */
	private String is_nombreArchivoCargado;
	
	/**
	 * Atributo de instancia tipo ArchivoDTO para definir la propiedad archivo.
	 */
	private ArchivoDTO ia_archivoDto;
	
	/**
	 * Atributo de instancia tipo CatalogoDTO para definir la propiedad catalogo
	 * documento.
	 */
	private CatalogoDTO ic_catalogoDocumentoDto;

	/**
	 * Obtiene el valor para la propiedad archivo cargado.
	 *
	 * @return El valor de la propiedad archivo cargado
	 */
	public Boolean getIb_archivoCargado() {
		return ib_archivoCargado;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad archivo cargado.
	 *
	 * @param ab_archivoCargado el nuevo valor para la propiedad archivo cargado
	 */
	public void setIb_archivoCargado(Boolean ab_archivoCargado) {
		this.ib_archivoCargado = ab_archivoCargado;
	}

	/**
	 * Obtiene el valor para la propiedad archivo no cargado.
	 *
	 * @return El valor de la propiedad archivo no cargado
	 */
	public Boolean getIb_archivoNoCargado() {
		return ib_archivoNoCargado;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad archivo no cargado.
	 *
	 * @param ab_archivoNoCargado el nuevo valor para la propiedad archivo no
	 *                            cargado
	 */
	public void setIb_archivoNoCargado(Boolean ab_archivoNoCargado) {
		this.ib_archivoNoCargado = ab_archivoNoCargado;
	}

	/**
	 * Obtiene el valor para la propiedad nombre archivo cargado.
	 *
	 * @return El valor de la propiedad nombre archivo cargado
	 */
	public String getIs_nombreArchivoCargado() {
		return is_nombreArchivoCargado;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nombre archivo cargado.
	 *
	 * @param as_nombreArchivoCargado el nuevo valor para la propiedad nombre
	 *                                archivo cargado
	 */
	public void setIs_nombreArchivoCargado(String as_nombreArchivoCargado) {
		this.is_nombreArchivoCargado = as_nombreArchivoCargado;
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

	/**
	 * Obtiene el valor para la propiedad catalogo documento dto.
	 *
	 * @return El valor de la propiedad catalogo documento dto
	 */
	public CatalogoDTO getIc_catalogoDocumentoDto() {
		return ic_catalogoDocumentoDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad catalogo documento dto.
	 *
	 * @param ac_catalogoDocumentoDto el nuevo valor para la propiedad catalogo
	 *                                documento dto
	 */
	public void setIc_catalogoDocumentoDto(CatalogoDTO ac_catalogoDocumentoDto) {
		this.ic_catalogoDocumentoDto = ac_catalogoDocumentoDto;
	}

}