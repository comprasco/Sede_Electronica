/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BusquedaDatosCatastralesDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: BusquedaDatosCatastralesDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Busqueda datos
 * catastrales.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class BusquedaDatosCatastralesDTO extends GenericoBaseDTO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * cedula catastral.
	 */
	private String is_cedulaCatastral;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nupre.
	 */
	private String is_nupre;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * chip.
	 */
	private String is_chip;

	/**
	 * Obtiene el valor para la propiedad cedula catastral.
	 *
	 * @return El valor de la propiedad cedula catastral
	 */
	public String getIs_cedulaCatastral() {
		return is_cedulaCatastral;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad cedula catastral.
	 *
	 * @param as_cedulaCatastral el nuevo valor para la propiedad cedula catastral
	 */
	public void setIs_cedulaCatastral(String as_cedulaCatastral) {
		this.is_cedulaCatastral = as_cedulaCatastral;
	}

	/**
	 * Obtiene el valor para la propiedad nupre.
	 *
	 * @return El valor de la propiedad nupre
	 */
	public String getIs_nupre() {
		return is_nupre;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nupre.
	 *
	 * @param as_nupre el nuevo valor para la propiedad nupre
	 */
	public void setIs_nupre(String as_nupre) {
		this.is_nupre = as_nupre;
	}

	/**
	 * Obtiene el valor para la propiedad chip.
	 *
	 * @return El valor de la propiedad chip
	 */
	public String getIs_chip() {
		return is_chip;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad chip.
	 *
	 * @param as_chip el nuevo valor para la propiedad chip
	 */
	public void setIs_chip(String as_chip) {
		this.is_chip = as_chip;
	}

}