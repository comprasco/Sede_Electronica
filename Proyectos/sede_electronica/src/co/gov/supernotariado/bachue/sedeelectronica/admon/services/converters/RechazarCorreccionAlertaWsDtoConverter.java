/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: RechazarCorreccionAlertaWsDtoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: RechazarCorreccionAlertaWsDtoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoEntradaRechazarCorreccionAlertaVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoSalidaRechazarCorreccionAlertaVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaRechazarCorreccionAlertaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaRechazarCorreccionAlertaWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Rechazar
 * correccion alerta ws dto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class RechazarCorreccionAlertaWsDtoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * RechazarCorreccionAlertaWsDtoConverter.
	 */
	private RechazarCorreccionAlertaWsDtoConverter() {
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
	 * Especificamente convierte <b>de</b> TipoEntradaRechazarCorreccionAlertaWSDTO
	 * <b>a</b> TipoEntradaRechazarCorreccionAlertaVO, <br>
	 * En otras palabras, <b>de</b> Tipo entrada rechazar correccion alerta web
	 * service dto <b>a</b> Tipo entrada rechazar correccion alerta objeto con
	 * valores de servicio.
	 *
	 * @param aterca_tipoEntradaRechazarCorreccionAlertaWsDto el parametro tipo
	 *                                                        entrada rechazar
	 *                                                        correccion alerta ws
	 *                                                        dto
	 * @return Resultado para convertir web service dto a objeto de valores de
	 *         servicio, retornado como TipoEntradaRechazarCorreccionAlertaVO
	 */
	public static TipoEntradaRechazarCorreccionAlertaVO wsDtoAVo(
			TipoEntradaRechazarCorreccionAlertaWSDTO aterca_tipoEntradaRechazarCorreccionAlertaWsDto) {
		TipoEntradaRechazarCorreccionAlertaVO lterca_tipoEntradaRechazarCorreccionAlertaVo = new TipoEntradaRechazarCorreccionAlertaVO();

		lterca_tipoEntradaRechazarCorreccionAlertaVo
				.setIi_idAlerta(aterca_tipoEntradaRechazarCorreccionAlertaWsDto.getIi_idAlerta());
		lterca_tipoEntradaRechazarCorreccionAlertaVo
				.setIs_idUsuario(aterca_tipoEntradaRechazarCorreccionAlertaWsDto.getIs_idUsuario());
		lterca_tipoEntradaRechazarCorreccionAlertaVo
				.setIs_texto(aterca_tipoEntradaRechazarCorreccionAlertaWsDto.getIs_texto());

		return lterca_tipoEntradaRechazarCorreccionAlertaVo;
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaRechazarCorreccionAlertaVO
	 * <b>a</b> TipoSalidaRechazarCorreccionAlertaWSDTO, <br>
	 * En otras palabras, <b>de</b> Tipo salida rechazar correccion alerta objeto
	 * con valores de servicio <b>a</b> Tipo salida rechazar correccion alerta web
	 * service dto.
	 *
	 * @param atsrca_tipoSalidaRechazarCorreccionAlertaVo el parametro tipo salida
	 *                                                    rechazar correccion alerta
	 *                                                    vo
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como TipoSalidaRechazarCorreccionAlertaWSDTO
	 */
	public static TipoSalidaRechazarCorreccionAlertaWSDTO voAWsDto(
			TipoSalidaRechazarCorreccionAlertaVO atsrca_tipoSalidaRechazarCorreccionAlertaVo) {
		TipoSalidaRechazarCorreccionAlertaWSDTO ltsrca_tipoSalidaRechazarCorreccionAlertaWsDto = new TipoSalidaRechazarCorreccionAlertaWSDTO();

		ltsrca_tipoSalidaRechazarCorreccionAlertaWsDto
				.setIs_codigoMensaje(atsrca_tipoSalidaRechazarCorreccionAlertaVo.getIs_codigo());
		ltsrca_tipoSalidaRechazarCorreccionAlertaWsDto
				.setIs_descripcionMensaje(atsrca_tipoSalidaRechazarCorreccionAlertaVo.getIs_mensaje());

		return ltsrca_tipoSalidaRechazarCorreccionAlertaWsDto;
	}
}