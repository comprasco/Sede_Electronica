/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ActualizarContactoAlertaWsDtoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: ActualizarContactoAlertaWsDtoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import co.gov.supernotariado.bachue.clientebus.vo.gestionalertastitulares.TipoEntradaActualizarContactoAlertaVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestionalertastitulares.TipoSalidaActualizarContactoAlertaVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaActualizarContactoAlertaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaActualizarContactoAlertaWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Actualizar
 * contacto alerta ws dto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */

public class ActualizarContactoAlertaWsDtoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ActualizarContactoAlertaWsDtoConverter.
	 */
	private ActualizarContactoAlertaWsDtoConverter() {
		// Constructor vacio de la clase
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaActualizarContactoAlertaVO
	 * <b>a</b> TipoSalidaActualizarContactoAlertaWSDTO, <br>
	 * En otras palabras, <b>de</b> Tipo salida actualizar contacto alerta objeto
	 * con valores de servicio <b>a</b> Tipo salida actualizar contacto alerta web
	 * service dto.
	 *
	 * @param atsaca_tipoSalidaActualizarContactoAlertaVo el parametro tipo salida
	 *                                                    actualizar contacto alerta
	 *                                                    vo
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como TipoSalidaActualizarContactoAlertaWSDTO
	 */
	public static TipoSalidaActualizarContactoAlertaWSDTO entidadAVo(
			TipoSalidaActualizarContactoAlertaVO atsaca_tipoSalidaActualizarContactoAlertaVo) {
		TipoSalidaActualizarContactoAlertaWSDTO ltsaca_tipoSalidaActualizarContactoAlertaWSDTO = new TipoSalidaActualizarContactoAlertaWSDTO();
		ltsaca_tipoSalidaActualizarContactoAlertaWSDTO
				.setIs_codigoMensaje(atsaca_tipoSalidaActualizarContactoAlertaVo.getIs_codigoMensaje());
		ltsaca_tipoSalidaActualizarContactoAlertaWSDTO
				.setIs_descripcionMensaje(atsaca_tipoSalidaActualizarContactoAlertaVo.getIs_descripcionMensaje());
		return ltsaca_tipoSalidaActualizarContactoAlertaWSDTO;
	}

	/**
	 * Metodo que convierte de WSDTO a VO ( De Objeto de Transferencia de Datos de
	 * Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto WSDTO manipulado en la capa de negocio, en
	 * una entrada de datos para consumir una operacion de un servicio(objeto VO).
	 * <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoEntradaActualizarContactoAlertaWSDTO
	 * <b>a</b> TipoEntradaActualizarContactoAlertaVO, <br>
	 * En otras palabras, <b>de</b> Tipo entrada actualizar contacto alerta web
	 * service dto <b>a</b> Tipo entrada actualizar contacto alerta objeto con
	 * valores de servicio.
	 *
	 * @param ateaca_tipoEntradaActualizarContactoAlertaWSDTO el parametro tipo
	 *                                                        entrada actualizar
	 *                                                        contacto alerta WSDTO
	 * @return Resultado para convertir web service dto a objeto de valores de
	 *         servicio, retornado como TipoEntradaActualizarContactoAlertaVO
	 */
	public static TipoEntradaActualizarContactoAlertaVO voAEntidad(
			TipoEntradaActualizarContactoAlertaWSDTO ateaca_tipoEntradaActualizarContactoAlertaWSDTO) {
		TipoEntradaActualizarContactoAlertaVO lteaca_tipoEntradaActualizarContactoAlerta = new TipoEntradaActualizarContactoAlertaVO();
		lteaca_tipoEntradaActualizarContactoAlerta
				.setIs_tipoDocumento(ateaca_tipoEntradaActualizarContactoAlertaWSDTO.getIs_tipoDocumento());
		lteaca_tipoEntradaActualizarContactoAlerta
				.setIs_numeroDocumento(ateaca_tipoEntradaActualizarContactoAlertaWSDTO.getIs_numeroDocumento());
		lteaca_tipoEntradaActualizarContactoAlerta
				.setIs_primerNombre(ateaca_tipoEntradaActualizarContactoAlertaWSDTO.getIs_primerNombre());
		lteaca_tipoEntradaActualizarContactoAlerta
				.setIs_segundoNombre(ateaca_tipoEntradaActualizarContactoAlertaWSDTO.getIs_segundoNombre());
		lteaca_tipoEntradaActualizarContactoAlerta
				.setIs_primerApellido(ateaca_tipoEntradaActualizarContactoAlertaWSDTO.getIs_primerApellido());
		lteaca_tipoEntradaActualizarContactoAlerta
				.setIs_segundoApellido(ateaca_tipoEntradaActualizarContactoAlertaWSDTO.getIs_segundoApellido());
		lteaca_tipoEntradaActualizarContactoAlerta
				.setIs_razonSocial(ateaca_tipoEntradaActualizarContactoAlertaWSDTO.getIs_razonSocial());
		lteaca_tipoEntradaActualizarContactoAlerta
				.setIs_correoElectronico(ateaca_tipoEntradaActualizarContactoAlertaWSDTO.getIs_correoElectronico());
		lteaca_tipoEntradaActualizarContactoAlerta
				.setIs_numeroCelular(ateaca_tipoEntradaActualizarContactoAlertaWSDTO.getIs_numeroCelular());
		return lteaca_tipoEntradaActualizarContactoAlerta;
	}

}
