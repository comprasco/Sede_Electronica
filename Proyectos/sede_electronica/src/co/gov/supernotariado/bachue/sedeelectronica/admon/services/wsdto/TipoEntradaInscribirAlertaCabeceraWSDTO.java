/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TipoEntradaInscribirAlertaCabeceraWSDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto
 * Nombre del elemento: TipoEntradaInscribirAlertaCabeceraWSDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto;

import java.util.Date;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoDTO;

/**
 * Clase tipo objeto de transferencia de datos para web service (WSDTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y servicios web.
 * <br>
 * Contiene propiedades para representar los datos del objeto Tipo entrada
 * inscribir alerta cabecera.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoEntradaInscribirAlertaCabeceraWSDTO extends GenericoDTO {

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
	 * Atributo de instancia tipo entero para definir la propiedad id entidad.
	 */
	private Integer ii_idEntidad;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * proceso nro radicado.
	 */
	private String is_procesoNroRadicado;
	
	/**
	 * Atributo de instancia tipo fecha para definir la propiedad proceso fecha
	 * radicado.
	 */
	private Date id_procesoFechaRadicado;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * oficina origen.
	 */
	private String is_oficinaOrigen;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo tipo documento publico.
	 */
	private String is_codTipoDocumentoPublico;
	
	/**
	 * Atributo de instancia tipo fecha para definir la propiedad fecha documento.
	 */
	private Date id_fechaDocumento;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * documento numero.
	 */
	private String is_docNumero;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * documento id SGD.
	 */
	private String is_docIdSGD;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * documento name SGD.
	 */
	private String is_docNameSGD;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad nit
	 * comunidad etnica.
	 */
	private String is_nitComunidadEtnica;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * creado SNR.
	 */
	private String is_creadoSNR;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad id
	 * usuario.
	 */
	private String is_idUsuario;

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
	 * Obtiene el valor para la propiedad id entidad.
	 *
	 * @return El valor de la propiedad id entidad
	 */
	public Integer getIi_idEntidad() {
		return ii_idEntidad;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id entidad.
	 *
	 * @param ai_idEntidad el nuevo valor para la propiedad id entidad
	 */
	public void setIi_idEntidad(Integer ai_idEntidad) {
		this.ii_idEntidad = ai_idEntidad;
	}

	/**
	 * Obtiene el valor para la propiedad proceso nro radicado.
	 *
	 * @return El valor de la propiedad proceso nro radicado
	 */
	public String getIs_procesoNroRadicado() {
		return is_procesoNroRadicado;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad proceso nro radicado.
	 *
	 * @param as_procesoNroRadicado el nuevo valor para la propiedad proceso nro
	 *                              radicado
	 */
	public void setIs_procesoNroRadicado(String as_procesoNroRadicado) {
		this.is_procesoNroRadicado = as_procesoNroRadicado;
	}

	/**
	 * Obtiene el valor para la propiedad proceso fecha radicado.
	 *
	 * @return El valor de la propiedad proceso fecha radicado
	 */
	public Date getId_procesoFechaRadicado() {
		return id_procesoFechaRadicado;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad proceso fecha radicado.
	 *
	 * @param ad_procesoFechaRadicado el nuevo valor para la propiedad proceso fecha
	 *                                radicado
	 */
	public void setId_procesoFechaRadicado(Date ad_procesoFechaRadicado) {
		this.id_procesoFechaRadicado = ad_procesoFechaRadicado;
	}

	/**
	 * Obtiene el valor para la propiedad oficina origen.
	 *
	 * @return El valor de la propiedad oficina origen
	 */
	public String getIs_oficinaOrigen() {
		return is_oficinaOrigen;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad oficina origen.
	 *
	 * @param as_oficinaOrigen el nuevo valor para la propiedad oficina origen
	 */
	public void setIs_oficinaOrigen(String as_oficinaOrigen) {
		this.is_oficinaOrigen = as_oficinaOrigen;
	}

	/**
	 * Obtiene el valor para la propiedad codigo tipo documento publico.
	 *
	 * @return El valor de la propiedad codigo tipo documento publico
	 */
	public String getIs_codTipoDocumentoPublico() {
		return is_codTipoDocumentoPublico;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad codigo tipo documento publico.
	 *
	 * @param as_codTipoDocumentoPublico el nuevo valor para la propiedad codigo
	 *                                   tipo documento publico
	 */
	public void setIs_codTipoDocumentoPublico(String as_codTipoDocumentoPublico) {
		this.is_codTipoDocumentoPublico = as_codTipoDocumentoPublico;
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
	 * Obtiene el valor para la propiedad documento numero.
	 *
	 * @return El valor de la propiedad documento numero
	 */
	public String getIs_docNumero() {
		return is_docNumero;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad documento numero.
	 *
	 * @param as_docNumero el nuevo valor para la propiedad documento numero
	 */
	public void setIs_docNumero(String as_docNumero) {
		this.is_docNumero = as_docNumero;
	}

	/**
	 * Obtiene el valor para la propiedad documento id SGD.
	 *
	 * @return El valor de la propiedad documento id SGD
	 */
	public String getIs_docIdSGD() {
		return is_docIdSGD;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad documento id SGD.
	 *
	 * @param as_docIdSGD el nuevo valor para la propiedad documento id SGD
	 */
	public void setIs_docIdSGD(String as_docIdSGD) {
		this.is_docIdSGD = as_docIdSGD;
	}

	/**
	 * Obtiene el valor para la propiedad documento name SGD.
	 *
	 * @return El valor de la propiedad documento name SGD
	 */
	public String getIs_docNameSGD() {
		return is_docNameSGD;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad documento name SGD.
	 *
	 * @param as_docNameSGD el nuevo valor para la propiedad documento name SGD
	 */
	public void setIs_docNameSGD(String as_docNameSGD) {
		this.is_docNameSGD = as_docNameSGD;
	}

	/**
	 * Obtiene el valor para la propiedad nit comunidad etnica.
	 *
	 * @return El valor de la propiedad nit comunidad etnica
	 */
	public String getIs_nitComunidadEtnica() {
		return is_nitComunidadEtnica;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nit comunidad etnica.
	 *
	 * @param as_nitComunidadEtnica el nuevo valor para la propiedad nit comunidad
	 *                              etnica
	 */
	public void setIs_nitComunidadEtnica(String as_nitComunidadEtnica) {
		this.is_nitComunidadEtnica = as_nitComunidadEtnica;
	}

	/**
	 * Obtiene el valor para la propiedad creado SNR.
	 *
	 * @return El valor de la propiedad creado SNR
	 */
	public String getIs_creadoSNR() {
		return is_creadoSNR;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad creado SNR.
	 *
	 * @param as_creadoSNR el nuevo valor para la propiedad creado SNR
	 */
	public void setIs_creadoSNR(String as_creadoSNR) {
		this.is_creadoSNR = as_creadoSNR;
	}

	/**
	 * Obtiene el valor para la propiedad id usuario.
	 *
	 * @return El valor de la propiedad id usuario
	 */
	public String getIs_idUsuario() {
		return is_idUsuario;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id usuario.
	 *
	 * @param as_idUsuario el nuevo valor para la propiedad id usuario
	 */
	public void setIs_idUsuario(String as_idUsuario) {
		this.is_idUsuario = as_idUsuario;
	}
}