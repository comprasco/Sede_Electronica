package co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto;

import java.util.List;

import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.bancarizacion.BancarizacionEntradaBaseWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.bancarizacion.EntidadMatriculaWSDTO;

public class GenerarTransaccionExtendidaWSDTO extends BancarizacionEntradaBaseWSDTO {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<EntidadMatriculaWSDTO> ilem_matriculas;
	private String is_codigoSeguimiento;
	
	public List<EntidadMatriculaWSDTO> getIlem_matriculas() {
		return ilem_matriculas;
	}
	public void setIlem_matriculas(List<EntidadMatriculaWSDTO> alem_matriculas) {
		this.ilem_matriculas = alem_matriculas;
	}
	public String getIs_codigoSeguimiento() {
		return is_codigoSeguimiento;
	}
	public void setIs_codigoSeguimiento(String as_codigoSeguimiento) {
		this.is_codigoSeguimiento = as_codigoSeguimiento;
	}	

}
