package co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.poderes;

import java.util.List;

import co.gov.supernotariado.bachue.clientebus.vo.GenericoVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.interfaces.ISalidaServicioWSDTO;

/**
 * Clase tipo objeto de transferencia de datos para web service (WSDTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y servicios web.
 * <br>
 * Contiene propiedades para representar los datos del objeto salida de consulta poder.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoSalidaConsultaPoderWSDTO extends GenericoVO implements ISalidaServicioWSDTO{

	private static final long serialVersionUID = 1L;
	
	private List<DocumentoConsultaPoderWSDTO> ildcp_listaDocumentoConsultaPoderWsdto;
	private String is_codigoMensaje;
	private String is_descripcionMensaje;
	
	@Override
	public String getIs_codigoMensaje() {
		return is_codigoMensaje;
	}
	public void setIs_codigoMensaje(String as_codigoMensaje) {
		this.is_codigoMensaje = as_codigoMensaje;
	}
	@Override
	public String getIs_descripcionMensaje() {
		return is_descripcionMensaje;
	}
	public void setIs_descripcionMensaje(String as_descripcionMensaje) {
		this.is_descripcionMensaje = as_descripcionMensaje;
	}
	public List<DocumentoConsultaPoderWSDTO> getIldcp_listaDocumentoConsultaPoderWsdto() {
		return ildcp_listaDocumentoConsultaPoderWsdto;
	}
	public void setIldcp_listaDocumentoConsultaPoderWsdto(List<DocumentoConsultaPoderWSDTO> aldcp_listaDocumentoConsultaPoderWsdto) {
		this.ildcp_listaDocumentoConsultaPoderWsdto = aldcp_listaDocumentoConsultaPoderWsdto;
	}	
	
}
