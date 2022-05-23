/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ConsultarAlertasWsDtoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: ConsultarAlertasWsDtoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoEntradaConsultarAlertasVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoSalidaConsultarAlertasVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarAlertasWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarAlertasWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Consultar
 * alertas ws dto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ConsultarAlertasWsDtoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ConsultarAlertasWsDtoConverter.
	 */
	private ConsultarAlertasWsDtoConverter() {
		// Constructor vacio de la clase
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaConsultarAlertasVO <b>a</b>
	 * TipoSalidaConsultarAlertasWSDTO, <br>
	 * En otras palabras, <b>de</b> Tipo salida consultar alertas objeto con valores
	 * de servicio <b>a</b> Tipo salida consultar alertas web service dto.
	 *
	 * @param atsca_tipoSalidaConsultarAlertasVo el parametro tipo salida consultar
	 *                                           alertas vo
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como TipoSalidaConsultarAlertasWSDTO
	 */
	public static TipoSalidaConsultarAlertasWSDTO voAWsDto(
			TipoSalidaConsultarAlertasVO atsca_tipoSalidaConsultarAlertasVo) {
		TipoSalidaConsultarAlertasWSDTO ltsca_tipoSalidaConsultarAlertasWsDto = new TipoSalidaConsultarAlertasWSDTO();
		ltsca_tipoSalidaConsultarAlertasWsDto.setIlla_listaAlertasWsDto(ListaAlertasWsDtoConverter
				.listaVOAListaWsDto(atsca_tipoSalidaConsultarAlertasVo.getIlla_listaAlertasVo()));
		ltsca_tipoSalidaConsultarAlertasWsDto.setIs_codigoMensaje(atsca_tipoSalidaConsultarAlertasVo.getIs_codigo());
		ltsca_tipoSalidaConsultarAlertasWsDto
				.setIs_descripcionMensaje(atsca_tipoSalidaConsultarAlertasVo.getIs_mensaje());
		return ltsca_tipoSalidaConsultarAlertasWsDto;
	}

	/**
	 * Metodo que convierte de WSDTO a VO ( De Objeto de Transferencia de Datos de
	 * Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto WSDTO manipulado en la capa de negocio, en
	 * una entrada de datos para consumir una operacion de un servicio(objeto VO).
	 * <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoEntradaConsultarAlertasWSDTO <b>a</b>
	 * TipoEntradaConsultarAlertasVO, <br>
	 * En otras palabras, <b>de</b> Tipo entrada consultar alertas web service dto
	 * <b>a</b> Tipo entrada consultar alertas objeto con valores de servicio.
	 *
	 * @param ateca_tipoEntradaConsultarAlertasWsDto el parametro tipo entrada
	 *                                               consultar alertas ws dto
	 * @return Resultado para convertir web service dto a objeto de valores de
	 *         servicio, retornado como TipoEntradaConsultarAlertasVO
	 */
	public static TipoEntradaConsultarAlertasVO wsDtoAVo(
			TipoEntradaConsultarAlertasWSDTO ateca_tipoEntradaConsultarAlertasWsDto) {
		TipoEntradaConsultarAlertasVO lteca_tipoEntradaConsultarAlertasVo = new TipoEntradaConsultarAlertasVO();
		lteca_tipoEntradaConsultarAlertasVo
				.setId_fechaInscripcion(ateca_tipoEntradaConsultarAlertasWsDto.getId_fechaInscripcion());
		lteca_tipoEntradaConsultarAlertasVo.setIi_numMatriculaInmobiliaria(
				ateca_tipoEntradaConsultarAlertasWsDto.getIi_numMatriculaInmobiliaria());
		lteca_tipoEntradaConsultarAlertasVo
				.setIs_codCirculoRegistral(ateca_tipoEntradaConsultarAlertasWsDto.getIs_codCirculoRegistral());
		lteca_tipoEntradaConsultarAlertasVo
				.setIs_codigoEstado(ateca_tipoEntradaConsultarAlertasWsDto.getIs_codigoEstado());
		lteca_tipoEntradaConsultarAlertasVo
				.setIs_codTipoDocumentoPublico(ateca_tipoEntradaConsultarAlertasWsDto.getIs_codTipoDocumentoPublico());
		lteca_tipoEntradaConsultarAlertasVo.setIs_esSNR(ateca_tipoEntradaConsultarAlertasWsDto.getIs_esSNR());
		lteca_tipoEntradaConsultarAlertasVo.setIs_idEntidad(ateca_tipoEntradaConsultarAlertasWsDto.getIs_idEntidad());
		lteca_tipoEntradaConsultarAlertasVo
				.setIs_nombreComunidadEtnica(ateca_tipoEntradaConsultarAlertasWsDto.getIs_nombreComunidadEtnica());
		return lteca_tipoEntradaConsultarAlertasVo;
	}
}
