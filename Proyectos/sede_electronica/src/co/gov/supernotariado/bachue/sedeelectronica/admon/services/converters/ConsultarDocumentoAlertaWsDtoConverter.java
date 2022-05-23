/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ConsultarDocumentoAlertaWsDtoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: ConsultarDocumentoAlertaWsDtoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoEntradaConsultarDocumentoAlertaVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoSalidaConsultarDocumentoAlertaVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarDocumentoAlertaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarDocumentoAlertaWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Consultar
 * documento alerta ws dto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ConsultarDocumentoAlertaWsDtoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ConsultarDocumentoAlertaWsDtoConverter.
	 */
	private ConsultarDocumentoAlertaWsDtoConverter() {
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
	 * Especificamente convierte <b>de</b> TipoEntradaConsultarDocumentoAlertaWSDTO
	 * <b>a</b> TipoEntradaConsultarDocumentoAlertaVO, <br>
	 * En otras palabras, <b>de</b> Tipo entrada consultar documento alerta web
	 * service dto <b>a</b> Tipo entrada consultar documento alerta objeto con
	 * valores de servicio.
	 *
	 * @param atecda_tipoEntradaConsultarDocumentoAlertaWSDTO el parametro tipo
	 *                                                        entrada consultar
	 *                                                        documento alerta WSDTO
	 * @return Resultado para convertir web service dto a objeto de valores de
	 *         servicio, retornado como TipoEntradaConsultarDocumentoAlertaVO
	 */
	public static TipoEntradaConsultarDocumentoAlertaVO wsDtoAVo(
			TipoEntradaConsultarDocumentoAlertaWSDTO atecda_tipoEntradaConsultarDocumentoAlertaWSDTO) {
		TipoEntradaConsultarDocumentoAlertaVO ltecda_tipoEntradaConsultarDocumentoAlerta = new TipoEntradaConsultarDocumentoAlertaVO();
		ltecda_tipoEntradaConsultarDocumentoAlerta
				.setIs_oficinaOrigen(atecda_tipoEntradaConsultarDocumentoAlertaWSDTO.getIs_oficinaOrigen());
		ltecda_tipoEntradaConsultarDocumentoAlerta.setIs_codTipoDocumentoPulico(
				atecda_tipoEntradaConsultarDocumentoAlertaWSDTO.getIs_codTipoDocumentoPublico());
		ltecda_tipoEntradaConsultarDocumentoAlerta
				.setId_fechaDocumento(atecda_tipoEntradaConsultarDocumentoAlertaWSDTO.getId_fechaDocumento());
		ltecda_tipoEntradaConsultarDocumentoAlerta
				.setIs_docNumero(atecda_tipoEntradaConsultarDocumentoAlertaWSDTO.getIs_docNumero());
		return ltecda_tipoEntradaConsultarDocumentoAlerta;
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaConsultarDocumentoAlertaVO
	 * <b>a</b> TipoSalidaConsultarDocumentoAlertaWSDTO, <br>
	 * En otras palabras, <b>de</b> Tipo salida consultar documento alerta objeto
	 * con valores de servicio <b>a</b> Tipo salida consultar documento alerta web
	 * service dto.
	 *
	 * @param atscda_tipoSalidaConsultarDocumentoAlertaVo el parametro tipo salida
	 *                                                    consultar documento alerta
	 *                                                    vo
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como TipoSalidaConsultarDocumentoAlertaWSDTO
	 */
	public static TipoSalidaConsultarDocumentoAlertaWSDTO voAWsDto(
			TipoSalidaConsultarDocumentoAlertaVO atscda_tipoSalidaConsultarDocumentoAlertaVo) {
		TipoSalidaConsultarDocumentoAlertaWSDTO ltscda_tipoSalidaConsultarDocumentoAlertaWSDTO = new TipoSalidaConsultarDocumentoAlertaWSDTO();
		ltscda_tipoSalidaConsultarDocumentoAlertaWSDTO
				.setIs_codigoMensaje(atscda_tipoSalidaConsultarDocumentoAlertaVo.getIs_codigo());
		ltscda_tipoSalidaConsultarDocumentoAlertaWSDTO
				.setIs_descripcionMensaje(atscda_tipoSalidaConsultarDocumentoAlertaVo.getIs_mensaje());
		return ltscda_tipoSalidaConsultarDocumentoAlertaWSDTO;
	}

}
