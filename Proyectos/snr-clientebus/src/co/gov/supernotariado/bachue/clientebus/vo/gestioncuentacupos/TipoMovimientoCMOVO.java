/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: TipoMovimientoCMOVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos
 * Nombre del elemento: TipoMovimientoCMOVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos;

import java.util.Date;

import co.gov.supernotariado.bachue.clientebus.vo.GenericoVO;

/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Tipo movimiento CMO .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoMovimientoCMOVO extends GenericoVO{

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad id.
	 */
	private String is_id;
	
	/**
	 * Atributo de instancia tipo fecha para definir la propiedad fecha movimiento.
	 */
	private Date id_fechaMovimiento;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo.
	 */
	private String is_tipo;
	
	/**
	 * Atributo de instancia tipo TipoNotaCreditoCMOVO para definir la propiedad
	 * nota credito.
	 */
	private TipoNotaCreditoCMOVO itnc_notaCredito;
	
	/**
	 * Atributo de instancia tipo TipoReciboCajaCMOVO para definir la propiedad
	 * recibo caja.
	 */
	private TipoReciboCajaCMOVO itrc_reciboCaja;
	
	/**
	 * Obtiene el valor para la propiedad id.
	 *
	 * @return El valor de la propiedad id
	 */
	public String getIs_id() {
		return is_id;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad id.
	 *
	 * @param as_id el nuevo valor para la propiedad id
	 */
	public void setIs_id(String as_id) {
		this.is_id = as_id;
	}
	
	/**
	 * Obtiene el valor para la propiedad fecha movimiento.
	 *
	 * @return El valor de la propiedad fecha movimiento
	 */
	public Date getId_fechaMovimiento() {
		return id_fechaMovimiento;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad fecha movimiento.
	 *
	 * @param ad_fechaMovimiento el nuevo valor para la propiedad fecha movimiento
	 */
	public void setId_fechaMovimiento(Date ad_fechaMovimiento) {
		this.id_fechaMovimiento = ad_fechaMovimiento;
	}
	
	/**
	 * Obtiene el valor para la propiedad tipo.
	 *
	 * @return El valor de la propiedad tipo
	 */
	public String getIs_tipo() {
		return is_tipo;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad tipo.
	 *
	 * @param as_tipo el nuevo valor para la propiedad tipo
	 */
	public void setIs_tipo(String as_tipo) {
		this.is_tipo = as_tipo;
	}
	
	/**
	 * Obtiene el valor para la propiedad nota credito.
	 *
	 * @return El valor de la propiedad nota credito
	 */
	public TipoNotaCreditoCMOVO getItnc_notaCredito() {
		return itnc_notaCredito;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad nota credito.
	 *
	 * @param atnc_notaCredito el nuevo valor para la propiedad nota credito
	 */
	public void setItnc_notaCredito(TipoNotaCreditoCMOVO atnc_notaCredito) {
		this.itnc_notaCredito = atnc_notaCredito;
	}
	
	/**
	 * Obtiene el valor para la propiedad recibo caja.
	 *
	 * @return El valor de la propiedad recibo caja
	 */
	public TipoReciboCajaCMOVO getItrc_reciboCaja() {
		return itrc_reciboCaja;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad recibo caja.
	 *
	 * @param atrc_reciboCaja el nuevo valor para la propiedad recibo caja
	 */
	public void setItrc_reciboCaja(TipoReciboCajaCMOVO atrc_reciboCaja) {
		this.itrc_reciboCaja = atrc_reciboCaja;
	}
	
	
}
