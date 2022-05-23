/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TipoServicioCTSIWSDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto
 * Nombre del elemento: TipoServicioCTSIWSDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto;

import java.io.Serializable;
import java.util.List;

/**
 * Clase tipo objeto de transferencia de datos para web service (WSDTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y servicios web.
 * <br>
 * Contiene propiedades para representar los datos del objeto Tipo servicio
 * CTSI.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoServicioCTSIWSDTO implements Serializable{

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
	 * Atributo de instancia tipo lista de TipoCriterioCTSIWSDTO para definir la
	 * propiedad criterios.
	 */
	private List<TipoCriterioCTSIWSDTO> iltc_criterios;

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
	 * Obtiene el valor para la propiedad criterios.
	 *
	 * @return El valor de la propiedad criterios
	 */
	public List<TipoCriterioCTSIWSDTO> getIltc_criterios() {
		return iltc_criterios;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad criterios.
	 *
	 * @param altc_criterios el nuevo valor para la propiedad criterios
	 */
	public void setIltc_criterios(List<TipoCriterioCTSIWSDTO> altc_criterios) {
		this.iltc_criterios = altc_criterios;
	}
	

}
