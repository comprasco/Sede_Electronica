/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnumEstadoMatricula.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.enums
 * Nombre del elemento: EnumEstadoMatricula
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.enums;

/**
 * Enumeracion para definir el grupo de constantes para Estado matricula. <br>
 * Enum que contiene los estados de las matriculas para certificados
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumEstadoMatricula {

	/**
	 * Constante de la enumeracion para definir el item: ANULADO.
	 */
	ANULADO("ANULADO"),

	/**
	 * Constante de la enumeracion para definir el item: TRASLADADO.
	 */
	TRASLADADO("TRASLADADO"),;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo.
	 */
	private String is_codigo;

	/**
	 * Construye una nueva instancia/objeto de la clase EnumEstadoMatricula.
	 *
	 * @param as_codigo el parametro codigo
	 */
	private EnumEstadoMatricula(String as_codigo) {
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
