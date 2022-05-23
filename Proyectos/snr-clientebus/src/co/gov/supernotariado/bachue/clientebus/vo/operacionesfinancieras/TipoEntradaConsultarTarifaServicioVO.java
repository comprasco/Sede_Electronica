/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: TipoEntradaConsultarTarifaServicioVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.operacionesfinancieras
 * Nombre del elemento: TipoEntradaConsultarTarifaServicioVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.vo.operacionesfinancieras;

import java.util.List;

import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;

/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Tipo entrada consultar tarifa servicio .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoEntradaConsultarTarifaServicioVO extends ClienteIntegracionVO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo documento solicitante.
	 */
	private String is_tipoDocSolicitante;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero documento solicitante.
	 */
	private String is_numeroDocSolicitante;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo convenio.
	 */
	private String is_codigoConvenio;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * canal origen.
	 */
	private String is_canalOrigen;
	
	/**
	 * Atributo de instancia tipo lista de TipoServicioCTSIVO para definir la
	 * propiedad servicios.
	 */
	private List<TipoServicioCTSIVO> iltsc_servicios;
	
	/**
	 * Obtiene el valor para la propiedad tipo documento solicitante.
	 *
	 * @return El valor de la propiedad tipo documento solicitante
	 */
	public String getIs_tipoDocSolicitante() {
		return is_tipoDocSolicitante;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad tipo documento solicitante.
	 *
	 * @param as_tipoDocSolicitante el nuevo valor para la propiedad tipo documento
	 *                              solicitante
	 */
	public void setIs_tipoDocSolicitante(String as_tipoDocSolicitante) {
		this.is_tipoDocSolicitante = as_tipoDocSolicitante;
	}
	
	/**
	 * Obtiene el valor para la propiedad numero documento solicitante.
	 *
	 * @return El valor de la propiedad numero documento solicitante
	 */
	public String getIs_numeroDocSolicitante() {
		return is_numeroDocSolicitante;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad numero documento solicitante.
	 *
	 * @param as_numeroDocSolicitante el nuevo valor para la propiedad numero
	 *                                documento solicitante
	 */
	public void setIs_numeroDocSolicitante(String as_numeroDocSolicitante) {
		this.is_numeroDocSolicitante = as_numeroDocSolicitante;
	}
	
	/**
	 * Obtiene el valor para la propiedad codigo convenio.
	 *
	 * @return El valor de la propiedad codigo convenio
	 */
	public String getIs_codigoConvenio() {
		return is_codigoConvenio;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad codigo convenio.
	 *
	 * @param as_codigoConvenio el nuevo valor para la propiedad codigo convenio
	 */
	public void setIs_codigoConvenio(String as_codigoConvenio) {
		this.is_codigoConvenio = as_codigoConvenio;
	}
	
	/**
	 * Obtiene el valor para la propiedad canal origen.
	 *
	 * @return El valor de la propiedad canal origen
	 */
	public String getIs_canalOrigen() {
		return is_canalOrigen;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad canal origen.
	 *
	 * @param as_canalOrigen el nuevo valor para la propiedad canal origen
	 */
	public void setIs_canalOrigen(String as_canalOrigen) {
		this.is_canalOrigen = as_canalOrigen;
	}
	
	/**
	 * Obtiene el valor para la propiedad servicios.
	 *
	 * @return El valor de la propiedad servicios
	 */
	public List<TipoServicioCTSIVO> getIltsc_servicios() {
		return iltsc_servicios;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad servicios.
	 *
	 * @param altsc_servicios el nuevo valor para la propiedad servicios
	 */
	public void setIltsc_servicios(List<TipoServicioCTSIVO> altsc_servicios) {
		this.iltsc_servicios = altsc_servicios;
	}
	
}
