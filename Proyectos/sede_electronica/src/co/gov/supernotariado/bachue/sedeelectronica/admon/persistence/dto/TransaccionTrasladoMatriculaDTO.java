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

import java.util.List;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Transaccion
 * traslado matricula.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TransaccionTrasladoMatriculaDTO extends TransaccionSinPagoGenericaDTO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo TrasladoMatriculaDTO para definir los datos del traslado matricula.
	 */
	private TrasladoMatriculaDTO itm_trasladoMatriculaDto;
	
	/**
	 * Atributo de instancia tipo Lista CirculoRegistralDTO para definir los datos del circulo registral de destino
	 */
	private List<CirculoRegistralDTO> ilcr_listaCirculoRegistralDestinoDto;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * solicitante.
	 */
	private String is_solicitante;
	
	public TransaccionTrasladoMatriculaDTO() {
		//Constructor vacio
	}
	
	/**
	 * Constructor con los datos de la transaccion sin pago
	 * 
	 * @param atspg_transaccionSinPagoGenreicaDto
	 */
	public TransaccionTrasladoMatriculaDTO(TransaccionSinPagoGenericaDTO atspg_transaccionSinPagoGenreicaDto) {
		this.setIeessp_enumEstadoSolicitudSinPago(atspg_transaccionSinPagoGenreicaDto.getIeessp_enumEstadoSolicitudSinPago());
		this.setIlst_soportesTransaccionCargadosDto(atspg_transaccionSinPagoGenreicaDto.getIlst_soportesTransaccionCargadosDto());
		this.setIp_personaDto(atspg_transaccionSinPagoGenreicaDto.getIp_personaDto());
		this.setIs_nir(atspg_transaccionSinPagoGenreicaDto.getIs_nir());
		this.setItp_tipoProcesoDto(atspg_transaccionSinPagoGenreicaDto.getItp_tipoProcesoDto());
		this.setIs_modeloTransaccionRecuperado(atspg_transaccionSinPagoGenreicaDto.getIs_modeloTransaccionRecuperado());
	}
	
	/**
	 * Obtiene el valor para la propiedad traslado matricula dto.
	 *
	 * @return El valor de la propiedad traslado matricula dto
	 */
	public TrasladoMatriculaDTO getItm_trasladoMatriculaDto() {
		return itm_trasladoMatriculaDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad traslado matricula dto.
	 *
	 * @param atm_trasladoMatriculaDto el nuevo valor para la propiedad traslado matricula dto
	 */
	public void setItm_trasladoMatriculaDto(TrasladoMatriculaDTO atm_trasladoMatriculaDto) {
		this.itm_trasladoMatriculaDto = atm_trasladoMatriculaDto;
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
	 * @param as_solicitante el nuevo valor para la propiedad 
	 * 														solicitante
	 */
	public void setIs_solicitante(String as_solicitante) {
		this.is_solicitante = as_solicitante;
	}
	
	/**
	 * Obtiene el valor de la lista de circulos registrales del destino
	 *
	 * @return El valor de la lista de circulos registrales del destino
	 */
	public List<CirculoRegistralDTO> getIlcr_listaCirculoRegistralDestinoDto() {
		return ilcr_listaCirculoRegistralDestinoDto;
	}
	
	/**
	 * Cambia/actualiza el valor para la lista de circulos registrales del destino
	 *
	 * @param alcr_listaCirculoRegistralDestinoDto el nuevo valor para la lista de circulos registrales del destino
	 */
	public void setIlcr_listaCirculoRegistralDestinoDto(List<CirculoRegistralDTO> alcr_listaCirculoRegistralDestinoDto) {
		this.ilcr_listaCirculoRegistralDestinoDto = alcr_listaCirculoRegistralDestinoDto;
	}
}
