/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: DatoCorregirVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.solicitudcorreccion
 * Nombre del elemento: DatoCorregirVO
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
 * Dato corregir .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class DatoCorregirVO extends GenericoVO{
	
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
