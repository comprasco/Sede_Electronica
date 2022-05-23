/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TipoEntradaNotificarDigitalizacionWSDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto
 * Nombre del elemento: TipoEntradaNotificarDigitalizacionWSDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoDTO;

/**
 * Clase tipo objeto de transferencia de datos para web service (WSDTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y servicios web.
 * <br>
 * Contiene propiedades para representar los datos del objeto Tipo entrada
 * notificar digitalizacion.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoEntradaNotificarDigitalizacionWSDTO extends GenericoDTO
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