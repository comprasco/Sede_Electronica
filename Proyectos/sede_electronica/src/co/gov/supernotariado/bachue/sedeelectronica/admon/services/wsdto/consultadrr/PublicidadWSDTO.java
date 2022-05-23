package co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.consultadrr;

import java.util.List;

import co.gov.supernotariado.bachue.clientebus.vo.GenericoVO;

public class PublicidadWSDTO extends GenericoVO  implements IResultadoDrrWSDTO{
	
	private static final long serialVersionUID = 1L;
	private String is_numAnotacion;
	private String is_comentario;
	private String is_fechaAnotacion;
	private String is_codNaturalezaJuridicaFolio;
	private String is_nomNaturalezaJuridicaFolio;
	private String is_dominioDRR;
	private List<IntervinienteWSDTO> ili_intervinientes;

	public String getIs_numAnotacion() {
		return is_numAnotacion;
	}
	public void setIs_numAnotacion(String as_numAnotacion) {
		this.is_numAnotacion = as_numAnotacion;
	}
	public String getIs_comentario() {
		return is_comentario;
	}
	public void setIs_comentario(String as_comentario) {
		this.is_comentario = as_comentario;
	}
	public String getIs_codNaturalezaJuridicaFolio() {
		return is_codNaturalezaJuridicaFolio;
	}
	public void setIs_codNaturalezaJuridicaFolio(String as_codNaturalezaJuridicaFolio) {
		this.is_codNaturalezaJuridicaFolio = as_codNaturalezaJuridicaFolio;
	}
	public String getIs_nomNaturalezaJuridicaFolio() {
		return is_nomNaturalezaJuridicaFolio;
	}
	public void setIs_nomNaturalezaJuridicaFolio(String as_nomNaturalezaJuridicaFolio) {
		this.is_nomNaturalezaJuridicaFolio = as_nomNaturalezaJuridicaFolio;
	}
	public String getIs_dominioDRR() {
		return is_dominioDRR;
	}
	public void setIs_dominioDRR(String as_dominioDRR) {
		this.is_dominioDRR = as_dominioDRR;
	}
	public List<IntervinienteWSDTO> getIli_intervinientes() {
		return ili_intervinientes;
	}
	public void setIli_intervinientes(List<IntervinienteWSDTO> ali_intervinientes) {
		this.ili_intervinientes = ali_intervinientes;
	}
	public String getIs_fechaAnotacion() {
		return is_fechaAnotacion;
	}
	public void setIs_fechaAnotacion(String as_fechaAnotacion) {
		this.is_fechaAnotacion = as_fechaAnotacion;
	}

}
