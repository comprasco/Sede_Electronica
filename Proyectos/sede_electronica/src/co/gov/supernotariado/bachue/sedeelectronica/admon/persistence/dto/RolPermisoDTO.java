/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: RolPermisoDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: RolPermisoDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

import java.io.Serializable;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Rol permiso.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class RolPermisoDTO extends GenericoBaseDTO implements Serializable {
	
	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

/**
 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
 * activo por defecto.
 */
// --- Atributos
	private String is_activoPorDefecto;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * editable.
	 */
	private String is_editable;
	
	/**
	 * Atributo de instancia tipo PermisoDTO para definir la propiedad permiso.
	 */
	private PermisoDTO ip_permisoDto;
	
	/**
	 * Atributo de instancia tipo RolDTO para definir la propiedad rol.
	 */
	private RolDTO ir_rolDto;

/**
 * Construye una nueva instancia/objeto de la clase RolPermisoDTO.
 */
// --- Constructor
	public RolPermisoDTO() {
		// Metodo constructor vacio para modelo DTO
	}

	// --- Getters-Setters

	/**
	 * Obtiene el valor para la propiedad activo por defecto.
	 *
	 * @return El valor de la propiedad activo por defecto
	 */
	public String getIs_activoPorDefecto() {
		return is_activoPorDefecto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad activo por defecto.
	 *
	 * @param as_activoPorDefecto el nuevo valor para la propiedad activo por
	 *                            defecto
	 */
	public void setIs_activoPorDefecto(String as_activoPorDefecto) {
		this.is_activoPorDefecto = as_activoPorDefecto;
	}

	/**
	 * Obtiene el valor para la propiedad editable.
	 *
	 * @return El valor de la propiedad editable
	 */
	public String getIs_editable() {
		return is_editable;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad editable.
	 *
	 * @param as_editable el nuevo valor para la propiedad editable
	 */
	public void setIs_editable(String as_editable) {
		this.is_editable = as_editable;
	}

	/**
	 * Obtiene el valor para la propiedad permiso dto.
	 *
	 * @return El valor de la propiedad permiso dto
	 */
	public PermisoDTO getIp_permisoDto() {
		return ip_permisoDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad permiso dto.
	 *
	 * @param ap_permisoDto el nuevo valor para la propiedad permiso dto
	 */
	public void setIp_permisoDto(PermisoDTO ap_permisoDto) {
		this.ip_permisoDto = ap_permisoDto;
	}

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
	 * Obtiene el valor para la propiedad serialversionuid.
	 *
	 * @return El valor de la propiedad serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
