/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: MunicipioDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: MunicipioDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Municipio.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class MunicipioDTO extends GenericoBaseDTO {
	
	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo MunicipioPKDTO para definir la propiedad id.
	 */
	// --- Atributos
	private MunicipioPKDTO imp_idDto;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre.
	 */
	private String is_nombre;
	
	/**
	 * Atributo de instancia tipo DepartamentoDTO para definir la propiedad
	 * departamento.
	 */
	private DepartamentoDTO id_departamentoDto;

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object ao_objeto) {
		return (ao_objeto != null && getClass() == ao_objeto.getClass() && getImp_idDto().getIs_idMunicipio() != null)
				? getImp_idDto().getIs_idMunicipio().equals(((MunicipioDTO) ao_objeto).getImp_idDto().getIs_idMunicipio())
						: (ao_objeto == this);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return (getImp_idDto().getIs_idMunicipio() != null) 
				? (getClass().hashCode() + getImp_idDto().getIs_idMunicipio().hashCode())
						: super.hashCode();
	}
	
	/**
	 * Construye una nueva instancia/objeto de la clase MunicipioDTO.
	 */
	// --- Constructor
	public MunicipioDTO() {
		// Metodo constructor vacio para modelo DTO
	}

	/**
	 * Obtiene el valor para la propiedad id dto.
	 *
	 * @return El valor de la propiedad id dto
	 */
	public MunicipioPKDTO getImp_idDto() {
		return imp_idDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id dto.
	 *
	 * @param amp_idDto el nuevo valor para la propiedad id dto
	 */
	public void setImp_idDto(MunicipioPKDTO amp_idDto) {
		this.imp_idDto = amp_idDto;
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
	 * Obtiene el valor para la propiedad departamento dto.
	 *
	 * @return El valor de la propiedad departamento dto
	 */
	public DepartamentoDTO getId_departamentoDto() {
		return id_departamentoDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad departamento dto.
	 *
	 * @param ad_departamentoDto el nuevo valor para la propiedad departamento dto
	 */
	public void setId_departamentoDto(DepartamentoDTO ad_departamentoDto) {
		this.id_departamentoDto = ad_departamentoDto;
	}
}
