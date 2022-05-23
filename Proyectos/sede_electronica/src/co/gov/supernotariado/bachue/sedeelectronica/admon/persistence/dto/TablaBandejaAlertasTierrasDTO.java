/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TablaBandejaAlertasTierrasDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: TablaBandejaAlertasTierrasDTO
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
 * alertas tierras.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TablaBandejaAlertasTierrasDTO extends GenericoBaseDTO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo entero para definir la propiedad id alerta.
	 */
	private Integer ii_idAlerta;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * estado alerta.
	 */
	private String is_estadoAlerta;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre entidad.
	 */
	private String is_nombreEntidad;
	
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
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre comunidad etnica.
	 */
	private String is_nombreComunidadEtnica;
	
	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad boton
	 * negar alerta.
	 */
	private Boolean ib_botonNegarAlerta;
	
	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad boton
	 * inactivar alerta.
	 */
	private Boolean ib_botonInactivarAlerta;

	/**
	 * Obtiene el valor para la propiedad id alerta.
	 *
	 * @return El valor de la propiedad id alerta
	 */
	public Integer getIi_idAlerta() {
		return ii_idAlerta;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id alerta.
	 *
	 * @param ai_idAlerta el nuevo valor para la propiedad id alerta
	 */
	public void setIi_idAlerta(Integer ai_idAlerta) {
		this.ii_idAlerta = ai_idAlerta;
	}

	/**
	 * Obtiene el valor para la propiedad estado alerta.
	 *
	 * @return El valor de la propiedad estado alerta
	 */
	public String getIs_estadoAlerta() {
		return is_estadoAlerta;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad estado alerta.
	 *
	 * @param as_estadoAlerta el nuevo valor para la propiedad estado alerta
	 */
	public void setIs_estadoAlerta(String as_estadoAlerta) {
		this.is_estadoAlerta = as_estadoAlerta;
	}

	/**
	 * Obtiene el valor para la propiedad nombre entidad.
	 *
	 * @return El valor de la propiedad nombre entidad
	 */
	public String getIs_nombreEntidad() {
		return is_nombreEntidad;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nombre entidad.
	 *
	 * @param as_nombreEntidad el nuevo valor para la propiedad nombre entidad
	 */
	public void setIs_nombreEntidad(String as_nombreEntidad) {
		this.is_nombreEntidad = as_nombreEntidad;
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

	/**
	 * Obtiene el valor para la propiedad boton negar alerta.
	 *
	 * @return El valor de la propiedad boton negar alerta
	 */
	public Boolean getIb_botonNegarAlerta() {
		return ib_botonNegarAlerta;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad boton negar alerta.
	 *
	 * @param ab_botonNegarAlerta el nuevo valor para la propiedad boton negar
	 *                            alerta
	 */
	public void setIb_botonNegarAlerta(Boolean ab_botonNegarAlerta) {
		this.ib_botonNegarAlerta = ab_botonNegarAlerta;
	}

	/**
	 * Obtiene el valor para la propiedad boton inactivar alerta.
	 *
	 * @return El valor de la propiedad boton inactivar alerta
	 */
	public Boolean getIb_botonInactivarAlerta() {
		return ib_botonInactivarAlerta;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad boton inactivar alerta.
	 *
	 * @param ab_botonInactivarAlerta el nuevo valor para la propiedad boton
	 *                                inactivar alerta
	 */
	public void setIb_botonInactivarAlerta(Boolean ab_botonInactivarAlerta) {
		this.ib_botonInactivarAlerta = ab_botonInactivarAlerta;
	}

}
