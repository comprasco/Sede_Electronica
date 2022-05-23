/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: TipoGenerarSolicitudConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: TipoGenerarSolicitudConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import java.util.ArrayList;
import java.util.Objects;

import co.gov.supernotariado.bachue.clientebus.generacionsolicitud.types.generarsolicitud.TipoEntradaGenerarSolicitud;
import co.gov.supernotariado.bachue.clientebus.generacionsolicitud.types.generarsolicitud.TipoEntradaGenerarSolicitud.Servicios;
import co.gov.supernotariado.bachue.clientebus.generacionsolicitud.types.generarsolicitud.TipoSalidaGenerarSolicitud;
import co.gov.supernotariado.bachue.clientebus.vo.generacionsolicitud.TipoEntradaGenerarSolicitudVO;
import co.gov.supernotariado.bachue.clientebus.vo.generacionsolicitud.TipoSalidaGenerarSolicitudVO;
import co.gov.supernotariado.bachue.clientebus.vo.generacionsolicitud.TipoServicioGSIVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Tipo generar
 * solicitud. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoGenerarSolicitudConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * TipoGenerarSolicitudConverter.
	 */
	private TipoGenerarSolicitudConverter() {
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
	 * Especificamente convierte <b>de</b> TipoEntradaGenerarSolicitudVO <b>a</b>
	 * TipoEntradaGenerarSolicitud, <br>
	 * En otras palabras, <b>de</b> Tipo entrada generar solicitud objeto con
	 * valores de servicio <b>a</b> Tipo entrada generar solicitud (ComplexType
	 * relacionado a la representacion XML del servicio).
	 *
	 * @param ategs_entradaGenerarSolicitud el parametro que representa el objeto
	 *                                      con valores de servicio a convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como TipoEntradaGenerarSolicitud.
	 */
	public static TipoEntradaGenerarSolicitud voATipo(TipoEntradaGenerarSolicitudVO ategs_entradaGenerarSolicitud) {

		TipoEntradaGenerarSolicitud ltegs_generarSolicitud = new TipoEntradaGenerarSolicitud();

		ltegs_generarSolicitud.setModulo(ategs_entradaGenerarSolicitud.getIs_modulo());
		ltegs_generarSolicitud.setSolicitante(
				TipoSolicitanteGSIConverter.voATipo(ategs_entradaGenerarSolicitud.getItsgv_solicitante()));
		if (Objects.isNull(ategs_entradaGenerarSolicitud.getIltsgsv_servicios())) {
			ategs_entradaGenerarSolicitud.setIltsgsv_servicios(new ArrayList<TipoServicioGSIVO>());
		}
		ltegs_generarSolicitud.setServicios(new Servicios());
		for (TipoServicioGSIVO lts_servicio : ategs_entradaGenerarSolicitud.getIltsgsv_servicios()) {
			ltegs_generarSolicitud.getServicios().getServicio().add(TipoServicioGSIConverter.voATipo(lts_servicio));
		}
		return ltegs_generarSolicitud;
	}

	/**
	 * Metodo que convierte de ComplexType a VO ( De elemento especifico del esquema
	 * de un Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto con un resultado/salida de una peticion de
	 * Servicio SOAP, en un objeto de datos llamado VO; para ser retornado como
	 * resultado a la aplicacion o capa de negocio que consume el cliente de
	 * servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaGenerarSolicitud <b>a</b>
	 * TipoSalidaGenerarSolicitudVO, <br>
	 * En otras palabras, <b>de</b> Tipo salida generar solicitud (ComplexType
	 * relacionado a la representacion XML del servicio) <b>a</b> Tipo salida
	 * generar solicitud objeto con valores de servicio.
	 *
	 * @param atsgs_salidaGenerarSolicitud el parametro que representa el complex
	 *                                     type a convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como TipoSalidaGenerarSolicitudVO.
	 */
	public static TipoSalidaGenerarSolicitudVO tipoAVo(TipoSalidaGenerarSolicitud atsgs_salidaGenerarSolicitud) {

		TipoSalidaGenerarSolicitudVO ltsgs_entradaGenerarSolicitud = new TipoSalidaGenerarSolicitudVO();

		ltsgs_entradaGenerarSolicitud.setIs_descripcionMensaje(atsgs_salidaGenerarSolicitud.getDescripcionMensaje());
		ltsgs_entradaGenerarSolicitud.setIs_codigoMensaje(atsgs_salidaGenerarSolicitud.getCodigoMensaje());
		ltsgs_entradaGenerarSolicitud
				.setIs_descripcionEstadoSolicitud(atsgs_salidaGenerarSolicitud.getDescripcionEstadoSolicitud());
		ltsgs_entradaGenerarSolicitud
				.setIs_mensajeAlSolicitante(atsgs_salidaGenerarSolicitud.getMensajeAlSolicitante());
		ltsgs_entradaGenerarSolicitud.setIs_nir(atsgs_salidaGenerarSolicitud.getNIR());
		ltsgs_entradaGenerarSolicitud
				.setIs_codigoEstadoSolicitud(atsgs_salidaGenerarSolicitud.getCodigoEstadoSolicitud());
		return ltsgs_entradaGenerarSolicitud;
	}

}
