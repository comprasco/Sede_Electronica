/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnumExtension.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.enums
 * Nombre del elemento: EnumExtension
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.enums;

/**
 * Enumeracion para definir el grupo de constantes para Extension. <br>
 * Enum que contiene extensiones
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumExtension {

	/**
	 * Constante de la enumeracion para definir el item: XHTML.
	 */
	XHTML(".xhtml"),

	/**
	 * Constante de la enumeracion para definir el item: JSF.
	 */
	JSF(".jsf");

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * extension.
	 */
	private final String is_extension;

	/**
	 * Construye una nueva instancia/objeto de la clase EnumExtension.
	 *
	 * @param is_nombreParametro el parametro nombre parametro
	 */
	private EnumExtension(String is_nombreParametro) {
		this.is_extension = is_nombreParametro;
	}

	/**
	 * Obtiene el valor para la propiedad extension.
	 *
	 * @return El valor de la propiedad extension
	 */
	public String getIs_extension() {
		return is_extension;
	}
}
