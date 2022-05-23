/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: TurnoDetalleConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: TurnoDetalleConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.consultarhistorialsolicitudespagadas.types.consultardetallesolicitud.TurnoType;
import co.gov.supernotariado.bachue.clientebus.vo.consultarhistorialsolicitudespagadas.TurnoDetalleVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Turno
 * detalle. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TurnoDetalleConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase TurnoDetalleConverter.
	 */
	private TurnoDetalleConverter() {
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
	 * Especificamente convierte <b>de</b> TurnoType <b>a</b> TurnoDetalleVO, <br>
	 * En otras palabras, <b>de</b> Turno type (ComplexType relacionado a la
	 * representacion XML del servicio) <b>a</b> Turno detalle objeto con valores de
	 * servicio.
	 *
	 * @param att_turnoType el parametro que representa el complex type a convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como TurnoDetalleVO.
	 */
	public static TurnoDetalleVO tipoAVoTurnoDetalle(TurnoType att_turnoType) {
		TurnoDetalleVO ltd_turnoDetalleVo = new TurnoDetalleVO();

		ltd_turnoDetalleVo.setIs_descricionSubServicio(att_turnoType.getDescricionSubServicio());
		ltd_turnoDetalleVo.setIs_descripcionServicio(att_turnoType.getDescripcionServicio());
		ltd_turnoDetalleVo.setIs_fechaServicio(att_turnoType.getFechaServicio());
		ltd_turnoDetalleVo.setIs_nir(att_turnoType.getNir());
		ltd_turnoDetalleVo.setIs_turno(att_turnoType.getTurno());

		return ltd_turnoDetalleVo;
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
	 * Especificamente convierte <b>de</b> TurnoType <b>a</b> TurnoDetalleVO, <br>
	 * En otras palabras, <b>de</b> Turno type (ComplexType relacionado a la
	 * representacion XML del servicio) <b>a</b> Turno detalle objeto con valores de
	 * servicio.
	 *
	 * @param altt_listaTurnoType el parametro que representa la lista de complex
	 *                            types a convertir.
	 * @return Resultado para la conversion de lista de complex types a lista de
	 *         objetos con valores de servicio, en este caso como lista de
	 *         TurnoDetalleVO.
	 */
	public static List<TurnoDetalleVO> tipoAVoListaTurnoDetalle(List<TurnoType> altt_listaTurnoType) {
		List<TurnoDetalleVO> lltd_listaTurnoDetalleVo = new ArrayList<>();

		for (TurnoType att_TurnoType : altt_listaTurnoType) {
			lltd_listaTurnoDetalleVo.add(tipoAVoTurnoDetalle(att_TurnoType));
		}
		return lltd_listaTurnoDetalleVo;
	}
}
