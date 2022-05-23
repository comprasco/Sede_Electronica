/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: IntervinienteVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.consultardatosregistrales
 * Nombre del elemento: IntervinienteVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.vo.consultardatosregistrales;

import co.gov.supernotariado.bachue.clientebus.vo.GenericoVO;

/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Interviniente .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class IntervinienteVO extends GenericoVO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo identificacion interviniente.
	 */
	private String is_tipoIdentificacionInterviniente;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * identificacion interviniente.
	 */
	private String is_identificacionInterviniente;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * primer nombre interviniente.
	 */
	private String is_primerNombreInterviniente;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * segundo nombre interviniente.
	 */
	private String is_segundoNombreInterviniente;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * primer apellido interviniente.
	 */
	private String is_primerApellidoInterviniente;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * segundo apellido interviniente.
	 */
	private String is_segundoApellidoInterviniente;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * rol.
	 */
	private String is_rol;
	
	/**
	 * Obtiene el valor para la propiedad tipo identificacion interviniente.
	 *
	 * @return El valor de la propiedad tipo identificacion interviniente
	 */
	public String getIs_tipoIdentificacionInterviniente() {
		return is_tipoIdentificacionInterviniente;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad tipo identificacion
	 * interviniente.
	 *
	 * @param as_tipoIdentificacionInterviniente el nuevo valor para la propiedad
	 *                                           tipo identificacion interviniente
	 */
	public void setIs_tipoIdentificacionInterviniente(String as_tipoIdentificacionInterviniente) {
		this.is_tipoIdentificacionInterviniente = as_tipoIdentificacionInterviniente;
	}
	
	/**
	 * Obtiene el valor para la propiedad identificacion interviniente.
	 *
	 * @return El valor de la propiedad identificacion interviniente
	 */
	public String getIs_identificacionInterviniente() {
		return is_identificacionInterviniente;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad identificacion interviniente.
	 *
	 * @param as_identificacionInterviniente el nuevo valor para la propiedad
	 *                                       identificacion interviniente
	 */
	public void setIs_identificacionInterviniente(String as_identificacionInterviniente) {
		this.is_identificacionInterviniente = as_identificacionInterviniente;
	}
	
	/**
	 * Obtiene el valor para la propiedad primer nombre interviniente.
	 *
	 * @return El valor de la propiedad primer nombre interviniente
	 */
	public String getIs_primerNombreInterviniente() {
		return is_primerNombreInterviniente;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad primer nombre interviniente.
	 *
	 * @param as_primerNombreInterviniente el nuevo valor para la propiedad primer
	 *                                     nombre interviniente
	 */
	public void setIs_primerNombreInterviniente(String as_primerNombreInterviniente) {
		this.is_primerNombreInterviniente = as_primerNombreInterviniente;
	}
	
	/**
	 * Obtiene el valor para la propiedad segundo nombre interviniente.
	 *
	 * @return El valor de la propiedad segundo nombre interviniente
	 */
	public String getIs_segundoNombreInterviniente() {
		return is_segundoNombreInterviniente;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad segundo nombre interviniente.
	 *
	 * @param as_segundoNombreInterviniente el nuevo valor para la propiedad segundo
	 *                                      nombre interviniente
	 */
	public void setIs_segundoNombreInterviniente(String as_segundoNombreInterviniente) {
		this.is_segundoNombreInterviniente = as_segundoNombreInterviniente;
	}
	
	/**
	 * Obtiene el valor para la propiedad primer apellido interviniente.
	 *
	 * @return El valor de la propiedad primer apellido interviniente
	 */
	public String getIs_primerApellidoInterviniente() {
		return is_primerApellidoInterviniente;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad primer apellido interviniente.
	 *
	 * @param as_primerApellidoInterviniente el nuevo valor para la propiedad primer
	 *                                       apellido interviniente
	 */
	public void setIs_primerApellidoInterviniente(String as_primerApellidoInterviniente) {
		this.is_primerApellidoInterviniente = as_primerApellidoInterviniente;
	}
	
	/**
	 * Obtiene el valor para la propiedad segundo apellido interviniente.
	 *
	 * @return El valor de la propiedad segundo apellido interviniente
	 */
	public String getIs_segundoApellidoInterviniente() {
		return is_segundoApellidoInterviniente;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad segundo apellido interviniente.
	 *
	 * @param as_segundoApellidoInterviniente el nuevo valor para la propiedad
	 *                                        segundo apellido interviniente
	 */
	public void setIs_segundoApellidoInterviniente(String as_segundoApellidoInterviniente) {
		this.is_segundoApellidoInterviniente = as_segundoApellidoInterviniente;
	}
	
	/**
	 * Obtiene el valor para la propiedad rol.
	 *
	 * @return El valor de la propiedad rol
	 */
	public String getIs_rol() {
		return is_rol;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad rol.
	 *
	 * @param as_rol el nuevo valor para la propiedad rol
	 */
	public void setIs_rol(String as_rol) {
		this.is_rol = as_rol;
	}

}