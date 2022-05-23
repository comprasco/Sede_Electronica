/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: ListaProcesosConsultarDetalleASConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: ListaProcesosConsultarDetalleASConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.alertatierras.types.consultardetallealerta.TipoSalidaConsultarDetalleAlerta.ListaProcesosAS.ProcesoAS;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.ProcesoASVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Lista
 * procesos consultar detalle AS. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ListaProcesosConsultarDetalleASConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ListaProcesosConsultarDetalleASConverter.
	 */
	private ListaProcesosConsultarDetalleASConverter() {
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
	 * @param apas_procesoAs el parametro que representa el complex type a
	 *                       convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como ProcesoASVO.
	 */
	public static ProcesoASVO tipoAVo(ProcesoAS apas_procesoAs) {
		ProcesoASVO lpas_procesoASVo = new ProcesoASVO();
		lpas_procesoASVo.setIi_idAlerta(apas_procesoAs.getIdAlerta());
		lpas_procesoASVo.setIs_nomCirculoRegistral(apas_procesoAs.getNomCirculoRegistral());
		lpas_procesoASVo.setIs_nomPais(apas_procesoAs.getNomPais());
		lpas_procesoASVo.setIs_nomDepartamento(apas_procesoAs.getNomDepartamento());
		lpas_procesoASVo.setIs_nomMunicipio(apas_procesoAs.getNomMunicipio());
		lpas_procesoASVo.setIs_tipoPredio(apas_procesoAs.getTipoPredio());
		lpas_procesoASVo.setIi_numLibro(apas_procesoAs.getNumLibro());
		lpas_procesoASVo.setIi_numTomo(apas_procesoAs.getNumTomo());
		lpas_procesoASVo.setIs_idTipoPartida(apas_procesoAs.getIdTipoPartida());
		lpas_procesoASVo.setIi_numPartida(apas_procesoAs.getNumPartida());
		lpas_procesoASVo.setIi_numFolio(apas_procesoAs.getNumFolio());
		lpas_procesoASVo.setIi_anio(apas_procesoAs.getAnio());
		lpas_procesoASVo.setIs_nomPredio(apas_procesoAs.getNomPredio());
		lpas_procesoASVo.setIi_numPredio(apas_procesoAs.getNumPredio());
		return lpas_procesoASVo;
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
	 * @param alpa_proceso el parametro que representa la lista de complex types a
	 *                     convertir.
	 * @return Resultado para la conversion de lista de complex types a lista de
	 *         objetos con valores de servicio, en este caso como lista de
	 *         ProcesoASVO.
	 */
	public static List<ProcesoASVO> listaTipoAListaVo(List<ProcesoAS> alpa_proceso) {
		List<ProcesoASVO> llpa_listaProcesoVo = new ArrayList<>();
		for (ProcesoAS lpa_proceso : alpa_proceso) {
			llpa_listaProcesoVo.add(tipoAVo(lpa_proceso));
		}
		return llpa_listaProcesoVo;
	}
}
