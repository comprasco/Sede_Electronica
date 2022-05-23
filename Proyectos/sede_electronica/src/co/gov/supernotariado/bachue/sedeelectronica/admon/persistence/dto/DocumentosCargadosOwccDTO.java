/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: DocumentosCargadosOwccDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: DocumentosCargadosOwccDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Documentos
 * cargados owcc.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class DocumentosCargadosOwccDTO extends GenericoBaseDTO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad id
	 * owcc.
	 */
	private String is_idOwcc;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nir.
	 */
	private String is_nir;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo documental.
	 */
	private String is_tipoDocumental;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre documento.
	 */
	private String is_nombreDocumento;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * observaciones.
	 */
	private String is_observaciones;
	
	private String is_nombreTipoDocumental;

	/**
	 * Obtiene el valor para la propiedad id owcc.
	 *
	 * @return El valor de la propiedad id owcc
	 */
	public String getIs_idOwcc() {
		return is_idOwcc;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id owcc.
	 *
	 * @param as_idOwcc el nuevo valor para la propiedad id owcc
	 */
	public void setIs_idOwcc(String as_idOwcc) {
		this.is_idOwcc = as_idOwcc;
	}

	/**
	 * Obtiene el valor para la propiedad nir.
	 *
	 * @return El valor de la propiedad nir
	 */
	public String getIs_nir() {
		return is_nir;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nir.
	 *
	 * @param as_nir el nuevo valor para la propiedad nir
	 */
	public void setIs_nir(String as_nir) {
		this.is_nir = as_nir;
	}

	/**
	 * Obtiene el valor para la propiedad tipo documental.
	 *
	 * @return El valor de la propiedad tipo documental
	 */
	public String getIs_tipoDocumental() {
		return is_tipoDocumental;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo documental.
	 *
	 * @param as_tipoDocumental el nuevo valor para la propiedad tipo documental
	 */
	public void setIs_tipoDocumental(String as_tipoDocumental) {
		this.is_tipoDocumental = as_tipoDocumental;
	}

	/**
	 * Obtiene el valor para la propiedad nombre documento.
	 *
	 * @return El valor de la propiedad nombre documento
	 */
	public String getIs_nombreDocumento() {
		return is_nombreDocumento;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nombre documento.
	 *
	 * @param as_nombreDocumento el nuevo valor para la propiedad nombre documento
	 */
	public void setIs_nombreDocumento(String as_nombreDocumento) {
		this.is_nombreDocumento = as_nombreDocumento;
	}

	/**
	 * Obtiene el valor para la propiedad observaciones.
	 *
	 * @return El valor de la propiedad observaciones
	 */
	public String getIs_observaciones() {
		return is_observaciones;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad observaciones.
	 *
	 * @param as_observaciones el nuevo valor para la propiedad observaciones
	 */
	public void setIs_observaciones(String as_observaciones) {
		this.is_observaciones = as_observaciones;
	}

	public String getIs_nombreTipoDocumental() {
		return is_nombreTipoDocumental;
	}

	public void setIs_nombreTipoDocumental(String as_nombreTipoDocumental) {
		this.is_nombreTipoDocumental = as_nombreTipoDocumental;
	}

}