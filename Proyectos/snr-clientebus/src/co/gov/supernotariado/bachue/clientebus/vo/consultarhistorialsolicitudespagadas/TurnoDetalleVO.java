/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: TurnoDetalleVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.consultarhistorialsolicitudespagadas
 * Nombre del elemento: TurnoDetalleVO
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
 * Turno detalle .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TurnoDetalleVO extends GenericoVO
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
	 * turno.
	 */
	private String is_turno;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * descripcion servicio.
	 */
	private String is_descripcionServicio;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * descricion sub servicio.
	 */
	private String is_descricionSubServicio;
	
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
	 * Obtiene el valor para la propiedad turno.
	 *
	 * @return El valor de la propiedad turno
	 */
	public String getIs_turno() {
		return is_turno;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad turno.
	 *
	 * @param as_turno el nuevo valor para la propiedad turno
	 */
	public void setIs_turno(String as_turno) {
		this.is_turno = as_turno;
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
	 * Obtiene el valor para la propiedad descricion sub servicio.
	 *
	 * @return El valor de la propiedad descricion sub servicio
	 */
	public String getIs_descricionSubServicio() {
		return is_descricionSubServicio;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad descricion sub servicio.
	 *
	 * @param as_descricionSubServicio el nuevo valor para la propiedad descricion
	 *                                 sub servicio
	 */
	public void setIs_descricionSubServicio(String as_descricionSubServicio) {
		this.is_descricionSubServicio = as_descricionSubServicio;
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