/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ConsultarTrazabilidadNocWsDtoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: ConsultarTrazabilidadNocWsDtoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.vo.consultartrazabilidadnoc.TipoEntradaTrazabilidadTramiteRegistroNodoCentralVO;
import co.gov.supernotariado.bachue.clientebus.vo.consultartrazabilidadnoc.TipoEstadoTramiteVO;
import co.gov.supernotariado.bachue.clientebus.vo.consultartrazabilidadnoc.TipoSalidaTrazabilidadTramiteRegistroNodoCentralVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaTrazabilidadTramiteRegistroNodoCentralWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEstadoTramiteWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaTrazabilidadTramiteRegistroNodoCentralWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Consultar
 * trazabilidad noc ws dto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ConsultarTrazabilidadNocWsDtoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ConsultarTrazabilidadNocWsDtoConverter.
	 */
	private ConsultarTrazabilidadNocWsDtoConverter() {
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
	 * TipoSalidaTrazabilidadTramiteRegistroNodoCentralVO <b>a</b>
	 * TipoSalidaTrazabilidadTramiteRegistroNodoCentralWSDTO, <br>
	 * En otras palabras, <b>de</b> Tipo salida trazabilidad tramite registro nodo
	 * central objeto con valores de servicio <b>a</b> Tipo salida trazabilidad
	 * tramite registro nodo central web service dto.
	 *
	 * @param atsttrnc_trazabilidadNocVo el parametro trazabilidad noc vo
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como
	 *         TipoSalidaTrazabilidadTramiteRegistroNodoCentralWSDTO
	 */
	public static TipoSalidaTrazabilidadTramiteRegistroNodoCentralWSDTO voAWsDto(
			TipoSalidaTrazabilidadTramiteRegistroNodoCentralVO atsttrnc_trazabilidadNocVo) {
		TipoSalidaTrazabilidadTramiteRegistroNodoCentralWSDTO ltsttrnc_trazabilidadTramiteRegistroNodoCentralWsDto = new TipoSalidaTrazabilidadTramiteRegistroNodoCentralWSDTO();
		ltsttrnc_trazabilidadTramiteRegistroNodoCentralWsDto
				.setIs_codDepartamento(atsttrnc_trazabilidadNocVo.getIs_codDepartamento());
		ltsttrnc_trazabilidadTramiteRegistroNodoCentralWsDto
				.setIs_codMunicipio(atsttrnc_trazabilidadNocVo.getIs_codMunicipio());
		ltsttrnc_trazabilidadTramiteRegistroNodoCentralWsDto
				.setIs_descripcionMensaje(atsttrnc_trazabilidadNocVo.getIs_descripcionMensaje());
		ltsttrnc_trazabilidadTramiteRegistroNodoCentralWsDto
				.setIs_fechaHoraConsulta(atsttrnc_trazabilidadNocVo.getIs_fechaHoraConsulta());
		ltsttrnc_trazabilidadTramiteRegistroNodoCentralWsDto
				.setIs_fechaInstrumento(atsttrnc_trazabilidadNocVo.getIs_fechaInstrumento());
		ltsttrnc_trazabilidadTramiteRegistroNodoCentralWsDto
				.setIs_fechaRadicacion(atsttrnc_trazabilidadNocVo.getIs_fechaRadicacion());
		ltsttrnc_trazabilidadTramiteRegistroNodoCentralWsDto
				.setIs_nomDepartamento(atsttrnc_trazabilidadNocVo.getIs_nomDepartamento());
		ltsttrnc_trazabilidadTramiteRegistroNodoCentralWsDto
				.setIs_nomMunicipio(atsttrnc_trazabilidadNocVo.getIs_nomMunicipio());
		ltsttrnc_trazabilidadTramiteRegistroNodoCentralWsDto
				.setIs_nomTipoDocumentoPublico(atsttrnc_trazabilidadNocVo.getIs_nomTipoDocumentoPublico());
		ltsttrnc_trazabilidadTramiteRegistroNodoCentralWsDto
				.setIs_numeroConsulta(atsttrnc_trazabilidadNocVo.getIs_numeroConsulta());
		ltsttrnc_trazabilidadTramiteRegistroNodoCentralWsDto
				.setIs_numeroInstrumento(atsttrnc_trazabilidadNocVo.getIs_numeroInstrumento());
		ltsttrnc_trazabilidadTramiteRegistroNodoCentralWsDto
				.setIs_oficinaOrigen(atsttrnc_trazabilidadNocVo.getIs_oficinaOrigen());
		ltsttrnc_trazabilidadTramiteRegistroNodoCentralWsDto.setIltet_estadosTramiteWsDto(
				listaEstadosTramite(atsttrnc_trazabilidadNocVo.getIltet_estadosTramiteVo()));
		return ltsttrnc_trazabilidadTramiteRegistroNodoCentralWsDto;
	}

	/**
	 * Metodo que convierte de una lista de VO a una lista de WSDTO (De Objetos de
	 * valores de Servicio, a Objetos de Transferencia de Datos de Servicio
	 * Web).<br>
	 * Se usa para convertir una lista de resultados o salidas de servicio(objetos
	 * VO) a una lista de objetos WSDTO para ser manipulados en la capa de negocio.
	 * <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> una TipoEstadoTramiteVO <b>a</b> una
	 * TipoEstadoTramiteWSDTO, <br>
	 * En otras palabras, <b>de</b> una Tipo estado tramite objeto con valores de
	 * servicio <b>a</b> una Tipo estado tramite web service dto.
	 *
	 * @param altet_estadosTramiteVo el parametro estados tramite vo
	 * @return Resultado para convertir de lista de valores de servicio a lista de
	 *         web service dto, retornado como una lista de TipoEstadoTramiteWSDTO
	 */
	private static List<TipoEstadoTramiteWSDTO> listaEstadosTramite(List<TipoEstadoTramiteVO> altet_estadosTramiteVo) {
		List<TipoEstadoTramiteWSDTO> lltet_listaTipoEstadoTramiteWsDto = new ArrayList<>();
		for (TipoEstadoTramiteVO ltet_tipoEstadoTramiteVo : altet_estadosTramiteVo) {
			TipoEstadoTramiteWSDTO ltet_tipoEstadoTramiteWsDto = new TipoEstadoTramiteWSDTO();
			ltet_tipoEstadoTramiteWsDto.setIb_pasoPorEstado(ltet_tipoEstadoTramiteVo.getIb_pasoPorEstado());
			ltet_tipoEstadoTramiteWsDto.setIs_codigoEstado(ltet_tipoEstadoTramiteVo.getIs_codigoEstado());
			ltet_tipoEstadoTramiteWsDto.setIs_fechaInicioEtapa(ltet_tipoEstadoTramiteVo.getIs_fechaInicioEtapa());
			lltet_listaTipoEstadoTramiteWsDto.add(ltet_tipoEstadoTramiteWsDto);
		}
		return lltet_listaTipoEstadoTramiteWsDto;
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
	 * TipoEntradaTrazabilidadTramiteRegistroNodoCentralWSDTO <b>a</b>
	 * TipoEntradaTrazabilidadTramiteRegistroNodoCentralVO, <br>
	 * En otras palabras, <b>de</b> Tipo entrada trazabilidad tramite registro nodo
	 * central web service dto <b>a</b> Tipo entrada trazabilidad tramite registro
	 * nodo central objeto con valores de servicio.
	 *
	 * @param atettrnc_trazabilidadNodoCentralWsDto el parametro trazabilidad nodo
	 *                                              central ws dto
	 * @return Resultado para convertir web service dto a objeto de valores de
	 *         servicio, retornado como
	 *         TipoEntradaTrazabilidadTramiteRegistroNodoCentralVO
	 */
	public static TipoEntradaTrazabilidadTramiteRegistroNodoCentralVO wsDtoAVo(
			TipoEntradaTrazabilidadTramiteRegistroNodoCentralWSDTO atettrnc_trazabilidadNodoCentralWsDto) {
		TipoEntradaTrazabilidadTramiteRegistroNodoCentralVO ltettrnc_tipoEntradaTrazabilidadTramiteNodoCentralVo = new TipoEntradaTrazabilidadTramiteRegistroNodoCentralVO();
		ltettrnc_tipoEntradaTrazabilidadTramiteNodoCentralVo
				.setIs_codCirculoRegisral(atettrnc_trazabilidadNodoCentralWsDto.getIs_codCirculoRegisral());
		ltettrnc_tipoEntradaTrazabilidadTramiteNodoCentralVo
				.setIs_radicacion(atettrnc_trazabilidadNodoCentralWsDto.getIs_radicacion());
		return ltettrnc_tipoEntradaTrazabilidadTramiteNodoCentralVo;
	}
}
