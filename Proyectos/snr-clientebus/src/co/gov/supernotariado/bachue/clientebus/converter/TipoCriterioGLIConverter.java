/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: TipoCriterioGLIConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: TipoCriterioGLIConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import co.gov.supernotariado.bachue.clientebus.operacionesfinancieras.types.generarliquidacion.TipoCriterioGLI;
import co.gov.supernotariado.bachue.clientebus.vo.operacionesfinancieras.TipoCriterioGLIVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Tipo criterio
 * GLI. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoCriterioGLIConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase TipoCriterioGLIConverter.
	 */
	private TipoCriterioGLIConverter() {
		// Metodo constructor privado y vacio
	}

	/**
	 * Metodo que convierte de VO a ComplexType (De Objeto de valores de Servicio,
	 * entrada del cliente bus; a elemento especifico del esquema de un Servicio
	 * Web, entrada de una peticion de Servicio SOAP).<br>
	 * Se usa para convertir un objeto con las entradas de un servicio web (objeto
	 * VO), a un objeto ComplexType para ser enviado en una operacion de un
	 * servicio. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoCriterioGLIVO <b>a</b>
	 * TipoCriterioGLI, <br>
	 * En otras palabras, <b>de</b> Tipo criterio GLIVO <b>a</b> Tipo criterio
	 * generar liquidacion input (ComplexType relacionado a la representacion XML
	 * del servicio).
	 *
	 * @param atcg_criterio el parametro que representa el objeto con valores de
	 *                      servicio a convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como TipoCriterioGLI.
	 */
	public static TipoCriterioGLI voATipo(TipoCriterioGLIVO atcg_criterio) {
		TipoCriterioGLI ltcg_criterio = new TipoCriterioGLI();
		ltcg_criterio.setCodigo(atcg_criterio.getIs_codigo());
		ltcg_criterio.setValor(atcg_criterio.getIs_valor());

		return ltcg_criterio;
	}

}
