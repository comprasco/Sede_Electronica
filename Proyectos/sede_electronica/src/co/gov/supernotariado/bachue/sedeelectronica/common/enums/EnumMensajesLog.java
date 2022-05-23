/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnumMensajesLog.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.enums
 * Nombre del elemento: EnumMensajesLog
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.enums;

/**
 * Enumeracion para definir el grupo de constantes para Mensajes log. <br>
 * Enum que contiene mensajes de log de eventos
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumMensajesLog {

	/**
	 * Constante de la enumeracion para definir el item: INICIO_SESION_INCORRECTO.
	 */
	INICIO_SESION_INCORRECTO("No fue posible realizar log de inicio sesion"),

	/**
	 * Constante de la enumeracion para definir el item: INICIO_SESION_INCORRECTO.
	 */
	ENVIO_CORREO_EXITOSO("Mensaje enviado exitosamente"),
	
	/**
	 * Constante de la enumeracion para definir el item: ENVIO_CORREO_NO_EXITOSO.
	 */
	ENVIO_CORREO_NO_EXITOSO("Mensaje no enviado exitosamente"),
	
	
	/**
	 * Constante de la enumeracion para definir el item: URL_INCORRECTA.
	 */
	URL_INCORRECTA("Solicitud incorrecta"),
	
	/**
	 * Constante de la enumeracion para definir el item: ENVIO_CORREO_NO_EXITOSO.
	 */
	ACTUALIZACION_METADATOS_PODER("Se ha actualizado metada del poder"),
	
	/**
	 * Constante de la enumeracion para definir el item: ENVIO_CORREO_NO_EXITOSO.
	 */
	ENVIO_PODER("Se ha enviado poder"),
	
	/**
	 * Constante de la enumeracion para definir el item: USUARIO_ELIMINADO.
	 */
	USUARIO_ELIMINADO("Usuario Eliminado: "),
	
	/**
	 * Constante de la enumeracion para definir el item: CONTROL_EXCEPCION_FALLIDO.
	 */
	CONTROL_EXCEPCION_FALLIDO("Flujo de escepciones fallido, excepcion no controlada.");

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * criterio.
	 */
	private String is_criterio;

	/**
	 * Construye una nueva instancia/objeto de la clase EnumMensajesLog.
	 *
	 * @param as_criterio el parametro criterio
	 */
	private EnumMensajesLog(String as_criterio) {
		this.is_criterio = as_criterio;
	}

	/**
	 * Obtiene el valor para la propiedad criterio.
	 *
	 * @return El valor de la propiedad criterio
	 */
	public String getIs_criterio() {
		return is_criterio;
	}
}
