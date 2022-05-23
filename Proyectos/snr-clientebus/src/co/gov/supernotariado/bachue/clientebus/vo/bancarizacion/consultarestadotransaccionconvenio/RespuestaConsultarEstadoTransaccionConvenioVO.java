/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: RespuestaConsultarEstadoTransaccionConvenioVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.consultarestadotransaccionconvenio
 * Nombre del elemento: RespuestaConsultarEstadoTransaccionConvenioVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.consultarestadotransaccionconvenio;

import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;
import co.gov.supernotariado.bachue.clientebus.vo.bancarizacion.generico.EntidadLogVO;


/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Respuesta consultar estado transaccion convenio .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class RespuestaConsultarEstadoTransaccionConvenioVO  extends ClienteIntegracionVO {


	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo transaccion.
	 */
	private String is_codigoTransaccion;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * estado.
	 */
	private String is_estado;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * estado transaccion.
	 */
	private String is_estadoTransaccion;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * fecha fin generacion.
	 */
	private String is_fechaFinGeneracion;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * fecha inicio generacion.
	 */
	private String is_fechaInicioGeneracion;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * fecha transaccion.
	 */
	private String is_fechaTransaccion;
	
	/**
	 * Atributo de instancia tipo EntidadLogVO para definir la propiedad log.
	 */
	private EntidadLogVO iel_log;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * matricula.
	 */
	private String is_matricula;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * oficina.
	 */
	private String is_oficina;

	/**
	 * Obtiene el valor para la propiedad codigo transaccion.
	 *
	 * @return El valor de la propiedad codigo transaccion
	 */
	public String getIs_codigoTransaccion() {
		return is_codigoTransaccion;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad codigo transaccion.
	 *
	 * @param as_codigoTransaccion el nuevo valor para la propiedad codigo
	 *                             transaccion
	 */
	public void setIs_codigoTransaccion(String as_codigoTransaccion) {
		this.is_codigoTransaccion = as_codigoTransaccion;
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
	 * Obtiene el valor para la propiedad estado transaccion.
	 *
	 * @return El valor de la propiedad estado transaccion
	 */
	public String getIs_estadoTransaccion() {
		return is_estadoTransaccion;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad estado transaccion.
	 *
	 * @param as_estadoTransaccion el nuevo valor para la propiedad estado
	 *                             transaccion
	 */
	public void setIs_estadoTransaccion(String as_estadoTransaccion) {
		this.is_estadoTransaccion = as_estadoTransaccion;
	}
	
	/**
	 * Obtiene el valor para la propiedad fecha fin generacion.
	 *
	 * @return El valor de la propiedad fecha fin generacion
	 */
	public String getIs_fechaFinGeneracion() {
		return is_fechaFinGeneracion;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad fecha fin generacion.
	 *
	 * @param as_fechaFinGeneracion el nuevo valor para la propiedad fecha fin
	 *                              generacion
	 */
	public void setIs_fechaFinGeneracion(String as_fechaFinGeneracion) {
		this.is_fechaFinGeneracion = as_fechaFinGeneracion;
	}
	
	/**
	 * Obtiene el valor para la propiedad fecha inicio generacion.
	 *
	 * @return El valor de la propiedad fecha inicio generacion
	 */
	public String getIs_fechaInicioGeneracion() {
		return is_fechaInicioGeneracion;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad fecha inicio generacion.
	 *
	 * @param as_fechaInicioGeneracion el nuevo valor para la propiedad fecha inicio
	 *                                 generacion
	 */
	public void setIs_fechaInicioGeneracion(String as_fechaInicioGeneracion) {
		this.is_fechaInicioGeneracion = as_fechaInicioGeneracion;
	}
	
	/**
	 * Obtiene el valor para la propiedad fecha transaccion.
	 *
	 * @return El valor de la propiedad fecha transaccion
	 */
	public String getIs_fechaTransaccion() {
		return is_fechaTransaccion;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad fecha transaccion.
	 *
	 * @param as_fechaTransaccion el nuevo valor para la propiedad fecha transaccion
	 */
	public void setIs_fechaTransaccion(String as_fechaTransaccion) {
		this.is_fechaTransaccion = as_fechaTransaccion;
	}
	
	/**
	 * Obtiene el valor para la propiedad log.
	 *
	 * @return El valor de la propiedad log
	 */
	public EntidadLogVO getIel_log() {
		return iel_log;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad log.
	 *
	 * @param iel_log el nuevo valor para la propiedad log
	 */
	public void setIel_log(EntidadLogVO iel_log) {
		this.iel_log = iel_log;
	}
	
	/**
	 * Obtiene el valor para la propiedad matricula.
	 *
	 * @return El valor de la propiedad matricula
	 */
	public String getIs_matricula() {
		return is_matricula;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad matricula.
	 *
	 * @param as_matricula el nuevo valor para la propiedad matricula
	 */
	public void setIs_matricula(String as_matricula) {
		this.is_matricula = as_matricula;
	}
	
	/**
	 * Obtiene el valor para la propiedad oficina.
	 *
	 * @return El valor de la propiedad oficina
	 */
	public String getIs_oficina() {
		return is_oficina;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad oficina.
	 *
	 * @param as_oficina el nuevo valor para la propiedad oficina
	 */
	public void setIs_oficina(String as_oficina) {
		this.is_oficina = as_oficina;
	}
	
}
