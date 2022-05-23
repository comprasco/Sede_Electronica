package co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto;

import java.io.Serializable;

import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.bancarizacion.EntidadLogWSDTO;

public class RespuestaConsultarTarifaConvenioWSDTO  implements Serializable {


    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String is_estado;
    private EntidadLogWSDTO iel_log;
    private Long il_tarifa;
    
	public String getIs_estado() {
		return is_estado;
	}
	public void setIs_estado(String as_estado) {
		this.is_estado = as_estado;
	}
	public Long getIl_tarifa() {
		return il_tarifa;
	}
	public void setIl_tarifa(Long al_tarifa) {
		this.il_tarifa = al_tarifa;
	}
	public EntidadLogWSDTO getIel_log() {
		return iel_log;
	}
	public void setIel_log(EntidadLogWSDTO iel_log) {
		this.iel_log = iel_log;
	}


}
