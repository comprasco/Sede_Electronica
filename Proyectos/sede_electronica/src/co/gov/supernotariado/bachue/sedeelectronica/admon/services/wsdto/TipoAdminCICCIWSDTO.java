/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TipoAdminCICCIWSDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto
 * Nombre del elemento: TipoAdminCICCIWSDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto;

import java.io.Serializable;

/**
 * Clase tipo objeto de transferencia de datos para web service (WSDTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y servicios web.
 * <br>
 * Contiene propiedades para representar los datos del objeto Tipo admin CICCI.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoAdminCICCIWSDTO implements Serializable {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo documento admin.
	 */
	private String is_tipoDocAdmin;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero documento admin.
	 */
	private String is_numDocAdmin;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * correo electronico corporativo usuario.
	 */
	private String is_correoElectronicoCorporativoUsuario;

	/**
	 * Obtiene el valor para la propiedad tipo documento admin.
	 *
	 * @return El valor de la propiedad tipo documento admin
	 */
	public String getIs_tipoDocAdmin() {
		return is_tipoDocAdmin;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo documento admin.
	 *
	 * @param as_tipoDocAdmin el nuevo valor para la propiedad tipo documento admin
	 */
	public void setIs_tipoDocAdmin(String as_tipoDocAdmin) {
		this.is_tipoDocAdmin = as_tipoDocAdmin;
	}

	/**
	 * Obtiene el valor para la propiedad numero documento admin.
	 *
	 * @return El valor de la propiedad numero documento admin
	 */
	public String getIs_numDocAdmin() {
		return is_numDocAdmin;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad numero documento admin.
	 *
	 * @param as_numDocAdmin el nuevo valor para la propiedad numero documento admin
	 */
	public void setIs_numDocAdmin(String as_numDocAdmin) {
		this.is_numDocAdmin = as_numDocAdmin;
	}

	/**
	 * Obtiene el valor para la propiedad correo electronico corporativo usuario.
	 *
	 * @return El valor de la propiedad correo electronico corporativo usuario
	 */
	public String getIs_correoElectronicoCorporativoUsuario() {
		return is_correoElectronicoCorporativoUsuario;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad correo electronico corporativo
	 * usuario.
	 *
	 * @param as_correoElectronicoCorporativoUsuario el nuevo valor para la
	 *                                               propiedad correo electronico
	 *                                               corporativo usuario
	 */
	public void setIs_correoElectronicoCorporativoUsuario(String as_correoElectronicoCorporativoUsuario) {
		this.is_correoElectronicoCorporativoUsuario = as_correoElectronicoCorporativoUsuario;
	}
}
