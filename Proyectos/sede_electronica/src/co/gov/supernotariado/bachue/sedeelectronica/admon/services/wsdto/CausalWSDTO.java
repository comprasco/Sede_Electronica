/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: CausalWSDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto
 * Nombre del elemento: CausalWSDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto;

import java.io.Serializable;

/**
 * Clase tipo objeto de transferencia de datos para web service (WSDTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y servicios web.
 * <br>
 * Contiene propiedades para representar los datos del objeto Causal.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class CausalWSDTO implements Serializable{

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad id
	 * grupo causal.
	 */
	private String is_idGrupoCausal;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * desc grupo causal.
	 */
	private String is_descGrupoCausal;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad id
	 * causal correccion.
	 */
	private String is_idCausalCorreccion;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * desc causal correccion.
	 */
	private String is_descCausalCorreccion;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * descripcion causal.
	 */
	private String is_descripcionCausal;

	/**
	 * Obtiene el valor para la propiedad id grupo causal.
	 *
	 * @return El valor de la propiedad id grupo causal
	 */
	public String getIs_idGrupoCausal() {
		return is_idGrupoCausal;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad id grupo causal.
	 *
	 * @param as_idGrupoCausal el nuevo valor para la propiedad id grupo causal
	 */
	public void setIs_idGrupoCausal(String as_idGrupoCausal) {
		this.is_idGrupoCausal = as_idGrupoCausal;
	}
	
	/**
	 * Obtiene el valor para la propiedad desc grupo causal.
	 *
	 * @return El valor de la propiedad desc grupo causal
	 */
	public String getIs_descGrupoCausal() {
		return is_descGrupoCausal;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad desc grupo causal.
	 *
	 * @param as_descGrupoCausal el nuevo valor para la propiedad desc grupo causal
	 */
	public void setIs_descGrupoCausal(String as_descGrupoCausal) {
		this.is_descGrupoCausal = as_descGrupoCausal;
	}
	
	/**
	 * Obtiene el valor para la propiedad id causal correccion.
	 *
	 * @return El valor de la propiedad id causal correccion
	 */
	public String getIs_idCausalCorreccion() {
		return is_idCausalCorreccion;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad id causal correccion.
	 *
	 * @param as_idCausalCorreccion el nuevo valor para la propiedad id causal
	 *                              correccion
	 */
	public void setIs_idCausalCorreccion(String as_idCausalCorreccion) {
		this.is_idCausalCorreccion = as_idCausalCorreccion;
	}
	
	/**
	 * Obtiene el valor para la propiedad desc causal correccion.
	 *
	 * @return El valor de la propiedad desc causal correccion
	 */
	public String getIs_descCausalCorreccion() {
		return is_descCausalCorreccion;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad desc causal correccion.
	 *
	 * @param as_descCausalCorreccion el nuevo valor para la propiedad desc causal
	 *                                correccion
	 */
	public void setIs_descCausalCorreccion(String as_descCausalCorreccion) {
		this.is_descCausalCorreccion = as_descCausalCorreccion;
	}
	
	/**
	 * Obtiene el valor para la propiedad descripcion causal.
	 *
	 * @return El valor de la propiedad descripcion causal
	 */
	public String getIs_descripcionCausal() {
		return is_descripcionCausal;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad descripcion causal.
	 *
	 * @param as_descripcionCausal el nuevo valor para la propiedad descripcion
	 *                             causal
	 */
	public void setIs_descripcionCausal(String as_descripcionCausal) {
		this.is_descripcionCausal = as_descripcionCausal;
	}

}
