/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: MatriculaVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.solicitudcorreccion
 * Nombre del elemento: MatriculaVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.vo.solicitudcorreccion;

import java.util.List;

import co.gov.supernotariado.bachue.clientebus.vo.GenericoVO;

/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Matricula .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class MatriculaVO extends GenericoVO{

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo circulo registral.
	 */
	private String is_codCirculoRegistral;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero matricula inmobiliaria.
	 */
	private String is_numMatriculaInmobiliaria;
	
	/**
	 * Atributo de instancia tipo lista de DatoCorregirVO para definir la propiedad
	 * lista datos corregir objeto con valores de servicio.
	 */
	private List<DatoCorregirVO> ildc_listaDatosCorregirVo;

	/**
	 * Obtiene el valor para la propiedad codigo circulo registral.
	 *
	 * @return El valor de la propiedad codigo circulo registral
	 */
	public String getIs_codCirculoRegistral() {
		return is_codCirculoRegistral;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad codigo circulo registral.
	 *
	 * @param as_codCirculoRegistral el nuevo valor para la propiedad codigo circulo
	 *                               registral
	 */
	public void setIs_codCirculoRegistral(String as_codCirculoRegistral) {
		this.is_codCirculoRegistral = as_codCirculoRegistral;
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
	 * Obtiene el valor para la propiedad lista datos corregir objeto con valores de
	 * servicio.
	 *
	 * @return El valor de la propiedad lista datos corregir objeto con valores de
	 *         servicio
	 */
	public List<DatoCorregirVO> getIldc_listaDatosCorregirVo() {
		return ildc_listaDatosCorregirVo;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad lista datos corregir objeto con
	 * valores de servicio.
	 *
	 * @param aldc_listaDatosCorregirVo el nuevo valor para la propiedad lista datos
	 *                                  corregir objeto con valores de servicio
	 */
	public void setIldc_listaDatosCorregirVo(List<DatoCorregirVO> aldc_listaDatosCorregirVo) {
		this.ildc_listaDatosCorregirVo = aldc_listaDatosCorregirVo;
	}

}
