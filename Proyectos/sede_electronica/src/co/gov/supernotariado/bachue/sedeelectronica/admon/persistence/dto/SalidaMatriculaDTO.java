/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: SalidaMatriculaDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: SalidaMatriculaDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

import java.math.BigDecimal;
import java.math.BigInteger;

import com.google.gson.annotations.SerializedName;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Salida matricula.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class SalidaMatriculaDTO extends GenericoDTO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo MatriculaDTO para definir la propiedad matricula.
	 */
	@SerializedName("matricula")
	private MatriculaDTO im_matriculaDto;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * direccion.
	 */
	@SerializedName("direccion")
	private String is_direccion;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * municipio.
	 */
	@SerializedName("municipio")
	private String is_municipio;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * departamento.
	 */
	@SerializedName("departamento")
	private String is_departamento;
	
	/**
	 * Atributo de instancia tipo numero real/decimal de gran magnitud para definir
	 * la propiedad valor unitario.
	 */
	@SerializedName("valorUnitario")
	private BigDecimal ibd_valorUnitario;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * estado predio.
	 */
	@SerializedName("estadoPredio")
	private String is_estadoPredio;
	
	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad tiene
	 * error.
	 */
	@SerializedName("error")
	private Boolean ib_tieneError;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * mensaje error.
	 */
	@SerializedName("mensajeError")
	private String is_mensajeError;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad id.
	 */
	@SerializedName("idMatricula")
	private String is_id;
	
	/**
	 * Atributo de instancia tipo entero de gran magnitud para definir la propiedad
	 * cantidad solicitada.
	 */
	@SerializedName("cantidadSolicitada")
	private BigInteger ibi_cantidadSolicitada;
	//True si esta migrada False no migrada
	@SerializedName("matriculaMigrada")
	private Boolean ib_migradaMatricula;

	/**
	 * Obtiene el valor para la propiedad valor unitario.
	 *
	 * @return El valor de la propiedad valor unitario
	 */
	public BigDecimal getIbd_valorUnitario() {
		return ibd_valorUnitario;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad valor unitario.
	 *
	 * @param abd_valorUnitario el nuevo valor para la propiedad valor unitario
	 */
	public void setIbd_valorUnitario(BigDecimal abd_valorUnitario) {
		this.ibd_valorUnitario = abd_valorUnitario;
	}

	/**
	 * Obtiene el valor para la propiedad matricula dto.
	 *
	 * @return El valor de la propiedad matricula dto
	 */
	public MatriculaDTO getIm_matriculaDto() {
		return im_matriculaDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad matricula dto.
	 *
	 * @param am_matriculaDto el nuevo valor para la propiedad matricula dto
	 */
	public void setIm_matriculaDto(MatriculaDTO am_matriculaDto) {
		this.im_matriculaDto = am_matriculaDto;
	}

	/**
	 * Obtiene el valor para la propiedad direccion.
	 *
	 * @return El valor de la propiedad direccion
	 */
	public String getIs_direccion() {
		return is_direccion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad direccion.
	 *
	 * @param as_direccion el nuevo valor para la propiedad direccion
	 */
	public void setIs_direccion(String as_direccion) {
		this.is_direccion = as_direccion;
	}

	/**
	 * Obtiene el valor para la propiedad estado predio.
	 *
	 * @return El valor de la propiedad estado predio
	 */
	public String getIs_estadoPredio() {
		return is_estadoPredio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad estado predio.
	 *
	 * @param as_estadoPredio el nuevo valor para la propiedad estado predio
	 */
	public void setIs_estadoPredio(String as_estadoPredio) {
		this.is_estadoPredio = as_estadoPredio;
	}

	/**
	 * Obtiene el valor para la propiedad municipio.
	 *
	 * @return El valor de la propiedad municipio
	 */
	public String getIs_municipio() {
		return is_municipio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad municipio.
	 *
	 * @param as_municipio el nuevo valor para la propiedad municipio
	 */
	public void setIs_municipio(String as_municipio) {
		this.is_municipio = as_municipio;
	}

	/**
	 * Obtiene el valor para la propiedad departamento.
	 *
	 * @return El valor de la propiedad departamento
	 */
	public String getIs_departamento() {
		return is_departamento;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad departamento.
	 *
	 * @param as_departamento el nuevo valor para la propiedad departamento
	 */
	public void setIs_departamento(String as_departamento) {
		this.is_departamento = as_departamento;
	}

	/**
	 * Obtiene el valor para la propiedad tiene error.
	 *
	 * @return El valor de la propiedad tiene error
	 */
	public Boolean getIb_tieneError() {
		return ib_tieneError;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tiene error.
	 *
	 * @param ab_tieneError el nuevo valor para la propiedad tiene error
	 */
	public void setIb_tieneError(Boolean ab_tieneError) {
		this.ib_tieneError = ab_tieneError;
	}

	/**
	 * Obtiene el valor para la propiedad mensaje error.
	 *
	 * @return El valor de la propiedad mensaje error
	 */
	public String getIs_mensajeError() {
		return is_mensajeError;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad mensaje error.
	 *
	 * @param as_mensajeError el nuevo valor para la propiedad mensaje error
	 */
	public void setIs_mensajeError(String as_mensajeError) {
		this.is_mensajeError = as_mensajeError;
	}

	/**
	 * Obtiene el valor para la propiedad id.
	 *
	 * @return El valor de la propiedad id
	 */
	public String getIs_id() {
		return is_id;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id.
	 *
	 * @param as_id el nuevo valor para la propiedad id
	 */
	public void setIs_id(String as_id) {
		this.is_id = as_id;
	}

	/**
	 * Obtiene el valor para la propiedad cantidad solicitada.
	 *
	 * @return El valor de la propiedad cantidad solicitada
	 */
	public BigInteger getIbi_cantidadSolicitada() {
		return ibi_cantidadSolicitada;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad cantidad solicitada.
	 *
	 * @param abi_cantidadSolicitada el nuevo valor para la propiedad cantidad
	 *                               solicitada
	 */
	public void setIbi_cantidadSolicitada(BigInteger abi_cantidadSolicitada) {
		this.ibi_cantidadSolicitada = abi_cantidadSolicitada;
	}

	public Boolean getIb_migradaMatricula() {
		return ib_migradaMatricula;
	}

	public void setIb_migradaMatricula(Boolean ab_migradaMatricula) {
		this.ib_migradaMatricula = ab_migradaMatricula;
	}
	
}
