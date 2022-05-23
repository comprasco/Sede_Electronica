/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TipoProcesoDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: TipoProcesoDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

import java.util.List;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Tipo proceso.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoProcesoDTO extends GenericoBaseDTO {
	
	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

/**
 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
 * codigo.
 */
// --- Atributos
	private String is_codigo;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * descripcion.
	 */
	private String is_descripcion;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre.
	 */
	private String is_nombre;
	
	/**
	 * Atributo de instancia tipo lista de IntegracionDTO para definir la propiedad
	 * integracions.
	 */
	private List<IntegracionDTO> ili_integracionsDto;
	
	/**
	 * Atributo de instancia tipo lista de ParametroDTO para definir la propiedad
	 * parametros.
	 */
	private List<ParametroDTO> ilp_parametrosDto;
	
	/**
	 * Atributo de instancia tipo lista de IntegracionTemporalDTO para definir la
	 * propiedad integracion temporals.
	 */
	private List<IntegracionTemporalDTO> ilit_integracionTemporalsDto;

/**
 * Construye una nueva instancia/objeto de la clase TipoProcesoDTO.
 */
// --- Constructor
	public TipoProcesoDTO() {
		// Metodo constructor vacio para modelo DTO
	}

// --- Getters-Setters

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
	 * Obtiene el valor para la propiedad integracions dto.
	 *
	 * @return El valor de la propiedad integracions dto
	 */
	public List<IntegracionDTO> getIli_integracionsDto() {
		if (this.ili_integracionsDto == null) {
			this.ili_integracionsDto = new java.util.ArrayList<>(1);
		}
		return this.ili_integracionsDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad integracions dto.
	 *
	 * @param ali_integracionsDto el nuevo valor para la propiedad integracions dto
	 */
	public void setIli_integracionsDto(List<IntegracionDTO> ali_integracionsDto) {
		this.ili_integracionsDto = ali_integracionsDto;
	}

	/**
	 * Obtiene el valor para la propiedad parametros dto.
	 *
	 * @return El valor de la propiedad parametros dto
	 */
	public List<ParametroDTO> getIlp_parametrosDto() {
		if (this.ilp_parametrosDto == null) {
			this.ilp_parametrosDto = new java.util.ArrayList<>(1);
		}
		return this.ilp_parametrosDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad parametros dto.
	 *
	 * @param alp_parametrosDto el nuevo valor para la propiedad parametros dto
	 */
	public void setIlp_parametrosDto(List<ParametroDTO> alp_parametrosDto) {
		this.ilp_parametrosDto = alp_parametrosDto;
	}

	/**
	 * Obtiene el valor para la propiedad integracion temporals dto.
	 *
	 * @return El valor de la propiedad integracion temporals dto
	 */
	public List<IntegracionTemporalDTO> getIlit_integracionTemporalsDto() {
		if (this.ilit_integracionTemporalsDto == null) {
			this.ilit_integracionTemporalsDto = new java.util.ArrayList<>(1);
		}
		return this.ilit_integracionTemporalsDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad integracion temporals dto.
	 *
	 * @param alit_integracionTemporalsDto el nuevo valor para la propiedad
	 *                                     integracion temporals dto
	 */
	public void setIlit_integracionTemporalsDto(List<IntegracionTemporalDTO> alit_integracionTemporalsDto) {
		this.ilit_integracionTemporalsDto = alit_integracionTemporalsDto;
	}
}
