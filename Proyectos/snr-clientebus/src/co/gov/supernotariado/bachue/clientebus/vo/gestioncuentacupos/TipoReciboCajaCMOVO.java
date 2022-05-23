/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: TipoReciboCajaCMOVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos
 * Nombre del elemento: TipoReciboCajaCMOVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos;

import java.math.BigDecimal;

import co.gov.supernotariado.bachue.clientebus.vo.GenericoVO;

/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Tipo recibo caja CMO .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoReciboCajaCMOVO extends GenericoVO{

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero.
	 */
	private String is_numero;
    
    /**
	 * Atributo de instancia tipo numero real/decimal de gran magnitud para definir
	 * la propiedad valor.
	 */
    private BigDecimal ibd_valor;
	
	/**
	 * Obtiene el valor para la propiedad numero.
	 *
	 * @return El valor de la propiedad numero
	 */
	public String getIs_numero() {
		return is_numero;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad numero.
	 *
	 * @param as_numero el nuevo valor para la propiedad numero
	 */
	public void setIs_numero(String as_numero) {
		this.is_numero = as_numero;
	}
	
	/**
	 * Obtiene el valor para la propiedad valor.
	 *
	 * @return El valor de la propiedad valor
	 */
	public BigDecimal getIbd_valor() {
		return ibd_valor;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad valor.
	 *
	 * @param abd_valor el nuevo valor para la propiedad valor
	 */
	public void setIbd_valor(BigDecimal abd_valor) {
		this.ibd_valor = abd_valor;
	}
    
}
