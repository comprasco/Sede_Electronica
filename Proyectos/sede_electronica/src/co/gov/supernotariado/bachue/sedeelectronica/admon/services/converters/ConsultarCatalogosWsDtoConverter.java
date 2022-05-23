/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ConsultarCatalogosWsDtoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: ConsultarCatalogosWsDtoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import co.gov.supernotariado.bachue.clientebus.vo.consultacatalogos.TipoEntradaConsultarCatalogosVO;
import co.gov.supernotariado.bachue.clientebus.vo.consultacatalogos.TipoSalidaConsultarCatalogosVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarCatalogosWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarCatalogosWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Consultar
 * catalogos ws dto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ConsultarCatalogosWsDtoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ConsultarCatalogosWsDtoConverter.
	 */
	private ConsultarCatalogosWsDtoConverter() {
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
	 * Especificamente convierte <b>de</b> TipoEntradaConsultarCatalogosWSDTO
	 * <b>a</b> TipoEntradaConsultarCatalogosVO, <br>
	 * En otras palabras, <b>de</b> Tipo entrada consultar catalogos web service dto
	 * <b>a</b> Tipo entrada consultar catalogos objeto con valores de servicio.
	 *
	 * @param atecc_tipoEntradaConsultarCatalogosWSDTO el parametro tipo entrada
	 *                                                 consultar catalogos WSDTO
	 * @return Resultado para convertir web service dto a objeto de valores de
	 *         servicio, retornado como TipoEntradaConsultarCatalogosVO
	 */
	public static TipoEntradaConsultarCatalogosVO voAEntidad(
			TipoEntradaConsultarCatalogosWSDTO atecc_tipoEntradaConsultarCatalogosWSDTO) {
		TipoEntradaConsultarCatalogosVO ltecc_tipoEntradaConsultarCatalogos = new TipoEntradaConsultarCatalogosVO();
		ltecc_tipoEntradaConsultarCatalogos.setIs_modulo(atecc_tipoEntradaConsultarCatalogosWSDTO.getIs_modulo());
		ltecc_tipoEntradaConsultarCatalogos.setIs_catalogo(atecc_tipoEntradaConsultarCatalogosWSDTO.getIs_catalogo());
		ltecc_tipoEntradaConsultarCatalogos.setIs_parametro(atecc_tipoEntradaConsultarCatalogosWSDTO.getIs_parametro());
		return ltecc_tipoEntradaConsultarCatalogos;
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaConsultarCatalogosVO <b>a</b>
	 * TipoSalidaConsultarCatalogosWSDTO, <br>
	 * En otras palabras, <b>de</b> Tipo salida consultar catalogos objeto con
	 * valores de servicio <b>a</b> Tipo salida consultar catalogos web service dto.
	 *
	 * @param atscc_tipoSalidaConsultarCatalogos el parametro tipo salida consultar
	 *                                           catalogos
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como TipoSalidaConsultarCatalogosWSDTO
	 */
	public static TipoSalidaConsultarCatalogosWSDTO entidadAVo(
			TipoSalidaConsultarCatalogosVO atscc_tipoSalidaConsultarCatalogos) {
		TipoSalidaConsultarCatalogosWSDTO ltscc_tipoSalidaConsultarCatalogosWSDTO = new TipoSalidaConsultarCatalogosWSDTO();
		ltscc_tipoSalidaConsultarCatalogosWSDTO.setIlc_listaCatalogo(CatalogoConsultarCatalogosWsDtoConverter
				.listaEntidadAListaVo(atscc_tipoSalidaConsultarCatalogos.getIlc_listaCatalogo()));
		ltscc_tipoSalidaConsultarCatalogosWSDTO
				.setIs_codigoMensaje(atscc_tipoSalidaConsultarCatalogos.getIs_codigoMensaje());
		ltscc_tipoSalidaConsultarCatalogosWSDTO
				.setIs_descripcionMensaje(atscc_tipoSalidaConsultarCatalogos.getIs_descripcionMensaje());
		return ltscc_tipoSalidaConsultarCatalogosWSDTO;
	}
}
