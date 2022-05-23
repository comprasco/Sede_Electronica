package com.bachue.snr.formularios.dto.comun;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;

/**
 * 
 * @version 1.0
 * @author Smartsoft Solutions S.A.S
 * 
 */
public class GenericoParametrosJasperDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Collection<?> ifg_formulario;
	private Map<String, Object> ihmso_parametros;
		
	public Collection<?> getIfg_formulario() {
		return ifg_formulario;
	}
	public void setIfg_formulario(Collection<?> afg_formulario) {
		this.ifg_formulario = afg_formulario;
	}
	public Map<String, Object> getIhmso_parametros() {
		return ihmso_parametros;
	}
	public void setIhmso_parametros(Map<String, Object> ahmso_parametros) {
		this.ihmso_parametros = ahmso_parametros;
	}
		
}
