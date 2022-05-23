/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: RemoverMatriculaAlertaWsDtoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: RemoverMatriculaAlertaWsDtoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoEntradaRemoverMatriculaAlertaVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoSalidaRemoverMatriculaAlertaVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaRemoverMatriculaAlertaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaRemoverMatriculaAlertaWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Remover
 * matricula alerta ws dto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */

public class RemoverMatriculaAlertaWsDtoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * RemoverMatriculaAlertaWsDtoConverter.
	 */
	private RemoverMatriculaAlertaWsDtoConverter() {
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
	 * Especificamente convierte <b>de</b> TipoEntradaRemoverMatriculaAlertaWSDTO
	 * <b>a</b> TipoEntradaRemoverMatriculaAlertaVO, <br>
	 * En otras palabras, <b>de</b> Tipo entrada remover matricula alerta web
	 * service dto <b>a</b> Tipo entrada remover matricula alerta objeto con valores
	 * de servicio.
	 *
	 * @param aterma_tipoEntradaRemoverMatriculaAlertaWsDto el parametro tipo
	 *                                                      entrada remover
	 *                                                      matricula alerta ws dto
	 * @return Resultado para convertir web service dto a objeto de valores de
	 *         servicio, retornado como TipoEntradaRemoverMatriculaAlertaVO
	 */
	public static TipoEntradaRemoverMatriculaAlertaVO wsDtoAVo(
			TipoEntradaRemoverMatriculaAlertaWSDTO aterma_tipoEntradaRemoverMatriculaAlertaWsDto) {
		TipoEntradaRemoverMatriculaAlertaVO lterma_tipoEntradaRemoverMatriculaAlertaVo = new TipoEntradaRemoverMatriculaAlertaVO();

		lterma_tipoEntradaRemoverMatriculaAlertaVo
				.setIi_idAlerta(aterma_tipoEntradaRemoverMatriculaAlertaWsDto.getIi_idAlerta());
		lterma_tipoEntradaRemoverMatriculaAlertaVo
				.setIs_codCirculoRegistral(aterma_tipoEntradaRemoverMatriculaAlertaWsDto.getIs_codCirculoRegistral());
		lterma_tipoEntradaRemoverMatriculaAlertaVo.setIi_numMatriculaInmobiliaria(
				aterma_tipoEntradaRemoverMatriculaAlertaWsDto.getIi_numMatriculaInmobiliaria());

		return lterma_tipoEntradaRemoverMatriculaAlertaVo;
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaRemoverMatriculaAlertaVO
	 * <b>a</b> TipoSalidaRemoverMatriculaAlertaWSDTO, <br>
	 * En otras palabras, <b>de</b> Tipo salida remover matricula alerta objeto con
	 * valores de servicio <b>a</b> Tipo salida remover matricula alerta web service
	 * dto.
	 *
	 * @param atsrma_tipoSalidaRemoverMatriculaAlertaVo el parametro tipo salida
	 *                                                  remover matricula alerta vo
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como TipoSalidaRemoverMatriculaAlertaWSDTO
	 */
	public static TipoSalidaRemoverMatriculaAlertaWSDTO voAWsDto(
			TipoSalidaRemoverMatriculaAlertaVO atsrma_tipoSalidaRemoverMatriculaAlertaVo) {
		TipoSalidaRemoverMatriculaAlertaWSDTO ltsrma_tipoSalidaRemoverMatriculaAlertaWsDto = new TipoSalidaRemoverMatriculaAlertaWSDTO();

		ltsrma_tipoSalidaRemoverMatriculaAlertaWsDto
				.setIs_codigoMensaje(atsrma_tipoSalidaRemoverMatriculaAlertaVo.getIs_codigo());
		ltsrma_tipoSalidaRemoverMatriculaAlertaWsDto
				.setIs_descripcionMensaje(atsrma_tipoSalidaRemoverMatriculaAlertaVo.getIs_mensaje());

		return ltsrma_tipoSalidaRemoverMatriculaAlertaWsDto;
	}

}
