/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: AnotacionesCanceladasVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.estadojuridicofolio
 * Nombre del elemento: AnotacionesCanceladasVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.vo.estadojuridicofolio;

import co.gov.supernotariado.bachue.clientebus.vo.GenericoVO;

/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Anotaciones canceladas .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class AnotacionesCanceladasVO extends GenericoVO
{
	
	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * anotacion cancelada.
	 */
	private String is_anotacionCancelada;

	/**
	 * Obtiene el valor para la propiedad anotacion cancelada.
	 *
	 * @return El valor de la propiedad anotacion cancelada
	 */
	public String getIs_anotacionCancelada() {
		return is_anotacionCancelada;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad anotacion cancelada.
	 *
	 * @param as_anotacionCancelada el nuevo valor para la propiedad anotacion
	 *                              cancelada
	 */
	public void setIs_anotacionCancelada(String as_anotacionCancelada) {
		this.is_anotacionCancelada = as_anotacionCancelada;
	}
}
