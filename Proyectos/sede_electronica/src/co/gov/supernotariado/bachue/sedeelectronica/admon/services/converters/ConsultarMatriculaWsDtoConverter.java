/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ConsultarMatriculaWsDtoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: ConsultarMatriculaWsDtoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoEntradaConsultarMatriculaVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoSalidaConsultarMatriculaVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarMatriculaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarMatriculaWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Consultar
 * matricula ws dto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ConsultarMatriculaWsDtoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ConsultarMatriculaWsDtoConverter.
	 */
	private ConsultarMatriculaWsDtoConverter() {
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
	 * Especificamente convierte <b>de</b> TipoEntradaConsultarMatriculaWSDTO
	 * <b>a</b> TipoEntradaConsultarMatriculaVO, <br>
	 * En otras palabras, <b>de</b> Tipo entrada consultar matricula web service dto
	 * <b>a</b> Tipo entrada consultar matricula objeto con valores de servicio.
	 *
	 * @param atecm_tipoEntradaConsultarMatriculaWsDto el parametro tipo entrada
	 *                                                 consultar matricula ws dto
	 * @return Resultado para convertir web service dto a objeto de valores de
	 *         servicio, retornado como TipoEntradaConsultarMatriculaVO
	 */
	public static TipoEntradaConsultarMatriculaVO wsDtoAVo(
			TipoEntradaConsultarMatriculaWSDTO atecm_tipoEntradaConsultarMatriculaWsDto) {
		TipoEntradaConsultarMatriculaVO ltecm_tipoEntradaConsultarMatriculaVo = new TipoEntradaConsultarMatriculaVO();
		ltecm_tipoEntradaConsultarMatriculaVo
				.setIs_codCirculoRegistral(atecm_tipoEntradaConsultarMatriculaWsDto.getIs_codCirculoRegistral());
		ltecm_tipoEntradaConsultarMatriculaVo.setIi_numMatriculaInmobiliaria(
				atecm_tipoEntradaConsultarMatriculaWsDto.getIi_numMatriculaInmobiliaria());
		return ltecm_tipoEntradaConsultarMatriculaVo;
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaConsultarMatriculaVO <b>a</b>
	 * TipoSalidaConsultarMatriculaWSDTO, <br>
	 * En otras palabras, <b>de</b> Tipo salida consultar matricula objeto con
	 * valores de servicio <b>a</b> Tipo salida consultar matricula web service dto.
	 *
	 * @param atscm_tipoSalidaConsultarMatriculaVo el parametro tipo salida
	 *                                             consultar matricula vo
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como TipoSalidaConsultarMatriculaWSDTO
	 */
	public static TipoSalidaConsultarMatriculaWSDTO voAWsDto(
			TipoSalidaConsultarMatriculaVO atscm_tipoSalidaConsultarMatriculaVo) {
		TipoSalidaConsultarMatriculaWSDTO ltscm_tipoSalidaConsultarMatriculaWsDto = new TipoSalidaConsultarMatriculaWSDTO();
		ltscm_tipoSalidaConsultarMatriculaWsDto
				.setIs_codigoMensaje(atscm_tipoSalidaConsultarMatriculaVo.getIs_codigo());
		ltscm_tipoSalidaConsultarMatriculaWsDto
				.setIs_descripcionMensaje(atscm_tipoSalidaConsultarMatriculaVo.getIs_mensaje());
		ltscm_tipoSalidaConsultarMatriculaWsDto
				.setIllmcm_listaMatriculasConsultarMatriculaWsDto(ListaMatriculasConsultarMatriculaWsDtoConverter
						.listaVOAListaWsDto(atscm_tipoSalidaConsultarMatriculaVo.getIllmcm_listaMatriculas()));
		return ltscm_tipoSalidaConsultarMatriculaWsDto;
	}

}
