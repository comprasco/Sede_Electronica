/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: ListaOficinasOrigenVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.alertatierras
 * Nombre del elemento: ListaOficinasOrigenVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.vo.alertatierras;

import co.gov.supernotariado.bachue.clientebus.vo.GenericoVO;

/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Lista oficinas origen .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ListaOficinasOrigenVO extends GenericoVO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * oficina origen.
	 */
	private String is_oficinaOrigen;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre oficina origen.
	 */
	private String is_nombreOficinaOrigen;

	/**
	 * Obtiene el valor para la propiedad oficina origen.
	 *
	 * @return El valor de la propiedad oficina origen
	 */
	public String getIs_oficinaOrigen() {
		return is_oficinaOrigen;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad oficina origen.
	 *
	 * @param as_oficinaOrigen el nuevo valor para la propiedad oficina origen
	 */
	public void setIs_oficinaOrigen(String as_oficinaOrigen) {
		this.is_oficinaOrigen = as_oficinaOrigen;
	}

	/**
	 * Obtiene el valor para la propiedad nombre oficina origen.
	 *
	 * @return El valor de la propiedad nombre oficina origen
	 */
	public String getIs_nombreOficinaOrigen() {
		return is_nombreOficinaOrigen;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nombre oficina origen.
	 *
	 * @param as_nombreOficinaOrigen el nuevo valor para la propiedad nombre oficina
	 *                               origen
	 */
	public void setIs_nombreOficinaOrigen(String as_nombreOficinaOrigen) {
		this.is_nombreOficinaOrigen = as_nombreOficinaOrigen;
	}

}
