/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: DepartamentoDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: DepartamentoDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

import java.util.List;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Departamento.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class DepartamentoDTO extends GenericoBaseDTO {
	
	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo DepartamentoPKDTO para definir la propiedad id.
	 */
	// --- Atributos
	private DepartamentoPKDTO idp_idDto;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * indicativo telefonico.
	 */
	private String is_indicativoTelefonico;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre.
	 */
	private String is_nombre;
	
	/**
	 * Atributo de instancia tipo PaisDTO para definir la propiedad pais.
	 */
	private PaisDTO ip_paisDto;
	
	/**
	 * Atributo de instancia tipo lista de MunicipioDTO para definir la propiedad
	 * municipios.
	 */
	private List<MunicipioDTO> ilm_municipiosDto;
	
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object ao_objeto) {
		return (ao_objeto != null && getClass() == ao_objeto.getClass() && getIdp_idDto().getIs_idDepartamento() != null)
				? getIdp_idDto().getIs_idDepartamento().equals(((DepartamentoDTO) ao_objeto).getIdp_idDto().getIs_idDepartamento())
						: (ao_objeto == this);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return (getIdp_idDto().getIs_idDepartamento() != null) 
				? (getClass().hashCode() + getIdp_idDto().getIs_idDepartamento().hashCode())
						: super.hashCode();
	}
	
	/**
	 * Construye una nueva instancia/objeto de la clase DepartamentoDTO.
	 */
	// --- Constructor
	public DepartamentoDTO() {
		// Metodo constructor vacio para modelo DTO
	}

	/**
	 * Obtiene el valor para la propiedad id dto.
	 *
	 * @return El valor de la propiedad id dto
	 */
	// --New Getters-Setters --//
	public DepartamentoPKDTO getIdp_idDto() {
		return idp_idDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id dto.
	 *
	 * @param adp_idDto el nuevo valor para la propiedad id dto
	 */
	public void setIdp_idDto(DepartamentoPKDTO adp_idDto) {
		this.idp_idDto = adp_idDto;
	}

	/**
	 * Obtiene el valor para la propiedad indicativo telefonico.
	 *
	 * @return El valor de la propiedad indicativo telefonico
	 */
	public String getIs_indicativoTelefonico() {
		return is_indicativoTelefonico;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad indicativo telefonico.
	 *
	 * @param as_indicativoTelefonico el nuevo valor para la propiedad indicativo
	 *                                telefonico
	 */
	public void setIs_indicativoTelefonico(String as_indicativoTelefonico) {
		this.is_indicativoTelefonico = as_indicativoTelefonico;
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
	 * Obtiene el valor para la propiedad pais dto.
	 *
	 * @return El valor de la propiedad pais dto
	 */
	public PaisDTO getIp_paisDto() {
		return ip_paisDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad pais dto.
	 *
	 * @param ap_paisDto el nuevo valor para la propiedad pais dto
	 */
	public void setIp_paisDto(PaisDTO ap_paisDto) {
		this.ip_paisDto = ap_paisDto;
	}

	/**
	 * Obtiene el valor para la propiedad municipios dto.
	 *
	 * @return El valor de la propiedad municipios dto
	 */

	public List<MunicipioDTO> getIlm_municipiosDto() {
		if (this.ilm_municipiosDto == null) {
			this.ilm_municipiosDto = new java.util.ArrayList<>(1);
		}
		return this.ilm_municipiosDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad municipios dto.
	 *
	 * @param alm_municipiosDto el nuevo valor para la propiedad municipios dto
	 */
	public void setIlm_municipiosDto(List<MunicipioDTO> alm_municipiosDto) {
		this.ilm_municipiosDto = alm_municipiosDto;
	}
}
