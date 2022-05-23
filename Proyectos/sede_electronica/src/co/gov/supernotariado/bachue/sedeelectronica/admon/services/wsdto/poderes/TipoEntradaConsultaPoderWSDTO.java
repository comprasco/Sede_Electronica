package co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.poderes;

import java.util.List;

import co.gov.supernotariado.bachue.clientebus.vo.GenericoVO;

/**
 * Clase tipo objeto de transferencia de datos para web service (WSDTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y servicios web.
 * <br>
 * Contiene propiedades para representar los datos del objeto entrada de consulta poder.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoEntradaConsultaPoderWSDTO extends GenericoVO {

	private static final long serialVersionUID = 1L;
	
	private String is_sistemaOrigen;
	private List<ParametroConsultaPoderWSDTO> ilpcp_listaParametroConsultaPoderWsdto;
	
	public String getIs_sistemaOrigen() {
		return is_sistemaOrigen;
	}
	public void setIs_sistemaOrigen(String as_sistemaOrigen) {
		this.is_sistemaOrigen = as_sistemaOrigen;
	}
	public List<ParametroConsultaPoderWSDTO> getIlpcp_listaParametroConsultaPoderWsdto() {
		return ilpcp_listaParametroConsultaPoderWsdto;
	}
	public void setIlpcp_listaParametroConsultaPoderWsdto(
			List<ParametroConsultaPoderWSDTO> alpcp_listaParametroConsultaPoderWsdto) {
		this.ilpcp_listaParametroConsultaPoderWsdto = alpcp_listaParametroConsultaPoderWsdto;
	}
	
}
