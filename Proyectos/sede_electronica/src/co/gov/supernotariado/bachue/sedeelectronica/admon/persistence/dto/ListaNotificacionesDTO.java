/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ListaNotificacionesDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: ListaNotificacionesDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

import java.util.Date;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Lista historial de
 * notificaciones.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ListaNotificacionesDTO extends GenericoBaseDTO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo date para definir la propiedad fecha comunicacion.
	 */
	private Date id_fechaComunicacion;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * turno.
	 */
	private String is_turno;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nir.
	 */
	private String is_nir;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tramite.
	 */
	private String is_tramite;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad de.
	 */
	private String is_de;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * para.
	 */
	private String is_para;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * asunto.
	 */
	private String is_asunto;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * fecha asunto.
	 */
	private Date id_fechaAsunto;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * adjunto.
	 */
	private String is_adjunto;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * texto.
	 */
	private String is_texto;

	/**
	 * Obtiene el valor para la propiedad fecha comunicacion.
	 *
	 * @return El valor de la propiedad fecha comunicacion
	 */
	public Date getId_fechaComunicacion() {
		return id_fechaComunicacion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad fecha comunicacion.
	 *
	 * @param as_oficinaOrigen el nuevo valor para la propiedad fecha comunicacion
	 */
	public void setId_fechaComunicacion(Date ad_fechaComunicacion) {
		this.id_fechaComunicacion = ad_fechaComunicacion;
	}

	/**
	 * Obtiene el valor para la propiedad turno.
	 *
	 * @return El valor de la propiedad turno
	 */
	public String getIs_turno() {
		return is_turno;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad turno.
	 *
	 * @param as_oficinaOrigen el nuevo valor para la propiedad turno
	 */
	public void setIs_turno(String as_turno) {
		this.is_turno = as_turno;
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
	 * @param as_oficinaOrigen el nuevo valor para la propiedad nir
	 */
	public void setIs_nir(String as_nir) {
		this.is_nir = as_nir;
	}

	/**
	 * Obtiene el valor para la propiedad tramite.
	 *
	 * @return El valor de la propiedad tramite
	 */
	public String getIs_tramite() {
		return is_tramite;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tramite.
	 *
	 * @param as_oficinaOrigen el nuevo valor para la propiedad tramite
	 */
	public void setIs_tramite(String as_tramite) {
		this.is_tramite = as_tramite;
	}

	/**
	 * Obtiene el valor para la propiedad de.
	 *
	 * @return El valor de la propiedad de
	 */
	public String getIs_de() {
		return is_de;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad de.
	 *
	 * @param as_oficinaOrigen el nuevo valor para la propiedad de
	 */
	public void setIs_de(String as_de) {
		this.is_de = as_de;
	}

	/**
	 * Obtiene el valor para la propiedad para.
	 *
	 * @return El valor de la propiedad para
	 */
	public String getIs_para() {
		return is_para;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad para.
	 *
	 * @param as_oficinaOrigen el nuevo valor para la propiedad para
	 */
	public void setIs_para(String as_para) {
		this.is_para = as_para;
	}

	/**
	 * Obtiene el valor para la propiedad asunto.
	 *
	 * @return El valor de la propiedad asunto
	 */
	public String getIs_asunto() {
		return is_asunto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad asunto.
	 *
	 * @param as_oficinaOrigen el nuevo valor para la propiedad asunto
	 */
	public void setIs_asunto(String as_asunto) {
		this.is_asunto = as_asunto;
	}

	/**
	 * Obtiene el valor para la propiedad fecha asunto.
	 *
	 * @return El valor de la propiedad fecha asunto
	 */
	public Date getId_fechaAsunto() {
		return id_fechaAsunto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad fecha asunto.
	 *
	 * @param as_oficinaOrigen el nuevo valor para la propiedad fecha asunto
	 */
	public void setId_fechaAsunto(Date ad_fechaAsunto) {
		this.id_fechaAsunto = ad_fechaAsunto;
	}

	/**
	 * Obtiene el valor para la propiedad adjunto.
	 *
	 * @return El valor de la propiedad adjunto
	 */
	public String getIs_adjunto() {
		return is_adjunto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad adjunto.
	 *
	 * @param as_oficinaOrigen el nuevo valor para la propiedad adjunto
	 */
	public void setIs_adjunto(String as_adjunto) {
		this.is_adjunto = as_adjunto;
	}

	/**
	 * Obtiene el valor para la propiedad texto.
	 *
	 * @return El valor de la propiedad texto
	 */
	public String getIs_texto() {
		return is_texto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad texto.
	 *
	 * @param as_oficinaOrigen el nuevo valor para la propiedad texto
	 */
	public void setIs_texto(String as_texto) {
		this.is_texto = as_texto;
	}

}
