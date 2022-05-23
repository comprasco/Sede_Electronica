/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: TipoSalidaConsultarSolicitudVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.solicitudcopias
 * Nombre del elemento: TipoSalidaConsultarSolicitudVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.vo.solicitudcopias;

import java.util.Date;

import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;

/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Tipo salida consultar solicitud .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoSalidaConsultarSolicitudVO extends ClienteIntegracionVO{

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * valor pago.
	 */
	private String is_valorPago;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * referencia pago.
	 */
	private String is_referenciaPago;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * estado.
	 */
	private String is_estado;
	
	/**
	 * Atributo de instancia tipo fecha para definir la propiedad fecha liquidacion.
	 */
	private Date id_fechaLiquidacion;
	
	/**
	 * Atributo de instancia tipo fecha para definir la propiedad fecha vencimiento
	 * pago.
	 */
	private Date id_fechaVencimientoPago;
	
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
	 * Obtiene el valor para la propiedad valor pago.
	 *
	 * @return El valor de la propiedad valor pago
	 */
	public String getIs_valorPago() {
		return is_valorPago;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad valor pago.
	 *
	 * @param as_valorPago el nuevo valor para la propiedad valor pago
	 */
	public void setIs_valorPago(String as_valorPago) {
		this.is_valorPago = as_valorPago;
	}
	
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
	
	/**
	 * Obtiene el valor para la propiedad estado.
	 *
	 * @return El valor de la propiedad estado
	 */
	public String getIs_estado() {
		return is_estado;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad estado.
	 *
	 * @param as_estado el nuevo valor para la propiedad estado
	 */
	public void setIs_estado(String as_estado) {
		this.is_estado = as_estado;
	}
	
	/**
	 * Obtiene el valor para la propiedad fecha liquidacion.
	 *
	 * @return El valor de la propiedad fecha liquidacion
	 */
	public Date getId_fechaLiquidacion() {
		return id_fechaLiquidacion;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad fecha liquidacion.
	 *
	 * @param ad_fechaLiquidacion el nuevo valor para la propiedad fecha liquidacion
	 */
	public void setId_fechaLiquidacion(Date ad_fechaLiquidacion) {
		this.id_fechaLiquidacion = ad_fechaLiquidacion;
	}
	
	/**
	 * Obtiene el valor para la propiedad fecha vencimiento pago.
	 *
	 * @return El valor de la propiedad fecha vencimiento pago
	 */
	public Date getId_fechaVencimientoPago() {
		return id_fechaVencimientoPago;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad fecha vencimiento pago.
	 *
	 * @param ad_fechaVencimientoPago el nuevo valor para la propiedad fecha
	 *                                vencimiento pago
	 */
	public void setId_fechaVencimientoPago(Date ad_fechaVencimientoPago) {
		this.id_fechaVencimientoPago = ad_fechaVencimientoPago;
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
	 * Cambia/actualiza el valor para la propiedad codigo.
	 *
	 * @param as_codigo el nuevo valor para la propiedad codigo
	 */
	public void setIs_codigo(String as_codigo) {
		this.is_codigo = as_codigo;
	}
	
	/**
	 * Obtiene el valor para la propiedad mensaje.
	 *
	 * @return El valor de la propiedad mensaje
	 */
	public String getIs_mensaje() {
		return is_mensaje;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad mensaje.
	 *
	 * @param as_mensaje el nuevo valor para la propiedad mensaje
	 */
	public void setIs_mensaje(String as_mensaje) {
		this.is_mensaje = as_mensaje;
	}
	
}
