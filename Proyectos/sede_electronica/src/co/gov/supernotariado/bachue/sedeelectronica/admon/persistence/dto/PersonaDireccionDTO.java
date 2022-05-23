/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: PersonaDireccionDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: PersonaDireccionDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Persona direccion.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class PersonaDireccionDTO extends GenericoBaseDTO {
	
	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo DireccionDTO para definir la propiedad direccion.
	 */
	// --- Atributos
	private DireccionDTO id_direccion;
	
	/**
	 * Atributo de instancia tipo PersonaDTO para definir la propiedad persona.
	 */
	private PersonaDTO ip_persona;

	/**
	 * Construye una nueva instancia/objeto de la clase PersonaDireccionDTO.
	 */
	// --- Constructor
	public PersonaDireccionDTO() {
		// Metodo constructor vacio para modelo DTO
	}

	/**
	 * Obtiene el valor para la propiedad direccion.
	 *
	 * @return El valor de la propiedad direccion
	 */
	// --- Getters-Setters
	public DireccionDTO getId_direccion() {
		return id_direccion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad direccion.
	 *
	 * @param ad_direccion el nuevo valor para la propiedad direccion
	 */
	public void setId_direccion(DireccionDTO ad_direccion) {
		this.id_direccion = ad_direccion;
	}

	/**
	 * Obtiene el valor para la propiedad persona.
	 *
	 * @return El valor de la propiedad persona
	 */
	public PersonaDTO getIp_persona() {
		return ip_persona;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad persona.
	 *
	 * @param ap_persona el nuevo valor para la propiedad persona
	 */
	public void setIp_persona(PersonaDTO ap_persona) {
		this.ip_persona = ap_persona;
	}

}
