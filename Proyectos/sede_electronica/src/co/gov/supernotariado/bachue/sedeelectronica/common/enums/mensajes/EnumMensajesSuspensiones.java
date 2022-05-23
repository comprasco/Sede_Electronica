/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnumMensajesCorrecciones.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes
 * Nombre del elemento: EnumMensajesCorrecciones
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.IEnumCatalogoMensajes;

/**
 * Enumeracion para definir el grupo de constantes para Mensajes suspensiones.
 * <br>
 * Enum que contiene la informacion de las propiedades por codigo de mensaje
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumMensajesSuspensiones implements IEnumCatalogoMensajes {

	// Enum que aloja nombre del archivo que contiene las propiedades y un codigo
	/**
	 * Constante de la enumeracion para definir el item: SOLICITUD_GENERADA.
	 */
	// que representa el mensaje existente
	SOLICITUD_GENERADA("solicitud.generada"),
	
	/**
	 * Constante de la enumeracion para definir el item: DATOS_INCOMPLETOS.
	 */
	DATOS_INCOMPLETOS("datos.incompletos"),

	/**
	 * Constante de la enumeracion para definir el item: TIPO_SUSPENSION_GUARDADO.
	 */
	TIPO_CORRECCION_GUARDADO("tipo.correccion.guardado"),
	
	/**
	 * Constante de la enumeracion para definir el item: ERROR_ARCHIVO.
	 */
	ERROR_ARCHIVO("error.archivo"),
	
	/**
	 * Constante de la enumeracion para definir el item: ETAPA_NO_VALIDA
	 */
	ETAPA_NO_VALIDA("etapa.no.valida"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * ELIMINACION_CORRECCION_CORRECTO.
	 */
	ELIMINACION_CORRECCION_CORRECTO("eliminar.correccion.correcto"),

	/**
	 * Constante de la enumeracion para definir el item: TRANSACCION_DESCARTADA.
	 */
	TRANSACCION_DESCARTADA("eliminar.transaccion.correccion"),
	
	/**
	 * Constante de la enumeracion para definir el item: SOPORTE_ELIMINADO.
	 */
	SOPORTE_ELIMINADO("eliminar.soporte.correccion");

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo.
	 */
	private final String is_codigo;

	/**
	 * Define la constante NOMBRE_BUNDLE.
	 */
	public static final String NOMBRE_BUNDLE = "mensajes.mensajes_suspensiones_%s";

	/**
	 * Construye una nueva instancia/objeto de la clase EnumMensajesCorrecciones.
	 *
	 * @param as_codigo el parametro codigo
	 */
	private EnumMensajesSuspensiones(String as_codigo) {
		this.is_codigo = as_codigo;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.exception.
	 * IEnumCatalogoMensajes#consultarIs_nombreArchivo()
	 */
	@Override
	public String consultarIs_nombreArchivo() {
		return NOMBRE_BUNDLE;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.exception.
	 * IEnumCatalogoMensajes#consultarIs_codigo()
	 */
	@Override
	public String consultarIs_codigo() {
		return is_codigo;
	}
}
