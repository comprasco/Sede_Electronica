/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TransaccionCorreccionDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: TransaccionCorreccionDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Transaccion
 * suspension temporal.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TransaccionSuspensionTemporalDTO extends TransaccionSinPagoGenericaDTO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo SuspensionTemporalDTO para definir la propiedad
	 * suspensiones.
	 */
	private SuspensionDTO is_suspensionDto;
	

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * solicitante.
	 */
	private String is_solicitante;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * observaciones.
	 */
	private String is_observaciones;
	
	
	public TransaccionSuspensionTemporalDTO() {
		//Constructor vacio
	}
	
	/**
	 * Constructor con los datos de la transaccion sin pago
	 * 
	 * @param atspg_transaccionSinPagoGenreicaDto
	 */
	public TransaccionSuspensionTemporalDTO(TransaccionSinPagoGenericaDTO atspg_transaccionSinPagoGenreicaDto) {
		this.setIeessp_enumEstadoSolicitudSinPago(atspg_transaccionSinPagoGenreicaDto.getIeessp_enumEstadoSolicitudSinPago());
		this.setIlst_soportesTransaccionCargadosDto(atspg_transaccionSinPagoGenreicaDto.getIlst_soportesTransaccionCargadosDto());
		this.setIp_personaDto(atspg_transaccionSinPagoGenreicaDto.getIp_personaDto());
		this.setIs_nir(atspg_transaccionSinPagoGenreicaDto.getIs_nir());
		this.setItp_tipoProcesoDto(atspg_transaccionSinPagoGenreicaDto.getItp_tipoProcesoDto());
		this.setIs_modeloTransaccionRecuperado(atspg_transaccionSinPagoGenreicaDto.getIs_modeloTransaccionRecuperado());
		this.setIdc_detalleCatalgoDto(atspg_transaccionSinPagoGenreicaDto.getIdc_detalleCatalgoDto());
	}
	
	/**
	 * Obtiene el valor para la propiedad suspension temporal dto.
	 *
	 * @return El valor de la propiedad suspension temporal dto
	 */
	public SuspensionDTO getIs_suspensionDto() {
		return is_suspensionDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad suspension dto.
	 *
	 * @param ast_suspensionTemporalDto el nuevo valor para la propiedad suspension dto
	 */
	public void setIs_suspensionDto(SuspensionDTO as_suspensionDTO) {
		this.is_suspensionDto = as_suspensionDTO;
	}
	/**
	 * Atributo de instancia tipo SeguimientoSolicitudesRespuestaDTO para definir la
	 * propiedad seguimiento solicitudes respuesta.
	 */
	private SeguimientoSolicitudesRespuestaDTO issr_seguimientoSolicitudesRespuestaDto;

	/**
	 * Obtiene el valor para la propiedad seguimiento solicitudes respuesta dto.
	 *
	 * @return El valor de la propiedad seguimiento solicitudes respuesta dto
	 */
	public SeguimientoSolicitudesRespuestaDTO getIssr_seguimientoSolicitudesRespuestaDto() {
		return issr_seguimientoSolicitudesRespuestaDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad seguimiento solicitudes respuesta dto.
	 *
	 * @param assr_seguimientoSolicitudesRespuestaDto el nuevo valor para la propiedad seguimiento solicitudes respuesta dto
	 */
	public void setIssr_seguimientoSolicitudesRespuestaDto(SeguimientoSolicitudesRespuestaDTO assr_seguimientoSolicitudesRespuestaDto) {
		this.issr_seguimientoSolicitudesRespuestaDto = assr_seguimientoSolicitudesRespuestaDto;
	}
	


	public String getIs_observaciones() {
		return is_observaciones;
	}

	public void setIs_observaciones(String as_observaciones) {
		this.is_observaciones = as_observaciones;
	}

	public String getIs_solicitante() {
		return is_solicitante;
	}

	public void setIs_solicitante(String as_solicitante) {
		this.is_solicitante = as_solicitante;
	}

	
}
	

