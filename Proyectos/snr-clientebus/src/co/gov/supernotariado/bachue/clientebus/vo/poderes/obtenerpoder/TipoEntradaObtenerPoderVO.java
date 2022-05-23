package co.gov.supernotariado.bachue.clientebus.vo.poderes.obtenerpoder;

import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;

/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Tipo entrada obtener poder .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoEntradaObtenerPoderVO extends ClienteIntegracionVO{

	private static final long serialVersionUID = 1L;
	private String is_dDocName;
	private String is_did;
	public String getIs_dDocName() {
		return is_dDocName;
	}
	public void setIs_dDocName(String as_dDocName) {
		this.is_dDocName = as_dDocName;
	}
	public String getIs_did() {
		return is_did;
	}
	public void setIs_did(String as_did) {
		this.is_did = as_did;
	}
		
}
