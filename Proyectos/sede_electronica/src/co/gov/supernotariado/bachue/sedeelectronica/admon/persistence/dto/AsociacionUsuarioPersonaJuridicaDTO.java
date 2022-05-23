/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: AsociacionUsuarioPersonaJuridicaDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: AsociacionUsuarioPersonaJuridicaDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.interfaces.IAsociacionesDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumBoolean;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Asociacion usuario
 * persona juridica.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class AsociacionUsuarioPersonaJuridicaDTO extends GenericoBaseDTO implements IAsociacionesDTO {
	
	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad id
	 * asociacion.
	 */
	// --- Atributos
	private String is_idAsociacion;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * celular corporativo.
	 */
	private String is_celularCorporativo;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * confirmacion usuario.
	 */
	private String is_confirmacionUsuario;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * correo electronico corporativo.
	 */
	private String is_correoElectronicoCorporativo;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * estado asociacion.
	 */
	private String is_estadoAsociacion;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * estado cuenta cupo.
	 */
	private String is_estadoCuentaCupo;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad id
	 * persona juridica.
	 */
	private String is_idPersonaJuridica;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad id
	 * usuario persona natural.
	 */
	private String is_idUsuarioPersonaNatural;
	
	/**
	 * Atributo de instancia tipo PersonaJuridicaDTO para definir la propiedad id
	 * persona juridica.
	 */
	private PersonaJuridicaDTO ipj_idPersonaJuridica;
	
	/**
	 * Atributo de instancia tipo UsuarioDTO para definir la propiedad usuario.
	 */
	private UsuarioDTO iu_usuarioDto;

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * AsociacionUsuarioPersonaJuridicaDTO.
	 */
	// --- Constructor
	public AsociacionUsuarioPersonaJuridicaDTO() {
	}

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * AsociacionUsuarioPersonaJuridicaDTO.
	 *
	 * @param as_idAsociacion el parametro id asociacion
	 */
	public AsociacionUsuarioPersonaJuridicaDTO(String as_idAsociacion) {
		this.is_idAsociacion = as_idAsociacion;
	}

	// --- Getters-Setters

	/**
	 * Obtiene el valor para la propiedad id asociacion.
	 *
	 * @return El valor de la propiedad id asociacion
	 */
	public String getIs_idAsociacion() {
		return is_idAsociacion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id asociacion.
	 *
	 * @param as_idAsociacion el nuevo valor para la propiedad id asociacion
	 */
	public void setIs_idAsociacion(String as_idAsociacion) {
		this.is_idAsociacion = as_idAsociacion;
	}

	/**
	 * Obtiene el valor para la propiedad celular corporativo.
	 *
	 * @return El valor de la propiedad celular corporativo
	 */
	public String getIs_celularCorporativo() {
		return is_celularCorporativo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad celular corporativo.
	 *
	 * @param as_celularCorporativo el nuevo valor para la propiedad celular
	 *                              corporativo
	 */
	public void setIs_celularCorporativo(String as_celularCorporativo) {
		this.is_celularCorporativo = as_celularCorporativo;
	}

	/**
	 * Obtiene el valor para la propiedad confirmacion usuario.
	 *
	 * @return El valor de la propiedad confirmacion usuario
	 */
	public String getIs_confirmacionUsuario() {
		return is_confirmacionUsuario;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad confirmacion usuario.
	 *
	 * @param as_confirmacionUsuario el nuevo valor para la propiedad confirmacion
	 *                               usuario
	 */
	public void setIs_confirmacionUsuario(String as_confirmacionUsuario) {
		this.is_confirmacionUsuario = as_confirmacionUsuario;
	}

	/**
	 * Obtiene el valor para la propiedad correo electronico corporativo.
	 *
	 * @return El valor de la propiedad correo electronico corporativo
	 */
	public String getIs_correoElectronicoCorporativo() {
		return is_correoElectronicoCorporativo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad correo electronico corporativo.
	 *
	 * @param as_correoElectronicoCorporativo el nuevo valor para la propiedad
	 *                                        correo electronico corporativo
	 */
	public void setIs_correoElectronicoCorporativo(String as_correoElectronicoCorporativo) {
		this.is_correoElectronicoCorporativo = as_correoElectronicoCorporativo;
	}

	/**
	 * Obtiene el valor para la propiedad estado asociacion.
	 *
	 * @return El valor de la propiedad estado asociacion
	 */
	public String getIs_estadoAsociacion() {
		return is_estadoAsociacion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad estado asociacion.
	 *
	 * @param as_estadoAsociacion el nuevo valor para la propiedad estado asociacion
	 */
	public void setIs_estadoAsociacion(String as_estadoAsociacion) {
		this.is_estadoAsociacion = as_estadoAsociacion;
	}

	/**
	 * Obtiene el valor para la propiedad estado cuenta cupo.
	 *
	 * @return El valor de la propiedad estado cuenta cupo
	 */
	public String getIs_estadoCuentaCupo() {
		return is_estadoCuentaCupo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad estado cuenta cupo.
	 *
	 * @param as_estadoCuentaCupo el nuevo valor para la propiedad estado cuenta
	 *                            cupo
	 */
	public void setIs_estadoCuentaCupo(String as_estadoCuentaCupo) {
		this.is_estadoCuentaCupo = as_estadoCuentaCupo;
	}

	/**
	 * Obtiene el valor para la propiedad id persona juridica.
	 *
	 * @return El valor de la propiedad id persona juridica
	 */
	public String getIs_idPersonaJuridica() {
		return is_idPersonaJuridica;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id persona juridica.
	 *
	 * @param as_idPersonaJuridica el nuevo valor para la propiedad id persona
	 *                             juridica
	 */
	public void setIs_idPersonaJuridica(String as_idPersonaJuridica) {
		this.is_idPersonaJuridica = as_idPersonaJuridica;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.interfaces.IAsociacionesDTO#getIu_usuarioDto()
	 */
	@Override
	public UsuarioDTO getIu_usuarioDto() {
		return iu_usuarioDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad usuario dto.
	 *
	 * @param au_usuarioDto el nuevo valor para la propiedad usuario dto
	 */
	public void setIu_usuarioDto(UsuarioDTO au_usuarioDto) {
		this.iu_usuarioDto = au_usuarioDto;
	}

	/**
	 * Obtiene el valor para la propiedad id usuario persona natural.
	 *
	 * @return El valor de la propiedad id usuario persona natural
	 */
	public String getIs_idUsuarioPersonaNatural() {
		return is_idUsuarioPersonaNatural;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id usuario persona natural.
	 *
	 * @param as_idUsuarioPersonaNatural el nuevo valor para la propiedad id usuario
	 *                                   persona natural
	 */
	public void setIs_idUsuarioPersonaNatural(String as_idUsuarioPersonaNatural) {
		this.is_idUsuarioPersonaNatural = as_idUsuarioPersonaNatural;
	}

	/**
	 * Obtiene el valor para la propiedad id persona juridica.
	 *
	 * @return El valor de la propiedad id persona juridica
	 */
	public PersonaJuridicaDTO getIpj_idPersonaJuridica() {
		return ipj_idPersonaJuridica;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id persona juridica.
	 *
	 * @param apj_idPersonaJuridica el nuevo valor para la propiedad id persona
	 *                              juridica
	 */
	public void setIpj_idPersonaJuridica(PersonaJuridicaDTO apj_idPersonaJuridica) {
		this.ipj_idPersonaJuridica = apj_idPersonaJuridica;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.interfaces.IAsociacionesDTO#getRazonSocial()
	 */
	@Override
	public String getRazonSocial() {
		String ls_razonSocial;
		ls_razonSocial = this.ipj_idPersonaJuridica.getIs_razonSocial();
		return ls_razonSocial;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.interfaces.IAsociacionesDTO#getTipoDocumento()
	 */
	@Override
	public String getTipoDocumento() {
		String ls_tipoDocumento;
		ls_tipoDocumento = this.ipj_idPersonaJuridica.getIp_personaDto().getItd_tipoDocumentoDto().getIs_id();
		return ls_tipoDocumento;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.interfaces.IAsociacionesDTO#getNumeroDocumento()
	 */
	@Override
	public String getNumeroDocumento() {
		String ls_numeroDocumento;
		ls_numeroDocumento = this.ipj_idPersonaJuridica.getIp_personaDto().getIs_numeroDocumento();
		return ls_numeroDocumento;
	}

	/**
	 * Consultar estado.
	 *
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	public Boolean consultarEstado() {
		return EnumBoolean.buscarBooleano(is_estadoAsociacion).getIb_valor();
	}
	
	/**
	 * Consultar cuenta cupo.
	 *
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	public Boolean consultarCuentaCupo()
	{
		return EnumBoolean.buscarBooleano(is_estadoCuentaCupo).getIb_valor();
	}

}
