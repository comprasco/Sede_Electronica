package co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto;


import java.util.List;



import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.interfaces.ISalidaServicioWSDTO;


/**
 * Clase tipo objeto de transferencia de datos para web service (WSDTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y servicios web.
 * <br>
 * Contiene propiedades para representar los datos del objeto Tipo salida
 * Consulta Detalle Certificado.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoSalidaConsultaDetalleCertificadoWSDTO extends GenericoDTO implements ISalidaServicioWSDTO{

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	    private String is_nir;
	    private List<CertificadoWSDTO> ilc_certificados; 
	    private String is_codigoMensaje;
	    private String is_descripcionMensaje;
	    
	    
	    
		public String getIs_nir() {
			return is_nir;
		}
		public void setIs_nir(String as_nir) {
			this.is_nir = as_nir;
		}
		
		public List<CertificadoWSDTO> getIlc_certificados() {
			return ilc_certificados;
		}
		public void setIlc_certificados(List<CertificadoWSDTO> alc_certificados) {
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
