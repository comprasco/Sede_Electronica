/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EntradaGenericaAutenticacionActivaWSDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.pasarelarealpay.wsdto
 * Nombre del elemento: EntradaGenericaAutenticacionActivaWSDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.pasarelarealpay.wsdto;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoDTO;

/**
 * Clase tipo objeto de transferencia de datos para web service (WSDTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y servicios web.
 * <br>
 * Contiene propiedades para representar los datos del objeto Entrada generica
 * autenticacion activa. <br>
 * <em>Nota:</em> En modelos de pasarela el nombre de las variables no aplican
 * el estandar porque es necesario para el mapeo y serializacion al servicio de
 * realpay
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class EntradaGenericaAutenticacionActivaWSDTO  extends GenericoDTO implements Serializable{

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 5635172875750908048L;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * company.
	 */
	@SerializedName("compania")
	private String is_company;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * password.
	 */
	@SerializedName("contrasena")
	private String is_password;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * business.
	 */
	@SerializedName("tipoServicio")
	private String is_business;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * business type.
	 */
	@SerializedName("tipoSuServicio")
	private String is_businessType;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * token.
	 */
	@SerializedName("token")
	private String is_token;
	
	/**
	 * Obtiene el valor para la propiedad company.
	 *
	 * @return El valor de la propiedad company
	 */
	public String getIs_company() {
		return is_company;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad company.
	 *
	 * @param as_company el nuevo valor para la propiedad company
	 */
	public void setIs_company(String as_company) {
		this.is_company = as_company;
	}
	
	/**
	 * Obtiene el valor para la propiedad password.
	 *
	 * @return El valor de la propiedad password
	 */
	public String getIs_password() {
		return is_password;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad password.
	 *
	 * @param as_password el nuevo valor para la propiedad password
	 */
	public void setIs_password(String as_password) {
		this.is_password = as_password;
	}
	
	/**
	 * Obtiene el valor para la propiedad business.
	 *
	 * @return El valor de la propiedad business
	 */
	public String getIs_business() {
		return is_business;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad business.
	 *
	 * @param as_business el nuevo valor para la propiedad business
	 */
	public void setIs_business(String as_business) {
		this.is_business = as_business;
	}
	
	/**
	 * Obtiene el valor para la propiedad business type.
	 *
	 * @return El valor de la propiedad business type
	 */
	public String getIs_businessType() {
		return is_businessType;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad business type.
	 *
	 * @param as_businessType el nuevo valor para la propiedad business type
	 */
	public void setIs_businessType(String as_businessType) {
		this.is_businessType = as_businessType;
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
