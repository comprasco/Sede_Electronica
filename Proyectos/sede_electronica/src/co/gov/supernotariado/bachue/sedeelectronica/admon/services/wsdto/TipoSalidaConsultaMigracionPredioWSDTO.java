package co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto;

import java.math.BigInteger;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.interfaces.ISalidaServicioWSDTO;

/**
 * 
 * @version 1.0
 * @author Smartsoft Solutions S.A.S Nota: WSDTO que representa la entidad de clase
 * 
 */
public class TipoSalidaConsultaMigracionPredioWSDTO extends GenericoDTO implements ISalidaServicioWSDTO {

	private static final long serialVersionUID = 1L;

    private Boolean ib_informacionMigrada;
    private BigInteger ibi_codMensaje;
    private String is_descripcionMensaje;
    
	public Boolean getIb_informacionMigrada() {
		return ib_informacionMigrada;
	}
	public void setIb_informacionMigrada(Boolean ab_informacionMigrada) {
		this.ib_informacionMigrada = ab_informacionMigrada;
	}
	public BigInteger getIbi_codMensaje() {
		return ibi_codMensaje;
	}
	public void setIbi_codMensaje(BigInteger abi_codMensaje) {
		this.ibi_codMensaje = abi_codMensaje;
	}
	public String getIs_descripcionMensaje() {
		return is_descripcionMensaje;
	}
	public void setIs_descripcionMensaje(String as_descripcionMensaje) {
		this.is_descripcionMensaje = as_descripcionMensaje;
	}
	@Override
	public String getIs_codigoMensaje() {
		return ibi_codMensaje.toString();
	}
    	
}
