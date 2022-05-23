/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: InactivarAlertaTierrasWsDtoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: InactivarAlertaTierrasWsDtoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoEntradaInactivarAlertaVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoSalidaInactivarAlertaVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaInactivarAlertaTierrasWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaInactivarAlertaWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Inactivar alerta
 * tierras ws dto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */

public class InactivarAlertaTierrasWsDtoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * InactivarAlertaTierrasWsDtoConverter.
	 */
	private InactivarAlertaTierrasWsDtoConverter() {
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
	 * Especificamente convierte <b>de</b> TipoEntradaInactivarAlertaTierrasWSDTO
	 * <b>a</b> TipoEntradaInactivarAlertaVO, <br>
	 * En otras palabras, <b>de</b> Tipo entrada inactivar alerta tierras web
	 * service dto <b>a</b> Tipo entrada inactivar alerta objeto con valores de
	 * servicio.
	 *
	 * @param ateiat_tipoEntradaInactivarAlertaWsDto el parametro tipo entrada
	 *                                               inactivar alerta ws dto
	 * @return Resultado para convertir web service dto a objeto de valores de
	 *         servicio, retornado como TipoEntradaInactivarAlertaVO
	 */
	public static TipoEntradaInactivarAlertaVO wsDtoAVo(
			TipoEntradaInactivarAlertaTierrasWSDTO ateiat_tipoEntradaInactivarAlertaWsDto) {
		TipoEntradaInactivarAlertaVO lteia_tipoEntradaInactivarAlerta = new TipoEntradaInactivarAlertaVO();
		lteia_tipoEntradaInactivarAlerta
				.setId_fechaDocumento(ateiat_tipoEntradaInactivarAlertaWsDto.getId_fechaDocumento());
		lteia_tipoEntradaInactivarAlerta.setIi_idAlerta(ateiat_tipoEntradaInactivarAlertaWsDto.getIi_idAlerta());
		lteia_tipoEntradaInactivarAlerta
				.setIs_codTipoDocumentoPublico(ateiat_tipoEntradaInactivarAlertaWsDto.getIs_codTipoDocumentoPublico());
		lteia_tipoEntradaInactivarAlerta.setIs_docIdSGD(ateiat_tipoEntradaInactivarAlertaWsDto.getIs_docIdSGD());
		lteia_tipoEntradaInactivarAlerta.setIs_docNameSGD(ateiat_tipoEntradaInactivarAlertaWsDto.getIs_docNameSGD());
		lteia_tipoEntradaInactivarAlerta.setIs_docNumero(ateiat_tipoEntradaInactivarAlertaWsDto.getIs_docNumero());
		lteia_tipoEntradaInactivarAlerta.setIs_idMotivo(ateiat_tipoEntradaInactivarAlertaWsDto.getIs_idMotivo());
		lteia_tipoEntradaInactivarAlerta
				.setIs_oficinaOrigen(ateiat_tipoEntradaInactivarAlertaWsDto.getIs_oficinaOrigen());
		lteia_tipoEntradaInactivarAlerta
				.setIs_textoInactivacion(ateiat_tipoEntradaInactivarAlertaWsDto.getIs_textoInactivacion());

		return lteia_tipoEntradaInactivarAlerta;
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaInactivarAlertaVO <b>a</b>
	 * TipoSalidaInactivarAlertaWSDTO, <br>
	 * En otras palabras, <b>de</b> Tipo salida inactivar alerta objeto con valores
	 * de servicio <b>a</b> Tipo salida inactivar alerta web service dto.
	 *
	 * @param atsia_tipoSalidaInactivarAlertaVo el parametro tipo salida inactivar
	 *                                          alerta vo
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como TipoSalidaInactivarAlertaWSDTO
	 */
	public static TipoSalidaInactivarAlertaWSDTO voAWsDto(
			TipoSalidaInactivarAlertaVO atsia_tipoSalidaInactivarAlertaVo) {
		TipoSalidaInactivarAlertaWSDTO ltsia_tipoSalidaInactivarAlerta = new TipoSalidaInactivarAlertaWSDTO();
		ltsia_tipoSalidaInactivarAlerta.setIs_codigoMensaje(atsia_tipoSalidaInactivarAlertaVo.getIs_codigo());
		ltsia_tipoSalidaInactivarAlerta.setIs_descripcionMensaje(atsia_tipoSalidaInactivarAlertaVo.getIs_mensaje());
		return ltsia_tipoSalidaInactivarAlerta;
	}
}