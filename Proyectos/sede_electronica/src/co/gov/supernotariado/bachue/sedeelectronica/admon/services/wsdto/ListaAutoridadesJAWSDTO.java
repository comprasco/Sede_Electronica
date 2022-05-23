/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ListaAutoridadesJAWSDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto
 * Nombre del elemento: ListaAutoridadesJAWSDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto;

import java.io.Serializable;

/**
 * Clase tipo objeto de transferencia de datos para web service (WSDTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y servicios web.
 * <br>
 * Contiene propiedades para representar los datos del objeto Lista autoridades
 * JA.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ListaAutoridadesJAWSDTO implements Serializable{
	
	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo autoridad.
	 */
	private String is_codigoAutoridad;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre autoridad.
	 */
	private String is_nombreAutoridad;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad es
	 * agencia nacional tierras.
	 */
	private String is_esAgenciaNacionalTierras;
	
	/**
	 * Obtiene el valor para la propiedad codigo autoridad.
	 *
	 * @return El valor de la propiedad codigo autoridad
	 */
	public String getIs_codigoAutoridad() {
		return is_codigoAutoridad;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad codigo autoridad.
	 *
	 * @param as_codigoAutoridad el nuevo valor para la propiedad codigo autoridad
	 */
	public void setIs_codigoAutoridad(String as_codigoAutoridad) {
		this.is_codigoAutoridad = as_codigoAutoridad;
	}
	
	/**
	 * Obtiene el valor para la propiedad nombre autoridad.
	 *
	 * @return El valor de la propiedad nombre autoridad
	 */
	public String getIs_nombreAutoridad() {
		return is_nombreAutoridad;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad nombre autoridad.
	 *
	 * @param as_nombreAutoridad el nuevo valor para la propiedad nombre autoridad
	 */
	public void setIs_nombreAutoridad(String as_nombreAutoridad) {
		this.is_nombreAutoridad = as_nombreAutoridad;
	}
	
	/**
	 * Obtiene el valor para la propiedad es agencia nacional tierras.
	 *
	 * @return El valor de la propiedad es agencia nacional tierras
	 */
	public String getIs_esAgenciaNacionalTierras() {
		return is_esAgenciaNacionalTierras;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad es agencia nacional tierras.
	 *
	 * @param as_esAgenciaNacionalTierras el nuevo valor para la propiedad es
	 *                                    agencia nacional tierras
	 */
	public void setIs_esAgenciaNacionalTierras(String as_esAgenciaNacionalTierras) {
		this.is_esAgenciaNacionalTierras = as_esAgenciaNacionalTierras;
	}
	
	

}
