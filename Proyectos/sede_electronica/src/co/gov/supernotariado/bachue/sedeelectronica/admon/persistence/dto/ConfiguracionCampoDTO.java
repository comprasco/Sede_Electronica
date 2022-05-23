/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ConfiguracionCampoDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: ConfiguracionCampoDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Configuracion
 * campo.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ConfiguracionCampoDTO extends GenericoBaseDTO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo ConfiguracionCampoPKDTO para definir la propiedad
	 * id configuracion formulario.
	 */
	private ConfiguracionCampoPKDTO iccp_idConfiguracionFormularioDto;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * descripcion.
	 */
	private String is_descripcion;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * formato.
	 */
	private String is_formato;
	
	/**
	 * Atributo de instancia tipo ConfiguracionFormularioDTO para definir la
	 * propiedad id configuracion formulario.
	 */
	private ConfiguracionFormularioDTO icf_idConfiguracionFormulario;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre.
	 */
	private String is_nombre;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * obligatorio.
	 */
	private String is_obligatorio;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo dato.
	 */
	private String is_tipoDato;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * valor defecto.
	 */
	private String is_valorDefecto;

	/**
	 * Obtiene el valor para la propiedad descripcion.
	 *
	 * @return El valor de la propiedad descripcion
	 */
	public String getIs_descripcion() {
		return is_descripcion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad descripcion.
	 *
	 * @param as_descripcion el nuevo valor para la propiedad descripcion
	 */
	public void setIs_descripcion(String as_descripcion) {
		this.is_descripcion = as_descripcion;
	}

	/**
	 * Obtiene el valor para la propiedad formato.
	 *
	 * @return El valor de la propiedad formato
	 */
	public String getIs_formato() {
		return is_formato;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad formato.
	 *
	 * @param as_formato el nuevo valor para la propiedad formato
	 */
	public void setIs_formato(String as_formato) {
		this.is_formato = as_formato;
	}


	/**
	 * Obtiene el valor para la propiedad id configuracion formulario.
	 *
	 * @return El valor de la propiedad id configuracion formulario
	 */
	public ConfiguracionFormularioDTO getIcf_idConfiguracionFormulario() {
		return icf_idConfiguracionFormulario;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id configuracion formulario.
	 *
	 * @param acf_idConfiguracionFormulario el nuevo valor para la propiedad id
	 *                                      configuracion formulario
	 */
	public void setIcf_idConfiguracionFormulario(ConfiguracionFormularioDTO acf_idConfiguracionFormulario) {
		this.icf_idConfiguracionFormulario = acf_idConfiguracionFormulario;

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
	 * Obtiene el valor para la propiedad obligatorio.
	 *
	 * @return El valor de la propiedad obligatorio
	 */
	public String getIs_obligatorio() {
		return is_obligatorio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad obligatorio.
	 *
	 * @param as_obligatorio el nuevo valor para la propiedad obligatorio
	 */
	public void setIs_obligatorio(String as_obligatorio) {
		this.is_obligatorio = as_obligatorio;
	}

	/**
	 * Obtiene el valor para la propiedad tipo dato.
	 *
	 * @return El valor de la propiedad tipo dato
	 */
	public String getIs_tipoDato() {
		return is_tipoDato;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo dato.
	 *
	 * @param as_tipoDato el nuevo valor para la propiedad tipo dato
	 */
	public void setIs_tipoDato(String as_tipoDato) {
		this.is_tipoDato = as_tipoDato;
	}

	/**
	 * Obtiene el valor para la propiedad valor defecto.
	 *
	 * @return El valor de la propiedad valor defecto
	 */
	public String getIs_valorDefecto() {
		return is_valorDefecto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad valor defecto.
	 *
	 * @param as_valorDefecto el nuevo valor para la propiedad valor defecto
	 */
	public void setIs_valorDefecto(String as_valorDefecto) {
		this.is_valorDefecto = as_valorDefecto;
	}

	/**
	 * Obtiene el valor para la propiedad id configuracion formulario dto.
	 *
	 * @return El valor de la propiedad id configuracion formulario dto
	 */
	public ConfiguracionCampoPKDTO getIccp_idConfiguracionFormularioDto() {
		return iccp_idConfiguracionFormularioDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id configuracion formulario dto.
	 *
	 * @param accp_idConfiguracionFormularioDto el nuevo valor para la propiedad id
	 *                                          configuracion formulario dto
	 */
	public void setIccp_idConfiguracionFormularioDto(ConfiguracionCampoPKDTO accp_idConfiguracionFormularioDto) {
		this.iccp_idConfiguracionFormularioDto = accp_idConfiguracionFormularioDto;
	}

}