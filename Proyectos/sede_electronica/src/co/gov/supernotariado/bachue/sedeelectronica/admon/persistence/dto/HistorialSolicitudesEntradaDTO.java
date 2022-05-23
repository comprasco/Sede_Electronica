/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: HistorialSolicitudesEntradaDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: HistorialSolicitudesEntradaDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

import java.util.Date;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Historial
 * solicitudes entrada.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */

public class HistorialSolicitudesEntradaDTO extends GenericoDTO{

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nir.
	 */
	private String is_nir;
	
	/**
	 * Atributo de instancia tipo fecha para definir la propiedad fecha desde.
	 */
	private Date id_fechaDesde;
	
	/**
	 * Atributo de instancia tipo fecha para definir la propiedad fecha hasta.
	 */
	private Date id_fechaHasta;
	
	/**
	 * Atributo de instancia tipo PersonaDTO para definir la propiedad persona.
	 */
	private PersonaDTO ip_personaDto;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * servicio.
	 */
	private String is_servicio;
	
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
	 * Obtiene el valor para la propiedad fecha desde.
	 *
	 * @return El valor de la propiedad fecha desde
	 */
	public Date getId_fechaDesde() {
		return id_fechaDesde;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad fecha desde.
	 *
	 * @param ad_fechaDesde el nuevo valor para la propiedad fecha desde
	 */
	public void setId_fechaDesde(Date ad_fechaDesde) {
		this.id_fechaDesde = ad_fechaDesde;
	}
	
	/**
	 * Obtiene el valor para la propiedad fecha hasta.
	 *
	 * @return El valor de la propiedad fecha hasta
	 */
	public Date getId_fechaHasta() {
		return id_fechaHasta;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad fecha hasta.
	 *
	 * @param ad_fechaHasta el nuevo valor para la propiedad fecha hasta
	 */
	public void setId_fechaHasta(Date ad_fechaHasta) {
		this.id_fechaHasta = ad_fechaHasta;
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
	 * Obtiene el valor para la propiedad persona dto.
	 *
	 * @return El valor de la propiedad persona dto
	 */
	public PersonaDTO getIp_personaDto() {
		return ip_personaDto;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad persona dto.
	 *
	 * @param ap_personaDto el nuevo valor para la propiedad persona dto
	 */
	public void setIp_personaDto(PersonaDTO ap_personaDto) {
		this.ip_personaDto = ap_personaDto;
	}
}
