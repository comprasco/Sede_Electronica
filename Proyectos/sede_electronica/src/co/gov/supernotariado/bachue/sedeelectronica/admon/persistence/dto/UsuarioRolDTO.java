/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: UsuarioRolDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: UsuarioRolDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

import java.io.Serializable;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Usuario rol.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class UsuarioRolDTO extends GenericoBaseDTO implements Serializable {
	
	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

/**
 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
 * activo defecto.
 */
// --- Atributos
	private String is_activoDefecto;
	
	/**
	 * Atributo de instancia tipo RolDTO para definir la propiedad rol.
	 */
	private RolDTO ir_rolDto;
	
	/**
	 * Atributo de instancia tipo UsuarioDTO para definir la propiedad usuario.
	 */
	private UsuarioDTO iu_usuarioDto;

/**
 * Construye una nueva instancia/objeto de la clase UsuarioRolDTO.
 */
// --- Constructor
	public UsuarioRolDTO() {
		// Metodo constructor vacio para modelo DTO
	}

// --- Getters-Setters

	/**
 * Obtiene el valor para la propiedad rol dto.
 *
 * @return El valor de la propiedad rol dto
 */
public RolDTO getIr_rolDto() {
		return ir_rolDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad rol dto.
	 *
	 * @param ar_rolDto el nuevo valor para la propiedad rol dto
	 */
	public void setIr_rolDto(RolDTO ar_rolDto) {
		this.ir_rolDto = ar_rolDto;
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

	/**
	 * Obtiene el valor para la propiedad activo defecto.
	 *
	 * @return El valor de la propiedad activo defecto
	 */
	public String getIs_activoDefecto() {
		return is_activoDefecto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad activo defecto.
	 *
	 * @param as_activoDefecto el nuevo valor para la propiedad activo defecto
	 */
	public void setIs_activoDefecto(String as_activoDefecto) {
		this.is_activoDefecto = as_activoDefecto;
	}

	/**
	 * Obtiene el valor para la propiedad serialversionuid.
	 *
	 * @return El valor de la propiedad serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
