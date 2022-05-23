/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: SalidaLogVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.pasarela
 * Nombre del elemento: SalidaLogVO
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
 * Salida log .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class SalidaLogVO extends ClienteIntegracionVO implements Serializable{

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = -7521574118313446509L;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo.
	 */
	@SerializedName("code") 
	private String is_codigo;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * mensaje tecnologia.
	 */
	@SerializedName("techMessage") 
	private String is_mensajeTecnologia;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo.
	 */
	@SerializedName("type") 
	private String is_tipo;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * mensaje usuario.
	 */
	@SerializedName("userMessage") 
	private String is_mensajeUsuario;
	
	/**
	 * Obtiene el valor para la propiedad codigo.
	 *
	 * @return El valor de la propiedad codigo
	 */
	public String getIs_codigo() {
		return is_codigo;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad codigo.
	 *
	 * @param as_codigo el nuevo valor para la propiedad codigo
	 */
	public void setIs_codigo(String as_codigo) {
		this.is_codigo = as_codigo;
	}
	
	/**
	 * Obtiene el valor para la propiedad mensaje tecnologia.
	 *
	 * @return El valor de la propiedad mensaje tecnologia
	 */
	public String getIs_mensajeTecnologia() {
		return is_mensajeTecnologia;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad mensaje tecnologia.
	 *
	 * @param as_mensajeTecnologia el nuevo valor para la propiedad mensaje
	 *                             tecnologia
	 */
	public void setIs_mensajeTecnologia(String as_mensajeTecnologia) {
		this.is_mensajeTecnologia = as_mensajeTecnologia;
	}
	
	/**
	 * Obtiene el valor para la propiedad tipo.
	 *
	 * @return El valor de la propiedad tipo
	 */
	public String getIs_tipo() {
		return is_tipo;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad tipo.
	 *
	 * @param as_tipo el nuevo valor para la propiedad tipo
	 */
	public void setIs_tipo(String as_tipo) {
		this.is_tipo = as_tipo;
	}
	
	/**
	 * Obtiene el valor para la propiedad mensaje usuario.
	 *
	 * @return El valor de la propiedad mensaje usuario
	 */
	public String getIs_mensajeUsuario() {
		return is_mensajeUsuario;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad mensaje usuario.
	 *
	 * @param as_mensajeUsuario el nuevo valor para la propiedad mensaje usuario
	 */
	public void setIs_mensajeUsuario(String as_mensajeUsuario) {
		this.is_mensajeUsuario = as_mensajeUsuario;
	}
	
}
