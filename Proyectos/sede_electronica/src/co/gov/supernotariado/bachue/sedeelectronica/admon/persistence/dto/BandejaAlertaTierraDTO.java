/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BandejaAlertaTierraDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: BandejaAlertaTierraDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

import java.util.Date;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Bandeja alerta
 * tierra.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class BandejaAlertaTierraDTO extends GenericoDTO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero matricula.
	 */
	private String is_numeroMatricula;
	
	/**
	 * Atributo de instancia tipo fecha para definir la propiedad fecha inscripcion.
	 */
	private Date id_fechaInscripcion;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * entidad.
	 */
	private String is_entidad;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo documento.
	 */
	private String is_tipoDocumento;
	
	/**
	 * Atributo de instancia tipo entero para definir la propiedad numero matricula.
	 */
	private Integer ii_numeroMatricula;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * comunidad etnica.
	 */
	private String is_comunidadEtnica;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * estado.
	 */
	private String is_estado;
	
	/**
	 * Atributo de instancia tipo CirculoRegistralDTO para definir la propiedad
	 * circulo registral.
	 */
	private CirculoRegistralDTO icr_circuloRegistralDto;

	/**
	 * Obtiene el valor para la propiedad fecha inscripcion.
	 *
	 * @return El valor de la propiedad fecha inscripcion
	 */
	public Date getId_fechaInscripcion() {
		return id_fechaInscripcion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad fecha inscripcion.
	 *
	 * @param ad_fechaInscripcion el nuevo valor para la propiedad fecha inscripcion
	 */
	public void setId_fechaInscripcion(Date ad_fechaInscripcion) {
		this.id_fechaInscripcion = ad_fechaInscripcion;
	}

	/**
	 * Obtiene el valor para la propiedad entidad.
	 *
	 * @return El valor de la propiedad entidad
	 */
	public String getIs_entidad() {
		return is_entidad;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad entidad.
	 *
	 * @param as_entidad el nuevo valor para la propiedad entidad
	 */
	public void setIs_entidad(String as_entidad) {
		this.is_entidad = as_entidad;
	}

	/**
	 * Obtiene el valor para la propiedad comunidad etnica.
	 *
	 * @return El valor de la propiedad comunidad etnica
	 */
	public String getIs_comunidadEtnica() {
		return is_comunidadEtnica;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad comunidad etnica.
	 *
	 * @param as_comunidadEtnica el nuevo valor para la propiedad comunidad etnica
	 */
	public void setIs_comunidadEtnica(String as_comunidadEtnica) {
		this.is_comunidadEtnica = as_comunidadEtnica;
	}

	/**
	 * Obtiene el valor para la propiedad estado.
	 *
	 * @return El valor de la propiedad estado
	 */
	public String getIs_estado() {
		return is_estado;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad estado.
	 *
	 * @param as_estado el nuevo valor para la propiedad estado
	 */
	public void setIs_estado(String as_estado) {
		this.is_estado = as_estado;
	}

	/**
	 * Obtiene el valor para la propiedad circulo registral dto.
	 *
	 * @return El valor de la propiedad circulo registral dto
	 */
	public CirculoRegistralDTO getIcr_circuloRegistralDto() {
		return icr_circuloRegistralDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad circulo registral dto.
	 *
	 * @param acr_circuloRegistralDto el nuevo valor para la propiedad circulo
	 *                                registral dto
	 */
	public void setIcr_circuloRegistralDto(CirculoRegistralDTO acr_circuloRegistralDto) {
		this.icr_circuloRegistralDto = acr_circuloRegistralDto;
	}

	/**
	 * Obtiene el valor para la propiedad numero matricula.
	 *
	 * @return El valor de la propiedad numero matricula
	 */
	public Integer getIi_numeroMatricula() {
		return ii_numeroMatricula;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad numero matricula.
	 *
	 * @param ais_numeroMatricula el nuevo valor para la propiedad numero matricula
	 */
	public void setIi_numeroMatricula(Integer ais_numeroMatricula) {
		this.ii_numeroMatricula = ais_numeroMatricula;
	}

	/**
	 * Obtiene el valor para la propiedad tipo documento.
	 *
	 * @return El valor de la propiedad tipo documento
	 */
	public String getIs_tipoDocumento() {
		return is_tipoDocumento;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo documento.
	 *
	 * @param as_tipoDocumento el nuevo valor para la propiedad tipo documento
	 */
	public void setIs_tipoDocumento(String as_tipoDocumento) {
		this.is_tipoDocumento = as_tipoDocumento;
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
