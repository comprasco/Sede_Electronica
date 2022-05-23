/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TipoEntradaConsultarDocumentoAlertaWSDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto
 * Nombre del elemento: TipoEntradaConsultarDocumentoAlertaWSDTO
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
 * consultar documento alerta.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoEntradaConsultarDocumentoAlertaWSDTO extends GenericoDTO{
	
	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
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
	

}
