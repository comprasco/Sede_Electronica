/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: SolicitanteWSDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto
 * Nombre del elemento: SolicitanteWSDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoDTO;

/**
 * Clase tipo objeto de transferencia de datos para web service (WSDTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y servicios web.
 * <br>
 * Contiene propiedades para representar los datos del objeto Solicitante.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class SolicitanteWSDTO extends GenericoDTO{

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo documento.
	 */
	private String is_tipoDocumento;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero documento.
	 */
	private String is_numeroDocumento;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo persona.
	 */
	private String is_tipoPersona;

	/**
	 * Obtiene el valor para la propiedad tipo documento.
	 *
	 * @return El valor de la propiedad tipo documento
	 */
	public String getIs_tipoDocumento() {
		return is_tipoDocumento;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad tipo documento.
	 *
	 * @param as_tipoDocumento el nuevo valor para la propiedad tipo documento
	 */
	public void setIs_tipoDocumento(String as_tipoDocumento) {
		this.is_tipoDocumento = as_tipoDocumento;
	}
	
	/**
	 * Obtiene el valor para la propiedad numero documento.
	 *
	 * @return El valor de la propiedad numero documento
	 */
	public String getIs_numeroDocumento() {
		return is_numeroDocumento;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad numero documento.
	 *
	 * @param as_numeroDocumento el nuevo valor para la propiedad numero documento
	 */
	public void setIs_numeroDocumento(String as_numeroDocumento) {
		this.is_numeroDocumento = as_numeroDocumento;
	}
	
	/**
	 * Obtiene el valor para la propiedad tipo persona.
	 *
	 * @return El valor de la propiedad tipo persona
	 */
	public String getIs_tipoPersona() {
		return is_tipoPersona;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad tipo persona.
	 *
	 * @param as_tipoPersona el nuevo valor para la propiedad tipo persona
	 */
	public void setIs_tipoPersona(String as_tipoPersona) {
		this.is_tipoPersona = as_tipoPersona;
	}
}
