/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: HistorialSolicitudRegistroDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: HistorialSolicitudRegistroDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Historial
 * solicitud registro.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class HistorialSolicitudRegistroDTO extends GenericoBaseDTO {
	
	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad id
	 * usuario accion.
	 */
	private String is_idUsuarioAccion;
	
	/**
	 * Atributo de instancia tipo UsuarioDTO para definir la propiedad usuario
	 * accion.
	 */
	private UsuarioDTO iu_usuarioAccionDto;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * dato solicitud registro.
	 */
	private String is_datoSolicitudRegistro;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * estado solicitud.
	 */
	private String is_estadoSolicitud;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * observaciones.
	 */
	private String is_observaciones;

	/**
	 * Obtiene el valor para la propiedad id usuario accion.
	 *
	 * @return El valor de la propiedad id usuario accion
	 */
	public String getIs_idUsuarioAccion() {
		return is_idUsuarioAccion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id usuario accion.
	 *
	 * @param as_idUsuarioAccion el nuevo valor para la propiedad id usuario accion
	 */
	public void setIs_idUsuarioAccion(String as_idUsuarioAccion) {
		this.is_idUsuarioAccion = as_idUsuarioAccion;
	}

	/**
	 * Obtiene el valor para la propiedad usuario accion dto.
	 *
	 * @return El valor de la propiedad usuario accion dto
	 */
	public UsuarioDTO getIu_usuarioAccionDto() {
		return iu_usuarioAccionDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad usuario accion dto.
	 *
	 * @param au_usuarioAccionDto el nuevo valor para la propiedad usuario accion
	 *                            dto
	 */
	public void setIu_usuarioAccionDto(UsuarioDTO au_usuarioAccionDto) {
		this.iu_usuarioAccionDto = au_usuarioAccionDto;
	}

	/**
	 * Obtiene el valor para la propiedad dato solicitud registro.
	 *
	 * @return El valor de la propiedad dato solicitud registro
	 */
	public String getIs_datoSolicitudRegistro() {
		return is_datoSolicitudRegistro;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad dato solicitud registro.
	 *
	 * @param as_datoSolicitudRegistro el nuevo valor para la propiedad dato
	 *                                 solicitud registro
	 */
	public void setIs_datoSolicitudRegistro(String as_datoSolicitudRegistro) {
		this.is_datoSolicitudRegistro = as_datoSolicitudRegistro;
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
	 * Obtiene el valor para la propiedad observaciones.
	 *
	 * @return El valor de la propiedad observaciones
	 */
	public String getIs_observaciones() {
		return is_observaciones;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad observaciones.
	 *
	 * @param as_observaciones el nuevo valor para la propiedad observaciones
	 */
	public void setIs_observaciones(String as_observaciones) {
		this.is_observaciones = as_observaciones;
	}

}
