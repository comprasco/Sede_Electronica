/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnumCertificadosEspeciales.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.enums
 * Nombre del elemento: EnumCertificadosEspeciales
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.enums;

/**
 * Enumeracion para definir el grupo de constantes para Certificados especiales.
 * <br>
 * Enum que contiene el nombre de los certificados especiales que se utilizan
 * especificamente en el BeanCENumMatricula y BeanCertificadoEspecial para
 * renderizar componentes visuales relacionados con cada certificado especial
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumCertificadosEspeciales {

	/**
	 * Constante de la enumeracion para definir el item:
	 * AMPLIACION_HISTORIAL_REGISTRAL.
	 */
	AMPLIACION_HISTORIAL_REGISTRAL("CERTIFICADO_AMPLIACION_HISTORIAL_REGISTRAL"),

	/**
	 * Constante de la enumeracion para definir el item: PERTENENCIA.
	 */
	PERTENENCIA("CERTIFICADO_PERTENENCIA"),

	/**
	 * Constante de la enumeracion para definir el item: CARENCIA.
	 */
	CARENCIA("CERTIFICADO_CARENCIA"),

	/**
	 * Constante de la enumeracion para definir el item: SERVIDUMBRE.
	 */
	SERVIDUMBRE("CERTIFICADO_SERVIDUMBRE"),

	/**
	 * Constante de la enumeracion para definir el item: CLARIFICACION_TITULOS.
	 */
	CLARIFICACION_TITULOS("CERTIFICADO_CLARIFICACION_TITULOS"),

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
	 * Construye una nueva instancia/objeto de la clase EnumCertificadosEspeciales.
	 *
	 * @param as_codigo el parametro codigo
	 */
	private EnumCertificadosEspeciales(String as_codigo) {
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
