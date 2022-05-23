/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: TipoEntradaConsultarTrazabilidadVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.consultartrazabilidad
 * Nombre del elemento: TipoEntradaConsultarTrazabilidadVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.vo.consultartrazabilidad;

import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;

/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Tipo entrada consultar trazabilidad .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoEntradaConsultaDetalleCertificadoVO extends ClienteIntegracionVO {
	
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
