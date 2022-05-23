package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import co.gov.supernotariado.bachue.clientebus.vo.poderes.obtenerpoder.TipoEntradaObtenerPoderVO;
import co.gov.supernotariado.bachue.clientebus.vo.poderes.obtenerpoder.TipoSalidaObtenerPoderVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.poderes.TipoEntradaObtenerPoderWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.poderes.TipoSalidaObtenerPoderWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Obtener
 * poder ws dto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ObtenerPoderWsDtoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ObtenerPoderWsDtoConverter.
	 */
	private ObtenerPoderWsDtoConverter() {
		// Constructor vacio de la clase
	}


	public static TipoEntradaObtenerPoderVO wsDtoAVo(
			TipoEntradaObtenerPoderWSDTO ateop_tipoEntradaActualizarMetadatosPoder) {
		TipoEntradaObtenerPoderVO lteop_tipoEntradaPoder = new TipoEntradaObtenerPoderVO();
		lteop_tipoEntradaPoder.setIs_dDocName(ateop_tipoEntradaActualizarMetadatosPoder.getIs_dDocName());
		lteop_tipoEntradaPoder.setIs_did(ateop_tipoEntradaActualizarMetadatosPoder.getIs_did());
		return lteop_tipoEntradaPoder;
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaObtenerPoderWSDTO
	 * <b>a</b> TipoSalidaObtenerPoderWSDTO, <br>
	 * En otras palabras, <b>de</b> Tipo salida obtener poder objeto
	 * con valores de servicio <b>a</b> Tipo salida obtener poder web
	 * service dto.
	 *
	 * @param atsop_obtenerPoder el parametro tipo salida
	 *                           obtener poder vo
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como TipoSalidaObtenerPoderWSDTO
	 */
	public static TipoSalidaObtenerPoderWSDTO voAWsDto(TipoSalidaObtenerPoderVO atsop_obtenerPoder) {
		TipoSalidaObtenerPoderWSDTO ltsop_tipoSalidaObtenerPoderVO = new TipoSalidaObtenerPoderWSDTO();

		ltsop_tipoSalidaObtenerPoderVO.setIb_archivo(atsop_obtenerPoder.getIb_archivo());
		ltsop_tipoSalidaObtenerPoderVO.setIi_codigoMensaje(atsop_obtenerPoder.getIi_codigoMensaje());
		ltsop_tipoSalidaObtenerPoderVO.setIs_descripcionMensaje(atsop_obtenerPoder.getIs_descripcionMensaje());

		return ltsop_tipoSalidaObtenerPoderVO;
	}

}
