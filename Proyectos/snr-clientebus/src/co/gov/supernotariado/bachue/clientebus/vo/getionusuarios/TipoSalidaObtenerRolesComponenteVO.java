package co.gov.supernotariado.bachue.clientebus.vo.getionusuarios;

import java.math.BigInteger;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;



public class TipoSalidaObtenerRolesComponenteVO extends ClienteIntegracionVO{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BigInteger ibi_codigoMensaje;
    private String is_descripcionMensaje;
    private List<RolVO> ilr_listaRol;
    
	public BigInteger getIbi_codigoMensaje() {
		return ibi_codigoMensaje;
	}
	public void setIbi_codigoMensaje(BigInteger abi_codigoMensaje) {
		this.ibi_codigoMensaje = abi_codigoMensaje;
	}
	public String getIs_descripcionMensaje() {
		return is_descripcionMensaje;
	}
	public void setIs_descripcionMensaje(String as_descripcionMensaje) {
		this.is_descripcionMensaje = as_descripcionMensaje;
	}
	public List<RolVO> getIlr_listaRol() {
		return ilr_listaRol;
	}
	public void setIlr_listaRol(List<RolVO> alr_listaRol) {
		this.ilr_listaRol = alr_listaRol;
	}
    
}
