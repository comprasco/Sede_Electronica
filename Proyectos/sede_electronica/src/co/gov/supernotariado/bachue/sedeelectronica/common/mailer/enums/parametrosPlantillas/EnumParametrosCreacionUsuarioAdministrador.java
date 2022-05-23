/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnumParametrosCreacionUsuarioAdministrador.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.mailer.enums.parametrosPlantillas
 * Nombre del elemento: EnumParametrosCreacionUsuarioAdministrador
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.mailer.enums.parametrosPlantillas;

/**
 * Enumeracion para definir el grupo de constantes para Parametros creacion
 * usuario administrador.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumParametrosCreacionUsuarioAdministrador {

	/**
	 * Constante de la enumeracion para definir el item: USUARIO.
	 */
	USUARIO("usuario"), /**
	 * Constante de la enumeracion para definir el item: SERVIDOR.
	 */
 SERVIDOR("servidor"),/**
 * Constante de la enumeracion para definir el item: CONTRASENA.
 */
CONTRASENA("contrasenaTemporal");
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * parametro.
	 */
	String is_parametro;
	
	/**
	 * Construye una nueva instancia/objeto de la clase
	 * EnumParametrosCreacionUsuarioAdministrador.
	 *
	 * @param as_codigoPlanilla el parametro codigo planilla
	 */
	private EnumParametrosCreacionUsuarioAdministrador(String as_codigoPlanilla) {
		this.is_parametro = as_codigoPlanilla;
	}

	/**
	 * Obtiene el valor para la propiedad parametro.
	 *
	 * @return El valor de la propiedad parametro
	 */
	public String getIs_parametro() {
		return is_parametro;
	}

	

}
