/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: CopiasConsultaSolicitudConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: CopiasConsultaSolicitudConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import co.gov.supernotariado.bachue.clientebus.solicituddecopias.types.consultarsolicitud.TipoEntradaConsultarSolicitud;
import co.gov.supernotariado.bachue.clientebus.solicituddecopias.types.consultarsolicitud.TipoSalidaConsultarSolicitud;
import co.gov.supernotariado.bachue.clientebus.vo.solicitudcopias.TipoEntradaConsultarSolicitudVO;
import co.gov.supernotariado.bachue.clientebus.vo.solicitudcopias.TipoSalidaConsultarSolicitudVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Copias
 * consulta solicitud. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class CopiasConsultaSolicitudConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * CopiasConsultaSolicitudConverter.
	 */
	private CopiasConsultaSolicitudConverter() {
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
	 * Especificamente convierte <b>de</b> TipoEntradaConsultarSolicitudVO <b>a</b>
	 * TipoEntradaConsultarSolicitud, <br>
	 * En otras palabras, <b>de</b> Tipo entrada consultar solicitud objeto con
	 * valores de servicio <b>a</b> Tipo entrada consultar solicitud (ComplexType
	 * relacionado a la representacion XML del servicio).
	 *
	 * @param atecs_tipoEntradaConsultarSolicitudVo el parametro que representa el
	 *                                              objeto con valores de servicio a
	 *                                              convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como TipoEntradaConsultarSolicitud.
	 */
	public static TipoEntradaConsultarSolicitud voATipo(
			TipoEntradaConsultarSolicitudVO atecs_tipoEntradaConsultarSolicitudVo) {
		TipoEntradaConsultarSolicitud ltecs_tipoEntradaConsultarSolicitud = new TipoEntradaConsultarSolicitud();
		ltecs_tipoEntradaConsultarSolicitud.setNIR(atecs_tipoEntradaConsultarSolicitudVo.getIs_nir());
		return ltecs_tipoEntradaConsultarSolicitud;
	}

	/**
	 * Metodo que convierte de ComplexType a VO ( De elemento especifico del esquema
	 * de un Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto con un resultado/salida de una peticion de
	 * Servicio SOAP, en un objeto de datos llamado VO; para ser retornado como
	 * resultado a la aplicacion o capa de negocio que consume el cliente de
	 * servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaConsultarSolicitud <b>a</b>
	 * TipoSalidaConsultarSolicitudVO, <br>
	 * En otras palabras, <b>de</b> Tipo salida consultar solicitud (ComplexType
	 * relacionado a la representacion XML del servicio) <b>a</b> Tipo salida
	 * consultar solicitud objeto con valores de servicio.
	 *
	 * @param atscs_tipoSalidaConsultarSolicitud el parametro que representa el
	 *                                           complex type a convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como TipoSalidaConsultarSolicitudVO.
	 */
	public static TipoSalidaConsultarSolicitudVO tipoAVo(
			TipoSalidaConsultarSolicitud atscs_tipoSalidaConsultarSolicitud) {
		TipoSalidaConsultarSolicitudVO ltscs_tipoSalidaConsultarSolicitudVo = new TipoSalidaConsultarSolicitudVO();
		ltscs_tipoSalidaConsultarSolicitudVo.setIs_codigo(atscs_tipoSalidaConsultarSolicitud.getCodigo());
		ltscs_tipoSalidaConsultarSolicitudVo.setIs_estado(atscs_tipoSalidaConsultarSolicitud.getEstado());
		ltscs_tipoSalidaConsultarSolicitudVo.setIs_mensaje(atscs_tipoSalidaConsultarSolicitud.getMensaje());
		ltscs_tipoSalidaConsultarSolicitudVo
				.setIs_referenciaPago(atscs_tipoSalidaConsultarSolicitud.getReferenciaPago());
		ltscs_tipoSalidaConsultarSolicitudVo.setIs_valorPago(atscs_tipoSalidaConsultarSolicitud.getValorPago());
		if (atscs_tipoSalidaConsultarSolicitud.getFechaLiquidacion() != null)
			ltscs_tipoSalidaConsultarSolicitudVo.setId_fechaLiquidacion(
					atscs_tipoSalidaConsultarSolicitud.getFechaLiquidacion().toGregorianCalendar().getTime());
		if (atscs_tipoSalidaConsultarSolicitud.getFechaVencimientoPago() != null)
			ltscs_tipoSalidaConsultarSolicitudVo.setId_fechaVencimientoPago(
					atscs_tipoSalidaConsultarSolicitud.getFechaVencimientoPago().toGregorianCalendar().getTime());
		return ltscs_tipoSalidaConsultarSolicitudVo;
	}
}
