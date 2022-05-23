/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnumTipoPersona.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.enums
 * Nombre del elemento: EnumTipoPersona
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.enums;

/**
 * Enumeracion para definir el grupo de constantes para Tipo persona. <br>
 * Enum que contiene el detalle de los tipos de persona
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumTipoPersona {

	/**
	 * Constante de la enumeracion para definir el item: NATURAL.
	 */
	NATURAL("N", "PERSONA_NATURAL", "NATURAL", "Natural"),

	/**
	 * Constante de la enumeracion para definir el item: JURIDICA.
	 */
	JURIDICA("J", "PERSONA_JURIDICA", "JURIDICA", "Juridica");

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo.
	 */
	private String is_codigo;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre.
	 */
	private String is_nombre;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * parametro.
	 */
	private String is_parametro;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre consulta.
	 */
	private String is_nombreConsulta;

	/**
	 * Construye una nueva instancia/objeto de la clase EnumTipoPersona.
	 *
	 * @param as_codigo         el parametro codigo
	 * @param as_nombre         el parametro nombre
	 * @param as_parametro      el parametro parametro
	 * @param as_nombreConsulta el parametro nombre consulta
	 */
	private EnumTipoPersona(String as_codigo, String as_nombre, String as_parametro, String as_nombreConsulta) {
		this.is_codigo = as_codigo;
		this.is_nombre = as_nombre;
		this.is_parametro = as_parametro;
		this.is_nombreConsulta = as_nombreConsulta;
	}

	/**
	 * Obtiene el valor para la propiedad codigo.
	 *
	 * @return El valor de la propiedad codigo
	 */
	public String getIs_codigo() {
		return is_codigo;
	}

	/**
	 * Obtiene el valor para la propiedad nombre.
	 *
	 * @return El valor de la propiedad nombre
	 */
	public String getIs_nombre() {
		return is_nombre;
	}

	/**
	 * Obtiene el valor para la propiedad nombre consulta.
	 *
	 * @return El valor de la propiedad nombre consulta
	 */
	public String getIs_nombreConsulta() {
		return is_nombreConsulta;
	}

	/**
	 * Obtiene el valor para la propiedad parametro.
	 *
	 * @return El valor de la propiedad parametro
	 */
	public String getIs_parametro() {
		return is_parametro;
	}

}
