/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TipoEntradaObtenerArchivoWSDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto
 * Nombre del elemento: TipoEntradaObtenerArchivoWSDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoDTO;

/**
 * Clase tipo objeto de transferencia de datos para web service (WSDTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y servicios web.
 * <br>
 * Contiene propiedades para representar los datos del objeto Tipo entrada
 * obtener archivo.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoEntradaObtenerArchivoWSDTO extends GenericoDTO{

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad d
	 * id.
	 */
	private String is_dId;
	
	/**
	 * Obtiene el valor para la propiedad d id.
	 *
	 * @return El valor de la propiedad d id
	 */
	public String getIs_dId() {
		return is_dId;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad d id.
	 *
	 * @param as_dId el nuevo valor para la propiedad d id
	 */
	public void setIs_dId(String as_dId) {
		this.is_dId = as_dId;
	}
}
