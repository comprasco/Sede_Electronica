/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: SolicitanteConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: SolicitanteConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.consultarhistorialsolicitudespagadas.types.buscarsolicitudes.SolicitanteType;
import co.gov.supernotariado.bachue.clientebus.vo.consultarhistorialsolicitudespagadas.SolicitanteVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Solicitante.
 * <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class SolicitanteConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase SolicitanteConverter.
	 */
	private SolicitanteConverter() {
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
	 * Especificamente convierte <b>de</b> SolicitanteVO <b>a</b> SolicitanteType,
	 * <br>
	 * En otras palabras, <b>de</b> Solicitante objeto con valores de servicio
	 * <b>a</b> Solicitante type (ComplexType relacionado a la representacion XML
	 * del servicio).
	 *
	 * @param as_solicitanteVo el parametro que representa el objeto con valores de
	 *                         servicio a convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como SolicitanteType.
	 */
	public static SolicitanteType voATipoSolicitante(SolicitanteVO as_solicitanteVo) {
		SolicitanteType lst_solicitanteType = new SolicitanteType();

		lst_solicitanteType.setNumeroDocumento(as_solicitanteVo.getIs_numeroDocumento());
		lst_solicitanteType.setTipoDocumento(as_solicitanteVo.getIs_tipoDocumento());
		lst_solicitanteType.setTipoPersona(as_solicitanteVo.getIs_tipoPersona());

		return lst_solicitanteType;
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
	 * Especificamente convierte <b>de</b> una SolicitanteVO <b>a</b> una
	 * SolicitanteType, <br>
	 * En otras palabras, <b>de</b> una Solicitante objeto con valores de servicio
	 * <b>a</b> una Solicitante type (ComplexType relacionado a la representacion
	 * XML del servicio).
	 *
	 * @param als_listaSolicitanteVo el parametro que representa la lista de objetos
	 *                               con valores de servicio a convertir.
	 * @return Resultado para la conversion de lista de objetos con valores de
	 *         servicio a lista de complex types, en este caso como lista de
	 *         SolicitanteType.
	 */
	public static List<SolicitanteType> voATipoListaSolicitante(List<SolicitanteVO> als_listaSolicitanteVo) {
		List<SolicitanteType> llst_listaSolicitanteType = new ArrayList<>();

		for (SolicitanteVO ls_solicitanteVo : als_listaSolicitanteVo) {
			llst_listaSolicitanteType.add(voATipoSolicitante(ls_solicitanteVo));
		}

		return llst_listaSolicitanteType;
	}
}
