package co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.bancarizacion;

import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;

public class RespuestaConsultarInformacionMatriculaWSDTO extends ClienteIntegracionVO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String is_direccion;
    private String is_estado;
    private String is_estadoGeneracion;
    private EntidadLogWSDTO iel_log;
    
	public String getIs_direccion() {
		return is_direccion;
	}
	public void setIs_direccion(String as_direccion) {
		this.is_direccion = as_direccion;
	}
	public String getIs_estado() {
		return is_estado;
	}
	public void setIs_estado(String as_estado) {
		this.is_estado = as_estado;
	}
	public String getIs_estadoGeneracion() {
		return is_estadoGeneracion;
	}
	public void setIs_estadoGeneracion(String as_estadoGeneracion) {
		this.is_estadoGeneracion = as_estadoGeneracion;
	}
	public EntidadLogWSDTO getIel_log() {
		return iel_log;
	}
	public void setIel_log(EntidadLogWSDTO ael_log) {
		this.iel_log = ael_log;
	}    
}
