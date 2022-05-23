package com.bachue.snr.formularios.dto.comun;

import java.io.Serializable;

/**
 * 
 * @version 1.0
 * @author Smartsoft Solutions S.A.S
 * 
 */
public interface ISalidaGenericaDocumentoDTO extends Serializable{
	
	/**
	 * Metodo que permite consultar documento generado
	 * @return byte[] 
	 */
	public byte[] consultarDocumentoGenerado();
	
	/**
	 * Metodo que permite consultar la extension del documento generado
	 * @return
	 */
	public String consultarExtensionDocumento();
			
	
}
