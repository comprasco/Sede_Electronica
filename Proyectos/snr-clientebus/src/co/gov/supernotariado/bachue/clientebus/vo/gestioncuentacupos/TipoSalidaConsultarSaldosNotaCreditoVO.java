/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: TipoSalidaConsultarSaldosNotaCreditoVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos
 * Nombre del elemento: TipoSalidaConsultarSaldosNotaCreditoVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos;

import java.math.BigInteger;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;

/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Tipo salida consultar saldos nota credito.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoSalidaConsultarSaldosNotaCreditoVO extends ClienteIntegracionVO{

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo lista de TipoMovimientoCMOVO para definir la
	 * propiedad movimientos.
	 */
	private List<TipoNotaCreditoCSNCVO> iltnc_listaNotasCredito;
	
	/**
	 * Atributo de instancia tipo entero de gran magnitud para definir la propiedad
	 * codigo mensaje.
	 */
	private BigInteger ibi_codigoMensaje;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * descripcion mensaje.
	 */
	private String is_descripcionMensaje;

	/**
	 * Obtiene el valor para la propiedad notas credito.
	 *
	 * @return El valor de la propiedad notas credito
	 */
	public List<TipoNotaCreditoCSNCVO> getIltnc_listaNotasCredito() {
		return iltnc_listaNotasCredito;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad notas credito.
	 *
	 * @param altm_movimientos el nuevo valor para la propiedad notas credito
	 */
	public void setIltnc_listaNotasCredito(List<TipoNotaCreditoCSNCVO> iltnc_listaNotasCredito) {
		this.iltnc_listaNotasCredito = iltnc_listaNotasCredito;
	}

	/**
	 * Obtiene el valor para la propiedad codigo mensaje.
	 *
	 * @return El valor de la propiedad codigo mensaje
	 */
	public BigInteger getIbi_codigoMensaje() {
		return ibi_codigoMensaje;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad codigo mensaje.
	 *
	 * @param abi_codigoMensaje el nuevo valor para la propiedad codigo mensaje
	 */
	public void setIbi_codigoMensaje(BigInteger abi_codigoMensaje) {
		this.ibi_codigoMensaje = abi_codigoMensaje;
	}
	
	/**
	 * Obtiene el valor para la propiedad descripcion mensaje.
	 *
	 * @return El valor de la propiedad descripcion mensaje
	 */
	public String getIs_descripcionMensaje() {
		return is_descripcionMensaje;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad descripcion mensaje.
	 *
	 * @param as_descripcionMensaje el nuevo valor para la propiedad descripcion
	 *                              mensaje
	 */
	public void setIs_descripcionMensaje(String as_descripcionMensaje) {
		this.is_descripcionMensaje = as_descripcionMensaje;
	}
}
