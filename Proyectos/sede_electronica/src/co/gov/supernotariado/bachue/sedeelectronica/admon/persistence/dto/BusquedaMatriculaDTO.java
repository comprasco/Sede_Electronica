/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BusquedaMatriculaDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: BusquedaMatriculaDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Busqueda
 * matricula.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class BusquedaMatriculaDTO extends GenericoBaseDTO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * oficina registro.
	 */
	private String is_oficinaRegistro;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * circulo registral.
	 */
	private String is_circuloRegistral;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero matricula.
	 */
	private String is_numeroMatricula;

	/**
	 * Obtiene el valor para la propiedad oficina registro.
	 *
	 * @return El valor de la propiedad oficina registro
	 */
	public String getIs_oficinaRegistro() {
		return is_oficinaRegistro;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad oficina registro.
	 *
	 * @param as_oficinaRegistro el nuevo valor para la propiedad oficina registro
	 */
	public void setIs_oficinaRegistro(String as_oficinaRegistro) {
		this.is_oficinaRegistro = as_oficinaRegistro;
	}

	/**
	 * Obtiene el valor para la propiedad circulo registral.
	 *
	 * @return El valor de la propiedad circulo registral
	 */
	public String getIs_circuloRegistral() {
		return is_circuloRegistral;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad circulo registral.
	 *
	 * @param as_circuloRegistral el nuevo valor para la propiedad circulo registral
	 */
	public void setIs_circuloRegistral(String as_circuloRegistral) {
		this.is_circuloRegistral = as_circuloRegistral;
	}

	/**
	 * Obtiene el valor para la propiedad numero matricula.
	 *
	 * @return El valor de la propiedad numero matricula
	 */
	public String getIs_numeroMatricula() {
		return is_numeroMatricula;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad numero matricula.
	 *
	 * @param as_numeroMatricula el nuevo valor para la propiedad numero matricula
	 */
	public void setIs_numeroMatricula(String as_numeroMatricula) {
		this.is_numeroMatricula = as_numeroMatricula;
	}

}