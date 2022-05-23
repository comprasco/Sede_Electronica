/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ValidarSolicitudAlertaIndividualWsDtoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: ValidarSolicitudAlertaIndividualWsDtoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import co.gov.supernotariado.bachue.clientebus.vo.gestionalertastitulares.TipoEntradaValidarSolicitudAlertaIndividualVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestionalertastitulares.TipoSalidaValidarSolicitudAlertaIndividualVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaValidarSolicitudAlertaIndividualWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaValidarSolicitudAlertaIndividualWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Validar
 * solicitud alerta individual ws dto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ValidarSolicitudAlertaIndividualWsDtoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ValidarSolicitudAlertaIndividualWsDtoConverter.
	 */
	private ValidarSolicitudAlertaIndividualWsDtoConverter() {
		// Constructor vacio de la clase
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b>
	 * TipoSalidaValidarSolicitudAlertaIndividualVO <b>a</b>
	 * TipoSalidaValidarSolicitudAlertaIndividualWSDTO, <br>
	 * En otras palabras, <b>de</b> Tipo salida validar solicitud alerta individual
	 * objeto con valores de servicio <b>a</b> Tipo salida validar solicitud alerta
	 * individual web service dto.
	 *
	 * @param atsvsai_tipoSalidaValidarSolicitudAlertaIndividualVo el parametro tipo
	 *                                                             salida validar
	 *                                                             solicitud alerta
	 *                                                             individual vo
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como TipoSalidaValidarSolicitudAlertaIndividualWSDTO
	 */
	public static TipoSalidaValidarSolicitudAlertaIndividualWSDTO entidadAVo(
			TipoSalidaValidarSolicitudAlertaIndividualVO atsvsai_tipoSalidaValidarSolicitudAlertaIndividualVo) {
		TipoSalidaValidarSolicitudAlertaIndividualWSDTO ltsvsai_tipoSalidaValidarSolicitudAlertaIndividualWSDTO = new TipoSalidaValidarSolicitudAlertaIndividualWSDTO();
		ltsvsai_tipoSalidaValidarSolicitudAlertaIndividualWSDTO
				.setIs_ciudad(atsvsai_tipoSalidaValidarSolicitudAlertaIndividualVo.getIs_ciudad());
		ltsvsai_tipoSalidaValidarSolicitudAlertaIndividualWSDTO
				.setIs_departamento(atsvsai_tipoSalidaValidarSolicitudAlertaIndividualVo.getIs_departamento());
		ltsvsai_tipoSalidaValidarSolicitudAlertaIndividualWSDTO
				.setIs_direccion(atsvsai_tipoSalidaValidarSolicitudAlertaIndividualVo.getIs_direccion());
		ltsvsai_tipoSalidaValidarSolicitudAlertaIndividualWSDTO
				.setIs_codigoMensaje(atsvsai_tipoSalidaValidarSolicitudAlertaIndividualVo.getIs_codigoMensaje());
		ltsvsai_tipoSalidaValidarSolicitudAlertaIndividualWSDTO.setIs_descripcionMensaje(
				atsvsai_tipoSalidaValidarSolicitudAlertaIndividualVo.getIs_descripcionMensaje());
		return ltsvsai_tipoSalidaValidarSolicitudAlertaIndividualWSDTO;
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
	 * TipoEntradaValidarSolicitudAlertaIndividualWSDTO <b>a</b>
	 * TipoEntradaValidarSolicitudAlertaIndividualVO, <br>
	 * En otras palabras, <b>de</b> Tipo entrada validar solicitud alerta individual
	 * web service dto <b>a</b> Tipo entrada validar solicitud alerta individual
	 * objeto con valores de servicio.
	 *
	 * @param atevsai_tipoEntradaValidarSolicitudAlertaIndividualWSDTO el parametro
	 *                                                                 tipo entrada
	 *                                                                 validar
	 *                                                                 solicitud
	 *                                                                 alerta
	 *                                                                 individual
	 *                                                                 WSDTO
	 * @return Resultado para convertir web service dto a objeto de valores de
	 *         servicio, retornado como
	 *         TipoEntradaValidarSolicitudAlertaIndividualVO
	 */
	public static TipoEntradaValidarSolicitudAlertaIndividualVO voAEntidad(
			TipoEntradaValidarSolicitudAlertaIndividualWSDTO atevsai_tipoEntradaValidarSolicitudAlertaIndividualWSDTO) {
		TipoEntradaValidarSolicitudAlertaIndividualVO ltevsai_tipoEntradaValidarSolicitudAlertaIndividual = new TipoEntradaValidarSolicitudAlertaIndividualVO();
		ltevsai_tipoEntradaValidarSolicitudAlertaIndividual.setIs_numeroDocumento(
				atevsai_tipoEntradaValidarSolicitudAlertaIndividualWSDTO.getIs_numeroDocumento());
		ltevsai_tipoEntradaValidarSolicitudAlertaIndividual
				.setIs_primerApellido(atevsai_tipoEntradaValidarSolicitudAlertaIndividualWSDTO.getIs_primerApellido());
		ltevsai_tipoEntradaValidarSolicitudAlertaIndividual
				.setIs_primerNombre(atevsai_tipoEntradaValidarSolicitudAlertaIndividualWSDTO.getIs_primerNombre());
		ltevsai_tipoEntradaValidarSolicitudAlertaIndividual
				.setIs_razonSocial(atevsai_tipoEntradaValidarSolicitudAlertaIndividualWSDTO.getIs_razonSocial());
		ltevsai_tipoEntradaValidarSolicitudAlertaIndividual.setIs_segundoApellido(
				atevsai_tipoEntradaValidarSolicitudAlertaIndividualWSDTO.getIs_segundoApellido());
		ltevsai_tipoEntradaValidarSolicitudAlertaIndividual
				.setIs_segundoNombre(atevsai_tipoEntradaValidarSolicitudAlertaIndividualWSDTO.getIs_segundoNombre());
		ltevsai_tipoEntradaValidarSolicitudAlertaIndividual
				.setIs_tipoDocumento(atevsai_tipoEntradaValidarSolicitudAlertaIndividualWSDTO.getIs_tipoDocumento());
		ltevsai_tipoEntradaValidarSolicitudAlertaIndividual
				.setIs_modulo(atevsai_tipoEntradaValidarSolicitudAlertaIndividualWSDTO.getIs_modulo());
		ltevsai_tipoEntradaValidarSolicitudAlertaIndividual
				.setIs_orip(atevsai_tipoEntradaValidarSolicitudAlertaIndividualWSDTO.getIs_orip());
		ltevsai_tipoEntradaValidarSolicitudAlertaIndividual.setIs_numeroMatricula(
				atevsai_tipoEntradaValidarSolicitudAlertaIndividualWSDTO.getIs_numeroMatricula());
		return ltevsai_tipoEntradaValidarSolicitudAlertaIndividual;
	}
}
