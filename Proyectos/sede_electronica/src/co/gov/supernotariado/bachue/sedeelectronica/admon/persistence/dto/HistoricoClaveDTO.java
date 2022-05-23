/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: HistoricoClaveDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: HistoricoClaveDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Historico clave.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class HistoricoClaveDTO extends GenericoBaseDTO {
	
	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	// Atributos

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * clave hash.
	 */
	private String is_claveHash;
	
	/**
	 * Atributo de instancia tipo UsuarioDTO para definir la propiedad usuario.
	 */
	private UsuarioDTO iu_usuarioDto;

	// Constructor

	/**
	 * Construye una nueva instancia/objeto de la clase HistoricoClaveDTO.
	 */
	public HistoricoClaveDTO() {
		// Metodo constructor vacio para modelo DTO
	}

	// Getters-Setters

	/**
	 * Obtiene el valor para la propiedad clave hash.
	 *
	 * @return El valor de la propiedad clave hash
	 */
	public String getIs_claveHash() {
		return is_claveHash;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad clave hash.
	 *
	 * @param as_claveHash el nuevo valor para la propiedad clave hash
	 */
	public void setIs_claveHash(String as_claveHash) {
		this.is_claveHash = as_claveHash;
	}

	/**
	 * Obtiene el valor para la propiedad usuario dto.
	 *
	 * @return El valor de la propiedad usuario dto
	 */
	public UsuarioDTO getIu_usuarioDto() {
		return iu_usuarioDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad usuario dto.
	 *
	 * @param au_usuarioDto el nuevo valor para la propiedad usuario dto
	 */
	public void setIu_usuarioDto(UsuarioDTO au_usuarioDto) {
		this.iu_usuarioDto = au_usuarioDto;
	}
}
