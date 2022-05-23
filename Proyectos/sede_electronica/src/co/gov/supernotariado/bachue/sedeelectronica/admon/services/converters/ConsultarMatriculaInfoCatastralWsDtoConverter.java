/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ConsultarMatriculaInfoCatastralWsDtoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: ConsultarMatriculaInfoCatastralWsDtoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoEntradaConsultarMatriculaInfoCatastralVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoSalidaConsultarMatriculaInfoCatastralVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarMatriculaInfoCatastralWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarMatriculaInfoCatastralWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Consultar
 * matricula info catastral ws dto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ConsultarMatriculaInfoCatastralWsDtoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ConsultarMatriculaInfoCatastralWsDtoConverter.
	 */
	private ConsultarMatriculaInfoCatastralWsDtoConverter() {
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
	 * TipoEntradaConsultarMatriculaInfoCatastralWSDTO <b>a</b>
	 * TipoEntradaConsultarMatriculaInfoCatastralVO, <br>
	 * En otras palabras, <b>de</b> Tipo entrada consultar matricula info catastral
	 * web service dto <b>a</b> Tipo entrada consultar matricula info catastral
	 * objeto con valores de servicio.
	 *
	 * @param atecmic_tipoEntradaConsultarMatriculaInfoCatastralWsDto el parametro
	 *                                                                tipo entrada
	 *                                                                consultar
	 *                                                                matricula info
	 *                                                                catastral ws
	 *                                                                dto
	 * @return Resultado para convertir web service dto a objeto de valores de
	 *         servicio, retornado como TipoEntradaConsultarMatriculaInfoCatastralVO
	 */
	public static TipoEntradaConsultarMatriculaInfoCatastralVO wsDtoAVo(
			TipoEntradaConsultarMatriculaInfoCatastralWSDTO atecmic_tipoEntradaConsultarMatriculaInfoCatastralWsDto) {
		TipoEntradaConsultarMatriculaInfoCatastralVO ltecmic_tipoEntradaConsultarMatriculaInfoCatastralVo = new TipoEntradaConsultarMatriculaInfoCatastralVO();
		ltecmic_tipoEntradaConsultarMatriculaInfoCatastralVo
				.setIi_chip(atecmic_tipoEntradaConsultarMatriculaInfoCatastralWsDto.getIi_chip());
		ltecmic_tipoEntradaConsultarMatriculaInfoCatastralVo
				.setIi_numPredial(atecmic_tipoEntradaConsultarMatriculaInfoCatastralWsDto.getIi_numPredial());
		ltecmic_tipoEntradaConsultarMatriculaInfoCatastralVo
				.setIs_nupre(atecmic_tipoEntradaConsultarMatriculaInfoCatastralWsDto.getIs_nupre());
		return ltecmic_tipoEntradaConsultarMatriculaInfoCatastralVo;
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b>
	 * TipoSalidaConsultarMatriculaInfoCatastralVO <b>a</b>
	 * TipoSalidaConsultarMatriculaInfoCatastralWSDTO, <br>
	 * En otras palabras, <b>de</b> Tipo salida consultar matricula info catastral
	 * objeto con valores de servicio <b>a</b> Tipo salida consultar matricula info
	 * catastral web service dto.
	 *
	 * @param atscmic_tipoSalidaConsultarMatriculaInfoCatastralVo el parametro tipo
	 *                                                            salida consultar
	 *                                                            matricula info
	 *                                                            catastral vo
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como TipoSalidaConsultarMatriculaInfoCatastralWSDTO
	 */
	public static TipoSalidaConsultarMatriculaInfoCatastralWSDTO voAWsDto(
			TipoSalidaConsultarMatriculaInfoCatastralVO atscmic_tipoSalidaConsultarMatriculaInfoCatastralVo) {
		TipoSalidaConsultarMatriculaInfoCatastralWSDTO ltscmic_tipoSalidaConsultarMatriculaInfoCatastralWsDto = new TipoSalidaConsultarMatriculaInfoCatastralWSDTO();
		ltscmic_tipoSalidaConsultarMatriculaInfoCatastralWsDto
				.setIs_codigoMensaje(atscmic_tipoSalidaConsultarMatriculaInfoCatastralVo.getIs_codigo());
		ltscmic_tipoSalidaConsultarMatriculaInfoCatastralWsDto
				.setIs_descripcionMensaje(atscmic_tipoSalidaConsultarMatriculaInfoCatastralVo.getIs_mensaje());
		ltscmic_tipoSalidaConsultarMatriculaInfoCatastralWsDto
				.setIllmcmic_listaMatriculasConsultarMatriculaInfoCatastralWsDto(
						ListaConsultarMatriculaInfoCatastralWsDtoConverter
								.listaVoAListaWsDtolis(atscmic_tipoSalidaConsultarMatriculaInfoCatastralVo
										.getIllmcmic_listaMatriculasConsultarMatriculaInfoCatastralVo()));
		return ltscmic_tipoSalidaConsultarMatriculaInfoCatastralWsDto;
	}
}
