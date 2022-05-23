/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: TipoEntradaConsultarMapaPredioInfoCatastralVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.alertatierras
 * Nombre del elemento: TipoEntradaConsultarMapaPredioInfoCatastralVO
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
 * Tipo entrada consultar mapa predio info catastral .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoEntradaConsultarMapaPredioInfoCatastralVO extends ClienteIntegracionVO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero catastral.
	 */
	private String is_numeroCatastral;

	/**
	 * Obtiene el valor para la propiedad numero catastral.
	 *
	 * @return El valor de la propiedad numero catastral
	 */
	public String getIs_numeroCatastral() {
		return is_numeroCatastral;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad numero catastral.
	 *
	 * @param as_numeroCatastral el nuevo valor para la propiedad numero catastral
	 */
	public void setIs_numeroCatastral(String as_numeroCatastral) {
		this.is_numeroCatastral = as_numeroCatastral;
	}

}
