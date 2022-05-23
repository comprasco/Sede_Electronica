/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ArchivoDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: ArchivoDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Archivo.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ArchivoDTO extends GenericoDTO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo arreglo de bytes para definir la propiedad
	 * archivo.
	 */
	private byte[] if_archivo;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * archivo.
	 */
	private String is_archivo;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * extension.
	 */
	private String is_extension;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre archivo.
	 */
	private String is_nombreArchivo;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * content type.
	 */
	private String is_contentType;

	/**
	 * Construye una nueva instancia/objeto de la clase ArchivoDTO.
	 */
	public ArchivoDTO() {
		super();
	}

	/**
	 * Obtiene el valor para la propiedad archivo.
	 *
	 * @return El valor de la propiedad archivo
	 */
	public byte[] getIf_archivo() {
		return if_archivo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad archivo.
	 *
	 * @param af_archivo el nuevo valor para la propiedad archivo
	 */
	public void setIf_archivo(byte[] af_archivo) {
		this.if_archivo = af_archivo;
	}

	/**
	 * Obtiene el valor para la propiedad extension.
	 *
	 * @return El valor de la propiedad extension
	 */
	public String getIs_extension() {
		return is_extension;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad extension.
	 *
	 * @param as_extension el nuevo valor para la propiedad extension
	 */
	public void setIs_extension(String as_extension) {
		this.is_extension = as_extension;
	}

	/**
	 * Obtiene el valor para la propiedad nombre archivo.
	 *
	 * @return El valor de la propiedad nombre archivo
	 */
	public String getIs_nombreArchivo() {
		return is_nombreArchivo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nombre archivo.
	 *
	 * @param as_nombreArchivo el nuevo valor para la propiedad nombre archivo
	 */
	public void setIs_nombreArchivo(String as_nombreArchivo) {
		this.is_nombreArchivo = as_nombreArchivo;
	}

	/**
	 * Obtiene el valor para la propiedad content type.
	 *
	 * @return El valor de la propiedad content type
	 */
	public String getIs_contentType() {
		return is_contentType;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad content type.
	 *
	 * @param as_contentType el nuevo valor para la propiedad content type
	 */
	public void setIs_contentType(String as_contentType) {
		this.is_contentType = as_contentType;
	}

	/**
	 * Obtiene el valor para la propiedad archivo.
	 *
	 * @return El valor de la propiedad archivo
	 */
	public String getIs_archivo() {
		return is_archivo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad archivo.
	 *
	 * @param as_archivo el nuevo valor para la propiedad archivo
	 */
	public void setIs_archivo(String as_archivo) {
		this.is_archivo = as_archivo;
	}

}
