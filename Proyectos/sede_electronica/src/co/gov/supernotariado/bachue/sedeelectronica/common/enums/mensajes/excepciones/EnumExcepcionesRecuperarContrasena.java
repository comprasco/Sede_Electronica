/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnumExcepcionesRecuperarContrasena.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones
 * Nombre del elemento: EnumExcepcionesRecuperarContrasena
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones;

import java.io.Serializable;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.IEnumCatalogoMensajes;

/**
 * Enumeracion para definir el grupo de constantes para Excepciones recuperar
 * contrasena. <br>
 * Enum que contiene la informacion de las propiedades por codigo de error
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumExcepcionesRecuperarContrasena implements IEnumCatalogoMensajes, Serializable {

	/**
	 * Constante de la enumeracion para definir el item: CLAVE_EXPIRO.
	 */
	// Enum que aloja nombre del archivo que contiene las propiedades y un codigo
	// que representa el error existente
	CLAVE_EXPIRO("clave.expiro"),

	/**
	 * Constante de la enumeracion para definir el item: CLAVE_NO_COINCIDE.
	 */
	CLAVE_NO_COINCIDE("clave.no.coincide"),

	/**
	 * Constante de la enumeracion para definir el item: CLAVE_GENERICA_NO_COINCIDE.
	 */
	CLAVE_GENERICA_NO_COINCIDE("clave.generica.no.coincide"),

	/**
	 * Constante de la enumeracion para definir el item: CLAVE_FORMATO_NO_VALIDO.
	 */
	CLAVE_FORMATO_NO_VALIDO("clave.formato.no.valido"),

	/**
	 * Constante de la enumeracion para definir el item: CLAVE_REPETIDO.
	 */
	CLAVE_REPETIDO("clave.repetida"),

	/**
	 * Constante de la enumeracion para definir el item: SOLICITUD_RECIBIDA.
	 */
	SOLICITUD_RECIBIDA("solicitud.recibida");

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo error.
	 */
	private final String is_codigoError;

	/**
	 * Define la constante NOMBRE_BUNDLE.
	 */
	public static final String NOMBRE_BUNDLE = "excepciones.excepcion_recuperar_contrasena_%s";

	/**
	 * Consultar enum por nombre.
	 *
	 * @param as_nombreEnum el parametro nombre enum
	 * @return Resultado para consultar enum retornado como
	 *         EnumExcepcionesRecuperarContrasena
	 */
	public static EnumExcepcionesRecuperarContrasena consultarEnum(String as_nombreEnum) {
		for (EnumExcepcionesRecuperarContrasena leerc_excepciones : EnumExcepcionesRecuperarContrasena.values()) {
			if (as_nombreEnum.equals(leerc_excepciones.name())) {
				return leerc_excepciones;
			}
		}
		return null;
	}

	/**
	 * Consultar enum por codigo error.
	 *
	 * @param as_codigoError el parametro codigo error
	 * @return Resultado para consultar enum codigo error retornado como
	 *         EnumExcepcionesRecuperarContrasena
	 */
	public static EnumExcepcionesRecuperarContrasena consultarEnumCodigoError(String as_codigoError) {
		for (EnumExcepcionesRecuperarContrasena leerc_excepciones : EnumExcepcionesRecuperarContrasena.values()) {
			if (as_codigoError.equals(leerc_excepciones.consultarIs_codigo())) {
				return leerc_excepciones;
			}
		}
		return null;
	}

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * EnumExcepcionesRecuperarContrasena.
	 *
	 * @param as_codigoError el parametro codigo error
	 */
	private EnumExcepcionesRecuperarContrasena(String as_codigoError) {
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
