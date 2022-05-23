/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnumTipoParametrizacionAlcaldia.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.enums
 * Nombre del elemento: EnumTipoParametrizacionAlcaldia
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.enums;

/**
 * Enumeracion para definir el grupo de constantes para Tipo parametrizacion
 * alcaldia. <br>
 * Enum que detalla los tipos de parametrizacion por alcaldia para consultar un
 * paz y salvo
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumTipoParametrizacionAlcaldia {

	/**
	 * Constante de la enumeracion para definir el item: PAGINA_WEB.
	 */
	PAGINA_WEB("PAGINA_WEB"),

	/**
	 * Constante de la enumeracion para definir el item: SERVICIO_WEB.
	 */
	SERVICIO_WEB("SERVICIO_WEB");

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * criterio.
	 */
	private String is_criterio;

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * EnumTipoParametrizacionAlcaldia.
	 *
	 * @param as_criterio el parametro criterio
	 */
	private EnumTipoParametrizacionAlcaldia(String as_criterio) {
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
