/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnumTipoEstadoCuenta.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.enums
 * Nombre del elemento: EnumTipoEstadoCuenta
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.enums;

/**
 * Enumeracion para definir el grupo de constantes para Tipo estado cuenta. <br>
 * Enum que contiene los estados posibles que una cuenta de usuario puede tener
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumTipoEstadoCuenta {

	/**
	 * Constante de la enumeracion para definir el item: ACTIVO.
	 */
	ACTIVO("Activo", "A"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * BLOQUEADO_POR_ADMINISTRADOR.
	 */
	BLOQUEADO_POR_ADMINISTRADOR("Bloqueado por administrador", "BA"),

	/**
	 * Constante de la enumeracion para definir el item: BLOQUEADO_POR_EL_SISTEMAS.
	 */
	BLOQUEADO_POR_EL_SISTEMAS("Bloquedo por el sistema", "BS"),

	/**
	 * Constante de la enumeracion para definir el item: INACTIVO.
	 */
	INACTIVO("Inactivo", "I"),

	/**
	 * Constante de la enumeracion para definir el item: PENDIENTE_APROBACION.
	 */
	PENDIENTE_APROBACION("Pendiente Aprobacion", "PA"),

	/**
	 * Constante de la enumeracion para definir el item: REGISTRADO.
	 */
	REGISTRADO("Registrado", "R");

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre.
	 */
	private String is_nombre;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad id.
	 */
	private String is_id;

	/**
	 * Construye una nueva instancia/objeto de la clase EnumTipoEstadoCuenta.
	 *
	 * @param is_nombre el parametro nombre
	 * @param is_id     el parametro id
	 */
	private EnumTipoEstadoCuenta(String is_nombre, String is_id) {
		this.is_nombre = is_nombre;
		this.is_id = is_id;
	}

	/**
	 * Obtiene el valor para la propiedad nombre.
	 *
	 * @return El valor de la propiedad nombre
	 */
	public String getIs_nombre() {
		return is_nombre;
	}

	/**
	 * Obtiene el valor para la propiedad id.
	 *
	 * @return El valor de la propiedad id
	 */
	public String getIs_id() {
		return is_id;
	}
}