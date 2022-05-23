/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: TipoEntradaTrazabilidadTramiteRegistroNodoCentralVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.consultartrazabilidadnoc
 * Nombre del elemento: TipoEntradaTrazabilidadTramiteRegistroNodoCentralVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.vo.consultartrazabilidadnoc;

import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;

/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Tipo entrada trazabilidad tramite registro nodo central .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoEntradaTrazabilidadTramiteRegistroNodoCentralVO extends ClienteIntegracionVO{

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo circulo regisral.
	 */
	private String is_codCirculoRegisral;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * radicacion.
	 */
	private String is_radicacion;
	
	/**
	 * Obtiene el valor para la propiedad codigo circulo regisral.
	 *
	 * @return El valor de la propiedad codigo circulo regisral
	 */
	public String getIs_codCirculoRegisral() {
		return is_codCirculoRegisral;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad codigo circulo regisral.
	 *
	 * @param as_codCirculoRegisral el nuevo valor para la propiedad codigo circulo
	 *                              regisral
	 */
	public void setIs_codCirculoRegisral(String as_codCirculoRegisral) {
		this.is_codCirculoRegisral = as_codCirculoRegisral;
	}
	
	/**
	 * Obtiene el valor para la propiedad radicacion.
	 *
	 * @return El valor de la propiedad radicacion
	 */
	public String getIs_radicacion() {
		return is_radicacion;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad radicacion.
	 *
	 * @param as_radicacion el nuevo valor para la propiedad radicacion
	 */
	public void setIs_radicacion(String as_radicacion) {
		this.is_radicacion = as_radicacion;
	}
}
