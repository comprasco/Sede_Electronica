
package co.gov.supernotariado.bachue.clientebus.vo.poderes.actualizarPoderes;

import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;

public class TipoSalidaActualizarMetadatosPoderVO extends ClienteIntegracionVO{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String is_docName;
    private Integer ii_did;
    private Integer ii_codigoMensaje;
    private String is_descripcionMensaje;
    
	public String getIs_docName() {
		return is_docName;
	}
	public void setIs_docName(String as_docName) {
		this.is_docName = as_docName;
	}
	public Integer getIi_did() {
		return ii_did;
	}
	public void setIi_did(Integer ai_did) {
		this.ii_did = ai_did;
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
    
    
}
