/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TransaccionServicioRegistralDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: TransaccionServicioRegistralDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Transaccion
 * Servicio Registral
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TransaccionServicioRegistralDTO extends TransaccionSinPagoGenericaDTO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * solicitante.
	 */
	private String is_solicitante;
	
	public TransaccionServicioRegistralDTO() {
		//Constructor vacio
	}
	
	/**
	 * Constructor con los datos de la transaccion sin pago
	 * 
	 * @param atspg_transaccionSinPagoGenreicaDto
	 */
	public TransaccionServicioRegistralDTO(TransaccionSinPagoGenericaDTO atspg_transaccionSinPagoGenreicaDto) {
		this.setIeessp_enumEstadoSolicitudSinPago(atspg_transaccionSinPagoGenreicaDto.getIeessp_enumEstadoSolicitudSinPago());
		this.setIlst_soportesTransaccionCargadosDto(atspg_transaccionSinPagoGenreicaDto.getIlst_soportesTransaccionCargadosDto());
		this.setIp_personaDto(atspg_transaccionSinPagoGenreicaDto.getIp_personaDto());
		this.setIs_nir(atspg_transaccionSinPagoGenreicaDto.getIs_nir());
		this.setItp_tipoProcesoDto(atspg_transaccionSinPagoGenreicaDto.getItp_tipoProcesoDto());
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
	
	/**
	 * Obtiene el valor para la propiedad solicitante.
	 *
	 * @return El valor de la propiedad solicitante
	 */
	public String getIs_solicitante() {
		return is_solicitante;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad solicitante.
	 *
	 * @param as_nupre el nuevo valor para la propiedad solicitante
	 */
	public void setIs_solicitante(String as_solicitante) {
		this.is_solicitante = as_solicitante;
	}
	
}
	

