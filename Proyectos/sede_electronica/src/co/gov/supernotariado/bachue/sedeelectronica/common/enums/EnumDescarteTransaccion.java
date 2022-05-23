/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnumDescarteTransaccion.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.enums
 * Nombre del elemento: EnumDescarteTransaccion
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.enums;

/**
 * Enumeracion para definir el grupo de constantes para Descarte transaccion.
 * <br>
 * Enum que contiene el motivo y observacion de descarte de una solicitud con
 * NIR
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumDescarteTransaccion {

	/**
	 * Constante de la enumeracion para definir el item:
	 * MOTIVO_SOLICITUD_DESCARTADA_USUARIO.
	 */
	MOTIVO_SOLICITUD_DESCARTADA_USUARIO("SOLICITUD_DESCARTADA", "SOLICITUD DESCARTADA"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * OBSERVACION_SOLICITUD_DESCARTADA_USUARIO.
	 */
	OBSERVACION_SOLICITUD_DESCARTADA_USUARIO("DESCARTE_USUARIO", "SOLICITUD DESCARTADA POR EL USUARIO");

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo.
	 */
	private String is_codigo;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * mensaje.
	 */
	private String is_mensaje;

	/**
	 * Construye una nueva instancia/objeto de la clase EnumDescarteTransaccion.
	 *
	 * @param as_codigo        el parametro codigo
	 * @param as_nombreLegible el parametro nombre legible
	 */
	private EnumDescarteTransaccion(String as_codigo, String as_nombreLegible) {
		this.is_codigo = as_codigo;
		this.is_mensaje = as_nombreLegible;
	}

	/**
	 * Obtiene el valor para la propiedad codigo.
	 *
	 * @return El valor de la propiedad codigo
	 */
	public String getIs_codigo() {
		return is_codigo;
	}

	/**
	 * Obtiene el valor para la propiedad mensaje.
	 *
	 * @return El valor de la propiedad mensaje
	 */
	public String getIs_mensaje() {
		return is_mensaje;
	}

}
