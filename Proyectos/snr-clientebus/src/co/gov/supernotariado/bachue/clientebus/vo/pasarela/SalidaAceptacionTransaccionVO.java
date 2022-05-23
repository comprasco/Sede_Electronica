/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: SalidaAceptacionTransaccionVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.pasarela
 * Nombre del elemento: SalidaAceptacionTransaccionVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.vo.pasarela;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;

/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Salida aceptacion transaccion .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class SalidaAceptacionTransaccionVO extends ClienteIntegracionVO implements Serializable{

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 6945135295497913487L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * consecutivo.
	 */
	@SerializedName("consecutive")
	private String is_consecutivo;
	
	/**
	 * Atributo de instancia tipo SalidaLogVO para definir la propiedad log.
	 */
	@SerializedName("log")
	private SalidaLogVO is_log;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * resultado.
	 */
	@SerializedName("result")
	private String is_resultado;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * token.
	 */
	@SerializedName("token")
	private String is_token;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad url
	 * retorno.
	 */
	@SerializedName("url")
	private String is_urlRetorno;
	
	/**
	 * Construye una nueva instancia/objeto de la clase
	 * SalidaAceptacionTransaccionVO.
	 */
	public SalidaAceptacionTransaccionVO() {
		//Metodo constructor de negocio
	}

	/**
	 * Obtiene el valor para la propiedad consecutivo.
	 *
	 * @return El valor de la propiedad consecutivo
	 */
	public String getIs_consecutivo() {
		return is_consecutivo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad consecutivo.
	 *
	 * @param as_consecutivo el nuevo valor para la propiedad consecutivo
	 */
	public void setIs_consecutivo(String as_consecutivo) {
		this.is_consecutivo = as_consecutivo;
	}

	/**
	 * Obtiene el valor para la propiedad log.
	 *
	 * @return El valor de la propiedad log
	 */
	public SalidaLogVO getIs_log() {
		return is_log;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad log.
	 *
	 * @param as_log el nuevo valor para la propiedad log
	 */
	public void setIs_log(SalidaLogVO as_log) {
		this.is_log = as_log;
	}

	/**
	 * Obtiene el valor para la propiedad resultado.
	 *
	 * @return El valor de la propiedad resultado
	 */
	public String getIs_resultado() {
		return is_resultado;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad resultado.
	 *
	 * @param as_resultado el nuevo valor para la propiedad resultado
	 */
	public void setIs_resultado(String as_resultado) {
		this.is_resultado = as_resultado;
	}

	/**
	 * Obtiene el valor para la propiedad token.
	 *
	 * @return El valor de la propiedad token
	 */
	public String getIs_token() {
		return is_token;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad token.
	 *
	 * @param as_token el nuevo valor para la propiedad token
	 */
	public void setIs_token(String as_token) {
		this.is_token = as_token;
	}

	/**
	 * Obtiene el valor para la propiedad url retorno.
	 *
	 * @return El valor de la propiedad url retorno
	 */
	public String getIs_urlRetorno() {
		return is_urlRetorno;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad url retorno.
	 *
	 * @param as_urlRetorno el nuevo valor para la propiedad url retorno
	 */
	public void setIs_urlRetorno(String as_urlRetorno) {
		this.is_urlRetorno = as_urlRetorno;
	}
}
