/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: ParametroBusquedaDocumentosConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: ParametroBusquedaDocumentosConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.busquedadocumentos.types.consultar.TipoParametro;
import co.gov.supernotariado.bachue.clientebus.vo.busquedadocumentos.ParametroVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Parametro
 * busqueda documentos. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ParametroBusquedaDocumentosConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ParametroBusquedaDocumentosConverter.
	 */
	private ParametroBusquedaDocumentosConverter() {
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
	 * Especificamente convierte <b>de</b> ParametroVO <b>a</b> TipoParametro, <br>
	 * En otras palabras, <b>de</b> Parametro objeto con valores de servicio
	 * <b>a</b> Tipo parametro (ComplexType relacionado a la representacion XML del
	 * servicio).
	 *
	 * @param ap_parametroVO el parametro que representa el objeto con valores de
	 *                       servicio a convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como TipoParametro.
	 */
	public static TipoParametro voATipo(ParametroVO ap_parametroVO) {
		TipoParametro ltp_parametro = new TipoParametro();
		ltp_parametro.setNombre(ap_parametroVO.getIs_nombre());
		ltp_parametro.setValor(ap_parametroVO.getIs_valor());
		return ltp_parametro;
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
	 * Especificamente convierte <b>de</b> una ParametroVO <b>a</b> una
	 * TipoParametro, <br>
	 * En otras palabras, <b>de</b> una Parametro objeto con valores de servicio
	 * <b>a</b> una Tipo parametro (ComplexType relacionado a la representacion XML
	 * del servicio).
	 *
	 * @param alp_listaParametroVO el parametro que representa la lista de objetos
	 *                             con valores de servicio a convertir.
	 * @return Resultado para la conversion de lista de objetos con valores de
	 *         servicio a lista de complex types, en este caso como lista de
	 *         TipoParametro.
	 */
	public static List<TipoParametro> listaVoAListaTipo(List<ParametroVO> alp_listaParametroVO) {
		List<TipoParametro> lltp_listaParametro = new ArrayList<>();
		for (ParametroVO lp_parametroVO : alp_listaParametroVO) {
			lltp_listaParametro.add(voATipo(lp_parametroVO));
		}
		return lltp_listaParametro;
	}

}
