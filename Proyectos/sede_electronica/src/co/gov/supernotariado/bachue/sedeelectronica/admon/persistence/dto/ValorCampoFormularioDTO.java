/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ValorCampoFormularioDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: ValorCampoFormularioDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Valor campo
 * formulario.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ValorCampoFormularioDTO extends GenericoBaseDTO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo ValorCampoFormularioPKDTO para definir la
	 * propiedad id valor campo formulario.
	 */
	private ValorCampoFormularioPKDTO ivcfp_idValorCampoFormularioDto;
	
	/**
	 * Atributo de instancia tipo ConfiguracionCampoDTO para definir la propiedad id
	 * configuracion campo.
	 */
	private ConfiguracionCampoDTO icc_idConfiguracionCampo;
	
	/**
	 * Atributo de instancia tipo ConfiguracionFormularioDTO para definir la
	 * propiedad id configuracion formulario.
	 */
	private ConfiguracionFormularioDTO icf_idConfiguracionFormulario;
	
	/**
	 * Atributo de instancia tipo FormularioUsuarioDTO para definir la propiedad id
	 * formulario usuario.
	 */
	private FormularioUsuarioDTO ifu_idFormularioUsuario;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * valor.
	 */
	private String is_valor;

	/**
	 * Obtiene el valor para la propiedad id configuracion campo.
	 *
	 * @return El valor de la propiedad id configuracion campo
	 */
	public ConfiguracionCampoDTO getIcc_idConfiguracionCampo() {
		return icc_idConfiguracionCampo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id configuracion campo.
	 *
	 * @param acc_idConfiguracionCampo el nuevo valor para la propiedad id
	 *                                 configuracion campo
	 */
	public void setIcc_idConfiguracionCampo(ConfiguracionCampoDTO acc_idConfiguracionCampo) {
		this.icc_idConfiguracionCampo = acc_idConfiguracionCampo;
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
	 * Obtiene el valor para la propiedad id formulario usuario.
	 *
	 * @return El valor de la propiedad id formulario usuario
	 */
	public FormularioUsuarioDTO getIfu_idFormularioUsuario() {
		return ifu_idFormularioUsuario;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id formulario usuario.
	 *
	 * @param afu_idFormularioUsuario el nuevo valor para la propiedad id formulario
	 *                                usuario
	 */
	public void setIfu_idFormularioUsuario(FormularioUsuarioDTO afu_idFormularioUsuario) {
		this.ifu_idFormularioUsuario = afu_idFormularioUsuario;
	}

	/**
	 * Obtiene el valor para la propiedad valor.
	 *
	 * @return El valor de la propiedad valor
	 */
	public String getIs_valor() {
		return is_valor;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad valor.
	 *
	 * @param as_valor el nuevo valor para la propiedad valor
	 */
	public void setIs_valor(String as_valor) {
		this.is_valor = as_valor;
	}

	/**
	 * Obtiene el valor para la propiedad id valor campo formulario dto.
	 *
	 * @return El valor de la propiedad id valor campo formulario dto
	 */
	public ValorCampoFormularioPKDTO getIvcfp_idValorCampoFormularioDto() {
		return ivcfp_idValorCampoFormularioDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id valor campo formulario dto.
	 *
	 * @param avcfp_idValorCampoFormularioDto el nuevo valor para la propiedad id
	 *                                        valor campo formulario dto
	 */
	public void setIvcfp_idValorCampoFormularioDto(ValorCampoFormularioPKDTO avcfp_idValorCampoFormularioDto) {
		this.ivcfp_idValorCampoFormularioDto = avcfp_idValorCampoFormularioDto;
	}

}