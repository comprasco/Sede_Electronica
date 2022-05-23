/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: SalidaCancelacionTransaccionWSDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.pasarelarealpay.wsdto
 * Nombre del elemento: SalidaCancelacionTransaccionWSDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.pasarelarealpay.wsdto;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoDTO;

/**
 * Clase tipo objeto de transferencia de datos para web service (WSDTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y servicios web.
 * <br>
 * Contiene propiedades para representar los datos del objeto Salida cancelacion
 * transaccion. <br>
 * <em>Nota:</em> En modelos de pasarela el nombre de las variables no aplican
 * el estandar porque es necesario para el mapeo y serializacion al servicio de
 * realpay
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class SalidaCancelacionTransaccionWSDTO extends GenericoDTO{

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 6945135295497913487L;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * consecutive.
	 */
	private String is_consecutive;
	
	/**
	 * Atributo de instancia tipo SalidaLogWSDTO para definir la propiedad log.
	 */
	private SalidaLogWSDTO is_log;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * result.
	 */
	private String is_result;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * token.
	 */
	private String is_token;

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * SalidaCancelacionTransaccionWSDTO.
	 */
	public SalidaCancelacionTransaccionWSDTO() {
		//Metodo constructor de negocio
	}

	/**
	 * Obtiene el valor para la propiedad consecutive.
	 *
	 * @return El valor de la propiedad consecutive
	 */
	public String getIs_consecutive() {
		return is_consecutive;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad consecutive.
	 *
	 * @param as_consecutive el nuevo valor para la propiedad consecutive
	 */
	public void setIs_consecutive(String as_consecutive) {
		this.is_consecutive = as_consecutive;
	}

	/**
	 * Obtiene el valor para la propiedad log.
	 *
	 * @return El valor de la propiedad log
	 */
	public SalidaLogWSDTO getIs_log() {
		return is_log;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad log.
	 *
	 * @param as_log el nuevo valor para la propiedad log
	 */
	public void setIs_log(SalidaLogWSDTO as_log) {
		this.is_log = as_log;
	}

	/**
	 * Obtiene el valor para la propiedad result.
	 *
	 * @return El valor de la propiedad result
	 */
	public String getIs_result() {
		return is_result;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad result.
	 *
	 * @param as_result el nuevo valor para la propiedad result
	 */
	public void setIs_result(String as_result) {
		this.is_result = as_result;
	}

	/**
	 * Obtiene el valor para la propiedad token.
	 *
	 * @return El valor de la propiedad token
	 */
	public String getIs_token() {
		return is_token;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad token.
	 *
	 * @param as_token el nuevo valor para la propiedad token
	 */
	public void setIs_token(String as_token) {
		this.is_token = as_token;
	}

}
