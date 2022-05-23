/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: ListaMatriculasDetalleAlertasVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.alertatierras
 * Nombre del elemento: ListaMatriculasDetalleAlertasVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.vo.alertatierras;

import co.gov.supernotariado.bachue.clientebus.vo.GenericoVO;

/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Lista matriculas detalle alertas .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ListaMatriculasDetalleAlertasVO extends GenericoVO {
	
	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre circulo registral.
	 */
	private String is_nomCirculoRegistral;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero matricula inmobiliaria.
	 */
	private String is_numMatriculaInmobiliaria;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero predial.
	 */
	private String is_numPredial;

	/**
	 * Obtiene el valor para la propiedad nombre circulo registral.
	 *
	 * @return El valor de la propiedad nombre circulo registral
	 */
	public String getIs_nomCirculoRegistral() {
		return is_nomCirculoRegistral;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nombre circulo registral.
	 *
	 * @param as_nomCirculoRegistral el nuevo valor para la propiedad nombre circulo
	 *                               registral
	 */
	public void setIs_nomCirculoRegistral(String as_nomCirculoRegistral) {
		this.is_nomCirculoRegistral = as_nomCirculoRegistral;
	}

	/**
	 * Obtiene el valor para la propiedad numero matricula inmobiliaria.
	 *
	 * @return El valor de la propiedad numero matricula inmobiliaria
	 */
	public String getIs_numMatriculaInmobiliaria() {
		return is_numMatriculaInmobiliaria;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad numero matricula inmobiliaria.
	 *
	 * @param as_numMatriculaInmobiliaria el nuevo valor para la propiedad numero
	 *                                    matricula inmobiliaria
	 */
	public void setIs_numMatriculaInmobiliaria(String as_numMatriculaInmobiliaria) {
		this.is_numMatriculaInmobiliaria = as_numMatriculaInmobiliaria;
	}

	/**
	 * Obtiene el valor para la propiedad numero predial.
	 *
	 * @return El valor de la propiedad numero predial
	 */
	public String getIs_numPredial() {
		return is_numPredial;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad numero predial.
	 *
	 * @param as_numPredial el nuevo valor para la propiedad numero predial
	 */
	public void setIs_numPredial(String as_numPredial) {
		this.is_numPredial = as_numPredial;
	}

}
