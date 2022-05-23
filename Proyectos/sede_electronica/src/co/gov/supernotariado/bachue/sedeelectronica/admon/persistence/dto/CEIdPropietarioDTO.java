/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: CEIdPropietarioDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: CEIdPropietarioDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto CE id propietario.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class CEIdPropietarioDTO extends GenericoDTO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero documento.
	 */
	private String is_numeroDocumento;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * primer nombre.
	 */
	private String is_primerNombre;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * segundo nombre.
	 */
	private String is_segundoNombre;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * primer apellido.
	 */
	private String is_primerApellido;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * segundo apellido.
	 */
	private String is_segundoApellido;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * razon social.
	 */
	private String is_razonSocial;
	
	/**
	 * Atributo de instancia tipo CatalogoDTO para definir la propiedad tipo
	 * persona.
	 */
	private CatalogoDTO ic_tipoPersonaDto;
	
	/**
	 * Atributo de instancia tipo CatalogoDTO para definir la propiedad genero.
	 */
	private CatalogoDTO ic_generoDto;
	
	/**
	 * Atributo de instancia tipo TipoDocumentoDTO para definir la propiedad tipo
	 * documento.
	 */
	private TipoDocumentoDTO itd_tipoDocumentoDto;

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
	 * Obtiene el valor para la propiedad primer nombre.
	 *
	 * @return El valor de la propiedad primer nombre
	 */
	public String getIs_primerNombre() {
		return is_primerNombre;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad primer nombre.
	 *
	 * @param as_primerNombre el nuevo valor para la propiedad primer nombre
	 */
	public void setIs_primerNombre(String as_primerNombre) {
		this.is_primerNombre = as_primerNombre;
	}

	/**
	 * Obtiene el valor para la propiedad segundo nombre.
	 *
	 * @return El valor de la propiedad segundo nombre
	 */
	public String getIs_segundoNombre() {
		return is_segundoNombre;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad segundo nombre.
	 *
	 * @param as_segundoNombre el nuevo valor para la propiedad segundo nombre
	 */
	public void setIs_segundoNombre(String as_segundoNombre) {
		this.is_segundoNombre = as_segundoNombre;
	}

	/**
	 * Obtiene el valor para la propiedad primer apellido.
	 *
	 * @return El valor de la propiedad primer apellido
	 */
	public String getIs_primerApellido() {
		return is_primerApellido;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad primer apellido.
	 *
	 * @param as_primerApellido el nuevo valor para la propiedad primer apellido
	 */
	public void setIs_primerApellido(String as_primerApellido) {
		this.is_primerApellido = as_primerApellido;
	}

	/**
	 * Obtiene el valor para la propiedad segundo apellido.
	 *
	 * @return El valor de la propiedad segundo apellido
	 */
	public String getIs_segundoApellido() {
		return is_segundoApellido;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad segundo apellido.
	 *
	 * @param as_segundoApellido el nuevo valor para la propiedad segundo apellido
	 */
	public void setIs_segundoApellido(String as_segundoApellido) {
		this.is_segundoApellido = as_segundoApellido;
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

	/**
	 * Obtiene el valor para la propiedad tipo persona dto.
	 *
	 * @return El valor de la propiedad tipo persona dto
	 */
	public CatalogoDTO getIc_tipoPersonaDto() {
		return ic_tipoPersonaDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo persona dto.
	 *
	 * @param ac_tipoPersonaDto el nuevo valor para la propiedad tipo persona dto
	 */
	public void setIc_tipoPersonaDto(CatalogoDTO ac_tipoPersonaDto) {
		this.ic_tipoPersonaDto = ac_tipoPersonaDto;
	}

	/**
	 * Obtiene el valor para la propiedad genero dto.
	 *
	 * @return El valor de la propiedad genero dto
	 */
	public CatalogoDTO getIc_generoDto() {
		return ic_generoDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad genero dto.
	 *
	 * @param ac_generoDto el nuevo valor para la propiedad genero dto
	 */
	public void setIc_generoDto(CatalogoDTO ac_generoDto) {
		this.ic_generoDto = ac_generoDto;
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
}
