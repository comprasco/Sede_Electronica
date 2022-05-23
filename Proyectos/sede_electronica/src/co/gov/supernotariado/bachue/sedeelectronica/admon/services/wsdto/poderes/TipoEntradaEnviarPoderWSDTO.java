package co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.poderes;

import java.util.List;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoDTO;

public class TipoEntradaEnviarPoderWSDTO extends GenericoDTO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String is_sistemaOrigen;
    private List<ParametrosWSDTO> ilp_parametros;
    private byte[] ib_archivo;
    private String is_nombreArchivo;
	private String is_dDocName;
	private String is_did;
    
	public String getIs_sistemaOrigen() {
		return is_sistemaOrigen;
	}
	public void setIs_sistemaOrigen(String as_sistemaOrigen) {
		this.is_sistemaOrigen = as_sistemaOrigen;
	}
	public List<ParametrosWSDTO> getIlp_parametros() {
		return ilp_parametros;
	}
	public void setIlp_parametros(List<ParametrosWSDTO> alp_parametros) {
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
