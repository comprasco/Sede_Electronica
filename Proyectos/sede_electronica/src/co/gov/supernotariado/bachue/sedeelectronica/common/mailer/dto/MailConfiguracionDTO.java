/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: MailConfiguracionDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.mailer.dto
 * Nombre del elemento: MailConfiguracionDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.mailer.dto;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoDTO;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Mail
 * configuracion.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class MailConfiguracionDTO extends GenericoDTO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * servidor.
	 */
	private String is_servidor;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * puerto.
	 */
	private String is_puerto;

	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad
	 * autenticacion.
	 */
	private boolean ib_autenticacion;

	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad ssl.
	 */
	private boolean ib_ssl;

	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad tls.
	 */
	private boolean ib_tls;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * origen.
	 */
	private String is_origen;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * contrasena.
	 */
	private String is_contrasena;

	/**
	 * Obtiene el valor para la propiedad servidor.
	 *
	 * @return El valor de la propiedad servidor
	 */
	public String getIs_servidor() {
		return is_servidor;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad servidor.
	 *
	 * @param as_servidor el nuevo valor para la propiedad servidor
	 */
	public void setIs_servidor(String as_servidor) {
		this.is_servidor = as_servidor;
	}

	/**
	 * Obtiene el valor para la propiedad puerto.
	 *
	 * @return El valor de la propiedad puerto
	 */
	public String getIs_puerto() {
		return is_puerto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad puerto.
	 *
	 * @param as_puerto el nuevo valor para la propiedad puerto
	 */
	public void setIs_puerto(String as_puerto) {
		this.is_puerto = as_puerto;
	}

	/**
	 * Obtiene el valor para la propiedad autenticacion.
	 *
	 * @return true, si se cumple la propiedad autenticacion, false caso contrario
	 */
	public boolean isIb_autenticacion() {
		return ib_autenticacion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad autenticacion.
	 *
	 * @param ab_autenticacion el nuevo valor para la propiedad autenticacion
	 */
	public void setIb_autenticacion(Boolean ab_autenticacion) {
		this.ib_autenticacion = ab_autenticacion;
	}

	/**
	 * Obtiene el valor para la propiedad ssl.
	 *
	 * @return true, si se cumple la propiedad ssl, false caso contrario
	 */
	public boolean isIb_ssl() {
		return ib_ssl;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad ssl.
	 *
	 * @param ab_ssl el nuevo valor para la propiedad ssl
	 */
	public void setIb_ssl(Boolean ab_ssl) {
		this.ib_ssl = ab_ssl;
	}

	/**
	 * Obtiene el valor para la propiedad tls.
	 *
	 * @return true, si se cumple la propiedad tls, false caso contrario
	 */
	public boolean isIb_tls() {
		return ib_tls;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tls.
	 *
	 * @param ab_tls el nuevo valor para la propiedad tls
	 */
	public void setIb_tls(Boolean ab_tls) {
		this.ib_tls = ab_tls;
	}

	/**
	 * Obtiene el valor para la propiedad origen.
	 *
	 * @return El valor de la propiedad origen
	 */
	public String getIs_origen() {
		return is_origen;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad origen.
	 *
	 * @param as_origen el nuevo valor para la propiedad origen
	 */
	public void setIs_origen(String as_origen) {
		this.is_origen = as_origen;
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

}
