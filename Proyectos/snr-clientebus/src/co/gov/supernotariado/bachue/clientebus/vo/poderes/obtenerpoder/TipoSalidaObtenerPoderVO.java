package co.gov.supernotariado.bachue.clientebus.vo.poderes.obtenerpoder;

import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;

/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Tipo salida obtener poder .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoSalidaObtenerPoderVO extends ClienteIntegracionVO{

	private static final long serialVersionUID = 1L;

	private byte[] ib_archivo;
	private int ii_codigoMensaje;
	private String is_descripcionMensaje;
	
	public byte[] getIb_archivo() {
		return ib_archivo;
	}
	public void setIb_archivo(byte[] ab_archivo) {
		this.ib_archivo = ab_archivo;
	}
	public int getIi_codigoMensaje() {
		return ii_codigoMensaje;
	}
	public void setIi_codigoMensaje(int ai_codigoMensaje) {
		this.ii_codigoMensaje = ai_codigoMensaje;
	}
	public String getIs_descripcionMensaje() {
		return is_descripcionMensaje;
	}
	public void setIs_descripcionMensaje(String as_descripcionMensaje) {
		this.is_descripcionMensaje = as_descripcionMensaje;
	}
	
}
