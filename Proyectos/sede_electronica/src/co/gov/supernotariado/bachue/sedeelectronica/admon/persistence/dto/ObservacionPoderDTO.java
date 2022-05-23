package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

import java.util.Date;

import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadFecha;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto observaciones Poder.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ObservacionPoderDTO extends GenericoDTO {

	private static final long serialVersionUID = 1L;

	private String is_observaciones;
	private Date id_fecha;
	private ArchivoDTO ia_archivoDto;
	private String is_idDocumento;
	private String is_fecha;
	private String is_did;
	private String is_notariaCreadora;
	private String is_tipoPoder;
	
	public String getIs_observaciones() {
		return is_observaciones;
	}
	public void setIs_observaciones(String as_observaciones) {
		this.is_observaciones = as_observaciones;
	}
	public ArchivoDTO getIa_archivoDto() {
		return ia_archivoDto;
	}
	public void setIa_archivoDto(ArchivoDTO aa_archivoDto) {
		this.ia_archivoDto = aa_archivoDto;
	}
	public String getIs_idDocumento() {
		return is_idDocumento;
	}
	public void setIs_idDocumento(String as_idDocumento) {
		this.is_idDocumento = as_idDocumento;
	}
	public Date getId_fecha() {
		return id_fecha;
	}
	public void setId_fecha(Date ad_fecha) {
		this.id_fecha = ad_fecha;
	}
	public String getIs_fecha() {
		if(is_fecha != null || id_fecha == null)
			return is_fecha;
		
		return UtilidadFecha.formatearFecha(getId_fecha());
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
	public String getIs_notariaCreadora() {
		return is_notariaCreadora;
	}
	public void setIs_notariaCreadora(String as_notariaCreadora) {
		this.is_notariaCreadora = as_notariaCreadora;
	}
	public String getIs_tipoPoder() {
		return is_tipoPoder;
	}
	public void setIs_tipoPoder(String as_tipoPoder) {
		this.is_tipoPoder = as_tipoPoder;
	}	
	
}
