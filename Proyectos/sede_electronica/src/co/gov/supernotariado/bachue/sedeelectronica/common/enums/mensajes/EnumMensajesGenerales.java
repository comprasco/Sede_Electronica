/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnumMensajesGenerales.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes
 * Nombre del elemento: EnumMensajesGenerales
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.IEnumCatalogoMensajes;

/**
 * Enumeracion para definir el grupo de constantes para Mensajes generales. <br>
 * Enum que contiene la informacion de las propiedades por codigo de mensaje
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumMensajesGenerales implements IEnumCatalogoMensajes {

	/**
	 * Constante de la enumeracion para definir el item: ACTUALIZADO_EXITO.
	 */
	// Enum que aloja nombre del archivo que contiene las propiedades y un codigo
	// que representa el mensaje existente
	ACTUALIZADO_EXITO("mensajes.actualizado"),

	/**
	 * Constante de la enumeracion para definir el item: ERROR_GENERAL.
	 */
	ERROR_GENERAL("mensajes.error"),

	/**
	 * Constante de la enumeracion para definir el item: ENCABEZADO_GENERAL.
	 */
	ENCABEZADO_GENERAL("mensajes.encabezado.usuario.sesion.general"),
	
	/**
	 * Constante de la enumeracion para definir el item: ENVIO_CORREO_EXITOSO.
	 */
	ENVIO_CORREO_EXITOSO("mensajes.correo.exitoso"),
	
	/**
	 * Constante de la enumeracion para definir el item: ENVIO_CORREO_EXITOSO.
	 */
	ENVIO_CORREO_NO_EXITOSO("mensajes.correo.no.exitoso"),

	/**
	 * Constante de la enumeracion para definir el item: ENCABEZADO_ADMIN_SNR_EE.
	 */
	ENCABEZADO_ADMIN_SNR_EE("mensajes.encabezado.admini.snr.sesion.ee"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * ENCABEZADO_ASOCIADO_GENERAL.
	 */
	ENCABEZADO_ASOCIADO_GENERAL("mensajes.encabezado.usuario.sesion.asociado.general"),

	/**
	 * Constante de la enumeracion para definir el item: ENCABEZADO_EE.
	 */
	ENCABEZADO_EE("mensajes.encabezado.usuario.sesion.ee"),

	/**
	 * Constante de la enumeracion para definir el item: CUERPO_ASOCIADO_PJ.
	 */
	CUERPO_ASOCIADO_PJ("mensajes.cuerpo.usuario.sesion.asociado.pj"),

	/**
	 * Constante de la enumeracion para definir el item: CUERPO_EE_GENERAL.
	 */
	CUERPO_EE_GENERAL("mensajes.cuerpo.usuario.sesion.ee"),
	
	/**
	 * Constante de la enumeracion para definir el item: CUERPO_EE_CONVENIO.
	 */
	CUERPO_EE_CONVENIO("mensajes.cuerpo.convenio.sesion.ee"),

	/**
	 * Constante de la enumeracion para definir el item: CUERPO_PJ.
	 */
	CUERPO_PJ("mensajes.cuerpo.usuario.sesion.pj");

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo.
	 */
	private final String is_codigo;

	/**
	 * Define la constante NOMBRE_BUNDLE.
	 */
	public static final String NOMBRE_BUNDLE = "mensajes.mensajes_%s";

	/**
	 * Construye una nueva instancia/objeto de la clase EnumMensajesGenerales.
	 *
	 * @param as_codigo el parametro codigo
	 */
	private EnumMensajesGenerales(String as_codigo) {
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
