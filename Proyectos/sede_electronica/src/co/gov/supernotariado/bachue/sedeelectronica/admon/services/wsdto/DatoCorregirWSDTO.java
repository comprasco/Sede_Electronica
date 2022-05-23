/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: DatoCorregirWSDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto
 * Nombre del elemento: DatoCorregirWSDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto;

import java.io.Serializable;

/**
 * Clase tipo objeto de transferencia de datos para web service (WSDTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y servicios web.
 * <br>
 * Contiene propiedades para representar los datos del objeto Dato corregir.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class DatoCorregirWSDTO implements Serializable{
	
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
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad id
	 * causal correccion.
	 */
    private String is_idCausalCorreccion;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * observacion.
	 */
    private String is_observacion;
    
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
	
	/**
	 * Obtiene el valor para la propiedad observacion.
	 *
	 * @return El valor de la propiedad observacion
	 */
	public String getIs_observacion() {
		return is_observacion;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad observacion.
	 *
	 * @param as_observacion el nuevo valor para la propiedad observacion
	 */
	public void setIs_observacion(String as_observacion) {
		this.is_observacion = as_observacion;
	}
    
}
