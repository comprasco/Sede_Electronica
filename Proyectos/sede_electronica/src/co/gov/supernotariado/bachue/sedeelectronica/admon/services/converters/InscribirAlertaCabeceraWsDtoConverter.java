/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: InscribirAlertaCabeceraWsDtoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: InscribirAlertaCabeceraWsDtoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoEntradaInscribirAlertaCabeceraVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoSalidaInscribirAlertaCabeceraVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaInscribirAlertaCabeceraWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaInscribirAlertaCabeceraWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Inscribir alerta
 * cabecera ws dto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class InscribirAlertaCabeceraWsDtoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * InscribirAlertaCabeceraWsDtoConverter.
	 */
	private InscribirAlertaCabeceraWsDtoConverter() {
		// Constructor vacio de la clase
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaInscribirAlertaCabeceraVO
	 * <b>a</b> TipoSalidaInscribirAlertaCabeceraWSDTO, <br>
	 * En otras palabras, <b>de</b> Tipo salida inscribir alerta cabecera objeto con
	 * valores de servicio <b>a</b> Tipo salida inscribir alerta cabecera web
	 * service dto.
	 *
	 * @param atsiac_tipoSalidaInscribirAlertaCabeceraVo el parametro tipo salida
	 *                                                   inscribir alerta cabecera
	 *                                                   vo
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como TipoSalidaInscribirAlertaCabeceraWSDTO
	 */
	public static TipoSalidaInscribirAlertaCabeceraWSDTO voAWsDto(
			TipoSalidaInscribirAlertaCabeceraVO atsiac_tipoSalidaInscribirAlertaCabeceraVo) {
		TipoSalidaInscribirAlertaCabeceraWSDTO ltsiac_tipoSalidaInscribirAlertaCabeceraWsDto = new TipoSalidaInscribirAlertaCabeceraWSDTO();
		ltsiac_tipoSalidaInscribirAlertaCabeceraWsDto
				.setIi_idAlerta(atsiac_tipoSalidaInscribirAlertaCabeceraVo.getIi_idAlerta());
		ltsiac_tipoSalidaInscribirAlertaCabeceraWsDto
				.setIs_codigoMensaje(atsiac_tipoSalidaInscribirAlertaCabeceraVo.getIs_codigo());
		ltsiac_tipoSalidaInscribirAlertaCabeceraWsDto
				.setIs_descripcionMensaje(atsiac_tipoSalidaInscribirAlertaCabeceraVo.getIs_mensaje());
		return ltsiac_tipoSalidaInscribirAlertaCabeceraWsDto;
	}

	/**
	 * Metodo que convierte de WSDTO a VO ( De Objeto de Transferencia de Datos de
	 * Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto WSDTO manipulado en la capa de negocio, en
	 * una entrada de datos para consumir una operacion de un servicio(objeto VO).
	 * <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoEntradaInscribirAlertaCabeceraWSDTO
	 * <b>a</b> TipoEntradaInscribirAlertaCabeceraVO, <br>
	 * En otras palabras, <b>de</b> Tipo entrada inscribir alerta cabecera web
	 * service dto <b>a</b> Tipo entrada inscribir alerta cabecera objeto con
	 * valores de servicio.
	 *
	 * @param ateiac_tipoEntradaInscribirAlertaCabeceraWsDto el parametro tipo
	 *                                                       entrada inscribir
	 *                                                       alerta cabecera ws dto
	 * @return Resultado para convertir web service dto a objeto de valores de
	 *         servicio, retornado como TipoEntradaInscribirAlertaCabeceraVO
	 */
	public static TipoEntradaInscribirAlertaCabeceraVO wsDtoAVo(
			TipoEntradaInscribirAlertaCabeceraWSDTO ateiac_tipoEntradaInscribirAlertaCabeceraWsDto) {
		TipoEntradaInscribirAlertaCabeceraVO lteiac_tipoEntradaInscribirAlertaCabeceraVo = new TipoEntradaInscribirAlertaCabeceraVO();
		lteiac_tipoEntradaInscribirAlertaCabeceraVo
				.setId_fechaDocumento(ateiac_tipoEntradaInscribirAlertaCabeceraWsDto.getId_fechaDocumento());
		lteiac_tipoEntradaInscribirAlertaCabeceraVo.setId_procesoFechaRadicado(
				ateiac_tipoEntradaInscribirAlertaCabeceraWsDto.getId_procesoFechaRadicado());
		lteiac_tipoEntradaInscribirAlertaCabeceraVo
				.setIi_idEntidad(ateiac_tipoEntradaInscribirAlertaCabeceraWsDto.getIi_idEntidad());
		lteiac_tipoEntradaInscribirAlertaCabeceraVo.setIs_codTipoDocumentoPublico(
				ateiac_tipoEntradaInscribirAlertaCabeceraWsDto.getIs_codTipoDocumentoPublico());
		lteiac_tipoEntradaInscribirAlertaCabeceraVo
				.setIs_creadoSNR(ateiac_tipoEntradaInscribirAlertaCabeceraWsDto.getIs_creadoSNR());
		lteiac_tipoEntradaInscribirAlertaCabeceraVo
				.setIs_docIdSGD(ateiac_tipoEntradaInscribirAlertaCabeceraWsDto.getIs_docIdSGD());
		lteiac_tipoEntradaInscribirAlertaCabeceraVo
				.setIs_docNameSGD(ateiac_tipoEntradaInscribirAlertaCabeceraWsDto.getIs_docNameSGD());
		lteiac_tipoEntradaInscribirAlertaCabeceraVo
				.setIs_docNumero(ateiac_tipoEntradaInscribirAlertaCabeceraWsDto.getIs_docNumero());
		lteiac_tipoEntradaInscribirAlertaCabeceraVo
				.setIs_idUsuario(ateiac_tipoEntradaInscribirAlertaCabeceraWsDto.getIs_idUsuario());
		lteiac_tipoEntradaInscribirAlertaCabeceraVo
				.setIs_nitComunidadEtnica(ateiac_tipoEntradaInscribirAlertaCabeceraWsDto.getIs_nitComunidadEtnica());
		lteiac_tipoEntradaInscribirAlertaCabeceraVo
				.setIs_oficinaOrigen(ateiac_tipoEntradaInscribirAlertaCabeceraWsDto.getIs_oficinaOrigen());
		lteiac_tipoEntradaInscribirAlertaCabeceraVo
				.setIs_procesoNroRadicado(ateiac_tipoEntradaInscribirAlertaCabeceraWsDto.getIs_procesoNroRadicado());
		lteiac_tipoEntradaInscribirAlertaCabeceraVo
				.setIs_tipoAlerta(ateiac_tipoEntradaInscribirAlertaCabeceraWsDto.getIs_tipoAlerta());
		return lteiac_tipoEntradaInscribirAlertaCabeceraVo;
	}
}
