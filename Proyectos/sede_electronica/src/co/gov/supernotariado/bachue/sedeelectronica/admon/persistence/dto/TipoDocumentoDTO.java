/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TipoDocumentoDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: TipoDocumentoDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

import java.util.List;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Tipo documento.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoDocumentoDTO extends GenericoBaseDTO {
	
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
	 * nombre.
	 */
	private String is_nombre;
	
	/**
	 * Atributo de instancia tipo lista de PersonaDTO para definir la propiedad
	 * personas.
	 */
	private List<PersonaDTO> ilp_personasDto;

/**
 * Construye una nueva instancia/objeto de la clase TipoDocumentoDTO.
 */
// --- Constructor
	public TipoDocumentoDTO() {
		// Metodo constructor vacio para modelo DTO
	}

//--- Getters-Setters

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
	 * Obtiene el valor para la propiedad nombre.
	 *
	 * @return El valor de la propiedad nombre
	 */
	public String getIs_nombre() {
		return is_nombre;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nombre.
	 *
	 * @param as_nombre el nuevo valor para la propiedad nombre
	 */
	public void setIs_nombre(String as_nombre) {
		this.is_nombre = as_nombre;
	}

	/**
	 * Obtiene el valor para la propiedad personas dto.
	 *
	 * @return El valor de la propiedad personas dto
	 */
	public List<PersonaDTO> getIlp_personasDto() {
		if (this.ilp_personasDto == null) {
			this.ilp_personasDto = new java.util.ArrayList<>(1);
		}
		return this.ilp_personasDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad personas dto.
	 *
	 * @param alp_personasDto el nuevo valor para la propiedad personas dto
	 */
	public void setIlp_personasDto(List<PersonaDTO> alp_personasDto) {
		this.ilp_personasDto = alp_personasDto;
	}
}
