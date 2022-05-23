/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: RespuestaConsultarTarifaConvenioVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.consultartarifaconvenio
 * Nombre del elemento: RespuestaConsultarTarifaConvenioVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.consultartarifaconvenio;

import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;
import co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.generico.EntidadLogVO;


/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Respuesta consultar tarifa convenio .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class RespuestaConsultarTarifaConvenioVO extends ClienteIntegracionVO 
{

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
    private EntidadLogVO iel_log;
    
    /**
	 * Atributo de instancia tipo Long para definir la propiedad tarifa.
	 */
    private Long il_tarifa;
    
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
	 * Obtiene el valor para la propiedad tarifa.
	 *
	 * @return El valor de la propiedad tarifa
	 */
	public Long getIl_tarifa() {
		return il_tarifa;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad tarifa.
	 *
	 * @param al_tarifa el nuevo valor para la propiedad tarifa
	 */
	public void setIl_tarifa(Long al_tarifa) {
		this.il_tarifa = al_tarifa;
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
