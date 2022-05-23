/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ValidarSolicitudAlertaMasivaWsDtoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: ValidarSolicitudAlertaMasivaWsDtoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import co.gov.supernotariado.bachue.clientebus.vo.gestionalertastitulares.TipoEntradaValidarSolicitudAlertaMasivaVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestionalertastitulares.TipoSalidaValidarSolicitudAlertaMasivaVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaValidarSolicitudAlertaMasivaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaValidarSolicitudAlertaMasivaWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Validar
 * solicitud alerta masiva ws dto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ValidarSolicitudAlertaMasivaWsDtoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ValidarSolicitudAlertaMasivaWsDtoConverter.
	 */
	private ValidarSolicitudAlertaMasivaWsDtoConverter() {
		// Constructor vacio de la clase
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaValidarSolicitudAlertaMasivaVO
	 * <b>a</b> TipoSalidaValidarSolicitudAlertaMasivaWSDTO, <br>
	 * En otras palabras, <b>de</b> Tipo salida validar solicitud alerta masiva
	 * objeto con valores de servicio <b>a</b> Tipo salida validar solicitud alerta
	 * masiva web service dto.
	 *
	 * @param atsvsam_tipoSalidaValidarSolicitudAlertaMasiva el parametro tipo
	 *                                                       salida validar
	 *                                                       solicitud alerta masiva
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como TipoSalidaValidarSolicitudAlertaMasivaWSDTO
	 */
	public static TipoSalidaValidarSolicitudAlertaMasivaWSDTO entidadAVo(
			TipoSalidaValidarSolicitudAlertaMasivaVO atsvsam_tipoSalidaValidarSolicitudAlertaMasiva) {
		TipoSalidaValidarSolicitudAlertaMasivaWSDTO ltsvsam_tipoSalidaValidarSolicitudAlertaMasivaWSDTO = new TipoSalidaValidarSolicitudAlertaMasivaWSDTO();
		ltsvsam_tipoSalidaValidarSolicitudAlertaMasivaWSDTO
				.setIb_archivo(atsvsam_tipoSalidaValidarSolicitudAlertaMasiva.getIb_archivo());
		ltsvsam_tipoSalidaValidarSolicitudAlertaMasivaWSDTO
				.setIs_codigoMensaje(atsvsam_tipoSalidaValidarSolicitudAlertaMasiva.getIs_codigoMensaje());
		ltsvsam_tipoSalidaValidarSolicitudAlertaMasivaWSDTO
				.setIs_descripcionMensaje(atsvsam_tipoSalidaValidarSolicitudAlertaMasiva.getIs_descripcionMensaje());
		return ltsvsam_tipoSalidaValidarSolicitudAlertaMasivaWSDTO;
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
	 * TipoEntradaValidarSolicitudAlertaMasivaWSDTO <b>a</b>
	 * TipoEntradaValidarSolicitudAlertaMasivaVO, <br>
	 * En otras palabras, <b>de</b> Tipo entrada validar solicitud alerta masiva web
	 * service dto <b>a</b> Tipo entrada validar solicitud alerta masiva objeto con
	 * valores de servicio.
	 *
	 * @param atevsam_tipoEntradaValidarSolicitudAlertaMasivaWSDTO el parametro tipo
	 *                                                             entrada validar
	 *                                                             solicitud alerta
	 *                                                             masiva WSDTO
	 * @return Resultado para convertir web service dto a objeto de valores de
	 *         servicio, retornado como TipoEntradaValidarSolicitudAlertaMasivaVO
	 */
	public static TipoEntradaValidarSolicitudAlertaMasivaVO voAEntidad(
			TipoEntradaValidarSolicitudAlertaMasivaWSDTO atevsam_tipoEntradaValidarSolicitudAlertaMasivaWSDTO) {
		TipoEntradaValidarSolicitudAlertaMasivaVO ltevsam_tipoEntradaValidarSolicitudAlertaMasiva = new TipoEntradaValidarSolicitudAlertaMasivaVO();
		ltevsam_tipoEntradaValidarSolicitudAlertaMasiva
				.setIs_tipoDocumento(atevsam_tipoEntradaValidarSolicitudAlertaMasivaWSDTO.getIs_tipoDocumento());
		ltevsam_tipoEntradaValidarSolicitudAlertaMasiva
				.setIs_numeroDocumento(atevsam_tipoEntradaValidarSolicitudAlertaMasivaWSDTO.getIs_numeroDocumento());
		ltevsam_tipoEntradaValidarSolicitudAlertaMasiva
				.setIs_primerNombre(atevsam_tipoEntradaValidarSolicitudAlertaMasivaWSDTO.getIs_primerNombre());
		ltevsam_tipoEntradaValidarSolicitudAlertaMasiva
				.setIs_segundoNombre(atevsam_tipoEntradaValidarSolicitudAlertaMasivaWSDTO.getIs_segundoNombre());
		ltevsam_tipoEntradaValidarSolicitudAlertaMasiva
				.setIs_primerApellido(atevsam_tipoEntradaValidarSolicitudAlertaMasivaWSDTO.getIs_primerApellido());
		ltevsam_tipoEntradaValidarSolicitudAlertaMasiva
				.setIs_segundoApellido(atevsam_tipoEntradaValidarSolicitudAlertaMasivaWSDTO.getIs_segundoApellido());
		ltevsam_tipoEntradaValidarSolicitudAlertaMasiva
				.setIs_razonSocial(atevsam_tipoEntradaValidarSolicitudAlertaMasivaWSDTO.getIs_razonSocial());
		ltevsam_tipoEntradaValidarSolicitudAlertaMasiva
				.setIs_modulo(atevsam_tipoEntradaValidarSolicitudAlertaMasivaWSDTO.getIs_modulo());
		ltevsam_tipoEntradaValidarSolicitudAlertaMasiva
				.setIb_archivo(atevsam_tipoEntradaValidarSolicitudAlertaMasivaWSDTO.getIb_archivo());
		ltevsam_tipoEntradaValidarSolicitudAlertaMasiva
				.setIs_matriculaInicial(atevsam_tipoEntradaValidarSolicitudAlertaMasivaWSDTO.getIs_matriculaInicial());
		ltevsam_tipoEntradaValidarSolicitudAlertaMasiva
				.setIs_matriculaFinal(atevsam_tipoEntradaValidarSolicitudAlertaMasivaWSDTO.getIs_matriculaFinal());
		ltevsam_tipoEntradaValidarSolicitudAlertaMasiva
				.setIs_oripSecuencia(atevsam_tipoEntradaValidarSolicitudAlertaMasivaWSDTO.getIs_oripSecuencia());
		return ltevsam_tipoEntradaValidarSolicitudAlertaMasiva;
	}
}
