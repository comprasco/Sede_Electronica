/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TipoServicioGSIDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: TipoServicioGSIDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

import java.util.List;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Tipo servicio GSI.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoServicioGSIDTO extends GenericoDTO {

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
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * subtipo servicio.
	 */
	private String is_subtipoServicio;
	
	/**
	 * Atributo de instancia tipo lista de TipoCriterioDTO para definir la propiedad
	 * tipo criterio.
	 */
	private List<TipoCriterioDTO> iltc_tipoCriterio;

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
	 * Obtiene el valor para la propiedad subtipo servicio.
	 *
	 * @return El valor de la propiedad subtipo servicio
	 */
	public String getIs_subtipoServicio() {
		return is_subtipoServicio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad subtipo servicio.
	 *
	 * @param as_subtipoServicio el nuevo valor para la propiedad subtipo servicio
	 */
	public void setIs_subtipoServicio(String as_subtipoServicio) {
		this.is_subtipoServicio = as_subtipoServicio;
	}

	/**
	 * Obtiene el valor para la propiedad tipo criterio.
	 *
	 * @return El valor de la propiedad tipo criterio
	 */
	public List<TipoCriterioDTO> getIltc_tipoCriterio() {
		return iltc_tipoCriterio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo criterio.
	 *
	 * @param altc_tipoCriterio el nuevo valor para la propiedad tipo criterio
	 */
	public void setIltc_tipoCriterio(List<TipoCriterioDTO> altc_tipoCriterio) {
		this.iltc_tipoCriterio = altc_tipoCriterio;
	}

}
