/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TipoEntradaInactivarAlertaTierrasWSDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto
 * Nombre del elemento: TipoEntradaInactivarAlertaTierrasWSDTO
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
 * inactivar alerta tierras.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoEntradaInactivarAlertaTierrasWSDTO extends GenericoDTO {
	
	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
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
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * texto inactivacion.
	 */
	private String is_textoInactivacion;

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
	 * Obtiene el valor para la propiedad texto inactivacion.
	 *
	 * @return El valor de la propiedad texto inactivacion
	 */
	public String getIs_textoInactivacion() {
		return is_textoInactivacion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad texto inactivacion.
	 *
	 * @param as_textoInactivacion el nuevo valor para la propiedad texto
	 *                             inactivacion
	 */
	public void setIs_textoInactivacion(String as_textoInactivacion) {
		this.is_textoInactivacion = as_textoInactivacion;
	}
}