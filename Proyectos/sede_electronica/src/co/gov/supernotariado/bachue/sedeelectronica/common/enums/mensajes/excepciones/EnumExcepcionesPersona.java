/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnumExcepcionesPersona.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones
 * Nombre del elemento: EnumExcepcionesPersona
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones;

import java.io.Serializable;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.IEnumCatalogoMensajes;

/**
 * Enumeracion para definir el grupo de constantes para Excepciones persona.
 * <br>
 * Enum que contiene la informacion de las propiedades por codigo de error
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumExcepcionesPersona implements IEnumCatalogoMensajes, Serializable {

	/**
	 * Constante de la enumeracion para definir el item: NUMERO_DOCUMENTO_EXISTENTE.
	 */
	// Enum que aloja nombre del archivo que contiene las propiedades y un codigo
	// que representa el error existente
	NUMERO_DOCUMENTO_EXISTENTE("numero.documento.existente"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * CORREO_ELECTRONICO_EXISTENTE.
	 */
	CORREO_ELECTRONICO_EXISTENTE("correo.electronico.existente"),

	/**
	 * Constante de la enumeracion para definir el item: NOMBRE_USUARIO_EXISTENTE.
	 */
	NOMBRE_USUARIO_EXISTENTE("nombre.usuario.existente");

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo error.
	 */
	private final String is_codigoError;

	/**
	 * Define la constante NOMBRE_BUNDLE.
	 */
	public static final String NOMBRE_BUNDLE = "excepciones.excepcion_persona_%s";

	/**
	 * Consultar enum por nombre.
	 *
	 * @param as_nombreEnum el parametro nombre enum
	 * @return Resultado para consultar enum retornado como EnumExcepcionesPersona
	 */
	public static EnumExcepcionesPersona consultarEnum(String as_nombreEnum) {
		for (EnumExcepcionesPersona leep_excepciones : EnumExcepcionesPersona.values()) {
			if (as_nombreEnum.equals(leep_excepciones.name())) {
				return leep_excepciones;
			}
		}
		return null;
	}

	/**
	 * Consultar enum por codigo error.
	 *
	 * @param as_codigoError el parametro codigo error
	 * @return Resultado para consultar enum codigo error retornado como
	 *         EnumExcepcionesPersona
	 */
	public static EnumExcepcionesPersona consultarEnumCodigoError(String as_codigoError) {
		for (EnumExcepcionesPersona leep_excepciones : EnumExcepcionesPersona.values()) {
			if (as_codigoError.equals(leep_excepciones.consultarIs_codigo())) {
				return leep_excepciones;
			}
		}
		return null;
	}

	/**
	 * Construye una nueva instancia/objeto de la clase EnumExcepcionesPersona.
	 *
	 * @param as_codigoError el parametro codigo error
	 */
	private EnumExcepcionesPersona(String as_codigoError) {
		this.is_codigoError = as_codigoError;
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
		return is_codigoError;
	}

}
