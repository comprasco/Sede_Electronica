/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnumMensajesRol.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes
 * Nombre del elemento: EnumMensajesRol
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.IEnumCatalogoMensajes;

/**
 * Enumeracion para definir el grupo de constantes para Mensajes rol. <br>
 * Enum que contiene la informacion de las propiedades por codigo de mensaje
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumMensajesRol implements IEnumCatalogoMensajes {

	// Enum que aloja nombre del archivo que contiene las propiedades y un codigo
	// que representa el mensaje existente

	/**
	 * Constante de la enumeracion para definir el item: REGISTRO_EXITOSO.
	 */
	REGISTRO_EXITOSO("registro.exitoso"),

	/**
	 * Constante de la enumeracion para definir el item: CAMBIO_ROL_EXITOSO.
	 */
	CAMBIO_ROL_EXITOSO("cambio.rol.exitoso"),

	/**
	 * Constante de la enumeracion para definir el item: CAMBIO_ROL_ERROR.
	 */
	CAMBIO_ROL_ERROR("cambio.rol.error");

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo.
	 */
	private final String is_codigo;

	/**
	 * Define la constante NOMBRE_BUNDLE.
	 */
	public static final String NOMBRE_BUNDLE = "mensajes.mensajes_rol_%s";

	/**
	 * Construye una nueva instancia/objeto de la clase EnumMensajesRol.
	 *
	 * @param as_codigo el parametro codigo
	 */
	private EnumMensajesRol(String as_codigo) {
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
