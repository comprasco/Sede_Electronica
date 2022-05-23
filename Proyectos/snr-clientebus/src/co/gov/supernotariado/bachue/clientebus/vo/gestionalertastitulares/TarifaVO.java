/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: TarifaVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.gestionalertastitulares
 * Nombre del elemento: TarifaVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.vo.gestionalertastitulares;

import co.gov.supernotariado.bachue.clientebus.vo.GenericoVO;

/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Tarifa .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TarifaVO extends GenericoVO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * rango.
	 */
	private String is_rango;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * valor.
	 */
	private String is_valor;
	
	/**
	 * Obtiene el valor para la propiedad rango.
	 *
	 * @return El valor de la propiedad rango
	 */
	public String getIs_rango() {
		return is_rango;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad rango.
	 *
	 * @param as_rango el nuevo valor para la propiedad rango
	 */
	public void setIs_rango(String as_rango) {
		this.is_rango = as_rango;
	}
	
	/**
	 * Obtiene el valor para la propiedad valor.
	 *
	 * @return El valor de la propiedad valor
	 */
	public String getIs_valor() {
		return is_valor;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad valor.
	 *
	 * @param as_valor el nuevo valor para la propiedad valor
	 */
	public void setIs_valor(String as_valor) {
		this.is_valor = as_valor;
	}
}
