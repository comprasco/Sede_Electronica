package co.gov.supernotariado.bachue.clientebus.vo.consultartrazabilidad;

import java.util.List;

import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;

public class TipoSalidaConsultaDetalleCertificadoVO extends ClienteIntegracionVO{

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	private String is_nir;
	private List<CertificadoVO> ilc_certificados;
	private String is_codigoMensaje;
	private String is_descripcionMensaje;
	
	
	public String getIs_nir() {
		return is_nir;
	}
	public void setIs_nir(String as_nir) {
		this.is_nir = as_nir;
	}
	public List<CertificadoVO> getIlc_certificados() {
		return ilc_certificados;
	}
	public void setIlc_certificados(List<CertificadoVO> alc_certificados) {
		this.ilc_certificados = alc_certificados;
	}
	public String getIs_codigoMensaje() {
		return is_codigoMensaje;
	}
	public void setIs_codigoMensaje(String as_codigoMensaje) {
		this.is_codigoMensaje = as_codigoMensaje;
	}
	public String getIs_descripcionMensaje() {
		return is_descripcionMensaje;
	}
	public void setIs_descripcionMensaje(String as_descripcionMensaje) {
		this.is_descripcionMensaje = as_descripcionMensaje;
	}
		
}
