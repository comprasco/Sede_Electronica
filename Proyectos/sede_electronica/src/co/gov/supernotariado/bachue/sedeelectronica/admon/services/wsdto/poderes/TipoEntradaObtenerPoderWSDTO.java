package co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.poderes;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoDTO;

public class TipoEntradaObtenerPoderWSDTO extends GenericoDTO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String is_dDocName;
	private String is_did;

	public String getIs_dDocName() {
		return is_dDocName;
	}
	public void setIs_dDocName(String as_dDocName) {
		this.is_dDocName = as_dDocName;
	}
	public String getIs_did() {
		return is_did;
	}
	public void setIs_did(String as_did) {
		this.is_did = as_did;
	}
}
