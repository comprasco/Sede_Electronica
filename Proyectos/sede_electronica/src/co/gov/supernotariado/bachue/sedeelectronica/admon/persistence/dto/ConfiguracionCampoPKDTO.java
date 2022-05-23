/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ConfiguracionCampoPKDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: ConfiguracionCampoPKDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Configuracion
 * campo PK.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ConfiguracionCampoPKDTO extends GenericoDTO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad id.
	 */
	private String is_id;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad id
	 * configuracion formulario.
	 */
	private String is_idConfiguracionFormulario;

	/**
	 * Construye una nueva instancia/objeto de la clase ConfiguracionCampoPKDTO.
	 */
	// --- Constructor
		public ConfiguracionCampoPKDTO() {
			// Metodo constructor vacio para modelo DTO
		}
	
	/**
	 * Obtiene el valor para la propiedad id.
	 *
	 * @return El valor de la propiedad id
	 */
	public String getIs_id() {
		return is_id;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id.
	 *
	 * @param as_id el nuevo valor para la propiedad id
	 */
	public void setIs_id(String as_id) {
		this.is_id = as_id;
	}

	/**
	 * Obtiene el valor para la propiedad id configuracion formulario.
	 *
	 * @return El valor de la propiedad id configuracion formulario
	 */
	public String getIs_idConfiguracionFormulario() {
		return is_idConfiguracionFormulario;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id configuracion formulario.
	 *
	 * @param as_idConfiguracionFormulario el nuevo valor para la propiedad id
	 *                                     configuracion formulario
	 */
	public void setIs_idConfiguracionFormulario(String as_idConfiguracionFormulario) {
		this.is_idConfiguracionFormulario = as_idConfiguracionFormulario;
	}

}