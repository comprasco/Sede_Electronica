/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ObtenerTurnosRefPagoWsDtoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: ObtenerTurnosRefPagoWsDtoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import co.gov.supernotariado.bachue.clientebus.vo.entregaproducto.TipoEntradaObtenerTurnosRefPagoVO;
import co.gov.supernotariado.bachue.clientebus.vo.entregaproducto.TipoSalidaObtenerTurnosRefPagoVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaObtenerTurnosRefPagoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaObtenerTurnosRefPagoWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Obtener turnos
 * ref pago ws dto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ObtenerTurnosRefPagoWsDtoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ObtenerTurnosRefPagoWsDtoConverter.
	 */
	private ObtenerTurnosRefPagoWsDtoConverter() {
		// Constructor vacio de la clase
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaObtenerTurnosRefPagoVO <b>a</b>
	 * TipoSalidaObtenerTurnosRefPagoWSDTO, <br>
	 * En otras palabras, <b>de</b> Tipo salida obtener turnos ref pago objeto con
	 * valores de servicio <b>a</b> Tipo salida obtener turnos ref pago web service
	 * dto.
	 *
	 * @param atsotrp_tipoSalidaObtenerTurnosRefPago el parametro tipo salida
	 *                                               obtener turnos ref pago
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como TipoSalidaObtenerTurnosRefPagoWSDTO
	 */
	public static TipoSalidaObtenerTurnosRefPagoWSDTO entidadAVo(
			TipoSalidaObtenerTurnosRefPagoVO atsotrp_tipoSalidaObtenerTurnosRefPago) {
		TipoSalidaObtenerTurnosRefPagoWSDTO ltsotrp_tipoSalidaObtenerTurnosRefPagoWsDto = new TipoSalidaObtenerTurnosRefPagoWSDTO();
		ltsotrp_tipoSalidaObtenerTurnosRefPagoWsDto.setIlt_listaTurnoVo(
				TurnoWsDtoConverter.listaEntidadAListaVo(atsotrp_tipoSalidaObtenerTurnosRefPago.getIlt_listaTurnoVo()));
		ltsotrp_tipoSalidaObtenerTurnosRefPagoWsDto
				.setIs_codigoMensaje(atsotrp_tipoSalidaObtenerTurnosRefPago.getIs_codigoMensaje());
		ltsotrp_tipoSalidaObtenerTurnosRefPagoWsDto
				.setIs_descripcionMensaje(atsotrp_tipoSalidaObtenerTurnosRefPago.getIs_descripcionMensaje());
		return ltsotrp_tipoSalidaObtenerTurnosRefPagoWsDto;
	}

	/**
	 * Metodo que convierte de WSDTO a VO ( De Objeto de Transferencia de Datos de
	 * Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto WSDTO manipulado en la capa de negocio, en
	 * una entrada de datos para consumir una operacion de un servicio(objeto VO).
	 * <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoEntradaObtenerTurnosRefPagoWSDTO
	 * <b>a</b> TipoEntradaObtenerTurnosRefPagoVO, <br>
	 * En otras palabras, <b>de</b> Tipo entrada obtener turnos ref pago web service
	 * dto <b>a</b> Tipo entrada obtener turnos ref pago objeto con valores de
	 * servicio.
	 *
	 * @param ateotrp_tipoEntradaObtenerTurnosRefPagoVo el parametro tipo entrada
	 *                                                  obtener turnos ref pago vo
	 * @return Resultado para convertir web service dto a objeto de valores de
	 *         servicio, retornado como TipoEntradaObtenerTurnosRefPagoVO
	 */
	public static TipoEntradaObtenerTurnosRefPagoVO voAEntidad(
			TipoEntradaObtenerTurnosRefPagoWSDTO ateotrp_tipoEntradaObtenerTurnosRefPagoVo) {
		TipoEntradaObtenerTurnosRefPagoVO lteotrp_tipoEntradaObtenerTurnosRefPago = new TipoEntradaObtenerTurnosRefPagoVO();
		lteotrp_tipoEntradaObtenerTurnosRefPago
				.setIs_referenciaPago(ateotrp_tipoEntradaObtenerTurnosRefPagoVo.getIs_referenciaPago());
		return lteotrp_tipoEntradaObtenerTurnosRefPago;
	}
}
