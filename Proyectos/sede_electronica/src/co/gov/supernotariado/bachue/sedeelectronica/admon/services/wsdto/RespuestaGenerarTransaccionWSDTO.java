package co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.bancarizacion.EntidadLogWSDTO;

public class RespuestaGenerarTransaccionWSDTO extends GenericoDTO {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String is_codigoTransaccion;
    private String is_estado;
    private EntidadLogWSDTO iel_entidadLogWsDto;   

    
	public String getIs_codigoTransaccion() {
		return is_codigoTransaccion;
	}
	public void setIs_codigoTransaccion(String as_codigoTransaccion) {
		this.is_codigoTransaccion = as_codigoTransaccion;
	}
	public EntidadLogWSDTO getIel_entidadLogWsDto() {
		return iel_entidadLogWsDto;
	}
	public void setIel_entidadLogWsDto(EntidadLogWSDTO ael_entidadLogWsDto) {
		this.iel_entidadLogWsDto = ael_entidadLogWsDto;
	}
	public String getIs_estado() {
		return is_estado;
	}
	public void setIs_estado(String as_estado) {
		this.is_estado = as_estado;
	}
	public EntidadLogWSDTO getIel_entidadLogVo() {
		return iel_entidadLogWsDto;
	}
	public void setIel_entidadLogVo(EntidadLogWSDTO ael_entidadLogWsDto) {
		this.iel_entidadLogWsDto = ael_entidadLogWsDto;
	}	

}
