/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: CorreccionDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: CorreccionDTO
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
 * Contiene propiedades para representar los datos del objeto Correccion.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class CorreccionDTO extends GenericoDTO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo MatriculaDTO para definir la propiedad matricula.
	 */
	private MatriculaDTO im_matriculaDto;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nupre.
	 */
	private String is_nupre;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * estado solicitud.
	 */
	private String is_estadoSolicitud;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * turno.
	 */
	private String is_turno;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * respuesta.
	 */
	private String is_respuesta;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo correccion.
	 */
	private String is_tipoCorreccion;
	
	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad llenado.
	 */
	private Boolean ib_llenado;
	
	/**
	 * Atributo de instancia tipo fecha para definir la propiedad fecha solicitud.
	 */
	private Date id_fechaSolicitud;
	
	/**
	 * Atributo de instancia tipo lista de TipoCorreccionDTO para definir la
	 * propiedad lista tipo correccion.
	 */
	private List<TipoCorreccionDTO> iltc_listaTipoCorreccionDto;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * direccion predio.
	 */
	//New
	private String is_direccionPredio;

	/**
	 * Obtiene el valor para la propiedad matricula dto.
	 *
	 * @return El valor de la propiedad matricula dto
	 */
	public MatriculaDTO getIm_matriculaDto() {
		return im_matriculaDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad matricula dto.
	 *
	 * @param am_matriculaDto el nuevo valor para la propiedad matricula dto
	 */
	public void setIm_matriculaDto(MatriculaDTO am_matriculaDto) {
		this.im_matriculaDto = am_matriculaDto;
	}

	/**
	 * Obtiene el valor para la propiedad estado solicitud.
	 *
	 * @return El valor de la propiedad estado solicitud
	 */
	public String getIs_estadoSolicitud() {
		return is_estadoSolicitud;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad estado solicitud.
	 *
	 * @param as_estadoSolicitud el nuevo valor para la propiedad estado solicitud
	 */
	public void setIs_estadoSolicitud(String as_estadoSolicitud) {
		this.is_estadoSolicitud = as_estadoSolicitud;
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
	 * @param as_turno el nuevo valor para la propiedad turno
	 */
	public void setIs_turno(String as_turno) {
		this.is_turno = as_turno;
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
	 * Obtiene el valor para la propiedad respuesta.
	 *
	 * @return El valor de la propiedad respuesta
	 */
	public String getIs_respuesta() {
		return is_respuesta;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad respuesta.
	 *
	 * @param as_respuesta el nuevo valor para la propiedad respuesta
	 */
	public void setIs_respuesta(String as_respuesta) {
		this.is_respuesta = as_respuesta;
	}

	/**
	 * Obtiene el valor para la propiedad tipo correccion.
	 *
	 * @return El valor de la propiedad tipo correccion
	 */
	public String getIs_tipoCorreccion() {
		return is_tipoCorreccion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo correccion.
	 *
	 * @param as_tipoCorreccion el nuevo valor para la propiedad tipo correccion
	 */
	public void setIs_tipoCorreccion(String as_tipoCorreccion) {
		this.is_tipoCorreccion = as_tipoCorreccion;
	}

	/**
	 * Obtiene el valor para la propiedad direccion predio.
	 *
	 * @return El valor de la propiedad direccion predio
	 */
	public String getIs_direccionPredio() {
		return is_direccionPredio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad direccion predio.
	 *
	 * @param as_direccionPredio el nuevo valor para la propiedad direccion predio
	 */
	public void setIs_direccionPredio(String as_direccionPredio) {
		this.is_direccionPredio = as_direccionPredio;
	}

	/**
	 * Obtiene el valor para la propiedad nupre.
	 *
	 * @return El valor de la propiedad nupre
	 */
	public String getIs_nupre() {
		return is_nupre;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nupre.
	 *
	 * @param as_nupre el nuevo valor para la propiedad nupre
	 */
	public void setIs_nupre(String as_nupre) {
		this.is_nupre = as_nupre;
	}

	/**
	 * Obtiene el valor para la propiedad lista tipo correccion dto.
	 *
	 * @return El valor de la propiedad lista tipo correccion dto
	 */
	public List<TipoCorreccionDTO> getIltc_listaTipoCorreccionDto() {
		return iltc_listaTipoCorreccionDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista tipo correccion dto.
	 *
	 * @param altc_listaTipoCorreccionDto el nuevo valor para la propiedad lista
	 *                                    tipo correccion dto
	 */
	public void setIltc_listaTipoCorreccionDto(List<TipoCorreccionDTO> altc_listaTipoCorreccionDto) {
		this.iltc_listaTipoCorreccionDto = altc_listaTipoCorreccionDto;
	}

	/**
	 * Obtiene el valor para la propiedad llenado.
	 *
	 * @return El valor de la propiedad llenado
	 */
	public Boolean getIb_llenado() {
		return ib_llenado;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad llenado.
	 *
	 * @param ab_llenado el nuevo valor para la propiedad llenado
	 */
	public void setIb_llenado(Boolean ab_llenado) {
		this.ib_llenado = ab_llenado;
	}

}
