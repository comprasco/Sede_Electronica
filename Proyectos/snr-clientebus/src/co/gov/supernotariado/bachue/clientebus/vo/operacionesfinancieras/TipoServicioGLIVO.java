/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: TipoServicioGLIVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.operacionesfinancieras
 * Nombre del elemento: TipoServicioGLIVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.vo.operacionesfinancieras;

import java.io.Serializable;
import java.util.List;

/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Tipo servicio GLI .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoServicioGLIVO implements Serializable {

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
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * cantidad solicitada.
	 */
	private String is_cantidadSolicitada;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * valor servicio.
	 */
	private String is_valorServicio;
	
	/**
	 * Atributo de instancia tipo lista de TipoCriterioGLIVO para definir la
	 * propiedad criterios.
	 */
	private List<TipoCriterioGLIVO> iltc_criterios;

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
	 * Obtiene el valor para la propiedad cantidad solicitada.
	 *
	 * @return El valor de la propiedad cantidad solicitada
	 */
	public String getIs_cantidadSolicitada() {
		return is_cantidadSolicitada;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad cantidad solicitada.
	 *
	 * @param as_cantidadSolicitada el nuevo valor para la propiedad cantidad
	 *                              solicitada
	 */
	public void setIs_cantidadSolicitada(String as_cantidadSolicitada) {
		this.is_cantidadSolicitada = as_cantidadSolicitada;
	}
	
	/**
	 * Obtiene el valor para la propiedad valor servicio.
	 *
	 * @return El valor de la propiedad valor servicio
	 */
	public String getIs_valorServicio() {
		return is_valorServicio;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad valor servicio.
	 *
	 * @param as_valorServicio el nuevo valor para la propiedad valor servicio
	 */
	public void setIs_valorServicio(String as_valorServicio) {
		this.is_valorServicio = as_valorServicio;
	}
	
	/**
	 * Obtiene el valor para la propiedad criterios.
	 *
	 * @return El valor de la propiedad criterios
	 */
	public List<TipoCriterioGLIVO> getIltc_criterios() {
		return iltc_criterios;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad criterios.
	 *
	 * @param iltc_criterios el nuevo valor para la propiedad criterios
	 */
	public void setIltc_criterios(List<TipoCriterioGLIVO> iltc_criterios) {
		this.iltc_criterios = iltc_criterios;
	}

}
