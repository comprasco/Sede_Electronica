/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: NotasCreditoDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: NotasCreditoDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

import java.util.Date;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Notas credito.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class NotasCreditoDTO extends GenericoDTO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo fecha para definir la propiedad fecha movimiento.
	 */
	private Date id_fechaMovimiento;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nota credito.
	 */
	private String is_notaCredito;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * valor consumo.
	 */
	private String is_valorConsumo;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * saldo disponible.
	 */
	private String is_saldoDisponible;

	/**
	 * Obtiene el valor para la propiedad nota credito.
	 *
	 * @return El valor de la propiedad nota credito
	 */
	public String getIs_notaCredito() {
		return is_notaCredito;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nota credito.
	 *
	 * @param as_notaCredito el nuevo valor para la propiedad nota credito
	 */
	public void setIs_notaCredito(String as_notaCredito) {
		this.is_notaCredito = as_notaCredito;
	}

	/**
	 * Obtiene el valor para la propiedad valor consumo.
	 *
	 * @return El valor de la propiedad valor consumo
	 */
	public String getIs_valorConsumo() {
		return is_valorConsumo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad valor consumo.
	 *
	 * @param as_valorConsumo el nuevo valor para la propiedad valor consumo
	 */
	public void setIs_valorConsumo(String as_valorConsumo) {
		this.is_valorConsumo = as_valorConsumo;
	}

	/**
	 * Obtiene el valor para la propiedad saldo disponible.
	 *
	 * @return El valor de la propiedad saldo disponible
	 */
	public String getIs_saldoDisponible() {
		return is_saldoDisponible;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad saldo disponible.
	 *
	 * @param as_saldoDisponible el nuevo valor para la propiedad saldo disponible
	 */
	public void setIs_saldoDisponible(String as_saldoDisponible) {
		this.is_saldoDisponible = as_saldoDisponible;
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

}
