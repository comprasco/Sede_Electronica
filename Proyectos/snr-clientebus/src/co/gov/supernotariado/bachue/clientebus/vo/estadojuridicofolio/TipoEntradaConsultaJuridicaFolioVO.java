/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: TipoEntradaConsultaJuridicaFolioVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.estadojuridicofolio
 * Nombre del elemento: TipoEntradaConsultaJuridicaFolioVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.vo.estadojuridicofolio;

import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;

/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Tipo entrada consulta juridica folio .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoEntradaConsultaJuridicaFolioVO extends ClienteIntegracionVO
{
	
	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo identificacion predio.
	 */
	private String is_tipoIdentificacionPredio;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero identificacion predio.
	 */
	private String is_numIdentificacionPredio;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * convenio.
	 */
	private String is_convenio;
	
	/**
	 * Obtiene el valor para la propiedad tipo identificacion predio.
	 *
	 * @return El valor de la propiedad tipo identificacion predio
	 */
	public String getIs_tipoIdentificacionPredio() {
		return is_tipoIdentificacionPredio;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad tipo identificacion predio.
	 *
	 * @param as_tipoIdentificacionPredio el nuevo valor para la propiedad tipo
	 *                                    identificacion predio
	 */
	public void setIs_tipoIdentificacionPredio(String as_tipoIdentificacionPredio) {
		this.is_tipoIdentificacionPredio = as_tipoIdentificacionPredio;
	}
	
	/**
	 * Obtiene el valor para la propiedad numero identificacion predio.
	 *
	 * @return El valor de la propiedad numero identificacion predio
	 */
	public String getIs_numIdentificacionPredio() {
		return is_numIdentificacionPredio;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad numero identificacion predio.
	 *
	 * @param as_numIdentificacionPredio el nuevo valor para la propiedad numero
	 *                                   identificacion predio
	 */
	public void setIs_numIdentificacionPredio(String as_numIdentificacionPredio) {
		this.is_numIdentificacionPredio = as_numIdentificacionPredio;
	}
	
	/**
	 * Obtiene el valor para la propiedad convenio.
	 *
	 * @return El valor de la propiedad convenio
	 */
	public String getIs_convenio() {
		return is_convenio;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad convenio.
	 *
	 * @param as_convenio el nuevo valor para la propiedad convenio
	 */
	public void setIs_convenio(String as_convenio) {
		this.is_convenio = as_convenio;
	}	
}