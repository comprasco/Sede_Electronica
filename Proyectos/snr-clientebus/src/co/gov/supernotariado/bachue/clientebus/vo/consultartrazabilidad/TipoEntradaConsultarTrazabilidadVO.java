/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: TipoEntradaConsultarTrazabilidadVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.consultartrazabilidad
 * Nombre del elemento: TipoEntradaConsultarTrazabilidadVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.vo.consultartrazabilidad;

import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;

/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Tipo entrada consultar trazabilidad .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoEntradaConsultarTrazabilidadVO extends ClienteIntegracionVO{

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * criterio busqueda.
	 */
	private String is_criterioBusqueda;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * modulo.
	 */
	private String is_modulo;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * valor criterio busqueda.
	 */
	private String is_valorCriterioBusqueda;
	
	/**
	 * Obtiene el valor para la propiedad criterio busqueda.
	 *
	 * @return El valor de la propiedad criterio busqueda
	 */
	public String getIs_criterioBusqueda() {
		return is_criterioBusqueda;
	}
	
	/**
	 * Obtiene el valor para la propiedad modulo.
	 *
	 * @return El valor de la propiedad modulo
	 */
	public String getIs_modulo() {
		return is_modulo;
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
	 * Cambia/actualiza el valor para la propiedad criterio busqueda.
	 *
	 * @param as_criterioBusqueda el nuevo valor para la propiedad criterio busqueda
	 */
	public void setIs_criterioBusqueda(String as_criterioBusqueda) {
		this.is_criterioBusqueda = as_criterioBusqueda;
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
	 * Cambia/actualiza el valor para la propiedad valor criterio busqueda.
	 *
	 * @param as_valorCriterioBusqueda el nuevo valor para la propiedad valor
	 *                                 criterio busqueda
	 */
	public void setIs_valorCriterioBusqueda(String as_valorCriterioBusqueda) {
		this.is_valorCriterioBusqueda = as_valorCriterioBusqueda;
	}	
	
	

}
