/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: TarifaConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: TarifaConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.gestionalertastitulares.types.consultartarifaalertastitulares.TarifaType;
import co.gov.supernotariado.bachue.clientebus.vo.gestionalertastitulares.TarifaVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Tarifa. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TarifaConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase TarifaConverter.
	 */
	private TarifaConverter() {
		// Metodo constructor privado y vacio
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
	 * Especificamente convierte <b>de</b> TarifaType <b>a</b> TarifaVO, <br>
	 * En otras palabras, <b>de</b> Tarifa type (ComplexType relacionado a la
	 * representacion XML del servicio) <b>a</b> Tarifa objeto con valores de
	 * servicio.
	 *
	 * @param altt_tarifa el parametro que representa la lista de complex types a
	 *                    convertir.
	 * @return Resultado para la conversion de lista de complex types a lista de
	 *         objetos con valores de servicio, en este caso como lista de TarifaVO.
	 */
	public static List<TarifaVO> listaTipoAListaVo(List<TarifaType> altt_tarifa) {

		List<TarifaVO> llt_tarifaVo = new ArrayList<>();

		for (TarifaType ltt_tarifa : altt_tarifa)
			llt_tarifaVo.add(tipoAVo(ltt_tarifa));

		return llt_tarifaVo;
	}

	/**
	 * Metodo que convierte de ComplexType a VO ( De elemento especifico del esquema
	 * de un Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto con un resultado/salida de una peticion de
	 * Servicio SOAP, en un objeto de datos llamado VO; para ser retornado como
	 * resultado a la aplicacion o capa de negocio que consume el cliente de
	 * servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TarifaType <b>a</b> TarifaVO, <br>
	 * En otras palabras, <b>de</b> Tarifa type (ComplexType relacionado a la
	 * representacion XML del servicio) <b>a</b> Tarifa objeto con valores de
	 * servicio.
	 *
	 * @param att_tarifa el parametro que representa el complex type a convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como TarifaVO.
	 */
	public static TarifaVO tipoAVo(TarifaType att_tarifa) {

		TarifaVO lt_tarifaVo = new TarifaVO();
		lt_tarifaVo.setIs_rango(att_tarifa.getRango());
		lt_tarifaVo.setIs_valor(att_tarifa.getValor());
		return lt_tarifaVo;
	}

}
