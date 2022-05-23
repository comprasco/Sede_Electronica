/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: InteresadoVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.solicitudcorreccion
 * Nombre del elemento: InteresadoVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.vo.solicitudcorreccion;

import co.gov.supernotariado.bachue.clientebus.vo.GenericoVO;

/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Interesado .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class InteresadoVO extends GenericoVO{

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo documento persona.
	 */
	private String is_tipoDocumentoPersona;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero documento persona.
	 */
	private String is_numDocumentoPersona;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * primer nombre.
	 */
	private String is_primerNombre;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * segundo nombre.
	 */
	private String is_segundoNombre;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * primer apellido.
	 */
	private String is_primerApellido;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * segundo apellido.
	 */
	private String is_segundoApellido;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo genero.
	 */
	private String is_codGenero;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * email.
	 */
	private String is_email;
	
	/**
	 * Obtiene el valor para la propiedad tipo documento persona.
	 *
	 * @return El valor de la propiedad tipo documento persona
	 */
	public String getIs_tipoDocumentoPersona() {
		return is_tipoDocumentoPersona;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad tipo documento persona.
	 *
	 * @param as_tipoDocumentoPersona el nuevo valor para la propiedad tipo
	 *                                documento persona
	 */
	public void setIs_tipoDocumentoPersona(String as_tipoDocumentoPersona) {
		this.is_tipoDocumentoPersona = as_tipoDocumentoPersona;
	}
	
	/**
	 * Obtiene el valor para la propiedad numero documento persona.
	 *
	 * @return El valor de la propiedad numero documento persona
	 */
	public String getIs_numDocumentoPersona() {
		return is_numDocumentoPersona;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad numero documento persona.
	 *
	 * @param as_numDocumentoPersona el nuevo valor para la propiedad numero
	 *                               documento persona
	 */
	public void setIs_numDocumentoPersona(String as_numDocumentoPersona) {
		this.is_numDocumentoPersona = as_numDocumentoPersona;
	}
	
	/**
	 * Obtiene el valor para la propiedad primer nombre.
	 *
	 * @return El valor de la propiedad primer nombre
	 */
	public String getIs_primerNombre() {
		return is_primerNombre;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad primer nombre.
	 *
	 * @param as_primerNombre el nuevo valor para la propiedad primer nombre
	 */
	public void setIs_primerNombre(String as_primerNombre) {
		this.is_primerNombre = as_primerNombre;
	}
	
	/**
	 * Obtiene el valor para la propiedad segundo nombre.
	 *
	 * @return El valor de la propiedad segundo nombre
	 */
	public String getIs_segundoNombre() {
		return is_segundoNombre;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad segundo nombre.
	 *
	 * @param as_segundoNombre el nuevo valor para la propiedad segundo nombre
	 */
	public void setIs_segundoNombre(String as_segundoNombre) {
		this.is_segundoNombre = as_segundoNombre;
	}
	
	/**
	 * Obtiene el valor para la propiedad primer apellido.
	 *
	 * @return El valor de la propiedad primer apellido
	 */
	public String getIs_primerApellido() {
		return is_primerApellido;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad primer apellido.
	 *
	 * @param as_primerApellido el nuevo valor para la propiedad primer apellido
	 */
	public void setIs_primerApellido(String as_primerApellido) {
		this.is_primerApellido = as_primerApellido;
	}
	
	/**
	 * Obtiene el valor para la propiedad segundo apellido.
	 *
	 * @return El valor de la propiedad segundo apellido
	 */
	public String getIs_segundoApellido() {
		return is_segundoApellido;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad segundo apellido.
	 *
	 * @param as_segundoApellido el nuevo valor para la propiedad segundo apellido
	 */
	public void setIs_segundoApellido(String as_segundoApellido) {
		this.is_segundoApellido = as_segundoApellido;
	}
	
	/**
	 * Obtiene el valor para la propiedad codigo genero.
	 *
	 * @return El valor de la propiedad codigo genero
	 */
	public String getIs_codGenero() {
		return is_codGenero;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad codigo genero.
	 *
	 * @param as_codGenero el nuevo valor para la propiedad codigo genero
	 */
	public void setIs_codGenero(String as_codGenero) {
		this.is_codGenero = as_codGenero;
	}
	
	/**
	 * Obtiene el valor para la propiedad email.
	 *
	 * @return El valor de la propiedad email
	 */
	public String getIs_email() {
		return is_email;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad email.
	 *
	 * @param as_email el nuevo valor para la propiedad email
	 */
	public void setIs_email(String as_email) {
		this.is_email = as_email;
	}
	
}
