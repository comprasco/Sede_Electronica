/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ActivarAlertaTierrasWsDtoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: ActivarAlertaTierrasWsDtoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoEntradaActivarAlertaTierrasVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoSalidaActivarAlertaTierrasVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaActivarAlertaTierrasWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaActivarAlertaTierrasWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Activar alerta
 * tierras ws dto. <br>
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ActivarAlertaTierrasWsDtoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ActivarAlertaTierrasWsDtoConverter.
	 */
	private ActivarAlertaTierrasWsDtoConverter() {
		// Constructor vacio de la clase
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaActivarAlertaTierrasVO <b>a</b>
	 * TipoSalidaActivarAlertaTierrasWSDTO, <br>
	 * En otras palabras, <b>de</b> Tipo salida activar alerta tierras objeto con
	 * valores de servicio <b>a</b> Tipo salida activar alerta tierras web service
	 * dto.
	 *
	 * @param atsaat_tipoSalidaActivarAlertaTierrasVo el parametro tipo salida
	 *                                                activar alerta tierras vo
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como TipoSalidaActivarAlertaTierrasWSDTO
	 */
	public static TipoSalidaActivarAlertaTierrasWSDTO voAWsDto(
			TipoSalidaActivarAlertaTierrasVO atsaat_tipoSalidaActivarAlertaTierrasVo) {
		TipoSalidaActivarAlertaTierrasWSDTO ltsaat_tipoSalidaActivarAlertaTierrasWsDto = new TipoSalidaActivarAlertaTierrasWSDTO();
		ltsaat_tipoSalidaActivarAlertaTierrasWsDto
				.setIs_codigoMensaje(atsaat_tipoSalidaActivarAlertaTierrasVo.getIs_codigo());
		ltsaat_tipoSalidaActivarAlertaTierrasWsDto
				.setIs_descripcionMensaje(atsaat_tipoSalidaActivarAlertaTierrasVo.getIs_mensaje());
		return ltsaat_tipoSalidaActivarAlertaTierrasWsDto;
	}

	/**
	 * Metodo que convierte de WSDTO a VO ( De Objeto de Transferencia de Datos de
	 * Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto WSDTO manipulado en la capa de negocio, en
	 * una entrada de datos para consumir una operacion de un servicio(objeto VO).
	 * <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoEntradaActivarAlertaTierrasWSDTO
	 * <b>a</b> TipoEntradaActivarAlertaTierrasVO, <br>
	 * En otras palabras, <b>de</b> Tipo entrada activar alerta tierras web service
	 * dto <b>a</b> Tipo entrada activar alerta tierras objeto con valores de
	 * servicio.
	 *
	 * @param ateaat_tipoEntradaActivarAlertaTierraswsDto el parametro tipo entrada
	 *                                                    activar alerta tierrasws
	 *                                                    dto
	 * @return Resultado para convertir web service dto a objeto de valores de
	 *         servicio, retornado como TipoEntradaActivarAlertaTierrasVO
	 */
	public static TipoEntradaActivarAlertaTierrasVO wsDtoAVo(
			TipoEntradaActivarAlertaTierrasWSDTO ateaat_tipoEntradaActivarAlertaTierraswsDto) {
		TipoEntradaActivarAlertaTierrasVO lteaat_tipoEntradaActivarAlertaTierrasVo = new TipoEntradaActivarAlertaTierrasVO();
		lteaat_tipoEntradaActivarAlertaTierrasVo
				.setIi_idAlerta(ateaat_tipoEntradaActivarAlertaTierraswsDto.getIi_idAlerta());
		return lteaat_tipoEntradaActivarAlertaTierrasVo;
	}
}
