/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: TipoEntradaObtenerTurnosRefPagoVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.entregaproducto
 * Nombre del elemento: TipoEntradaObtenerTurnosRefPagoVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.vo.entregaproducto;

import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;

/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Tipo entrada obtener turnos ref pago .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoEntradaObtenerTurnosRefPagoVO extends ClienteIntegracionVO{

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * referencia pago.
	 */
	private String is_referenciaPago;
	
	/**
	 * Obtiene el valor para la propiedad referencia pago.
	 *
	 * @return El valor de la propiedad referencia pago
	 */
	public String getIs_referenciaPago() {
		return is_referenciaPago;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad referencia pago.
	 *
	 * @param as_referenciaPago el nuevo valor para la propiedad referencia pago
	 */
	public void setIs_referenciaPago(String as_referenciaPago) {
		this.is_referenciaPago = as_referenciaPago;
	}	
}
