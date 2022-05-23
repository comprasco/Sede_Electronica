/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnumEstadoActividad.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.enums
 * Nombre del elemento: EnumEstadoActividad
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.enums;

/**
 * Enumeracion para definir el grupo de constantes para Estado actividad. <br>
 * Enum que contiene los tipo de estados resultantes del servicio
 * SDI_EE_ConsultaTrazabilidad
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumEstadoActividad {

	/**
	 * Constante de la enumeracion para definir el item: ASIGNADO.
	 */
	ASIGNADO("Asignado"),

	/**
	 * Constante de la enumeracion para definir el item: BLOQUEADO.
	 */
	BLOQUEADO("Bloqueado"),

	/**
	 * Constante de la enumeracion para definir el item: TERMINADO.
	 */
	TERMINADO("Terminado"),

	/**
	 * Constante de la enumeracion para definir el item: AUTOMATICO.
	 */
	AUTOMATICO("Automatico"),

	/**
	 * Constante de la enumeracion para definir el item: PENDIENTE_POR_REPARTIR.
	 */
	PENDIENTE_POR_REPARTIR("Pendiente por repartir");

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo.
	 */
	private String is_codigo;

	/**
	 * Construye una nueva instancia/objeto de la clase EnumEstadoActividad.
	 *
	 * @param as_codigo el parametro codigo
	 */
	private EnumEstadoActividad(String as_codigo) {
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
