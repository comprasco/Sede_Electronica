/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ConsultarAlertaTarifaWsDtoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: ConsultarAlertaTarifaWsDtoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import co.gov.supernotariado.bachue.clientebus.vo.gestionalertastitulares.TipoEntradaConsultarTarifaAlertasTitularesVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestionalertastitulares.TipoSalidaConsultarTarifaAlertasTitularesVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarTarifaAlertasTitularesWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarTarifaAlertasTitularesWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Consultar alerta
 * tarifa ws dto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ConsultarAlertaTarifaWsDtoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ConsultarAlertaTarifaWsDtoConverter.
	 */
	private ConsultarAlertaTarifaWsDtoConverter() {
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
	 * TipoEntradaConsultarTarifaAlertasTitularesWSDTO <b>a</b>
	 * TipoEntradaConsultarTarifaAlertasTitularesVO, <br>
	 * En otras palabras, <b>de</b> Tipo entrada consultar tarifa alertas titulares
	 * web service dto <b>a</b> Tipo entrada consultar tarifa alertas titulares
	 * objeto con valores de servicio.
	 *
	 * @param atectat_tipoEntradaConsultarTarifaAlertasTitularesWSDTO el parametro
	 *                                                                tipo entrada
	 *                                                                consultar
	 *                                                                tarifa alertas
	 *                                                                titulares
	 *                                                                WSDTO
	 * @return Resultado para convertir web service dto a objeto de valores de
	 *         servicio, retornado como TipoEntradaConsultarTarifaAlertasTitularesVO
	 */
	public static TipoEntradaConsultarTarifaAlertasTitularesVO voAEntidad(
			TipoEntradaConsultarTarifaAlertasTitularesWSDTO atectat_tipoEntradaConsultarTarifaAlertasTitularesWSDTO) {
		TipoEntradaConsultarTarifaAlertasTitularesVO ltectat_tipoEntradaConsultarTarifaAlertasTitulares = new TipoEntradaConsultarTarifaAlertasTitularesVO();
		ltectat_tipoEntradaConsultarTarifaAlertasTitulares
				.setIs_modulo(atectat_tipoEntradaConsultarTarifaAlertasTitularesWSDTO.getIs_modulo());
		ltectat_tipoEntradaConsultarTarifaAlertasTitulares.setIs_cantidadAlertasNuevas(
				atectat_tipoEntradaConsultarTarifaAlertasTitularesWSDTO.getIs_cantidadAlertasNuevas());
		ltectat_tipoEntradaConsultarTarifaAlertasTitulares
				.setIs_numeroDocumento(atectat_tipoEntradaConsultarTarifaAlertasTitularesWSDTO.getIs_numeroDocumento());
		ltectat_tipoEntradaConsultarTarifaAlertasTitulares
				.setIs_tipoDocumento(atectat_tipoEntradaConsultarTarifaAlertasTitularesWSDTO.getIs_tipoDocumento());
		return ltectat_tipoEntradaConsultarTarifaAlertasTitulares;
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b>
	 * TipoSalidaConsultarTarifaAlertasTitularesVO <b>a</b>
	 * TipoSalidaConsultarTarifaAlertasTitularesWSDTO, <br>
	 * En otras palabras, <b>de</b> Tipo salida consultar tarifa alertas titulares
	 * objeto con valores de servicio <b>a</b> Tipo salida consultar tarifa alertas
	 * titulares web service dto.
	 *
	 * @param atsctat_tipoSalidaConsultarTarifaAlertasTitularesVo el parametro tipo
	 *                                                            salida consultar
	 *                                                            tarifa alertas
	 *                                                            titulares vo
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como TipoSalidaConsultarTarifaAlertasTitularesWSDTO
	 */
	public static TipoSalidaConsultarTarifaAlertasTitularesWSDTO entidadAVo(
			TipoSalidaConsultarTarifaAlertasTitularesVO atsctat_tipoSalidaConsultarTarifaAlertasTitularesVo) {
		TipoSalidaConsultarTarifaAlertasTitularesWSDTO ltsctat_tipoSalidaConsultarTarifaAlertasTitularesWSDTO = new TipoSalidaConsultarTarifaAlertasTitularesWSDTO();
		ltsctat_tipoSalidaConsultarTarifaAlertasTitularesWSDTO
				.setIs_codigoMensaje(atsctat_tipoSalidaConsultarTarifaAlertasTitularesVo.getIs_codigoMensaje());
		ltsctat_tipoSalidaConsultarTarifaAlertasTitularesWSDTO.setIs_descripcionMensaje(
				atsctat_tipoSalidaConsultarTarifaAlertasTitularesVo.getIs_descripcionMensaje());
		ltsctat_tipoSalidaConsultarTarifaAlertasTitularesWSDTO.setIlt_listaTarifaWsDto(TarifaWSDTOConverter
				.listaEntidadAListaWsDto(atsctat_tipoSalidaConsultarTarifaAlertasTitularesVo.getIlt_listaTarifaVo()));
		ltsctat_tipoSalidaConsultarTarifaAlertasTitularesWSDTO
				.setIs_alertasInscrtitas(atsctat_tipoSalidaConsultarTarifaAlertasTitularesVo.getIs_alertasInscrtitas());
		ltsctat_tipoSalidaConsultarTarifaAlertasTitularesWSDTO.setIs_tarifaNuevasAlertas(
				atsctat_tipoSalidaConsultarTarifaAlertasTitularesVo.getIs_tarifaNuevasAlertas());
		return ltsctat_tipoSalidaConsultarTarifaAlertasTitularesWSDTO;
	}
}
