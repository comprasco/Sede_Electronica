package co.gov.supernotariado.bachue.clientebus.vo.poderes.consultaPoderes;

import java.util.List;

import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;


public class TipoSalidaConsultarPoderVO extends ClienteIntegracionVO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<DocumentoVO> ild_documentosVo;

	public List<DocumentoVO> getIld_documentosVo() {
		return ild_documentosVo;
	}

	public void setIld_documentosVo(List<DocumentoVO> ald_documentosVo) {
		this.ild_documentosVo = ald_documentosVo;
	}

}
