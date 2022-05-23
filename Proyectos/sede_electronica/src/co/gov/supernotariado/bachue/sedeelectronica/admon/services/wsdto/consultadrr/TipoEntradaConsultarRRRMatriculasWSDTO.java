
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.consultadrr;

import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;

public class TipoEntradaConsultarRRRMatriculasWSDTO extends ClienteIntegracionVO {

	private static final long serialVersionUID = 1L;

    protected String is_tipoIdentificacionPredio;
    protected String is_numIdentificacionPredio;

	public String getIs_tipoIdentificacionPredio() {
		return is_tipoIdentificacionPredio;
	}

	public void setIs_tipoIdentificacionPredio(String as_tipoIdentificacionPredio) {
		this.is_tipoIdentificacionPredio = as_tipoIdentificacionPredio;
	}

	public String getIs_numIdentificacionPredio() {
		return is_numIdentificacionPredio;
	}

	public void setIs_numIdentificacionPredio(String as_numIdentificacionPredio) {
		this.is_numIdentificacionPredio = as_numIdentificacionPredio;
	}    
}
