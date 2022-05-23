/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: TipoEntradaNotificarDigitalizacionVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.controldigitalizacion
 * Nombre del elemento: TipoEntradaNotificarDigitalizacionVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.vo.controldigitalizacion;

import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;

/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Tipo entrada notificar digitalizacion .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoEntradaNotificarDigitalizacionVO extends ClienteIntegracionVO 
{
	
	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * sistema origen.
	 */
    private String is_sistemaOrigen;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * identificador tramite.
	 */
    private String is_identificadorTramite; 
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * estado.
	 */
    private String is_estado;
    
	/**
	 * Obtiene el valor para la propiedad sistema origen.
	 *
	 * @return El valor de la propiedad sistema origen
	 */
	public String getIs_sistemaOrigen() {
		return is_sistemaOrigen;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad sistema origen.
	 *
	 * @param as_sistemaOrigen el nuevo valor para la propiedad sistema origen
	 */
	public void setIs_sistemaOrigen(String as_sistemaOrigen) {
		this.is_sistemaOrigen = as_sistemaOrigen;
	}
	
	/**
	 * Obtiene el valor para la propiedad identificador tramite.
	 *
	 * @return El valor de la propiedad identificador tramite
	 */
	public String getIs_identificadorTramite() {
		return is_identificadorTramite;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad identificador tramite.
	 *
	 * @param as_identificadorTramite el nuevo valor para la propiedad identificador
	 *                                tramite
	 */
	public void setIs_identificadorTramite(String as_identificadorTramite) {
		this.is_identificadorTramite = as_identificadorTramite;
	}
	
	/**
	 * Obtiene el valor para la propiedad estado.
	 *
	 * @return El valor de la propiedad estado
	 */
	public String getIs_estado() {
		return is_estado;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad estado.
	 *
	 * @param as_estado el nuevo valor para la propiedad estado
	 */
	public void setIs_estado(String as_estado) {
		this.is_estado = as_estado;
	}
}