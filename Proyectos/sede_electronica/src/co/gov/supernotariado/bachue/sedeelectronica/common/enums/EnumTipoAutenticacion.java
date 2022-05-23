/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnumTipoAutenticacion.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.enums
 * Nombre del elemento: EnumTipoAutenticacion
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.enums;

/**
 * Enumeracion para definir el grupo de constantes para Tipo autenticacion. <br>
 * Enum que se usa como codigo para consultar el inicio y cierre de sesion
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumTipoAutenticacion {

	/**
	 * Constante de la enumeracion para definir el item: INGRESO_SESION.
	 */
	INGRESO_SESION("I"),

	/**
	 * Constante de la enumeracion para definir el item: SALIDA_SESION.
	 */
	SALIDA_SESION("S");

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo.
	 */
	private final String is_codigo;

	/**
	 * Construye una nueva instancia/objeto de la clase EnumTipoAutenticacion.
	 *
	 * @param as_codigo el parametro codigo
	 */
	private EnumTipoAutenticacion(String as_codigo) {
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
