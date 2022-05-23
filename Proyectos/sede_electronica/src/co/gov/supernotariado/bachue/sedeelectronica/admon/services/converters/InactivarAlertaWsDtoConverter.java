/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: InactivarAlertaWsDtoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: InactivarAlertaWsDtoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import co.gov.supernotariado.bachue.clientebus.vo.gestionalertastitulares.TipoEntradaInactivarAlertaVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestionalertastitulares.TipoSalidaInactivarAlertaVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaInactivarAlertaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaInactivarAlertaWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Inactivar alerta
 * ws dto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */

public class InactivarAlertaWsDtoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * InactivarAlertaWsDtoConverter.
	 */
	private InactivarAlertaWsDtoConverter() {
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
	 * Especificamente convierte <b>de</b> TipoEntradaInactivarAlertaWSDTO <b>a</b>
	 * TipoEntradaInactivarAlertaVO, <br>
	 * En otras palabras, <b>de</b> Tipo entrada inactivar alerta web service dto
	 * <b>a</b> Tipo entrada inactivar alerta objeto con valores de servicio.
	 *
	 * @param ateia_tipoEntradaInactivarAlertaWSDTO el parametro tipo entrada
	 *                                              inactivar alerta WSDTO
	 * @return Resultado para convertir web service dto a objeto de valores de
	 *         servicio, retornado como TipoEntradaInactivarAlertaVO
	 */
	public static TipoEntradaInactivarAlertaVO voAEntidad(
			TipoEntradaInactivarAlertaWSDTO ateia_tipoEntradaInactivarAlertaWSDTO) {
		TipoEntradaInactivarAlertaVO lteia_tipoEntradaInactivarAlerta = new TipoEntradaInactivarAlertaVO();
		lteia_tipoEntradaInactivarAlerta.setIs_modulo(ateia_tipoEntradaInactivarAlertaWSDTO.getIs_modulo());
		lteia_tipoEntradaInactivarAlerta
				.setIs_identificadorAlerta(ateia_tipoEntradaInactivarAlertaWSDTO.getIs_identificadorAlerta());
		lteia_tipoEntradaInactivarAlerta
				.setIs_tipoDocumento(ateia_tipoEntradaInactivarAlertaWSDTO.getIs_tipoDocumento());
		lteia_tipoEntradaInactivarAlerta
				.setIs_numeroDocumento(ateia_tipoEntradaInactivarAlertaWSDTO.getIs_numeroDocumento());
		lteia_tipoEntradaInactivarAlerta.setIs_primerNombre(ateia_tipoEntradaInactivarAlertaWSDTO.getIs_primerNombre());
		lteia_tipoEntradaInactivarAlerta
				.setIs_segundoNombre(ateia_tipoEntradaInactivarAlertaWSDTO.getIs_segundoNombre());
		lteia_tipoEntradaInactivarAlerta
				.setIs_primerApellido(ateia_tipoEntradaInactivarAlertaWSDTO.getIs_primerApellido());
		lteia_tipoEntradaInactivarAlerta
				.setIs_segundoApellido(ateia_tipoEntradaInactivarAlertaWSDTO.getIs_segundoApellido());
		lteia_tipoEntradaInactivarAlerta.setIs_razonSocial(ateia_tipoEntradaInactivarAlertaWSDTO.getIs_razonSocial());
		return lteia_tipoEntradaInactivarAlerta;
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaInactivarAlertaVO <b>a</b>
	 * TipoSalidaInactivarAlertaWSDTO, <br>
	 * En otras palabras, <b>de</b> Tipo salida inactivar alerta objeto con valores
	 * de servicio <b>a</b> Tipo salida inactivar alerta web service dto.
	 *
	 * @param atsia_tipoSalidaInactivarAlertaVo el parametro tipo salida inactivar
	 *                                          alerta vo
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como TipoSalidaInactivarAlertaWSDTO
	 */
	public static TipoSalidaInactivarAlertaWSDTO entidadAVo(
			TipoSalidaInactivarAlertaVO atsia_tipoSalidaInactivarAlertaVo) {
		TipoSalidaInactivarAlertaWSDTO ltsia_tipoSalidaInactivarAlerta = new TipoSalidaInactivarAlertaWSDTO();
		ltsia_tipoSalidaInactivarAlerta.setIs_codigoMensaje(atsia_tipoSalidaInactivarAlertaVo.getIs_codigoMensaje());
		ltsia_tipoSalidaInactivarAlerta
				.setIs_descripcionMensaje(atsia_tipoSalidaInactivarAlertaVo.getIs_descripcionMensaje());
		return ltsia_tipoSalidaInactivarAlerta;
	}
}