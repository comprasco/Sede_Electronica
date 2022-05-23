/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EstadoLiquidacionWSDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto
 * Nombre del elemento: EstadoLiquidacionWSDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto;

import java.math.BigDecimal;

/**
 * Clase tipo objeto de transferencia de datos para web service (WSDTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y servicios web.
 * <br>
 * Contiene propiedades para representar los datos del objeto Estado
 * liquidacion.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class EstadoLiquidacionWSDTO {
	
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero referencia.
	 */
    private String is_numeroReferencia;
    
    /**
	 * Atributo de instancia tipo numero real/decimal de gran magnitud para definir
	 * la propiedad monto transaccion.
	 */
    private BigDecimal ibd_montoTransaccion;
    
	/**
	 * Obtiene el valor para la propiedad numero referencia.
	 *
	 * @return El valor de la propiedad numero referencia
	 */
	public String getIs_numeroReferencia() {
		return is_numeroReferencia;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad numero referencia.
	 *
	 * @param as_numeroReferencia el nuevo valor para la propiedad numero referencia
	 */
	public void setIs_numeroReferencia(String as_numeroReferencia) {
		this.is_numeroReferencia = as_numeroReferencia;
	}
	
	/**
	 * Obtiene el valor para la propiedad monto transaccion.
	 *
	 * @return El valor de la propiedad monto transaccion
	 */
	public BigDecimal getIbd_montoTransaccion() {
		return ibd_montoTransaccion;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad monto transaccion.
	 *
	 * @param abd_montoTransaccion el nuevo valor para la propiedad monto
	 *                             transaccion
	 */
	public void setIbd_montoTransaccion(BigDecimal abd_montoTransaccion) {
		this.ibd_montoTransaccion = abd_montoTransaccion;
	}   

}
