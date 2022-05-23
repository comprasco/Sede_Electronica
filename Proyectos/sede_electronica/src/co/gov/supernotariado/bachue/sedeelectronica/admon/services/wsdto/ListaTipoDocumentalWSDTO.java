/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ListaOficinasOrigenWSDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto
 * Nombre del elemento: ListaOficinasOrigenWSDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto;

import java.io.Serializable;

/**
 * Clase tipo objeto de transferencia de datos para web service (WSDTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y servicios web.
 * <br>
 * Contiene propiedades para representar los datos del objeto Lista tipo
 * documental.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ListaTipoDocumentalWSDTO implements Serializable {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre del tipo documental.
	 */
	private String is_nomTipoDocumentoPublico;

	/**
	 * Obtiene el valor para la propiedad nombre tipo documental.
	 *
	 * @return El valor de la propiedad nombre tipo documental
	 */
	public String getIs_nomTipoDocumentoPublico() {
		return is_nomTipoDocumentoPublico;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nombre tipo documental.
	 *
	 * @param as_nombreOficinaOrigen el nuevo valor para la propiedad tipo
	 *                               documental
	 */
	public void setIs_nomTipoDocumentoPublico(String as_nomTipoDocumentoPublico) {
		this.is_nomTipoDocumentoPublico = as_nomTipoDocumentoPublico;
	}

}
