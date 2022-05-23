/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: ProcesoASConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: ProcesoASConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.alertatierras.types.listarprocantiguosistema.TipoSalidaListarProcAntiguoSistema.ListaProcesosAS.ProcesoAS;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.ProcesoASVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Proceso AS.
 * <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ProcesoASConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase ProcesoASConverter.
	 */
	private ProcesoASConverter() {
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
	 * Especificamente convierte <b>de</b> ProcesoAS <b>a</b> ProcesoASVO, <br>
	 * En otras palabras, <b>de</b> Proceso AS (ComplexType relacionado a la
	 * representacion XML del servicio) <b>a</b> Proceso ASVO.
	 *
	 * @param ap_procesoAS el parametro que representa el complex type a convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como ProcesoASVO.
	 */
	public static ProcesoASVO tipoAVo(ProcesoAS ap_procesoAS) {
		ProcesoASVO lp_procesoAS = new ProcesoASVO();

		lp_procesoAS.setIi_idAlerta(ap_procesoAS.getIdAlerta());
		lp_procesoAS.setIs_nomCirculoRegistral(ap_procesoAS.getNomCirculoRegistral());
		lp_procesoAS.setIs_nomPais(ap_procesoAS.getNomPais());
		lp_procesoAS.setIs_nomDepartamento(ap_procesoAS.getNomDepartamento());
		lp_procesoAS.setIs_nomMunicipio(ap_procesoAS.getNomMunicipio());
		lp_procesoAS.setIs_tipoPredio(ap_procesoAS.getTipoPredio());
		lp_procesoAS.setIi_numLibro(ap_procesoAS.getNumLibro());
		lp_procesoAS.setIi_numTomo(ap_procesoAS.getNumTomo());
		lp_procesoAS.setIs_idTipoPartida(ap_procesoAS.getIdTipoPartida());
		lp_procesoAS.setIi_numPartida(ap_procesoAS.getNumPartida());
		lp_procesoAS.setIi_numFolio(ap_procesoAS.getNumFolio());
		lp_procesoAS.setIi_anio(ap_procesoAS.getAnio());
		lp_procesoAS.setIs_nomPredio(ap_procesoAS.getNomPredio());
		lp_procesoAS.setIi_numPredio(ap_procesoAS.getNumPredio());

		return lp_procesoAS;
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
	 * Especificamente convierte <b>de</b> ProcesoAS <b>a</b> ProcesoASVO, <br>
	 * En otras palabras, <b>de</b> Proceso AS (ComplexType relacionado a la
	 * representacion XML del servicio) <b>a</b> Proceso ASVO.
	 *
	 * @param alp_listaProcesoAS el parametro que representa la lista de complex
	 *                           types a convertir.
	 * @return Resultado para la conversion de lista de complex types a lista de
	 *         objetos con valores de servicio, en este caso como lista de
	 *         ProcesoASVO.
	 */
	public static List<ProcesoASVO> tipoAVoLista(List<ProcesoAS> alp_listaProcesoAS) {
		List<ProcesoASVO> llp_listaProcesoASVo = new ArrayList<>();

		for (ProcesoAS lp_procesoAS : alp_listaProcesoAS) {
			llp_listaProcesoASVo.add(tipoAVo(lp_procesoAS));
		}
		return llp_listaProcesoASVo;
	}
}
