/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: PermisoBooleanoDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: PermisoBooleanoDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Permiso booleano.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class PermisoBooleanoDTO extends PermisoDTO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad activo.
	 */
	private Boolean ib_activo;
	
	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad activo
	 * por defecto.
	 */
	private Boolean ib_activoPorDefecto;

	/**
	 * Obtiene el valor para la propiedad activo.
	 *
	 * @return El valor de la propiedad activo
	 */
	public Boolean getIb_activo() {
		return ib_activo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad activo.
	 *
	 * @param ab_activo el nuevo valor para la propiedad activo
	 */
	public void setIb_activo(Boolean ab_activo) {
		this.ib_activo = ab_activo;
	}

	/**
	 * Obtiene el valor para la propiedad activo por defecto.
	 *
	 * @return El valor de la propiedad activo por defecto
	 */
	public Boolean getIb_activoPorDefecto() {
		return ib_activoPorDefecto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad activo por defecto.
	 *
	 * @param ab_activoPorDefecto el nuevo valor para la propiedad activo por
	 *                            defecto
	 */
	public void setIb_activoPorDefecto(Boolean ab_activoPorDefecto) {
		this.ib_activoPorDefecto = ab_activoPorDefecto;
	}

	/**
	 * Construye una nueva instancia/objeto de la clase PermisoBooleanoDTO.
	 */
	public PermisoBooleanoDTO() {
	}

	/**
	 * Construye una nueva instancia/objeto de la clase PermisoBooleanoDTO.
	 *
	 * @param ap_permisoDto el parametro permiso dto
	 */
	public PermisoBooleanoDTO(PermisoDTO ap_permisoDto) {
		this.setIs_id(ap_permisoDto.getIs_id());
		this.setIs_codigoMenu(ap_permisoDto.getIs_codigoMenu());
		this.setIs_descripcion(ap_permisoDto.getIs_descripcion());
		this.setId_fechaCreacion(ap_permisoDto.getId_fechaCreacion());
		this.setId_fechaModificacion(ap_permisoDto.getId_fechaModificacion());
		this.setIs_idUsuarioCreacion(ap_permisoDto.getIs_idUsuarioCreacion());
		this.setIs_idUsuarioModificacion(ap_permisoDto.getIs_idUsuarioModificacion());
		this.setIs_ipCreacion(ap_permisoDto.getIs_ipCreacion());
		this.setIs_ipModificacion(ap_permisoDto.getIs_ipModificacion());
		this.setIs_nombre(ap_permisoDto.getIs_nombre());
		this.setIs_nombreLargo(ap_permisoDto.getIs_nombreLargo());
		this.setIs_activo(ap_permisoDto.getIs_activo());
		this.setIs_activoPorDefecto(ap_permisoDto.getIs_activoPorDefecto());
		this.setIs_estereotipoCreacion(ap_permisoDto.getIs_estereotipoCreacion());
		this.setIs_estereotipoModificacion(ap_permisoDto.getIs_estereotipoModificacion());
	}
}
