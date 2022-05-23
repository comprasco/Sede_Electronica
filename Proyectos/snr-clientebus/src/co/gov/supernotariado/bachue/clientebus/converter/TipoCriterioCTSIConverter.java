/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: TipoCriterioCTSIConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: TipoCriterioCTSIConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import java.util.List;

import co.gov.supernotariado.bachue.clientebus.operacionesfinancieras.types.consultartarifaservicio.TipoCriterioCTSI;
import co.gov.supernotariado.bachue.clientebus.operacionesfinancieras.types.consultartarifaservicio.TipoServicioCTSI.Criterios;
import co.gov.supernotariado.bachue.clientebus.vo.operacionesfinancieras.TipoCriterioCTSIVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Tipo criterio
 * CTSI. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoCriterioCTSIConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase TipoCriterioCTSIConverter.
	 */
	private TipoCriterioCTSIConverter() {
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
	 * Especificamente convierte <b>de</b> TipoCriterioCTSIVO <b>a</b>
	 * TipoCriterioCTSI, <br>
	 * En otras palabras, <b>de</b> Tipo criterio CTSIVO <b>a</b> Tipo criterio
	 * consultar tarifa solicitud input (ComplexType relacionado a la representacion
	 * XML del servicio).
	 *
	 * @param atc_criterio el parametro que representa el objeto con valores de
	 *                     servicio a convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como TipoCriterioCTSI.
	 */
	public static TipoCriterioCTSI voATipo(TipoCriterioCTSIVO atc_criterio) {
		TipoCriterioCTSI ltc_citerio = new TipoCriterioCTSI();

		ltc_citerio.setCodigo(atc_criterio.getIs_codigo());
		ltc_citerio.setValor(atc_criterio.getIs_valor());

		return ltc_citerio;
	}

	/**
	 * Metodo que convierte de una lista de VO a una lista de ComplexType (De lista
	 * de Objeto de valores de Servicio, entrada del cliente bus; a una lista de
	 * elementos especificos del esquema de un Servicio Web, entrada de una peticion
	 * de Servicio SOAP).<br>
	 * Se usa para convertir una lista de objetos con los valores de entrada de un
	 * servicio web (objetos VO) a una lista de objetos ComplexType para ser
	 * enviados en una operacion de un servicio. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoCriterioCTSIVO <b>a</b> Criterios,
	 * <br>
	 * En otras palabras, <b>de</b> Tipo criterio CTSIVO <b>a</b> Criterios
	 * (ComplexType relacionado a la representacion XML del servicio).
	 *
	 * @param altc_criterios el parametro que representa la lista de objetos con
	 *                       valores de servicio a convertir.
	 * @return Resultado para la conversion de lista de objetos con valores de
	 *         servicio a complex con forma de lista, en este caso como Criterios.
	 */
	public static Criterios listaVoATipo(List<TipoCriterioCTSIVO> altc_criterios) {
		Criterios lc_criterios = new Criterios();

		for (TipoCriterioCTSIVO ltc_tipoCriterioCTSIVO : altc_criterios)
			lc_criterios.getCriterio().add(voATipo(ltc_tipoCriterioCTSIVO));

		return lc_criterios;
	}

}
