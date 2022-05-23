/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: CargueAlertaTierrasDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: CargueAlertaTierrasDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

import java.util.Date;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Cargue alerta
 * tierras.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class CargueAlertaTierrasDTO extends GenericoDTO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo alerta.
	 */
	private String is_tipoAlerta;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo entidad.
	 */
	private String is_codigoEntidad;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo oficina.
	 */
	private String is_tipoOficina;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre oficina origen.
	 */
	private String is_nombreOficinaOrigen;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo documento alerta.
	 */
	private String is_tipoDocumentoAlerta;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero documento alerta.
	 */
	private String is_numeroDocumentoAlerta;
	
	/**
	 * Atributo de instancia tipo fecha para definir la propiedad fecha documento.
	 */
	private Date id_fechaDocumento;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * comunidad etnica.
	 */
	private String is_comunidadEtnica;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero radicado proceso.
	 */
	private String is_numeroRadicadoProceso;
	
	/**
	 * Atributo de instancia tipo fecha para definir la propiedad fecha proceso.
	 */
	private Date id_fechaProceso;

	/**
	 * Obtiene el valor para la propiedad tipo alerta.
	 *
	 * @return El valor de la propiedad tipo alerta
	 */
	public String getIs_tipoAlerta() {
		return is_tipoAlerta;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo alerta.
	 *
	 * @param as_tipoAlerta el nuevo valor para la propiedad tipo alerta
	 */
	public void setIs_tipoAlerta(String as_tipoAlerta) {
		this.is_tipoAlerta = as_tipoAlerta;
	}

	/**
	 * Obtiene el valor para la propiedad codigo entidad.
	 *
	 * @return El valor de la propiedad codigo entidad
	 */
	public String getIs_codigoEntidad() {
		return is_codigoEntidad;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad codigo entidad.
	 *
	 * @param as_codigoEntidad el nuevo valor para la propiedad codigo entidad
	 */
	public void setIs_codigoEntidad(String as_codigoEntidad) {
		this.is_codigoEntidad = as_codigoEntidad;
	}

	/**
	 * Obtiene el valor para la propiedad tipo oficina.
	 *
	 * @return El valor de la propiedad tipo oficina
	 */
	public String getIs_tipoOficina() {
		return is_tipoOficina;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo oficina.
	 *
	 * @param as_tipoOficina el nuevo valor para la propiedad tipo oficina
	 */
	public void setIs_tipoOficina(String as_tipoOficina) {
		this.is_tipoOficina = as_tipoOficina;
	}

	/**
	 * Obtiene el valor para la propiedad nombre oficina origen.
	 *
	 * @return El valor de la propiedad nombre oficina origen
	 */
	public String getIs_nombreOficinaOrigen() {
		return is_nombreOficinaOrigen;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nombre oficina origen.
	 *
	 * @param as_nombreOficinaOrigen el nuevo valor para la propiedad nombre oficina
	 *                               origen
	 */
	public void setIs_nombreOficinaOrigen(String as_nombreOficinaOrigen) {
		this.is_nombreOficinaOrigen = as_nombreOficinaOrigen;
	}

	/**
	 * Obtiene el valor para la propiedad tipo documento alerta.
	 *
	 * @return El valor de la propiedad tipo documento alerta
	 */
	public String getIs_tipoDocumentoAlerta() {
		return is_tipoDocumentoAlerta;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo documento alerta.
	 *
	 * @param as_tipoDocumentoAlerta el nuevo valor para la propiedad tipo documento
	 *                               alerta
	 */
	public void setIs_tipoDocumentoAlerta(String as_tipoDocumentoAlerta) {
		this.is_tipoDocumentoAlerta = as_tipoDocumentoAlerta;
	}

	/**
	 * Obtiene el valor para la propiedad numero documento alerta.
	 *
	 * @return El valor de la propiedad numero documento alerta
	 */
	public String getIs_numeroDocumentoAlerta() {
		return is_numeroDocumentoAlerta;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad numero documento alerta.
	 *
	 * @param as_numeroDocumentoAlerta el nuevo valor para la propiedad numero
	 *                                 documento alerta
	 */
	public void setIs_numeroDocumentoAlerta(String as_numeroDocumentoAlerta) {
		this.is_numeroDocumentoAlerta = as_numeroDocumentoAlerta;
	}

	/**
	 * Obtiene el valor para la propiedad fecha documento.
	 *
	 * @return El valor de la propiedad fecha documento
	 */
	public Date getId_fechaDocumento() {
		return id_fechaDocumento;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad fecha documento.
	 *
	 * @param ad_fechaDocumento el nuevo valor para la propiedad fecha documento
	 */
	public void setId_fechaDocumento(Date ad_fechaDocumento) {
		this.id_fechaDocumento = ad_fechaDocumento;
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
	 * Obtiene el valor para la propiedad numero radicado proceso.
	 *
	 * @return El valor de la propiedad numero radicado proceso
	 */
	public String getIs_numeroRadicadoProceso() {
		return is_numeroRadicadoProceso;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad numero radicado proceso.
	 *
	 * @param as_numeroRadicadoProceso el nuevo valor para la propiedad numero
	 *                                 radicado proceso
	 */
	public void setIs_numeroRadicadoProceso(String as_numeroRadicadoProceso) {
		this.is_numeroRadicadoProceso = as_numeroRadicadoProceso;
	}

	/**
	 * Obtiene el valor para la propiedad fecha proceso.
	 *
	 * @return El valor de la propiedad fecha proceso
	 */
	public Date getId_fechaProceso() {
		return id_fechaProceso;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad fecha proceso.
	 *
	 * @param ad_fechaProceso el nuevo valor para la propiedad fecha proceso
	 */
	public void setId_fechaProceso(Date ad_fechaProceso) {
		this.id_fechaProceso = ad_fechaProceso;
	}

}