/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: TipoCriterioGSIConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: TipoCriterioGSIConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import co.gov.supernotariado.bachue.clientebus.generacionsolicitud.types.generarsolicitud.Criterio;
import co.gov.supernotariado.bachue.clientebus.vo.generacionsolicitud.TipoCriterioVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Tipo criterio
 * GSI. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoCriterioGSIConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase TipoCriterioGSIConverter.
	 */
	private TipoCriterioGSIConverter() {
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
	 * Especificamente convierte <b>de</b> TipoCriterioVO <b>a</b> Criterio, <br>
	 * En otras palabras, <b>de</b> Tipo criterio objeto con valores de servicio
	 * <b>a</b> Criterio (ComplexType relacionado a la representacion XML del
	 * servicio).
	 *
	 * @param atc_criterio el parametro que representa el objeto con valores de
	 *                     servicio a convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como Criterio.
	 */
	public static Criterio voATipo(TipoCriterioVO atc_criterio) {
		Criterio lc_criterio = new Criterio();

		lc_criterio.setCodigo(atc_criterio.getIs_codigo());
		lc_criterio.setValor(atc_criterio.getIs_valor());

		return lc_criterio;
	}

}
