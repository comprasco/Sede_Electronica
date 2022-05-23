package co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.consultadrr;

import java.util.List;

public interface IResultadoDrrWSDTO {
	
	public String getIs_numAnotacion();
	public String getIs_comentario();
	public String getIs_fechaAnotacion();
	public String getIs_codNaturalezaJuridicaFolio();
	public String getIs_nomNaturalezaJuridicaFolio() ;
	public String getIs_dominioDRR() ;
	public List<IntervinienteWSDTO> getIli_intervinientes();
	
}
