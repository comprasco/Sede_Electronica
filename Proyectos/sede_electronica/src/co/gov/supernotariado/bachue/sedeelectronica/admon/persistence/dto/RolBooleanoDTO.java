/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: RolBooleanoDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: RolBooleanoDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Rol booleano.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class RolBooleanoDTO extends RolDTO {

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

	// builders

	/**
	 * Construye una nueva instancia/objeto de la clase RolBooleanoDTO.
	 */
	public RolBooleanoDTO() {
	}

	/**
	 * Construye una nueva instancia/objeto de la clase RolBooleanoDTO.
	 *
	 * @param ar_rolDto el parametro rol dto
	 */
	public RolBooleanoDTO(RolDTO ar_rolDto) {
		this.is_descripcion = ar_rolDto.is_descripcion;
		this.is_activoPorDefecto = ar_rolDto.is_activoPorDefecto;
		this.is_nombre = ar_rolDto.is_nombre;
		this.is_nombreLargo = ar_rolDto.is_nombreLargo;
		this.ilrp_rolPermisosDto = ar_rolDto.ilrp_rolPermisosDto;
		this.ilur_usuarioRolsDto = ar_rolDto.ilur_usuarioRolsDto;
		
		this.setIs_id(ar_rolDto.getIs_id());
		this.setId_fechaCreacion(ar_rolDto.getId_fechaCreacion());
		this.setId_fechaModificacion(ar_rolDto.getId_fechaModificacion());
		this.setIs_idUsuarioCreacion(ar_rolDto.getIs_idUsuarioCreacion());
		this.setIs_idUsuarioModificacion(ar_rolDto.getIs_idUsuarioModificacion());	
		this.setIs_activo(ar_rolDto.getIs_activo());
		this.setIs_ipCreacion(ar_rolDto.getIs_ipCreacion());
		this.setIs_ipModificacion(ar_rolDto.getIs_ipModificacion());
		this.setIs_estereotipoCreacion(ar_rolDto.getIs_estereotipoCreacion());
		this.setIs_estereotipoModificacion(ar_rolDto.getIs_estereotipoModificacion());
	}

	// getters and setters

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

}
