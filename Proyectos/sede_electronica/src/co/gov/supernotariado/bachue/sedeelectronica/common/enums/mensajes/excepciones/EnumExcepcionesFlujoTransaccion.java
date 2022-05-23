/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnumExcepcionesFlujoTransaccion.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones
 * Nombre del elemento: EnumExcepcionesFlujoTransaccion
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones;

import java.io.Serializable;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.IEnumCatalogoMensajes;

/**
 * Enumeracion para definir el grupo de constantes para Excepciones flujo
 * transaccion. <br>
 * Enum que contiene la informacion de las propiedades por codigo de error
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumExcepcionesFlujoTransaccion implements IEnumCatalogoMensajes, Serializable {

	/**
	 * Constante de la enumeracion para definir el item: CODIGO_NO_ACTIVO.
	 */
	// Enum que aloja nombre del archivo que contiene las propiedades y un codigo
	// que representa el error existente
	CODIGO_NO_ACTIVO("error.carrito.no.activo"),

	/**
	 * Constante de la enumeracion para definir el item: TRANSACCION_NO_ENCONTRADA.
	 */
	TRANSACCION_NO_ENCONTRADA("error.transaccion.no.encontrada"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * HISTORIAL_CAMPO_OBLIGATORIOS.
	 */
	HISTORIAL_CAMPO_OBLIGATORIOS("error.historial.campos.obligatorios"),

	/**
	 * Constante de la enumeracion para definir el item: HISTORIAL_FORMATO_NIT.
	 */
	HISTORIAL_FORMATO_NIT("error.historial.nir.formato");

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo error.
	 */
	private final String is_codigoError;

	/**
	 * Define la constante NOMBRE_BUNDLE.
	 */
	public static final String NOMBRE_BUNDLE = "excepciones.excepcion_flujo_transaccion_%s";

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * EnumExcepcionesFlujoTransaccion.
	 *
	 * @param as_codigoError el parametro codigo error
	 */
	private EnumExcepcionesFlujoTransaccion(String as_codigoError) {
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
