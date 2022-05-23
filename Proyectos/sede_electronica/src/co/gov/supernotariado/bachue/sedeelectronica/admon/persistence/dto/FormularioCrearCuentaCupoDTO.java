/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: FormularioCrearCuentaCupoDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: FormularioCrearCuentaCupoDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Formulario crear
 * cuenta cupo.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class FormularioCrearCuentaCupoDTO extends FormularioGenericoDTO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * ocupacion profesion.
	 */
	private String is_ocupacionProfesion;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * descripcion actividad economica.
	 */
	private String is_descripcionActividadEconomica;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo actividad economica.
	 */
	private String is_codigoActividadEconomica;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * monto solicitado.
	 */
	private String is_montoSolicitado;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * frecuencia recarga.
	 */
	private String is_frecuenciaRecarga;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * necesidad solicitud.
	 */
	private String is_necesidadSolicitud;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * declaracion juramentada.
	 */
	private String is_declaracionJuramentada;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * correo.
	 */
	private String is_correo;

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * FormularioCrearCuentaCupoDTO.
	 */
	public FormularioCrearCuentaCupoDTO() {
		setIs_tipoDocumentoRepresentanteLegal("");
		setIs_numeroDocumentoRepresentanteLegal("");
		setIs_digitoVerificacion("");
		is_ocupacionProfesion = "";
		is_descripcionActividadEconomica = "";
		is_montoSolicitado = "";
		is_frecuenciaRecarga = "";
		is_necesidadSolicitud = "";
		is_declaracionJuramentada = "";
	}

	/**
	 * Obtiene el valor para la propiedad ocupacion profesion.
	 *
	 * @return El valor de la propiedad ocupacion profesion
	 */
	public String getIs_ocupacionProfesion() {
		return is_ocupacionProfesion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad ocupacion profesion.
	 *
	 * @param as_ocupacionProfesion el nuevo valor para la propiedad ocupacion
	 *                              profesion
	 */
	public void setIs_ocupacionProfesion(String as_ocupacionProfesion) {
		this.is_ocupacionProfesion = as_ocupacionProfesion;
	}

	/**
	 * Obtiene el valor para la propiedad descripcion actividad economica.
	 *
	 * @return El valor de la propiedad descripcion actividad economica
	 */
	public String getIs_descripcionActividadEconomica() {
		return is_descripcionActividadEconomica;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad descripcion actividad economica.
	 *
	 * @param as_descripcionActividadEconomica el nuevo valor para la propiedad
	 *                                         descripcion actividad economica
	 */
	public void setIs_descripcionActividadEconomica(String as_descripcionActividadEconomica) {
		this.is_descripcionActividadEconomica = as_descripcionActividadEconomica;
	}

	/**
	 * Obtiene el valor para la propiedad monto solicitado.
	 *
	 * @return El valor de la propiedad monto solicitado
	 */
	public String getIs_montoSolicitado() {
		return is_montoSolicitado;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad monto solicitado.
	 *
	 * @param as_montoSolicitado el nuevo valor para la propiedad monto solicitado
	 */
	public void setIs_montoSolicitado(String as_montoSolicitado) {
		this.is_montoSolicitado = as_montoSolicitado;
	}

	/**
	 * Obtiene el valor para la propiedad frecuencia recarga.
	 *
	 * @return El valor de la propiedad frecuencia recarga
	 */
	public String getIs_frecuenciaRecarga() {
		return is_frecuenciaRecarga;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad frecuencia recarga.
	 *
	 * @param as_frecuenciaRecarga el nuevo valor para la propiedad frecuencia
	 *                             recarga
	 */
	public void setIs_frecuenciaRecarga(String as_frecuenciaRecarga) {
		this.is_frecuenciaRecarga = as_frecuenciaRecarga;
	}

	/**
	 * Obtiene el valor para la propiedad necesidad solicitud.
	 *
	 * @return El valor de la propiedad necesidad solicitud
	 */
	public String getIs_necesidadSolicitud() {
		return is_necesidadSolicitud;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad necesidad solicitud.
	 *
	 * @param as_necesidadSolicitud el nuevo valor para la propiedad necesidad
	 *                              solicitud
	 */
	public void setIs_necesidadSolicitud(String as_necesidadSolicitud) {
		this.is_necesidadSolicitud = as_necesidadSolicitud;
	}

	/**
	 * Obtiene el valor para la propiedad declaracion juramentada.
	 *
	 * @return El valor de la propiedad declaracion juramentada
	 */
	public String getIs_declaracionJuramentada() {
		return is_declaracionJuramentada;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad declaracion juramentada.
	 *
	 * @param as_declaracionJuramentada el nuevo valor para la propiedad declaracion
	 *                                  juramentada
	 */
	public void setIs_declaracionJuramentada(String as_declaracionJuramentada) {
		this.is_declaracionJuramentada = as_declaracionJuramentada;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.
	 * FormularioCuentaCupoGenericoDTO#getIs_correo()
	 */
	public String getIs_correo() {
		return is_correo;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.
	 * FormularioCuentaCupoGenericoDTO#setIs_correo(java.lang.String)
	 */
	public void setIs_correo(String as_correo) {
		this.is_correo = as_correo;
	}

	/**
	 * Obtiene el valor para la propiedad codigo actividad econimica.
	 *
	 * @return El valor de la propiedad codigo actividad econimica
	 */
	public String getIs_codigoActividadEconomica() {
		return is_codigoActividadEconomica;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad codigo actividad econimica.
	 *
	 * @param as_declaracionJuramentada el nuevo valor para la propiedad codigo
	 *                                  actividad econimica
	 */
	public void setIs_codigoActividadEconomica(String as_codigoActividadEconomica) {
		this.is_codigoActividadEconomica = as_codigoActividadEconomica;
	}

}