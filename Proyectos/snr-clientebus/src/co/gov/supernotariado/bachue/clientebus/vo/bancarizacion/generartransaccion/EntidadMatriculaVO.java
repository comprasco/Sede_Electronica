/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: EntidadMatriculaVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.generartransaccion
 * Nombre del elemento: EntidadMatriculaVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.generartransaccion;

import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;

	
/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Entidad matricula .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class EntidadMatriculaVO extends ClienteIntegracionVO{


	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo circulo.
	 */
	private String is_codigoCirculo;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero matricula.
	 */
    private String is_numeroMatricula;
    
	/**
	 * Obtiene el valor para la propiedad codigo circulo.
	 *
	 * @return El valor de la propiedad codigo circulo
	 */
	public String getIs_codigoCirculo() {
		return is_codigoCirculo;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad codigo circulo.
	 *
	 * @param as_codigoCirculo el nuevo valor para la propiedad codigo circulo
	 */
	public void setIs_codigoCirculo(String as_codigoCirculo) {
		this.is_codigoCirculo = as_codigoCirculo;
	}
	
	/**
	 * Obtiene el valor para la propiedad numero matricula.
	 *
	 * @return El valor de la propiedad numero matricula
	 */
	public String getIs_numeroMatricula() {
		return is_numeroMatricula;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad numero matricula.
	 *
	 * @param as_numeroMatricula el nuevo valor para la propiedad numero matricula
	 */
	public void setIs_numeroMatricula(String as_numeroMatricula) {
		this.is_numeroMatricula = as_numeroMatricula;
	}
    
}
