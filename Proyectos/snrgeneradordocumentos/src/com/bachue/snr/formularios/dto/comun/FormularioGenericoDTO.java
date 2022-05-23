package com.bachue.snr.formularios.dto.comun;

import java.io.Serializable;

/**
 * 
 * @version 1.0
 * @author Smartsoft Solutions S.A.S
 * Clase generica DTO formularios
 * 
 */
public class FormularioGenericoDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String is_nombreFormulario;

	public String getLs_nombreFormulario() {
		return is_nombreFormulario;
	}
	
	public void setLs_nombreFormulario(String as_nombreFormulario) {
		this.is_nombreFormulario = as_nombreFormulario;
	}

}
