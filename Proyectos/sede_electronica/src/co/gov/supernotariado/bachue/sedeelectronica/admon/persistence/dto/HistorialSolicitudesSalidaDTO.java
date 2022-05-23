/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: HistorialSolicitudesSalidaDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: HistorialSolicitudesSalidaDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

import java.util.Date;
import java.util.List;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Historial
 * solicitudes salida.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class HistorialSolicitudesSalidaDTO extends GenericoDTO{

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
	 * Atributo de instancia tipo lista de TurnoHistorialSolicitudesDTO para definir
	 * la propiedad turno historial solicitudes.
	 */
	private List<TurnoHistorialSolicitudesDTO> ilths_turnoHistorialSolicitudesDto;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * recibo convertido.
	 */
	private String is_reciboConvertido;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * recibo convertido.
	 */
	private String is_referenciaPago;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * referencia Transaccion.
	 */
	private String is_referenciaTransaccion;


	/**
	 * Atributo de instancia tipo fecha para definir la propiedad fecha servicio.
	 */
	private Date id_fechaServicio;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * servicio.
	 */
	private String is_servicio;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad sub
	 * servicio.
	 */
	private String is_subServicio;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * estado Bancarizacion.
	 */
	private String is_estadoBancarizacion;

	/**
	 * Atributo de instancia tipo PersonaDTO para definir la propiedad persona.
	 */
	private PersonaDTO ip_personaDto;

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
	 * Obtiene el valor para la propiedad turno historial solicitudes dto.
	 *
	 * @return El valor de la propiedad turno historial solicitudes dto
	 */
	public List<TurnoHistorialSolicitudesDTO> getIlths_turnoHistorialSolicitudesDto() {
		return ilths_turnoHistorialSolicitudesDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad turno historial solicitudes dto.
	 *
	 * @param alths_turnoHistorialSolicitudesDto el nuevo valor para la propiedad
	 *                                           turno historial solicitudes dto
	 */
	public void setIlths_turnoHistorialSolicitudesDto(
			List<TurnoHistorialSolicitudesDTO> alths_turnoHistorialSolicitudesDto) {
		this.ilths_turnoHistorialSolicitudesDto = alths_turnoHistorialSolicitudesDto;
	}

	/**
	 * Obtiene el valor para la propiedad fecha servicio.
	 *
	 * @return El valor de la propiedad fecha servicio
	 */
	public Date getId_fechaServicio() {
		return id_fechaServicio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad fecha servicio.
	 *
	 * @param ad_fechaServicio el nuevo valor para la propiedad fecha servicio
	 */
	public void setId_fechaServicio(Date ad_fechaServicio) {
		this.id_fechaServicio = ad_fechaServicio;
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
	 * Obtiene el valor para la propiedad sub servicio.
	 *
	 * @return El valor de la propiedad sub servicio
	 */
	public String getIs_subServicio() {
		return is_subServicio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad sub servicio.
	 *
	 * @param as_subServicio el nuevo valor para la propiedad sub servicio
	 */
	public void setIs_subServicio(String as_subServicio) {
		this.is_subServicio = as_subServicio;
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

	/**
	 * Obtiene el valor para la propiedad recibo convertido.
	 *
	 * @return El valor de la propiedad recibo convertido
	 */
	public String getIs_reciboConvertido() {
		return is_reciboConvertido;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad recibo convertido.
	 *
	 * @param as_reciboConvertido el nuevo valor para la propiedad recibo convertido
	 */
	public void setIs_reciboConvertido(String as_reciboConvertido) {
		this.is_reciboConvertido = as_reciboConvertido;
	}
	public String getIs_referenciaPago() {
		return is_referenciaPago;
	}
	public void setIs_referenciaPago(String as_referenciaPago) {
		this.is_referenciaPago = as_referenciaPago;
	}
	public String getIs_estadoBancarizacion() {
		return is_estadoBancarizacion;
	}
	public void setIs_estadoBancarizacion(String as_estadoBancarizacion) {
		this.is_estadoBancarizacion = as_estadoBancarizacion;
	}
	public String getIs_referenciaTransaccion() {
		return is_referenciaTransaccion;
	}
	public void setIs_referenciaTransaccion(String as_referenciaTransaccion) {
		this.is_referenciaTransaccion = as_referenciaTransaccion;
	}



}
