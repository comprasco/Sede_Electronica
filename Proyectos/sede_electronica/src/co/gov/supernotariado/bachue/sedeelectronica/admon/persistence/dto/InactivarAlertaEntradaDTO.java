/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: InactivarAlertaEntradaDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: InactivarAlertaEntradaDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

import java.util.Date;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Inactivar alerta
 * entrada.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class InactivarAlertaEntradaDTO extends GenericoDTO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo fecha para definir la propiedad fecha documento.
	 */
	private Date id_fechaDocumento;
	
	/**
	 * Atributo de instancia tipo entero para definir la propiedad id alerta.
	 */
	private Integer ii_idAlerta;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad id
	 * motivo.
	 */
	private String is_idMotivo;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad txt
	 * inactivacion.
	 */
	private String is_txtInactivacion;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo oficina.
	 */
	private String is_tipoOficina;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad id
	 * oficina origen.
	 */
	private String is_idOficinaOrigen;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre oficina origen.
	 */
	private String is_nombreOficinaOrigen;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo documento inactivacion.
	 */
	private String is_tipoDocumentoInactivacion;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero doc inactivacion.
	 */
	private String is_numeroDocInactivacion;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * documento nombre.
	 */
	private String is_documentoNombre;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad id
	 * documento.
	 */
	private String is_idDocumento;

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
	 * Obtiene el valor para la propiedad id motivo.
	 *
	 * @return El valor de la propiedad id motivo
	 */
	public String getIs_idMotivo() {
		return is_idMotivo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id motivo.
	 *
	 * @param as_idMotivo el nuevo valor para la propiedad id motivo
	 */
	public void setIs_idMotivo(String as_idMotivo) {
		this.is_idMotivo = as_idMotivo;
	}

	/**
	 * Obtiene el valor para la propiedad txt inactivacion.
	 *
	 * @return El valor de la propiedad txt inactivacion
	 */
	public String getIs_txtInactivacion() {
		return is_txtInactivacion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad txt inactivacion.
	 *
	 * @param as_txtInactivacion el nuevo valor para la propiedad txt inactivacion
	 */
	public void setIs_txtInactivacion(String as_txtInactivacion) {
		this.is_txtInactivacion = as_txtInactivacion;
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
	 * Obtiene el valor para la propiedad id oficina origen.
	 *
	 * @return El valor de la propiedad id oficina origen
	 */
	public String getIs_idOficinaOrigen() {
		return is_idOficinaOrigen;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id oficina origen.
	 *
	 * @param as_idOficinaOrigen el nuevo valor para la propiedad id oficina origen
	 */
	public void setIs_idOficinaOrigen(String as_idOficinaOrigen) {
		this.is_idOficinaOrigen = as_idOficinaOrigen;
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
	 * Obtiene el valor para la propiedad tipo documento inactivacion.
	 *
	 * @return El valor de la propiedad tipo documento inactivacion
	 */
	public String getIs_tipoDocumentoInactivacion() {
		return is_tipoDocumentoInactivacion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo documento inactivacion.
	 *
	 * @param as_tipoDocumentoInactivacion el nuevo valor para la propiedad tipo
	 *                                     documento inactivacion
	 */
	public void setIs_tipoDocumentoInactivacion(String as_tipoDocumentoInactivacion) {
		this.is_tipoDocumentoInactivacion = as_tipoDocumentoInactivacion;
	}

	/**
	 * Obtiene el valor para la propiedad numero doc inactivacion.
	 *
	 * @return El valor de la propiedad numero doc inactivacion
	 */
	public String getIs_numeroDocInactivacion() {
		return is_numeroDocInactivacion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad numero doc inactivacion.
	 *
	 * @param as_numeroDocInactivacion el nuevo valor para la propiedad numero doc
	 *                                 inactivacion
	 */
	public void setIs_numeroDocInactivacion(String as_numeroDocInactivacion) {
		this.is_numeroDocInactivacion = as_numeroDocInactivacion;
	}

	/**
	 * Obtiene el valor para la propiedad documento nombre.
	 *
	 * @return El valor de la propiedad documento nombre
	 */
	public String getIs_documentoNombre() {
		return is_documentoNombre;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad documento nombre.
	 *
	 * @param as_documentoNombre el nuevo valor para la propiedad documento nombre
	 */
	public void setIs_documentoNombre(String as_documentoNombre) {
		this.is_documentoNombre = as_documentoNombre;
	}

	/**
	 * Obtiene el valor para la propiedad id documento.
	 *
	 * @return El valor de la propiedad id documento
	 */
	public String getIs_idDocumento() {
		return is_idDocumento;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id documento.
	 *
	 * @param as_idDocumento el nuevo valor para la propiedad id documento
	 */
	public void setIs_idDocumento(String as_idDocumento) {
		this.is_idDocumento = as_idDocumento;
	}

}
