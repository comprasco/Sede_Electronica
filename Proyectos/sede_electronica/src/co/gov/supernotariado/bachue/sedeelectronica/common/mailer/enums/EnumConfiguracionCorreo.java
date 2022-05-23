/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnumConfiguracionCorreo.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.mailer.enums
 * Nombre del elemento: EnumConfiguracionCorreo
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.mailer.enums;

/**
 * Enumeracion para definir el grupo de constantes para Configuracion correo.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumConfiguracionCorreo {

	/**
	 * Constante de la enumeracion para definir el item: CORREO_SERVIDOR_CORREO.
	 */
	CORREO_SERVIDOR_CORREO("CORREO_SERVIDOR_CORREO"),
	
	/**
	 * Constante de la enumeracion para definir el item: CLAVE_SERVIDOR_CORREO.
	 */
	CLAVE_SERVIDOR_CORREO("CLAVE_SERVIDOR_CORREO"),
	
	/**
	 * Constante de la enumeracion para definir el item: PUERTO_SERVIDOR_SMTP.
	 */
	PUERTO_SERVIDOR_SMTP("PUERTO_SERVIDOR_SMTP"),
	
	/**
	 * Constante de la enumeracion para definir el item: SERVIDOR_SMTP_CORREO.
	 */
	SERVIDOR_SMTP_CORREO("SERVIDOR_SMTP_CORREO"),
	
	/**
	 * Constante de la enumeracion para definir el item: CERTIFICADO_SSL.
	 */
	CERTIFICADO_SSL("CERTIFICADO_SSL");

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo.
	 */
	String is_codigo;

	/**
	 * Construye una nueva instancia/objeto de la clase EnumConfiguracionCorreo.
	 *
	 * @param as_codigo el parametro codigo
	 */
	private EnumConfiguracionCorreo(String as_codigo) {
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
