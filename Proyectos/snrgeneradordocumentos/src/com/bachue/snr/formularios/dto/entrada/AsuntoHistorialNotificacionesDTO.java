package com.bachue.snr.formularios.dto.entrada;

import java.util.Date;
import java.util.List;

import com.bachue.snr.formularios.dto.comun.ArchivoDinamicoDTO;
import com.bachue.snr.formularios.dto.comun.FormularioGenericoDTO;

/**
 * com.bachue.snr.formularios.dto.entrada.AsuntoHistorialNotificacionesDTO
 * 
 * @version 1.0
 * @author Smartsoft Solutions S.A.S
 * 
 */
public class AsuntoHistorialNotificacionesDTO extends FormularioGenericoDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String de;
	private String para;
	private String asunto;
	private Date fecha;
	private String adjunto;
	private String texto;
	private List<ArchivoDinamicoDTO> imagenes;

	public AsuntoHistorialNotificacionesDTO() {
		// Metodo constructor publico
	}

	public String getDe() {
		return de;
	}

	public void setDe(String de) {
		this.de = de;
	}

	public String getPara() {
		return para;
	}

	public void setPara(String para) {
		this.para = para;
	}

	public String getAsunto() {
		return asunto;
	}

	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getAdjunto() {
		return adjunto;
	}

	public void setAdjunto(String adjunto) {
		this.adjunto = adjunto;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public List<ArchivoDinamicoDTO> getArchivo() {
		return imagenes;
	}

	public void setImagenes(List<ArchivoDinamicoDTO> imagenes) {
		this.imagenes = imagenes;
	}
	
	public List<ArchivoDinamicoDTO> getImagenes() {
		return imagenes;
	}

}
