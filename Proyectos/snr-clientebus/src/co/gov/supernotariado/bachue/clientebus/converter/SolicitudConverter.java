/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: SolicitudConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: SolicitudConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.consultarhistorialsolicitudespagadas.types.buscarsolicitudes.SolicitudType;
import co.gov.supernotariado.bachue.clientebus.vo.consultarhistorialsolicitudespagadas.SolicitudVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Solicitud.
 * <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class SolicitudConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase SolicitudConverter.
	 */
	private SolicitudConverter() {
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
	 * Especificamente convierte <b>de</b> SolicitudType <b>a</b> SolicitudVO, <br>
	 * En otras palabras, <b>de</b> Solicitud type (ComplexType relacionado a la
	 * representacion XML del servicio) <b>a</b> Solicitud objeto con valores de
	 * servicio.
	 *
	 * @param ast_solicitudType el parametro que representa el complex type a
	 *                          convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como SolicitudVO.
	 */
	public static SolicitudVO tipoAVoSolicitud(SolicitudType ast_solicitudType) {
		SolicitudVO ls_solicitudVo = new SolicitudVO();

		ls_solicitudVo.setIs_descripcionServicio(ast_solicitudType.getDescripcionServicio());
		ls_solicitudVo.setIs_descripcionSubServicio(ast_solicitudType.getDescripcionSubServicio());
		ls_solicitudVo.setIs_fechaServicio(ast_solicitudType.getFechaServicio());
		ls_solicitudVo.setIs_nir(ast_solicitudType.getNir());

		return ls_solicitudVo;
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
	 * Especificamente convierte <b>de</b> SolicitudType <b>a</b> SolicitudVO, <br>
	 * En otras palabras, <b>de</b> Solicitud type (ComplexType relacionado a la
	 * representacion XML del servicio) <b>a</b> Solicitud objeto con valores de
	 * servicio.
	 *
	 * @param alst_listaSolicitudType el parametro que representa la lista de
	 *                                complex types a convertir.
	 * @return Resultado para la conversion de lista de complex types a lista de
	 *         objetos con valores de servicio, en este caso como lista de
	 *         SolicitudVO.
	 */
	public static List<SolicitudVO> tipoAVoListaSolicitud(List<SolicitudType> alst_listaSolicitudType) {
		List<SolicitudVO> lls_listaSolicitudVo = new ArrayList<>();

		for (SolicitudType ast_solicitudType : alst_listaSolicitudType) {
			lls_listaSolicitudVo.add(tipoAVoSolicitud(ast_solicitudType));
		}

		return lls_listaSolicitudVo;
	}

}
