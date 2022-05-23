/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TipoEntradaBuscarSolicitudesWSDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto
 * Nombre del elemento: TipoEntradaBuscarSolicitudesWSDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto;

import java.util.Date;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoDTO;

/**
 * Clase tipo objeto de transferencia de datos para web service (WSDTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y servicios web.
 * <br>
 * Contiene propiedades para representar los datos del objeto Tipo entrada
 * buscar solicitudes.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoEntradaBuscarSolicitudesWSDTO extends GenericoDTO{
	
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
	 * Atributo de instancia tipo SolicitanteWSDTO para definir la propiedad
	 * solicitante.
	 */
	private SolicitanteWSDTO is_solicitante;
	
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
	 * Atributo de instancia tipo fecha para definir la propiedad fecha desde
	 * busqueda.
	 */
	private Date id_fechaDesdeBusqueda;
	
	/**
	 * Atributo de instancia tipo fecha para definir la propiedad fecha hasta
	 * busqueda.
	 */
	private Date id_fechaHastaBusqueda;
	
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
	public SolicitanteWSDTO getIs_solicitante() {
		return is_solicitante;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad solicitante.
	 *
	 * @param as_solicitante el nuevo valor para la propiedad solicitante
	 */
	public void setIs_solicitante(SolicitanteWSDTO as_solicitante) {
		this.is_solicitante = as_solicitante;
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
	 * Obtiene el valor para la propiedad fecha desde busqueda.
	 *
	 * @return El valor de la propiedad fecha desde busqueda
	 */
	public Date getId_fechaDesdeBusqueda() {
		return id_fechaDesdeBusqueda;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad fecha desde busqueda.
	 *
	 * @param ad_fechaDesdeBusqueda el nuevo valor para la propiedad fecha desde
	 *                              busqueda
	 */
	public void setId_fechaDesdeBusqueda(Date ad_fechaDesdeBusqueda) {
		this.id_fechaDesdeBusqueda = ad_fechaDesdeBusqueda;
	}
	
	/**
	 * Obtiene el valor para la propiedad fecha hasta busqueda.
	 *
	 * @return El valor de la propiedad fecha hasta busqueda
	 */
	public Date getId_fechaHastaBusqueda() {
		return id_fechaHastaBusqueda;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad fecha hasta busqueda.
	 *
	 * @param ad_fechaHastaBusqueda el nuevo valor para la propiedad fecha hasta
	 *                              busqueda
	 */
	public void setId_fechaHastaBusqueda(Date ad_fechaHastaBusqueda) {
		this.id_fechaHastaBusqueda = ad_fechaHastaBusqueda;
	}
}
