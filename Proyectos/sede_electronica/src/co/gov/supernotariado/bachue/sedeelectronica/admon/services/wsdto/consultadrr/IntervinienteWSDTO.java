package co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.consultadrr;

import co.gov.supernotariado.bachue.clientebus.vo.GenericoVO;

public class IntervinienteWSDTO extends GenericoVO {

	private static final long serialVersionUID = 1L;

    private String is_tipoDocumentoPersona;
    private String is_numDocumentoPersona;
    private String is_primerNombre;
    private String is_segundoNombre;
    private String is_primerApellido;
    private String is_segundoApellido;
    private String is_razonSocial;
    private String is_rolInterviniente;
    private String is_tipoParteInteresada;
    
	public String getIs_tipoDocumentoPersona() {
		return is_tipoDocumentoPersona;
	}
	public void setIs_tipoDocumentoPersona(String as_tipoDocumentoPersona) {
		this.is_tipoDocumentoPersona = as_tipoDocumentoPersona;
	}
	public String getIs_numDocumentoPersona() {
		return is_numDocumentoPersona;
	}
	public void setIs_numDocumentoPersona(String as_numDocumentoPersona) {
		this.is_numDocumentoPersona = as_numDocumentoPersona;
	}
	public String getIs_primerNombre() {
		return is_primerNombre;
	}
	public void setIs_primerNombre(String as_primerNombre) {
		this.is_primerNombre = as_primerNombre;
	}
	public String getIs_segundoNombre() {
		return is_segundoNombre;
	}
	public void setIs_segundoNombre(String as_segundoNombre) {
		this.is_segundoNombre = as_segundoNombre;
	}
	public String getIs_primerApellido() {
		return is_primerApellido;
	}
	public void setIs_primerApellido(String as_primerApellido) {
		this.is_primerApellido = as_primerApellido;
	}
	public String getIs_segundoApellido() {
		return is_segundoApellido;
	}
	public void setIs_segundoApellido(String as_segundoApellido) {
		this.is_segundoApellido = as_segundoApellido;
	}
	public String getIs_razonSocial() {
		return is_razonSocial;
	}
	public void setIs_razonSocial(String as_razonSocial) {
		this.is_razonSocial = as_razonSocial;
	}
	public String getIs_rolInterviniente() {
		return is_rolInterviniente;
	}
	public void setIs_rolInterviniente(String as_rolInterviniente) {
		this.is_rolInterviniente = as_rolInterviniente;
	}
	public String getIs_tipoParteInteresada() {
		return is_tipoParteInteresada;
	}
	public void setIs_tipoParteInteresada(String as_tipoParteInteresada) {
		this.is_tipoParteInteresada = as_tipoParteInteresada;
	}    
	
}
