/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnumExcepcionesPersonaJuridica.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones
 * Nombre del elemento: EnumExcepcionesPersonaJuridica
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones;

import java.io.Serializable;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.IEnumCatalogoMensajes;

/**
 * Enumeracion para definir el grupo de constantes para Excepciones persona
 * juridica. <br>
 * Enum que contiene la informacion de las propiedades por codigo de error
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumExcepcionesPersonaJuridica implements IEnumCatalogoMensajes, Serializable {

	/**
	 * Constante de la enumeracion para definir el item:
	 * PERSONA_JURIDICA_NO_DISPONIBLE.
	 */
	// Enum que aloja nombre del archivo que contiene las propiedades y un codigo
	// que representa el error existente
	PERSONA_JURIDICA_NO_DISPONIBLE("usuario.juridica.no.disponible");

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo error.
	 */
	private final String is_codigoError;

	/**
	 * Define la constante NOMBRE_BUNDLE.
	 */
	public static final String NOMBRE_BUNDLE = "excepciones.excepcion_personaJuridica_%s";

	/**
	 * Consultar enum por nombre.
	 *
	 * @param as_nombreEnum el parametro nombre enum
	 * @return Resultado para consultar enum retornado como
	 *         EnumExcepcionesPersonaJuridica
	 */
	public static EnumExcepcionesPersonaJuridica consultarEnum(String as_nombreEnum) {
		for (EnumExcepcionesPersonaJuridica leepj_excepciones : EnumExcepcionesPersonaJuridica.values()) {
			if (as_nombreEnum.equals(leepj_excepciones.name())) {
				return leepj_excepciones;
			}
		}
		return null;
	}

	/**
	 * Consultar enum por codigo error.
	 *
	 * @param as_codigoError el parametro codigo error
	 * @return Resultado para consultar enum codigo error retornado como
	 *         EnumExcepcionesPersonaJuridica
	 */
	public static EnumExcepcionesPersonaJuridica consultarEnumCodigoError(String as_codigoError) {
		for (EnumExcepcionesPersonaJuridica leepj_excepciones : EnumExcepcionesPersonaJuridica.values()) {
			if (as_codigoError.equals(leepj_excepciones.consultarIs_codigo())) {
				return leepj_excepciones;
			}
		}
		return null;
	}

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * EnumExcepcionesPersonaJuridica.
	 *
	 * @param as_codigoError el parametro codigo error
	 */
	private EnumExcepcionesPersonaJuridica(String as_codigoError) {
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
