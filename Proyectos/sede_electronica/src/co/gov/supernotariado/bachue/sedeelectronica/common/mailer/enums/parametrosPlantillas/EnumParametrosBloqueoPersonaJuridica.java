/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnumParametrosBloqueoPersonaJuridica.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.mailer.enums.parametrosPlantillas
 * Nombre del elemento: EnumParametrosBloqueoPersonaJuridica
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.mailer.enums.parametrosPlantillas;

/**
 * Enumeracion para definir el grupo de constantes para Parametros bloqueo
 * persona juridica.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumParametrosBloqueoPersonaJuridica {

	/**
	 * Constante de la enumeracion para definir el item: USUARIO.
	 */
	USUARIO("usuario"),
	
	/**
	 * Constante de la enumeracion para definir el item: REPRESENTANTE_LEGAL.
	 */
	REPRESENTANTE_LEGAL("representanteLegal"),
	
	/**
	 * Constante de la enumeracion para definir el item: TIPO_DOCUMENTO.
	 */
	TIPO_DOCUMENTO("tipoDocumento"),
	
	/**
	 * Constante de la enumeracion para definir el item: NUMERO_DOCUMENTO.
	 */
	NUMERO_DOCUMENTO("numeroDocumento"),
	
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
	 * EnumParametrosBloqueoPersonaJuridica.
	 *
	 * @param as_codigoPlanilla el parametro codigo planilla
	 */
	private EnumParametrosBloqueoPersonaJuridica(String as_codigoPlanilla) {
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
