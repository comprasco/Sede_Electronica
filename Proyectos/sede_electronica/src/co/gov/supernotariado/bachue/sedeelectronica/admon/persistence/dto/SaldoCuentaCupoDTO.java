/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: SaldoCuentaCupoDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: SaldoCuentaCupoDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Saldo cuenta cupo.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class SaldoCuentaCupoDTO extends GenericoBaseDTO  {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo numero real/decimal de gran magnitud para definir
	 * la propiedad saldo actual.
	 */
	private BigDecimal ibd_saldoActual;
	
	/**
	 * Atributo de instancia tipo fecha para definir la propiedad ultima recarga
	 * fecha.
	 */
	private Date id_ultimaRecargaFecha;
	
	/**
	 * Atributo de instancia tipo numero real/decimal de gran magnitud para definir
	 * la propiedad ultima recarga valor.
	 */
	private BigDecimal ibd_ultimaRecargaValor;


	/**
	 * Obtiene el valor para la propiedad saldo actual.
	 *
	 * @return El valor de la propiedad saldo actual
	 */
	public BigDecimal getIbd_saldoActual() {
		return ibd_saldoActual;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad saldo actual.
	 *
	 * @param abd_saldoActual el nuevo valor para la propiedad saldo actual
	 */
	public void setIbd_saldoActual(BigDecimal abd_saldoActual) {
		this.ibd_saldoActual = abd_saldoActual;
	}
	
	/**
	 * Obtiene el valor para la propiedad ultima recarga fecha.
	 *
	 * @return El valor de la propiedad ultima recarga fecha
	 */
	public Date getId_ultimaRecargaFecha() {
		return id_ultimaRecargaFecha;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad ultima recarga fecha.
	 *
	 * @param ad_ultimaRecargaFecha el nuevo valor para la propiedad ultima recarga
	 *                              fecha
	 */
	public void setId_ultimaRecargaFecha(Date ad_ultimaRecargaFecha) {
		this.id_ultimaRecargaFecha = ad_ultimaRecargaFecha;
	}
	
	/**
	 * Obtiene el valor para la propiedad ultima recarga valor.
	 *
	 * @return El valor de la propiedad ultima recarga valor
	 */
	public BigDecimal getIbd_ultimaRecargaValor() {
		return ibd_ultimaRecargaValor;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad ultima recarga valor.
	 *
	 * @param abd_ultimaRecargaValor el nuevo valor para la propiedad ultima recarga
	 *                               valor
	 */
	public void setIbd_ultimaRecargaValor(BigDecimal abd_ultimaRecargaValor) {
		this.ibd_ultimaRecargaValor = abd_ultimaRecargaValor;
	}

}
