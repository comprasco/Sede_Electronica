package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

public class TransaccionRecepcionDocumentoDTO extends TransaccionSinPagoGenericaDTO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String is_observaciones;
	private String is_entidadBancaria;
	private String is_tipoCuenta;
	private String is_numCuenta;
	private String is_numDoc;
	private String is_primerNombre;
	private String is_segundoNombre;
	private String is_primerApellido;
	private String is_segundoApellido;
	private String is_razonSocial;
	private String is_motivo;
	private TipoDocumentoDTO itd_tipoDocumentoDto;
	private SeguimientoSolicitudesRespuestaDTO issr_seguimientoSolicitudesRespuestaDto;
	
	/**
	 * Atributo de instancia tipo lista de SoporteDesistimientoDTO para definir la
	 * propiedad soporte desistimiento cargados.
	 */
	
	public TransaccionRecepcionDocumentoDTO(TransaccionSinPagoGenericaDTO atspg_transaccionSinPagoGenreicaDto) {
		this.setIlst_soportesTransaccionCargadosDto(atspg_transaccionSinPagoGenreicaDto.getIlst_soportesTransaccionCargadosDto());
		this.setIp_personaDto(atspg_transaccionSinPagoGenreicaDto.getIp_personaDto());
		this.setIs_nir(atspg_transaccionSinPagoGenreicaDto.getIs_nir());
		this.setIdc_detalleCatalgoDto(atspg_transaccionSinPagoGenreicaDto.getIdc_detalleCatalgoDto());
	}
	
	public String getIs_observaciones() {
		return is_observaciones;
	}
	public void setIs_observaciones(String as_observaciones) {
		this.is_observaciones = as_observaciones;
	}
	public String getIs_entidadBancaria() {
		return is_entidadBancaria;
	}
	public void setIs_entidadBancaria(String as_entidadBancaria) {
		this.is_entidadBancaria = as_entidadBancaria;
	}
	public String getIs_tipoCuenta() {
		return is_tipoCuenta;
	}
	public void setIs_tipoCuenta(String as_tipoCuenta) {
		this.is_tipoCuenta = as_tipoCuenta;
	}
	public String getIs_numCuenta() {
		return is_numCuenta;
	}
	public void setIs_numCuenta(String as_numCuenta) {
		this.is_numCuenta = as_numCuenta;
	}
	public String getIs_numDoc() {
		return is_numDoc;
	}
	public void setIs_numDoc(String as_numDoc) {
		this.is_numDoc = as_numDoc;
	}
	public TipoDocumentoDTO getItd_tipoDocumentoDto() {
		return itd_tipoDocumentoDto;
	}
	public void setItd_tipoDocumentoDto(TipoDocumentoDTO atd_tipoDocumentoDto) {
		this.itd_tipoDocumentoDto = atd_tipoDocumentoDto;
	}

	public SeguimientoSolicitudesRespuestaDTO getIssr_seguimientoSolicitudesRespuestaDto() {
		return issr_seguimientoSolicitudesRespuestaDto;
	}

	public void setIssr_seguimientoSolicitudesRespuestaDto(
			SeguimientoSolicitudesRespuestaDTO assr_seguimientoSolicitudesRespuestaDto) {
		this.issr_seguimientoSolicitudesRespuestaDto = assr_seguimientoSolicitudesRespuestaDto;
	}

	public String getIs_motivo() {
		return is_motivo;
	}

	public void setIs_motivo(String as_motivo) {
		this.is_motivo = as_motivo;
	}

	public String getIs_primerNombre() {
		return is_primerNombre;
	}

	public void setIs_primerNombre(String as_primerNombre) {
		this.is_primerNombre = as_primerNombre;
	}

	public String getIs_segundoNombre() {
		return is_segundoNombre;
	}

	public void setIs_segundoNombre(String as_segundoNombre) {
		this.is_segundoNombre = as_segundoNombre;
	}

	public String getIs_primerApellido() {
		return is_primerApellido;
	}

	public void setIs_primerApellido(String as_primerApellido) {
		this.is_primerApellido = as_primerApellido;
	}

	public String getIs_segundoApellido() {
		return is_segundoApellido;
	}

	public void setIs_segundoApellido(String as_segundoApellido) {
		this.is_segundoApellido = as_segundoApellido;
	}

	public String getIs_razonSocial() {
		return is_razonSocial;
	}

	public void setIs_razonSocial(String as_razonSocial) {
		this.is_razonSocial = as_razonSocial;
	}

}
