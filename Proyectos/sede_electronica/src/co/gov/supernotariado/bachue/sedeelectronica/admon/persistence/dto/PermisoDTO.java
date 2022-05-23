/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: PermisoDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: PermisoDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

import java.util.List;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Permiso.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class PermisoDTO extends GenericoBaseDTO {
	
	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo menu.
	 */
	// --- Atributos
	private String is_codigoMenu;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * activo por defecto.
	 */
	private String is_activoPorDefecto;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * descripcion.
	 */
	private String is_descripcion;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre.
	 */
	private String is_nombre;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre largo.
	 */
	private String is_nombreLargo;
	
	/**
	 * Atributo de instancia tipo lista de RolPermisoDTO para definir la propiedad
	 * rol permisos.
	 */
	private List<RolPermisoDTO> ilrp_rolPermisosDto;

	/**
	 * Construye una nueva instancia/objeto de la clase PermisoDTO.
	 */
	// --- Constructor
	public PermisoDTO() {
		// Metodo constructor vacio para modelo DTO
	}

	// --- Getters-Setters

	/**
	 * Obtiene el valor para la propiedad codigo menu.
	 *
	 * @return El valor de la propiedad codigo menu
	 */
	public String getIs_codigoMenu() {
		return is_codigoMenu;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad codigo menu.
	 *
	 * @param as_codigoMenu el nuevo valor para la propiedad codigo menu
	 */
	public void setIs_codigoMenu(String as_codigoMenu) {
		this.is_codigoMenu = as_codigoMenu;
	}

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
	 * Obtiene el valor para la propiedad nombre largo.
	 *
	 * @return El valor de la propiedad nombre largo
	 */
	public String getIs_nombreLargo() {
		return is_nombreLargo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nombre largo.
	 *
	 * @param as_nombreLargo el nuevo valor para la propiedad nombre largo
	 */
	public void setIs_nombreLargo(String as_nombreLargo) {
		this.is_nombreLargo = as_nombreLargo;
	}

	/**
	 * Obtiene el valor para la propiedad rol permisos dto.
	 *
	 * @return El valor de la propiedad rol permisos dto
	 */
	public List<RolPermisoDTO> getIlrp_rolPermisosDto() {
		if (this.ilrp_rolPermisosDto == null) {
			this.ilrp_rolPermisosDto = new java.util.ArrayList<>(1);
		}
		return ilrp_rolPermisosDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad rol permisos dto.
	 *
	 * @param alrp_rolPermisosDto el nuevo valor para la propiedad rol permisos dto
	 */
	public void setIlrp_rolPermisosDto(List<RolPermisoDTO> alrp_rolPermisosDto) {
		this.ilrp_rolPermisosDto = alrp_rolPermisosDto;
	}
}
