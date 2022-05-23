/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: RespuestaGenerarTransaccionVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.generartransaccionconsultaextendida
 * Nombre del elemento: RespuestaGenerarTransaccionVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.generartransaccionconsultaextendida;

import co.gov.supernotariado.bachue.clientebus.bancarizacion.type.generico.EntidadLog;
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
	private static final long serialVersionUID = -4653514103077616050L;

	/**
	 * Atributo para definir la propiedad codigo transaccion.
	 */
	protected Long codigoTransaccion;

	/**
	 * Atributo para definir la propiedad estado.
	 */
	protected String estado;

	/**
	 * Atributo para definir la propiedad log.
	 */
	protected EntidadLogVO log;

	/**
	 * Obtiene el valor de la propiedad codigoTransaccion.
	 * 
	 * @return possible object is {@link Long }
	 * 
	 */
	public Long getCodigoTransaccion() {
		return codigoTransaccion;
	}

	/**
	 * Define el valor de la propiedad codigoTransaccion.
	 * 
	 * @param value allowed object is {@link Long }
	 * 
	 */
	public void setCodigoTransaccion(Long value) {
		this.codigoTransaccion = value;
	}

	/**
	 * Obtiene el valor de la propiedad estado.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEstado() {
		return estado;
	}

	/**
	 * Define el valor de la propiedad estado.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setEstado(String value) {
		this.estado = value;
	}

	/**
	 * Obtiene el valor de la propiedad log.
	 * 
	 * @return possible object is {@link EntidadLog }
	 * 
	 */
	public EntidadLogVO getLog() {
		return log;
	}

	/**
	 * Define el valor de la propiedad log.
	 * 
	 * @param value allowed object is {@link EntidadLog }
	 * 
	 */
	public void setLog(EntidadLogVO value) {
		this.log = value;
	}

}
