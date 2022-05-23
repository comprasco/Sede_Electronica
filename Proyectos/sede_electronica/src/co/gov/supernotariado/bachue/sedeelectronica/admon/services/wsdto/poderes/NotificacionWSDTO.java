package co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.poderes;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoDTO;

public class NotificacionWSDTO extends GenericoDTO{

	private static final long serialVersionUID = 1L;
	
	private String is_notificacion;
	private String is_fecha;
	private String is_did;
	private String is_nombreNotaria;
	
	public NotificacionWSDTO() {
		// Metodo vacio
	}
	
	public String getIs_notificacion() {
		return is_notificacion;
	}
	public void setIs_notificacion(String as_notificacion) {
		this.is_notificacion = as_notificacion;
	}

	public String getIs_fecha() {
		return is_fecha;
	}
	public void setIs_fecha(String as_fecha) {
		this.is_fecha = as_fecha;
	}
	public String getIs_did() {
		return is_did;
	}
	public void setIs_did(String as_did) {
		this.is_did = as_did;
	}

	public String getIs_nombreNotaria() {
		return is_nombreNotaria;
	}

	public void setIs_nombreNotaria(String as_nombreNotaria) {
		this.is_nombreNotaria = as_nombreNotaria;
	}
	

}
