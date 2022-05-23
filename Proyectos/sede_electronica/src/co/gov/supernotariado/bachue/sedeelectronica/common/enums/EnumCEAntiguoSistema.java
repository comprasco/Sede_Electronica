/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnumCEAntiguoSistema.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.enums
 * Nombre del elemento: EnumCEAntiguoSistema
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.enums;

/**
 * Enumeracion para definir el grupo de constantes para certificado especial
 * antiguo sistema. <br>
 * Enum que contiene los certificados de antiguo sistemas y se utilizan para
 * renderizar en BeanCertificadoEspecial componentes visuales dependiendo del
 * tipo de certificado
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumCEAntiguoSistema {

	/**
	 * Constante de la enumeracion para definir el item: CARENCIA_REGISTRAL.
	 */
	CARENCIA_REGISTRAL("CERTIFICADO_CARENCIA_REGISTRAL"),

	/**
	 * Constante de la enumeracion para definir el item: ANTIGUO_SISTEMA.
	 */
	ANTIGUO_SISTEMA("CERTIFICADO_ANTIGUO_SISTEMA");

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo.
	 */
	private String is_codigo;

	/**
	 * Construye una nueva instancia/objeto de la clase EnumCEAntiguoSistema.
	 *
	 * @param as_codigo el parametro codigo
	 */
	private EnumCEAntiguoSistema(String as_codigo) {
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
