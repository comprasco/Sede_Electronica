package co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoDTO;

/**
 * 
 * @version 1.0
 * @author Smartsoft Solutions S.A.S Nota: WSDTO que representa la entidad de clase
 * 
 */
public class TipoEntradaConsultaMigracionPredioWSDTO extends GenericoDTO {

	private static final long serialVersionUID = 1L;

	private String is_tipoIdentificacionPredio;
	private String is_numIdentificacionPredio;
	
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
