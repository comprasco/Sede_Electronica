/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: LetraEjeDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: LetraEjeDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Letra eje.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class LetraEjeDTO extends GenericoBaseDTO{

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * letra.
	 */
	private String is_letra;
	
	/**
	 * Obtiene el valor para la propiedad letra.
	 *
	 * @return El valor de la propiedad letra
	 */
	public String getIs_letra() {
		return is_letra;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad letra.
	 *
	 * @param as_letra el nuevo valor para la propiedad letra
	 */
	public void setIs_letra(String as_letra) {
		this.is_letra = as_letra;
	}	
}
