/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: TipoEntradaGenerarSolicitudVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.generacionsolicitud
 * Nombre del elemento: TipoEntradaGenerarSolicitudVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.vo.generacionsolicitud;

import java.util.List;

import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;

/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Tipo entrada generar solicitud .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoEntradaGenerarSolicitudVO  extends ClienteIntegracionVO {

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
	 * Atributo de instancia tipo TipoSolicitanteGSIVO para definir la propiedad
	 * solicitante.
	 */
    private TipoSolicitanteGSIVO itsgv_solicitante;
    
    /**
	 * Atributo de instancia tipo lista de TipoServicioGSIVO para definir la
	 * propiedad servicios.
	 */
    private List<TipoServicioGSIVO> iltsgsv_servicios;
    
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
	public TipoSolicitanteGSIVO getItsgv_solicitante() {
		return itsgv_solicitante;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad solicitante.
	 *
	 * @param atsgv_solicitante el nuevo valor para la propiedad solicitante
	 */
	public void setItsgv_solicitante(TipoSolicitanteGSIVO atsgv_solicitante) {
		this.itsgv_solicitante = atsgv_solicitante;
	}
	
	/**
	 * Obtiene el valor para la propiedad servicios.
	 *
	 * @return El valor de la propiedad servicios
	 */
	public List<TipoServicioGSIVO> getIltsgsv_servicios() {
		return iltsgsv_servicios;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad servicios.
	 *
	 * @param altsgsv_servicios el nuevo valor para la propiedad servicios
	 */
	public void setIltsgsv_servicios(List<TipoServicioGSIVO> altsgsv_servicios) {
		this.iltsgsv_servicios = altsgsv_servicios;
	}    

}
