/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: SolicitudRecuperacionClaveDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: SolicitudRecuperacionClaveDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

import java.util.Date;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Solicitud
 * recuperacion clave.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class SolicitudRecuperacionClaveDTO extends GenericoBaseDTO {
	
	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * clave temporal.
	 */
	// Atributos
	private String is_claveTemporal;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * clave temporal usada.
	 */
	private String is_claveTemporalUsada;
	
	/**
	 * Atributo de instancia tipo fecha para definir la propiedad fecha cierre
	 * solicitud.
	 */
	private Date id_fechaCierreSolicitud;

	/**
	 * Atributo de instancia tipo fecha para definir la propiedad fecha solicitud.
	 */
	private Date id_fechaSolicitud;
	
	/**
	 * Atributo de instancia tipo UsuarioDTO para definir la propiedad usuario.
	 */
	private UsuarioDTO iu_usuarioDto;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * uuid url recuperacion.
	 */
	private String is_uuidUrlRecuperacion;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * clave generica.
	 */
	private String is_claveGenerica;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad key
	 * url validacion.
	 */
	private String is_keyUrlValidacion;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo.
	 */
	private String is_codigo;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * clave.
	 */
	private String is_clave;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * clave confirmacion.
	 */
	private String is_claveConfirmacion;

	/**
	 * Obtiene el valor para la propiedad key url validacion.
	 *
	 * @return El valor de la propiedad key url validacion
	 */
	public String getIs_keyUrlValidacion() {
		return is_keyUrlValidacion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad key url validacion.
	 *
	 * @param as_keyUrlValidacion el nuevo valor para la propiedad key url
	 *                            validacion
	 */
	public void setIs_keyUrlValidacion(String as_keyUrlValidacion) {
		this.is_keyUrlValidacion = as_keyUrlValidacion;
	}

	/**
	 * Obtiene el valor para la propiedad codigo.
	 *
	 * @return El valor de la propiedad codigo
	 */
	public String getIs_codigo() {
		return is_codigo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad codigo.
	 *
	 * @param as_codigo el nuevo valor para la propiedad codigo
	 */
	public void setIs_codigo(String as_codigo) {
		this.is_codigo = as_codigo;
	}

	// Constructor

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * SolicitudRecuperacionClaveDTO.
	 */
	public SolicitudRecuperacionClaveDTO() {
		// Metodo constructor vacio para modelo DTO
	}

	// Getters-Setters

	/**
	 * Obtiene el valor para la propiedad clave temporal.
	 *
	 * @return El valor de la propiedad clave temporal
	 */
	public String getIs_claveTemporal() {
		return is_claveTemporal;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad clave temporal.
	 *
	 * @param as_claveTemporal el nuevo valor para la propiedad clave temporal
	 */
	public void setIs_claveTemporal(String as_claveTemporal) {
		this.is_claveTemporal = as_claveTemporal;
	}

	/**
	 * Obtiene el valor para la propiedad clave temporal usada.
	 *
	 * @return El valor de la propiedad clave temporal usada
	 */
	public String getIs_claveTemporalUsada() {
		return is_claveTemporalUsada;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad clave temporal usada.
	 *
	 * @param as_claveTemporalUsada el nuevo valor para la propiedad clave temporal
	 *                              usada
	 */
	public void setIs_claveTemporalUsada(String as_claveTemporalUsada) {
		this.is_claveTemporalUsada = as_claveTemporalUsada;
	}

	/**
	 * Obtiene el valor para la propiedad fecha cierre solicitud.
	 *
	 * @return El valor de la propiedad fecha cierre solicitud
	 */
	public Date getId_fechaCierreSolicitud() {
		return id_fechaCierreSolicitud;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad fecha cierre solicitud.
	 *
	 * @param ad_idfechaCierreSolicitud el nuevo valor para la propiedad fecha
	 *                                  cierre solicitud
	 */
	public void setId_fechaCierreSolicitud(Date ad_idfechaCierreSolicitud) {
		this.id_fechaCierreSolicitud = ad_idfechaCierreSolicitud;
	}

	/**
	 * Obtiene el valor para la propiedad fecha solicitud.
	 *
	 * @return El valor de la propiedad fecha solicitud
	 */
	public Date getId_fechaSolicitud() {
		return id_fechaSolicitud;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad fecha solicitud.
	 *
	 * @param ad_fechaSolicitud el nuevo valor para la propiedad fecha solicitud
	 */
	public void setId_fechaSolicitud(Date ad_fechaSolicitud) {
		this.id_fechaSolicitud = ad_fechaSolicitud;
	}

	/**
	 * Obtiene el valor para la propiedad usuario dto.
	 *
	 * @return El valor de la propiedad usuario dto
	 */
	public UsuarioDTO getIu_usuarioDto() {
		return iu_usuarioDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad usuario dto.
	 *
	 * @param au_usuarioDto el nuevo valor para la propiedad usuario dto
	 */
	public void setIu_usuarioDto(UsuarioDTO au_usuarioDto) {
		this.iu_usuarioDto = au_usuarioDto;
	}

	/**
	 * Obtiene el valor para la propiedad uuid url recuperacion.
	 *
	 * @return El valor de la propiedad uuid url recuperacion
	 */
	public String getIs_uuidUrlRecuperacion() {
		return is_uuidUrlRecuperacion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad uuid url recuperacion.
	 *
	 * @param as_uuidUrlRecuperacion el nuevo valor para la propiedad uuid url
	 *                               recuperacion
	 */
	public void setIs_uuidUrlRecuperacion(String as_uuidUrlRecuperacion) {
		this.is_uuidUrlRecuperacion = as_uuidUrlRecuperacion;
	}

	/**
	 * Obtiene el valor para la propiedad clave.
	 *
	 * @return El valor de la propiedad clave
	 */
	public String getIs_clave() {
		return is_clave;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad clave.
	 *
	 * @param as_clave el nuevo valor para la propiedad clave
	 */
	public void setIs_clave(String as_clave) {
		this.is_clave = as_clave;
	}

	/**
	 * Obtiene el valor para la propiedad clave confirmacion.
	 *
	 * @return El valor de la propiedad clave confirmacion
	 */
	public String getIs_claveConfirmacion() {
		return is_claveConfirmacion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad clave confirmacion.
	 *
	 * @param as_claveConfirmacion el nuevo valor para la propiedad clave
	 *                             confirmacion
	 */
	public void setIs_claveConfirmacion(String as_claveConfirmacion) {
		this.is_claveConfirmacion = as_claveConfirmacion;
	}

	/**
	 * Obtiene el valor para la propiedad clave generica.
	 *
	 * @return El valor de la propiedad clave generica
	 */
	public String getIs_claveGenerica() {
		return is_claveGenerica;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad clave generica.
	 *
	 * @param as_claveGenerica el nuevo valor para la propiedad clave generica
	 */
	public void setIs_claveGenerica(String as_claveGenerica) {
		this.is_claveGenerica = as_claveGenerica;
	}

}
