/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: ListaAutoridadesJAConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: ListaAutoridadesJAConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.alertatierras.types.consultarentidadesja.TipoSalidaConsultarEntidadesJA.ListaAutoridadesJA.AutoridadA;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.ListaAutoridadesJAVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Lista
 * autoridades JA. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ListaAutoridadesJAConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase ListaAutoridadesJAConverter.
	 */
	private ListaAutoridadesJAConverter() {
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
	 * Especificamente convierte <b>de</b> AutoridadA <b>a</b> ListaAutoridadesJAVO,
	 * <br>
	 * En otras palabras, <b>de</b> Autoridad A (ComplexType relacionado a la
	 * representacion XML del servicio) <b>a</b> Lista autoridades JAVO.
	 *
	 * @param aaa_autoridadA el parametro que representa el complex type a
	 *                       convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como ListaAutoridadesJAVO.
	 */
	public static ListaAutoridadesJAVO tipoAVo(AutoridadA aaa_autoridadA) {
		ListaAutoridadesJAVO llaja_listaAutoridadesJAVo = new ListaAutoridadesJAVO();
		llaja_listaAutoridadesJAVo.setIs_codigoAutoridad(aaa_autoridadA.getCodigoAutoridad());
		llaja_listaAutoridadesJAVo.setIs_esAgenciaNacionalTierras(aaa_autoridadA.getEsAgenciaNacionalTierras());
		llaja_listaAutoridadesJAVo.setIs_nombreAutoridad(aaa_autoridadA.getNombreAutoridad());
		return llaja_listaAutoridadesJAVo;
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
	 * Especificamente convierte <b>de</b> AutoridadA <b>a</b> ListaAutoridadesJAVO,
	 * <br>
	 * En otras palabras, <b>de</b> Autoridad A (ComplexType relacionado a la
	 * representacion XML del servicio) <b>a</b> Lista autoridades JAVO.
	 *
	 * @param alaa_autoridadA el parametro que representa la lista de complex types
	 *                        a convertir.
	 * @return Resultado para la conversion de lista de complex types a lista de
	 *         objetos con valores de servicio, en este caso como lista de
	 *         ListaAutoridadesJAVO.
	 */
	public static List<ListaAutoridadesJAVO> listaTipoAListaVo(List<AutoridadA> alaa_autoridadA) {
		List<ListaAutoridadesJAVO> lllaja_listaAutoridadesJAVo = new ArrayList<>();
		for (AutoridadA laa_autoridadA : alaa_autoridadA) {
			lllaja_listaAutoridadesJAVo.add(tipoAVo(laa_autoridadA));
		}
		return lllaja_listaAutoridadesJAVo;
	}
}
