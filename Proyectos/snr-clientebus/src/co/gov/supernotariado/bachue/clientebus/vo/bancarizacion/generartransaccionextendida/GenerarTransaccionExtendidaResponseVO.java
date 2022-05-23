/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: GenerarTransaccionExtendidaResponseVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.generartransaccionextendida
 * Nombre del elemento: GenerarTransaccionExtendidaResponseVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */

package co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.generartransaccionextendida;

import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;

/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Generar transaccion extendida response .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class GenerarTransaccionExtendidaResponseVO extends ClienteIntegracionVO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo RespuestaGenerarTransaccionVO para definir la
	 * propiedad respuesta generar transaccion objeto con valores de servicio.
	 */
	private RespuestaGenerarTransaccionVO irgt_respuestaGenerarTransaccionVo;

	/**
	 * Obtiene el valor para la propiedad respuesta generar transaccion objeto con
	 * valores de servicio.
	 *
	 * @return El valor de la propiedad respuesta generar transaccion objeto con
	 *         valores de servicio
	 */
	public RespuestaGenerarTransaccionVO getIrgt_respuestaGenerarTransaccionVo() {
		return irgt_respuestaGenerarTransaccionVo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad respuesta generar transaccion
	 * objeto con valores de servicio.
	 *
	 * @param argt_respuestaGenerarTransaccionVo el nuevo valor para la propiedad
	 *                                           respuesta generar transaccion
	 *                                           objeto con valores de servicio
	 */
	public void setIrgt_respuestaGenerarTransaccionVo(
			RespuestaGenerarTransaccionVO argt_respuestaGenerarTransaccionVo) {
		this.irgt_respuestaGenerarTransaccionVo = argt_respuestaGenerarTransaccionVo;
	}
}
