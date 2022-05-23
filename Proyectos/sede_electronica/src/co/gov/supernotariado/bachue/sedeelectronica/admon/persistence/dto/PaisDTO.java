/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: PaisDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: PaisDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

import java.util.List;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Pais.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class PaisDTO extends GenericoBaseDTO {
	
	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad id
	 * pais.
	 */
	// --- Atributos
	private String is_idPais;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nacionalidad.
	 */
	private String is_nacionalidad;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre.
	 */
	private String is_nombre;
	
	/**
	 * Atributo de instancia tipo lista de DepartamentoDTO para definir la propiedad
	 * departamentos.
	 */
	private List<DepartamentoDTO> ild_departamentosDto;

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object ao_objeto) {
		return (ao_objeto != null && getClass() == ao_objeto.getClass() && is_idPais != null)
				? is_idPais.equals(((PaisDTO) ao_objeto).is_idPais)
						: (ao_objeto == this);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return (is_idPais != null) 
				? (getClass().hashCode() + is_idPais.hashCode())
						: super.hashCode();
	}

	/**
	 * Construye una nueva instancia/objeto de la clase PaisDTO.
	 */
	// --- Constructor
	public PaisDTO() {
	}

	/**
	 * Construye una nueva instancia/objeto de la clase PaisDTO.
	 *
	 * @param as_idPais el parametro id pais
	 */
	public PaisDTO(String as_idPais) {
		this.is_idPais = as_idPais;

		// --- Getters-Setters
	}

	/**
	 * Obtiene el valor para la propiedad id pais.
	 *
	 * @return El valor de la propiedad id pais
	 */
	public String getIs_idPais() {
		return is_idPais;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id pais.
	 *
	 * @param as_idPais el nuevo valor para la propiedad id pais
	 */
	public void setIs_idPais(String as_idPais) {
		this.is_idPais = as_idPais;
	}

	/**
	 * Obtiene el valor para la propiedad nacionalidad.
	 *
	 * @return El valor de la propiedad nacionalidad
	 */
	public String getIs_nacionalidad() {
		return is_nacionalidad;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nacionalidad.
	 *
	 * @param as_nacionalidad el nuevo valor para la propiedad nacionalidad
	 */
	public void setIs_nacionalidad(String as_nacionalidad) {
		this.is_nacionalidad = as_nacionalidad;
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
	 * Obtiene el valor para la propiedad departamentos dto.
	 *
	 * @return El valor de la propiedad departamentos dto
	 */
	public List<DepartamentoDTO> getIld_departamentosDto() {
		if (this.ild_departamentosDto == null) {
			this.ild_departamentosDto = new java.util.ArrayList<>(1);
		}
		return ild_departamentosDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad departamentos dto.
	 *
	 * @param ald_departamentosDto el nuevo valor para la propiedad departamentos
	 *                             dto
	 */
	public void setIld_departamentosDto(List<DepartamentoDTO> ald_departamentosDto) {
		this.ild_departamentosDto = ald_departamentosDto;
	}
}
