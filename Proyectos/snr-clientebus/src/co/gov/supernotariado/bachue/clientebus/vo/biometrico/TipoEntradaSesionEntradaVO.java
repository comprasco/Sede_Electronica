package co.gov.supernotariado.bachue.clientebus.vo.biometrico;

import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;

public class TipoEntradaSesionEntradaVO extends ClienteIntegracionVO {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private SesionEntradaVO ise_sesionEntradaVo;

	public SesionEntradaVO getIse_sesionEntradaVo() {
		return ise_sesionEntradaVo;
	}
	public void setIse_sesionEntradaVo(SesionEntradaVO ase_sesionEntradaVo) {
		this.ise_sesionEntradaVo = ase_sesionEntradaVo;
	}
	
}
