/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: TipoCriterioCTSIVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.operacionesfinancieras
 * Nombre del elemento: TipoCriterioCTSIVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.vo.operacionesfinancieras;

import co.gov.supernotariado.bachue.clientebus.vo.GenericoVO;

/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Tipo criterio CTSI .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoCriterioCTSIVO extends GenericoVO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo.
	 */
    private String is_codigo;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * valor.
	 */
    private String is_valor;
    
	/**
	 * Obtiene el valor para la propiedad codigo.
	 *
	 * @return El valor de la propiedad codigo
	 */
	public String getIs_codigo() {
		return is_codigo;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad codigo.
	 *
	 * @param as_codigo el nuevo valor para la propiedad codigo
	 */
	public void setIs_codigo(String as_codigo) {
		this.is_codigo = as_codigo;
	}
	
	/**
	 * Obtiene el valor para la propiedad valor.
	 *
	 * @return El valor de la propiedad valor
	 */
	public String getIs_valor() {
		return is_valor;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad valor.
	 *
	 * @param as_valor el nuevo valor para la propiedad valor
	 */
	public void setIs_valor(String as_valor) {
		this.is_valor = as_valor;
	}
    
}
