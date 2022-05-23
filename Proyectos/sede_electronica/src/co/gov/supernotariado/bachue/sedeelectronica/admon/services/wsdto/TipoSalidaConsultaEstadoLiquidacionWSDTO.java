/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TipoSalidaConsultaEstadoLiquidacionWSDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto
 * Nombre del elemento: TipoSalidaConsultaEstadoLiquidacionWSDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoDTO;

/**
 * Clase tipo objeto de transferencia de datos para web service (WSDTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y servicios web.
 * <br>
 * Contiene propiedades para representar los datos del objeto Tipo salida
 * consulta estado liquidacion.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoSalidaConsultaEstadoLiquidacionWSDTO extends GenericoDTO{

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo mensaje.
	 */
	private String is_codigoMensaje;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo transaccion recaudador.
	 */
	private String is_codigoTransaccionRecaudador;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * descripcion mensaje.
	 */
	private String is_descripcionMensaje;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * estado transaccion.
	 */
	private String is_estadoTransaccion;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero referencia.
	 */
	private String is_numeroReferencia;
	
	/**
	 * Obtiene el valor para la propiedad codigo mensaje.
	 *
	 * @return El valor de la propiedad codigo mensaje
	 */
	public String getIs_codigoMensaje() {
		return is_codigoMensaje;
	}
	
	/**
	 * Obtiene el valor para la propiedad codigo transaccion recaudador.
	 *
	 * @return El valor de la propiedad codigo transaccion recaudador
	 */
	public String getIs_codigoTransaccionRecaudador() {
		return is_codigoTransaccionRecaudador;
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
	 * Obtiene el valor para la propiedad estado transaccion.
	 *
	 * @return El valor de la propiedad estado transaccion
	 */
	public String getIs_estadoTransaccion() {
		return is_estadoTransaccion;
	}
	
	/**
	 * Obtiene el valor para la propiedad numero referencia.
	 *
	 * @return El valor de la propiedad numero referencia
	 */
	public String getIs_numeroReferencia() {
		return is_numeroReferencia;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad codigo mensaje.
	 *
	 * @param as_codigoMensaje el nuevo valor para la propiedad codigo mensaje
	 */
	public void setIs_codigoMensaje(String as_codigoMensaje) {
		this.is_codigoMensaje = as_codigoMensaje;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad codigo transaccion recaudador.
	 *
	 * @param as_codigoTransaccionRecaudador el nuevo valor para la propiedad codigo
	 *                                       transaccion recaudador
	 */
	public void setIs_codigoTransaccionRecaudador(String as_codigoTransaccionRecaudador) {
		this.is_codigoTransaccionRecaudador = as_codigoTransaccionRecaudador;
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
	 * Cambia/actualiza el valor para la propiedad numero referencia.
	 *
	 * @param as_numeroReferencia el nuevo valor para la propiedad numero referencia
	 */
	public void setIs_numeroReferencia(String as_numeroReferencia) {
		this.is_numeroReferencia = as_numeroReferencia;
	}
			
}
