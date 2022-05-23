/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnumExcepcionesAlertas.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones
 * Nombre del elemento: EnumExcepcionesAlertas
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.IEnumCatalogoMensajes;

/**
 * Enumeracion para definir el grupo de constantes para Excepciones alertas.
 * <br>
 * Enum que contiene la informacion de las propiedades por codigo de error
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumExcepcionesAlertas implements IEnumCatalogoMensajes {

	/**
	 * Constante de la enumeracion para definir el item: SOLICITANTE_NO_TITULAR.
	 */
	// Enum que aloja nombre del archivo que contiene las propiedades y un codigo
	// que representa el error existente
	SOLICITANTE_NO_TITULAR("solicitante.no.titular"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * SOLICITANTE_ALERTA_INSCRITA.
	 */
	SOLICITANTE_ALERTA_INSCRITA("solicitante.alerta.inscrita"),

	/**
	 * Constante de la enumeracion para definir el item: ERROR_OPERACION.
	 */
	ERROR_OPERACION("error.operacion");

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo error.
	 */
	private final String is_codigoError;

	/**
	 * Define la constante NOMBRE_BUNDLE.
	 */
	public static final String NOMBRE_BUNDLE = "excepciones.excepcion_alertas_%s";

	/**
	 * Construye una nueva instancia/objeto de la clase EnumExcepcionesAlertas.
	 *
	 * @param as_codigoError el parametro codigo error
	 */
	private EnumExcepcionesAlertas(String as_codigoError) {
		this.is_codigoError = as_codigoError;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.exception.
	 * IEnumCatalogoMensajes#consultarIs_nombreArchivo()
	 */
	public String consultarIs_nombreArchivo() {
		return NOMBRE_BUNDLE;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.exception.
	 * IEnumCatalogoMensajes#consultarIs_codigo()
	 */
	public String consultarIs_codigo() {
		return is_codigoError;
	}
}
