/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnumValores.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.enums
 * Nombre del elemento: EnumValores
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.enums;

/**
 * Enumeracion para definir el grupo de constantes para Valores. <br>
 * Enum que contiene valores usados en sede
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumValores {

	/**
	 * Constante de la enumeracion para definir el item: NO_APLICA.
	 */
	NO_APLICA("N/A"),
	;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * valor.
	 */
	private final String is_valor;

	/**
	 * Construye una nueva instancia/objeto de la clase EnumValores.
	 *
	 * @param as_valor el valor a utilizar
	 */
	private EnumValores(String as_valor) {
		this.is_valor = as_valor;
	}

	/**
	 * Obtiene el valor para la propiedad valor.
	 *
	 * @return El valor de la propiedad valor
	 */
	public String getIs_valor() {
		return is_valor;
	}
	
}
