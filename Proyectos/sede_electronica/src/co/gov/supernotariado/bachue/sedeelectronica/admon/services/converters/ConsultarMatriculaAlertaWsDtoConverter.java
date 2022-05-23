/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ConsultarMatriculaAlertaWsDtoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: ConsultarMatriculaAlertaWsDtoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoEntradaConsultarMatriculaAlertaVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoSalidaConsultarMatriculaAlertaVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarMatriculaAlertaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarMatriculaAlertaWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Consultar
 * matricula alerta ws dto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ConsultarMatriculaAlertaWsDtoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ConsultarMatriculaAlertaWsDtoConverter.
	 */
	private ConsultarMatriculaAlertaWsDtoConverter() {
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
	 * Especificamente convierte <b>de</b> TipoEntradaConsultarMatriculaAlertaWSDTO
	 * <b>a</b> TipoEntradaConsultarMatriculaAlertaVO, <br>
	 * En otras palabras, <b>de</b> Tipo entrada consultar matricula alerta web
	 * service dto <b>a</b> Tipo entrada consultar matricula alerta objeto con
	 * valores de servicio.
	 *
	 * @param atecma_tipoEntradaConsultarMatriculaAlertaWsDto el parametro tipo
	 *                                                        entrada consultar
	 *                                                        matricula alerta ws
	 *                                                        dto
	 * @return Resultado para convertir web service dto a objeto de valores de
	 *         servicio, retornado como TipoEntradaConsultarMatriculaAlertaVO
	 */
	public static TipoEntradaConsultarMatriculaAlertaVO wsDtoAVo(
			TipoEntradaConsultarMatriculaAlertaWSDTO atecma_tipoEntradaConsultarMatriculaAlertaWsDto) {
		TipoEntradaConsultarMatriculaAlertaVO ltecma_tipoEntradaConsultarMatriculaAlertaVo = new TipoEntradaConsultarMatriculaAlertaVO();
		ltecma_tipoEntradaConsultarMatriculaAlertaVo
				.setIi_matriculasPagina(atecma_tipoEntradaConsultarMatriculaAlertaWsDto.getIi_matriculasPagina());
		ltecma_tipoEntradaConsultarMatriculaAlertaVo.setIi_numMatriculaInmobiliaria(
				atecma_tipoEntradaConsultarMatriculaAlertaWsDto.getIi_numMatriculaInmobiliaria());
		ltecma_tipoEntradaConsultarMatriculaAlertaVo
				.setIs_codCirculoRegistral(atecma_tipoEntradaConsultarMatriculaAlertaWsDto.getIs_codCirculoRegistral());
		ltecma_tipoEntradaConsultarMatriculaAlertaVo
				.setIi_idAlerta(atecma_tipoEntradaConsultarMatriculaAlertaWsDto.getIi_idAlerta());
		return ltecma_tipoEntradaConsultarMatriculaAlertaVo;
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaConsultarMatriculaAlertaVO
	 * <b>a</b> TipoSalidaConsultarMatriculaAlertaWSDTO, <br>
	 * En otras palabras, <b>de</b> Tipo salida consultar matricula alerta objeto
	 * con valores de servicio <b>a</b> Tipo salida consultar matricula alerta web
	 * service dto.
	 *
	 * @param atscma_tipoSalidaConsultarMatriculaAlertaVo el parametro tipo salida
	 *                                                    consultar matricula alerta
	 *                                                    vo
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como TipoSalidaConsultarMatriculaAlertaWSDTO
	 */
	public static TipoSalidaConsultarMatriculaAlertaWSDTO voAWsDto(
			TipoSalidaConsultarMatriculaAlertaVO atscma_tipoSalidaConsultarMatriculaAlertaVo) {
		TipoSalidaConsultarMatriculaAlertaWSDTO ltscma_tipoSalidaConsultarMatriculaAlertaWsDto = new TipoSalidaConsultarMatriculaAlertaWSDTO();
		ltscma_tipoSalidaConsultarMatriculaAlertaWsDto
				.setIs_codigoMensaje(atscma_tipoSalidaConsultarMatriculaAlertaVo.getIs_mensaje());
		ltscma_tipoSalidaConsultarMatriculaAlertaWsDto
				.setIs_descripcionMensaje(atscma_tipoSalidaConsultarMatriculaAlertaVo.getIs_codigo());
		ltscma_tipoSalidaConsultarMatriculaAlertaWsDto
				.setIllcma_listaConsultarMatriculaAlertasWsDto(ListaConsultarMatriculaAlertasWsDtoConverter
						.listaVOAListaWsDto(atscma_tipoSalidaConsultarMatriculaAlertaVo
								.getIllmcma_listaMatriculaConsultaMatriculaAlerta()));

		return ltscma_tipoSalidaConsultarMatriculaAlertaWsDto;
	}
}
