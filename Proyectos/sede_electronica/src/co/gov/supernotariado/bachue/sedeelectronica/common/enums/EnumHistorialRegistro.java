/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnumHistorialRegistro.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.enums
 * Nombre del elemento: EnumHistorialRegistro
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.enums;

/**
 * Enumeracion para definir el grupo de constantes para Historial registro. <br>
 * Enum que contiene mensajes por defecto relacionados con el historial de
 * registros
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumHistorialRegistro {

	/**
	 * Constante de la enumeracion para definir el item: SYSTEM.
	 */
	SYSTEM("SYSTEM"),

	/**
	 * Constante de la enumeracion para definir el item: TIEMPO_ACTIVACION_VENCIDO.
	 */
	TIEMPO_ACTIVACION_VENCIDO("TIEMPO_ACTIVACION_VENCIDO"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * MENSAJE_TIEMPO_ACTIVACION_VENCIDO.
	 */
	MENSAJE_TIEMPO_ACTIVACION_VENCIDO("Sistema elimina usuario por falta de activacion");

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * criterio.
	 */
	private String is_criterio;

	/**
	 * Construye una nueva instancia/objeto de la clase EnumHistorialRegistro.
	 *
	 * @param as_criterio el parametro criterio
	 */
	private EnumHistorialRegistro(String as_criterio) {
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
