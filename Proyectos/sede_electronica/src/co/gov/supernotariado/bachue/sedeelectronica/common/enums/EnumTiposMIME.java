/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnumTiposMIME.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.enums
 * Nombre del elemento: EnumTiposMIME
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.enums;

/**
 * Enumeracion para definir el grupo de constantes para Tipos MIME. <br>
 * Enum que contiene tipos de MIME de las extensiones, (Media Types,
 * Multipurpose Internet Mail Extensions)
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumTiposMIME {

	/**
	 * Constante de la enumeracion para definir el item: PDF.
	 */
	PDF("application/pdf;charset=utf-8"),

	/**
	 * Constante de la enumeracion para definir el item: XLSX.
	 */
	XLSX("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet;charset=utf-8"),

	/**
	 * Constante de la enumeracion para definir el item: CSV.
	 */
	CSV("text/plain;charset=utf-8");

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo mime.
	 */
	private final String is_tipoMime;

	/**
	 * Construye una nueva instancia/objeto de la clase EnumTiposMIME.
	 *
	 * @param as_tipoMime el parametro tipo mime
	 */
	private EnumTiposMIME(String as_tipoMime) {
		this.is_tipoMime = as_tipoMime;
	}

	/**
	 * Obtiene el valor para la propiedad tipo mime.
	 *
	 * @return El valor de la propiedad tipo mime
	 */
	public String getIs_tipoMime() {
		return is_tipoMime;
	}

}
