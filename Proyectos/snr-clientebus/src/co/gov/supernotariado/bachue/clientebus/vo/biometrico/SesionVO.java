package co.gov.supernotariado.bachue.clientebus.vo.biometrico;

import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;

public class SesionVO extends ClienteIntegracionVO{
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String is_codigo;
    private String is_mensaje;
    private Boolean ib_resultado;
    private String is_sesion;
    
    
	public String getIs_codigo() {
		return is_codigo;
	}
	public void setIs_codigo(String as_codigo) {
		this.is_codigo = as_codigo;
	}
	public String getIs_mensaje() {
		return is_mensaje;
	}
	public void setIs_mensaje(String as_mensaje) {
		this.is_mensaje = as_mensaje;
	}
	public Boolean getIb_resultado() {
		return ib_resultado;
	}
	public void setIb_resultado(Boolean ab_resultado) {
		this.ib_resultado = ab_resultado;
	}
	public String getIs_sesion() {
		return is_sesion;
	}
	public void setIs_sesion(String as_sesion) {
		this.is_sesion = as_sesion;
	}
    
}
