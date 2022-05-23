/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: CancelacionAnotacionWSDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto
 * Nombre del elemento: CancelacionAnotacionWSDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto;

import java.io.Serializable;


/**
 * Clase tipo objeto de transferencia de datos para web service (WSDTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y servicios web.
 * <br>
 * Contiene propiedades para representar los datos del objeto Cancelacion
 * anotacion.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class CancelacionAnotacionWSDTO implements Serializable {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;  
	
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero anotacion.
	 */
    private String is_numeroAnotacion;

	/**
	 * Obtiene el valor para la propiedad numero anotacion.
	 *
	 * @return El valor de la propiedad numero anotacion
	 */
	public String getIs_numeroAnotacion() {
		return is_numeroAnotacion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad numero anotacion.
	 *
	 * @param as_numeroAnotacion el nuevo valor para la propiedad numero anotacion
	 */
	public void setIs_numeroAnotacion(String as_numeroAnotacion) {
		this.is_numeroAnotacion = as_numeroAnotacion;
	}
    
}
