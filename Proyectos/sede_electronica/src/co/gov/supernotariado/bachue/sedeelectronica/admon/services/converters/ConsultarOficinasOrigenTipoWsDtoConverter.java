/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ConsultarOficinasOrigenTipoWsDtoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: ConsultarOficinasOrigenTipoWsDtoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoEntradaConsultarOficinasOrigenTipoVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoSalidaConsultarOficinasOrigenTipoVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarOficinasOrigenTipoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarOficinasOrigenTipoWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Consultar
 * oficinas origen tipo ws dto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ConsultarOficinasOrigenTipoWsDtoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ConsultarOficinasOrigenTipoWsDtoConverter.
	 */
	private ConsultarOficinasOrigenTipoWsDtoConverter() {
		// Constructor vacio de la clase
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaConsultarOficinasOrigenTipoVO
	 * <b>a</b> TipoSalidaConsultarOficinasOrigenTipoWSDTO, <br>
	 * En otras palabras, <b>de</b> Tipo salida consultar oficinas origen tipo
	 * objeto con valores de servicio <b>a</b> Tipo salida consultar oficinas origen
	 * tipo web service dto.
	 *
	 * @param atscoot_tipoSalidaConsultarOficinasOrigenTipoVo el parametro tipo
	 *                                                        salida consultar
	 *                                                        oficinas origen tipo
	 *                                                        vo
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como TipoSalidaConsultarOficinasOrigenTipoWSDTO
	 */
	public static TipoSalidaConsultarOficinasOrigenTipoWSDTO voAWsDto(
			TipoSalidaConsultarOficinasOrigenTipoVO atscoot_tipoSalidaConsultarOficinasOrigenTipoVo) {
		TipoSalidaConsultarOficinasOrigenTipoWSDTO ltscoot_tipoSalidaConsultarOficinasOrigenTipoWsDto = new TipoSalidaConsultarOficinasOrigenTipoWSDTO();
		ltscoot_tipoSalidaConsultarOficinasOrigenTipoWsDto
				.setIlloo_listaOficinaOrigenWsDto(ListaOficinasOrigenWsDtoConverter.listaOvAListaWsDto(
						atscoot_tipoSalidaConsultarOficinasOrigenTipoVo.getIlloo_listaOficinaOrigenVo()));
		ltscoot_tipoSalidaConsultarOficinasOrigenTipoWsDto
				.setIs_codigoMensaje(atscoot_tipoSalidaConsultarOficinasOrigenTipoVo.getIs_codigo());
		ltscoot_tipoSalidaConsultarOficinasOrigenTipoWsDto
				.setIs_descripcionMensaje(atscoot_tipoSalidaConsultarOficinasOrigenTipoVo.getIs_mensaje());
		return ltscoot_tipoSalidaConsultarOficinasOrigenTipoWsDto;
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
	 * TipoEntradaConsultarOficinasOrigenTipoWSDTO <b>a</b>
	 * TipoEntradaConsultarOficinasOrigenTipoVO, <br>
	 * En otras palabras, <b>de</b> Tipo entrada consultar oficinas origen tipo web
	 * service dto <b>a</b> Tipo entrada consultar oficinas origen tipo objeto con
	 * valores de servicio.
	 *
	 * @param atecoot_tipoEntradaConsultarOficinasOrigenTipoWsDto el parametro tipo
	 *                                                            entrada consultar
	 *                                                            oficinas origen
	 *                                                            tipo ws dto
	 * @return Resultado para convertir web service dto a objeto de valores de
	 *         servicio, retornado como TipoEntradaConsultarOficinasOrigenTipoVO
	 */
	public static TipoEntradaConsultarOficinasOrigenTipoVO wsDtoAVo(
			TipoEntradaConsultarOficinasOrigenTipoWSDTO atecoot_tipoEntradaConsultarOficinasOrigenTipoWsDto) {
		TipoEntradaConsultarOficinasOrigenTipoVO ltecoot_tipoEntradaConsultarOficinasOrigenTipoVo = new TipoEntradaConsultarOficinasOrigenTipoVO();
		ltecoot_tipoEntradaConsultarOficinasOrigenTipoVo.setIs_codigoOficinaOrigen(
				atecoot_tipoEntradaConsultarOficinasOrigenTipoWsDto.getIs_codigoOficinaOrigen());
		ltecoot_tipoEntradaConsultarOficinasOrigenTipoVo.setIs_nomParcialOficinaOrigen(
				atecoot_tipoEntradaConsultarOficinasOrigenTipoWsDto.getIs_nomParcialOficinaOrigen());
		ltecoot_tipoEntradaConsultarOficinasOrigenTipoVo
				.setIs_tipoOficinaOrigen(atecoot_tipoEntradaConsultarOficinasOrigenTipoWsDto.getIs_tipoOficinaOrigen());
		return ltecoot_tipoEntradaConsultarOficinasOrigenTipoVo;
	}
}
