/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: AsociacionUsuarioPersonaJuridicaBooleanoDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: AsociacionUsuarioPersonaJuridicaBooleanoDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Asociacion usuario
 * persona juridica booleano.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class AsociacionUsuarioPersonaJuridicaBooleanoDTO extends AsociacionUsuarioPersonaJuridicaDTO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad estado
	 * asociacion.
	 */
	private Boolean ib_estadoAsociacion;
	
	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad estado
	 * cuenta cupo.
	 */
	private Boolean ib_estadoCuentaCupo;


	// builders

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * AsociacionUsuarioPersonaJuridicaBooleanoDTO.
	 */
	public AsociacionUsuarioPersonaJuridicaBooleanoDTO() {
	}

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * AsociacionUsuarioPersonaJuridicaBooleanoDTO.
	 *
	 * @param aaupj_asociarPersonaJuridicaDto el parametro asociar persona juridica
	 *                                        dto
	 */
	public AsociacionUsuarioPersonaJuridicaBooleanoDTO(
		AsociacionUsuarioPersonaJuridicaDTO aaupj_asociarPersonaJuridicaDto) {
		setIs_idAsociacion(aaupj_asociarPersonaJuridicaDto.getIs_idAsociacion());
		setIs_activo(aaupj_asociarPersonaJuridicaDto.getIs_activo());
		setIs_celularCorporativo(aaupj_asociarPersonaJuridicaDto.getIs_celularCorporativo());
		setIs_confirmacionUsuario(aaupj_asociarPersonaJuridicaDto.getIs_confirmacionUsuario());
		setIs_correoElectronicoCorporativo(aaupj_asociarPersonaJuridicaDto.getIs_correoElectronicoCorporativo());
		setIs_estadoAsociacion(aaupj_asociarPersonaJuridicaDto.getIs_estadoAsociacion());
		setIs_estadoCuentaCupo(aaupj_asociarPersonaJuridicaDto.getIs_estadoCuentaCupo());
		setId_fechaCreacion(aaupj_asociarPersonaJuridicaDto.getId_fechaCreacion());
		setId_fechaModificacion(aaupj_asociarPersonaJuridicaDto.getId_fechaModificacion());
		setIs_idPersonaJuridica(aaupj_asociarPersonaJuridicaDto.getIs_idPersonaJuridica());
		setIs_idUsuarioPersonaNatural(aaupj_asociarPersonaJuridicaDto.getIs_idUsuarioPersonaNatural());
		setIs_idUsuarioCreacion(aaupj_asociarPersonaJuridicaDto.getIs_idUsuarioCreacion());
		setIs_idUsuarioModificacion(aaupj_asociarPersonaJuridicaDto.getIs_idUsuarioModificacion());
		setIs_ipCreacion(aaupj_asociarPersonaJuridicaDto.getIs_ipCreacion());
		setIs_ipModificacion(aaupj_asociarPersonaJuridicaDto.getIs_ipModificacion());
		setIpj_idPersonaJuridica(aaupj_asociarPersonaJuridicaDto.getIpj_idPersonaJuridica());
		setIu_usuarioDto(aaupj_asociarPersonaJuridicaDto.getIu_usuarioDto());
		setIs_estereotipoCreacion(aaupj_asociarPersonaJuridicaDto.getIs_estereotipoCreacion());
		setIs_estereotipoModificacion(aaupj_asociarPersonaJuridicaDto.getIs_estereotipoModificacion());
	}

	// getters and setters

	/**
	 * Obtiene el valor para la propiedad estado asociacion.
	 *
	 * @return El valor de la propiedad estado asociacion
	 */
	public Boolean getIb_estadoAsociacion() {
		return ib_estadoAsociacion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad estado asociacion.
	 *
	 * @param ab_estadoAsociacion el nuevo valor para la propiedad estado asociacion
	 */
	public void setIb_estadoAsociacion(Boolean ab_estadoAsociacion) {
		this.ib_estadoAsociacion = ab_estadoAsociacion;
	}

	/**
	 * Obtiene el valor para la propiedad estado cuenta cupo.
	 *
	 * @return El valor de la propiedad estado cuenta cupo
	 */
	public Boolean getIb_estadoCuentaCupo() {
		return ib_estadoCuentaCupo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad estado cuenta cupo.
	 *
	 * @param ab_estadoCuentaCupo el nuevo valor para la propiedad estado cuenta
	 *                            cupo
	 */
	public void setIb_estadoCuentaCupo(Boolean ab_estadoCuentaCupo) {
		this.ib_estadoCuentaCupo = ab_estadoCuentaCupo;
	}


}
