/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: RespuestaConsultarInformacionMatriculaVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.consultarInformacionmatricula
 * Nombre del elemento: RespuestaConsultarInformacionMatriculaVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.consultarInformacionmatricula;

import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;
import co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.generico.EntidadLogVO;


/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Respuesta consultar informacion matricula .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class RespuestaConsultarInformacionMatriculaVO  extends ClienteIntegracionVO{

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * direccion.
	 */
	private String is_direccion;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * estado.
	 */
    private String is_estado;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * estado generacion.
	 */
    private String is_estadoGeneracion;
    
    /**
	 * Atributo de instancia tipo EntidadLogVO para definir la propiedad log.
	 */
    private EntidadLogVO iel_log;
    
	/**
	 * Obtiene el valor para la propiedad direccion.
	 *
	 * @return El valor de la propiedad direccion
	 */
	public String getIs_direccion() {
		return is_direccion;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad direccion.
	 *
	 * @param as_direccion el nuevo valor para la propiedad direccion
	 */
	public void setIs_direccion(String as_direccion) {
		this.is_direccion = as_direccion;
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
	
	/**
	 * Obtiene el valor para la propiedad estado generacion.
	 *
	 * @return El valor de la propiedad estado generacion
	 */
	public String getIs_estadoGeneracion() {
		return is_estadoGeneracion;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad estado generacion.
	 *
	 * @param as_estadoGeneracion el nuevo valor para la propiedad estado generacion
	 */
	public void setIs_estadoGeneracion(String as_estadoGeneracion) {
		this.is_estadoGeneracion = as_estadoGeneracion;
	}
	
	/**
	 * Obtiene el valor para la propiedad log.
	 *
	 * @return El valor de la propiedad log
	 */
	public EntidadLogVO getIel_log() {
		return iel_log;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad log.
	 *
	 * @param ael_log el nuevo valor para la propiedad log
	 */
	public void setIel_log(EntidadLogVO ael_log) {
		this.iel_log = ael_log;
	}    
      
}
