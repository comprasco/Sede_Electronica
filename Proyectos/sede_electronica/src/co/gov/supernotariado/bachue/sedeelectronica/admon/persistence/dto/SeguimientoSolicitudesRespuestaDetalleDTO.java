/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: SeguimientoSolicitudesRespuestaDetalleDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: SeguimientoSolicitudesRespuestaDetalleDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

import java.util.Date;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Seguimiento
 * solicitudes respuesta detalle.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class SeguimientoSolicitudesRespuestaDetalleDTO extends GenericoDTO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero turno.
	 */
	private String is_numeroTurno;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * oficina registro.
	 */
	private String is_oficinaRegistro;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * etapa.
	 */
	private String is_etapa;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre etapa.
	 */
	private String is_nombreEtapa;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * estado actividad.
	 */
	private String is_estadoActividad;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * usuario.
	 */
	private String is_usuario;
	
	/**
	 * Atributo de instancia tipo Date para definir la propiedad fecha asignacion.
	 */
	private Date is_fechaAsignacion;
	
	/**
	 * Atributo de instancia tipo Date para definir la propiedad fecha reparto.
	 */
	private Date is_fechaReparto;
	
	/**
	 * Atributo de instancia tipo Date para definir la propiedad fecha inicio etapa.
	 */
	private Date is_fechaInicioEtapa;
	
	/**
	 * Atributo de instancia tipo Date para definir la propiedad fecha final etapa.
	 */
	private Date is_fechaFinalEtapa;

	/**
	 * Obtiene el valor para la propiedad numero turno.
	 *
	 * @return El valor de la propiedad numero turno
	 */
	public String getIs_numeroTurno() {
		return is_numeroTurno;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad numero turno.
	 *
	 * @param as_numeroTurno el nuevo valor para la propiedad numero turno
	 */
	public void setIs_numeroTurno(String as_numeroTurno) {
		this.is_numeroTurno = as_numeroTurno;
	}

	/**
	 * Obtiene el valor para la propiedad oficina registro.
	 *
	 * @return El valor de la propiedad oficina registro
	 */
	public String getIs_oficinaRegistro() {
		return is_oficinaRegistro;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad oficina registro.
	 *
	 * @param as_oficinaRegistro el nuevo valor para la propiedad oficina registro
	 */
	public void setIs_oficinaRegistro(String as_oficinaRegistro) {
		this.is_oficinaRegistro = as_oficinaRegistro;
	}

	/**
	 * Obtiene el valor para la propiedad etapa.
	 *
	 * @return El valor de la propiedad etapa
	 */
	public String getIs_etapa() {
		return is_etapa;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad etapa.
	 *
	 * @param as_etapa el nuevo valor para la propiedad etapa
	 */
	public void setIs_etapa(String as_etapa) {
		this.is_etapa = as_etapa;
	}

	/**
	 * Obtiene el valor para la propiedad nombre etapa.
	 *
	 * @return El valor de la propiedad nombre etapa
	 */
	public String getIs_nombreEtapa() {
		return is_nombreEtapa;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nombre etapa.
	 *
	 * @param as_nombreEtapa el nuevo valor para la propiedad nombre etapa
	 */
	public void setIs_nombreEtapa(String as_nombreEtapa) {
		this.is_nombreEtapa = as_nombreEtapa;
	}

	/**
	 * Obtiene el valor para la propiedad estado actividad.
	 *
	 * @return El valor de la propiedad estado actividad
	 */
	public String getIs_estadoActividad() {
		return is_estadoActividad;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad estado actividad.
	 *
	 * @param as_estadoActividad el nuevo valor para la propiedad estado actividad
	 */
	public void setIs_estadoActividad(String as_estadoActividad) {
		this.is_estadoActividad = as_estadoActividad;
	}

	/**
	 * Obtiene el valor para la propiedad usuario.
	 *
	 * @return El valor de la propiedad usuario
	 */
	public String getIs_usuario() {
		return is_usuario;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad usuario.
	 *
	 * @param as_usuario el nuevo valor para la propiedad usuario
	 */
	public void setIs_usuario(String as_usuario) {
		this.is_usuario = as_usuario;
	}

	/**
	 * Obtiene el valor para la propiedad fecha asignacion.
	 *
	 * @return El valor de la propiedad fecha asignacion
	 */
	public Date getIs_fechaAsignacion() {
		return is_fechaAsignacion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad fecha asignacion.
	 *
	 * @param as_fechaAsignacion el nuevo valor para la propiedad fecha asignacion
	 */
	public void setIs_fechaAsignacion(Date as_fechaAsignacion) {
		this.is_fechaAsignacion = as_fechaAsignacion;
	}

	/**
	 * Obtiene el valor para la propiedad fecha reparto.
	 *
	 * @return El valor de la propiedad fecha reparto
	 */
	public Date getIs_fechaReparto() {
		return is_fechaReparto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad fecha reparto.
	 *
	 * @param as_fechaReparto el nuevo valor para la propiedad fecha reparto
	 */
	public void setIs_fechaReparto(Date as_fechaReparto) {
		this.is_fechaReparto = as_fechaReparto;
	}

	/**
	 * Obtiene el valor para la propiedad fecha inicio etapa.
	 *
	 * @return El valor de la propiedad fecha inicio etapa
	 */
	public Date getIs_fechaInicioEtapa() {
		return is_fechaInicioEtapa;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad fecha inicio etapa.
	 *
	 * @param as_fechaInicioEtapa el nuevo valor para la propiedad fecha inicio
	 *                            etapa
	 */
	public void setIs_fechaInicioEtapa(Date as_fechaInicioEtapa) {
		this.is_fechaInicioEtapa = as_fechaInicioEtapa;
	}

	/**
	 * Obtiene el valor para la propiedad fecha final etapa.
	 *
	 * @return El valor de la propiedad fecha final etapa
	 */
	public Date getIs_fechaFinalEtapa() {
		return is_fechaFinalEtapa;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad fecha final etapa.
	 *
	 * @param is_fechaFinalEtapa el nuevo valor para la propiedad fecha final etapa
	 */
	public void setIs_fechaFinalEtapa(Date is_fechaFinalEtapa) {
		this.is_fechaFinalEtapa = is_fechaFinalEtapa;
	}

}
