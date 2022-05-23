/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: InactivacionVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.alertatierras
 * Nombre del elemento: InactivacionVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.vo.alertatierras;

import java.util.Date;

import co.gov.supernotariado.bachue.clientebus.vo.GenericoVO;

/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Inactivacion .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class InactivacionVO extends GenericoVO {
	
	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * motivo inactivacion.
	 */
	private String is_motivoInactivacion;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre oficina origen.
	 */
	private String is_nomOficinaOrigen;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre tipo documento publico.
	 */
	private String is_nomTipoDocumentoPublico;
	
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
	 * Obtiene el valor para la propiedad motivo inactivacion.
	 *
	 * @return El valor de la propiedad motivo inactivacion
	 */
	public String getIs_motivoInactivacion() {
		return is_motivoInactivacion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad motivo inactivacion.
	 *
	 * @param as_motivoInactivacion el nuevo valor para la propiedad motivo
	 *                              inactivacion
	 */
	public void setIs_motivoInactivacion(String as_motivoInactivacion) {
		this.is_motivoInactivacion = as_motivoInactivacion;
	}

	/**
	 * Obtiene el valor para la propiedad nombre oficina origen.
	 *
	 * @return El valor de la propiedad nombre oficina origen
	 */
	public String getIs_nomOficinaOrigen() {
		return is_nomOficinaOrigen;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nombre oficina origen.
	 *
	 * @param as_nomOficinaOrigen el nuevo valor para la propiedad nombre oficina
	 *                            origen
	 */
	public void setIs_nomOficinaOrigen(String as_nomOficinaOrigen) {
		this.is_nomOficinaOrigen = as_nomOficinaOrigen;
	}

	/**
	 * Obtiene el valor para la propiedad nombre tipo documento publico.
	 *
	 * @return El valor de la propiedad nombre tipo documento publico
	 */
	public String getIs_nomTipoDocumentoPublico() {
		return is_nomTipoDocumentoPublico;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nombre tipo documento publico.
	 *
	 * @param as_nomTipoDocumentoPublico el nuevo valor para la propiedad nombre
	 *                                   tipo documento publico
	 */
	public void setIs_nomTipoDocumentoPublico(String as_nomTipoDocumentoPublico) {
		this.is_nomTipoDocumentoPublico = as_nomTipoDocumentoPublico;
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
