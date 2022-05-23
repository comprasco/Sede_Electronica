/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: CatalogoDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: CatalogoDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

import java.util.List;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Catalogo.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class CatalogoDTO extends GenericoBaseDTO {

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
	 * codigo valor.
	 */
	private String is_codigoValor;
	
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
	 * Atributo de instancia tipo TipoCatalogoDTO para definir la propiedad tipo
	 * catalogo.
	 */
	private TipoCatalogoDTO itc_tipoCatalogoDto;

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object other) {
		return (other != null && getClass() == other.getClass() && getIs_id() != null)
				? getIs_id().equals(((CatalogoDTO) other).getIs_id())
						: (other == this);
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
	 * Construye una nueva instancia/objeto de la clase CatalogoDTO.
	 */
	// --- Constructor
	public CatalogoDTO() {
		// Metodo constructor vacio para modelo DTO
	}

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
	 * Obtiene el valor para la propiedad codigo valor.
	 *
	 * @return El valor de la propiedad codigo valor
	 */
	public String getIs_codigoValor() {
		return is_codigoValor;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad codigo valor.
	 *
	 * @param as_codigoValor el nuevo valor para la propiedad codigo valor
	 */
	public void setIs_codigoValor(String as_codigoValor) {
		this.is_codigoValor = as_codigoValor;
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
	 * @param is_nombre el nuevo valor para la propiedad nombre
	 */
	public void setIs_nombre(String is_nombre) {
		this.is_nombre = is_nombre;
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

	/**
	 * Obtiene el valor para la propiedad tipo catalogo dto.
	 *
	 * @return El valor de la propiedad tipo catalogo dto
	 */
	public TipoCatalogoDTO getItc_tipoCatalogoDto() {
		return itc_tipoCatalogoDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo catalogo dto.
	 *
	 * @param atc_tipoCatalogoDto el nuevo valor para la propiedad tipo catalogo dto
	 */
	public void setItc_tipoCatalogoDto(TipoCatalogoDTO atc_tipoCatalogoDto) {
		this.itc_tipoCatalogoDto = atc_tipoCatalogoDto;
	}
}
