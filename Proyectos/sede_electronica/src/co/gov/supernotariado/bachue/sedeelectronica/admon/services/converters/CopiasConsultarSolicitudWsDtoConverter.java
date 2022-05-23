/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: CopiasConsultarSolicitudWsDtoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: CopiasConsultarSolicitudWsDtoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import co.gov.supernotariado.bachue.clientebus.vo.solicitudcopias.TipoEntradaConsultarSolicitudVO;
import co.gov.supernotariado.bachue.clientebus.vo.solicitudcopias.TipoSalidaConsultarSolicitudVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarSolicitudWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarSolicitudWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Copias consultar
 * solicitud ws dto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class CopiasConsultarSolicitudWsDtoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * CopiasConsultarSolicitudWsDtoConverter.
	 */
	private CopiasConsultarSolicitudWsDtoConverter() {
		// Constructor vacio de la clase
	}

	/**
	 * Metodo que convierte de WSDTO a VO ( De Objeto de Transferencia de Datos de
	 * Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto WSDTO manipulado en la capa de negocio, en
	 * una entrada de datos para consumir una operacion de un servicio(objeto VO).
	 * <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoEntradaConsultarSolicitudWSDTO
	 * <b>a</b> TipoEntradaConsultarSolicitudVO, <br>
	 * En otras palabras, <b>de</b> Tipo entrada consultar solicitud web service dto
	 * <b>a</b> Tipo entrada consultar solicitud objeto con valores de servicio.
	 *
	 * @param atecs_tipoEntradaConsultarSolicitudWsDto el parametro tipo entrada
	 *                                                 consultar solicitud ws dto
	 * @return Resultado para convertir web service dto a objeto de valores de
	 *         servicio, retornado como TipoEntradaConsultarSolicitudVO
	 */
	public static TipoEntradaConsultarSolicitudVO wsDtoAVo(
			TipoEntradaConsultarSolicitudWSDTO atecs_tipoEntradaConsultarSolicitudWsDto) {
		TipoEntradaConsultarSolicitudVO ltecs_tipoEntradaConsultarSolicitudVo = new TipoEntradaConsultarSolicitudVO();
		ltecs_tipoEntradaConsultarSolicitudVo.setIs_nir(atecs_tipoEntradaConsultarSolicitudWsDto.getIs_nir());
		return ltecs_tipoEntradaConsultarSolicitudVo;
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaConsultarSolicitudVO <b>a</b>
	 * TipoSalidaConsultarSolicitudWSDTO, <br>
	 * En otras palabras, <b>de</b> Tipo salida consultar solicitud objeto con
	 * valores de servicio <b>a</b> Tipo salida consultar solicitud web service dto.
	 *
	 * @param atscs_tipoSalidaConsultarSolicitudVo el parametro tipo salida
	 *                                             consultar solicitud vo
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como TipoSalidaConsultarSolicitudWSDTO
	 */
	public static TipoSalidaConsultarSolicitudWSDTO voAWsDto(
			TipoSalidaConsultarSolicitudVO atscs_tipoSalidaConsultarSolicitudVo) {
		TipoSalidaConsultarSolicitudWSDTO ltscs_tipoSalidaConsultarSolicitudWsDto = new TipoSalidaConsultarSolicitudWSDTO();
		ltscs_tipoSalidaConsultarSolicitudWsDto
				.setId_fechaLiquidacion(atscs_tipoSalidaConsultarSolicitudVo.getId_fechaLiquidacion());
		ltscs_tipoSalidaConsultarSolicitudWsDto
				.setId_fechaVencimientoPago(atscs_tipoSalidaConsultarSolicitudVo.getId_fechaVencimientoPago());
		ltscs_tipoSalidaConsultarSolicitudWsDto.setIs_codigo(atscs_tipoSalidaConsultarSolicitudVo.getIs_codigo());
		ltscs_tipoSalidaConsultarSolicitudWsDto.setIs_estado(atscs_tipoSalidaConsultarSolicitudVo.getIs_estado());
		ltscs_tipoSalidaConsultarSolicitudWsDto.setIs_mensaje(atscs_tipoSalidaConsultarSolicitudVo.getIs_mensaje());
		ltscs_tipoSalidaConsultarSolicitudWsDto
				.setIs_referenciaPago(atscs_tipoSalidaConsultarSolicitudVo.getIs_referenciaPago());
		ltscs_tipoSalidaConsultarSolicitudWsDto.setIs_valorPago(atscs_tipoSalidaConsultarSolicitudVo.getIs_valorPago());
		return ltscs_tipoSalidaConsultarSolicitudWsDto;
	}
}
