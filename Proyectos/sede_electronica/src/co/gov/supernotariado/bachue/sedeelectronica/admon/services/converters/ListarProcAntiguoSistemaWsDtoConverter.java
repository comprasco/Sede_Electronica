/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ListarProcAntiguoSistemaWsDtoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: ListarProcAntiguoSistemaWsDtoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.ProcesoASVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoEntradaListarProcAntiguoSistemaVO;
import co.gov.supernotariado.bachue.clientebus.vo.alertatierras.TipoSalidaListarProcAntiguoSistemaVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.ProcesoASWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaListarProcAntiguoSistemaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaListarProcAntiguoSistemaWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Listar proc
 * antiguo sistema ws dto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ListarProcAntiguoSistemaWsDtoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ListarProcAntiguoSistemaWsDtoConverter.
	 */
	private ListarProcAntiguoSistemaWsDtoConverter() {
		// Constructor vacio de la clase
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> ProcesoASVO <b>a</b> ProcesoASWSDTO, <br>
	 * En otras palabras, <b>de</b> Proceso ASVO <b>a</b> Proceso ASWSDTO.
	 *
	 * @param ap_procesoASVo el parametro proceso AS vo
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como ProcesoASWSDTO
	 */
	public static ProcesoASWSDTO entidadAVoProcesoAS(ProcesoASVO ap_procesoASVo) {
		ProcesoASWSDTO lp_procesoASWsDto = new ProcesoASWSDTO();

		lp_procesoASWsDto.setIi_idAlerta(ap_procesoASVo.getIi_idAlerta());
		lp_procesoASWsDto.setIs_nomCirculoRegistral(ap_procesoASVo.getIs_nomCirculoRegistral());
		lp_procesoASWsDto.setIs_nomPais(ap_procesoASVo.getIs_nomPais());
		lp_procesoASWsDto.setIs_nomDepartamento(ap_procesoASVo.getIs_nomDepartamento());
		lp_procesoASWsDto.setIs_nomMunicipio(ap_procesoASVo.getIs_nomMunicipio());
		lp_procesoASWsDto.setIs_tipoPredio(ap_procesoASVo.getIs_tipoPredio());
		lp_procesoASWsDto.setIi_numLibro(ap_procesoASVo.getIi_numLibro());
		lp_procesoASWsDto.setIi_numTomo(ap_procesoASVo.getIi_numTomo());
		lp_procesoASWsDto.setIs_idTipoPartida(ap_procesoASVo.getIs_idTipoPartida());
		lp_procesoASWsDto.setIi_numPartida(ap_procesoASVo.getIi_numPartida());
		lp_procesoASWsDto.setIi_numFolio(ap_procesoASVo.getIi_numFolio());
		lp_procesoASWsDto.setIi_anio(ap_procesoASVo.getIi_anio());
		lp_procesoASWsDto.setIs_nomPredio(ap_procesoASVo.getIs_nomPredio());
		lp_procesoASWsDto.setIi_numPredio(ap_procesoASVo.getIi_numPredio());

		return lp_procesoASWsDto;
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
	 * Especificamente convierte <b>de</b> una ProcesoASVO <b>a</b> una
	 * ProcesoASWSDTO, <br>
	 * En otras palabras, <b>de</b> una Proceso ASVO <b>a</b> una Proceso ASWSDTO.
	 *
	 * @param alp_listaProcesoASVo el parametro lista proceso AS vo
	 * @return Resultado para convertir de lista de valores de servicio a lista de
	 *         web service dto, retornado como una lista de ProcesoASWSDTO
	 */
	public static List<ProcesoASWSDTO> listaEntidadAListaVo(List<ProcesoASVO> alp_listaProcesoASVo) {
		List<ProcesoASWSDTO> llp_procesoASWsDto = new ArrayList<>();
		for (ProcesoASVO lp_procesoASVo : alp_listaProcesoASVo) {
			llp_procesoASWsDto.add(entidadAVoProcesoAS(lp_procesoASVo));
		}
		return llp_procesoASWsDto;
	}

	/**
	 * Metodo que convierte de WSDTO a VO ( De Objeto de Transferencia de Datos de
	 * Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto WSDTO manipulado en la capa de negocio, en
	 * una entrada de datos para consumir una operacion de un servicio(objeto VO).
	 * <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoEntradaListarProcAntiguoSistemaWSDTO
	 * <b>a</b> TipoEntradaListarProcAntiguoSistemaVO, <br>
	 * En otras palabras, <b>de</b> Tipo entrada listar proc antiguo sistema web
	 * service dto <b>a</b> Tipo entrada listar proc antiguo sistema objeto con
	 * valores de servicio.
	 *
	 * @param atelpas_tipoEntradaListarProcAntiguoSistemaWsDto el parametro tipo
	 *                                                         entrada listar proc
	 *                                                         antiguo sistema ws
	 *                                                         dto
	 * @return Resultado para convertir web service dto a objeto de valores de
	 *         servicio, retornado como TipoEntradaListarProcAntiguoSistemaVO
	 */
	public static TipoEntradaListarProcAntiguoSistemaVO wsDtoAVo(
			TipoEntradaListarProcAntiguoSistemaWSDTO atelpas_tipoEntradaListarProcAntiguoSistemaWsDto) {
		TipoEntradaListarProcAntiguoSistemaVO ltelpas_tipoEntradaListarProcAntiguoSistemaVo = new TipoEntradaListarProcAntiguoSistemaVO();

		ltelpas_tipoEntradaListarProcAntiguoSistemaVo
				.setIi_idAlerta(atelpas_tipoEntradaListarProcAntiguoSistemaWsDto.getIi_idAlerta());

		return ltelpas_tipoEntradaListarProcAntiguoSistemaVo;
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaListarProcAntiguoSistemaVO
	 * <b>a</b> TipoSalidaListarProcAntiguoSistemaWSDTO, <br>
	 * En otras palabras, <b>de</b> Tipo salida listar proc antiguo sistema objeto
	 * con valores de servicio <b>a</b> Tipo salida listar proc antiguo sistema web
	 * service dto.
	 *
	 * @param atslpas_tipoSalidaProcAntiguoSistemaVo el parametro tipo salida proc
	 *                                               antiguo sistema vo
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como TipoSalidaListarProcAntiguoSistemaWSDTO
	 */
	public static TipoSalidaListarProcAntiguoSistemaWSDTO voAWsDto(
			TipoSalidaListarProcAntiguoSistemaVO atslpas_tipoSalidaProcAntiguoSistemaVo) {
		TipoSalidaListarProcAntiguoSistemaWSDTO ltslpas_tipoSalidaProcAntiguoSistemaWsDto = new TipoSalidaListarProcAntiguoSistemaWSDTO();

		ltslpas_tipoSalidaProcAntiguoSistemaWsDto
				.setIs_codigoMensaje(atslpas_tipoSalidaProcAntiguoSistemaVo.getIs_codigo());
		ltslpas_tipoSalidaProcAntiguoSistemaWsDto
				.setIs_descripcionMensaje(atslpas_tipoSalidaProcAntiguoSistemaVo.getIs_mensaje());
		ltslpas_tipoSalidaProcAntiguoSistemaWsDto.setIllp_listaProcesosAS(
				listaEntidadAListaVo(atslpas_tipoSalidaProcAntiguoSistemaVo.getIlp_procesoAS()));

		return ltslpas_tipoSalidaProcAntiguoSistemaWsDto;
	}
}