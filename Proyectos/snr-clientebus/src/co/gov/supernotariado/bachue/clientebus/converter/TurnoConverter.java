/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: TurnoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: TurnoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.entregaproducto.types.obtenerturnosrefpago.Turno;
import co.gov.supernotariado.bachue.clientebus.vo.entregaproducto.TurnoVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Turno. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TurnoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase TurnoConverter.
	 */
	private TurnoConverter() {
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
	 * Especificamente convierte <b>de</b> Turno <b>a</b> TurnoVO, <br>
	 * En otras palabras, <b>de</b> Turno (ComplexType relacionado a la
	 * representacion XML del servicio) <b>a</b> Turno objeto con valores de
	 * servicio.
	 *
	 * @param alt_listaTurno el parametro que representa la lista de complex types a
	 *                       convertir.
	 * @return Resultado para la conversion de lista de complex types a lista de
	 *         objetos con valores de servicio, en este caso como lista de TurnoVO.
	 */
	public static List<TurnoVO> listaTipoAListaVo(List<Turno> alt_listaTurno) {

		List<TurnoVO> llt_turnoVo = new ArrayList<>();

		for (Turno lt_turno : alt_listaTurno)
			llt_turnoVo.add(tipoAVo(lt_turno));

		return llt_turnoVo;
	}

	/**
	 * Metodo que convierte de ComplexType a VO ( De elemento especifico del esquema
	 * de un Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto con un resultado/salida de una peticion de
	 * Servicio SOAP, en un objeto de datos llamado VO; para ser retornado como
	 * resultado a la aplicacion o capa de negocio que consume el cliente de
	 * servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> Turno <b>a</b> TurnoVO, <br>
	 * En otras palabras, <b>de</b> Turno (ComplexType relacionado a la
	 * representacion XML del servicio) <b>a</b> Turno objeto con valores de
	 * servicio.
	 *
	 * @param at_turno el parametro que representa el complex type a convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como TurnoVO.
	 */
	public static TurnoVO tipoAVo(Turno at_turno) {

		TurnoVO lt_turnoVo = new TurnoVO();
		lt_turnoVo.setIs_identificadorTurno(at_turno.getIdentificadorTurno());
		return lt_turnoVo;
	}
}
