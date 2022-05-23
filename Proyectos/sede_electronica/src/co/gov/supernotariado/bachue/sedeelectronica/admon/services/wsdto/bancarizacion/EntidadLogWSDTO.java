package co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.bancarizacion;

import java.util.Date;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoDTO;

public class EntidadLogWSDTO extends GenericoDTO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String is_codigo;
	private Date id_fecha;
	private String is_mensaje;
	private String is_mensajeTecnico;
	private String is_tipo;

	public String getIs_codigo() {
		return is_codigo;
	}
	public void setIs_codigo(String as_codigo) {
		this.is_codigo = as_codigo;
	}
	public Date getId_fecha() {
		return id_fecha;
	}
	public void setId_fecha(Date ad_fecha) {
		this.id_fecha = ad_fecha;
	}
	public String getIs_mensaje() {
		return is_mensaje;
	}
	public void setIs_mensaje(String as_mensaje) {
		this.is_mensaje = as_mensaje;
	}
	public String getIs_mensajeTecnico() {
		return is_mensajeTecnico;
	}
	public void setIs_mensajeTecnico(String as_mensajeTecnico) {
		this.is_mensajeTecnico = as_mensajeTecnico;
	}
	public String getIs_tipo() {
		return is_tipo;
	}
	public void setIs_tipo(String as_tipo) {
		this.is_tipo = as_tipo;
	}
	
}
