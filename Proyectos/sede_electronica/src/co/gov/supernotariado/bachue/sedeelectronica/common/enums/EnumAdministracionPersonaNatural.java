/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnumAdministracionPersonaNatural.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.enums
 * Nombre del elemento: EnumAdministracionPersonaNatural
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.enums;

/**
 * Enumeracion para definir el grupo de constantes para Administracion persona
 * natural. <br>
 * Enum que contiene los asociados y desasociados
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumAdministracionPersonaNatural {

	/**
	 * Constante de la enumeracion para definir el item: ASOCIADO.
	 */
	ASOCIADO("AS", "Asociados"),

	/**
	 * Constante de la enumeracion para definir el item: DESASOCIADO.
	 */
	DESASOCIADO("DES", "Desasociados");

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo.
	 */
	private String is_codigo;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * descripcion.
	 */
	private String is_descripcion;

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * EnumAdministracionPersonaNatural.
	 *
	 * @param as_codigo      el parametro codigo
	 * @param as_descripcion el parametro descripcion
	 */
	private EnumAdministracionPersonaNatural(String as_codigo, String as_descripcion) {
		this.is_codigo = as_codigo;
		this.is_descripcion = as_descripcion;
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
	 * Obtiene el valor para la propiedad descripcion.
	 *
	 * @return El valor de la propiedad descripcion
	 */
	public String getIs_descripcion() {
		return is_descripcion;
	}
}