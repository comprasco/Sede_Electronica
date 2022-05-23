/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TipoMovimientoCMOWSDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto
 * Nombre del elemento: TipoMovimientoCMOWSDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.NotasCreditoDTO;

/**
 * Clase tipo objeto de transferencia de datos para web service (WSDTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y servicios web.
 * <br>
 * Contiene propiedades para representar los datos del objeto Tipo movimiento
 * CMO.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoMovimientoCMOWSDTO implements Serializable{

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
	 * Atributo de instancia tipo TipoNotaCreditoCMOWSDTO para definir la propiedad
	 * nota credito.
	 */
	private TipoNotaCreditoCMOWSDTO itnc_notaCredito;
	
	/**
	 * Atributo de instancia tipo TipoReciboCajaCMOWSDTO para definir la propiedad
	 * recibo caja.
	 */
	private TipoReciboCajaCMOWSDTO itrc_reciboCaja;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * saldo.
	 */
	private String is_saldo;
	
	/**
	 * Atributo de instancia tipo lista de NotasCreditoDTO para definir la propiedad
	 * lista nota credito.
	 */
	private List<NotasCreditoDTO> ilnc_listaNotaCredito;
	
	/**
	 * Atributo de instancia tipo numero real/decimal de gran magnitud para definir
	 * la propiedad total recarga.
	 */
	private BigDecimal ibd_totalRecarga;
	
	/**
	 * Atributo de instancia tipo numero real/decimal de gran magnitud para definir
	 * la propiedad total consumo.
	 */
	private BigDecimal ibd_totalConsumo;
	
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
	public TipoNotaCreditoCMOWSDTO getItnc_notaCredito() {
		return itnc_notaCredito;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad nota credito.
	 *
	 * @param atnc_notaCredito el nuevo valor para la propiedad nota credito
	 */
	public void setItnc_notaCredito(TipoNotaCreditoCMOWSDTO atnc_notaCredito) {
		this.itnc_notaCredito = atnc_notaCredito;
	}
	
	/**
	 * Obtiene el valor para la propiedad recibo caja.
	 *
	 * @return El valor de la propiedad recibo caja
	 */
	public TipoReciboCajaCMOWSDTO getItrc_reciboCaja() {
		return itrc_reciboCaja;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad recibo caja.
	 *
	 * @param atrc_reciboCaja el nuevo valor para la propiedad recibo caja
	 */
	public void setItrc_reciboCaja(TipoReciboCajaCMOWSDTO atrc_reciboCaja) {
		this.itrc_reciboCaja = atrc_reciboCaja;
	}
	
	/**
	 * Obtiene el valor para la propiedad saldo.
	 *
	 * @return El valor de la propiedad saldo
	 */
	public String getIs_saldo() {
		return is_saldo;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad saldo.
	 *
	 * @param is_saldo el nuevo valor para la propiedad saldo
	 */
	public void setIs_saldo(String is_saldo) {
		this.is_saldo = is_saldo;
	}
	
	/**
	 * Obtiene el valor para la propiedad lista nota credito.
	 *
	 * @return El valor de la propiedad lista nota credito
	 */
	public List<NotasCreditoDTO> getIlnc_listaNotaCredito() {
		return ilnc_listaNotaCredito;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad lista nota credito.
	 *
	 * @param ilnc_listaNotaCredito el nuevo valor para la propiedad lista nota
	 *                              credito
	 */
	public void setIlnc_listaNotaCredito(List<NotasCreditoDTO> ilnc_listaNotaCredito) {
		this.ilnc_listaNotaCredito = ilnc_listaNotaCredito;
	}
	
	/**
	 * Obtiene el valor para la propiedad total recarga.
	 *
	 * @return El valor de la propiedad total recarga
	 */
	public BigDecimal getIbd_totalRecarga() {
		return ibd_totalRecarga;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad total recarga.
	 *
	 * @param abd_totalRecarga el nuevo valor para la propiedad total recarga
	 */
	public void setIbd_totalRecarga(BigDecimal abd_totalRecarga) {
		this.ibd_totalRecarga = abd_totalRecarga;
	}

	/**
	 * Obtiene el valor para la propiedad total consumo.
	 *
	 * @return El valor de la propiedad total consumo
	 */
	public BigDecimal getIbd_totalConsumo() {
		return ibd_totalConsumo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad total consumo.
	 *
	 * @param abd_totalConsumo el nuevo valor para la propiedad total consumo
	 */
	public void setIbd_totalConsumo(BigDecimal abd_totalConsumo) {
		this.ibd_totalConsumo = abd_totalConsumo;
	}
}
