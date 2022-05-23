/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TipoEntradaConsultarEstadoSolicitudWSDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto
 * Nombre del elemento: TipoEntradaConsultarEstadoSolicitudWSDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoDTO;

/**
 * Clase tipo objeto de transferencia de datos para web service (WSDTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y servicios web.
 * <br>
 * Contiene propiedades para representar los datos del objeto Tipo entrada
 * consultar estado solicitud.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoEntradaConsultarEstadoSolicitudWSDTO extends GenericoDTO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * TipoEntradaConsultarEstadoSolicitudWSDTO.
	 */
	public TipoEntradaConsultarEstadoSolicitudWSDTO() {
		// Metodo constructor
	}

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * modulo.
	 */
	private String is_modulo;
	
	/**
	 * Atributo de instancia tipo TipoSolicitanteCESIWSDTO para definir la propiedad
	 * solicitante.
	 */
	private TipoSolicitanteCESIWSDTO itsc_solicitante;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nir.
	 */
	private String is_nir;

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
	public TipoSolicitanteCESIWSDTO getItsc_solicitante() {
		return itsc_solicitante;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad solicitante.
	 *
	 * @param atsc_solicitante el nuevo valor para la propiedad solicitante
	 */
	public void setItsc_solicitante(TipoSolicitanteCESIWSDTO atsc_solicitante) {
		this.itsc_solicitante = atsc_solicitante;
	}

	/**
	 * Obtiene el valor para la propiedad nir.
	 *
	 * @return El valor de la propiedad nir
	 */
	public String getIs_nir() {
		return is_nir;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nir.
	 *
	 * @param as_nir el nuevo valor para la propiedad nir
	 */
	public void setIs_nir(String as_nir) {
		this.is_nir = as_nir;
	}

}