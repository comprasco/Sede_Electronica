/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: TipoDocumentalVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.historialnotificaciones
 * Nombre del elemento: TipoDocumentalVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.vo.historialnotificaciones;

import co.gov.supernotariado.bachue.clientebus.vo.GenericoVO;

/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Tipo documental .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoDocumentalVO extends GenericoVO 
{


	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre tipo documento publico.
	 */
	private String is_nomTipoDocumentoPublico;
	
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
	
}
