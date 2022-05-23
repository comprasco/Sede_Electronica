/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: RangoTarifasAlertaDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: RangoTarifasAlertaDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Rango tarifas
 * alerta.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class RangoTarifasAlertaDTO extends GenericoBaseDTO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * rango.
	 */
	private String is_rango;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * valor tarifa.
	 */
	private String is_valorTarifa;

	/**
	 * Construye una nueva instancia/objeto de la clase RangoTarifasAlertaDTO.
	 */
	// --- Constructor
	public RangoTarifasAlertaDTO() {
		// Metodo constructor vacio para modelo DTO
	}


	/**
	 * Obtiene el valor para la propiedad rango.
	 *
	 * @return El valor de la propiedad rango
	 */
	// --- Getters-Setters
	public String getIs_rango() {
		return is_rango;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad rango.
	 *
	 * @param as_rango el nuevo valor para la propiedad rango
	 */
	public void setIs_rango(String as_rango) {
		this.is_rango = as_rango;
	}

	/**
	 * Obtiene el valor para la propiedad valor tarifa.
	 *
	 * @return El valor de la propiedad valor tarifa
	 */
	public String getIs_valorTarifa() {
		return is_valorTarifa;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad valor tarifa.
	 *
	 * @param as_valorTarifa el nuevo valor para la propiedad valor tarifa
	 */
	public void setIs_valorTarifa(String as_valorTarifa) {
		this.is_valorTarifa = as_valorTarifa;
	}

}
