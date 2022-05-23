/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ConsultarMapaPredioInfoCatastralWsDtoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: ConsultarMapaPredioInfoCatastralWsDtoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoEntradaConsultarMapaPredioInfoCatastralVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoSalidaConsultarMapaPredioInfoCatastralVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarMapaPredioInfoCatastralWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarMapaPredioInfoCatastralWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Consultar mapa
 * predio info catastral ws dto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ConsultarMapaPredioInfoCatastralWsDtoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ConsultarMapaPredioInfoCatastralWsDtoConverter.
	 */
	private ConsultarMapaPredioInfoCatastralWsDtoConverter() {
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
	 * Especificamente convierte <b>de</b>
	 * TipoEntradaConsultarMapaPredioInfoCatastralWSDTO <b>a</b>
	 * TipoEntradaConsultarMapaPredioInfoCatastralVO, <br>
	 * En otras palabras, <b>de</b> Tipo entrada consultar mapa predio info
	 * catastral web service dto <b>a</b> Tipo entrada consultar mapa predio info
	 * catastral objeto con valores de servicio.
	 *
	 * @param atecmpic_tipoEntradaConsultarMapaPredioInfoCatastralWsDto el parametro
	 *                                                                  tipo entrada
	 *                                                                  consultar
	 *                                                                  mapa predio
	 *                                                                  info
	 *                                                                  catastral ws
	 *                                                                  dto
	 * @return Resultado para convertir web service dto a objeto de valores de
	 *         servicio, retornado como
	 *         TipoEntradaConsultarMapaPredioInfoCatastralVO
	 */
	public static TipoEntradaConsultarMapaPredioInfoCatastralVO wsDtoAVo(
			TipoEntradaConsultarMapaPredioInfoCatastralWSDTO atecmpic_tipoEntradaConsultarMapaPredioInfoCatastralWsDto) {
		TipoEntradaConsultarMapaPredioInfoCatastralVO ltecmpic_tipoEntradaConsultarMapaPredioInfoCatastral = new TipoEntradaConsultarMapaPredioInfoCatastralVO();
		ltecmpic_tipoEntradaConsultarMapaPredioInfoCatastral.setIs_numeroCatastral(
				atecmpic_tipoEntradaConsultarMapaPredioInfoCatastralWsDto.getIs_numeroCatastral());
		return ltecmpic_tipoEntradaConsultarMapaPredioInfoCatastral;
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b>
	 * TipoSalidaConsultarMapaPredioInfoCatastralVO <b>a</b>
	 * TipoSalidaConsultarMapaPredioInfoCatastralWSDTO, <br>
	 * En otras palabras, <b>de</b> Tipo salida consultar mapa predio info catastral
	 * objeto con valores de servicio <b>a</b> Tipo salida consultar mapa predio
	 * info catastral web service dto.
	 *
	 * @param atscmpic_tipoSalidaConsultarDocumentoAlertaVo el parametro tipo salida
	 *                                                      consultar documento
	 *                                                      alerta vo
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como TipoSalidaConsultarMapaPredioInfoCatastralWSDTO
	 */
	public static TipoSalidaConsultarMapaPredioInfoCatastralWSDTO voAWsDto(
			TipoSalidaConsultarMapaPredioInfoCatastralVO atscmpic_tipoSalidaConsultarDocumentoAlertaVo) {
		TipoSalidaConsultarMapaPredioInfoCatastralWSDTO ltscmpic_tipoSalidaConsultarMapaPredioInfoCatastralWsDto = new TipoSalidaConsultarMapaPredioInfoCatastralWSDTO();
		ltscmpic_tipoSalidaConsultarMapaPredioInfoCatastralWsDto
				.setIs_codigoMensaje(atscmpic_tipoSalidaConsultarDocumentoAlertaVo.getIs_codigo());
		ltscmpic_tipoSalidaConsultarMapaPredioInfoCatastralWsDto
				.setIs_descripcionMensaje(atscmpic_tipoSalidaConsultarDocumentoAlertaVo.getIs_mensaje());
		ltscmpic_tipoSalidaConsultarMapaPredioInfoCatastralWsDto
				.setIs_png(atscmpic_tipoSalidaConsultarDocumentoAlertaVo.getIs_png());
		return ltscmpic_tipoSalidaConsultarMapaPredioInfoCatastralWsDto;
	}

}
