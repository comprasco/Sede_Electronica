/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: RespuestaConsultarEstadoOficinasVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.consultarestadooficinasregistro
 * Nombre del elemento: RespuestaConsultarEstadoOficinasVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.consultarestadooficinasregistro;

import java.util.List;

import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;
import co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.generico.EntidadLogVO;


/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Respuesta consultar estado oficinas .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class RespuestaConsultarEstadoOficinasVO extends ClienteIntegracionVO{


	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * estado.
	 */
	private String is_estado;
    
    /**
	 * Atributo de instancia tipo EntidadLogVO para definir la propiedad log.
	 */
    private EntidadLogVO ielv_log;
    
    /**
	 * Atributo de instancia tipo lista de EntidadOficinaVO para definir la
	 * propiedad oficinas.
	 */
    private List<EntidadOficinaVO> ileo_oficinas;
    
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
	 * Obtiene el valor para la propiedad log.
	 *
	 * @return El valor de la propiedad log
	 */
	public EntidadLogVO getIelv_log() {
		return ielv_log;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad log.
	 *
	 * @param aelv_log el nuevo valor para la propiedad log
	 */
	public void setIelv_log(EntidadLogVO aelv_log) {
		this.ielv_log = aelv_log;
	}
	
	/**
	 * Obtiene el valor para la propiedad oficinas.
	 *
	 * @return El valor de la propiedad oficinas
	 */
	public List<EntidadOficinaVO> getIleo_oficinas() {
		return ileo_oficinas;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad oficinas.
	 *
	 * @param aleo_oficinas el nuevo valor para la propiedad oficinas
	 */
	public void setIleo_oficinas(List<EntidadOficinaVO> aleo_oficinas) {
		this.ileo_oficinas = aleo_oficinas;
	}
    
    
    
}
