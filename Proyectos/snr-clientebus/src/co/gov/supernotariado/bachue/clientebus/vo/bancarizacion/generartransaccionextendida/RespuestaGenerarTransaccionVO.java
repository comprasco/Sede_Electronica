/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: RespuestaGenerarTransaccionVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.generartransaccionextendida
 * Nombre del elemento: RespuestaGenerarTransaccionVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.generartransaccionextendida;

import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;
import co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.generico.EntidadLogVO;

/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Respuesta generar transaccion .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class RespuestaGenerarTransaccionVO extends ClienteIntegracionVO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo Long para definir la propiedad codigo transaccion.
	 */
	private Long il_codigoTransaccion;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * estado.
	 */
	private String is_estado;

	/**
	 * Atributo de instancia tipo EntidadLogVO para definir la propiedad entidad log
	 * objeto con valores de servicio.
	 */
	private EntidadLogVO iel_entidadLogVo;

	/**
	 * Obtiene el valor para la propiedad codigo transaccion.
	 *
	 * @return El valor de la propiedad codigo transaccion
	 */
	public Long getIl_codigoTransaccion() {
		return il_codigoTransaccion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad codigo transaccion.
	 *
	 * @param al_codigoTransaccion el nuevo valor para la propiedad codigo
	 *                             transaccion
	 */
	public void setIl_codigoTransaccion(Long al_codigoTransaccion) {
		this.il_codigoTransaccion = al_codigoTransaccion;
	}

	/**
	 * Obtiene el valor para la propiedad estado.
	 *
	 * @return El valor de la propiedad estado
	 */
	public String getIs_estado() {
		return is_estado;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad estado.
	 *
	 * @param as_estado el nuevo valor para la propiedad estado
	 */
	public void setIs_estado(String as_estado) {
		this.is_estado = as_estado;
	}

	/**
	 * Obtiene el valor para la propiedad entidad log objeto con valores de
	 * servicio.
	 *
	 * @return El valor de la propiedad entidad log objeto con valores de servicio
	 */
	public EntidadLogVO getIel_entidadLogVo() {
		return iel_entidadLogVo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad entidad log objeto con valores de
	 * servicio.
	 *
	 * @param ael_entidadLogVo el nuevo valor para la propiedad entidad log objeto
	 *                         con valores de servicio
	 */
	public void setIel_entidadLogVo(EntidadLogVO ael_entidadLogVo) {
		this.iel_entidadLogVo = ael_entidadLogVo;
	}
}
