/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnumSeguridad.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.enums
 * Nombre del elemento: EnumSeguridad
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.enums;

/**
 * Enumeracion para definir el grupo de constantes para Seguridad. <br>
 * Enum que define variables de seguridad a nivel global
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumSeguridad {

	/**
	 * Constante de la enumeracion para definir el item: URL_INICIO_PRINCIPAL.
	 */
	URL_INICIO_PRINCIPAL("/pages/personas/inicioSesion/ciudadanos.jsf"),
	
	URL_INICIO("/pages/personas/inicio.jsf"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * URL_INICIO_PRINCIPAL_CIERRE_SESION.
	 */
	URL_INICIO_PRINCIPAL_CIERRE_SESION("/pages/personas/inicioSesion/ciudadanos.jsf"),

	/**
	 * Constante de la enumeracion para definir el item: URL_ACCESO_DENEGADO.
	 */
	URL_ACCESO_DENEGADO("/pages/includes/accesoDenegado.jsf"),

	/**
	 * Constante de la enumeracion para definir el item: LOGIN_PROCESAMIENTO.
	 */
	LOGIN_PROCESAMIENTO("/login"),

	/**
	 * Constante de la enumeracion para definir el item: LOGOUT_PROCESAMIENTO.
	 */
	LOGOUT_PROCESAMIENTO("/appLogout"),

	/**
	 * Constante de la enumeracion para definir el item: USER_NAME.
	 */
	USER_NAME("username"),

	/**
	 * Constante de la enumeracion para definir el item: PASSWORD.
	 */
	PASSWORD("password"),

	/**
	 * Constante de la enumeracion para definir el item: SECRET.
	 */
	SECRET("secret-snr"),

	/**
	 * Constante de la enumeracion para definir el item: PREFIJO_ROL.
	 */
	PREFIJO_ROL("ROLE_"),

	/**
	 * Constante de la enumeracion para definir el item: WARN.
	 */
	WARN("warn"),

	/**
	 * Constante de la enumeracion para definir el item: ERROR.
	 */
	ERROR("error"),
	
	/**
	 * Constante de la enumeracion para definir el item: SHA_256.
	 */
	SHA_256("SHA-256");

	/**
	 * Construye una nueva instancia/objeto de la clase EnumSeguridad.
	 *
	 * @param is_nombreParametro el parametro nombre parametro
	 */
	private EnumSeguridad(String is_nombreParametro) {
		this.is_nombreParametro = is_nombreParametro;
	}

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre parametro.
	 */
	private final String is_nombreParametro;

	/**
	 * Obtiene el valor para la propiedad nombre parametro.
	 *
	 * @return El valor de la propiedad nombre parametro
	 */
	public String getIs_nombreParametro() {
		return is_nombreParametro;
	}

}
