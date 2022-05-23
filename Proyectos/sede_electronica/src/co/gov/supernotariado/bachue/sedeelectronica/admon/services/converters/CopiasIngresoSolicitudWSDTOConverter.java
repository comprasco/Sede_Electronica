/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: CopiasIngresoSolicitudWSDTOConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: CopiasIngresoSolicitudWSDTOConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.vo.solicitudcopias.DocumentoSGDVO;
import co.gov.supernotariado.bachue.clientebus.vo.solicitudcopias.TipoEntradaIngresoSolicitudVO;
import co.gov.supernotariado.bachue.clientebus.vo.solicitudcopias.TipoSalidaIngresoSolicitudVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.DocumentoSGDWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaIngresoSolicitudCopiasWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaIngresoSolicitudCopiasWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Copias ingreso
 * solicitud WSDTO. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class CopiasIngresoSolicitudWSDTOConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * CopiasIngresoSolicitudWSDTOConverter.
	 */
	private CopiasIngresoSolicitudWSDTOConverter() {
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
	 * Especificamente convierte <b>de</b> TipoEntradaIngresoSolicitudCopiasWSDTO
	 * <b>a</b> TipoEntradaIngresoSolicitudVO, <br>
	 * En otras palabras, <b>de</b> Tipo entrada ingreso solicitud copias web
	 * service dto <b>a</b> Tipo entrada ingreso solicitud objeto con valores de
	 * servicio.
	 *
	 * @param ateisc_tipoEntradaIngresoSolicitudCopiasWsDto el parametro tipo
	 *                                                      entrada ingreso
	 *                                                      solicitud copias ws dto
	 * @return Resultado para convertir web service dto a objeto de valores de
	 *         servicio, retornado como TipoEntradaIngresoSolicitudVO
	 */
	public static TipoEntradaIngresoSolicitudVO wsDtoAVo(
			TipoEntradaIngresoSolicitudCopiasWSDTO ateisc_tipoEntradaIngresoSolicitudCopiasWsDto) {
		TipoEntradaIngresoSolicitudVO lteis_tipoEntradaIngresoSolicitudVo = new TipoEntradaIngresoSolicitudVO();
		lteis_tipoEntradaIngresoSolicitudVo.setIld_listaDocumentoSgdVo(
				convertirDocumento(ateisc_tipoEntradaIngresoSolicitudCopiasWsDto.getIld_documentoSgdWsDto()));
		return lteis_tipoEntradaIngresoSolicitudVo;
	}

	/**
	 * Metodo que convierte de una lista de WSDTO a una lista de VO ( De Objetos de
	 * Transferencia de Datos de Servicio Web, a Objetos de valores de
	 * Servicio).<br>
	 * Se usa para convertir una lista de objetos WSDTO manipulados en la capa de
	 * negocio, en una lista de entrada de datos para consumir una operacion de un
	 * servicio(objetos VO). <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> DocumentoSGDWSDTO <b>a</b>
	 * DocumentoSGDVO, <br>
	 * En otras palabras, <b>de</b> Documento SGDWSDTO <b>a</b> Documento SGDVO.
	 *
	 * @param ald_documentoSgdWsDto el parametro documento sgd ws dto
	 * @return Resultado para convertir de lista de web service dto a lista de
	 *         valores de servicio, retornado como una lista de DocumentoSGDVO
	 */
	private static List<DocumentoSGDVO> convertirDocumento(List<DocumentoSGDWSDTO> ald_documentoSgdWsDto) {
		List<DocumentoSGDVO> llds_documentosSgdVo = new ArrayList<>();
		for (DocumentoSGDWSDTO ld_documentoSgdWsDto : ald_documentoSgdWsDto) {
			DocumentoSGDVO ld_documetnoSgdVo = new DocumentoSGDVO();
			ld_documetnoSgdVo.setIs_dId(ld_documentoSgdWsDto.getIs_dId());
			ld_documetnoSgdVo.setIs_docName(ld_documentoSgdWsDto.getIs_docName());
			ld_documetnoSgdVo.setIs_tipoDocumental(ld_documentoSgdWsDto.getIs_tipoDocumental());
			llds_documentosSgdVo.add(ld_documetnoSgdVo);
		}
		return llds_documentosSgdVo;
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaIngresoSolicitudVO <b>a</b>
	 * TipoSalidaIngresoSolicitudCopiasWSDTO, <br>
	 * En otras palabras, <b>de</b> Tipo salida ingreso solicitud objeto con valores
	 * de servicio <b>a</b> Tipo salida ingreso solicitud copias web service dto.
	 *
	 * @param atsis_tipoSalidaIngresoSolicitudVo el parametro tipo salida ingreso
	 *                                           solicitud vo
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como TipoSalidaIngresoSolicitudCopiasWSDTO
	 */
	public static TipoSalidaIngresoSolicitudCopiasWSDTO voAWsDto(
			TipoSalidaIngresoSolicitudVO atsis_tipoSalidaIngresoSolicitudVo) {
		TipoSalidaIngresoSolicitudCopiasWSDTO ltsisc_tipoSalidaIngresoSolicitudCopiasWsDto = new TipoSalidaIngresoSolicitudCopiasWSDTO();
		ltsisc_tipoSalidaIngresoSolicitudCopiasWsDto.setIs_codigo(atsis_tipoSalidaIngresoSolicitudVo.getIs_codigo());
		ltsisc_tipoSalidaIngresoSolicitudCopiasWsDto
				.setIs_idSolicitudCopias(atsis_tipoSalidaIngresoSolicitudVo.getIs_idSolicitudCopias());
		ltsisc_tipoSalidaIngresoSolicitudCopiasWsDto.setIs_mensaje(atsis_tipoSalidaIngresoSolicitudVo.getIs_mensaje());
		return ltsisc_tipoSalidaIngresoSolicitudCopiasWsDto;
	}
}
