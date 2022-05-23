/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: AnotacionesCanceladasWSDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto
 * Nombre del elemento: AnotacionesCanceladasWSDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoDTO;

/**
 * Clase tipo objeto de transferencia de datos para web service (WSDTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y servicios web.
 * <br>
 * Contiene propiedades para representar los datos del objeto Anotaciones
 * canceladas.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class AnotacionesCanceladasWSDTO extends GenericoDTO
{
	
	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * anotacion cancelada.
	 */
	private String is_anotacionCancelada;
	
	/**
	 * Obtiene el valor para la propiedad anotacion cancelada.
	 *
	 * @return El valor de la propiedad anotacion cancelada
	 */
	public String getIs_anotacionCancelada() {
		return is_anotacionCancelada;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad anotacion cancelada.
	 *
	 * @param as_anotacionCancelada el nuevo valor para la propiedad anotacion
	 *                              cancelada
	 */
	public void setIs_anotacionCancelada(String as_anotacionCancelada) {
		this.is_anotacionCancelada = as_anotacionCancelada;
	}
}