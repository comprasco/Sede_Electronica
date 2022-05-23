/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: PersonaJuridicaDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: PersonaJuridicaDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

import java.util.List;

import org.primefaces.model.StreamedContent;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Persona juridica.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class PersonaJuridicaDTO extends GenericoBaseDTO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo PersonaDTO para definir la propiedad persona.
	 */
	// --- Atributos
	private PersonaDTO ip_personaDto;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad es
	 * entidad especial.
	 */
	private String is_esEntidadEspecial;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad id
	 * persona.
	 */
	private String is_idPersona;
	
	/**
	 * Atributo de instancia tipo CatalogoDTO para definir la propiedad tipo
	 * catalogo tipo organizacion.
	 */
	private CatalogoDTO ic_tipoCatalogoTipoOrganizacion;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * razon social.
	 */
	private String is_razonSocial;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * representante legal.
	 */
	private String is_primerNombreRepresentanteLegal;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * representante legal.
	 */
	private String is_segundoNombreRepresentanteLegal;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * representante legal.
	 */
	private String is_primerApellidoRepresentanteLegal;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * representante legal.
	 */
	private String is_segundoApellidoRepresentanteLegal;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * telefono.
	 */
	private String is_telefono;
	
	/**
	 * Atributo de instancia tipo arreglo de bytes para definir la propiedad
	 * documento camara comercio.
	 */
	private byte[] ib_documentoCamaraComercio;
	
	/**
	 * Atributo de instancia tipo arreglo de bytes para definir la propiedad
	 * documento carta representante legal.
	 */
	private byte[] ib_documentoCartaRepresentanteLegal;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre documento camara.
	 */
	private String is_nombreDocumentoCamara;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre documento representante.
	 */
	private String is_nombreDocumentoRepresentante;
	
	/**
	 * Atributo de instancia tipo lista de AsociacionUsuarioPersonaJuridicaDTO para
	 * definir la propiedad asociacion usuario persona juridica.
	 */
	private List<AsociacionUsuarioPersonaJuridicaDTO> ilaupj_asociacionUsuarioPersonaJuridicaDto;
	
	/**
	 * Atributo de instancia tipo StreamedContent para definir la propiedad archivo
	 * A descargar.
	 */
	private transient StreamedContent isc_archivoADescargar;
	
	/**
	 * Atributo de instancia tipo UsuarioDTO para definir la propiedad usuario.
	 */
	private UsuarioDTO iu_usuarioDto;

	/**
	 * Construye una nueva instancia/objeto de la clase PersonaJuridicaDTO.
	 */
	// --- Constructor
	public PersonaJuridicaDTO() {
		this.setIp_personaDto(new PersonaDTO());
		this.setIc_tipoCatalogoTipoOrganizacion(new CatalogoDTO());
	}

	/**
	 * Construye una nueva instancia/objeto de la clase PersonaJuridicaDTO.
	 *
	 * @param as_idPersona el parametro id persona
	 */
	// --- Getters-Setters
	public PersonaJuridicaDTO(String as_idPersona) {
		this.is_idPersona = as_idPersona;
	}

	/**
	 * Obtiene el valor para la propiedad persona dto.
	 *
	 * @return El valor de la propiedad persona dto
	 */
	public PersonaDTO getIp_personaDto() {
		return ip_personaDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad persona dto.
	 *
	 * @param ap_personaDto el nuevo valor para la propiedad persona dto
	 */
	public void setIp_personaDto(PersonaDTO ap_personaDto) {
		this.ip_personaDto = ap_personaDto;
	}

	/**
	 * Obtiene el valor para la propiedad es entidad especial.
	 *
	 * @return El valor de la propiedad es entidad especial
	 */
	public String getIs_esEntidadEspecial() {
		return is_esEntidadEspecial;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad es entidad especial.
	 *
	 * @param as_esEntidadEspecial el nuevo valor para la propiedad es entidad
	 *                             especial
	 */
	public void setIs_esEntidadEspecial(String as_esEntidadEspecial) {
		this.is_esEntidadEspecial = as_esEntidadEspecial;
	}

	/**
	 * Obtiene el valor para la propiedad id persona.
	 *
	 * @return El valor de la propiedad id persona
	 */
	public String getIs_idPersona() {
		return is_idPersona;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id persona.
	 *
	 * @param as_idPersona el nuevo valor para la propiedad id persona
	 */
	public void setIs_idPersona(String as_idPersona) {
		this.is_idPersona = as_idPersona;
	}

	/**
	 * Obtiene el valor para la propiedad razon social.
	 *
	 * @return El valor de la propiedad razon social
	 */
	public String getIs_razonSocial() {
		return is_razonSocial;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad razon social.
	 *
	 * @param as_razonSocial el nuevo valor para la propiedad razon social
	 */
	public void setIs_razonSocial(String as_razonSocial) {
		this.is_razonSocial = as_razonSocial;
	}

	public String getIs_primerNombreRepresentanteLegal() {
		return is_primerNombreRepresentanteLegal;
	}

	public void setIs_primerNombreRepresentanteLegal(String as_primerNombreRepresentanteLegal) {
		this.is_primerNombreRepresentanteLegal = as_primerNombreRepresentanteLegal;
	}

	public String getIs_segundoNombreRepresentanteLegal() {
		if(is_segundoNombreRepresentanteLegal == null)
			return "";
		return is_segundoNombreRepresentanteLegal;
	}

	public void setIs_segundoNombreRepresentanteLegal(String as_segundoNombreRepresentanteLegal) {
		this.is_segundoNombreRepresentanteLegal = as_segundoNombreRepresentanteLegal;
	}

	public String getIs_primerApellidoRepresentanteLegal() {
		return is_primerApellidoRepresentanteLegal;
	}

	public void setIs_primerApellidoRepresentanteLegal(String as_primerApellidoRepresentanteLegal) {
		this.is_primerApellidoRepresentanteLegal = as_primerApellidoRepresentanteLegal;
	}

	public String getIs_segundoApellidoRepresentanteLegal() {
		return is_segundoApellidoRepresentanteLegal;
	}

	public void setIs_segundoApellidoRepresentanteLegal(String as_segundoApellidoRepresentanteLegal) {
		this.is_segundoApellidoRepresentanteLegal = as_segundoApellidoRepresentanteLegal;
	}

	/**
	 * Obtiene el valor para la propiedad telefono.
	 *
	 * @return El valor de la propiedad telefono
	 */
	public String getIs_telefono() {
		return is_telefono;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad telefono.
	 *
	 * @param as_telefono el nuevo valor para la propiedad telefono
	 */
	public void setIs_telefono(String as_telefono) {
		this.is_telefono = as_telefono;
	}

	/**
	 * Obtiene el valor para la propiedad tipo catalogo tipo organizacion.
	 *
	 * @return El valor de la propiedad tipo catalogo tipo organizacion
	 */
	public CatalogoDTO getIc_tipoCatalogoTipoOrganizacion() {
		return ic_tipoCatalogoTipoOrganizacion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo catalogo tipo organizacion.
	 *
	 * @param ac_tipoCatalogoTipoOrganizacion el nuevo valor para la propiedad tipo
	 *                                        catalogo tipo organizacion
	 */
	public void setIc_tipoCatalogoTipoOrganizacion(CatalogoDTO ac_tipoCatalogoTipoOrganizacion) {
		this.ic_tipoCatalogoTipoOrganizacion = ac_tipoCatalogoTipoOrganizacion;
	}

	/**
	 * Obtiene el valor para la propiedad documento camara comercio.
	 *
	 * @return El valor de la propiedad documento camara comercio
	 */
	public byte[] getIb_documentoCamaraComercio() {
		return ib_documentoCamaraComercio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad documento camara comercio.
	 *
	 * @param ab_documentoCamaraComercio el nuevo valor para la propiedad documento
	 *                                   camara comercio
	 */
	public void setIb_documentoCamaraComercio(byte[] ab_documentoCamaraComercio) {
		this.ib_documentoCamaraComercio = ab_documentoCamaraComercio;
	}

	/**
	 * Obtiene el valor para la propiedad documento carta representante legal.
	 *
	 * @return El valor de la propiedad documento carta representante legal
	 */
	public byte[] getIb_documentoCartaRepresentanteLegal() {
		return ib_documentoCartaRepresentanteLegal;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad documento carta representante
	 * legal.
	 *
	 * @param ab_documentoCartaRepresentanteLegal el nuevo valor para la propiedad
	 *                                            documento carta representante
	 *                                            legal
	 */
	public void setIb_documentoCartaRepresentanteLegal(byte[] ab_documentoCartaRepresentanteLegal) {
		this.ib_documentoCartaRepresentanteLegal = ab_documentoCartaRepresentanteLegal;
	}

	/**
	 * Obtiene el valor para la propiedad nombre documento camara.
	 *
	 * @return El valor de la propiedad nombre documento camara
	 */
	public String getIs_nombreDocumentoCamara() {
		return is_nombreDocumentoCamara;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nombre documento camara.
	 *
	 * @param as_nombreDocumentoCamara el nuevo valor para la propiedad nombre
	 *                                 documento camara
	 */
	public void setIs_nombreDocumentoCamara(String as_nombreDocumentoCamara) {
		this.is_nombreDocumentoCamara = as_nombreDocumentoCamara;
	}

	/**
	 * Obtiene el valor para la propiedad nombre documento representante.
	 *
	 * @return El valor de la propiedad nombre documento representante
	 */
	public String getIs_nombreDocumentoRepresentante() {
		return is_nombreDocumentoRepresentante;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nombre documento representante.
	 *
	 * @param as_nombreDocumentoRepresentante el nuevo valor para la propiedad
	 *                                        nombre documento representante
	 */
	public void setIs_nombreDocumentoRepresentante(String as_nombreDocumentoRepresentante) {
		this.is_nombreDocumentoRepresentante = as_nombreDocumentoRepresentante;
	}

	/**
	 * Obtiene el valor para la propiedad asociacion usuario persona juridica dto.
	 *
	 * @return El valor de la propiedad asociacion usuario persona juridica dto
	 */
	public List<AsociacionUsuarioPersonaJuridicaDTO> getIlaupj_asociacionUsuarioPersonaJuridicaDto() {
		return ilaupj_asociacionUsuarioPersonaJuridicaDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad asociacion usuario persona
	 * juridica dto.
	 *
	 * @param alaupj_asociacionUsuarioPersonaJuridicaDto el nuevo valor para la
	 *                                                   propiedad asociacion
	 *                                                   usuario persona juridica
	 *                                                   dto
	 */
	public void setIlaupj_asociacionUsuarioPersonaJuridicaDto(
			List<AsociacionUsuarioPersonaJuridicaDTO> alaupj_asociacionUsuarioPersonaJuridicaDto) {
		this.ilaupj_asociacionUsuarioPersonaJuridicaDto = alaupj_asociacionUsuarioPersonaJuridicaDto;
	}

	/**
	 * Obtiene el valor para la propiedad archivo A descargar.
	 *
	 * @return El valor de la propiedad archivo A descargar
	 */
	public StreamedContent getIsc_archivoADescargar() {
		return isc_archivoADescargar;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad archivo A descargar.
	 *
	 * @param asc_archivoADescargar el nuevo valor para la propiedad archivo A
	 *                              descargar
	 */
	public void setIsc_archivoADescargar(StreamedContent asc_archivoADescargar) {
		this.isc_archivoADescargar = asc_archivoADescargar;
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
	 * @param au_usuarioDto el nuevo valor para la propiedad usuario dto
	 */
	public void setIu_usuarioDto(UsuarioDTO au_usuarioDto) {
		this.iu_usuarioDto = au_usuarioDto;
	}
	
	public String getNombreRepresentanteLegal() {
		return getIs_primerNombreRepresentanteLegal().concat(" " + ((getIs_segundoNombreRepresentanteLegal() == null)?"":getIs_segundoNombreRepresentanteLegal())).concat(" " + getIs_primerApellidoRepresentanteLegal()).concat(" " + ((getIs_segundoApellidoRepresentanteLegal() == null)?"":getIs_segundoApellidoRepresentanteLegal()));
	}
}
