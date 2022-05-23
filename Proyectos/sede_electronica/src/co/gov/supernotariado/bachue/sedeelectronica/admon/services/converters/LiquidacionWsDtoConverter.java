/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: LiquidacionWsDtoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: LiquidacionWsDtoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.vo.operacionesfinancieras.TipoCriterioGLIVO;
import co.gov.supernotariado.bachue.clientebus.vo.operacionesfinancieras.TipoEntradaGenerarLiquidacionVO;
import co.gov.supernotariado.bachue.clientebus.vo.operacionesfinancieras.TipoSalidaGenerarLiquidacionVO;
import co.gov.supernotariado.bachue.clientebus.vo.operacionesfinancieras.TipoServicioGLIVO;
import co.gov.supernotariado.bachue.clientebus.vo.operacionesfinancieras.TipoServicioGLOVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoCriterioGLIWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaGenerarLiquidacionWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaGenerarLiquidacionWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoServicioGLIWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoServicioGLOWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Liquidacion ws
 * dto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class LiquidacionWsDtoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase LiquidacionWsDtoConverter.
	 */
	private LiquidacionWsDtoConverter() {
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
	 * Especificamente convierte <b>de</b> TipoEntradaGenerarLiquidacionWSDTO
	 * <b>a</b> TipoEntradaGenerarLiquidacionVO, <br>
	 * En otras palabras, <b>de</b> Tipo entrada generar liquidacion web service dto
	 * <b>a</b> Tipo entrada generar liquidacion objeto con valores de servicio.
	 *
	 * @param ale_liquidacionEntrada el parametro liquidacion entrada
	 * @return Resultado para convertir web service dto a objeto de valores de
	 *         servicio, retornado como TipoEntradaGenerarLiquidacionVO
	 */
	public static TipoEntradaGenerarLiquidacionVO dtoAVo(TipoEntradaGenerarLiquidacionWSDTO ale_liquidacionEntrada) {

		TipoEntradaGenerarLiquidacionVO ltegl_tipoEntradaGenerarLiquidacion = new TipoEntradaGenerarLiquidacionVO();

		ltegl_tipoEntradaGenerarLiquidacion.setIs_codigoCanal(ale_liquidacionEntrada.getIs_codigoCanal());
		ltegl_tipoEntradaGenerarLiquidacion
				.setIs_codigoSucursalCanal(ale_liquidacionEntrada.getIs_codigoSucursalCanal());
		ltegl_tipoEntradaGenerarLiquidacion.setIs_oripSolicitud(ale_liquidacionEntrada.getIs_oripSolicitud());
		ltegl_tipoEntradaGenerarLiquidacion.setIs_codigoConvenio(ale_liquidacionEntrada.getIs_codigoConvenio());
		ltegl_tipoEntradaGenerarLiquidacion
				.setIs_numeroDocSolicitante(ale_liquidacionEntrada.getIs_numeroDocSolicitante());
		ltegl_tipoEntradaGenerarLiquidacion
				.setIs_primerApellidoSolicitante(ale_liquidacionEntrada.getIs_primerApellidoSolicitante());
		ltegl_tipoEntradaGenerarLiquidacion
				.setIs_segundoApellidoSolicitante(ale_liquidacionEntrada.getIs_segundoApellidoSolicitante());
		ltegl_tipoEntradaGenerarLiquidacion
				.setIs_primerNombreSolicitante(ale_liquidacionEntrada.getIs_primerNombreSolicitante());
		ltegl_tipoEntradaGenerarLiquidacion
				.setIs_segundoNombreSolicitante(ale_liquidacionEntrada.getIs_segundoNombreSolicitante());
		ltegl_tipoEntradaGenerarLiquidacion.setIs_tipoDocSolicitante(ale_liquidacionEntrada.getIs_tipoDocSolicitante());
		ltegl_tipoEntradaGenerarLiquidacion.setIs_tipoPersona(ale_liquidacionEntrada.getIs_tipoPersona());
		ltegl_tipoEntradaGenerarLiquidacion.setIs_razonSocial(ale_liquidacionEntrada.getIs_razonSocial());
		ltegl_tipoEntradaGenerarLiquidacion.setIlts_listaTipoServicioVo(
				dtoAVoServicio(ale_liquidacionEntrada.getIlts_listaTipoServicioLiquidacionWsDto()));

		return ltegl_tipoEntradaGenerarLiquidacion;
	}

	/**
	 * Metodo que convierte de una lista de WSDTO a una lista de VO ( De Objetos de
	 * Transferencia de Datos de Servicio Web, a Objetos de valores de
	 * Servicio).<br>
	 * Se usa para convertir una lista de objetos WSDTO manipulados en la capa de
	 * negocio, en una lista de entrada de datos para consumir una operacion de un
	 * servicio(objetos VO). <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoServicioGLIWSDTO <b>a</b>
	 * TipoServicioGLIVO, <br>
	 * En otras palabras, <b>de</b> Tipo servicio GLIWSDTO <b>a</b> Tipo servicio
	 * GLIVO.
	 *
	 * @param altsg_tipoServicio el parametro tipo servicio
	 * @return Resultado para convertir de lista de web service dto a lista de
	 *         valores de servicio, retornado como una lista de TipoServicioGLIVO
	 */
	public static List<TipoServicioGLIVO> dtoAVoServicio(List<TipoServicioGLIWSDTO> altsg_tipoServicio) {
		List<TipoServicioGLIVO> ltsg_tipoServicio = new ArrayList<>();

		for (TipoServicioGLIWSDTO ltsg_tipoServicioGLIDTO : altsg_tipoServicio) {
			TipoServicioGLIVO ltsg_tipoServicioGLIVO = new TipoServicioGLIVO();

			ltsg_tipoServicioGLIVO.setIltc_criterios(dtoAVoCriterio(ltsg_tipoServicioGLIDTO.getIltc_criterios()));
			ltsg_tipoServicioGLIVO.setIs_cantidadSolicitada(ltsg_tipoServicioGLIDTO.getIs_cantidadSolicitada());
			ltsg_tipoServicioGLIVO.setIs_subtipoServicio(ltsg_tipoServicioGLIDTO.getIs_subtipoServicio());
			ltsg_tipoServicioGLIVO.setIs_tipoServicio(ltsg_tipoServicioGLIDTO.getIs_tipoServicio());
			ltsg_tipoServicioGLIVO.setIs_valorServicio(ltsg_tipoServicioGLIDTO.getIs_valorServicio());

			ltsg_tipoServicio.add(ltsg_tipoServicioGLIVO);
		}

		return ltsg_tipoServicio;
	}

	/**
	 * Metodo que convierte de una lista de WSDTO a una lista de VO ( De Objetos de
	 * Transferencia de Datos de Servicio Web, a Objetos de valores de
	 * Servicio).<br>
	 * Se usa para convertir una lista de objetos WSDTO manipulados en la capa de
	 * negocio, en una lista de entrada de datos para consumir una operacion de un
	 * servicio(objetos VO). <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoCriterioGLIWSDTO <b>a</b>
	 * TipoCriterioGLIVO, <br>
	 * En otras palabras, <b>de</b> Tipo criterio GLIWSDTO <b>a</b> Tipo criterio
	 * GLIVO.
	 *
	 * @param altc_listaTipoCreditoWsDto el parametro lista tipo credito ws dto
	 * @return Resultado para convertir de lista de web service dto a lista de
	 *         valores de servicio, retornado como una lista de TipoCriterioGLIVO
	 */
	public static List<TipoCriterioGLIVO> dtoAVoCriterio(List<TipoCriterioGLIWSDTO> altc_listaTipoCreditoWsDto) {

		List<TipoCriterioGLIVO> lltc_listaTipoCriterioWsDto = new ArrayList<>();

		for (TipoCriterioGLIWSDTO ltc_tipoCriterioWsDto : altc_listaTipoCreditoWsDto) {
			TipoCriterioGLIVO ltc_tipoCriterioGLIVO = new TipoCriterioGLIVO();

			ltc_tipoCriterioGLIVO.setIs_codigo(ltc_tipoCriterioWsDto.getIs_codigo());
			ltc_tipoCriterioGLIVO.setIs_valor(ltc_tipoCriterioWsDto.getIs_valor());

			lltc_listaTipoCriterioWsDto.add(ltc_tipoCriterioGLIVO);

		}

		return lltc_listaTipoCriterioWsDto;
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaGenerarLiquidacionVO <b>a</b>
	 * TipoSalidaGenerarLiquidacionWSDTO, <br>
	 * En otras palabras, <b>de</b> Tipo salida generar liquidacion objeto con
	 * valores de servicio <b>a</b> Tipo salida generar liquidacion web service dto.
	 *
	 * @param ltsgl_generarLiqudacionVo el parametro ltsgl generar liqudacion vo
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como TipoSalidaGenerarLiquidacionWSDTO
	 */
	public static TipoSalidaGenerarLiquidacionWSDTO voADto(TipoSalidaGenerarLiquidacionVO ltsgl_generarLiqudacionVo) {

		TipoSalidaGenerarLiquidacionWSDTO ltsgl_tipoSalidaGenerarLiquidacionWsDto = new TipoSalidaGenerarLiquidacionWSDTO();

		ltsgl_tipoSalidaGenerarLiquidacionWsDto
				.setIbd_valorTotalServicio(ltsgl_generarLiqudacionVo.getIbd_valorTotalServicio());
		ltsgl_tipoSalidaGenerarLiquidacionWsDto.setIbi_codigoMensaje(ltsgl_generarLiqudacionVo.getIbi_codigoMensaje());
		ltsgl_tipoSalidaGenerarLiquidacionWsDto
				.setId_fechaVencimiento(ltsgl_generarLiqudacionVo.getId_fechaVencimiento());
		ltsgl_tipoSalidaGenerarLiquidacionWsDto
				.setIs_descripcionMensaje(ltsgl_generarLiqudacionVo.getIs_descripcionMensaje());
		ltsgl_tipoSalidaGenerarLiquidacionWsDto.setIs_nir(ltsgl_generarLiqudacionVo.getIs_nir());
		ltsgl_tipoSalidaGenerarLiquidacionWsDto
				.setIs_numeroReferencia(ltsgl_generarLiqudacionVo.getIs_numeroReferencia());

		ltsgl_tipoSalidaGenerarLiquidacionWsDto.setIlts_listaServiciosLiquidadosWsDto(
				dtoAVoServicioSalida(ltsgl_generarLiqudacionVo.getIlts_serviciosLiquidadosVo()));

		return ltsgl_tipoSalidaGenerarLiquidacionWsDto;
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
	 * Especificamente convierte <b>de</b> una TipoServicioGLOVO <b>a</b> una
	 * TipoServicioGLOWSDTO, <br>
	 * En otras palabras, <b>de</b> una Tipo servicio GLOVO <b>a</b> una Tipo
	 * servicio GLOWSDTO.
	 *
	 * @param altsg_tipoServicio el parametro tipo servicio
	 * @return Resultado para convertir de lista de valores de servicio a lista de
	 *         web service dto, retornado como una lista de TipoServicioGLOWSDTO
	 */
	public static List<TipoServicioGLOWSDTO> dtoAVoServicioSalida(List<TipoServicioGLOVO> altsg_tipoServicio) {
		List<TipoServicioGLOWSDTO> lltsg_tipoServicio = new ArrayList<>();

		if (altsg_tipoServicio != null) {
			for (TipoServicioGLOVO ltsg_tipoServicioGLIDTO : altsg_tipoServicio) {
				TipoServicioGLOWSDTO ltsg_tipoServicio = new TipoServicioGLOWSDTO();

				ltsg_tipoServicio.setIs_cantidadSolicitada(ltsg_tipoServicioGLIDTO.getIs_cantidadSolicitada());
				ltsg_tipoServicio.setIs_subtipoServicio(ltsg_tipoServicioGLIDTO.getIs_subtipoServicio());
				ltsg_tipoServicio.setIs_tipoServicio(ltsg_tipoServicioGLIDTO.getIs_tipoServicio());
				ltsg_tipoServicio.setIs_valorServicio(ltsg_tipoServicioGLIDTO.getIs_valorServicio());

				lltsg_tipoServicio.add(ltsg_tipoServicio);
			}
		}
		return lltsg_tipoServicio;
	}

}
