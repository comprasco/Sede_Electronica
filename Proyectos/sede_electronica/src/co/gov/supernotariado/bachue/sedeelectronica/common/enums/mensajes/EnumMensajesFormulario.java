/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnumMensajesCuentaCupo.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes
 * Nombre del elemento: EnumMensajesCuentaCupo
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.IEnumCatalogoMensajes;

/**
 * Enumeracion para definir el grupo de constantes para Mensajes cuenta cupo.
 * <br>
 * Enum que contiene la informacion de las propiedades por codigo de mensaje
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumMensajesFormulario implements IEnumCatalogoMensajes {

	// Enum que aloja nombre del archivo que contiene las propiedades y un codigo
	// que representa el mensaje existente

	/**
	 * Constante de la enumeracion para definir el item: ARCHIVO_CARGADO.
	 */
	ARCHIVO_CARGADO("mensajes.archivo.cargado"),
	/**
	 * Constante de la enumeracion para definir el item: ARCHIVO_SUBIDO_OWCC.
	 */
	ARCHIVO_SUBIDO_OWCC("mensajes.archivo.subido"),

	/**
	 * Constante de la enumeracion para definir el item: GUARDADO_EXITOSO.
	 */
	GUARDADO_EXITOSO("mensajes.guardando.datos"),
	/**
	 * Constante de la enumeracion para definir el item: DATOS_OBLIGATORIOS_NULOS.
	 */
	DATOS_OBLIGATORIOS_NULOS("mensajes.datos.nulos");

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo.
	 */
	private final String is_codigo;

	/**
	 * Define la constante NOMBRE_BUNDLE.
	 */
	public static final String NOMBRE_BUNDLE = "mensajes.mensajes_cuenta_cupo_%s";

	/**
	 * Construye una nueva instancia/objeto de la clase EnumMensajesCuentaCupo.
	 *
	 * @param as_codigo el parametro codigo
	 */
	private EnumMensajesFormulario(String as_codigo) {
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
