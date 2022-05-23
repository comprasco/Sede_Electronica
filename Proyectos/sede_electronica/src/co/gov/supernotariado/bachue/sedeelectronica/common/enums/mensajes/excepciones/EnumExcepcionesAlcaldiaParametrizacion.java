/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnumExcepcionesAlcaldiaParametrizacion.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones
 * Nombre del elemento: EnumExcepcionesAlcaldiaParametrizacion
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.IEnumCatalogoMensajes;

/**
 * Enumeracion para definir el grupo de constantes para Excepciones alcaldia
 * parametrizacion. <br>
 * Enum que contiene la informacion de las propiedades por codigo de error
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumExcepcionesAlcaldiaParametrizacion implements IEnumCatalogoMensajes {

	/**
	 * Constante de la enumeracion para definir el item: IDENTIFICADOR_INCORRECTO.
	 */
	// Enum que aloja nombre del archivo que contiene las propiedades y un codigo
	// que representa el error existente
	IDENTIFICADOR_INCORRECTO("id.incorrecto"),

	/**
	 * Constante de la enumeracion para definir el item: ALCALDIA_NO_EXISTENTE.
	 */
	ALCALDIA_NO_EXISTENTE("alcaldia.inexistente"),

	/**
	 * Constante de la enumeracion para definir el item: ALCALDIA_EXITOSO.
	 */
	ALCALDIA_EXITOSO("alcaldia.exitoso"),

	/**
	 * Constante de la enumeracion para definir el item: ALCALDIA_FALLIDO.
	 */
	ALCALDIA_FALLIDO("alcaldia.fallido"),

	/**
	 * Constante de la enumeracion para definir el item: PAZ_SALVO_FALLIDO.
	 */
	PAZ_SALVO_FALLIDO("pazysalvofallido");

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo error.
	 */
	private final String is_codigoError;

	/**
	 * Define la constante NOMBRE_BUNDLE.
	 */
	public static final String NOMBRE_BUNDLE = "excepciones.excepcion_alcaldia_%s";

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * EnumExcepcionesAlcaldiaParametrizacion.
	 *
	 * @param as_codigoError el parametro codigo error
	 */
	private EnumExcepcionesAlcaldiaParametrizacion(String as_codigoError) {
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
