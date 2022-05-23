/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: GenerarSolicitudEntradaDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: GenerarSolicitudEntradaDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

import java.util.List;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Generar solicitud
 * entrada.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */

public class GenerarSolicitudEntradaDTO extends GenericoDTO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * modulo.
	 */
	private String is_modulo;
	
	/**
	 * Atributo de instancia tipo SolicitanteEntradaDTO para definir la propiedad
	 * solicitante entrada.
	 */
	private SolicitanteEntradaDTO ise_solicitanteEntradaDto;
	
	/**
	 * Atributo de instancia tipo lista de TipoServicioGSIDTO para definir la
	 * propiedad tipo servicio.
	 */
	private List<TipoServicioGSIDTO> ilts_tipoServicio;

	/**
	 * Obtiene el valor para la propiedad modulo.
	 *
	 * @return El valor de la propiedad modulo
	 */
	public String getIs_modulo() {
		return is_modulo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad modulo.
	 *
	 * @param as_modulo el nuevo valor para la propiedad modulo
	 */
	public void setIs_modulo(String as_modulo) {
		this.is_modulo = as_modulo;
	}

	/**
	 * Obtiene el valor para la propiedad solicitante entrada dto.
	 *
	 * @return El valor de la propiedad solicitante entrada dto
	 */
	public SolicitanteEntradaDTO getIse_solicitanteEntradaDto() {
		return ise_solicitanteEntradaDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad solicitante entrada dto.
	 *
	 * @param ase_solicitanteEntradaDto el nuevo valor para la propiedad solicitante
	 *                                  entrada dto
	 */
	public void setIse_solicitanteEntradaDto(SolicitanteEntradaDTO ase_solicitanteEntradaDto) {
		this.ise_solicitanteEntradaDto = ase_solicitanteEntradaDto;
	}

	/**
	 * Obtiene el valor para la propiedad tipo servicio.
	 *
	 * @return El valor de la propiedad tipo servicio
	 */
	public List<TipoServicioGSIDTO> getIlts_tipoServicio() {
		return ilts_tipoServicio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo servicio.
	 *
	 * @param alts_tipoServicio el nuevo valor para la propiedad tipo servicio
	 */
	public void setIlts_tipoServicio(List<TipoServicioGSIDTO> alts_tipoServicio) {
		this.ilts_tipoServicio = alts_tipoServicio;
	}

}
