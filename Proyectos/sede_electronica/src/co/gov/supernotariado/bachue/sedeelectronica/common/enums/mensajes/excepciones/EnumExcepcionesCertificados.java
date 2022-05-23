/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnumExcepcionesCertificados.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones
 * Nombre del elemento: EnumExcepcionesCertificados
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones;

import java.io.Serializable;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.IEnumCatalogoMensajes;

/**
 * Enumeracion para definir el grupo de constantes para Excepciones
 * certificados. <br>
 * Enum que contiene la informacion de las propiedades por codigo de error
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumExcepcionesCertificados implements IEnumCatalogoMensajes, Serializable {

	/**
	 * Constante de la enumeracion para definir el item: ERROR_CERTIFICADOS.
	 */
	// Enum que aloja nombre del archivo que contiene las propiedades y un codigo
	// que representa el error existente
	ERROR_CERTIFICADOS("error.certificados"),

	/**
	 * Constante de la enumeracion para definir el item: ERROR_MATRICULA_TRASLADADA.
	 */
	ERROR_MATRICULA_TRASLADADA("error.matricula.trasladada"),

	/**
	 * Constante de la enumeracion para definir el item: ERROR_MATRICULA_CARGADA.
	 */
	ERROR_MATRICULA_CARGADA("error.matricula.cargada"),
	/**
	 * Constante de la enumeracion para definir el item: ERROR_MATRICULA_ANULADA.
	 */
	ERROR_MATRICULA_ANULADA("error.matricula.anulada"),
	/**
	 * Constante de la enumeracion para definir el item: ERROR_COEXISTENCIA.
	 */
	ERROR_COEXISTENCIA("error.coexistencia");

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo error.
	 */
	private final String is_codigoError;

	/**
	 * Define la constante NOMBRE_BUNDLE.
	 */
	public static final String NOMBRE_BUNDLE = "excepciones.excepcion_certificados_%s";

	/**
	 * Construye una nueva instancia/objeto de la clase EnumExcepcionesCertificados.
	 *
	 * @param as_codigoError el parametro codigo error
	 */
	private EnumExcepcionesCertificados(String as_codigoError) {
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
