/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TipoEntradaConsultaDetalleCertificadoWSDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto
 * Nombre del elemento: TipoEntradaConsultaDetalleCertificadoWSDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto;

import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;

/**
 * Clase tipo objeto de transferencia de datos para web service (WSDTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y servicios web.
 * <br>
 * Contiene propiedades para representar los datos del objeto Tipo Entrada
 * Consulta Actos Turno.
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */

public class TipoEntradaConsultaActosTurnoWSDTO extends ClienteIntegracionVO {
	
	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	private String is_modulo;
	private String is_criterioBusqueda;
	private String is_valorCriterioBusqueda;
	
	
	/*
	 * Getters y Setters
	 */
	public String getIs_modulo() {
		return is_modulo;
	}
	public void setIs_modulo(String as_modulo) {
		this.is_modulo = as_modulo;
	}
	public String getIs_criterioBusqueda() {
		return is_criterioBusqueda;
	}
	public void setIs_criterioBusqueda(String as_criterioBusqueda) {
		this.is_criterioBusqueda = as_criterioBusqueda;
	}
	public String getIs_valorCriterioBusqueda() {
		return is_valorCriterioBusqueda;
	}
	public void setIs_valorCriterioBusqueda(String as_valorCriterioBusqueda) {
		this.is_valorCriterioBusqueda = as_valorCriterioBusqueda;
	}
    
	
}
