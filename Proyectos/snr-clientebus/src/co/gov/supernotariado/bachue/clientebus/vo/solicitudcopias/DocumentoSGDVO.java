/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: DocumentoSGDVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.solicitudcopias
 * Nombre del elemento: DocumentoSGDVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.vo.solicitudcopias;

import co.gov.supernotariado.bachue.clientebus.vo.GenericoVO;

/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Documento SGD .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class DocumentoSGDVO extends GenericoVO{

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad d
	 * id.
	 */
	private String is_dId;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * documento name.
	 */
	private String is_docName;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo documental.
	 */
	private String is_tipoDocumental;
	
	/**
	 * Obtiene el valor para la propiedad d id.
	 *
	 * @return El valor de la propiedad d id
	 */
	public String getIs_dId() {
		return is_dId;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad d id.
	 *
	 * @param as_dId el nuevo valor para la propiedad d id
	 */
	public void setIs_dId(String as_dId) {
		this.is_dId = as_dId;
	}
	
	/**
	 * Obtiene el valor para la propiedad documento name.
	 *
	 * @return El valor de la propiedad documento name
	 */
	public String getIs_docName() {
		return is_docName;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad documento name.
	 *
	 * @param as_docName el nuevo valor para la propiedad documento name
	 */
	public void setIs_docName(String as_docName) {
		this.is_docName = as_docName;
	}
	
	/**
	 * Obtiene el valor para la propiedad tipo documental.
	 *
	 * @return El valor de la propiedad tipo documental
	 */
	public String getIs_tipoDocumental() {
		return is_tipoDocumental;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad tipo documental.
	 *
	 * @param as_tipoDocumental el nuevo valor para la propiedad tipo documental
	 */
	public void setIs_tipoDocumental(String as_tipoDocumental) {
		this.is_tipoDocumental = as_tipoDocumental;
	}
	
}
