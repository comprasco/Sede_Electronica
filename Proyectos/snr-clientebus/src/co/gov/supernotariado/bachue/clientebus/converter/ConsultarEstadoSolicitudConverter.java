/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: ConsultarEstadoSolicitudConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: ConsultarEstadoSolicitudConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import co.gov.supernotariado.bachue.clientebus.generacionsolicitud.types.consultarestadosolicitud.TipoEntradaConsultarEstadoSolicitud;
import co.gov.supernotariado.bachue.clientebus.generacionsolicitud.types.consultarestadosolicitud.TipoSalidaConsultarEstadoSolicitud;
import co.gov.supernotariado.bachue.clientebus.vo.generacionsolicitud.TipoEntradaConsultarEstadoSolicitudVO;
import co.gov.supernotariado.bachue.clientebus.vo.generacionsolicitud.TipoSalidaConsultarEstadoSolicitudVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Consultar
 * estado solicitud. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ConsultarEstadoSolicitudConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ConsultarEstadoSolicitudConverter.
	 */
	private ConsultarEstadoSolicitudConverter() {
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
	 * Especificamente convierte <b>de</b> TipoEntradaConsultarEstadoSolicitudVO
	 * <b>a</b> TipoEntradaConsultarEstadoSolicitud, <br>
	 * En otras palabras, <b>de</b> Tipo entrada consultar estado solicitud objeto
	 * con valores de servicio <b>a</b> Tipo entrada consultar estado solicitud
	 * (ComplexType relacionado a la representacion XML del servicio).
	 *
	 * @param ateces_estadoSolicitud el parametro que representa el objeto con
	 *                               valores de servicio a convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como TipoEntradaConsultarEstadoSolicitud.
	 */
	public static TipoEntradaConsultarEstadoSolicitud voATipo(
			TipoEntradaConsultarEstadoSolicitudVO ateces_estadoSolicitud) {
		TipoEntradaConsultarEstadoSolicitud lteces_consultar = new TipoEntradaConsultarEstadoSolicitud();

		lteces_consultar.setModulo(ateces_estadoSolicitud.getIs_modulo());
		lteces_consultar.setNIR(ateces_estadoSolicitud.getIs_nir());
		lteces_consultar
				.setSolicitante(TipoSolicitanteCESIConverter.voATipo(ateces_estadoSolicitud.getItscv_solicitante()));

		return lteces_consultar;
	}

	/**
	 * Metodo que convierte de ComplexType a VO ( De elemento especifico del esquema
	 * de un Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto con un resultado/salida de una peticion de
	 * Servicio SOAP, en un objeto de datos llamado VO; para ser retornado como
	 * resultado a la aplicacion o capa de negocio que consume el cliente de
	 * servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaConsultarEstadoSolicitud
	 * <b>a</b> TipoSalidaConsultarEstadoSolicitudVO, <br>
	 * En otras palabras, <b>de</b> Tipo salida consultar estado solicitud
	 * (ComplexType relacionado a la representacion XML del servicio) <b>a</b> Tipo
	 * salida consultar estado solicitud objeto con valores de servicio.
	 *
	 * @param atsces_consultaEstadoSolicitud el parametro que representa el complex
	 *                                       type a convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como TipoSalidaConsultarEstadoSolicitudVO.
	 */
	public static TipoSalidaConsultarEstadoSolicitudVO tipoAVo(
			TipoSalidaConsultarEstadoSolicitud atsces_consultaEstadoSolicitud) {

		TipoSalidaConsultarEstadoSolicitudVO ltsces_consultaEstadoSolicitud = new TipoSalidaConsultarEstadoSolicitudVO();

		ltsces_consultaEstadoSolicitud.setIs_descripcionMensaje(atsces_consultaEstadoSolicitud.getDescripcionMensaje());
		ltsces_consultaEstadoSolicitud
				.setId_fechaFin(atsces_consultaEstadoSolicitud.getFechaFin().toGregorianCalendar().getTime());
		ltsces_consultaEstadoSolicitud.setIs_descripcionMotivo(atsces_consultaEstadoSolicitud.getDescripcionMotivo());
		ltsces_consultaEstadoSolicitud.setIs_estado(atsces_consultaEstadoSolicitud.getEstado());
		ltsces_consultaEstadoSolicitud.setIs_idEtapa(atsces_consultaEstadoSolicitud.getIdEtapa());
		ltsces_consultaEstadoSolicitud.setIs_idMotivo(atsces_consultaEstadoSolicitud.getIdMotivo());
		ltsces_consultaEstadoSolicitud.setIs_nir(atsces_consultaEstadoSolicitud.getNIR());
		ltsces_consultaEstadoSolicitud.setIs_nombreEtapa(atsces_consultaEstadoSolicitud.getNombreEtapa());

		return ltsces_consultaEstadoSolicitud;

	}

}
