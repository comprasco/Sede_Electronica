/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnumPais.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.enums
 * Nombre del elemento: EnumPais
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.enums;

/**
 * Enumeracion para definir el grupo de constantes para Pais. <br>
 * Enum para almacenar el pais por defecto ("COLOMBIA")
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumPais {

	/**
	 * Constante de la enumeracion para definir el item: PAIS_COLOMBIA_POR_DEFECTO.
	 */
	PAIS_COLOMBIA_POR_DEFECTO("COLOMBIA");

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo.
	 */
	private String is_codigo;

	/**
	 * Construye una nueva instancia/objeto de la clase EnumPais.
	 *
	 * @param as_codigo el parametro codigo
	 */
	private EnumPais(String as_codigo) {
		this.is_codigo = as_codigo;
	}

	/**
	 * Obtiene el valor para la propiedad codigo.
	 *
	 * @return El valor de la propiedad codigo
	 */
	public String getIs_codigo() {
		return is_codigo;
	}
}
