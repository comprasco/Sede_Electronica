package co.gov.supernotariado.bachue.clientebus.vo.biometrico;

import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;

public class TipoSalidaSesionSalidaVO extends ClienteIntegracionVO {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	   	private SesionVO is_sesionVo;

		public SesionVO getIs_sesionVo() {
			return is_sesionVo;
		}

		public void setIs_sesionVo(SesionVO as_sesionVo) {
			this.is_sesionVo = as_sesionVo;
		}
	    
		
}
