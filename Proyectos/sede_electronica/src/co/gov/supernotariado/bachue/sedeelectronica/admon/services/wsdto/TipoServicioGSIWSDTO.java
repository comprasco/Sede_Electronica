/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TipoServicioGSIWSDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto
 * Nombre del elemento: TipoServicioGSIWSDTO
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
 * Contiene propiedades para representar los datos del objeto Tipo servicio GSI.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoServicioGSIWSDTO extends GenericoDTO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo servicio.
	 */
	private String is_tipoServicio;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad sub
	 * tipo servicio.
	 */
	private String is_subTipoServicio;
	
	/**
	 * Atributo de instancia tipo lista de TipoCriterioWSDTO para definir la
	 * propiedad tipo criterio.
	 */
	private List<TipoCriterioWSDTO> iltc_tipoCriterio;

	/**
	 * Obtiene el valor para la propiedad tipo servicio.
	 *
	 * @return El valor de la propiedad tipo servicio
	 */
	public String getIs_tipoServicio() {
		return is_tipoServicio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo servicio.
	 *
	 * @param as_tipoServicio el nuevo valor para la propiedad tipo servicio
	 */
	public void setIs_tipoServicio(String as_tipoServicio) {
		this.is_tipoServicio = as_tipoServicio;
	}

	/**
	 * Obtiene el valor para la propiedad sub tipo servicio.
	 *
	 * @return El valor de la propiedad sub tipo servicio
	 */
	public String getIs_subTipoServicio() {
		return is_subTipoServicio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad sub tipo servicio.
	 *
	 * @param as_subTipoServicio el nuevo valor para la propiedad sub tipo servicio
	 */
	public void setIs_subTipoServicio(String as_subTipoServicio) {
		this.is_subTipoServicio = as_subTipoServicio;
	}
	
	/**
	 * Obtiene el valor para la propiedad tipo criterio.
	 *
	 * @return El valor de la propiedad tipo criterio
	 */
	public List<TipoCriterioWSDTO> getIltc_tipoCriterio() {
		return iltc_tipoCriterio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo criterio.
	 *
	 * @param altc_tipoCriterio el nuevo valor para la propiedad tipo criterio
	 */
	public void setIltc_tipoCriterio(List<TipoCriterioWSDTO> altc_tipoCriterio) {
		this.iltc_tipoCriterio = altc_tipoCriterio;
	}

}
