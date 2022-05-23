/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: TurnoVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.entregaproducto
 * Nombre del elemento: TurnoVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.vo.entregaproducto;

import co.gov.supernotariado.bachue.clientebus.vo.GenericoVO;

/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Turno .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TurnoVO extends GenericoVO{

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * identificador turno.
	 */
	private String is_identificadorTurno;
	
	/**
	 * Obtiene el valor para la propiedad identificador turno.
	 *
	 * @return El valor de la propiedad identificador turno
	 */
	public String getIs_identificadorTurno() {
		return is_identificadorTurno;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad identificador turno.
	 *
	 * @param as_identificadorTurno el nuevo valor para la propiedad identificador
	 *                              turno
	 */
	public void setIs_identificadorTurno(String as_identificadorTurno) {
		this.is_identificadorTurno = as_identificadorTurno;
	}
}
