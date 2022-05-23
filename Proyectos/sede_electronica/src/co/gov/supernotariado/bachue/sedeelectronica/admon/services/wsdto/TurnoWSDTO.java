/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TurnoWSDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto
 * Nombre del elemento: TurnoWSDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto;

import java.io.Serializable;

/**
 * Clase tipo objeto de transferencia de datos para web service (WSDTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y servicios web.
 * <br>
 * Contiene propiedades para representar los datos del objeto Turno.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TurnoWSDTO implements Serializable{

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
