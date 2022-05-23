/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: CancelarIngresoAlertaTierrasWsDtoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: CancelarIngresoAlertaTierrasWsDtoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoEntradaCancelarIngresoAlertaTierrasVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoSalidaCancelarIngresoAlertaTierrasVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaCancelarIngresoAlertaTierrasWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaCancelarIngresoAlertaTierrasWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Cancelar ingreso
 * alerta tierras ws dto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class CancelarIngresoAlertaTierrasWsDtoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * CancelarIngresoAlertaTierrasWsDtoConverter.
	 */
	private CancelarIngresoAlertaTierrasWsDtoConverter() {
		// Constructor vacio de la clase
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaCancelarIngresoAlertaTierrasVO
	 * <b>a</b> TipoSalidaCancelarIngresoAlertaTierrasWSDTO, <br>
	 * En otras palabras, <b>de</b> Tipo salida cancelar ingreso alerta tierras
	 * objeto con valores de servicio <b>a</b> Tipo salida cancelar ingreso alerta
	 * tierras web service dto.
	 *
	 * @param atsciat_tipoSalidaCancelarIngresoAlertaTierrasVo el parametro tipo
	 *                                                         salida cancelar
	 *                                                         ingreso alerta
	 *                                                         tierras vo
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como TipoSalidaCancelarIngresoAlertaTierrasWSDTO
	 */
	public static TipoSalidaCancelarIngresoAlertaTierrasWSDTO voAWsDto(
			TipoSalidaCancelarIngresoAlertaTierrasVO atsciat_tipoSalidaCancelarIngresoAlertaTierrasVo) {
		TipoSalidaCancelarIngresoAlertaTierrasWSDTO ltsciat_tipoSalidaCancelarIngresoAlertaTierrasWsDto = new TipoSalidaCancelarIngresoAlertaTierrasWSDTO();
		ltsciat_tipoSalidaCancelarIngresoAlertaTierrasWsDto
				.setIs_codigoMensaje(atsciat_tipoSalidaCancelarIngresoAlertaTierrasVo.getIs_codigo());
		ltsciat_tipoSalidaCancelarIngresoAlertaTierrasWsDto
				.setIs_descripcionMensaje(atsciat_tipoSalidaCancelarIngresoAlertaTierrasVo.getIs_mensaje());
		return ltsciat_tipoSalidaCancelarIngresoAlertaTierrasWsDto;
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
	 * TipoEntradaCancelarIngresoAlertaTierrasWSDTO <b>a</b>
	 * TipoEntradaCancelarIngresoAlertaTierrasVO, <br>
	 * En otras palabras, <b>de</b> Tipo entrada cancelar ingreso alerta tierras web
	 * service dto <b>a</b> Tipo entrada cancelar ingreso alerta tierras objeto con
	 * valores de servicio.
	 *
	 * @param ateciat_tipoEntradaCancelarIngresoAlertaTierrasWsDto el parametro tipo
	 *                                                             entrada cancelar
	 *                                                             ingreso alerta
	 *                                                             tierras ws dto
	 * @return Resultado para convertir web service dto a objeto de valores de
	 *         servicio, retornado como TipoEntradaCancelarIngresoAlertaTierrasVO
	 */
	public static TipoEntradaCancelarIngresoAlertaTierrasVO wsDtoAVo(
			TipoEntradaCancelarIngresoAlertaTierrasWSDTO ateciat_tipoEntradaCancelarIngresoAlertaTierrasWsDto) {
		TipoEntradaCancelarIngresoAlertaTierrasVO lteciat_tipoEntradaCancelarIngresoAlertaTierrasVo = new TipoEntradaCancelarIngresoAlertaTierrasVO();
		lteciat_tipoEntradaCancelarIngresoAlertaTierrasVo
				.setIi_idAlerta(ateciat_tipoEntradaCancelarIngresoAlertaTierrasWsDto.getIi_idAlerta());
		return lteciat_tipoEntradaCancelarIngresoAlertaTierrasVo;
	}
}
