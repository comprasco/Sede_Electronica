/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: PersonaDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: PersonaDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

import java.util.List;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Persona.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class PersonaDTO extends GenericoBaseDTO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo CatalogoDTO para definir la propiedad catalogo.
	 */
	// --- Atributos
	private CatalogoDTO ic_catalogoDto;
	
	/**
	 * Atributo de instancia tipo lista de DireccionDTO para definir la propiedad
	 * persona direccions.
	 */
	private List<DireccionDTO> ildd_personaDireccionsDto;
	
	/**
	 * Atributo de instancia tipo PersonaJuridicaDTO para definir la propiedad
	 * persona juridica.
	 */
	private PersonaJuridicaDTO ipj_personaJuridicaDto;
	
	/**
	 * Atributo de instancia tipo PersonaNaturalDTO para definir la propiedad
	 * persona natural.
	 */
	private PersonaNaturalDTO ipn_personaNaturalDto;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero documento.
	 */
	private String is_numeroDocumento;
	
	/**
	 * Atributo de instancia tipo TipoDocumentoDTO para definir la propiedad tipo
	 * documento.
	 */
	private TipoDocumentoDTO itd_tipoDocumentoDto;
	
	/**
	 * Atributo de instancia tipo UsuarioDTO para definir la propiedad usuario.
	 */
	private UsuarioDTO iu_usuarioDto;

	// Se adicionan propiedades para dejar estable

	/**
	 * Construye una nueva instancia/objeto de la clase PersonaDTO.
	 */
	// --- Constructor
	public PersonaDTO() {
		this.setIc_catalogoDto(new CatalogoDTO());
		this.setItd_tipoDocumentoDto(new TipoDocumentoDTO());
	}

	// --- Getters-Setters

	/**
	 * Obtiene el valor para la propiedad numero documento.
	 *
	 * @return El valor de la propiedad numero documento
	 */
	public String getIs_numeroDocumento() {
		return is_numeroDocumento;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad numero documento.
	 *
	 * @param as_numeroDocumento el nuevo valor para la propiedad numero documento
	 */
	public void setIs_numeroDocumento(String as_numeroDocumento) {
		this.is_numeroDocumento = as_numeroDocumento;
	}

	/**
	 * Obtiene el valor para la propiedad catalogo dto.
	 *
	 * @return El valor de la propiedad catalogo dto
	 */
	public CatalogoDTO getIc_catalogoDto() {
		return ic_catalogoDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad catalogo dto.
	 *
	 * @param ac_catalogoDto el nuevo valor para la propiedad catalogo dto
	 */
	public void setIc_catalogoDto(CatalogoDTO ac_catalogoDto) {
		this.ic_catalogoDto = ac_catalogoDto;
	}

	/**
	 * Obtiene el valor para la propiedad tipo documento dto.
	 *
	 * @return El valor de la propiedad tipo documento dto
	 */
	public TipoDocumentoDTO getItd_tipoDocumentoDto() {
		return itd_tipoDocumentoDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo documento dto.
	 *
	 * @param atd_tipoDocumentoDto el nuevo valor para la propiedad tipo documento
	 *                             dto
	 */
	public void setItd_tipoDocumentoDto(TipoDocumentoDTO atd_tipoDocumentoDto) {
		this.itd_tipoDocumentoDto = atd_tipoDocumentoDto;
	}

	/**
	 * Obtiene el valor para la propiedad persona juridica dto.
	 *
	 * @return El valor de la propiedad persona juridica dto
	 */
	public PersonaJuridicaDTO getIpj_personaJuridicaDto() {
		return ipj_personaJuridicaDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad persona juridica dto.
	 *
	 * @param apj_personaJuridicaDto el nuevo valor para la propiedad persona
	 *                               juridica dto
	 */
	public void setIpj_personaJuridicaDto(PersonaJuridicaDTO apj_personaJuridicaDto) {
		this.ipj_personaJuridicaDto = apj_personaJuridicaDto;
	}

	/**
	 * Obtiene el valor para la propiedad persona natural dto.
	 *
	 * @return El valor de la propiedad persona natural dto
	 */
	public PersonaNaturalDTO getIpn_personaNaturalDto() {
		return ipn_personaNaturalDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad persona natural dto.
	 *
	 * @param apn_personaNaturalDto el nuevo valor para la propiedad persona natural
	 *                              dto
	 */
	public void setIpn_personaNaturalDto(PersonaNaturalDTO apn_personaNaturalDto) {
		this.ipn_personaNaturalDto = apn_personaNaturalDto;
	}

	/**
	 * Obtiene el valor para la propiedad usuario dto.
	 *
	 * @return El valor de la propiedad usuario dto
	 */
	public UsuarioDTO getIu_usuarioDto() {
		return iu_usuarioDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad usuario dto.
	 *
	 * @param iu_usuarioDto el nuevo valor para la propiedad usuario dto
	 */
	public void setIu_usuarioDto(UsuarioDTO iu_usuarioDto) {
		this.iu_usuarioDto = iu_usuarioDto;
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
	 * Cambia/actualiza el valor para la propiedad persona direcciones dto.
	 *
	 * @param aldd_personaDireccionsDto el nuevo valor para la propiedad persona
	 *                                  direcciones dto
	 */
	public void setIlpd_personaDireccionesDto(List<DireccionDTO> aldd_personaDireccionsDto) {
		this.ildd_personaDireccionsDto = aldd_personaDireccionsDto;
	}
}
