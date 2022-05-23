/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: VeredaDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: VeredaDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Vereda.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class VeredaDTO extends GenericoBaseDTO {
	
	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

/**
 * Atributo de instancia tipo VeredaPKDTO para definir la propiedad id.
 */
// --- Atributos
	private VeredaPKDTO ivpk_idDto;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * cabecera municipal.
	 */
	private String is_cabeceraMunicipal;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre.
	 */
	private String is_nombre;

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object ao_objeto) {
		return (ao_objeto != null && getClass() == ao_objeto.getClass() && getIvpk_idDto().getIs_idMunicipio() != null)
				? getIvpk_idDto().getIs_idMunicipio().equals(((VeredaDTO) ao_objeto).getIvpk_idDto().getIs_idMunicipio())
						: (ao_objeto == this);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return (getIvpk_idDto().getIs_idMunicipio() != null) 
				? (getClass().hashCode() + getIvpk_idDto().getIs_idMunicipio().hashCode())
						: super.hashCode();
	}
	
/**
 * Construye una nueva instancia/objeto de la clase VeredaDTO.
 */
// --- Constructor
	public VeredaDTO() {
		// Metodo constructor vacio para modelo DTO
	}

/**
 * Obtiene el valor para la propiedad id dto.
 *
 * @return El valor de la propiedad id dto
 */
//--- Getters-Setters
	public VeredaPKDTO getIvpk_idDto() {
		return ivpk_idDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id dto.
	 *
	 * @param avpk_idDto el nuevo valor para la propiedad id dto
	 */
	public void setIvpk_idDto(VeredaPKDTO avpk_idDto) {
		this.ivpk_idDto = avpk_idDto;
	}

	/**
	 * Obtiene el valor para la propiedad cabecera municipal.
	 *
	 * @return El valor de la propiedad cabecera municipal
	 */
	public String getIs_cabeceraMunicipal() {
		return is_cabeceraMunicipal;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad cabecera municipal.
	 *
	 * @param as_cabeceraMunicipal el nuevo valor para la propiedad cabecera
	 *                             municipal
	 */
	public void setIs_cabeceraMunicipal(String as_cabeceraMunicipal) {
		this.is_cabeceraMunicipal = as_cabeceraMunicipal;
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

}
