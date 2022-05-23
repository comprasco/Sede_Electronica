/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EstadoLiquidacionWsDtoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: EstadoLiquidacionWsDtoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import co.gov.supernotariado.bachue.clientebus.vo.operacionesfinancieras.TipoEntradaConsultarEstadoLiquidacionVO;
import co.gov.supernotariado.bachue.clientebus.vo.operacionesfinancieras.TipoSalidaConsultaEstadoLiquidacionVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.EstadoLiquidacionSalidaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.EstadoLiquidacionWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Estado
 * liquidacion ws dto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class EstadoLiquidacionWsDtoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * EstadoLiquidacionWsDtoConverter.
	 */
	private EstadoLiquidacionWsDtoConverter() {
		// Constructor vacio de la clase
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoEntradaConsultarEstadoLiquidacionVO
	 * <b>a</b> EstadoLiquidacionWSDTO, <br>
	 * En otras palabras, <b>de</b> Tipo entrada consultar estado liquidacion objeto
	 * con valores de servicio <b>a</b> Estado liquidacion web service dto.
	 *
	 * @param atecel_estadoLiquidacion el parametro estado liquidacion
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como EstadoLiquidacionWSDTO
	 */
	public static EstadoLiquidacionWSDTO entidadAVo(TipoEntradaConsultarEstadoLiquidacionVO atecel_estadoLiquidacion) {
		EstadoLiquidacionWSDTO lel_entidadVO = new EstadoLiquidacionWSDTO();
		lel_entidadVO.setIbd_montoTransaccion(atecel_estadoLiquidacion.getIbd_montoTransaccion());
		lel_entidadVO.setIs_numeroReferencia(atecel_estadoLiquidacion.getIs_numeroReferencia());
		return lel_entidadVO;
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaConsultaEstadoLiquidacionVO
	 * <b>a</b> EstadoLiquidacionSalidaWSDTO, <br>
	 * En otras palabras, <b>de</b> Tipo salida consulta estado liquidacion objeto
	 * con valores de servicio <b>a</b> Estado liquidacion salida web service dto.
	 *
	 * @param atscel_estadoLiquidacion el parametro estado liquidacion
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como EstadoLiquidacionSalidaWSDTO
	 */
	public static EstadoLiquidacionSalidaWSDTO entidadAVo(
			TipoSalidaConsultaEstadoLiquidacionVO atscel_estadoLiquidacion) {
		EstadoLiquidacionSalidaWSDTO lels_entidadVO = new EstadoLiquidacionSalidaWSDTO();
		lels_entidadVO.setIs_codigoMensaje(atscel_estadoLiquidacion.getIs_codigoMensaje());
		lels_entidadVO.setIs_codigoTransaccionRecaudador(atscel_estadoLiquidacion.getIs_codigoTransaccionRecaudador());
		lels_entidadVO.setIs_descripcionMensaje(atscel_estadoLiquidacion.getIs_descripcionMensaje());
		lels_entidadVO.setIs_estadoTransaccion(atscel_estadoLiquidacion.getIs_estadoTransaccion());
		lels_entidadVO.setIs_numeroReferencia(atscel_estadoLiquidacion.getIs_numeroReferencia());
		return lels_entidadVO;
	}

}
