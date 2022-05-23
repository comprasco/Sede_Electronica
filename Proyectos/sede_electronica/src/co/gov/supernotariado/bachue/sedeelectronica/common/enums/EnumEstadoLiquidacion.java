/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnumEstadoLiquidacion.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.enums
 * Nombre del elemento: EnumEstadoLiquidacion
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.enums;

/**
 * Enumeracion para definir el grupo de constantes para Estado liquidacion. <br>
 * Enum de los estados de la solicitud generada
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumEstadoLiquidacion {

	/**
	 * Constante de la enumeracion para definir el item: REFERENCIA_VENCIDA.
	 */
	REFERENCIA_VENCIDA("ReferenciaVencida"),

	/**
	 * Constante de la enumeracion para definir el item: REFERENCIA_PAGADA.
	 */
	REFERENCIA_PAGADA("ReferenciaPagada"),

	/**
	 * Constante de la enumeracion para definir el item: REFERENCIA_DISPONIBLE.
	 */
	REFERENCIA_DISPONIBLE("ReferenciaDisponible"),

	/**
	 * Constante de la enumeracion para definir el item: RECIBO_CAJA_GENREADO.
	 */
	RECIBO_CAJA_GENREADO("ReciboCajaGenerado"),

	/**
	 * Constante de la enumeracion para definir el item: PRODUCTO_ENTREGADO.
	 */
	PRODUCTO_ENTREGADO("ProductoEntregado"),

	/**
	 * Constante de la enumeracion para definir el item: REFERENCIA_ANULADA.
	 */
	REFERENCIA_ANULADA("ReferenciaAnulada"),;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * respuesta.
	 */
	private String is_respuesta;

	/**
	 * Construye una nueva instancia/objeto de la clase EnumEstadoLiquidacion.
	 *
	 * @param as_respuesta el parametro respuesta
	 */
	private EnumEstadoLiquidacion(String as_respuesta) {
		this.is_respuesta = as_respuesta;
	}

	/**
	 * Obtiene el valor para la propiedad respuesta.
	 *
	 * @return El valor de la propiedad respuesta
	 */
	public String getIs_respuesta() {
		return is_respuesta;
	}
}
