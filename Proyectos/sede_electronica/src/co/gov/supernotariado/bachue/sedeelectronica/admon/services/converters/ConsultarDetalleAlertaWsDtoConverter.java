/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ConsultarDetalleAlertaWsDtoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: ConsultarDetalleAlertaWsDtoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.InactivacionVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoEntradaConsultarDetalleAlertaVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoSalidaConsultarDetalleAlertaVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.InactivacionWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarDetalleAlertaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarDetalleAlertaWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Consultar
 * detalle alerta ws dto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ConsultarDetalleAlertaWsDtoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ConsultarDetalleAlertaWsDtoConverter.
	 */
	private ConsultarDetalleAlertaWsDtoConverter() {
		// Constructor vacio de la clase
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaConsultarDetalleAlertaVO
	 * <b>a</b> TipoSalidaConsultarDetalleAlertaWSDTO, <br>
	 * En otras palabras, <b>de</b> Tipo salida consultar detalle alerta objeto con
	 * valores de servicio <b>a</b> Tipo salida consultar detalle alerta web service
	 * dto.
	 *
	 * @param atscda_tipoSalidaConsultarDetalleAlertaVo el parametro tipo salida
	 *                                                  consultar detalle alerta vo
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como TipoSalidaConsultarDetalleAlertaWSDTO
	 */
	public static TipoSalidaConsultarDetalleAlertaWSDTO voAWsDto(
			TipoSalidaConsultarDetalleAlertaVO atscda_tipoSalidaConsultarDetalleAlertaVo) {
		TipoSalidaConsultarDetalleAlertaWSDTO ltscda_tipoSalidaConsultarDetalleAlertaWsDto = new TipoSalidaConsultarDetalleAlertaWSDTO();
		ltscda_tipoSalidaConsultarDetalleAlertaWsDto
				.setId_docNameSGD(atscda_tipoSalidaConsultarDetalleAlertaVo.getId_docNameSGD());
		ltscda_tipoSalidaConsultarDetalleAlertaWsDto
				.setId_fechaDocumento(atscda_tipoSalidaConsultarDetalleAlertaVo.getId_fechaDocumento());
		ltscda_tipoSalidaConsultarDetalleAlertaWsDto.setId_fechaInactivacionAlerta(
				atscda_tipoSalidaConsultarDetalleAlertaVo.getId_fechaInactivacionAlerta());
		ltscda_tipoSalidaConsultarDetalleAlertaWsDto
				.setId_procesoFechaRadicado(atscda_tipoSalidaConsultarDetalleAlertaVo.getId_procesoFechaRadicado());
		ltscda_tipoSalidaConsultarDetalleAlertaWsDto.setIli_inactivacionWsDto(
				inactivoVoAInactivo(atscda_tipoSalidaConsultarDetalleAlertaVo.getIi_inactivacionVo()));
		ltscda_tipoSalidaConsultarDetalleAlertaWsDto
				.setIllag_listaAlertasGeneradasWsDto(ListaAlertasGeneradasWsDtoConverter.listaVOAListaWsDto(
						atscda_tipoSalidaConsultarDetalleAlertaVo.getIllag_listaAlertasGeneradasVo()));
		ltscda_tipoSalidaConsultarDetalleAlertaWsDto
				.setIllm_listaMatriculasWsDto(ListaMatriculasDetalleAlertasWsDtoConverter
						.listaWsDtoAListaVo(atscda_tipoSalidaConsultarDetalleAlertaVo.getIllmda_listaMatriculasVo()));
		ltscda_tipoSalidaConsultarDetalleAlertaWsDto
				.setIlpas_procesoDetalleAWsDto(ProcesoASConsultaDetalleAlertaWsDtoConverter
						.listaVOAListaWsDto(atscda_tipoSalidaConsultarDetalleAlertaVo.getIlpas_procesoDetalleAVo()));
		ltscda_tipoSalidaConsultarDetalleAlertaWsDto
				.setIs_codigoMensaje(atscda_tipoSalidaConsultarDetalleAlertaVo.getIs_codigo());
		ltscda_tipoSalidaConsultarDetalleAlertaWsDto
				.setIs_creadoSNR(atscda_tipoSalidaConsultarDetalleAlertaVo.getIs_creadoSNR());
		ltscda_tipoSalidaConsultarDetalleAlertaWsDto
				.setIs_docIdSGD(atscda_tipoSalidaConsultarDetalleAlertaVo.getIs_docIdSGD());
		ltscda_tipoSalidaConsultarDetalleAlertaWsDto
				.setIs_docNumero(atscda_tipoSalidaConsultarDetalleAlertaVo.getIs_docNumero());
		ltscda_tipoSalidaConsultarDetalleAlertaWsDto
				.setIs_estado(atscda_tipoSalidaConsultarDetalleAlertaVo.getIs_estado());
		ltscda_tipoSalidaConsultarDetalleAlertaWsDto
				.setIs_descripcionMensaje(atscda_tipoSalidaConsultarDetalleAlertaVo.getIs_mensaje());
		ltscda_tipoSalidaConsultarDetalleAlertaWsDto
				.setIs_nitComunidadEtnica(atscda_tipoSalidaConsultarDetalleAlertaVo.getIs_nitComunidadEtnica());
		ltscda_tipoSalidaConsultarDetalleAlertaWsDto
				.setIs_nombreEntidad(atscda_tipoSalidaConsultarDetalleAlertaVo.getIs_nombreEntidad());
		ltscda_tipoSalidaConsultarDetalleAlertaWsDto
				.setIs_nomOficinaOrigen(atscda_tipoSalidaConsultarDetalleAlertaVo.getIs_nomOficinaOrigen());
		ltscda_tipoSalidaConsultarDetalleAlertaWsDto.setIs_nomTipoDocumentoPublico(
				atscda_tipoSalidaConsultarDetalleAlertaVo.getIs_nomTipoDocumentoPublico());
		ltscda_tipoSalidaConsultarDetalleAlertaWsDto
				.setIs_procesoNroRadicado(atscda_tipoSalidaConsultarDetalleAlertaVo.getIs_procesoNroRadicado());
		ltscda_tipoSalidaConsultarDetalleAlertaWsDto
				.setIs_tipoAlerta(atscda_tipoSalidaConsultarDetalleAlertaVo.getIs_tipoAlerta());
		return ltscda_tipoSalidaConsultarDetalleAlertaWsDto;
	}

	/**
	 * Metodo que convierte de WSDTO a VO ( De Objeto de Transferencia de Datos de
	 * Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto WSDTO manipulado en la capa de negocio, en
	 * una entrada de datos para consumir una operacion de un servicio(objeto VO).
	 * <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoEntradaConsultarDetalleAlertaWSDTO
	 * <b>a</b> TipoEntradaConsultarDetalleAlertaVO, <br>
	 * En otras palabras, <b>de</b> Tipo entrada consultar detalle alerta web
	 * service dto <b>a</b> Tipo entrada consultar detalle alerta objeto con valores
	 * de servicio.
	 *
	 * @param atecda_tipoEntradaConsultarDetalleAlertaWsDto el parametro tipo
	 *                                                      entrada consultar
	 *                                                      detalle alerta ws dto
	 * @return Resultado para convertir web service dto a objeto de valores de
	 *         servicio, retornado como TipoEntradaConsultarDetalleAlertaVO
	 */
	public static TipoEntradaConsultarDetalleAlertaVO wsDtoAVo(
			TipoEntradaConsultarDetalleAlertaWSDTO atecda_tipoEntradaConsultarDetalleAlertaWsDto) {
		TipoEntradaConsultarDetalleAlertaVO ltecda_tipoEntradaConsultarDetalleAlertaVo = new TipoEntradaConsultarDetalleAlertaVO();
		ltecda_tipoEntradaConsultarDetalleAlertaVo
				.setIi_idAlerta(atecda_tipoEntradaConsultarDetalleAlertaWsDto.getIi_idAlerta());
		return ltecda_tipoEntradaConsultarDetalleAlertaVo;
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> InactivacionVO <b>a</b>
	 * InactivacionWSDTO, <br>
	 * En otras palabras, <b>de</b> Inactivacion objeto con valores de servicio
	 * <b>a</b> Inactivacion web service dto.
	 *
	 * @param ai_inactivacionVo el parametro inactivacion vo
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como InactivacionWSDTO
	 */
	private static InactivacionWSDTO inactivoVoAInactivo(InactivacionVO ai_inactivacionVo) {
		InactivacionWSDTO li_inactivacionWsDto = new InactivacionWSDTO();
		li_inactivacionWsDto.setId_fechaDocumento(ai_inactivacionVo.getId_fechaDocumento());
		li_inactivacionWsDto.setIs_docIdSGD(ai_inactivacionVo.getIs_docIdSGD());
		li_inactivacionWsDto.setIs_docNameSGD(ai_inactivacionVo.getIs_docNameSGD());
		li_inactivacionWsDto.setIs_docNumero(ai_inactivacionVo.getIs_docNumero());
		li_inactivacionWsDto.setIs_motivoInactivacion(ai_inactivacionVo.getIs_motivoInactivacion());
		li_inactivacionWsDto.setIs_nomOficinaOrigen(ai_inactivacionVo.getIs_nomOficinaOrigen());
		li_inactivacionWsDto.setIs_nomTipoDocumentoPublico(ai_inactivacionVo.getIs_nomTipoDocumentoPublico());
		li_inactivacionWsDto.setIs_textoInactivacion(ai_inactivacionVo.getIs_textoInactivacion());
		return li_inactivacionWsDto;
	}
}
