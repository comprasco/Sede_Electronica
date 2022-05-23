/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: SalidaLogWSDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.pasarelarealpay.wsdto
 * Nombre del elemento: SalidaLogWSDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.pasarelarealpay.wsdto;


import java.io.Serializable;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoDTO;

/**
 * Clase tipo objeto de transferencia de datos para web service (WSDTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y servicios web.
 * <br>
 * Contiene propiedades para representar los datos del objeto Salida log. <br>
 * <em>Nota:</em> En modelos de pasarela el nombre de las variables no aplican
 * el estandar porque es necesario para el mapeo y serializacion al servicio de
 * realpay
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class SalidaLogWSDTO  extends GenericoDTO implements Serializable{

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = -7521574118313446509L;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * code.
	 */
	private String is_code;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tech message.
	 */
	private String is_techMessage;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * type.
	 */
	private String is_type;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * user message.
	 */
	private String is_userMessage;
	
	/**
	 * Obtiene el valor para la propiedad code.
	 *
	 * @return El valor de la propiedad code
	 */
	public String getIs_code() {
		return is_code;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad code.
	 *
	 * @param as_code el nuevo valor para la propiedad code
	 */
	public void setIs_code(String as_code) {
		this.is_code = as_code;
	}
	
	/**
	 * Obtiene el valor para la propiedad tech message.
	 *
	 * @return El valor de la propiedad tech message
	 */
	public String getIs_techMessage() {
		return is_techMessage;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad tech message.
	 *
	 * @param as_techMessage el nuevo valor para la propiedad tech message
	 */
	public void setIs_techMessage(String as_techMessage) {
		this.is_techMessage = as_techMessage;
	}
	
	/**
	 * Obtiene el valor para la propiedad type.
	 *
	 * @return El valor de la propiedad type
	 */
	public String getIs_type() {
		return is_type;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad type.
	 *
	 * @param as_type el nuevo valor para la propiedad type
	 */
	public void setIs_type(String as_type) {
		this.is_type = as_type;
	}
	
	/**
	 * Obtiene el valor para la propiedad user message.
	 *
	 * @return El valor de la propiedad user message
	 */
	public String getIs_userMessage() {
		return is_userMessage;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad user message.
	 *
	 * @param as_userMessage el nuevo valor para la propiedad user message
	 */
	public void setIs_userMessage(String as_userMessage) {
		this.is_userMessage = as_userMessage;
	}
	
}
