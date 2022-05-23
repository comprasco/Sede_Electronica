package co.gov.supernotariado.bachue.clientebus.vo.poderes.consultaPoderes;

import java.util.List;

import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;

public class TipoEntradaConsultarPoderVO extends ClienteIntegracionVO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String is_sistemaOrigen;
	private List<ParametroVO> ilp_parametros;
	
	public String getIs_sistemaOrigen() {
		return is_sistemaOrigen;
	}
	public void setIs_sistemaOrigen(String as_sistemaOrigen) {
		this.is_sistemaOrigen = as_sistemaOrigen;
	}
	public List<ParametroVO> getIlp_parametros() {
		return ilp_parametros;
	}
	public void setIlp_parametros(List<ParametroVO> alp_parametros) {
		this.ilp_parametros = alp_parametros;
	}

}
