/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: CorreoDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: CorreoDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

import java.io.Serializable;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Correo.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class CorreoDTO implements Serializable {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 3955744991000514111L;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo.
	 */
	private String is_codigo;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * clave.
	 */
	private String is_clave;
	
	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad boolean.
	 */
	private Boolean ib_boolean;

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
	 * Obtiene el valor para la propiedad clave.
	 *
	 * @return El valor de la propiedad clave
	 */
	public String getIs_clave() {
		return is_clave;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad clave.
	 *
	 * @param as_clave el nuevo valor para la propiedad clave
	 */
	public void setIs_clave(String as_clave) {
		this.is_clave = as_clave;
	}

	/**
	 * Obtiene el valor para la propiedad boolean.
	 *
	 * @return El valor de la propiedad boolean
	 */
	public Boolean getIb_boolean() {
		return ib_boolean;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad boolean.
	 *
	 * @param ab_boolean el nuevo valor para la propiedad boolean
	 */
	public void setIb_boolean(Boolean ab_boolean) {
		this.ib_boolean = ab_boolean;
	}

}
