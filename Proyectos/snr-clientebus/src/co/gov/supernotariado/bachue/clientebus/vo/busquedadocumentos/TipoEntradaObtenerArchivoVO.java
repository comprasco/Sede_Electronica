/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: TipoEntradaObtenerArchivoVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.busquedadocumentos
 * Nombre del elemento: TipoEntradaObtenerArchivoVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.vo.busquedadocumentos;

import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;

/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Tipo entrada obtener archivo .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoEntradaObtenerArchivoVO extends ClienteIntegracionVO{

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
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad d
	 * documento name.
	 */
	private String is_dDocName;
	
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
	 * Obtiene el valor para la propiedad d documento name.
	 *
	 * @return El valor de la propiedad d documento name
	 */
	public String getIs_dDocName() {
		return is_dDocName;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad d documento name.
	 *
	 * @param as_dDocName el nuevo valor para la propiedad d documento name
	 */
	public void setIs_dDocName(String as_dDocName) {
		this.is_dDocName = as_dDocName;
	}
}
