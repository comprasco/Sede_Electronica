/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TransaccionDesistimientoDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: TransaccionDesistimientoDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Transaccion
 * desistimiento.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TransaccionDesistimientoDTO extends TransaccionSinPagoGenericaDTO {

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
	 * Atributo de instancia tipo DesistimientoDTO para definir la propiedad
	 * desistimiento.
	 */
	private DesistimientoDTO id_desistimientoDto;
	
	private String is_observaciones;
	
	private String is_solicitante;
	
	public TransaccionDesistimientoDTO(TransaccionSinPagoGenericaDTO atspg_transaccionSinPagoGenreicaDto) {
		this.setIeessp_enumEstadoSolicitudSinPago(atspg_transaccionSinPagoGenreicaDto.getIeessp_enumEstadoSolicitudSinPago());
		this.setIlst_soportesTransaccionCargadosDto(atspg_transaccionSinPagoGenreicaDto.getIlst_soportesTransaccionCargadosDto());
		this.setIp_personaDto(atspg_transaccionSinPagoGenreicaDto.getIp_personaDto());
		this.setIs_nir(atspg_transaccionSinPagoGenreicaDto.getIs_nir());
		this.setItp_tipoProcesoDto(atspg_transaccionSinPagoGenreicaDto.getItp_tipoProcesoDto());
		this.setIdc_detalleCatalgoDto(atspg_transaccionSinPagoGenreicaDto.getIdc_detalleCatalgoDto());
		this.setIs_modeloTransaccionRecuperado(atspg_transaccionSinPagoGenreicaDto.getIs_modeloTransaccionRecuperado());
	}

	public DesistimientoDTO getId_desistimientoDto() {
		return id_desistimientoDto;
	}

	public void setId_desistimientoDto(DesistimientoDTO ad_desistimientoDto) {
		this.id_desistimientoDto = ad_desistimientoDto;
	}

	public String getIs_solicitante() {
		return is_solicitante;
	}

	public void setIs_solicitante(String as_solicitante) {
		this.is_solicitante = as_solicitante;
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
