package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Transaccion
 * interposicion recursos.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TransaccionInterposicionRecursosDto extends TransaccionSinPagoGenericaDTO {

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
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * solicitante.
	 */
	private String is_solicitante;
	
	/**
	 * Atributo de instancia tipo cadena caracteres para definir la propiedad
	 * interposicion de recurso.
	 */
	private String is_interposicionRecursos;
	
	private String is_observaciones;
	
	public TransaccionInterposicionRecursosDto() {
		//Constructor vacio
	}
	
	/**
	 * Constructor con los datos de la transaccion sin pago
	 * 
	 * @param atspg_transaccionSinPagoGenreicaDto
	 */
	public TransaccionInterposicionRecursosDto(TransaccionSinPagoGenericaDTO atspg_transaccionSinPagoGenreicaDto) {
		this.setIeessp_enumEstadoSolicitudSinPago(atspg_transaccionSinPagoGenreicaDto.getIeessp_enumEstadoSolicitudSinPago());
		this.setIlst_soportesTransaccionCargadosDto(atspg_transaccionSinPagoGenreicaDto.getIlst_soportesTransaccionCargadosDto());
		this.setIp_personaDto(atspg_transaccionSinPagoGenreicaDto.getIp_personaDto());
		this.setIs_nir(atspg_transaccionSinPagoGenreicaDto.getIs_nir());
		this.setItp_tipoProcesoDto(atspg_transaccionSinPagoGenreicaDto.getItp_tipoProcesoDto());
		this.setIs_modeloTransaccionRecuperado(atspg_transaccionSinPagoGenreicaDto.getIs_modeloTransaccionRecuperado());
		this.setIdc_detalleCatalgoDto(atspg_transaccionSinPagoGenreicaDto.getIdc_detalleCatalgoDto());
	}

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
	
	/**
	 * Obtiene el valor para la propiedad interposicion de recursos.
	 *
	 * @return El valor de la propiedad interposicion de recursos
	 */
	public String getIs_interposicionRecursos() {
		return is_interposicionRecursos;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad interposicion de recursos.
	 *
	 * @param as_interposicionRecursos el nuevo valor para la propiedad interposicion de recursos
	 */
	public void setIs_interposicionRecursos(String as_interposicionRecursos) {
		this.is_interposicionRecursos = as_interposicionRecursos;
	}

	public String getIs_observaciones() {
		return is_observaciones;
	}

	public void setIs_observaciones(String as_observaciones) {
		this.is_observaciones = as_observaciones;
	}
}
