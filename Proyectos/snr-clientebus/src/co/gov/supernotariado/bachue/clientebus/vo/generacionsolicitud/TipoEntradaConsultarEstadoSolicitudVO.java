/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: TipoEntradaConsultarEstadoSolicitudVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.generacionsolicitud
 * Nombre del elemento: TipoEntradaConsultarEstadoSolicitudVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.vo.generacionsolicitud;

import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;

/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Tipo entrada consultar estado solicitud .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoEntradaConsultarEstadoSolicitudVO  extends ClienteIntegracionVO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * modulo.
	 */
    private String is_modulo;
    
    /**
	 * Atributo de instancia tipo TipoSolicitanteCESIVO para definir la propiedad
	 * solicitante.
	 */
    private TipoSolicitanteCESIVO itscv_solicitante;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nir.
	 */
    private String is_nir;
    
	/**
	 * Construye una nueva instancia/objeto de la clase
	 * TipoEntradaConsultarEstadoSolicitudVO.
	 */
	public TipoEntradaConsultarEstadoSolicitudVO() {
		// Metodo constructor
	}

	/**
	 * Obtiene el valor para la propiedad modulo.
	 *
	 * @return El valor de la propiedad modulo
	 */
	public String getIs_modulo() {
		return is_modulo;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad modulo.
	 *
	 * @param as_modulo el nuevo valor para la propiedad modulo
	 */
	public void setIs_modulo(String as_modulo) {
		this.is_modulo = as_modulo;
	}
	
	/**
	 * Obtiene el valor para la propiedad solicitante.
	 *
	 * @return El valor de la propiedad solicitante
	 */
	public TipoSolicitanteCESIVO getItscv_solicitante() {
		return itscv_solicitante;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad solicitante.
	 *
	 * @param atscv_solicitante el nuevo valor para la propiedad solicitante
	 */
	public void setItscv_solicitante(TipoSolicitanteCESIVO atscv_solicitante) {
		this.itscv_solicitante = atscv_solicitante;
	}
	
	/**
	 * Obtiene el valor para la propiedad nir.
	 *
	 * @return El valor de la propiedad nir
	 */
	public String getIs_nir() {
		return is_nir;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad nir.
	 *
	 * @param as_nir el nuevo valor para la propiedad nir
	 */
	public void setIs_nir(String as_nir) {
		this.is_nir = as_nir;
	}
    
}