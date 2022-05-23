/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnumCarguePoder.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.enums
 * Nombre del elemento: EnumCarguePoder
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.enums;

/**
 * Enumeracion para definir el grupo de constantes para Cargue poder.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumCarguePoder {
	
	/**
	 * Constante de la enumeracion para definir el item: ESCRITURA_PUBLICA.
	 */
	ESCRITURA_PUBLICA("ESCRITURA_PUBLICA"),
	
	/**
	 * Constante de la enumeracion para definir el item: DOCUMENTO_PRIVADO.
	 */
	DOCUMENTO_PRIVADO("DOCUMENTO_PRIVADO"),
	
	/**
	 * Constante de la enumeracion para definir el item: PODER_ESPECIAL.
	 */
	PODER_ESPECIAL("PODER_ESPECIAL"),
	
	/**
	 * Constante de la enumeracion para definir el item: PODER_GENERAL.
	 */
	PODER_GENERAL("PODER_GENERAL"),
	
	/**
	 * Constante de la enumeracion para definir el item: DOCUMENTO_PODER.
	 */
	DOCUMENTO_PODER("PODER"),
	
	/**
	 * Constante de la enumeracion para definir el item: CON_MATRICULA.
	 */
	CON_MATRICULA("CON_MATRICULA"),
	
	;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * criterio.
	 */
	private String is_criterio;
	
	/**
	 * Construye una nueva instancia/objeto de la clase EnumCarguePoder.
	 *
	 * @param as_criterio el parametro criterio
	 */
	private EnumCarguePoder(String as_criterio) {
		this.is_criterio = as_criterio;
	}

	/**
	 * Obtiene el valor para la propiedad criterio.
	 *
	 * @return El valor de la propiedad criterio
	 */
	public String getIs_criterio() {
		return is_criterio;
	}

}
