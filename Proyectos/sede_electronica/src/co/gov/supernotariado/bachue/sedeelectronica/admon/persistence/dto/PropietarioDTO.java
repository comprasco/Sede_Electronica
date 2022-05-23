/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: PropietarioDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: PropietarioDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Propietario.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class PropietarioDTO extends GenericoDTO{

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo documento dto.
	 */
	private String is_tipoDocumentoDto;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad num
	 * documento persona.
	 */
	private String is_numDocumentoPersona;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad num
	 * NIT.
	 */
	private String is_numNIT;
	
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
	 * razon social.
	 */
	private String is_razonSocial;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * porcentaje participacion.
	 */
	private String is_porcentajeParticipacion;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo persona.
	 */
	private String is_tipoPersona;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad cod
	 * genero.
	 */
	private String is_codGenero;
	
	/**
	 * Obtiene el valor para la propiedad tipo documento dto.
	 *
	 * @return El valor de la propiedad tipo documento dto
	 */
	public String getIs_tipoDocumentoDto() {
		return is_tipoDocumentoDto;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad tipo documento dto.
	 *
	 * @param as_tipoDocumentoDto el nuevo valor para la propiedad tipo documento
	 *                            dto
	 */
	public void setIs_tipoDocumentoDto(String as_tipoDocumentoDto) {
		this.is_tipoDocumentoDto = as_tipoDocumentoDto;
	}
	
	/**
	 * Obtiene el valor para la propiedad num documento persona.
	 *
	 * @return El valor de la propiedad num documento persona
	 */
	public String getIs_numDocumentoPersona() {
		return is_numDocumentoPersona;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad num documento persona.
	 *
	 * @param as_numDocumentoPersona el nuevo valor para la propiedad num documento
	 *                               persona
	 */
	public void setIs_numDocumentoPersona(String as_numDocumentoPersona) {
		this.is_numDocumentoPersona = as_numDocumentoPersona;
	}
	
	/**
	 * Obtiene el valor para la propiedad num NIT.
	 *
	 * @return El valor de la propiedad num NIT
	 */
	public String getIs_numNIT() {
		return is_numNIT;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad num NIT.
	 *
	 * @param as_numNIT el nuevo valor para la propiedad num NIT
	 */
	public void setIs_numNIT(String as_numNIT) {
		this.is_numNIT = as_numNIT;
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
	 * Obtiene el valor para la propiedad porcentaje participacion.
	 *
	 * @return El valor de la propiedad porcentaje participacion
	 */
	public String getIs_porcentajeParticipacion() {
		return is_porcentajeParticipacion;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad porcentaje participacion.
	 *
	 * @param as_porcentajeParticipacion el nuevo valor para la propiedad porcentaje
	 *                                   participacion
	 */
	public void setIs_porcentajeParticipacion(String as_porcentajeParticipacion) {
		this.is_porcentajeParticipacion = as_porcentajeParticipacion;
	}
	
	/**
	 * Obtiene el valor para la propiedad tipo persona.
	 *
	 * @return El valor de la propiedad tipo persona
	 */
	public String getIs_tipoPersona() {
		return is_tipoPersona;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad tipo persona.
	 *
	 * @param as_tipoPersona el nuevo valor para la propiedad tipo persona
	 */
	public void setIs_tipoPersona(String as_tipoPersona) {
		this.is_tipoPersona = as_tipoPersona;
	}
	
	/**
	 * Obtiene el valor para la propiedad cod genero.
	 *
	 * @return El valor de la propiedad cod genero
	 */
	public String getIs_codGenero() {
		return is_codGenero;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad cod genero.
	 *
	 * @param as_codGenero el nuevo valor para la propiedad cod genero
	 */
	public void setIs_codGenero(String as_codGenero) {
		this.is_codGenero = as_codGenero;
	}
	
}
