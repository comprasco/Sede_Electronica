/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: MatriculaDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: MatriculaDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

import com.google.gson.annotations.SerializedName;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Matricula.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 * 
 */
public class MatriculaDTO extends GenericoDTO {
	
	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo matricula.
	 */
	@SerializedName("matricula")
	private String is_codigoMatricula;
	
	/**
	 * Atributo de instancia tipo CirculoRegistralDTO para definir la propiedad
	 * circulo registral matricula.
	 */
	@SerializedName("circuloRegistral")
	private CirculoRegistralDTO icr_circuloRegistralMatricula;
	
	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad migracion.
	 */
	@SerializedName("estadoMigracion")
	private Boolean ib_estadoMigracion;

	/**
	 * Obtiene el valor para la propiedad codigo matricula.
	 *
	 * @return El valor de la propiedad codigo matricula
	 */
	public String getIs_codigoMatricula() {
		return is_codigoMatricula;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad codigo matricula.
	 *
	 * @param as_codigoMatricula el nuevo valor para la propiedad codigo matricula
	 */
	public void setIs_codigoMatricula(String as_codigoMatricula) {
		this.is_codigoMatricula = as_codigoMatricula;
	}

	/**
	 * Obtiene el valor para la propiedad circulo registral matricula.
	 *
	 * @return El valor de la propiedad circulo registral matricula
	 */
	public CirculoRegistralDTO getIcr_circuloRegistralMatricula() {
		return icr_circuloRegistralMatricula;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad circulo registral matricula.
	 *
	 * @param acr_circuloRegistralMatricula el nuevo valor para la propiedad circulo
	 *                                      registral matricula
	 */
	public void setIcr_circuloRegistralMatricula(CirculoRegistralDTO acr_circuloRegistralMatricula) {
		this.icr_circuloRegistralMatricula = acr_circuloRegistralMatricula;
	}

	/**
	 * Obtiene el valor para la propiedad migracion.
	 *
	 * @return El valor de la propiedad migracion
	 */
	public Boolean getIb_estadoMigracion() {
		return ib_estadoMigracion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad migracion.
	 *
	 * @param ab_llenado el nuevo valor para la propiedad migracion
	 */
	public void setIb_estadoMigracion(Boolean ab_estadoMigracion) {
		this.ib_estadoMigracion = ab_estadoMigracion;
	}

}
