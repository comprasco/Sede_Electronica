/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: AgregarMatriculaAlertaWsDtoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: AgregarMatriculaAlertaWsDtoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoEntradaAgregarMatriculaAlertaVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoSalidaAgregarMatriculaAlertaVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaAgregarMatriculaAlertaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaAgregarMatriculaAlertaWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Agregar
 * matricula alerta ws dto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class AgregarMatriculaAlertaWsDtoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * AgregarMatriculaAlertaWsDtoConverter.
	 */
	private AgregarMatriculaAlertaWsDtoConverter() {
		// Constructor vacio de la clase
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaAgregarMatriculaAlertaVO
	 * <b>a</b> TipoSalidaAgregarMatriculaAlertaWSDTO, <br>
	 * En otras palabras, <b>de</b> Tipo salida agregar matricula alerta objeto con
	 * valores de servicio <b>a</b> Tipo salida agregar matricula alerta web service
	 * dto.
	 *
	 * @param atsama_tipoSalidaAgregarMatriculaAlertaVo el parametro tipo salida
	 *                                                  agregar matricula alerta vo
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como TipoSalidaAgregarMatriculaAlertaWSDTO
	 */
	public static TipoSalidaAgregarMatriculaAlertaWSDTO voAWsDto(
			TipoSalidaAgregarMatriculaAlertaVO atsama_tipoSalidaAgregarMatriculaAlertaVo) {
		TipoSalidaAgregarMatriculaAlertaWSDTO ltsama_tipoSalidaAgregarMatriculaAlertaWsDto = new TipoSalidaAgregarMatriculaAlertaWSDTO();
		ltsama_tipoSalidaAgregarMatriculaAlertaWsDto
				.setIs_codigoMensaje(atsama_tipoSalidaAgregarMatriculaAlertaVo.getIs_codigo());
		ltsama_tipoSalidaAgregarMatriculaAlertaWsDto
				.setIs_descripcionMensaje(atsama_tipoSalidaAgregarMatriculaAlertaVo.getIs_mensaje());
		return ltsama_tipoSalidaAgregarMatriculaAlertaWsDto;
	}

	/**
	 * Metodo que convierte de WSDTO a VO ( De Objeto de Transferencia de Datos de
	 * Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto WSDTO manipulado en la capa de negocio, en
	 * una entrada de datos para consumir una operacion de un servicio(objeto VO).
	 * <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoEntradaAgregarMatriculaAlertaWSDTO
	 * <b>a</b> TipoEntradaAgregarMatriculaAlertaVO, <br>
	 * En otras palabras, <b>de</b> Tipo entrada agregar matricula alerta web
	 * service dto <b>a</b> Tipo entrada agregar matricula alerta objeto con valores
	 * de servicio.
	 *
	 * @param ateama_tipoEntradaAgregarMatriculaAlertaWsDto el parametro tipo
	 *                                                      entrada agregar
	 *                                                      matricula alerta ws dto
	 * @return Resultado para convertir web service dto a objeto de valores de
	 *         servicio, retornado como TipoEntradaAgregarMatriculaAlertaVO
	 */
	public static TipoEntradaAgregarMatriculaAlertaVO wsDtoAVo(
			TipoEntradaAgregarMatriculaAlertaWSDTO ateama_tipoEntradaAgregarMatriculaAlertaWsDto) {
		TipoEntradaAgregarMatriculaAlertaVO lteama_tipoEntradaAgregarMatriculaAlertaVo = new TipoEntradaAgregarMatriculaAlertaVO();
		lteama_tipoEntradaAgregarMatriculaAlertaVo
				.setIi_idAlerta(ateama_tipoEntradaAgregarMatriculaAlertaWsDto.getIi_idAlerta());
		lteama_tipoEntradaAgregarMatriculaAlertaVo.setIi_numMatriculaInmobiliaria(
				ateama_tipoEntradaAgregarMatriculaAlertaWsDto.getIi_numMatriculaInmobiliaria());
		lteama_tipoEntradaAgregarMatriculaAlertaVo
				.setIs_codCirculoRegistral(ateama_tipoEntradaAgregarMatriculaAlertaWsDto.getIs_codCirculoRegistral());
		return lteama_tipoEntradaAgregarMatriculaAlertaVo;
	}
}
