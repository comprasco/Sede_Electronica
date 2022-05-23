/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ModeloMinutaActoDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: ModeloMinutaActoDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Modelo minuta
 * acto.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ModeloMinutaActoDTO extends GenericoBaseDTO {
	
	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

/**
 * Atributo de instancia tipo ModeloMinutaDTO para definir la propiedad modelo
 * minuta.
 */
// --- Atributos
	private ModeloMinutaDTO imm_modeloMinuta;
	
	/**
	 * Atributo de instancia tipo TipoActoDTO para definir la propiedad tipo acto.
	 */
	private TipoActoDTO ita_tipoActo;

/**
 * Construye una nueva instancia/objeto de la clase ModeloMinutaActoDTO.
 */
// --- Constructor
	public ModeloMinutaActoDTO() {
		// Metodo constructor vacio para modelo DTO
	}

// --- Getters-Setters	

	/**
 * Obtiene el valor para la propiedad modelo minuta.
 *
 * @return El valor de la propiedad modelo minuta
 */
public ModeloMinutaDTO getImm_modeloMinuta() {
		return this.imm_modeloMinuta;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad modelo minuta.
	 *
	 * @param imm_modeloMinuta el nuevo valor para la propiedad modelo minuta
	 */
	public void setImm_modeloMinuta(ModeloMinutaDTO imm_modeloMinuta) {
		this.imm_modeloMinuta = imm_modeloMinuta;
	}

	/**
	 * Obtiene el valor para la propiedad tipo acto.
	 *
	 * @return El valor de la propiedad tipo acto
	 */
	public TipoActoDTO getIta_tipoActo() {
		return this.ita_tipoActo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo acto.
	 *
	 * @param ita_tipoActo el nuevo valor para la propiedad tipo acto
	 */
	public void setIta_tipoActo(TipoActoDTO ita_tipoActo) {
		this.ita_tipoActo = ita_tipoActo;
	}

}
