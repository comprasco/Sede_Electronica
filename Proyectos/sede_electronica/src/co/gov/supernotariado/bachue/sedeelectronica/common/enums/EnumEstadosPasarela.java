/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnumEstadosPasarela.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.enums
 * Nombre del elemento: EnumEstadosPasarela
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.enums;

/**
 * Enumeracion para definir el grupo de constantes para Estados pasarela. <br>
 * Enum que detalla los estados posibles de una transaccion de pasarela
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumEstadosPasarela {

	/**
	 * Constante de la enumeracion para definir el item: CANCELED.
	 */
	CANCELED("CANCELED"),

	/**
	 * Constante de la enumeracion para definir el item: ERROR.
	 */
	ERROR("ERROR"),

	/**
	 * Constante de la enumeracion para definir el item: ESTADO_OK.
	 */
	ESTADO_OK("OK"),

	/**
	 * Constante de la enumeracion para definir el item: ESTADO_PENDING.
	 */
	ESTADO_PENDING("PENDING"),

	/**
	 * Constante de la enumeracion para definir el item: ESTADO_SIN_VALIDAR.
	 */
	ESTADO_SIN_VALIDAR("SIN_VALIDAR"),

	/**
	 * Constante de la enumeracion para definir el item: FAILED.
	 */
	FAILED("FAILED"),

	/**
	 * Constante de la enumeracion para definir el item: NOT_AUTORIZED.
	 */
	NOT_AUTORIZED("NOT_AUTORIZED"),

	/**
	 * Constante de la enumeracion para definir el item: RESULTADO_CORRECTO.
	 */
	RESULTADO_CORRECTO("OK"),

	/**
	 * Constante de la enumeracion para definir el item: TIPO_TRANSACCION.
	 */
	TIPO_TRANSACCION("CREACION_TRANSACCION"),

	/**
	 * Constante de la enumeracion para definir el item: VALIDACION_TRANSACCION.
	 */
	VALIDACION_TRANSACCION("VALIDACION_TOKEN");

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * criterio.
	 */
	private String is_criterio;

	/**
	 * Construye una nueva instancia/objeto de la clase EnumEstadosPasarela.
	 *
	 * @param as_criterio el parametro criterio
	 */
	private EnumEstadosPasarela(String as_criterio) {
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

	/**
	 * Metodo que permite validar si un estado de la tranasaccion es cancelado
	 * (Recuperable).
	 *
	 * @param as_valor el parametro valor
	 * @return estado si lo es o no
	 */
	public static Boolean validarEstadoErrorTransaccion(String as_valor) {
		if (as_valor.equals(EnumEstadosPasarela.ESTADO_PENDING.getIs_criterio())) {
			return true;
		}
		if (as_valor.equals(EnumEstadosPasarela.NOT_AUTORIZED.getIs_criterio())) {
			return true;
		}
		if (as_valor.equals(EnumEstadosPasarela.FAILED.getIs_criterio())) {
			return true;
		}
		if (as_valor.equals(EnumEstadosPasarela.CANCELED.getIs_criterio())) {
			return true;
		}
		if (as_valor.equals(EnumEstadosPasarela.ERROR.getIs_criterio())) {
			return true;
		}

		return false;
	}

}
