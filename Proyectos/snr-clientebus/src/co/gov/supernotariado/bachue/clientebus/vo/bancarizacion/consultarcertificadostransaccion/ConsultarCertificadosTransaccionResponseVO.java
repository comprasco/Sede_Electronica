/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: ConsultarCertificadosTransaccionResponseVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.consultarcertificadostransaccion
 * Nombre del elemento: ConsultarCertificadosTransaccionResponseVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */

package co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.consultarcertificadostransaccion;

import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;

/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Consultar certificados transaccion response .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ConsultarCertificadosTransaccionResponseVO extends ClienteIntegracionVO {

    /**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo EntidadConsultarCertificadosTransaccionVO para
	 * definir la propiedad entidad certificados transaccion VO.
	 */
	private EntidadConsultarCertificadosTransaccionVO ieccr_entidadCertificadosTransaccionVO;
	
	/**
	 * Obtiene el valor para la propiedad entidad certificados transaccion objeto
	 * con valores de servicio.
	 *
	 * @return El valor de la propiedad entidad certificados transaccion objeto con
	 *         valores de servicio
	 */
	public EntidadConsultarCertificadosTransaccionVO getIeccr_entidadCertificadosTransaccionVO() {
		return ieccr_entidadCertificadosTransaccionVO;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad entidad certificados transaccion
	 * objeto con valores de servicio.
	 *
	 * @param aeccr_entidadCertificadosTransaccionVO el nuevo valor para la
	 *                                               propiedad entidad certificados
	 *                                               transaccion objeto con valores
	 *                                               de servicio
	 */
	public void setIeccr_entidadCertificadosTransaccionVO(
			EntidadConsultarCertificadosTransaccionVO aeccr_entidadCertificadosTransaccionVO) {
		this.ieccr_entidadCertificadosTransaccionVO = aeccr_entidadCertificadosTransaccionVO;
	}
	
}
