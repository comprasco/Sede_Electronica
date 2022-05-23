/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TransaccionProrrogaDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: TransaccionProrrogaDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Transaccion
 * Prorroga.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TransaccionProrrogaDTO extends TransaccionSinPagoGenericaDTO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo SeguimientoSolicitudesRespuestaDTO para definir la
	 * propiedad seguimiento solicitudes respuesta.
	 */
	private SeguimientoSolicitudesRespuestaDTO issr_seguimientoSolicitudesRespuestaDto;
	
	/**
	 * Atributo de instancia tipo ProrrogaDTO para definir la propiedad
	 * Prorroga.
	 */
	private ProrrogaDTO ip_prorrogaDto;
	
	private String is_observaciones;
	
	/**
	 * Atributo de instancia tipo lista de SoporteProrrogaDTO para definir la
	 * propiedad soporte Prorroga cargado.
	 */
	
	public TransaccionProrrogaDTO(TransaccionSinPagoGenericaDTO atspg_transaccionSinPagoGenreicaDto) {
		this.setIeessp_enumEstadoSolicitudSinPago(atspg_transaccionSinPagoGenreicaDto.getIeessp_enumEstadoSolicitudSinPago());
		this.setIlst_soportesTransaccionCargadosDto(atspg_transaccionSinPagoGenreicaDto.getIlst_soportesTransaccionCargadosDto());
		this.setIp_personaDto(atspg_transaccionSinPagoGenreicaDto.getIp_personaDto());
		this.setIs_nir(atspg_transaccionSinPagoGenreicaDto.getIs_nir());
		this.setItp_tipoProcesoDto(atspg_transaccionSinPagoGenreicaDto.getItp_tipoProcesoDto());
		this.setIdc_detalleCatalgoDto(atspg_transaccionSinPagoGenreicaDto.getIdc_detalleCatalgoDto());
	}

	public ProrrogaDTO getIp_prorrogaDto() {
		return ip_prorrogaDto;
	}

	public void setIp_prorrogaDto(ProrrogaDTO ap_prorrogaDto) {
		this.ip_prorrogaDto = ap_prorrogaDto;
	}

	public SeguimientoSolicitudesRespuestaDTO getIssr_seguimientoSolicitudesRespuestaDto() {
		return issr_seguimientoSolicitudesRespuestaDto;
	}

	public void setIssr_seguimientoSolicitudesRespuestaDto(
			SeguimientoSolicitudesRespuestaDTO assr_seguimientoSolicitudesRespuestaDto) {
		this.issr_seguimientoSolicitudesRespuestaDto = assr_seguimientoSolicitudesRespuestaDto;
	}

	public String getIs_observaciones() {
		return is_observaciones;
	}

	public void setIs_observaciones(String as_observaciones) {
		this.is_observaciones = as_observaciones;
	}

}
