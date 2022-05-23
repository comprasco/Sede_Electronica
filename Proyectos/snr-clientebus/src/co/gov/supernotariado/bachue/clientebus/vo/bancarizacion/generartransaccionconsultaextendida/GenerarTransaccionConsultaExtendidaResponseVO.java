/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: GenerarTransaccionConsultaExtendidaResponseVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.generartransaccionconsultaextendida
 * Nombre del elemento: GenerarTransaccionConsultaExtendidaResponseVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */

package co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.generartransaccionconsultaextendida;

import co.gov.supernotariado.bachue.clientebus.vo.GenericoVO;

/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Generar transaccion consulta extendida response .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class GenerarTransaccionConsultaExtendidaResponseVO extends GenericoVO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo RespuestaGenerarTransaccionConsultaVO para definir
	 * la propiedad respuesta generar transaccion consulta objeto con valores de
	 * servicio.
	 */
	private RespuestaGenerarTransaccionConsultaVO irgtc_respuestaGenerarTransaccionConsultaVo;

	/**
	 * Obtiene el valor para la propiedad respuesta generar transaccion consulta
	 * objeto con valores de servicio.
	 *
	 * @return El valor de la propiedad respuesta generar transaccion consulta
	 *         objeto con valores de servicio
	 */
	public RespuestaGenerarTransaccionConsultaVO getIrgtc_respuestaGenerarTransaccionConsultaVo() {
		return irgtc_respuestaGenerarTransaccionConsultaVo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad respuesta generar transaccion
	 * consulta objeto con valores de servicio.
	 *
	 * @param argtc_respuestaGenerarTransaccionConsultaVo el nuevo valor para la
	 *                                                    propiedad respuesta
	 *                                                    generar transaccion
	 *                                                    consulta objeto con
	 *                                                    valores de servicio
	 */
	public void setIrgtc_respuestaGenerarTransaccionConsultaVo(
			RespuestaGenerarTransaccionConsultaVO argtc_respuestaGenerarTransaccionConsultaVo) {
		this.irgtc_respuestaGenerarTransaccionConsultaVo = argtc_respuestaGenerarTransaccionConsultaVo;
	}
}
