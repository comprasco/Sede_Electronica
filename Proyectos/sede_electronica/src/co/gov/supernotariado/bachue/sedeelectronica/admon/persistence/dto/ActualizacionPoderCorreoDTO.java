package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

public class ActualizacionPoderCorreoDTO extends GenericoDTO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	private String is_tipoSolicitud;
	private String is_identificacionOrigen;
	private String is_identificacionDestino;
	private String is_identificacionTipoSolicitud;
	private String is_observaciones;
	private String is_correoDestino;
	private String is_nombreOrigen;
	private String is_nombreDestino;
	
	public ActualizacionPoderCorreoDTO() {
		// Constructor vacio
	}
	
	public String getIs_tipoSolicitud() {
		return is_tipoSolicitud;
	}
	public void setIs_tipoSolicitud(String as_tipoSolicitud) {
		this.is_tipoSolicitud = as_tipoSolicitud;
	}
	public String getIs_identificacionOrigen() {
		return is_identificacionOrigen;
	}
	public void setIs_identificacionOrigen(String as_identificacionOrigen) {
		this.is_identificacionOrigen = as_identificacionOrigen;
	}
	public String getIs_identificacionDestino() {
		return is_identificacionDestino;
	}
	public void setIs_identificacionDestino(String as_identificacionDestino) {
		this.is_identificacionDestino = as_identificacionDestino;
	}
	public String getIs_identificacionTipoSolicitud() {
		return is_identificacionTipoSolicitud;
	}
	public void setIs_identificacionTipoSolicitud(String as_identificacionTipoSolicitud) {
		this.is_identificacionTipoSolicitud = as_identificacionTipoSolicitud;
	}
	public String getIs_observaciones() {
		return is_observaciones;
	}
	public void setIs_observaciones(String as_observaciones) {
		this.is_observaciones = as_observaciones;
	}

	public String getIs_correoDestino() {
		return is_correoDestino;
	}
	public void setIs_correoDestino(String as_correoDestino) {
		this.is_correoDestino = as_correoDestino;
	}

	public String getIs_nombreOrigen() {
		return is_nombreOrigen;
	}

	public void setIs_nombreOrigen(String as_nombreOrigen) {
		this.is_nombreOrigen = as_nombreOrigen;
	}

	public String getIs_nombreDestino() {
		return is_nombreDestino;
	}

	public void setIs_nombreDestino(String as_nombreDestino) {
		this.is_nombreDestino = as_nombreDestino;
	}

}
