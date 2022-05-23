package com.bachue.snr.formularios.dto.comun;

import java.io.Serializable;

/**
 * 
 * @version 1.0
 * @author Smartsoft Solutions S.A.S
 * 
 */
public class ArchivoDinamicoDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private byte[] ib_archivoBase64;
	private String is_nombreArchivo;
	private String is_extension;
	
	public String getIs_nombreArchivo() {
		return is_nombreArchivo;
	}
	public void setIs_nombreArchivo(String as_nombreImagen) {
		this.is_nombreArchivo = as_nombreImagen;
	}
	public String getIs_extension() {
		return is_extension;
	}
	public void setIs_extension(String as_extension) {
		this.is_extension = as_extension;
	}
	public byte[] getIb_archivoBase64() {
		return ib_archivoBase64;
	}
	public void setIb_imagenBase64(byte[] ab_imagenBase64) {
		this.ib_archivoBase64 = ab_imagenBase64;
	}
	
}
