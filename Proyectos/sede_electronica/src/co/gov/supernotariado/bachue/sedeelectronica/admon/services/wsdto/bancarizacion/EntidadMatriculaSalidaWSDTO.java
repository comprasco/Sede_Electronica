package co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.bancarizacion;

import java.util.List;

import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;

public class EntidadMatriculaSalidaWSDTO extends ClienteIntegracionVO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String is_estado;
	private EntidadLogWSDTO iel_log;
	private List<RespuestaConsultarInformacionMatriculaWSDTO> ilrcim_resultados;

	public String getIs_estado() {
		return is_estado;
	}
	public void setIs_estado(String as_estado) {
		this.is_estado = as_estado;
	}
	public EntidadLogWSDTO getIel_log() {
		return iel_log;
	}
	public void setIel_log(EntidadLogWSDTO ael_log) {
		this.iel_log = ael_log;
	}
	public List<RespuestaConsultarInformacionMatriculaWSDTO> getIlrcim_resultados() {
		return ilrcim_resultados;
	}
	public void setIlrcim_resultados(List<RespuestaConsultarInformacionMatriculaWSDTO> alrcim_resultados) {
		this.ilrcim_resultados = alrcim_resultados;
	}    

}
