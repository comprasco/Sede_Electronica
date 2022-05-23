/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TipoEjeDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: TipoEjeDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

import java.util.List;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Tipo eje.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoEjeDTO extends GenericoBaseDTO {
	
	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

/**
 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
 * nombre.
 */
// --- Atributos
	private String is_nombre;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo predio.
	 */
	private String is_tipoPredio;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * complemento.
	 */
	private String is_complemento;
	
	/**
	 * Atributo de instancia tipo lista de DireccionDTO para definir la propiedad
	 * persona direccions.
	 */
	private List<DireccionDTO> ildd_personaDireccionsDto;

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object ao_objeto) {
		return (ao_objeto != null && getClass() == ao_objeto.getClass() && getIs_id() != null)
				? getIs_id().equals(((TipoEjeDTO) ao_objeto).getIs_id())
						: (ao_objeto == this);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return (getIs_id() != null) 
				? (getClass().hashCode() + getIs_id().hashCode())
						: super.hashCode();
	}
	
/**
 * Construye una nueva instancia/objeto de la clase TipoEjeDTO.
 */
// --- Constructor
	public TipoEjeDTO() {
		// Metodo constructor vacio para modelo DTO
	}

//--- Getters-Setters

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
	 * Obtiene el valor para la propiedad persona direccions dto.
	 *
	 * @return El valor de la propiedad persona direccions dto
	 */
	public List<DireccionDTO> getIlpd_personaDireccionsDto() {
		if (this.ildd_personaDireccionsDto == null) {
			this.ildd_personaDireccionsDto = new java.util.ArrayList<>(1);
		}
		return this.ildd_personaDireccionsDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad persona direccions dto.
	 *
	 * @param aldd_personaDireccionsDto el nuevo valor para la propiedad persona
	 *                                  direccions dto
	 */
	public void setIlpd_personaDireccionsDto(List<DireccionDTO> aldd_personaDireccionsDto) {
		this.ildd_personaDireccionsDto = aldd_personaDireccionsDto;
	}

	/**
	 * Obtiene el valor para la propiedad complemento.
	 *
	 * @return El valor de la propiedad complemento
	 */
	public String getIs_complemento() {
		return is_complemento;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad complemento.
	 *
	 * @param as_complemento el nuevo valor para la propiedad complemento
	 */
	public void setIs_complemento(String as_complemento) {
		this.is_complemento = as_complemento;
	}

	/**
	 * Obtiene el valor para la propiedad tipo predio.
	 *
	 * @return El valor de la propiedad tipo predio
	 */
	public String getIs_tipoPredio() {
		return is_tipoPredio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo predio.
	 *
	 * @param as_tipoPredio el nuevo valor para la propiedad tipo predio
	 */
	public void setIs_tipoPredio(String as_tipoPredio) {
		this.is_tipoPredio = as_tipoPredio;
	}

}
