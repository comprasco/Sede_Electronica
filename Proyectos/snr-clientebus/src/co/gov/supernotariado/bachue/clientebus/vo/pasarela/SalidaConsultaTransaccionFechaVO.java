/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: SalidaConsultaTransaccionFechaVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.pasarela
 * Nombre del elemento: SalidaConsultaTransaccionFechaVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.vo.pasarela;

import java.io.Serializable;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;

/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Salida consulta transaccion fecha .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class SalidaConsultaTransaccionFechaVO extends ClienteIntegracionVO implements Serializable{

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
	 * Atributo de instancia tipo lista de SalidaConsultaTransaccionTokenVO para
	 * definir la propiedad lista transacciones token.
	 */
	@SerializedName("transacciones")
	private List<SalidaConsultaTransaccionTokenVO> ilsctt_listaTransaccionesToken;
	
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
	 * Obtiene el valor para la propiedad lista transacciones token.
	 *
	 * @return El valor de la propiedad lista transacciones token
	 */
	public List<SalidaConsultaTransaccionTokenVO> getIlsctt_listaTransaccionesToken() {
		return ilsctt_listaTransaccionesToken;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad lista transacciones token.
	 *
	 * @param alsctt_listaTransaccionesToken el nuevo valor para la propiedad lista
	 *                                       transacciones token
	 */
	public void setIlsctt_listaTransaccionesToken(List<SalidaConsultaTransaccionTokenVO> alsctt_listaTransaccionesToken) {
		this.ilsctt_listaTransaccionesToken = alsctt_listaTransaccionesToken;
	}
}
