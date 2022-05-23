package co.gov.supernotariado.bachue.clientebus.vo.poderes.envioPoderes;

import java.util.List;

import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;

public class TipoEntradaEnviarPoderVO extends ClienteIntegracionVO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String is_sistemaOrigen;
    private List<ParametrosVO> ilp_parametros;
    private byte[] ib_archivo;
    private String is_nombreArchivo;
    
	public String getIs_sistemaOrigen() {
		return is_sistemaOrigen;
	}
	public void setIs_sistemaOrigen(String as_sistemaOrigen) {
		this.is_sistemaOrigen = as_sistemaOrigen;
	}
	public List<ParametrosVO> getIlp_parametros() {
		return ilp_parametros;
	}
	public void setIlp_parametros(List<ParametrosVO> alp_parametros) {
		this.ilp_parametros = alp_parametros;
	}
	public byte[] getIb_archivo() {
		return ib_archivo;
	}
	public void setIb_archivo(byte[] ab_archivo) {
		this.ib_archivo = ab_archivo;
	}
	public String getIs_nombreArchivo() {
		return is_nombreArchivo;
	}
	public void setIs_nombreArchivo(String as_nombreArchivo) {
		this.is_nombreArchivo = as_nombreArchivo;
	}

}
