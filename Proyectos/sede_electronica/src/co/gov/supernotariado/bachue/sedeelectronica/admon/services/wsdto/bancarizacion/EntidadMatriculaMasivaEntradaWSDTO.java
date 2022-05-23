package co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.bancarizacion;

import java.util.List;

import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;

public class EntidadMatriculaMasivaEntradaWSDTO extends ClienteIntegracionVO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<EntidadMatriculaWSDTO> ilem_listaEntidadMatricula;

	public List<EntidadMatriculaWSDTO> getIlem_listaEntidadMatricula() {
		return ilem_listaEntidadMatricula;
	}

	public void setIlem_listaEntidadMatricula(List<EntidadMatriculaWSDTO> alem_listaEntidadMatricula) {
		this.ilem_listaEntidadMatricula = alem_listaEntidadMatricula;
	}


}
