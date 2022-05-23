/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: EnumLog.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.enums
 * Nombre del elemento: EnumLog
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.enums;

/**
 * Enumeracion para definir el grupo de constantes para Log. <br>
 * Enum con los tipos de mensajes log a utilizar en el proyecto.
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumLog {

	/**
	 * Constante de la enumeracion para definir el item: ENTRADA_SERVICIO.
	 */
	ENTRADA_SERVICIO("entrada_operacion_servicio", true),

	/**
	 * Constante de la enumeracion para definir el item: SALIDA_SERVICIO.
	 */
	SALIDA_SERVICIO("salida_servicio", true),

	/**
	 * Constante de la enumeracion para definir el item:
	 * ENTRADA_CREACION_CLIENTE_SERVICIO.
	 */
	ENTRADA_CREACION_CLIENTE_SERVICIO("entrada_creacion_servicio", true);

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo.
	 */
	private final String is_codigo;

	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad valor.
	 */
	private final Boolean ib_valor;

	/**
	 * Construye una nueva instancia/objeto de la clase EnumLog.
	 *
	 * @param as_codigo el parametro codigo
	 * @param ab_valor  el parametro valor
	 */
	private EnumLog(String as_codigo, Boolean ab_valor) {
		this.is_codigo = as_codigo;
		this.ib_valor = ab_valor;
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
	 * Obtiene el valor para la propiedad valor.
	 *
	 * @return El valor de la propiedad valor
	 */
	public Boolean getIb_valor() {
		return ib_valor;
	}

	/**
	 * Consultar log.
	 * Metodo que consulta un EnumLog por su codigo
	 * @param as_tipo el parametro tipo
	 * @return Resultado para consultar log retornado como EnumLog
	 */
	public static EnumLog consultarLog(String as_tipo) {
		for (EnumLog lel_enum : EnumLog.values()) {
			if (lel_enum.getIs_codigo().equals(as_tipo))
				return lel_enum;
		}
		return null;
	}
}
