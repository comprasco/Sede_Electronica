/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: MunicipioPKDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: MunicipioPKDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Municipio PK.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class MunicipioPKDTO extends GenericoDTO {
	
	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad id
	 * municipio.
	 */
	// --- Atributos
	private String is_idMunicipio;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad id
	 * departamento.
	 */
	private String is_idDepartamento;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad id
	 * pais.
	 */
	private String is_idPais;

	/**
	 * Construye una nueva instancia/objeto de la clase MunicipioPKDTO.
	 */
	// --- Constructor
	public MunicipioPKDTO() {
		// Metodo constructor vacio para modelo DTO
	}

	/**
	 * Obtiene el valor para la propiedad id municipio.
	 *
	 * @return El valor de la propiedad id municipio
	 */
	// --- Getters-Setters
	public String getIs_idMunicipio() {
		return is_idMunicipio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id municipio.
	 *
	 * @param as_idMunicipio el nuevo valor para la propiedad id municipio
	 */
	public void setIs_idMunicipio(String as_idMunicipio) {
		this.is_idMunicipio = as_idMunicipio;
	}

	/**
	 * Obtiene el valor para la propiedad id departamento.
	 *
	 * @return El valor de la propiedad id departamento
	 */
	public String getIs_idDepartamento() {
		return is_idDepartamento;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id departamento.
	 *
	 * @param as_idDepartamento el nuevo valor para la propiedad id departamento
	 */
	public void setIs_idDepartamento(String as_idDepartamento) {
		this.is_idDepartamento = as_idDepartamento;
	}

	/**
	 * Obtiene el valor para la propiedad id pais.
	 *
	 * @return El valor de la propiedad id pais
	 */
	public String getIs_idPais() {
		return is_idPais;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id pais.
	 *
	 * @param as_idPais el nuevo valor para la propiedad id pais
	 */
	public void setIs_idPais(String as_idPais) {
		this.is_idPais = as_idPais;
	}

}
