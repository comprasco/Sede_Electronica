/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TipoEntradaGenerarSolicitudWSDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto
 * Nombre del elemento: TipoEntradaGenerarSolicitudWSDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto;

import java.util.List;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoDTO;

/**
 * Clase tipo objeto de transferencia de datos para web service (WSDTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y servicios web.
 * <br>
 * Contiene propiedades para representar los datos del objeto Tipo entrada
 * generar solicitud.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoEntradaGenerarSolicitudWSDTO extends GenericoDTO {

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
	 * Atributo de instancia tipo TipoSolicitanteGSIWSDTO para definir la propiedad
	 * solicitante.
	 */
	private TipoSolicitanteGSIWSDTO itsgv_solicitante;
	
	/**
	 * Atributo de instancia tipo lista de TipoServicioGSIWSDTO para definir la
	 * propiedad servicios.
	 */
	private List<TipoServicioGSIWSDTO> iltsgw_servicios;

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
	 * Obtiene el valor para la propiedad solicitante.
	 *
	 * @return El valor de la propiedad solicitante
	 */
	public TipoSolicitanteGSIWSDTO getItsgv_solicitante() {
		return itsgv_solicitante;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad solicitante.
	 *
	 * @param atsgv_solicitante el nuevo valor para la propiedad solicitante
	 */
	public void setItsgv_solicitante(TipoSolicitanteGSIWSDTO atsgv_solicitante) {
		this.itsgv_solicitante = atsgv_solicitante;
	}

	/**
	 * Obtiene el valor para la propiedad servicios.
	 *
	 * @return El valor de la propiedad servicios
	 */
	public List<TipoServicioGSIWSDTO> getIltsgw_servicios() {
		return iltsgw_servicios;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad servicios.
	 *
	 * @param altsgw_servicios el nuevo valor para la propiedad servicios
	 */
	public void setIltsgw_servicios(List<TipoServicioGSIWSDTO> altsgw_servicios) {
		this.iltsgw_servicios = altsgw_servicios;
	}

}
