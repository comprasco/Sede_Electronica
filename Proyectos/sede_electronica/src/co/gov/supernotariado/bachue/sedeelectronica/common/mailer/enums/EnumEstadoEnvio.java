/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnumEstadoEnvio.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.mailer.enums
 * Nombre del elemento: EnumEstadoEnvio
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.mailer.enums;

/**
 * Enumeracion para definir el grupo de constantes para Estado envio.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumEstadoEnvio {

	/**
	 * Constante de la enumeracion para definir el item: ENVIADO.
	 */
	ENVIADO("ENVIADO"),
	
	/**
	 * Constante de la enumeracion para definir el item: PENDIENTE.
	 */
	PENDIENTE("PENDIENTE"),
	
	/**
	 * Constante de la enumeracion para definir el item: CANCEALDO.
	 */
	CANCEALDO("CANCELADO");
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo planilla.
	 */
	String is_codigoPlanilla;

	/**
	 * Construye una nueva instancia/objeto de la clase EnumEstadoEnvio.
	 *
	 * @param as_codigoPlanilla el parametro codigo planilla
	 */
	private EnumEstadoEnvio(String as_codigoPlanilla) {
		this.is_codigoPlanilla = as_codigoPlanilla;
	}

	/**
	 * Obtiene el valor para la propiedad codigo planilla.
	 *
	 * @return El valor de la propiedad codigo planilla
	 */
	public String getIs_codigoPlanilla() {
		return is_codigoPlanilla;
	}

}
