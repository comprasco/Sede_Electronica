/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: TipoMatriculaConsultadaVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.consultamigracion
 * Nombre del elemento: TipoMatriculaConsultadaVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.vo.consultamigracion;

import co.gov.supernotariado.bachue.clientebus.vo.GenericoVO;

/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Tipo matricula consultada .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoMatriculaConsultadaVO extends GenericoVO 
{

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * matricula.
	 */
	private String is_matricula;
	
	/**
	 * Obtiene el valor para la propiedad matricula.
	 *
	 * @return El valor de la propiedad matricula
	 */
	public String getIs_matricula() {
		return is_matricula;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad matricula.
	 *
	 * @param as_matricula el nuevo valor para la propiedad matricula
	 */
	public void setIs_matricula(String as_matricula) {
		this.is_matricula = as_matricula;
	}
	
}
