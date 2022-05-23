/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: MatriculaMatrizDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: MatriculaMatrizDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Matricula matriz.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class MatriculaMatrizDTO extends GenericoDTO{

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad num
	 * matricula inmobiliaria.
	 */
	private String is_numMatriculaInmobiliaria;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad cod
	 * circulo registral.
	 */
	private String is_codCirculoRegistral;
	
	/**
	 * Obtiene el valor para la propiedad num matricula inmobiliaria.
	 *
	 * @return El valor de la propiedad num matricula inmobiliaria
	 */
	public String getIs_numMatriculaInmobiliaria() {
		return is_numMatriculaInmobiliaria;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad num matricula inmobiliaria.
	 *
	 * @param as_numMatriculaInmobiliaria el nuevo valor para la propiedad num
	 *                                    matricula inmobiliaria
	 */
	public void setIs_numMatriculaInmobiliaria(String as_numMatriculaInmobiliaria) {
		this.is_numMatriculaInmobiliaria = as_numMatriculaInmobiliaria;
	}
	
	/**
	 * Obtiene el valor para la propiedad cod circulo registral.
	 *
	 * @return El valor de la propiedad cod circulo registral
	 */
	public String getIs_codCirculoRegistral() {
		return is_codCirculoRegistral;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad cod circulo registral.
	 *
	 * @param as_codCirculoRegistral el nuevo valor para la propiedad cod circulo
	 *                               registral
	 */
	public void setIs_codCirculoRegistral(String as_codCirculoRegistral) {
		this.is_codCirculoRegistral = as_codCirculoRegistral;
	}
}
