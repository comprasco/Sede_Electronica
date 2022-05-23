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
 * correccion.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TransaccionCorreccionDTO extends TransaccionSinPagoGenericaDTO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo CorreccionesDTO para definir la propiedad
	 * correcciones.
	 */
	private CorreccionesDTO ic_correccionesDto;
	
	public TransaccionCorreccionDTO() {
		//Constructor vacio
	}
	
	/**
	 * Constructor con los datos de la transaccion sin pago
	 * 
	 * @param atspg_transaccionSinPagoGenreicaDto
	 */
	public TransaccionCorreccionDTO(TransaccionSinPagoGenericaDTO atspg_transaccionSinPagoGenreicaDto) {
		this.setIeessp_enumEstadoSolicitudSinPago(atspg_transaccionSinPagoGenreicaDto.getIeessp_enumEstadoSolicitudSinPago());
		this.setIlst_soportesTransaccionCargadosDto(atspg_transaccionSinPagoGenreicaDto.getIlst_soportesTransaccionCargadosDto());
		this.setIp_personaDto(atspg_transaccionSinPagoGenreicaDto.getIp_personaDto());
		this.setIs_nir(atspg_transaccionSinPagoGenreicaDto.getIs_nir());
		this.setItp_tipoProcesoDto(atspg_transaccionSinPagoGenreicaDto.getItp_tipoProcesoDto());
		this.setIs_modeloTransaccionRecuperado(atspg_transaccionSinPagoGenreicaDto.getIs_modeloTransaccionRecuperado());
	}
	
	/**
	 * Obtiene el valor para la propiedad correcciones dto.
	 *
	 * @return El valor de la propiedad correcciones dto
	 */
	public CorreccionesDTO getIc_correccionesDto() {
		return ic_correccionesDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad correcciones dto.
	 *
	 * @param ac_correccionesDto el nuevo valor para la propiedad correcciones dto
	 */
	public void setIc_correccionesDto(CorreccionesDTO ac_correccionesDto) {
		this.ic_correccionesDto = ac_correccionesDto;
	}

}
