/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnumEstadoReferenciaPago.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.enums
 * Nombre del elemento: EnumEstadoReferenciaPago
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.enums;

/**
 * Enumeracion para definir el grupo de constantes para Estado de una referncia de
 * pago.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumEstadoReferenciaPago {

	/**
	 * Constante de la enumeracion para definir el item: PENDIENTE_GENERAR.
	 */
	PENDIENTE_GENERAR("PENDIENTE_GENERAR"),
	
	/**
	 * Constante de la enumeracion para definir el item: NO_APLICA_REFERENCIA.
	 */
	NO_APLICA_REFERENCIA("NO_APLICA_REFERENCIA");
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * estado.
	 */
	private String is_estado;

	/**
	 * Construye una nueva instancia/objeto de la clase EnumEstadoReferenciaPago.
	 *
	 * @param as_estado el parametro estado
	 */
	private EnumEstadoReferenciaPago(String as_estado) {
		this.is_estado = as_estado;
	}
	
	/**
	 * Obtiene el valor para la propiedad estado.
	 *
	 * @return El valor de la propiedad estado
	 */
	public String getIs_estado() {
		return is_estado;
	}

}
