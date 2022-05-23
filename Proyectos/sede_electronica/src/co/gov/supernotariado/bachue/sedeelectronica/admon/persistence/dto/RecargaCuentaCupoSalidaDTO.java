/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: RecargaCuentaCupoSalidaDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: RecargaCuentaCupoSalidaDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

import java.math.BigDecimal;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Recarga cuenta
 * cupo salida.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class RecargaCuentaCupoSalidaDTO extends GenericoBaseDTO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nir.
	 */
	private String is_nir;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * referencia pago.
	 */
	private String is_referenciaPago;
	
	/**
	 * Atributo de instancia tipo numero real/decimal de gran magnitud para definir
	 * la propiedad valor total servicio.
	 */
	private BigDecimal ibd_valorTotalServicio;
	
	/**
	 * Obtiene el valor para la propiedad nir.
	 *
	 * @return El valor de la propiedad nir
	 */
	public String getIs_nir() {
		return is_nir;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad nir.
	 *
	 * @param as_nir el nuevo valor para la propiedad nir
	 */
	public void setIs_nir(String as_nir) {
		this.is_nir = as_nir;
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
	 * Obtiene el valor para la propiedad valor total servicio.
	 *
	 * @return El valor de la propiedad valor total servicio
	 */
	public BigDecimal getIbd_valorTotalServicio() {
		return ibd_valorTotalServicio;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad valor total servicio.
	 *
	 * @param abd_valorTotalServicio el nuevo valor para la propiedad valor total
	 *                               servicio
	 */
	public void setIbd_valorTotalServicio(BigDecimal abd_valorTotalServicio) {
		this.ibd_valorTotalServicio = abd_valorTotalServicio;
	}
	
}
