/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ValorCampoFormularioPKDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: ValorCampoFormularioPKDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Valor campo
 * formulario PK.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ValorCampoFormularioPKDTO extends GenericoDTO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad id
	 * configuracion campo.
	 */
	private String is_idConfiguracionCampo;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad id
	 * configuracion formulario.
	 */
	private String is_idConfiguracionFormulario;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad id
	 * formulario usuario.
	 */
	private String is_idFormularioUsuario;

	/**
	 * Construye una nueva instancia/objeto de la clase ValorCampoFormularioPKDTO.
	 */
	// --- Constructor
	public ValorCampoFormularioPKDTO() {
			// Metodo constructor vacio para modelo DTO
		}

	/**
	 * Obtiene el valor para la propiedad id configuracion campo.
	 *
	 * @return El valor de la propiedad id configuracion campo
	 */
	public String getIs_idConfiguracionCampo() {
		return is_idConfiguracionCampo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id configuracion campo.
	 *
	 * @param as_idConfiguracionCampo el nuevo valor para la propiedad id
	 *                                configuracion campo
	 */
	public void setIs_idConfiguracionCampo(String as_idConfiguracionCampo) {
		this.is_idConfiguracionCampo = as_idConfiguracionCampo;
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

	/**
	 * Obtiene el valor para la propiedad id formulario usuario.
	 *
	 * @return El valor de la propiedad id formulario usuario
	 */
	public String getIs_idFormularioUsuario() {
		return is_idFormularioUsuario;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id formulario usuario.
	 *
	 * @param as_idFormularioUsuario el nuevo valor para la propiedad id formulario
	 *                               usuario
	 */
	public void setIs_idFormularioUsuario(String as_idFormularioUsuario) {
		this.is_idFormularioUsuario = as_idFormularioUsuario;
	}

}