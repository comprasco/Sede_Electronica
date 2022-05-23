/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnumParametrosAsociarPnAEeUsuario.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.mailer.enums.parametrosPlantillas
 * Nombre del elemento: EnumParametrosAsociarPnAEeUsuario
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.mailer.enums.parametrosPlantillas;


/**
 * Enumeracion para definir el grupo de constantes para Parametros asociar persona natural A
 * entidad especial usuario.
 */
public enum EnumParametrosAsociarPnAEeUsuario {

	/**
	 * Constante de la enumeracion para definir el item: USUARIO.
	 */
	USUARIO("usuario"),
	
	/**
	 * Constante de la enumeracion para definir el item: PRIMER_NOMBRE.
	 */
	PRIMER_NOMBRE("primerNombre"),
	
	/**
	 * Constante de la enumeracion para definir el item: PRIMER_APELLIDO.
	 */
	PRIMER_APELLIDO("primerApellido"),
	
	/**
	 * Constante de la enumeracion para definir el item: RAZON_SOCIAL.
	 */
	RAZON_SOCIAL("razonSocial"),
	
	/**
	 * Constante de la enumeracion para definir el item: SERVIDOR.
	 */
	SERVIDOR("servidor");
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * parametro.
	 */
	String is_parametro;
	
	/**
	 * Construye una nueva instancia/objeto de la clase
	 * EnumParametrosAsociarPnAEeUsuario.
	 *
	 * @param as_codigoPlanilla el parametro codigo planilla
	 */
	private EnumParametrosAsociarPnAEeUsuario(String as_codigoPlanilla) {
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
