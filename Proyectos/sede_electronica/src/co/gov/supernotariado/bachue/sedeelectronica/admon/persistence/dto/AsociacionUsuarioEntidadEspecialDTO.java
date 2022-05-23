/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: AsociacionUsuarioEntidadEspecialDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: AsociacionUsuarioEntidadEspecialDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.interfaces.IAsociacionesDTO;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Asociacion usuario
 * entidad especial.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class AsociacionUsuarioEntidadEspecialDTO extends GenericoBaseDTO implements IAsociacionesDTO {
	
	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad id
	 * asociacion.
	 */
	// --- Atributos
	private String is_idAsociacion;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * celular.
	 */
	private String is_celular;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * confirmacion usuario.
	 */
	private String is_confirmacionUsuario;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * correo electronico.
	 */
	private String is_correoElectronico;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * estado.
	 */
	private String is_estado;
	
	/**
	 * Atributo de instancia tipo EntidadEspecialDTO para definir la propiedad
	 * entidad especial.
	 */
	private EntidadEspecialDTO iee_entidadEspecial;
	
	/**
	 * Atributo de instancia tipo UsuarioDTO para definir la propiedad usuario.
	 */
	private UsuarioDTO iu_usuarioDto;
	
	/**
	 * Atributo de instancia tipo String para definir la propiedad usuario natural.
	 */
	private String iu_usuarioNatural;

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * AsociacionUsuarioEntidadEspecialDTO.
	 */
	// --- Constructor
	public AsociacionUsuarioEntidadEspecialDTO() {
	}

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * AsociacionUsuarioEntidadEspecialDTO.
	 *
	 * @param as_idAsociacion el parametro id asociacion
	 */
	public AsociacionUsuarioEntidadEspecialDTO(String as_idAsociacion) {
		this.is_idAsociacion = as_idAsociacion;

	}

	// --- Getters-Setters

	/**
	 * Obtiene el valor para la propiedad id asociacion.
	 *
	 * @return El valor de la propiedad id asociacion
	 */
	public String getIs_idAsociacion() {
		return is_idAsociacion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id asociacion.
	 *
	 * @param as_idAsociacion el nuevo valor para la propiedad id asociacion
	 */
	public void setIs_idAsociacion(String as_idAsociacion) {
		this.is_idAsociacion = as_idAsociacion;
	}

	/**
	 * Obtiene el valor para la propiedad celular.
	 *
	 * @return El valor de la propiedad celular
	 */
	public String getIs_celular() {
		return is_celular;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad celular.
	 *
	 * @param as_celular el nuevo valor para la propiedad celular
	 */
	public void setIs_celular(String as_celular) {
		this.is_celular = as_celular;
	}

	/**
	 * Obtiene el valor para la propiedad confirmacion usuario.
	 *
	 * @return El valor de la propiedad confirmacion usuario
	 */
	public String getIs_confirmacionUsuario() {
		return is_confirmacionUsuario;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad confirmacion usuario.
	 *
	 * @param as_confirmacionUsuario el nuevo valor para la propiedad confirmacion
	 *                               usuario
	 */
	public void setIs_confirmacionUsuario(String as_confirmacionUsuario) {
		this.is_confirmacionUsuario = as_confirmacionUsuario;
	}

	/**
	 * Obtiene el valor para la propiedad correo electronico.
	 *
	 * @return El valor de la propiedad correo electronico
	 */
	public String getIs_correoElectronico() {
		return is_correoElectronico;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad correo electronico.
	 *
	 * @param as_correoElectronico el nuevo valor para la propiedad correo
	 *                             electronico
	 */
	public void setIs_correoElectronico(String as_correoElectronico) {
		this.is_correoElectronico = as_correoElectronico;
	}

	/**
	 * Obtiene el valor para la propiedad estado.
	 *
	 * @return El valor de la propiedad estado
	 */
	public String getIs_estado() {
		return is_estado;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad estado.
	 *
	 * @param as_estado el nuevo valor para la propiedad estado
	 */
	public void setIs_estado(String as_estado) {
		this.is_estado = as_estado;
	}

	/**
	 * Obtiene el valor para la propiedad entidad especial.
	 *
	 * @return El valor de la propiedad entidad especial
	 */
	public EntidadEspecialDTO getIee_entidadEspecial() {
		return iee_entidadEspecial;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad entidad especial.
	 *
	 * @param aee_entidadEspecial el nuevo valor para la propiedad entidad especial
	 */
	public void setIee_entidadEspecial(EntidadEspecialDTO aee_entidadEspecial) {
		this.iee_entidadEspecial = aee_entidadEspecial;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.interfaces.IAsociacionesDTO#getIu_usuarioDto()
	 */
	@Override
	public UsuarioDTO getIu_usuarioDto() {
		return iu_usuarioDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad usuario dto.
	 *
	 * @param au_usuario el nuevo valor para la propiedad usuario dto
	 */
	public void setIu_usuarioDto(UsuarioDTO au_usuario) {
		this.iu_usuarioDto = au_usuario;
	}

	/**
	 * Obtiene el valor para la propiedad usuario natural.
	 *
	 * @return El valor de la propiedad usuario natural
	 */
	public String getIu_usuarioNatural() {
		return iu_usuarioNatural;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad usuario natural.
	 *
	 * @param au_usuarioNatural el nuevo valor para la propiedad usuario natural
	 */
	public void setIu_usuarioNatural(String au_usuarioNatural) {
		this.iu_usuarioNatural = au_usuarioNatural;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.interfaces.IAsociacionesDTO#getRazonSocial()
	 */
	@Override
	public String getRazonSocial() {
		String ls_razonSocial;
		ls_razonSocial = this.iee_entidadEspecial.getIs_nombreEntidadExterna();
		return ls_razonSocial;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.interfaces.IAsociacionesDTO#getTipoDocumento()
	 */
	@Override
	public String getTipoDocumento() {
		return "";
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.interfaces.IAsociacionesDTO#getNumeroDocumento()
	 */
	@Override
	public String getNumeroDocumento() {
		return "";
	}

}
