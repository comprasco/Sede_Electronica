/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ConsultarMatriculaFiltrosTierrasWsDtoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: ConsultarMatriculaFiltrosTierrasWsDtoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoEntradaConsultarMatriculaFiltrosTierrasVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoSalidaConsultarMatriculaFiltrosTierrasVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarMatriculaFiltrosTierrasWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarMatriculaFiltrosTierrasWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Consultar
 * matricula filtros tierras ws dto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ConsultarMatriculaFiltrosTierrasWsDtoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ConsultarMatriculaFiltrosTierrasWsDtoConverter.
	 */
	private ConsultarMatriculaFiltrosTierrasWsDtoConverter() {
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
	 * TipoEntradaConsultarMatriculaFiltrosTierrasWSDTO <b>a</b>
	 * TipoEntradaConsultarMatriculaFiltrosTierrasVO, <br>
	 * En otras palabras, <b>de</b> Tipo entrada consultar matricula filtros tierras
	 * web service dto <b>a</b> Tipo entrada consultar matricula filtros tierras
	 * objeto con valores de servicio.
	 *
	 * @param atecmft_tipoEntradaConsultarMatriculaFiltrosTierrasWsDto el parametro
	 *                                                                 tipo entrada
	 *                                                                 consultar
	 *                                                                 matricula
	 *                                                                 filtros
	 *                                                                 tierras ws
	 *                                                                 dto
	 * @return Resultado para convertir web service dto a objeto de valores de
	 *         servicio, retornado como
	 *         TipoEntradaConsultarMatriculaFiltrosTierrasVO
	 */
	public static TipoEntradaConsultarMatriculaFiltrosTierrasVO wsDtoAVo(
			TipoEntradaConsultarMatriculaFiltrosTierrasWSDTO atecmft_tipoEntradaConsultarMatriculaFiltrosTierrasWsDto) {
		TipoEntradaConsultarMatriculaFiltrosTierrasVO ltecmft_tipoEntradaConsultarMatriculaFiltrosTierrasVo = new TipoEntradaConsultarMatriculaFiltrosTierrasVO();
		ltecmft_tipoEntradaConsultarMatriculaFiltrosTierrasVo
				.setIi_areaPredio(atecmft_tipoEntradaConsultarMatriculaFiltrosTierrasWsDto.getIi_areaPredio());
		ltecmft_tipoEntradaConsultarMatriculaFiltrosTierrasVo
				.setIs_idDepartamento(atecmft_tipoEntradaConsultarMatriculaFiltrosTierrasWsDto.getIs_idDepartamento());
		ltecmft_tipoEntradaConsultarMatriculaFiltrosTierrasVo
				.setIs_idMunicipio(atecmft_tipoEntradaConsultarMatriculaFiltrosTierrasWsDto.getIs_idMunicipio());
		ltecmft_tipoEntradaConsultarMatriculaFiltrosTierrasVo
				.setIs_idVereda(atecmft_tipoEntradaConsultarMatriculaFiltrosTierrasWsDto.getIs_idVereda());
		ltecmft_tipoEntradaConsultarMatriculaFiltrosTierrasVo
				.setIs_nombrePredio(atecmft_tipoEntradaConsultarMatriculaFiltrosTierrasWsDto.getIs_nombrePredio());

		return ltecmft_tipoEntradaConsultarMatriculaFiltrosTierrasVo;
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b>
	 * TipoSalidaConsultarMatriculaFiltrosTierrasVO <b>a</b>
	 * TipoSalidaConsultarMatriculaFiltrosTierrasWSDTO, <br>
	 * En otras palabras, <b>de</b> Tipo salida consultar matricula filtros tierras
	 * objeto con valores de servicio <b>a</b> Tipo salida consultar matricula
	 * filtros tierras web service dto.
	 *
	 * @param atscmft_tipoSalidaConsultarMatriculaFiltrosTierrasVo el parametro tipo
	 *                                                             salida consultar
	 *                                                             matricula filtros
	 *                                                             tierras vo
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como TipoSalidaConsultarMatriculaFiltrosTierrasWSDTO
	 */
	public static TipoSalidaConsultarMatriculaFiltrosTierrasWSDTO voAWsDto(
			TipoSalidaConsultarMatriculaFiltrosTierrasVO atscmft_tipoSalidaConsultarMatriculaFiltrosTierrasVo) {
		TipoSalidaConsultarMatriculaFiltrosTierrasWSDTO ltscmft_tipoSalidaConsultarMatriculaFiltrosTierrasWsDto = new TipoSalidaConsultarMatriculaFiltrosTierrasWSDTO();
		ltscmft_tipoSalidaConsultarMatriculaFiltrosTierrasWsDto
				.setIllmcmft_listaMatriculasConsultarMatriculaFiltrosTierrasWsDto(
						ListaMatriculasConsultarMatriculaFiltrosTierrasWsDtoConverter
								.listaVoAListaWsDtolis(atscmft_tipoSalidaConsultarMatriculaFiltrosTierrasVo
										.getIllmcmft_listaMatriculasConsultarMatriculaFiltrosTierrasVo()));
		ltscmft_tipoSalidaConsultarMatriculaFiltrosTierrasWsDto
				.setIs_codigoMensaje(atscmft_tipoSalidaConsultarMatriculaFiltrosTierrasVo.getIs_codigo());
		ltscmft_tipoSalidaConsultarMatriculaFiltrosTierrasWsDto
				.setIs_descripcionMensaje(atscmft_tipoSalidaConsultarMatriculaFiltrosTierrasVo.getIs_mensaje());

		return ltscmft_tipoSalidaConsultarMatriculaFiltrosTierrasWsDto;
	}
}
