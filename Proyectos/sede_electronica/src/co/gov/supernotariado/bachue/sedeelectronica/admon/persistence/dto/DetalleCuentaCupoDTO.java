/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: DetalleCuentaCupoDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: DetalleCuentaCupoDTO
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
 * Contiene propiedades para representar los datos del objeto Detalle cuenta
 * cupo.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class DetalleCuentaCupoDTO extends GenericoDTO {
	
	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo numero real/decimal de gran magnitud para definir
	 * la propiedad saldo.
	 */
	// --- Atributos
	private BigDecimal ibd_saldo;
	
	/**
	 * Atributo de instancia tipo PersonaJuridicaDTO para definir la propiedad
	 * persona juridica.
	 */
	private PersonaJuridicaDTO ipj_personaJuridicaDto;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero cuenta.
	 */
	private String is_numeroCuenta;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * estado cuenta.
	 */
	private String is_estadoCuenta;
	
	/**
	 * Atributo de instancia tipo fecha para definir la propiedad ultimo movimiento.
	 */
	private Date id_ultimoMovimiento;

	/**
	 * Construye una nueva instancia/objeto de la clase DetalleCuentaCupoDTO.
	 */
	// --- Constructor
	public DetalleCuentaCupoDTO() {
		// Metodo constructor vacio para modelo DTO
	}

	// --- Getters-Setters

	/**
	 * Obtiene el valor para la propiedad saldo.
	 *
	 * @return El valor de la propiedad saldo
	 */
	public BigDecimal getIbd_saldo() {
		return ibd_saldo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad saldo.
	 *
	 * @param abd_saldo el nuevo valor para la propiedad saldo
	 */
	public void setIbd_saldo(BigDecimal abd_saldo) {
		this.ibd_saldo = abd_saldo;
	}

	/**
	 * Obtiene el valor para la propiedad persona juridica dto.
	 *
	 * @return El valor de la propiedad persona juridica dto
	 */
	public PersonaJuridicaDTO getIpj_personaJuridicaDto() {
		return ipj_personaJuridicaDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad persona juridica dto.
	 *
	 * @param apj_personaJuridicaDto el nuevo valor para la propiedad persona
	 *                               juridica dto
	 */
	public void setIpj_personaJuridicaDto(PersonaJuridicaDTO apj_personaJuridicaDto) {
		this.ipj_personaJuridicaDto = apj_personaJuridicaDto;
	}

	/**
	 * Obtiene el valor para la propiedad numero cuenta.
	 *
	 * @return El valor de la propiedad numero cuenta
	 */
	public String getIs_numeroCuenta() {
		return is_numeroCuenta;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad numero cuenta.
	 *
	 * @param as_numeroCuenta el nuevo valor para la propiedad numero cuenta
	 */
	public void setIs_numeroCuenta(String as_numeroCuenta) {
		this.is_numeroCuenta = as_numeroCuenta;
	}

	/**
	 * Obtiene el valor para la propiedad estado cuenta.
	 *
	 * @return El valor de la propiedad estado cuenta
	 */
	public String getIs_estadoCuenta() {
		return is_estadoCuenta;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad estado cuenta.
	 *
	 * @param as_estadoCuenta el nuevo valor para la propiedad estado cuenta
	 */
	public void setIs_estadoCuenta(String as_estadoCuenta) {
		this.is_estadoCuenta = as_estadoCuenta;
	}

	/**
	 * Obtiene el valor para la propiedad ultimo movimiento.
	 *
	 * @return El valor de la propiedad ultimo movimiento
	 */
	public Date getId_ultimoMovimiento() {
		return id_ultimoMovimiento;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad ultimo movimiento.
	 *
	 * @param ad_ultimoMovimiento el nuevo valor para la propiedad ultimo movimiento
	 */
	public void setId_ultimoMovimiento(Date ad_ultimoMovimiento) {
		this.id_ultimoMovimiento = ad_ultimoMovimiento;
	}

	
}
