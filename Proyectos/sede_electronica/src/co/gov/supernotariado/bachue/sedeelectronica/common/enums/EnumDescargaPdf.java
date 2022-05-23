/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnumDescargaPdf.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.enums
 * Nombre del elemento: EnumDescargaPdf
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.enums;

/**
 * Enumeracion para definir el grupo de constantes para Formulario descarga pdf.
 * <br>
 * Enum que contiene nombre de los campos de los formularios descarga pdf
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumDescargaPdf {

	/**
	 * Constante de la enumeracion para definir el item: CS_MIN_JUSTICIA.
	 */
	CS_MIN_JUSTICIA("minjusticialogo"),

	/**
	 * Constante de la enumeracion para definir el item: CS_LOGO_NUEVO_PAIS.
	 */
	CS_LOGO_NUEVO_PAIS("logonuevopais"),

	/**
	 * Constante de la enumeracion para definir el item: CS_ISO.
	 */
	CS_ISO("iso"),

	/**
	 * Constante de la enumeracion para definir el item: CS_SNR_LOGO.
	 */
	CS_SNR_LOGO("snrlogo"),

	/**
	 * Constante de la enumeracion para definir el item: CS_PNG.
	 */
	CS_PNG("png"),;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre campo.
	 */
	private final String is_nombreCampo;

	/**
	 * Construye una nueva instancia/objeto de la clase EnumFormularioCuentaCupo.
	 *
	 * @param as_nombreCampo el parametro nombre campo
	 */
	private EnumDescargaPdf(String as_nombreCampo) {
		this.is_nombreCampo = as_nombreCampo;
	}

	/**
	 * Obtiene el valor para la propiedad nombre campo.
	 *
	 * @return El valor de la propiedad nombre campo
	 */
	public String getIs_nombreCampo() {
		return is_nombreCampo;
	}

}
