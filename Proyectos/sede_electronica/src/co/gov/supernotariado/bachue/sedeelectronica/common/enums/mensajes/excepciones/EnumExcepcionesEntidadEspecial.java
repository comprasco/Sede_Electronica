/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnumExcepcionesEntidadEspecial.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones
 * Nombre del elemento: EnumExcepcionesEntidadEspecial
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones;

import java.io.Serializable;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.IEnumCatalogoMensajes;

/**
 * Enumeracion para definir el grupo de constantes para Excepciones entidad
 * especial. <br>
 * Enum que contiene la informacion de las propiedades por codigo de error
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumExcepcionesEntidadEspecial implements IEnumCatalogoMensajes, Serializable {

	/**
	 * Constante de la enumeracion para definir el item: ASOCIACION_INEXISTENTE.
	 */
	// Enum que aloja nombre del archivo que contiene las propiedades y un codigo
	// que representa el error existente
	ASOCIACION_INEXISTENTE("entidadEspecial.asociacion.incorrecta"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * ENTIDAD_ESPECIAL_INEXISTENTE.
	 */
	ENTIDAD_ESPECIAL_INEXISTENTE("entidad.especial.inexistente"),

	/**
	 * Constante de la enumeracion para definir el item: DATOS_ERRONEOS_EE.
	 */
	DATOS_ERRONEOS_EE("entidad.especial.admin.creacion.form");

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo error.
	 */
	private final String is_codigoError;

	/**
	 * Define la constante NOMBRE_BUNDLE.
	 */
	public static final String NOMBRE_BUNDLE = "excepciones.excepcion_entidad_especial_%s";

	/**
	 * Consultar enum.
	 *
	 * @param as_nombreEnum el parametro nombre enum
	 * @return Resultado para consultar enum retornado como
	 *         EnumExcepcionesEntidadEspecial
	 */
	public static EnumExcepcionesEntidadEspecial consultarEnum(String as_nombreEnum) {
		for (EnumExcepcionesEntidadEspecial leeee_excepciones : EnumExcepcionesEntidadEspecial.values()) {
			if (as_nombreEnum.equals(leeee_excepciones.name())) {
				return leeee_excepciones;
			}
		}
		return null;
	}

	/**
	 * Consultar enum codigo error.
	 *
	 * @param as_codigoError el parametro codigo error
	 * @return Resultado para consultar enum codigo error retornado como
	 *         EnumExcepcionesEntidadEspecial
	 */
	public static EnumExcepcionesEntidadEspecial consultarEnumCodigoError(String as_codigoError) {
		for (EnumExcepcionesEntidadEspecial leeee_excepciones : EnumExcepcionesEntidadEspecial.values()) {
			if (as_codigoError.equals(leeee_excepciones.consultarIs_codigo())) {
				return leeee_excepciones;
			}
		}
		return null;
	}

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * EnumExcepcionesEntidadEspecial.
	 *
	 * @param as_codigoError el parametro codigo error
	 */
	private EnumExcepcionesEntidadEspecial(String as_codigoError) {
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
