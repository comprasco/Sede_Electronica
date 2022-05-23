/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: CarritoTransaccionVigenteDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: CarritoTransaccionVigenteDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Carrito
 * transaccion vigente.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class CarritoTransaccionVigenteDTO extends CarritoDTO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo TransaccionIndividualDTO para definir la propiedad
	 * transaccion individual.
	 */
	private TransaccionIndividualDTO iti_transaccionIndividualDto;

	/**
	 * Atributo de instancia tipo TransaccionMasivoDTO para definir la propiedad
	 * transaccion masivo.
	 */
	private TransaccionMasivoDTO itm_transaccionMasivoDto;

	/**
	 * Atributo de instancia tipo TransaccionCopiasDTO para definir la propiedad
	 * transaccion copias.
	 */
	private TransaccionCopiasDTO itc_transaccionCopiasDto;

	/**
	 * Atributo de instancia tipo SolicitudConsultasDTO para definir la propiedad
	 * solicitud consultas dto.
	 */
	private SolicitudConsultasDTO isc_solicitudConsultasDto;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre sub servicio legible.
	 */
	private String is_nombreSubServicioLegible;
	// Builders

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * CarritoTransaccionVigenteDTO.
	 */
	public CarritoTransaccionVigenteDTO() {

	}

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * CarritoTransaccionVigenteDTO.
	 *
	 * @param ac_carritoDto el parametro carrito dto
	 */
	public CarritoTransaccionVigenteDTO(CarritoDTO ac_carritoDto) {
		this.setIs_id(ac_carritoDto.getIs_id());
		this.setIs_modeloTransaccionVigente(ac_carritoDto.getIs_modeloTransaccionVigente());
		this.setIs_codigoTipoServicio(ac_carritoDto.getIs_codigoTipoServicio());
		this.setIs_codigoTipoSubServicio(ac_carritoDto.getIs_codigoTipoSubServicio());
		this.setIs_modo(ac_carritoDto.getIs_modo());
		this.setIs_activo(ac_carritoDto.getIs_activo());
		this.setId_fechaModificacion(ac_carritoDto.getId_fechaModificacion());
		this.setIs_ipModificacion(ac_carritoDto.getIs_ipModificacion());
		this.setIs_idUsuarioModificacion(ac_carritoDto.getIs_idUsuarioModificacion());
		this.setId_fechaCreacion(ac_carritoDto.getId_fechaCreacion());
		this.setIs_ipCreacion(ac_carritoDto.getIs_ipCreacion());
		this.setIs_idUsuarioCreacion(ac_carritoDto.getIs_idUsuarioCreacion());
		this.setItp_tipoProcesoDto(ac_carritoDto.getItp_tipoProcesoDto());
		this.setIs_uuidUrlCarrito(ac_carritoDto.getIs_uuidUrlCarrito());
		this.setIu_usuarioDto(ac_carritoDto.getIu_usuarioDto());
		this.setIs_estereotipoCreacion(ac_carritoDto.getIs_estereotipoCreacion());
		this.setIs_estereotipoModificacion(ac_carritoDto.getIs_estereotipoModificacion());
	}

	// Getters & Setters

	/**
	 * Obtiene el valor para la propiedad transaccion individual dto.
	 *
	 * @return El valor de la propiedad transaccion individual dto
	 */
	public TransaccionIndividualDTO getIti_transaccionIndividualDto() {
		return iti_transaccionIndividualDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad transaccion individual dto.
	 *
	 * @param ati_transaccionIndividualDto el nuevo valor para la propiedad
	 *                                     transaccion individual dto
	 */
	public void setIti_transaccionIndividualDto(TransaccionIndividualDTO ati_transaccionIndividualDto) {
		this.iti_transaccionIndividualDto = ati_transaccionIndividualDto;
	}

	/**
	 * Obtiene el valor para la propiedad transaccion masivo dto.
	 *
	 * @return El valor de la propiedad transaccion masivo dto
	 */
	public TransaccionMasivoDTO getItm_transaccionMasivoDto() {
		return itm_transaccionMasivoDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad transaccion masivo dto.
	 *
	 * @param atm_transaccionMasivoDto el nuevo valor para la propiedad transaccion
	 *                                 masivo dto
	 */
	public void setItm_transaccionMasivoDto(TransaccionMasivoDTO atm_transaccionMasivoDto) {
		this.itm_transaccionMasivoDto = atm_transaccionMasivoDto;
	}

	/**
	 * Obtiene el valor para la propiedad nombre sub servicio legible.
	 *
	 * @return El valor de la propiedad nombre sub servicio legible
	 */
	public String getIs_nombreSubServicioLegible() {
		return is_nombreSubServicioLegible;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nombre sub servicio legible.
	 *
	 * @param as_nombreSubServicioLegible el nuevo valor para la propiedad nombre
	 *                                    sub servicio legible
	 */
	public void setIs_nombreSubServicioLegible(String as_nombreSubServicioLegible) {
		this.is_nombreSubServicioLegible = as_nombreSubServicioLegible;
	}

	/**
	 * Obtiene el valor para la propiedad transaccion copias dto.
	 *
	 * @return El valor de la propiedad transaccion copias dto
	 */
	public TransaccionCopiasDTO getItc_transaccionCopiasDto() {
		return itc_transaccionCopiasDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad transaccion copias dto.
	 *
	 * @param atc_transaccionCopiasDto el nuevo valor para la propiedad transaccion
	 *                                 copias dto
	 */
	public void setItc_transaccionCopiasDto(TransaccionCopiasDTO atc_transaccionCopiasDto) {
		this.itc_transaccionCopiasDto = atc_transaccionCopiasDto;
	}

	public SolicitudConsultasDTO getIsc_solicitudConsultasDto() {
		return isc_solicitudConsultasDto;
	}

	public void setIsc_solicitudConsultasDto(SolicitudConsultasDTO asc_solicitudConsultasDto) {
		this.isc_solicitudConsultasDto = asc_solicitudConsultasDto;
	}

}
