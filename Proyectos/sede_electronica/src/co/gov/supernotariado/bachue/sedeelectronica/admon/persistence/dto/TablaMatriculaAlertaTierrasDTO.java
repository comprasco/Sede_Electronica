/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TablaMatriculaAlertaTierrasDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: TablaMatriculaAlertaTierrasDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

import javax.annotation.PostConstruct;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Tabla matricula
 * alerta tierras.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TablaMatriculaAlertaTierrasDTO extends GenericoBaseDTO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * orip.
	 */
	private String is_orip;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero matricula.
	 */
	private String is_numeroMatricula;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero catastral.
	 */
	private String is_numeroCatastral;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * matricula derivada.
	 */
	private String is_matriculaDerivada;
	
	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad
	 * desactivar botones.
	 */
	private Boolean ib_desactivarBotones; 

	/**
	 * Inicializa el objeto.
	 */
	@PostConstruct
	public void init() {
		ib_desactivarBotones = false;
	}
	
	/**
	 * Obtiene el valor para la propiedad orip.
	 *
	 * @return El valor de la propiedad orip
	 */
	public String getIs_orip() {
		return is_orip;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad orip.
	 *
	 * @param as_orip el nuevo valor para la propiedad orip
	 */
	public void setIs_orip(String as_orip) {
		this.is_orip = as_orip;
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

	/**
	 * Obtiene el valor para la propiedad numero catastral.
	 *
	 * @return El valor de la propiedad numero catastral
	 */
	public String getIs_numeroCatastral() {
		return is_numeroCatastral;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad numero catastral.
	 *
	 * @param as_numeroCatastral el nuevo valor para la propiedad numero catastral
	 */
	public void setIs_numeroCatastral(String as_numeroCatastral) {
		this.is_numeroCatastral = as_numeroCatastral;
	}

	/**
	 * Obtiene el valor para la propiedad matricula derivada.
	 *
	 * @return El valor de la propiedad matricula derivada
	 */
	public String getIs_matriculaDerivada() {
		return is_matriculaDerivada;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad matricula derivada.
	 *
	 * @param as_matriculaDerivada el nuevo valor para la propiedad matricula
	 *                             derivada
	 */
	public void setIs_matriculaDerivada(String as_matriculaDerivada) {
		this.is_matriculaDerivada = as_matriculaDerivada;
	}

	/**
	 * Obtiene el valor para la propiedad desactivar botones.
	 *
	 * @return El valor de la propiedad desactivar botones
	 */
	public Boolean getIb_desactivarBotones() {
		return ib_desactivarBotones;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad desactivar botones.
	 *
	 * @param ab_desactivarBotones el nuevo valor para la propiedad desactivar
	 *                             botones
	 */
	public void setIb_desactivarBotones(Boolean ab_desactivarBotones) {
		this.ib_desactivarBotones = ab_desactivarBotones;
	}

}