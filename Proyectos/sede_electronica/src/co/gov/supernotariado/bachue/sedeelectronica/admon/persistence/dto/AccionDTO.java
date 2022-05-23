/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: AccionDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: AccionDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

import java.util.List;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Accion.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class AccionDTO extends GenericoBaseDTO {
	
	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * descripcion.
	 */
	// --- Atributos
	private String is_descripcion;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * valor.
	 */
	private String is_valor;
	
	/**
	 * Atributo de instancia tipo lista de BitacoraAudDTO para definir la propiedad
	 * bitacora auds.
	 */
	private List<BitacoraAudDTO> ilba_bitacoraAudsDto;

	/**
	 * Construye una nueva instancia/objeto de la clase AccionDTO.
	 */
	// --- Constructor
	public AccionDTO() {
		// Metodo constructor vacio para modelo DTO
	}

	// --- Getters-Setters

	/**
	 * Obtiene el valor para la propiedad descripcion.
	 *
	 * @return El valor de la propiedad descripcion
	 */
	public String getIs_descripcion() {
		return is_descripcion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad descripcion.
	 *
	 * @param as_descripcion el nuevo valor para la propiedad descripcion
	 */
	public void setIs_descripcion(String as_descripcion) {
		this.is_descripcion = as_descripcion;
	}

	/**
	 * Obtiene el valor para la propiedad valor.
	 *
	 * @return El valor de la propiedad valor
	 */
	public String getIs_valor() {
		return is_valor;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad valor.
	 *
	 * @param as_valor el nuevo valor para la propiedad valor
	 */
	public void setIs_valor(String as_valor) {
		this.is_valor = as_valor;
	}

	/**
	 * Obtiene el valor para la propiedad bitacora auds dto.
	 *
	 * @return El valor de la propiedad bitacora auds dto
	 */
	public List<BitacoraAudDTO> getIlba_bitacoraAudsDto() {
		if (this.ilba_bitacoraAudsDto == null) {
			this.ilba_bitacoraAudsDto = new java.util.ArrayList<>(1);
		}
		return this.ilba_bitacoraAudsDto;

	}

	/**
	 * Cambia/actualiza el valor para la propiedad bitacora auds dto.
	 *
	 * @param alba_bitacoraAudsDto el nuevo valor para la propiedad bitacora auds
	 *                             dto
	 */
	public void setIlba_bitacoraAudsDto(List<BitacoraAudDTO> alba_bitacoraAudsDto) {
		this.ilba_bitacoraAudsDto = alba_bitacoraAudsDto;

	}
}
