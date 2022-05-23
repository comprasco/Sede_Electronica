/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TipoCorreccionDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: TipoCorreccionDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Tipo correccion.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoCorreccionDTO extends GenericoDTO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * grupo causal.
	 */
	private String is_grupoCausal;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * causal correccion.
	 */
	private String is_causalCorreccion;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad id
	 * grupo causal.
	 */
	private String is_idGrupoCausal;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad id
	 * causal correccion.
	 */
	private String is_idCausalCorreccion;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * descripcion.
	 */
	private String is_descripcion;
	
	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad
	 * seleccione.
	 */
	private Boolean ib_seleccione;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * observaciones.
	 */
	private String is_observaciones;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * error.
	 */
	private String is_error;
	
	/**
	 * Obtiene el valor para la propiedad grupo causal.
	 *
	 * @return El valor de la propiedad grupo causal
	 */
	public String getIs_grupoCausal() {
		return is_grupoCausal;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad grupo causal.
	 *
	 * @param as_grupoCausal el nuevo valor para la propiedad grupo causal
	 */
	public void setIs_grupoCausal(String as_grupoCausal) {
		this.is_grupoCausal = as_grupoCausal;
	}
	
	/**
	 * Obtiene el valor para la propiedad causal correccion.
	 *
	 * @return El valor de la propiedad causal correccion
	 */
	public String getIs_causalCorreccion() {
		return is_causalCorreccion;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad causal correccion.
	 *
	 * @param as_causalCorreccion el nuevo valor para la propiedad causal correccion
	 */
	public void setIs_causalCorreccion(String as_causalCorreccion) {
		this.is_causalCorreccion = as_causalCorreccion;
	}
	
	/**
	 * Obtiene el valor para la propiedad descripcion.
	 *
	 * @return El valor de la propiedad descripcion
	 */
	public String getIs_descripcion() {
		return is_descripcion;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad descripcion.
	 *
	 * @param as_descripcion el nuevo valor para la propiedad descripcion
	 */
	public void setIs_descripcion(String as_descripcion) {
		this.is_descripcion = as_descripcion;
	}
	
	/**
	 * Obtiene el valor para la propiedad seleccione.
	 *
	 * @return El valor de la propiedad seleccione
	 */
	public Boolean getIb_seleccione() {
		return ib_seleccione;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad seleccione.
	 *
	 * @param ab_seleccione el nuevo valor para la propiedad seleccione
	 */
	public void setIb_seleccione(Boolean ab_seleccione) {
		this.ib_seleccione = ab_seleccione;
	}
	
	/**
	 * Obtiene el valor para la propiedad observaciones.
	 *
	 * @return El valor de la propiedad observaciones
	 */
	public String getIs_observaciones() {
		return is_observaciones;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad observaciones.
	 *
	 * @param as_observaciones el nuevo valor para la propiedad observaciones
	 */
	public void setIs_observaciones(String as_observaciones) {
		this.is_observaciones = as_observaciones;
	}
	
	/**
	 * Obtiene el valor para la propiedad error.
	 *
	 * @return El valor de la propiedad error
	 */
	public String getIs_error() {
		return is_error;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad error.
	 *
	 * @param as_error el nuevo valor para la propiedad error
	 */
	public void setIs_error(String as_error) {
		this.is_error = as_error;
	}
	
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
}