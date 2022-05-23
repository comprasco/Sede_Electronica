/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnumExcepcionesModeloMinuta.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones
 * Nombre del elemento: EnumExcepcionesModeloMinuta
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones;

import java.io.Serializable;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.IEnumCatalogoMensajes;

/**
 * Enumeracion para definir el grupo de constantes para Excepciones modelo
 * minuta. <br>
 * Enum que contiene la informacion de las propiedades por codigo de error
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumExcepcionesModeloMinuta implements IEnumCatalogoMensajes, Serializable {

	/**
	 * Constante de la enumeracion para definir el item: NOMBRE_MODELO_MINUTA.
	 */
	// Enum que aloja nombre del archivo que contiene las propiedades y un codigo
	// que representa el error existente
	NOMBRE_MODELO_MINUTA("nombre.modelo.existente");

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo error.
	 */
	private final String is_codigoError;

	/**
	 * Define la constante NOMBRE_BUNDLE.
	 */
	public static final String NOMBRE_BUNDLE = "excepciones.excepcion_modelo_minuta_%s";

	/**
	 * Consultar enum por nombre.
	 *
	 * @param as_nombreEnum el parametro nombre enum
	 * @return Resultado para consultar enum retornado como
	 *         EnumExcepcionesModeloMinuta
	 */
	public static EnumExcepcionesModeloMinuta consultarEnum(String as_nombreEnum) {
		for (EnumExcepcionesModeloMinuta leemm_excepciones : EnumExcepcionesModeloMinuta.values()) {
			if (as_nombreEnum.equals(leemm_excepciones.name())) {
				return leemm_excepciones;
			}
		}
		return null;
	}

	/**
	 * Consultar enum por codigo error.
	 *
	 * @param as_codigoError el parametro codigo error
	 * @return Resultado para consultar enum codigo error retornado como
	 *         EnumExcepcionesModeloMinuta
	 */
	public static EnumExcepcionesModeloMinuta consultarEnumCodigoError(String as_codigoError) {
		for (EnumExcepcionesModeloMinuta leemm_excepciones : EnumExcepcionesModeloMinuta.values()) {
			if (as_codigoError.equals(leemm_excepciones.consultarIs_codigo())) {
				return leemm_excepciones;
			}
		}
		return null;
	}

	/**
	 * Construye una nueva instancia/objeto de la clase EnumExcepcionesModeloMinuta.
	 *
	 * @param as_codigoError el parametro codigo error
	 */
	private EnumExcepcionesModeloMinuta(String as_codigoError) {
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
