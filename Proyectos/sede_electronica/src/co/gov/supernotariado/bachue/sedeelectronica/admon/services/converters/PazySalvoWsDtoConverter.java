/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: PazySalvoWsDtoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: PazySalvoWsDtoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import co.gov.supernotariado.bachue.clientebus.vo.consultapazysalvotributario.TipoEntradaConsultarPazySalvoTributarioVO;
import co.gov.supernotariado.bachue.clientebus.vo.consultapazysalvotributario.TipoSalidaConsultarPazySalvoTributarioVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarPazySalvoTributarioWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarPazySalvoTributarioWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Pazy salvo ws
 * dto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */

public class PazySalvoWsDtoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase PazySalvoWsDtoConverter.
	 */
	private PazySalvoWsDtoConverter() {
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
	 * Especificamente convierte <b>de</b>
	 * TipoEntradaConsultarPazySalvoTributarioWSDTO <b>a</b>
	 * TipoEntradaConsultarPazySalvoTributarioVO, <br>
	 * En otras palabras, <b>de</b> Tipo entrada consultar pazy salvo tributario web
	 * service dto <b>a</b> Tipo entrada consultar pazy salvo tributario objeto con
	 * valores de servicio.
	 *
	 * @param atecpst_tipoEntradaConsultarPazySalvoTributarioWSDTO el parametro tipo
	 *                                                             entrada consultar
	 *                                                             pazy salvo
	 *                                                             tributario WSDTO
	 * @return Resultado para convertir web service dto a objeto de valores de
	 *         servicio, retornado como TipoEntradaConsultarPazySalvoTributarioVO
	 */
	public static TipoEntradaConsultarPazySalvoTributarioVO wSDTOAVo(
			TipoEntradaConsultarPazySalvoTributarioWSDTO atecpst_tipoEntradaConsultarPazySalvoTributarioWSDTO) {
		TipoEntradaConsultarPazySalvoTributarioVO ltecpst_tipoEntradaConsultarPazySalvoTributario = new TipoEntradaConsultarPazySalvoTributarioVO();
		ltecpst_tipoEntradaConsultarPazySalvoTributario.setIs_entidadCertificadora(
				atecpst_tipoEntradaConsultarPazySalvoTributarioWSDTO.getIs_entidadCertificadora());
		ltecpst_tipoEntradaConsultarPazySalvoTributario
				.setIs_entidad(atecpst_tipoEntradaConsultarPazySalvoTributarioWSDTO.getIs_entidad());
		ltecpst_tipoEntradaConsultarPazySalvoTributario
				.setIs_usuario(atecpst_tipoEntradaConsultarPazySalvoTributarioWSDTO.getIs_usuario());
		ltecpst_tipoEntradaConsultarPazySalvoTributario
				.setIs_clave(atecpst_tipoEntradaConsultarPazySalvoTributarioWSDTO.getIs_clave());
		ltecpst_tipoEntradaConsultarPazySalvoTributario.setIs_codigoDepartamento(
				atecpst_tipoEntradaConsultarPazySalvoTributarioWSDTO.getIs_codigoDepartamento());
		ltecpst_tipoEntradaConsultarPazySalvoTributario
				.setIs_codigoMunicipio(atecpst_tipoEntradaConsultarPazySalvoTributarioWSDTO.getIs_codigoMunicipio());
		ltecpst_tipoEntradaConsultarPazySalvoTributario
				.setIs_codigoNotaria(atecpst_tipoEntradaConsultarPazySalvoTributarioWSDTO.getIs_codigoNotaria());
		ltecpst_tipoEntradaConsultarPazySalvoTributario.setIs_referenciaCatastral(
				atecpst_tipoEntradaConsultarPazySalvoTributarioWSDTO.getIs_referenciaCatastral());
		ltecpst_tipoEntradaConsultarPazySalvoTributario
				.setIs_numeroMatricula(atecpst_tipoEntradaConsultarPazySalvoTributarioWSDTO.getIs_numeroMatricula());
		ltecpst_tipoEntradaConsultarPazySalvoTributario
				.setIs_chip(atecpst_tipoEntradaConsultarPazySalvoTributarioWSDTO.getIs_chip());
		ltecpst_tipoEntradaConsultarPazySalvoTributario
				.setIs_direccion(atecpst_tipoEntradaConsultarPazySalvoTributarioWSDTO.getIs_direccion());
		ltecpst_tipoEntradaConsultarPazySalvoTributario
				.setIs_impuesto(atecpst_tipoEntradaConsultarPazySalvoTributarioWSDTO.getIs_impuesto());
		ltecpst_tipoEntradaConsultarPazySalvoTributario
				.setIs_pdf(atecpst_tipoEntradaConsultarPazySalvoTributarioWSDTO.getIs_pdf());
		ltecpst_tipoEntradaConsultarPazySalvoTributario
				.setIs_idpersona(atecpst_tipoEntradaConsultarPazySalvoTributarioWSDTO.getIs_idpersona());
		ltecpst_tipoEntradaConsultarPazySalvoTributario
				.setIs_ip(atecpst_tipoEntradaConsultarPazySalvoTributarioWSDTO.getIs_ip());

		return ltecpst_tipoEntradaConsultarPazySalvoTributario;
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaConsultarPazySalvoTributarioVO
	 * <b>a</b> TipoSalidaConsultarPazySalvoTributarioWSDTO, <br>
	 * En otras palabras, <b>de</b> Tipo salida consultar pazy salvo tributario
	 * objeto con valores de servicio <b>a</b> Tipo salida consultar pazy salvo
	 * tributario web service dto.
	 *
	 * @param atscpst_tipoSalidaConsultarPazySalvoTributario el parametro tipo
	 *                                                       salida consultar pazy
	 *                                                       salvo tributario
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como TipoSalidaConsultarPazySalvoTributarioWSDTO
	 */
	public static TipoSalidaConsultarPazySalvoTributarioWSDTO voAWSDTO(
			TipoSalidaConsultarPazySalvoTributarioVO atscpst_tipoSalidaConsultarPazySalvoTributario) {

		TipoSalidaConsultarPazySalvoTributarioWSDTO ltscpst_tipoSalidaConsultarPazySalvoTributarioWSDTO = new TipoSalidaConsultarPazySalvoTributarioWSDTO();
		ltscpst_tipoSalidaConsultarPazySalvoTributarioWSDTO
				.setIb_pdfCertificado(atscpst_tipoSalidaConsultarPazySalvoTributario.getIb_pdfCertificado());
		ltscpst_tipoSalidaConsultarPazySalvoTributarioWSDTO
				.setIs_codigoMensaje(atscpst_tipoSalidaConsultarPazySalvoTributario.getIs_codigoMensaje());
		ltscpst_tipoSalidaConsultarPazySalvoTributarioWSDTO
				.setIs_descripcionMensaje(atscpst_tipoSalidaConsultarPazySalvoTributario.getIs_descripcionMensaje());

		return ltscpst_tipoSalidaConsultarPazySalvoTributarioWSDTO;
	}
}
