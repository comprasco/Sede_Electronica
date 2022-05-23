/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: EntradaGenericaAutenticacionActivaVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.pasarela
 * Nombre del elemento: EntradaGenericaAutenticacionActivaVO
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
 * Entrada generica autenticacion activa .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class EntradaGenericaAutenticacionActivaVO  extends ClienteIntegracionVO implements Serializable{

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 5635172875750908048L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * empresa.
	 */
	@SerializedName("company")
	private String is_empresa;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * contrasena.
	 */
	@SerializedName("password")
	private String is_contrasena;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * negocio.
	 */
	@SerializedName("business")
	private String is_negocio;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo negocio.
	 */
	@SerializedName("businessType")
	private String is_tipoNegocio;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * token.
	 */
	@SerializedName("token")
	private String is_token;
	
	/**
	 * Obtiene el valor para la propiedad empresa.
	 *
	 * @return El valor de la propiedad empresa
	 */
	public String getIs_empresa() {
		return is_empresa;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad empresa.
	 *
	 * @param as_empresa el nuevo valor para la propiedad empresa
	 */
	public void setIs_empresa(String as_empresa) {
		this.is_empresa = as_empresa;
	}
	
	/**
	 * Obtiene el valor para la propiedad contrasena.
	 *
	 * @return El valor de la propiedad contrasena
	 */
	public String getIs_contrasena() {
		return is_contrasena;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad contrasena.
	 *
	 * @param as_contrasena el nuevo valor para la propiedad contrasena
	 */
	public void setIs_contrasena(String as_contrasena) {
		this.is_contrasena = as_contrasena;
	}
	
	/**
	 * Obtiene el valor para la propiedad negocio.
	 *
	 * @return El valor de la propiedad negocio
	 */
	public String getIs_negocio() {
		return is_negocio;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad negocio.
	 *
	 * @param as_negocio el nuevo valor para la propiedad negocio
	 */
	public void setIs_negocio(String as_negocio) {
		this.is_negocio = as_negocio;
	}
	
	/**
	 * Obtiene el valor para la propiedad tipo negocio.
	 *
	 * @return El valor de la propiedad tipo negocio
	 */
	public String getIs_tipoNegocio() {
		return is_tipoNegocio;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad tipo negocio.
	 *
	 * @param as_tipoNegocio el nuevo valor para la propiedad tipo negocio
	 */
	public void setIs_tipoNegocio(String as_tipoNegocio) {
		this.is_tipoNegocio = as_tipoNegocio;
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
	
}
