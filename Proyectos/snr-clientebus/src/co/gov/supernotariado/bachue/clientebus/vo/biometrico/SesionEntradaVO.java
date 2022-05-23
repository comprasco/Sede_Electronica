package co.gov.supernotariado.bachue.clientebus.vo.biometrico;

import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;

public class SesionEntradaVO extends ClienteIntegracionVO{
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	private String is_sesion;
	
	public String getIs_sesion() {
		return is_sesion;
	}
	public void setIs_sesion(String as_sesion) {
		this.is_sesion = as_sesion;
	}
}
