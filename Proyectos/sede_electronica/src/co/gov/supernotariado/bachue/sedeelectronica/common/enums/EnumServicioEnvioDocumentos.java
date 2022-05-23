/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnumServicioEnvioDocumentos.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.enums
 * Nombre del elemento: EnumServicioEnvioDocumentos
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.enums;

/**
 * Enumeracion para definir el grupo de constantes para Servicio envio
 * documentos. <br>
 * Enum que contiene el mapeo de los parametros para el servicio
 * SUT_CO_EnvioDocumentos
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumServicioEnvioDocumentos {

	/**
	 * Constante de la enumeracion para definir el item: TEMPORAL.
	 */
	// Repositorio
	TEMPORAL("TEMPORAL"),
	/**
	 * Constante de la enumeracion para definir el item: FINAL.
	 */
	FINAL("FINAL"),
	/**
	 * Constante de la enumeracion para definir el item: MIXTO.
	 */
	MIXTO("MIXTO"),

	/**
	 * Constante de la enumeracion para definir el item: NIR.
	 */
	// Constantes
	NIR("xNIR"),
	/**
	 * Constante de la enumeracion para definir el item: TIPO_DOCUMENTAL.
	 */
	TIPO_DOCUMENTAL("dDocType"),

	/**
	 * Constante de la enumeracion para definir el item: DIGITALIZADO.
	 */
	// Notificar Digitalizacion
	DIGITALIZADO("DIGITALIZADO"),

	/**
	 * Constante de la enumeracion para definir el item: ID_TRAMITE.
	 */
	ID_TRAMITE("NIR:"),;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * criterio.
	 */
	private String is_criterio;

	/**
	 * Construye una nueva instancia/objeto de la clase EnumServicioEnvioDocumentos.
	 *
	 * @param as_criterio el parametro criterio
	 */
	private EnumServicioEnvioDocumentos(String as_criterio) {
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
