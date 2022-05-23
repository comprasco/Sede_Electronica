/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnumModoTipoServicio.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.enums
 * Nombre del elemento: EnumModoTipoServicio
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.enums;

/**
 * Enumeracion para definir el grupo de constantes para Modo tipo servicio. <br>
 * Enum que contiene especificacion de modo tipo de sevicio en CarritoBusiness y
 * CertificadoEspecialBusiness. Asi mismo se utiliza en diferentes beans
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumModoTipoServicio {

	/**
	 * Constante de la enumeracion para definir el item: INDIVIDUAL.
	 */
	INDIVIDUAL("INDIVIDUAL"),

	/**
	 * Constante de la enumeracion para definir el item: MASIVO.
	 */
	MASIVO("MASIVO"),

	/**
	 * Constante de la enumeracion para definir el item: ESPECIAL.
	 */
	ESPECIAL("ESPECIAL");

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo.
	 */
	private String is_codigo;

	/**
	 * Construye una nueva instancia/objeto de la clase EnumModoTipoServicio.
	 *
	 * @param as_codigo el parametro codigo
	 */
	private EnumModoTipoServicio(String as_codigo) {
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
