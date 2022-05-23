package co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.bancarizacion;

import java.util.List;

public class EntidadConsultarCertificadosTransaccionWSDTO {

    /**
	 * 
	 */
	private List<EntidadConsultarCertificadoWSDTO> ilecc_certificados;
    private String is_estado;
    private EntidadLogWSDTO iel_log;
    
	public List<EntidadConsultarCertificadoWSDTO> getIlecc_certificados() {
		return ilecc_certificados;
	}
	public void setIlecc_certificados(List<EntidadConsultarCertificadoWSDTO> alecc_certificados) {
		this.ilecc_certificados = alecc_certificados;
	}
	public String getIs_estado() {
		return is_estado;
	}
	public void setIs_estado(String as_estado) {
		this.is_estado = as_estado;
	}
	public EntidadLogWSDTO getIel_log() {
		return iel_log;
	}
	public void setIel_log(EntidadLogWSDTO ael_entidadLogWSDTO) {
		this.iel_log = ael_entidadLogWSDTO;
	}
	
}
