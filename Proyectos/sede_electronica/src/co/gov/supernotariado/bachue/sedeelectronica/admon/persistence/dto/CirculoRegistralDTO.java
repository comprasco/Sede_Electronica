/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: CirculoRegistralDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: CirculoRegistralDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

import com.google.gson.annotations.SerializedName;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Circulo registral.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class CirculoRegistralDTO extends GenericoBaseDTO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre.
	 */
	// --- Atributos
	@SerializedName("nombre")
	private String is_nombre;

	// --- Constructor

	/**
	 * Construye una nueva instancia/objeto de la clase CirculoRegistralDTO.
	 */
	public CirculoRegistralDTO() {
		// Metodo constructor vacio para modelo DTO
    }
	
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object ao_objeto) {
		return (ao_objeto != null && getClass() == ao_objeto.getClass() && getIs_id() != null)
				? getIs_id().equals(((CirculoRegistralDTO) ao_objeto).getIs_id())
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
	 * Construye una nueva instancia/objeto de la clase CirculoRegistralDTO.
	 *
	 * @param as_id el parametro id
	 */
    public CirculoRegistralDTO(String as_id) {
        setIs_id(as_id);
	}

	// --- Getters-Setters

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
}
