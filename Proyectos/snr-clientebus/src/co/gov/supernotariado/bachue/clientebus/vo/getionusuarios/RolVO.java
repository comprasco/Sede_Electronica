package co.gov.supernotariado.bachue.clientebus.vo.getionusuarios;

import java.io.Serializable;



public class RolVO implements Serializable{

	/**
	 * 
	 */
    	
	private static final long serialVersionUID = 1L;
	private String is_codigoRol;
    private String is_nombreRol;
    private String is_componente;
    
    public String getIs_componente() {
		return is_componente;
	}
	public void setIs_componente(String as_componente) {
		this.is_componente = as_componente;
	}
	public String getIs_codigoRol() {
		return is_codigoRol;
	}
	public void setIs_codigoRol(String as_codigoRol) {
		this.is_codigoRol = as_codigoRol;
	}
	public String getIs_nombreRol() {
		return is_nombreRol;
	}
	public void setIs_nombreRol(String as_nombreRol) {
		this.is_nombreRol = as_nombreRol;
	}


}
