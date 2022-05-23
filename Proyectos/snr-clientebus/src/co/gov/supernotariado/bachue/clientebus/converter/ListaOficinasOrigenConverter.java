/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: ListaOficinasOrigenConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: ListaOficinasOrigenConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.alertatierras.types.consultaroficinasorigentipo.TipoSalidaConsultarOficinasOrigenTipo.ListaOficinasOrigen.OficinaOrigen;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.ListaOficinasOrigenVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Lista
 * oficinas origen. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ListaOficinasOrigenConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ListaOficinasOrigenConverter.
	 */
	private ListaOficinasOrigenConverter() {
		// Metodo constructor privado y vacio
	}

	/**
	 * Metodo que convierte de ComplexType a VO ( De elemento especifico del esquema
	 * de un Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto con un resultado/salida de una peticion de
	 * Servicio SOAP, en un objeto de datos llamado VO; para ser retornado como
	 * resultado a la aplicacion o capa de negocio que consume el cliente de
	 * servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> OficinaOrigen <b>a</b>
	 * ListaOficinasOrigenVO, <br>
	 * En otras palabras, <b>de</b> Oficina origen (ComplexType relacionado a la
	 * representacion XML del servicio) <b>a</b> Lista oficinas origen objeto con
	 * valores de servicio.
	 *
	 * @param aoo_oficinaOrigen el parametro que representa el complex type a
	 *                          convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como ListaOficinasOrigenVO.
	 */
	public static ListaOficinasOrigenVO tipoAVo(OficinaOrigen aoo_oficinaOrigen) {
		ListaOficinasOrigenVO lloo_listaOficinasOrigenVo = new ListaOficinasOrigenVO();
		lloo_listaOficinasOrigenVo.setIs_nombreOficinaOrigen(aoo_oficinaOrigen.getNombreOficinaOrigen());
		lloo_listaOficinasOrigenVo.setIs_oficinaOrigen(aoo_oficinaOrigen.getOficinaOrigen());
		return lloo_listaOficinasOrigenVo;
	}

	/**
	 * Metodo que convierte de una lista de ComplexType a una lista de VO ( De una
	 * lista de elementos especificos del esquema de un Servicio Web, a una lista de
	 * Objetos de valores de Servicio).<br>
	 * Se usa para convertir una lista de objetos con un resultado/salida de una
	 * peticion de Servicio SOAP, en una lista de objetos de datos llamados VOs;
	 * para ser retornado como resultado a la aplicacion o capa de negocio que
	 * consume el cliente de servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> OficinaOrigen <b>a</b>
	 * ListaOficinasOrigenVO, <br>
	 * En otras palabras, <b>de</b> Oficina origen (ComplexType relacionado a la
	 * representacion XML del servicio) <b>a</b> Lista oficinas origen objeto con
	 * valores de servicio.
	 *
	 * @param aloo_oficinaOrigen el parametro que representa la lista de complex
	 *                           types a convertir.
	 * @return Resultado para la conversion de lista de complex types a lista de
	 *         objetos con valores de servicio, en este caso como lista de
	 *         ListaOficinasOrigenVO.
	 */
	public static List<ListaOficinasOrigenVO> listaTipoAListaVo(List<OficinaOrigen> aloo_oficinaOrigen) {
		List<ListaOficinasOrigenVO> llloo_listaOficinasOrigenVo = new ArrayList<>();
		for (OficinaOrigen loo_oficinaOrigen : aloo_oficinaOrigen) {
			llloo_listaOficinasOrigenVo.add(tipoAVo(loo_oficinaOrigen));
		}
		return llloo_listaOficinasOrigenVo;
	}
}
