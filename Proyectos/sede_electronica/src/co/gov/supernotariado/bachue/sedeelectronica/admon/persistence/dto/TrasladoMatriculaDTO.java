/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TransaccionCorreccionDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: TransaccionCorreccionDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

import java.util.Date;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto 
 * trasladao matricula.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TrasladoMatriculaDTO extends TransaccionSinPagoGenericaDTO {

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
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad llenado.
	 */
	private Boolean ib_llenado;
	
	/**
	 * Atributo de instancia tipo fecha para definir la propiedad fecha solicitud.
	 */
	private Date id_fechaSolicitud;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * observacion.
	 */
	private String is_observacion;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * direccion predio.
	 */
	//New
	private String is_direccionPredio;
	
	/**
	 * Atributo de instancia tipo CirculoRegistralDTO para definir la propiedad
	 * circulo registral matricula.
	 */
	private CirculoRegistralDTO icr_circuloRegistralDestinoDto;

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

	/**
	 * Obtiene el valor para la propiedad observacion.
	 *
	 * @return El valor de la propiedad observacion
	 */

	public String getIs_observacion() {
		return is_observacion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad observacion.
	 *
	 * @param as_nupre el nuevo valor para la propiedad observacion
	 */
	public void setIs_observacion(String as_observacion) {
		this.is_observacion = as_observacion;
	}

	/**
	 * Obtiene el valor para la propiedad circulo registral matricula.
	 *
	 * @return El valor de la propiedad circulo registral matricula
	 */
	public CirculoRegistralDTO getIcr_circuloRegistralDestinoDto() {
		return icr_circuloRegistralDestinoDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad circulo registral matricula.
	 *
	 * @param acr_circuloRegistralMatricula el nuevo valor para la propiedad circulo
	 *                                      registral matricula
	 */
	public void setIcr_circuloRegistralDestinoDto(CirculoRegistralDTO acr_circuloRegistralDestinoDto) {
		this.icr_circuloRegistralDestinoDto = acr_circuloRegistralDestinoDto;
	}
	
}
