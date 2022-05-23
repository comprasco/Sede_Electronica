/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnumParametrosAprobacionEntidadEspecial.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.mailer.enums.parametrosPlantillas
 * Nombre del elemento: EnumParametrosAprobacionEntidadEspecial
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.mailer.enums.parametrosPlantillas;

/**
 * Enumeracion para definir el grupo de constantes para Parametros aprobacion
 * entidad especial.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumParametrosAprobacionEntidadEspecial {

	/**
	 * Constante de la enumeracion para definir el item: RAZON_SOCIAL.
	 */
	RAZON_SOCIAL("razonSocial"),
	
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
	 * Constante de la enumeracion para definir el item: USUARIO.
	 */
	USUARIO("usuario"),
	
	/**
	 * Constante de la enumeracion para definir el item: CONTRASENA_TEMPORAL.
	 */
	CONTRASENA_TEMPORAL("contrasenaTemporal"),
	
	/**
	 * Constante de la enumeracion para definir el item: ENLACE.
	 */
	ENLACE("enlace"),
	
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
	 * EnumParametrosAprobacionEntidadEspecial.
	 *
	 * @param as_codigoPlanilla el parametro codigo planilla
	 */
	private EnumParametrosAprobacionEntidadEspecial(String as_codigoPlanilla) {
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
