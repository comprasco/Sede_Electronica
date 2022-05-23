/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnumExcepcionesTransaccionMasiva.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones
 * Nombre del elemento: EnumExcepcionesTransaccionMasiva
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones;

import java.io.Serializable;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.IEnumCatalogoMensajes;

/**
 * Enumeracion para definir el grupo de constantes para Excepciones transaccion
 * masiva. <br>
 * Enum que contiene la informacion de las propiedades por codigo de error
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumExcepcionesTransaccionMasiva implements IEnumCatalogoMensajes, Serializable {

	/**
	 * Constante de la enumeracion para definir el item: ARCHIVO_NO_FORMATO.
	 */
	// Enum que aloja nombre del archivo que contiene las propiedades y un codigo
	// que representa el error existente
	ARCHIVO_NO_FORMATO("archivo.no.formato"),

	/**
	 * Constante de la enumeracion para definir el item: ARCHIVO_ORIP_INCOMPLETA.
	 */
	ARCHIVO_ORIP_INCOMPLETA("archivo.orip.incompleta"),

	/**
	 * Constante de la enumeracion para definir el item: CANTIDAD_INFERIOR_DIEZ.
	 */
	CANTIDAD_INFERIOR_DIEZ("cantidad.inferior.diez"),

	/**
	 * Constante de la enumeracion para definir el item: CANTIDAD_SUPERIOR_MIL.
	 */
	CANTIDAD_SUPERIOR_MIL("cantidad.superior.mil"),;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo error.
	 */
	private final String is_codigoError;

	/**
	 * Define la constante NOMBRE_BUNDLE.
	 */
	public static final String NOMBRE_BUNDLE = "excepciones.excepcion_transaccion_masiva_%s";

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * EnumExcepcionesTransaccionMasiva.
	 *
	 * @param as_codigoError el parametro codigo error
	 */
	private EnumExcepcionesTransaccionMasiva(String as_codigoError) {
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
