/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnumExepcionesPasarela.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones
 * Nombre del elemento: EnumExepcionesPasarela
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.IEnumCatalogoMensajes;

/**
 * Enumeracion para definir el grupo de constantes para Exepciones pasarela.
 * <br>
 * Enum que contiene la informacion de las propiedades por codigo de error
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumExepcionesPasarela implements IEnumCatalogoMensajes {

	/**
	 * Constante de la enumeracion para definir el item: DATOS_INCORRECTOS_PASARELA.
	 */
	DATOS_INCORRECTOS_PASARELA("datos.pasarela.incorrectos");

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo error.
	 */
	private final String is_codigoError;

	/**
	 * Define la constante NOMBRE_BUNDLE.
	 */
	public static final String NOMBRE_BUNDLE = "excepciones.excepcion_pasarela_%s";

	/**
	 * Consultar enum por nombre.
	 *
	 * @param as_nombreEnum el parametro nombre enum
	 * @return Resultado para consultar enum retornado como EnumExcepcionesGenerales
	 */
	public static EnumExcepcionesGenerales consultarEnum(String as_nombreEnum) {
		for (EnumExcepcionesGenerales leeg_excepciones : EnumExcepcionesGenerales.values()) {
			if (as_nombreEnum.equals(leeg_excepciones.name())) {
				return leeg_excepciones;
			}
		}
		return null;
	}

	/**
	 * Consultar enum por codigo error.
	 *
	 * @param as_codigoError el parametro codigo error
	 * @return Resultado para consultar enum codigo error retornado como
	 *         EnumExcepcionesGenerales
	 */
	public static EnumExcepcionesGenerales consultarEnumCodigoError(String as_codigoError) {
		for (EnumExcepcionesGenerales leeg_excepciones : EnumExcepcionesGenerales.values()) {
			if (as_codigoError.equals(leeg_excepciones.consultarIs_codigo())) {
				return leeg_excepciones;
			}
		}
		return null;
	}

	/**
	 * Construye una nueva instancia/objeto de la clase EnumExepcionesPasarela.
	 *
	 * @param as_codigoError el parametro codigo error
	 */
	private EnumExepcionesPasarela(String as_codigoError) {
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
