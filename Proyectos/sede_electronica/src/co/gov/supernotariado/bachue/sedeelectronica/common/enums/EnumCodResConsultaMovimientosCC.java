/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnumCodResConsultaMovimientosCC.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.enums
 * Nombre del elemento: EnumCodResConsultaMovimientosCC
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.enums;

/**
 * Enumeracion para definir el grupo de constantes para Cod res consulta
 * movimientos cuenta cupo. <br>
 * Enum que contiene los codigos de respuesta de servicios y el mensaje
 * correspondiente.
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumCodResConsultaMovimientosCC {

	/**
	 * Constante de la enumeracion para definir el item: CODIGO_400.
	 */
	CODIGO_400("400", "La fecha inicial no puede ser anterior a la fecha de la primer recarga de la cuenta cupo: "),

	/**
	 * Constante de la enumeracion para definir el item: CODIGO_422.
	 */
	CODIGO_422("422", "No existen movimientos para el rango de fechas."),

	/**
	 * Constante de la enumeracion para definir el item: RECARGA.
	 */
	RECARGA("RECARGA", "RECARGA"),

	/**
	 * Constante de la enumeracion para definir el item: CONSUMO.
	 */
	CONSUMO("CONSUMO", "CONSUMO"),;

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
	 * Construye una nueva instancia/objeto de la clase
	 * EnumCodResConsultaMovimientosCC.
	 *
	 * @param as_codigo  el parametro codigo
	 * @param as_mensaje el parametro mensaje
	 */
	private EnumCodResConsultaMovimientosCC(String as_codigo, String as_mensaje) {
		this.is_codigo = as_codigo;
		this.is_mensaje = as_mensaje;
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
