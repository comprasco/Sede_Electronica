/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ObservacionesDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: ObservacionesDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Observaciones.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ObservacionesDTO extends GenericoBaseDTO {
	
	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * observacion.
	 */
	// --- Atributos
	private String is_observacion;
	
	/**
	 * Atributo de instancia tipo EntidadEspecialDTO para definir la propiedad
	 * entidad especial.
	 */
	private EntidadEspecialDTO iee_entidadEspecialDto;

	/**
	 * Construye una nueva instancia/objeto de la clase ObservacionesDTO.
	 */
	// --- Constructor
	public ObservacionesDTO() {
		// Metodo constructor vacio para modelo DTO
	}

	// --- Getters-Setters

	/**
	 * Obtiene el valor para la propiedad observacion.
	 *
	 * @return El valor de la propiedad observacion
	 */
	public String getIs_observacion() {
		return is_observacion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad observacion.
	 *
	 * @param as_observacion el nuevo valor para la propiedad observacion
	 */
	public void setIs_observacion(String as_observacion) {
		this.is_observacion = as_observacion;
	}

	/**
	 * Obtiene el valor para la propiedad entidad especial dto.
	 *
	 * @return El valor de la propiedad entidad especial dto
	 */
	public EntidadEspecialDTO getIee_entidadEspecialDto() {
		return iee_entidadEspecialDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad entidad especial dto.
	 *
	 * @param aee_entidadEspecialDto el nuevo valor para la propiedad entidad
	 *                               especial dto
	 */
	public void setIee_entidadEspecialDto(EntidadEspecialDTO aee_entidadEspecialDto) {
		this.iee_entidadEspecialDto = aee_entidadEspecialDto;
	}

}
