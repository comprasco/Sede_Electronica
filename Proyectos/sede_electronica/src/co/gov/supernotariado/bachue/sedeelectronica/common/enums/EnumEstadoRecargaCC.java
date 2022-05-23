/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnumEstadoRecargaCC.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.enums
 * Nombre del elemento: EnumEstadoRecargaCC
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.enums;

/**
 * Enumeracion para definir el grupo de constantes para Estado recarga cuenta
 * cupo.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumEstadoRecargaCC {

	/**
	 * Constante de la enumeracion para definir el item: PENDIENTE.
	 */
	PENDIENTE("PENDIENTE"),

	/**
	 * Constante de la enumeracion para definir el item: ANULADO.
	 */
	ANULADO("ANULADO");

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * criterio.
	 */
	private String is_criterio;

	/**
	 * Construye una nueva instancia/objeto de la clase EnumEstadoRecargaCC.
	 *
	 * @param as_criterio el parametro criterio
	 */
	private EnumEstadoRecargaCC(String as_criterio) {
		this.is_criterio = as_criterio;
	}

	/**
	 * Obtiene el valor para la propiedad criterio.
	 *
	 * @return El valor de la propiedad criterio
	 */
	public String getIs_criterio() {
		return is_criterio;
	}

}
