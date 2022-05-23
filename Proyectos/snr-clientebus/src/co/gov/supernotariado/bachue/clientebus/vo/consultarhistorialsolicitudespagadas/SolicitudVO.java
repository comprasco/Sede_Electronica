/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: SolicitudVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.consultarhistorialsolicitudespagadas
 * Nombre del elemento: SolicitudVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.vo.consultarhistorialsolicitudespagadas;

import co.gov.supernotariado.bachue.clientebus.vo.GenericoVO;

/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Solicitud .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class SolicitudVO extends GenericoVO
{

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nir.
	 */
	private String is_nir;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * descripcion servicio.
	 */
	private String is_descripcionServicio;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * descripcion sub servicio.
	 */
	private String is_descripcionSubServicio;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * fecha servicio.
	 */
	private String is_fechaServicio;
	
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
	
	/**
	 * Obtiene el valor para la propiedad descripcion servicio.
	 *
	 * @return El valor de la propiedad descripcion servicio
	 */
	public String getIs_descripcionServicio() {
		return is_descripcionServicio;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad descripcion servicio.
	 *
	 * @param as_descripcionServicio el nuevo valor para la propiedad descripcion
	 *                               servicio
	 */
	public void setIs_descripcionServicio(String as_descripcionServicio) {
		this.is_descripcionServicio = as_descripcionServicio;
	}
	
	/**
	 * Obtiene el valor para la propiedad descripcion sub servicio.
	 *
	 * @return El valor de la propiedad descripcion sub servicio
	 */
	public String getIs_descripcionSubServicio() {
		return is_descripcionSubServicio;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad descripcion sub servicio.
	 *
	 * @param as_descripcionSubServicio el nuevo valor para la propiedad descripcion
	 *                                  sub servicio
	 */
	public void setIs_descripcionSubServicio(String as_descripcionSubServicio) {
		this.is_descripcionSubServicio = as_descripcionSubServicio;
	}
	
	/**
	 * Obtiene el valor para la propiedad fecha servicio.
	 *
	 * @return El valor de la propiedad fecha servicio
	 */
	public String getIs_fechaServicio() {
		return is_fechaServicio;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad fecha servicio.
	 *
	 * @param as_fechaServicio el nuevo valor para la propiedad fecha servicio
	 */
	public void setIs_fechaServicio(String as_fechaServicio) {
		this.is_fechaServicio = as_fechaServicio;
	}	
}