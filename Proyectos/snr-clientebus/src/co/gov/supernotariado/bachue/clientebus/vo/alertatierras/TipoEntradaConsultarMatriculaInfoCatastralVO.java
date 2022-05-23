/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: TipoEntradaConsultarMatriculaInfoCatastralVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.alertatierras
 * Nombre del elemento: TipoEntradaConsultarMatriculaInfoCatastralVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.vo.alertatierras;

import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;

/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Tipo entrada consultar matricula info catastral .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoEntradaConsultarMatriculaInfoCatastralVO extends ClienteIntegracionVO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nupre.
	 */
	private String is_nupre;
	
	/**
	 * Atributo de instancia tipo entero para definir la propiedad numero predial.
	 */
	private Integer ii_numPredial;
	
	/**
	 * Atributo de instancia tipo entero para definir la propiedad chip.
	 */
	private Integer ii_chip;

	/**
	 * Obtiene el valor para la propiedad nupre.
	 *
	 * @return El valor de la propiedad nupre
	 */
	public String getIs_nupre() {
		return is_nupre;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nupre.
	 *
	 * @param as_nupre el nuevo valor para la propiedad nupre
	 */
	public void setIs_nupre(String as_nupre) {
		this.is_nupre = as_nupre;
	}

	/**
	 * Obtiene el valor para la propiedad numero predial.
	 *
	 * @return El valor de la propiedad numero predial
	 */
	public Integer getIi_numPredial() {
		return ii_numPredial;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad numero predial.
	 *
	 * @param ai_numPredial el nuevo valor para la propiedad numero predial
	 */
	public void setIi_numPredial(Integer ai_numPredial) {
		this.ii_numPredial = ai_numPredial;
	}

	/**
	 * Obtiene el valor para la propiedad chip.
	 *
	 * @return El valor de la propiedad chip
	 */
	public Integer getIi_chip() {
		return ii_chip;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad chip.
	 *
	 * @param ai_chip el nuevo valor para la propiedad chip
	 */
	public void setIi_chip(Integer ai_chip) {
		this.ii_chip = ai_chip;
	}

}
