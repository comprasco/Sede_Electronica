/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BusquedaDocumentosConsultarWsDtoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: BusquedaDocumentosConsultarWsDtoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import co.gov.supernotariado.bachue.clientebus.vo.busquedadocumentos.TipoEntradaConsultarVO;
import co.gov.supernotariado.bachue.clientebus.vo.busquedadocumentos.TipoSalidaConsultarVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Busqueda
 * documentos consultar ws dto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class BusquedaDocumentosConsultarWsDtoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * BusquedaDocumentosConsultarWsDtoConverter.
	 */
	private BusquedaDocumentosConsultarWsDtoConverter() {
		// Constructor vacio de la clase
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaConsultarVO <b>a</b>
	 * TipoSalidaConsultarWSDTO, <br>
	 * En otras palabras, <b>de</b> Tipo salida consultar objeto con valores de
	 * servicio <b>a</b> Tipo salida consultar web service dto.
	 *
	 * @param atsc_tipoSalidaConsultarVo el parametro tipo salida consultar vo
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como TipoSalidaConsultarWSDTO
	 */
	public static TipoSalidaConsultarWSDTO voAWsDto(TipoSalidaConsultarVO atsc_tipoSalidaConsultarVo) {
		TipoSalidaConsultarWSDTO ltsc_tipoSalidaConsultarWSDTO = new TipoSalidaConsultarWSDTO();
		ltsc_tipoSalidaConsultarWSDTO
				.setIldbd_listaDocumentoBusquedaDocumentosWsDto(DocumentoBusquedaDocumentosWsDtoConverter
						.listaVOAListaWsDto(atsc_tipoSalidaConsultarVo.getIld_listaDocumentosVo()));
		ltsc_tipoSalidaConsultarWSDTO.setIs_codigoMensaje(atsc_tipoSalidaConsultarVo.getIs_codigoMensaje());
		ltsc_tipoSalidaConsultarWSDTO.setIs_descripcionMensaje(atsc_tipoSalidaConsultarVo.getIs_descripcionMensaje());
		return ltsc_tipoSalidaConsultarWSDTO;
	}

	/**
	 * Metodo que convierte de WSDTO a VO ( De Objeto de Transferencia de Datos de
	 * Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto WSDTO manipulado en la capa de negocio, en
	 * una entrada de datos para consumir una operacion de un servicio(objeto VO).
	 * <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoEntradaConsultarWSDTO <b>a</b>
	 * TipoEntradaConsultarVO, <br>
	 * En otras palabras, <b>de</b> Tipo entrada consultar web service dto <b>a</b>
	 * Tipo entrada consultar objeto con valores de servicio.
	 *
	 * @param atec_tipoEntradaConsultarWSDTO el parametro tipo entrada consultar
	 *                                       WSDTO
	 * @return Resultado para convertir web service dto a objeto de valores de
	 *         servicio, retornado como TipoEntradaConsultarVO
	 */
	public static TipoEntradaConsultarVO wsDtoAVo(TipoEntradaConsultarWSDTO atec_tipoEntradaConsultarWSDTO) {
		TipoEntradaConsultarVO ltec_tipoEntradaConsultar = new TipoEntradaConsultarVO();
		ltec_tipoEntradaConsultar.setIs_sistemaOrigen(atec_tipoEntradaConsultarWSDTO.getIs_sistemaOrigen());
		ltec_tipoEntradaConsultar.setIlp_listaParametrosVo(ParametroBusquedaDocumentosWsDtoConverter
				.listaWsDtoAListaVo(atec_tipoEntradaConsultarWSDTO.getIlp_listaParametrosVo()));
		ltec_tipoEntradaConsultar.setIs_repositorio(atec_tipoEntradaConsultarWSDTO.getIs_repositorio());
		return ltec_tipoEntradaConsultar;
	}
}
