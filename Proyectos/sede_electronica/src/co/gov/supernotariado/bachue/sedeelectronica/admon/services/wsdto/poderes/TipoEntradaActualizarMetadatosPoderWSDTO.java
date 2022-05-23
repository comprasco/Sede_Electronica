package co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.poderes;

import java.util.List;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoDTO;

public class TipoEntradaActualizarMetadatosPoderWSDTO extends GenericoDTO{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String is_sistemaOrigen;
    private String is_dDocName;
    private List<ParametroWSDTO> ilp_parametros;
    
	public String getIs_sistemaOrigen() {
		return is_sistemaOrigen;
	}
	public void setIs_sistemaOrigen(String as_sistemaOrigen) {
		this.is_sistemaOrigen = as_sistemaOrigen;
	}
	public String getIs_dDocName() {
		return is_dDocName;
	}
	public void setIs_dDocName(String as_dDocName) {
		this.is_dDocName = as_dDocName;
	}
	public List<ParametroWSDTO> getIlp_parametros() {
		return ilp_parametros;
	}
	public void setIlp_parametros(List<ParametroWSDTO> alp_parametros) {
		this.ilp_parametros = alp_parametros;
	}

}
