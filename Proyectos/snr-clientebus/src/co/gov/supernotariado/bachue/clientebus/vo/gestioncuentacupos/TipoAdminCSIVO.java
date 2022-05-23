/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: TipoAdminCSIVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos
 * Nombre del elemento: TipoAdminCSIVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos;

import co.gov.supernotariado.bachue.clientebus.vo.GenericoVO;

/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Tipo admin CSI .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoAdminCSIVO extends GenericoVO{
	
	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo documento admin.
	 */
	private String is_tipoDocAdmin;
    
    /**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero documento admin.
	 */
    private String is_numDocAdmin;
    
	/**
	 * Obtiene el valor para la propiedad tipo documento admin.
	 *
	 * @return El valor de la propiedad tipo documento admin
	 */
	public String getIs_tipoDocAdmin() {
		return is_tipoDocAdmin;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad tipo documento admin.
	 *
	 * @param as_tipoDocAdmin el nuevo valor para la propiedad tipo documento admin
	 */
	public void setIs_tipoDocAdmin(String as_tipoDocAdmin) {
		this.is_tipoDocAdmin = as_tipoDocAdmin;
	}
	
	/**
	 * Obtiene el valor para la propiedad numero documento admin.
	 *
	 * @return El valor de la propiedad numero documento admin
	 */
	public String getIs_numDocAdmin() {
		return is_numDocAdmin;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad numero documento admin.
	 *
	 * @param as_numDocAdmin el nuevo valor para la propiedad numero documento admin
	 */
	public void setIs_numDocAdmin(String as_numDocAdmin) {
		this.is_numDocAdmin = as_numDocAdmin;
	}
	
}
