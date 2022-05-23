/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: AsociacionUsuarioEntidadEspecialBooleanoDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: AsociacionUsuarioEntidadEspecialBooleanoDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Asociacion usuario
 * entidad especial booleano.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class AsociacionUsuarioEntidadEspecialBooleanoDTO extends AsociacionUsuarioEntidadEspecialDTO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad estado
	 * asociacion.
	 */
	private Boolean ib_estadoAsociacion;

	// builders

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * AsociacionUsuarioEntidadEspecialBooleanoDTO.
	 */
	public AsociacionUsuarioEntidadEspecialBooleanoDTO() {
	}

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * AsociacionUsuarioEntidadEspecialBooleanoDTO.
	 *
	 * @param aauee_asociarEntidadEspecial el parametro asociar entidad especial
	 */
	public AsociacionUsuarioEntidadEspecialBooleanoDTO(
			AsociacionUsuarioEntidadEspecialDTO aauee_asociarEntidadEspecial) {
		setIs_idAsociacion(aauee_asociarEntidadEspecial.getIs_idAsociacion());
		setIs_activo(aauee_asociarEntidadEspecial.getIs_activo());
		setIs_celular(aauee_asociarEntidadEspecial.getIs_celular());
		setIs_confirmacionUsuario(aauee_asociarEntidadEspecial.getIs_confirmacionUsuario());
		setIs_correoElectronico(aauee_asociarEntidadEspecial.getIs_correoElectronico());
		setIs_estado(aauee_asociarEntidadEspecial.getIs_estado());
		setId_fechaCreacion(aauee_asociarEntidadEspecial.getId_fechaCreacion());
		setId_fechaModificacion(aauee_asociarEntidadEspecial.getId_fechaModificacion());
		setIs_idUsuarioCreacion(aauee_asociarEntidadEspecial.getIs_idUsuarioCreacion());
		setIs_idUsuarioModificacion(aauee_asociarEntidadEspecial.getIs_idUsuarioModificacion());
		setIs_estereotipoCreacion(aauee_asociarEntidadEspecial.getIs_estereotipoCreacion());
		setIs_estereotipoModificacion(aauee_asociarEntidadEspecial.getIs_estereotipoModificacion());
		setIs_ipCreacion(aauee_asociarEntidadEspecial.getIs_ipCreacion());
		setIs_ipModificacion(aauee_asociarEntidadEspecial.getIs_ipModificacion());
		setIee_entidadEspecial(aauee_asociarEntidadEspecial.getIee_entidadEspecial());
		setIu_usuarioDto(aauee_asociarEntidadEspecial.getIu_usuarioDto());
		setIu_usuarioNatural(aauee_asociarEntidadEspecial.getIu_usuarioNatural());
	}

	/**
	 * Obtiene el valor para la propiedad estado asociacion.
	 *
	 * @return El valor de la propiedad estado asociacion
	 */
	// getters and setters
	public Boolean getIb_estadoAsociacion() {
		return ib_estadoAsociacion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad estado asociacion.
	 *
	 * @param ib_estadoAsociacion el nuevo valor para la propiedad estado asociacion
	 */
	public void setIb_estadoAsociacion(Boolean ib_estadoAsociacion) {
		this.ib_estadoAsociacion = ib_estadoAsociacion;
	}

}
