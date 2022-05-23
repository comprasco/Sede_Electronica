/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnumEstadoAlertaTierras.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.enums
 * Nombre del elemento: EnumEstadoAlertaTierras
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.enums;

/**
 * Enumeracion para definir el grupo de constantes para Estado alerta tierras.
 * <br>
 * Enum que contiene los tipo de estados resultantes del servicio
 * SBB_EE_AlertaTierras
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumEstadoAlertaTierras {

	/**
	 * Constante de la enumeracion para definir el item: ACTIVA.
	 */
	ACTIVA("ACTIVA"),

	/**
	 * Constante de la enumeracion para definir el item: INACTIVA.
	 */
	INACTIVA("INACTIVA"),

	/**
	 * Constante de la enumeracion para definir el item: INGRESANDO.
	 */
	INGRESANDO("INGRESANDO"),

	/**
	 * Constante de la enumeracion para definir el item: EN_REVISION.
	 */
	EN_REVISION("EN_REVISION"),

	/**
	 * Constante de la enumeracion para definir el item: REVISADA.
	 */
	REVISADA("REVISADA");

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo.
	 */
	private String is_codigo;

	/**
	 * Construye una nueva instancia/objeto de la clase EnumEstadoAlertaTierras.
	 *
	 * @param as_codigo el parametro codigo
	 */
	private EnumEstadoAlertaTierras(String as_codigo) {
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
