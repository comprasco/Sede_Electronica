/**
 * 
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

import java.io.Serializable;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Documento.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class DocumentoDTO implements Serializable {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = -6001817937349600730L;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre documento.
	 */
	private String is_nombreDocumento;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad id
	 * documento.
	 */
	private String is_idDocumento;
	
	/**
	 * Atributo de instancia tipo arreglo de bytes para definir la propiedad
	 * documento.
	 */
	private byte[] ib_documento;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * ruta.
	 */
	private String is_ruta;

	/**
	 * Obtiene el valor para la propiedad ruta.
	 *
	 * @return El valor de la propiedad ruta
	 */
	public String getIs_ruta() {
		return is_ruta;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad ruta.
	 *
	 * @param as_ruta el nuevo valor para la propiedad ruta
	 */
	public void setIs_ruta(String as_ruta) {
		this.is_ruta = as_ruta;
	}

	/**
	 * Obtiene el valor para la propiedad id documento.
	 *
	 * @return El valor de la propiedad id documento
	 */
	public String getIs_idDocumento() {
		return is_idDocumento;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id documento.
	 *
	 * @param as_idDocumento el nuevo valor para la propiedad id documento
	 */
	public void setIs_idDocumento(String as_idDocumento) {
		this.is_idDocumento = as_idDocumento;
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
	 * Obtiene el valor para la propiedad documento.
	 *
	 * @return El valor de la propiedad documento
	 */
	public byte[] getIb_documento() {
		return ib_documento;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad documento.
	 *
	 * @param ab_documento el nuevo valor para la propiedad documento
	 */
	public void setIb_documento(byte[] ab_documento) {
		this.ib_documento = ab_documento;
	}

}
