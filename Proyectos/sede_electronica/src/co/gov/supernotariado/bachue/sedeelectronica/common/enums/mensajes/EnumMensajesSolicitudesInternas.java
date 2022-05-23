/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnumMensajesBandejaAlertas.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes
 * Nombre del elemento: EnumMensajesBandejaAlertas
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.IEnumCatalogoMensajes;

/**
 * Enumeracion para definir el grupo de constantes para Mensajes bandeja
 * alertas. <br>
 * Enum que contiene la informacion de las propiedades por codigo de mensaje
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumMensajesSolicitudesInternas implements IEnumCatalogoMensajes {

	// Enum que aloja nombre del archivo que contiene las propiedades y un codigo
	// que representa el mensaje existente

	/**
	 * Constante de la enumeracion para definir el item: MAPA_ENCONTRADO.
	 */
	SOLICITUD_CREADA("solicitud.creada"),
	SOLICITUD_GUARDADA_EXITOSAMENTE("solicitud.guardada.exitosamente"),
	NOTIFICACION_GUARDAD_EXITO("notificacion.guardada.exitosamente"),
	SOLICITUD_JUSTIFICACION("mensajes.solicitud.justificacion");

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo.
	 */
	private final String is_codigo;

	/**
	 * Define la constante NOMBRE_BUNDLE.
	 */
	public static final String NOMBRE_BUNDLE = "mensajes.mensajes_solicitudes_internas_%s";

	/**
	 * Construye una nueva instancia/objeto de la clase EnumMensajesBandejaAlertas.
	 *
	 * @param as_codigo el parametro codigo
	 */
	private EnumMensajesSolicitudesInternas(String as_codigo) {
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
