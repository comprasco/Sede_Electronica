/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TrazabilidadEntradaWSDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto
 * Nombre del elemento: TrazabilidadEntradaWSDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto;

/**
 * Clase tipo objeto de transferencia de datos para web service (WSDTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y servicios web.
 * <br>
 * Contiene propiedades para representar los datos del objeto Trazabilidad
 * entrada.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TrazabilidadEntradaWSDTO {

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * modulo.
	 */
	private String is_modulo;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * criterio busqueda.
	 */
	private String is_criterioBusqueda;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * valor criterio busqueda.
	 */
	private String is_valorCriterioBusqueda;
	
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
	 * Obtiene el valor para la propiedad criterio busqueda.
	 *
	 * @return El valor de la propiedad criterio busqueda
	 */
	public String getIs_criterioBusqueda() {
		return is_criterioBusqueda;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad criterio busqueda.
	 *
	 * @param as_criterioBusqueda el nuevo valor para la propiedad criterio busqueda
	 */
	public void setIs_criterioBusqueda(String as_criterioBusqueda) {
		this.is_criterioBusqueda = as_criterioBusqueda;
	}
	
	/**
	 * Obtiene el valor para la propiedad valor criterio busqueda.
	 *
	 * @return El valor de la propiedad valor criterio busqueda
	 */
	public String getIs_valorCriterioBusqueda() {
		return is_valorCriterioBusqueda;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad valor criterio busqueda.
	 *
	 * @param as_valorCriterioBusqueda el nuevo valor para la propiedad valor
	 *                                 criterio busqueda
	 */
	public void setIs_valorCriterioBusqueda(String as_valorCriterioBusqueda) {
		this.is_valorCriterioBusqueda = as_valorCriterioBusqueda;
	}	
	
	

}
