/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TipoCatalogoDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: TipoCatalogoDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

import java.util.List;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Tipo catalogo.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoCatalogoDTO extends GenericoBaseDTO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * descripcion.
	 */
	// --- Atributos
	private String is_descripcion;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre.
	 */
	private String is_nombre;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo.
	 */
	private String is_codigo;
	
	/**
	 * Atributo de instancia tipo lista de CatalogoDTO para definir la propiedad
	 * catalogos.
	 */
	private List<CatalogoDTO> ilc_catalogosDto;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad es
	 * negocio.
	 */
	private String is_esNegocio;

	/**
	 * Construye una nueva instancia/objeto de la clase TipoCatalogoDTO.
	 */
	// --- Constructor
	public TipoCatalogoDTO() {
		// Metodo constructor vacio para modelo DTO
	}

	// --- Getters-Setters

	/**
	 * Obtiene el valor para la propiedad descripcion.
	 *
	 * @return El valor de la propiedad descripcion
	 */
	public String getIs_descripcion() {
		return is_descripcion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad descripcion.
	 *
	 * @param as_descripcion el nuevo valor para la propiedad descripcion
	 */
	public void setIs_descripcion(String as_descripcion) {
		this.is_descripcion = as_descripcion;
	}

	/**
	 * Obtiene el valor para la propiedad nombre.
	 *
	 * @return El valor de la propiedad nombre
	 */
	public String getIs_nombre() {
		return is_nombre;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nombre.
	 *
	 * @param as_nombre el nuevo valor para la propiedad nombre
	 */
	public void setIs_nombre(String as_nombre) {
		this.is_nombre = as_nombre;
	}

	/**
	 * Obtiene el valor para la propiedad codigo.
	 *
	 * @return El valor de la propiedad codigo
	 */
	public String getIs_codigo() {
		return is_codigo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad codigo.
	 *
	 * @param as_codigo el nuevo valor para la propiedad codigo
	 */
	public void setIs_codigo(String as_codigo) {
		this.is_codigo = as_codigo;
	}

	/**
	 * Obtiene el valor para la propiedad es negocio.
	 *
	 * @return El valor de la propiedad es negocio
	 */
	public String getIs_esNegocio() {
		return is_esNegocio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad es negocio.
	 *
	 * @param as_esNegocio el nuevo valor para la propiedad es negocio
	 */
	public void setIs_esNegocio(String as_esNegocio) {
		this.is_esNegocio = as_esNegocio;
	}

	/**
	 * Obtiene el valor para la propiedad catalogos dto.
	 *
	 * @return El valor de la propiedad catalogos dto
	 */
	public List<CatalogoDTO> getIlc_catalogosDto() {
		if (this.ilc_catalogosDto == null) {
			this.ilc_catalogosDto = new java.util.ArrayList<>(1);
		}
		return this.ilc_catalogosDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad catalogos dto.
	 *
	 * @param alc_catalogosDto el nuevo valor para la propiedad catalogos dto
	 */
	public void setIlc_catalogosDto(List<CatalogoDTO> alc_catalogosDto) {
		this.ilc_catalogosDto = alc_catalogosDto;
	}

}
