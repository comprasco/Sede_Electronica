/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: PersonaNaturalDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: PersonaNaturalDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

import java.util.Date;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Persona natural.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class PersonaNaturalDTO extends GenericoBaseDTO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo fecha para definir la propiedad fecha expedicion.
	 */
	// --- Atributos
	private Date id_fechaExpedicion;
	
	/**
	 * Atributo de instancia tipo fecha para definir la propiedad fecha nacimiento.
	 */
	private Date id_fechaNacimiento;
	
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
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * primer apellido.
	 */
	private String is_primerApellido;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * primer nombre.
	 */
	private String is_primerNombre;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * segundo apellido.
	 */
	private String is_segundoApellido;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * segundo nombre.
	 */
	private String is_segundoNombre;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * telefono.
	 */
	private String is_telefono;
	
	/**
	 * Atributo de instancia tipo PersonaDTO para definir la propiedad persona.
	 */
	private PersonaDTO ip_personaDto;
	
	/**
	 * Atributo de instancia tipo CatalogoDTO para definir la propiedad catalogo
	 * tipo genero.
	 */
	private CatalogoDTO ic_catalogoTipoGenero;

	/**
	 * Construye una nueva instancia/objeto de la clase PersonaNaturalDTO.
	 */
	// --- Constructor
	public PersonaNaturalDTO() {
		this.setIp_personaDto(new PersonaDTO());
		this.setIc_catalogoTipoGenero(new CatalogoDTO());
	}

	/**
	 * Construye una nueva instancia/objeto de la clase PersonaNaturalDTO.
	 *
	 * @param as_idPersona el parametro id persona
	 */
	// --- Getters-Setters
	public PersonaNaturalDTO(String as_idPersona) {
		this.is_idPersona = as_idPersona;
	}

	/**
	 * Obtiene el valor para la propiedad fecha expedicion.
	 *
	 * @return El valor de la propiedad fecha expedicion
	 */
	public Date getId_fechaExpedicion() {
		return id_fechaExpedicion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad fecha expedicion.
	 *
	 * @param ad_fechaExpedicion el nuevo valor para la propiedad fecha expedicion
	 */
	public void setId_fechaExpedicion(Date ad_fechaExpedicion) {
		this.id_fechaExpedicion = ad_fechaExpedicion;
	}

	/**
	 * Obtiene el valor para la propiedad fecha nacimiento.
	 *
	 * @return El valor de la propiedad fecha nacimiento
	 */
	public Date getId_fechaNacimiento() {
		return id_fechaNacimiento;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad fecha nacimiento.
	 *
	 * @param ad_fechaNacimiento el nuevo valor para la propiedad fecha nacimiento
	 */
	public void setId_fechaNacimiento(Date ad_fechaNacimiento) {
		this.id_fechaNacimiento = ad_fechaNacimiento;
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
	 * Obtiene el valor para la propiedad catalogo tipo genero.
	 *
	 * @return El valor de la propiedad catalogo tipo genero
	 */
	public CatalogoDTO getIc_catalogoTipoGenero() {
		return ic_catalogoTipoGenero;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad catalogo tipo genero.
	 *
	 * @param ac_catalogoTipoGenero el nuevo valor para la propiedad catalogo tipo
	 *                              genero
	 */
	public void setIc_catalogoTipoGenero(CatalogoDTO ac_catalogoTipoGenero) {
		this.ic_catalogoTipoGenero = ac_catalogoTipoGenero;
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
}
