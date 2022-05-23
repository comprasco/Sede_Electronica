/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TipoSalidaConsultarSolicitudWSDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto
 * Nombre del elemento: TipoSalidaConsultarSolicitudWSDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto;

import java.util.Date;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.interfaces.ISalidaServicioWSDTO;

/**
 * Clase tipo objeto de transferencia de datos para web service (WSDTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y servicios web.
 * <br>
 * Contiene propiedades para representar los datos del objeto Tipo salida
 * consultar solicitud.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoSalidaConsultarSolicitudWSDTO extends GenericoDTO implements ISalidaServicioWSDTO{

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
	 * Cambia/actualiza el valor para la propiedad codigo.
	 *
	 * @param as_codigo el nuevo valor para la propiedad codigo
	 */
	public void setIs_codigo(String as_codigo) {
		this.is_codigo = as_codigo;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad mensaje.
	 *
	 * @param as_mensaje el nuevo valor para la propiedad mensaje
	 */
	public void setIs_mensaje(String as_mensaje) {
		this.is_mensaje = as_mensaje;
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.interfaces.ISalidaServicioWSDTO#getIs_codigoMensaje()
	 */
	@Override
	public String getIs_codigoMensaje() {
		return is_codigo;
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.interfaces.ISalidaServicioWSDTO#getIs_descripcionMensaje()
	 */
	@Override
	public String getIs_descripcionMensaje() {
		return is_mensaje;
	}
	
}
