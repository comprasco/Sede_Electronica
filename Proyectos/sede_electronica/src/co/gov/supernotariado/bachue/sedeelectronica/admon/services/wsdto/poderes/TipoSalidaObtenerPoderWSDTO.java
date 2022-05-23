package co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.poderes;

import co.gov.supernotariado.bachue.clientebus.vo.GenericoVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.interfaces.ISalidaServicioWSDTO;

public class TipoSalidaObtenerPoderWSDTO extends GenericoVO implements ISalidaServicioWSDTO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private byte[] ib_archivo;
	private Integer ii_codigoMensaje;
	private String is_descripcionMensaje;

	public byte[] getIb_archivo() {
		return ib_archivo;
	}
	public void setIb_archivo(byte[] ab_archivo) {
		this.ib_archivo = ab_archivo;
	}
	public Integer getIi_codigoMensaje() {
		return ii_codigoMensaje;
	}
	public void setIi_codigoMensaje(Integer ai_codigoMensaje) {
		this.ii_codigoMensaje = ai_codigoMensaje;
	}
	public String getIs_descripcionMensaje() {
		return is_descripcionMensaje;
	}
	public void setIs_descripcionMensaje(String as_descripcionMensaje) {
		this.is_descripcionMensaje = as_descripcionMensaje;
	}
	@Override
	public String getIs_codigoMensaje() {
		return ii_codigoMensaje.toString();
	}

}
