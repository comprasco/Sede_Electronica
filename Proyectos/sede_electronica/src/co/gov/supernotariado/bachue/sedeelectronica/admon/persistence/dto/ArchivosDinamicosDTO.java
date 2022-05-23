/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ArchivosDinamicosDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: ArchivosDinamicosDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

import java.io.Serializable;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Archivos
 * dinamicos.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ArchivosDinamicosDTO implements Serializable {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo arreglo de bytes para definir la propiedad archivo
	 * base 64.
	 */
	private byte[] ib_archivoBase64;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre archivo.
	 */
	private String is_nombreArchivo;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * extension.
	 */
	private String is_extension;

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
	 * @param as_nombreImagen el nuevo valor para la propiedad nombre archivo
	 */
	public void setIs_nombreArchivo(String as_nombreImagen) {
		this.is_nombreArchivo = as_nombreImagen;
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
	 * Obtiene el valor para la propiedad archivo base 64.
	 *
	 * @return El valor de la propiedad archivo base 64
	 */
	public byte[] getIb_archivoBase64() {
		return ib_archivoBase64;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad imagen base 64.
	 *
	 * @param ab_imagenBase64 el nuevo valor para la propiedad imagen base 64
	 */
	public void setIb_imagenBase64(byte[] ab_imagenBase64) {
		this.ib_archivoBase64 = ab_imagenBase64;
	}

}
