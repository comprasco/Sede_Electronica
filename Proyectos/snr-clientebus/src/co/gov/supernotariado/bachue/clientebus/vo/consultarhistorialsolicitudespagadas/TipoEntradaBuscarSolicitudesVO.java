/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: TipoEntradaBuscarSolicitudesVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.consultarhistorialsolicitudespagadas
 * Nombre del elemento: TipoEntradaBuscarSolicitudesVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.vo.consultarhistorialsolicitudespagadas;

import java.util.List;

import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;

/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Tipo entrada buscar solicitudes .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoEntradaBuscarSolicitudesVO extends ClienteIntegracionVO
{
	
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
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * servicio.
	 */
	private String is_servicio;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nir.
	 */
	private String is_nir;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * fecha desde busqueda.
	 */
	private String is_fechaDesdeBusqueda;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * fecha hasta busqueda.
	 */
	private String is_fechaHastaBusqueda;
	
	/**
	 * Atributo de instancia tipo lista de SolicitanteVO para definir la propiedad
	 * lista solicitante.
	 */
	private List<SolicitanteVO> ils_listaSolicitante;
	
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
	 * Obtiene el valor para la propiedad servicio.
	 *
	 * @return El valor de la propiedad servicio
	 */
	public String getIs_servicio() {
		return is_servicio;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad servicio.
	 *
	 * @param as_servicio el nuevo valor para la propiedad servicio
	 */
	public void setIs_servicio(String as_servicio) {
		this.is_servicio = as_servicio;
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
	
	/**
	 * Obtiene el valor para la propiedad lista solicitante.
	 *
	 * @return El valor de la propiedad lista solicitante
	 */
	public List<SolicitanteVO> getIls_listaSolicitante() {
		return ils_listaSolicitante;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad lista solicitante.
	 *
	 * @param als_listaSolicitante el nuevo valor para la propiedad lista
	 *                             solicitante
	 */
	public void setIls_listaSolicitante(List<SolicitanteVO> als_listaSolicitante) {
		this.ils_listaSolicitante = als_listaSolicitante;
	}
	
	/**
	 * Obtiene el valor para la propiedad fecha desde busqueda.
	 *
	 * @return El valor de la propiedad fecha desde busqueda
	 */
	public String getIs_fechaDesdeBusqueda() {
		return is_fechaDesdeBusqueda;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad fecha desde busqueda.
	 *
	 * @param as_fechaDesdeBusqueda el nuevo valor para la propiedad fecha desde
	 *                              busqueda
	 */
	public void setIs_fechaDesdeBusqueda(String as_fechaDesdeBusqueda) {
		this.is_fechaDesdeBusqueda = as_fechaDesdeBusqueda;
	}
	
	/**
	 * Obtiene el valor para la propiedad fecha hasta busqueda.
	 *
	 * @return El valor de la propiedad fecha hasta busqueda
	 */
	public String getIs_fechaHastaBusqueda() {
		return is_fechaHastaBusqueda;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad fecha hasta busqueda.
	 *
	 * @param as_fechaHastaBusqueda el nuevo valor para la propiedad fecha hasta
	 *                              busqueda
	 */
	public void setIs_fechaHastaBusqueda(String as_fechaHastaBusqueda) {
		this.is_fechaHastaBusqueda = as_fechaHastaBusqueda;
	}
	
}