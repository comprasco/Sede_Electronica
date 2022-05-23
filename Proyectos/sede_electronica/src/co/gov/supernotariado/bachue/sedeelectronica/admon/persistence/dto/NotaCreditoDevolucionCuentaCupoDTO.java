/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: NotaCreditoDevolucionCuentaCupoDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: NotaCreditoDevolucionCuentaCupoDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

import java.util.Date;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Notas credito
 * devolucion cuenta cupo.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class NotaCreditoDevolucionCuentaCupoDTO extends GenericoDTO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo.
	 */
	private String is_codigo;

	/**
	 * Atributo de instancia tipo date para definir la propiedad fecha.
	 */
	private Date id_fecha;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * valor recarga.
	 */
	private String is_valorRecarga;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * saldo.
	 */
	private String is_saldo;

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
	 * Obtiene el valor para la propiedad fecha.
	 *
	 * @return El valor de la propiedad fecha
	 */
	public Date getId_fecha() {
		return id_fecha;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad fecha.
	 *
	 * @param ad_fecha el nuevo valor para la propiedad fecha
	 */
	public void setId_fecha(Date ad_fecha) {
		this.id_fecha = ad_fecha;
	}

	/**
	 * Obtiene el valor para la propiedad valor recarga.
	 *
	 * @return El valor de la propiedad valor recarga
	 */
	public String getIs_valorRecarga() {
		return is_valorRecarga;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad valor recarga.
	 *
	 * @param as_valorRecarga el nuevo valor para la propiedad valor recarga
	 */
	public void setIs_valorRecarga(String as_valorRecarga) {
		this.is_valorRecarga = as_valorRecarga;
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
	 * @param as_saldo el nuevo valor para la propiedad saldo
	 */
	public void setIs_saldo(String as_saldo) {
		this.is_saldo = as_saldo;
	}
}
