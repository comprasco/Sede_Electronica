package co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.bancarizacion;

import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;

public class BancarizacionEntradaBaseWSDTO extends ClienteIntegracionVO{
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String is_usuarioWS;
    private String is_claveWS;
    private String is_codigoConvenio;
    private String is_codigoServicio;
    
	public String getIs_usuarioWS() {
		return is_usuarioWS;
	}
	public void setIs_usuarioWS(String as_usuarioWS) {
		this.is_usuarioWS = as_usuarioWS;
	}
	public String getIs_claveWS() {
		return is_claveWS;
	}
	public void setIs_claveWS(String as_claveWS) {
		this.is_claveWS = as_claveWS;
	}
	public String getIs_codigoConvenio() {
		return is_codigoConvenio;
	}
	public void setIs_codigoConvenio(String as_codigoConvenio) {
		this.is_codigoConvenio = as_codigoConvenio;
	}
	public String getIs_codigoServicio() {
		return is_codigoServicio;
	}
	public void setIs_codigoServicio(String as_codigoServicio) {
		this.is_codigoServicio = as_codigoServicio;
	} 
    
}
