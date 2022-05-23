/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TipoActoDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: TipoActoDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

import java.util.List;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Tipo acto.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoActoDTO extends GenericoBaseDTO {
	
	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

/**
 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
 * nombre.
 */
// --- Atributos
	private String is_nombre;
	
	/**
	 * Atributo de instancia tipo lista de ModeloMinutaActoDTO para definir la
	 * propiedad modelo minuta actos.
	 */
	private List<ModeloMinutaActoDTO> ilmma_modeloMinutaActos;

/**
 * Construye una nueva instancia/objeto de la clase TipoActoDTO.
 */
// --- Constructor
	public TipoActoDTO() {
		// Metodo constructor vacio para modelo DTO
	}

// --- Getters-Setters

	/**
 * Obtiene el valor para la propiedad nombre.
 *
 * @return El valor de la propiedad nombre
 */
public String getIs_nombre() {
		return this.is_nombre;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nombre.
	 *
	 * @param is_nombre el nuevo valor para la propiedad nombre
	 */
	public void setIs_nombre(String is_nombre) {
		this.is_nombre = is_nombre;
	}

	/**
	 * Obtiene el valor para la propiedad modelo minuta actos.
	 *
	 * @return El valor de la propiedad modelo minuta actos
	 */
	public List<ModeloMinutaActoDTO> getIlmma_modeloMinutaActos() {
		if (this.ilmma_modeloMinutaActos == null) {
			this.ilmma_modeloMinutaActos = new java.util.ArrayList<>(1);
		}
		return this.ilmma_modeloMinutaActos;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad modelo minuta actos.
	 *
	 * @param almma_modeloMinutaActos el nuevo valor para la propiedad modelo minuta
	 *                                actos
	 */
	public void setIlmma_modeloMinutaActos(List<ModeloMinutaActoDTO> almma_modeloMinutaActos) {
		this.ilmma_modeloMinutaActos = almma_modeloMinutaActos;
	}

}
