/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: FormularioUsuarioDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: FormularioUsuarioDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Formulario
 * usuario.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class FormularioUsuarioDTO extends GenericoBaseDTO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo ConfiguracionFormularioDTO para definir la
	 * propiedad id configuracion formulario.
	 */
	private ConfiguracionFormularioDTO icf_idConfiguracionFormularioDto;
	
	/**
	 * Atributo de instancia tipo UsuarioDTO para definir la propiedad usuario.
	 */
	private UsuarioDTO iud_usuarioDto;

	/**
	 * Obtiene el valor para la propiedad id configuracion formulario dto.
	 *
	 * @return El valor de la propiedad id configuracion formulario dto
	 */
	public ConfiguracionFormularioDTO getIcf_idConfiguracionFormularioDto() {
		return icf_idConfiguracionFormularioDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id configuracion formulario dto.
	 *
	 * @param acf_idConfiguracionFormularioDto el nuevo valor para la propiedad id
	 *                                         configuracion formulario dto
	 */
	public void setIcf_idConfiguracionFormularioDto(ConfiguracionFormularioDTO acf_idConfiguracionFormularioDto) {
		this.icf_idConfiguracionFormularioDto = acf_idConfiguracionFormularioDto;
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

}