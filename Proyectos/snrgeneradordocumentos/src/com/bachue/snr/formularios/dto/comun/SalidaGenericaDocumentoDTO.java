package com.bachue.snr.formularios.dto.comun;

/**
 * 
 * @version 1.0
 * @author Smartsoft Solutions S.A.S
 * 
 */
public class SalidaGenericaDocumentoDTO implements ISalidaGenericaDocumentoDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private byte[] ib_documentoGenerado;
	private String is_extension;

	@Override
	public byte[] consultarDocumentoGenerado() {
		return ib_documentoGenerado;
	}

	@Override
	public String consultarExtensionDocumento() {
		return is_extension;
	}

	public byte[] getIb_documentoGenerado() {
		return ib_documentoGenerado;
	}

	public void setIb_documentoGenerado(byte[] ib_documentoGenerado) {
		this.ib_documentoGenerado = ib_documentoGenerado;
	}

	public String getIs_extension() {
		return is_extension;
	}

	public void setIs_extension(String is_extension) {
		this.is_extension = is_extension;
	}
	
	
}