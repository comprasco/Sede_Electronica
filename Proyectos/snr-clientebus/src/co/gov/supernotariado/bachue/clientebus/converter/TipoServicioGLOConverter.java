/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: TipoServicioGLOConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: TipoServicioGLOConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.operacionesfinancieras.types.generarliquidacion.TipoServicioGLO;
import co.gov.supernotariado.bachue.clientebus.vo.operacionesfinancieras.TipoServicioGLOVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Tipo servicio
 * GLO. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoServicioGLOConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase TipoServicioGLOConverter.
	 */
	private TipoServicioGLOConverter() {
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
	 * Especificamente convierte <b>de</b> TipoServicioGLO <b>a</b>
	 * TipoServicioGLOVO, <br>
	 * En otras palabras, <b>de</b> Tipo servicio GLO (ComplexType relacionado a la
	 * representacion XML del servicio) <b>a</b> Tipo servicio GLOVO.
	 *
	 * @param alts_tiposServicioGLO el parametro que representa la lista de complex
	 *                              types a convertir.
	 * @return Resultado para la conversion de lista de complex types a lista de
	 *         objetos con valores de servicio, en este caso como lista de
	 *         TipoServicioGLOVO.
	 */
	public static List<TipoServicioGLOVO> listaTipoAVo(List<TipoServicioGLO> alts_tiposServicioGLO) {

		List<TipoServicioGLOVO> llts_tipoServicio = new ArrayList<>();

		for (TipoServicioGLO lts_tipoServicioGLO : alts_tiposServicioGLO)
			llts_tipoServicio.add(tipoAVo(lts_tipoServicioGLO));

		return llts_tipoServicio;
	}

	/**
	 * Metodo que convierte de ComplexType a VO ( De elemento especifico del esquema
	 * de un Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto con un resultado/salida de una peticion de
	 * Servicio SOAP, en un objeto de datos llamado VO; para ser retornado como
	 * resultado a la aplicacion o capa de negocio que consume el cliente de
	 * servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoServicioGLO <b>a</b>
	 * TipoServicioGLOVO, <br>
	 * En otras palabras, <b>de</b> Tipo servicio GLO (ComplexType relacionado a la
	 * representacion XML del servicio) <b>a</b> Tipo servicio GLOVO.
	 *
	 * @param alts_tipoServicioGLO el parametro que representa el complex type a
	 *                             convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como TipoServicioGLOVO.
	 */
	public static TipoServicioGLOVO tipoAVo(TipoServicioGLO alts_tipoServicioGLO) {

		TipoServicioGLOVO ltsg_tipoServicio = new TipoServicioGLOVO();

		ltsg_tipoServicio.setIs_cantidadSolicitada(alts_tipoServicioGLO.getCantidadSolicitada().toString());
		ltsg_tipoServicio.setIs_tipoServicio(alts_tipoServicioGLO.getTipoServicio());
		ltsg_tipoServicio.setIs_valorServicio(alts_tipoServicioGLO.getValorServicio().toString());
		ltsg_tipoServicio.setIs_subtipoServicio(alts_tipoServicioGLO.getSubtipoServicio());

		return ltsg_tipoServicio;
	}

}
