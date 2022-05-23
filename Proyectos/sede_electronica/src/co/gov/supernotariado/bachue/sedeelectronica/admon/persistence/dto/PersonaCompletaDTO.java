/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: PersonaCompletaDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: PersonaCompletaDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

/**
*
* @version 1.0
* @author Smartsoft Solutions S.A.S
* Nota: Declaracion de variables para Persona Completa
*/

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Persona completa.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class PersonaCompletaDTO extends GenericoDTO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad
	 * selecciono politicas.
	 */
	private Boolean ib_seleccionoPoliticas;
	
	/**
	 * Atributo de instancia tipo HistoricoClaveDTO para definir la propiedad
	 * historico clave.
	 */
	private HistoricoClaveDTO ihc_historicoClaveDTO;
	
	/**
	 * Atributo de instancia tipo PersonaDTO para definir la propiedad persona.
	 */
	private PersonaDTO ipd_personaDto;
	
	/**
	 * Atributo de instancia tipo PersonaNaturalDTO para definir la propiedad
	 * persona natural.
	 */
	private PersonaNaturalDTO ipnd_personaNaturalDto;
	
	/**
	 * Atributo de instancia tipo PersonaJuridicaDTO para definir la propiedad
	 * persona juridica.
	 */
	private PersonaJuridicaDTO ipjd_personaJuridicaDto;
	
	/**
	 * Atributo de instancia tipo RolDTO para definir la propiedad rol.
	 */
	private RolDTO ir_rolDto;
	
	/**
	 * Atributo de instancia tipo UsuarioDTO para definir la propiedad usuario.
	 */
	private UsuarioDTO iud_usuarioDto;
	
	/**
	 * Atributo de instancia tipo UsuarioRolDTO para definir la propiedad usuario
	 * rol.
	 */
	private UsuarioRolDTO iur_usuarioRolDto;
	
	/**
	 * Atributo de instancia tipo DireccionDTO para definir la propiedad persona
	 * direccion.
	 */
	private DireccionDTO ipd_personaDireccionDto;
	
	/**
	 * Atributo de instancia tipo EntidadEspecialDTO para definir la propiedad
	 * entidad especial.
	 */
	private EntidadEspecialDTO iee_entidadEspecialDTO;

	// Se adicionan propiedades para capturar el idDepartamento. idMunicipio y
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad id
	 * departamento.
	 */
	// direccion
	private String is_idDepartamento;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad id
	 * municipio.
	 */
	private String is_idMunicipio;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * direccion residencia.
	 */
	private String is_direccionResidencia;

	/**
	 * Construye una nueva instancia/objeto de la clase PersonaCompletaDTO.
	 */
	public PersonaCompletaDTO() {
		this.ihc_historicoClaveDTO = new HistoricoClaveDTO();
		this.ipd_personaDto = new PersonaDTO();
		this.ipnd_personaNaturalDto = new PersonaNaturalDTO();
		this.ipjd_personaJuridicaDto = new PersonaJuridicaDTO();
		this.iud_usuarioDto = new UsuarioDTO();
		this.ir_rolDto = new RolDTO();
		this.iur_usuarioRolDto = new UsuarioRolDTO();
		this.ipd_personaDireccionDto = new DireccionDTO();
		this.setIee_entidadEspecialDTO(new EntidadEspecialDTO());
	}

	/**
	 * Obtiene el valor para la propiedad selecciono politicas.
	 *
	 * @return El valor de la propiedad selecciono politicas
	 */
	public Boolean getIb_seleccionoPoliticas() {
		return ib_seleccionoPoliticas;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad selecciono politicas.
	 *
	 * @param ab_seleccionoPoliticas el nuevo valor para la propiedad selecciono
	 *                               politicas
	 */
	public void setIb_seleccionoPoliticas(Boolean ab_seleccionoPoliticas) {
		this.ib_seleccionoPoliticas = ab_seleccionoPoliticas;
	}

	/**
	 * Obtiene el valor para la propiedad historico clave DTO.
	 *
	 * @return El valor de la propiedad historico clave DTO
	 */
	public HistoricoClaveDTO getIhc_historicoClaveDTO() {
		return ihc_historicoClaveDTO;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad historico clave DTO.
	 *
	 * @param ahc_historicoClaveDTO el nuevo valor para la propiedad historico clave
	 *                              DTO
	 */
	public void setIhc_historicoClaveDTO(HistoricoClaveDTO ahc_historicoClaveDTO) {
		this.ihc_historicoClaveDTO = ahc_historicoClaveDTO;
	}

	/**
	 * Obtiene el valor para la propiedad persona dto.
	 *
	 * @return El valor de la propiedad persona dto
	 */
	public PersonaDTO getIpd_personaDto() {
		return ipd_personaDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad persona dto.
	 *
	 * @param apd_personaDto el nuevo valor para la propiedad persona dto
	 */
	public void setIpd_personaDto(PersonaDTO apd_personaDto) {
		this.ipd_personaDto = apd_personaDto;
	}

	/**
	 * Obtiene el valor para la propiedad persona natural dto.
	 *
	 * @return El valor de la propiedad persona natural dto
	 */
	public PersonaNaturalDTO getIpnd_personaNaturalDto() {
		return ipnd_personaNaturalDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad persona natural dto.
	 *
	 * @param apnd_personaNaturalDto el nuevo valor para la propiedad persona
	 *                               natural dto
	 */
	public void setIpnd_personaNaturalDto(PersonaNaturalDTO apnd_personaNaturalDto) {
		this.ipnd_personaNaturalDto = apnd_personaNaturalDto;
	}

	/**
	 * Obtiene el valor para la propiedad persona juridica dto.
	 *
	 * @return El valor de la propiedad persona juridica dto
	 */
	public PersonaJuridicaDTO getIpjd_personaJuridicaDto() {
		return ipjd_personaJuridicaDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad persona juridica dto.
	 *
	 * @param apjd_personaJuridicaDto el nuevo valor para la propiedad persona
	 *                                juridica dto
	 */
	public void setIpjd_personaJuridicaDto(PersonaJuridicaDTO apjd_personaJuridicaDto) {
		this.ipjd_personaJuridicaDto = apjd_personaJuridicaDto;
	}

	/**
	 * Obtiene el valor para la propiedad rol dto.
	 *
	 * @return El valor de la propiedad rol dto
	 */
	public RolDTO getIr_rolDto() {
		return ir_rolDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad rol dto.
	 *
	 * @param ar_rolDto el nuevo valor para la propiedad rol dto
	 */
	public void setIr_rolDto(RolDTO ar_rolDto) {
		this.ir_rolDto = ar_rolDto;
	}

	/**
	 * Obtiene el valor para la propiedad usuario dto.
	 *
	 * @return El valor de la propiedad usuario dto
	 */
	public UsuarioDTO getIud_usuarioDto() {
		return iud_usuarioDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad usuario dto.
	 *
	 * @param aud_usuarioDto el nuevo valor para la propiedad usuario dto
	 */
	public void setIud_usuarioDto(UsuarioDTO aud_usuarioDto) {
		this.iud_usuarioDto = aud_usuarioDto;
	}

	/**
	 * Obtiene el valor para la propiedad usuario rol dto.
	 *
	 * @return El valor de la propiedad usuario rol dto
	 */
	public UsuarioRolDTO getIur_usuarioRolDto() {
		return iur_usuarioRolDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad usuario rol dto.
	 *
	 * @param aur_usuarioRolDto el nuevo valor para la propiedad usuario rol dto
	 */
	public void setIur_usuarioRolDto(UsuarioRolDTO aur_usuarioRolDto) {
		this.iur_usuarioRolDto = aur_usuarioRolDto;
	}

	/**
	 * Obtiene el valor para la propiedad persona direccion dto.
	 *
	 * @return El valor de la propiedad persona direccion dto
	 */
	public DireccionDTO getIpd_personaDireccionDto() {
		return ipd_personaDireccionDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad persona direccion dto.
	 *
	 * @param apd_personaDireccionDto el nuevo valor para la propiedad persona
	 *                                direccion dto
	 */
	public void setIpd_personaDireccionDto(DireccionDTO apd_personaDireccionDto) {
		this.ipd_personaDireccionDto = apd_personaDireccionDto;
	}

	/**
	 * Obtiene el valor para la propiedad id departamento.
	 *
	 * @return El valor de la propiedad id departamento
	 */
	public String getIs_idDepartamento() {
		return is_idDepartamento;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id departamento.
	 *
	 * @param as_idDepartamento el nuevo valor para la propiedad id departamento
	 */
	public void setIs_idDepartamento(String as_idDepartamento) {
		this.is_idDepartamento = as_idDepartamento;
	}

	/**
	 * Obtiene el valor para la propiedad id municipio.
	 *
	 * @return El valor de la propiedad id municipio
	 */
	public String getIs_idMunicipio() {
		return is_idMunicipio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id municipio.
	 *
	 * @param as_idMunicipio el nuevo valor para la propiedad id municipio
	 */
	public void setIs_idMunicipio(String as_idMunicipio) {
		this.is_idMunicipio = as_idMunicipio;
	}

	/**
	 * Obtiene el valor para la propiedad direccion residencia.
	 *
	 * @return El valor de la propiedad direccion residencia
	 */
	public String getIs_direccionResidencia() {
		return is_direccionResidencia;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad direccion residencia.
	 *
	 * @param as_direccionResidencia el nuevo valor para la propiedad direccion
	 *                               residencia
	 */
	public void setIs_direccionResidencia(String as_direccionResidencia) {
		this.is_direccionResidencia = as_direccionResidencia;
	}

	/**
	 * Obtiene el valor para la propiedad entidad especial DTO.
	 *
	 * @return El valor de la propiedad entidad especial DTO
	 */
	public EntidadEspecialDTO getIee_entidadEspecialDTO() {
		return iee_entidadEspecialDTO;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad entidad especial DTO.
	 *
	 * @param aee_entidadEspecialDTO el nuevo valor para la propiedad entidad
	 *                               especial DTO
	 */
	public void setIee_entidadEspecialDTO(EntidadEspecialDTO aee_entidadEspecialDTO) {
		this.iee_entidadEspecialDTO = aee_entidadEspecialDTO;
	}
}
