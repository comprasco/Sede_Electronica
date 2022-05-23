/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: TipoEntradaObtenerPDFLiquidacionVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.operacionesfinancieras
 * Nombre del elemento: TipoEntradaObtenerPDFLiquidacionVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.vo.operacionesfinancieras;

import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;

/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Tipo entrada obtener PDF liquidacion .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoEntradaObtenerPDFLiquidacionVO extends ClienteIntegracionVO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero referencia.
	 */
	private String is_numeroReferencia;

	/**
	 * Obtiene el valor para la propiedad numero referencia.
	 *
	 * @return El valor de la propiedad numero referencia
	 */
	public String getIs_numeroReferencia() {
		return is_numeroReferencia;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad numero referencia.
	 *
	 * @param as_numeroReferencia el nuevo valor para la propiedad numero referencia
	 */
	public void setIs_numeroReferencia(String as_numeroReferencia) {
		this.is_numeroReferencia = as_numeroReferencia;
	}	
	
}
