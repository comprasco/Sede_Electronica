/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TipoReciboCajaCMOWSDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto
 * Nombre del elemento: TipoReciboCajaCMOWSDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Clase tipo objeto de transferencia de datos para web service (WSDTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y servicios web.
 * <br>
 * Contiene propiedades para representar los datos del objeto Tipo recibo caja
 * CMO.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoReciboCajaCMOWSDTO implements Serializable{

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
