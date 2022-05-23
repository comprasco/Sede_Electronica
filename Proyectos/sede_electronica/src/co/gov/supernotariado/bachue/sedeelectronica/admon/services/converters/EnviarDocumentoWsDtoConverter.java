/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnviarDocumentoWsDtoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: EnviarDocumentoWsDtoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.vo.enviardocumentos.TipoEntradaEnviarDocumentoVO;
import co.gov.supernotariado.bachue.clientebus.vo.enviardocumentos.TipoParametroVO;
import co.gov.supernotariado.bachue.clientebus.vo.enviardocumentos.TipoSalidaEnviarDocumentoVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaEnviarDocumentoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoParametroWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaEnviarDocumentoWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Enviar documento
 * ws dto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class EnviarDocumentoWsDtoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * EnviarDocumentoWsDtoConverter.
	 */
	private EnviarDocumentoWsDtoConverter() {
		// Constructor vacio de la clase
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaEnviarDocumentoVO <b>a</b>
	 * TipoSalidaEnviarDocumentoWSDTO, <br>
	 * En otras palabras, <b>de</b> Tipo salida enviar documento objeto con valores
	 * de servicio <b>a</b> Tipo salida enviar documento web service dto.
	 *
	 * @param atsed_tipoSalidaEnviarDocumentoVo el parametro tipo salida enviar
	 *                                          documento vo
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como TipoSalidaEnviarDocumentoWSDTO
	 */
	public static TipoSalidaEnviarDocumentoWSDTO voAWsDto(
			TipoSalidaEnviarDocumentoVO atsed_tipoSalidaEnviarDocumentoVo) {
		TipoSalidaEnviarDocumentoWSDTO ltsed_tipoSalidaEnviarDocumentoWSDTO = new TipoSalidaEnviarDocumentoWSDTO();
		ltsed_tipoSalidaEnviarDocumentoWSDTO.setIs_dId(atsed_tipoSalidaEnviarDocumentoVo.getIs_dId());
		ltsed_tipoSalidaEnviarDocumentoWSDTO.setIs_docName(atsed_tipoSalidaEnviarDocumentoVo.getIs_docName());
		ltsed_tipoSalidaEnviarDocumentoWSDTO
				.setIbi_codigoMensaje(atsed_tipoSalidaEnviarDocumentoVo.getIbi_codigoMensaje());
		ltsed_tipoSalidaEnviarDocumentoWSDTO
				.setIs_descripcionMensaje(atsed_tipoSalidaEnviarDocumentoVo.getIs_descripcionMensaje());

		return ltsed_tipoSalidaEnviarDocumentoWSDTO;
	}

	/**
	 * Metodo que convierte de WSDTO a VO ( De Objeto de Transferencia de Datos de
	 * Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto WSDTO manipulado en la capa de negocio, en
	 * una entrada de datos para consumir una operacion de un servicio(objeto VO).
	 * <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoEntradaEnviarDocumentoWSDTO <b>a</b>
	 * TipoEntradaEnviarDocumentoVO, <br>
	 * En otras palabras, <b>de</b> Tipo entrada enviar documento web service dto
	 * <b>a</b> Tipo entrada enviar documento objeto con valores de servicio.
	 *
	 * @param ateed_tipoEntradaEnviarDocumentoWSDTO el parametro tipo entrada enviar
	 *                                              documento WSDTO
	 * @return Resultado para convertir web service dto a objeto de valores de
	 *         servicio, retornado como TipoEntradaEnviarDocumentoVO
	 */
	public static TipoEntradaEnviarDocumentoVO wsDtoAVo(
			TipoEntradaEnviarDocumentoWSDTO ateed_tipoEntradaEnviarDocumentoWSDTO) {
		TipoEntradaEnviarDocumentoVO lteed_tipoEntradaEnviarDocumento = new TipoEntradaEnviarDocumentoVO();
		lteed_tipoEntradaEnviarDocumento.setIs_repositorio(ateed_tipoEntradaEnviarDocumentoWSDTO.getIs_repositorio());
		lteed_tipoEntradaEnviarDocumento.setIb_archivo(ateed_tipoEntradaEnviarDocumentoWSDTO.getIb_archivo());
		lteed_tipoEntradaEnviarDocumento
				.setIs_nombreArchivo(ateed_tipoEntradaEnviarDocumentoWSDTO.getIs_nombreArchivo());
		lteed_tipoEntradaEnviarDocumento
				.setIs_sistemaOrigen(ateed_tipoEntradaEnviarDocumentoWSDTO.getIs_sistemaOrigen());
		lteed_tipoEntradaEnviarDocumento.setIltp_listaTipoParametro(
				listaDtoAListaVoTipoParametro(ateed_tipoEntradaEnviarDocumentoWSDTO.getIltp_listaTipoParametro()));
		return lteed_tipoEntradaEnviarDocumento;
	}

	/**
	 * Metodo que convierte de WSDTO a VO ( De Objeto de Transferencia de Datos de
	 * Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto WSDTO manipulado en la capa de negocio, en
	 * una entrada de datos para consumir una operacion de un servicio(objeto VO).
	 * <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoParametroWSDTO <b>a</b>
	 * TipoParametroVO, <br>
	 * En otras palabras, <b>de</b> Tipo parametro web service dto <b>a</b> Tipo
	 * parametro objeto con valores de servicio.
	 *
	 * @param atp_tipoParametroWsDto el parametro tipo parametro ws dto
	 * @return Resultado para convertir web service dto a objeto de valores de
	 *         servicio, retornado como TipoParametroVO
	 */
	public static TipoParametroVO dtoAVoTipoParametro(TipoParametroWSDTO atp_tipoParametroWsDto) {
		TipoParametroVO ltp_tipoParametroVo = new TipoParametroVO();
		ltp_tipoParametroVo.setIs_nombre(atp_tipoParametroWsDto.getIs_nombre());
		ltp_tipoParametroVo.setIs_valor(atp_tipoParametroWsDto.getIs_valor());
		return ltp_tipoParametroVo;
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
	 * Especificamente convierte <b>de</b> TipoParametroWSDTO <b>a</b>
	 * TipoParametroVO, <br>
	 * En otras palabras, <b>de</b> Tipo parametro web service dto <b>a</b> Tipo
	 * parametro objeto con valores de servicio.
	 *
	 * @param altp_listaTipoParametroWsDto el parametro lista tipo parametro ws dto
	 * @return Resultado para convertir de lista de web service dto a lista de
	 *         valores de servicio, retornado como una lista de TipoParametroVO
	 */
	public static List<TipoParametroVO> listaDtoAListaVoTipoParametro(
			List<TipoParametroWSDTO> altp_listaTipoParametroWsDto) {
		List<TipoParametroVO> lltp_listaTipoParametroVo = new ArrayList<>();
		for (TipoParametroWSDTO ltp_tipoParametroWsDto : altp_listaTipoParametroWsDto) {
			lltp_listaTipoParametroVo.add(dtoAVoTipoParametro(ltp_tipoParametroWsDto));
		}
		return lltp_listaTipoParametroVo;
	}
}
