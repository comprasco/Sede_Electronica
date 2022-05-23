/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TablaBandejaAlertasDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: TablaBandejaAlertasDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

import java.util.Date;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Tabla bandeja
 * alertas.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TablaBandejaAlertasDTO extends GenericoBaseDTO {
	
	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad id
	 * entidad.
	 */
	private String is_idEntidad;
	
	/**
	 * Atributo de instancia tipo fecha para definir la propiedad fecha inscripcion.
	 */
	private Date id_fechaInscripcion;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad cod
	 * tipo documento publico.
	 */
	private String is_codTipoDocumentoPublico;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad cod
	 * circulo registral.
	 */
	private String is_codCirculoRegistral;
	
	/**
	 * Atributo de instancia tipo entero para definir la propiedad num matricula
	 * inmobiliaria.
	 */
	private Integer ii_numMatriculaInmobiliaria;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre comunidad etnica.
	 */
	private String is_nombreComunidadEtnica;

	/**
	 * Obtiene el valor para la propiedad id entidad.
	 *
	 * @return El valor de la propiedad id entidad
	 */
	public String getIs_idEntidad() {
		return is_idEntidad;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id entidad.
	 *
	 * @param as_idEntidad el nuevo valor para la propiedad id entidad
	 */
	public void setIs_idEntidad(String as_idEntidad) {
		this.is_idEntidad = as_idEntidad;
	}

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
	 * Obtiene el valor para la propiedad cod tipo documento publico.
	 *
	 * @return El valor de la propiedad cod tipo documento publico
	 */
	public String getIs_codTipoDocumentoPublico() {
		return is_codTipoDocumentoPublico;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad cod tipo documento publico.
	 *
	 * @param as_codTipoDocumentoPublico el nuevo valor para la propiedad cod tipo
	 *                                   documento publico
	 */
	public void setIs_codTipoDocumentoPublico(String as_codTipoDocumentoPublico) {
		this.is_codTipoDocumentoPublico = as_codTipoDocumentoPublico;
	}

	/**
	 * Obtiene el valor para la propiedad cod circulo registral.
	 *
	 * @return El valor de la propiedad cod circulo registral
	 */
	public String getIs_codCirculoRegistral() {
		return is_codCirculoRegistral;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad cod circulo registral.
	 *
	 * @param as_codCirculoRegistral el nuevo valor para la propiedad cod circulo
	 *                               registral
	 */
	public void setIs_codCirculoRegistral(String as_codCirculoRegistral) {
		this.is_codCirculoRegistral = as_codCirculoRegistral;
	}

	/**
	 * Obtiene el valor para la propiedad num matricula inmobiliaria.
	 *
	 * @return El valor de la propiedad num matricula inmobiliaria
	 */
	public Integer getIi_numMatriculaInmobiliaria() {
		return ii_numMatriculaInmobiliaria;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad num matricula inmobiliaria.
	 *
	 * @param ai_numMatriculaInmobiliaria el nuevo valor para la propiedad num
	 *                                    matricula inmobiliaria
	 */
	public void setIi_numMatriculaInmobiliaria(Integer ai_numMatriculaInmobiliaria) {
		this.ii_numMatriculaInmobiliaria = ai_numMatriculaInmobiliaria;
	}

	/**
	 * Obtiene el valor para la propiedad nombre comunidad etnica.
	 *
	 * @return El valor de la propiedad nombre comunidad etnica
	 */
	public String getIs_nombreComunidadEtnica() {
		return is_nombreComunidadEtnica;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nombre comunidad etnica.
	 *
	 * @param as_nombreComunidadEtnica el nuevo valor para la propiedad nombre
	 *                                 comunidad etnica
	 */
	public void setIs_nombreComunidadEtnica(String as_nombreComunidadEtnica) {
		this.is_nombreComunidadEtnica = as_nombreComunidadEtnica;
	}

}
