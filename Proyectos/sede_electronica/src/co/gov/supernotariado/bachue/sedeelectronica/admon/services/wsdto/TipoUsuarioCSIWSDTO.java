/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TipoUsuarioCSIWSDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto
 * Nombre del elemento: TipoUsuarioCSIWSDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto;

import java.io.Serializable;

/**
 * Clase tipo objeto de transferencia de datos para web service (WSDTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y servicios web.
 * <br>
 * Contiene propiedades para representar los datos del objeto Tipo usuario CSI.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoUsuarioCSIWSDTO implements Serializable{

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo documento usuario.
	 */
	private String is_tipoDocUsuario;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero documento usuario.
	 */
	private String is_numDocUsuario;
	
	/**
	 * Obtiene el valor para la propiedad tipo documento usuario.
	 *
	 * @return El valor de la propiedad tipo documento usuario
	 */
	public String getIs_tipoDocUsuario() {
		return is_tipoDocUsuario;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad tipo documento usuario.
	 *
	 * @param as_tipoDocUsuario el nuevo valor para la propiedad tipo documento
	 *                          usuario
	 */
	public void setIs_tipoDocUsuario(String as_tipoDocUsuario) {
		this.is_tipoDocUsuario = as_tipoDocUsuario;
	}
	
	/**
	 * Obtiene el valor para la propiedad numero documento usuario.
	 *
	 * @return El valor de la propiedad numero documento usuario
	 */
	public String getIs_numDocUsuario() {
		return is_numDocUsuario;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad numero documento usuario.
	 *
	 * @param as_numDocUsuario el nuevo valor para la propiedad numero documento
	 *                         usuario
	 */
	public void setIs_numDocUsuario(String as_numDocUsuario) {
		this.is_numDocUsuario = as_numDocUsuario;
	}

}
