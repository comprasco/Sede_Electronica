/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: ConsultaEstadoLiquidacionConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: ConsultaEstadoLiquidacionConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import co.gov.supernotariado.bachue.clientebus.operacionesfinancieras.types.consultarestadoliquidacion.TipoEntradaConsultarEstadoLiquidacion;
import co.gov.supernotariado.bachue.clientebus.operacionesfinancieras.types.consultarestadoliquidacion.TipoSalidaConsultarEstadoLiquidacion;
import co.gov.supernotariado.bachue.clientebus.vo.operacionesfinancieras.TipoEntradaConsultarEstadoLiquidacionVO;
import co.gov.supernotariado.bachue.clientebus.vo.operacionesfinancieras.TipoSalidaConsultaEstadoLiquidacionVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Consulta
 * estado liquidacion. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ConsultaEstadoLiquidacionConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ConsultaEstadoLiquidacionConverter.
	 */
	private ConsultaEstadoLiquidacionConverter() {
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
	 * Especificamente convierte <b>de</b> TipoEntradaConsultarEstadoLiquidacionVO
	 * <b>a</b> TipoEntradaConsultarEstadoLiquidacion, <br>
	 * En otras palabras, <b>de</b> Tipo entrada consultar estado liquidacion objeto
	 * con valores de servicio <b>a</b> Tipo entrada consultar estado liquidacion
	 * (ComplexType relacionado a la representacion XML del servicio).
	 *
	 * @param atecel_tipoEntradaConsultarEstadoLiquidacionVo el parametro que
	 *                                                       representa el objeto
	 *                                                       con valores de servicio
	 *                                                       a convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como
	 *         TipoEntradaConsultarEstadoLiquidacion.
	 */
	public static TipoEntradaConsultarEstadoLiquidacion voATipo(
			TipoEntradaConsultarEstadoLiquidacionVO atecel_tipoEntradaConsultarEstadoLiquidacionVo) {
		TipoEntradaConsultarEstadoLiquidacion ltecel_tipoServicio = new TipoEntradaConsultarEstadoLiquidacion();
		ltecel_tipoServicio
				.setMontoTransaccion(atecel_tipoEntradaConsultarEstadoLiquidacionVo.getIbd_montoTransaccion());
		ltecel_tipoServicio
				.setNumeroReferencia(atecel_tipoEntradaConsultarEstadoLiquidacionVo.getIs_numeroReferencia());
		return ltecel_tipoServicio;
	}

	/**
	 * Metodo que convierte de ComplexType a VO ( De elemento especifico del esquema
	 * de un Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto con un resultado/salida de una peticion de
	 * Servicio SOAP, en un objeto de datos llamado VO; para ser retornado como
	 * resultado a la aplicacion o capa de negocio que consume el cliente de
	 * servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaConsultarEstadoLiquidacion
	 * <b>a</b> TipoSalidaConsultaEstadoLiquidacionVO, <br>
	 * En otras palabras, <b>de</b> Tipo salida consultar estado liquidacion
	 * (ComplexType relacionado a la representacion XML del servicio) <b>a</b> Tipo
	 * salida consulta estado liquidacion objeto con valores de servicio.
	 *
	 * @param atscel_estadoLiquidacion el parametro que representa el complex type a
	 *                                 convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como TipoSalidaConsultaEstadoLiquidacionVO.
	 */
	public static TipoSalidaConsultaEstadoLiquidacionVO tipoAVo(
			TipoSalidaConsultarEstadoLiquidacion atscel_estadoLiquidacion) {
		TipoSalidaConsultaEstadoLiquidacionVO ltscel_entidadVO = new TipoSalidaConsultaEstadoLiquidacionVO();
		ltscel_entidadVO.setIs_codigoMensaje(atscel_estadoLiquidacion.getCodigoMensaje());

		if (atscel_estadoLiquidacion.getCodigoTransaccionRecaudador() != null)
			ltscel_entidadVO.setIs_codigoTransaccionRecaudador(
					atscel_estadoLiquidacion.getCodigoTransaccionRecaudador().getValue());

		if (atscel_estadoLiquidacion.getDescripcionMensaje() != null)
			ltscel_entidadVO.setIs_descripcionMensaje(atscel_estadoLiquidacion.getDescripcionMensaje().getValue());

		ltscel_entidadVO.setIs_estadoTransaccion(atscel_estadoLiquidacion.getEstadoTransaccion());
		ltscel_entidadVO.setIs_numeroReferencia(atscel_estadoLiquidacion.getNumeroReferencia());
		return ltscel_entidadVO;
	}

}
