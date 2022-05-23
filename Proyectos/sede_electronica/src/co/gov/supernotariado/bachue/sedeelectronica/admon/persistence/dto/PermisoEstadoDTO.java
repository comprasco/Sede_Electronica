/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: PermisoEstadoDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: PermisoEstadoDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Permiso estado.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class PermisoEstadoDTO extends GenericoDTO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad estado.
	 */
	private Boolean ib_estado;
	
	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad
	 * editable.
	 */
	private Boolean ib_editable;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * activo defecto.
	 */
	private String is_activoDefecto;

	/**
	 * Atributo de instancia tipo PermisoBooleanoDTO para definir la propiedad
	 * permiso booleano.
	 */
	private PermisoBooleanoDTO ipb_permisoBooleanoDto;

	/**
	 * Construye una nueva instancia/objeto de la clase PermisoEstadoDTO.
	 */
	public PermisoEstadoDTO() {
	}

	/**
	 * Construye una nueva instancia/objeto de la clase PermisoEstadoDTO.
	 *
	 * @param as_activoDefecto el parametro activo defecto
	 * @param ab_editable      el parametro editable
	 * @param ab_estado        el parametro estado
	 */
	public PermisoEstadoDTO(String as_activoDefecto, Boolean ab_editable, Boolean ab_estado) {
		this.ib_editable = ab_editable;
		this.is_activoDefecto = as_activoDefecto;
		this.ib_estado = ab_estado;
	}

	/**
	 * Construye una nueva instancia/objeto de la clase PermisoEstadoDTO.
	 *
	 * @param as_activoDefecto       el parametro activo defecto
	 * @param ab_editable            el parametro editable
	 * @param ab_estado              el parametro estado
	 * @param apb_permisoBooleanoDto el parametro permiso booleano dto
	 */
	public PermisoEstadoDTO(String as_activoDefecto, Boolean ab_editable, Boolean ab_estado,
			PermisoBooleanoDTO apb_permisoBooleanoDto) {
		this.ib_editable = ab_editable;
		this.is_activoDefecto = as_activoDefecto;
		this.ib_estado = ab_estado;
		this.ipb_permisoBooleanoDto = apb_permisoBooleanoDto;
	}

	/**
	 * Obtiene el valor para la propiedad estado.
	 *
	 * @return El valor de la propiedad estado
	 */
	public Boolean getIb_estado() {
		return ib_estado;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad estado.
	 *
	 * @param ab_estado el nuevo valor para la propiedad estado
	 */
	public void setIb_estado(Boolean ab_estado) {
		this.ib_estado = ab_estado;
	}

	/**
	 * Obtiene el valor para la propiedad permiso booleano dto.
	 *
	 * @return El valor de la propiedad permiso booleano dto
	 */
	public PermisoBooleanoDTO getIpb_permisoBooleanoDto() {
		return ipb_permisoBooleanoDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad permiso booleano dto.
	 *
	 * @param apb_permisoBooleanoDto el nuevo valor para la propiedad permiso
	 *                               booleano dto
	 */
	public void setIpb_permisoBooleanoDto(PermisoBooleanoDTO apb_permisoBooleanoDto) {
		this.ipb_permisoBooleanoDto = apb_permisoBooleanoDto;
	}

	/**
	 * Obtiene el valor para la propiedad editable.
	 *
	 * @return El valor de la propiedad editable
	 */
	public Boolean getIb_editable() {
		return ib_editable;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad editable.
	 *
	 * @param ab_editable el nuevo valor para la propiedad editable
	 */
	public void setIb_editable(Boolean ab_editable) {
		this.ib_editable = ab_editable;
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
}
