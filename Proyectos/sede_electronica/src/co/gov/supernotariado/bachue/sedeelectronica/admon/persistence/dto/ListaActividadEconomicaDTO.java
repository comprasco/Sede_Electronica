/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ListaActividadEconomicaDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: ListaActividadEconomicaDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

import java.io.Serializable;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Lista actividad
 * economica.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ListaActividadEconomicaDTO implements Serializable {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * oficina origen.
	 */
	private String is_codigoActividadEconomica;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre oficina origen.
	 */
	private String is_nombreActividadEconomica;

	/**
	 * Obtiene el valor para la propiedad codigo actividad economica.
	 *
	 * @return El valor de la propiedad codigo actividad economica
	 */
	public String getIs_codigoActividadEconomica() {
		return is_codigoActividadEconomica;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad oficina origen.
	 *
	 * @param as_codigoActividadEconomica el nuevo valor para la propiedad codigo
	 *                                    actividad economica
	 */
	public void setIs_codigoActividadEconomica(String as_codigoActividadEconomica) {
		this.is_codigoActividadEconomica = as_codigoActividadEconomica;
	}

	/**
	 * Obtiene el valor para la propiedad nombre actividad economica.
	 *
	 * @return El valor de la propiedad nombre actividad economica
	 */
	public String getIs_nombreActividadEconomica() {
		return is_nombreActividadEconomica;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nombre actividad economica.
	 *
	 * @param as_nombreActividadEconomica el nuevo valor para la propiedad nombre
	 *                                    actividad economica
	 */
	public void setIs_nombreActividadEconomica(String as_nombreActividadEconomica) {
		this.is_nombreActividadEconomica = as_nombreActividadEconomica;
	}

}
