/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: ConsultarDetalleSolicitudConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: ConsultarDetalleSolicitudConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import co.gov.supernotariado.bachue.clientebus.consultarhistorialsolicitudespagadas.types.consultardetallesolicitud.TipoEntradaConsultarDetalleSolicitud;
import co.gov.supernotariado.bachue.clientebus.consultarhistorialsolicitudespagadas.types.consultardetallesolicitud.TipoSalidaConsultarDetalleSolicitud;
import co.gov.supernotariado.bachue.clientebus.vo.consultarhistorialsolicitudespagadas.TipoEntradaConsultarDetalleSolicitudVO;
import co.gov.supernotariado.bachue.clientebus.vo.consultarhistorialsolicitudespagadas.TipoSalidaConsultarDetalleSolicitudVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Consultar
 * detalle solicitud. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ConsultarDetalleSolicitudConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ConsultarDetalleSolicitudConverter.
	 */
	private ConsultarDetalleSolicitudConverter() {
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
	 * Especificamente convierte <b>de</b> TipoEntradaConsultarDetalleSolicitudVO
	 * <b>a</b> TipoEntradaConsultarDetalleSolicitud, <br>
	 * En otras palabras, <b>de</b> Tipo entrada consultar detalle solicitud objeto
	 * con valores de servicio <b>a</b> Tipo entrada consultar detalle solicitud
	 * (ComplexType relacionado a la representacion XML del servicio).
	 *
	 * @param atecds_tipoEntradaConsultarDetalleSolicitudVo el parametro que
	 *                                                      representa el objeto con
	 *                                                      valores de servicio a
	 *                                                      convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como TipoEntradaConsultarDetalleSolicitud.
	 */
	public static TipoEntradaConsultarDetalleSolicitud voATipo(
			TipoEntradaConsultarDetalleSolicitudVO atecds_tipoEntradaConsultarDetalleSolicitudVo) {
		TipoEntradaConsultarDetalleSolicitud ltecds_tipoEntradaConsultarDetalleSolicitud = new TipoEntradaConsultarDetalleSolicitud();

		ltecds_tipoEntradaConsultarDetalleSolicitud
				.setModulo(atecds_tipoEntradaConsultarDetalleSolicitudVo.getIs_modulo());
		ltecds_tipoEntradaConsultarDetalleSolicitud.setNir(atecds_tipoEntradaConsultarDetalleSolicitudVo.getIs_nir());
		ltecds_tipoEntradaConsultarDetalleSolicitud.setSolicitante(SolicitanteDetalleConverter
				.voATipoSolicitanteDetalle(atecds_tipoEntradaConsultarDetalleSolicitudVo.getIsd_solicitanteDetalle()));

		return ltecds_tipoEntradaConsultarDetalleSolicitud;
	}

	/**
	 * Metodo que convierte de ComplexType a VO ( De elemento especifico del esquema
	 * de un Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto con un resultado/salida de una peticion de
	 * Servicio SOAP, en un objeto de datos llamado VO; para ser retornado como
	 * resultado a la aplicacion o capa de negocio que consume el cliente de
	 * servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaConsultarDetalleSolicitud
	 * <b>a</b> TipoSalidaConsultarDetalleSolicitudVO, <br>
	 * En otras palabras, <b>de</b> Tipo salida consultar detalle solicitud
	 * (ComplexType relacionado a la representacion XML del servicio) <b>a</b> Tipo
	 * salida consultar detalle solicitud objeto con valores de servicio.
	 *
	 * @param atscds_tipoSalidaConsultarDetalleSolicitud el parametro que representa
	 *                                                   el complex type a
	 *                                                   convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como TipoSalidaConsultarDetalleSolicitudVO.
	 */
	public static TipoSalidaConsultarDetalleSolicitudVO tipoAVo(
			TipoSalidaConsultarDetalleSolicitud atscds_tipoSalidaConsultarDetalleSolicitud) {
		TipoSalidaConsultarDetalleSolicitudVO ltscds_tipoSalidaConsultarDetalleSolicitudVo = new TipoSalidaConsultarDetalleSolicitudVO();

		ltscds_tipoSalidaConsultarDetalleSolicitudVo
				.setIs_codigoMensaje(atscds_tipoSalidaConsultarDetalleSolicitud.getCodigoMensaje());
		ltscds_tipoSalidaConsultarDetalleSolicitudVo
				.setIs_descripcionMensaje(atscds_tipoSalidaConsultarDetalleSolicitud.getDescripcionMensaje());
		ltscds_tipoSalidaConsultarDetalleSolicitudVo.setIltd_listaTurno(TurnoDetalleConverter
				.tipoAVoListaTurnoDetalle(atscds_tipoSalidaConsultarDetalleSolicitud.getTurnos().getTurno()));

		return ltscds_tipoSalidaConsultarDetalleSolicitudVo;
	}
}
