/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TarifaServicioEntradaWsDtoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: TarifaServicioEntradaWsDtoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.vo.operacionesfinancieras.TipoCriterioCTSIVO;
import co.gov.supernotariado.bachue.clientebus.vo.operacionesfinancieras.TipoEntradaConsultarTarifaServicioVO;
import co.gov.supernotariado.bachue.clientebus.vo.operacionesfinancieras.TipoServicioCTSIVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoCriterioCTSIWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarTarifaServicioWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoServicioCTSIWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Tarifa servicio
 * entrada ws dto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TarifaServicioEntradaWsDtoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * TarifaServicioEntradaWsDtoConverter.
	 */
	private TarifaServicioEntradaWsDtoConverter() {
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
	 * Especificamente convierte <b>de</b> TipoEntradaConsultarTarifaServicioWSDTO
	 * <b>a</b> TipoEntradaConsultarTarifaServicioVO, <br>
	 * En otras palabras, <b>de</b> Tipo entrada consultar tarifa servicio web
	 * service dto <b>a</b> Tipo entrada consultar tarifa servicio objeto con
	 * valores de servicio.
	 *
	 * @param atects_consultarTarifaServicioEntradaWsDto el parametro consultar
	 *                                                   tarifa servicio entrada ws
	 *                                                   dto
	 * @return Resultado para convertir web service dto a objeto de valores de
	 *         servicio, retornado como TipoEntradaConsultarTarifaServicioVO
	 */
	public static TipoEntradaConsultarTarifaServicioVO dtoAVo(
			TipoEntradaConsultarTarifaServicioWSDTO atects_consultarTarifaServicioEntradaWsDto) {
		TipoEntradaConsultarTarifaServicioVO ltects_tipoEntradaConsultarServicio = new TipoEntradaConsultarTarifaServicioVO();

		ltects_tipoEntradaConsultarServicio
				.setIltsc_servicios(dtoAVoServicio(atects_consultarTarifaServicioEntradaWsDto.getIltsc_servicios()));

		ltects_tipoEntradaConsultarServicio
				.setIs_canalOrigen(atects_consultarTarifaServicioEntradaWsDto.getIs_canalOrigen());
		ltects_tipoEntradaConsultarServicio
				.setIs_codigoConvenio(atects_consultarTarifaServicioEntradaWsDto.getIs_codigoConvenio());
		ltects_tipoEntradaConsultarServicio
				.setIs_numeroDocSolicitante(atects_consultarTarifaServicioEntradaWsDto.getIs_numeroDocSolicitante());
		ltects_tipoEntradaConsultarServicio
				.setIs_tipoDocSolicitante(atects_consultarTarifaServicioEntradaWsDto.getIs_tipoDocSolicitante());

		return ltects_tipoEntradaConsultarServicio;
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
	 * Especificamente convierte <b>de</b> TipoServicioCTSIWSDTO <b>a</b>
	 * TipoServicioCTSIVO, <br>
	 * En otras palabras, <b>de</b> Tipo servicio CTSIWSDTO <b>a</b> Tipo servicio
	 * CTSIVO.
	 *
	 * @param altsc_tarifaServicioEntradaDTO el parametro tarifa servicio entrada
	 *                                       DTO
	 * @return Resultado para convertir de lista de web service dto a lista de
	 *         valores de servicio, retornado como una lista de TipoServicioCTSIVO
	 */
	public static List<TipoServicioCTSIVO> dtoAVoServicio(List<TipoServicioCTSIWSDTO> altsc_tarifaServicioEntradaDTO) {
		List<TipoServicioCTSIVO> llts_tipoServicios = new ArrayList<>();

		for (TipoServicioCTSIWSDTO ltsc_tipoServicioCTSVO : altsc_tarifaServicioEntradaDTO) {
			TipoServicioCTSIVO ltsc_tipoServicio = new TipoServicioCTSIVO();

			ltsc_tipoServicio.setIltc_criterios(dtoAVoCriterio(ltsc_tipoServicioCTSVO.getIltc_criterios()));
			ltsc_tipoServicio.setIs_subtipoServicio(ltsc_tipoServicioCTSVO.getIs_subtipoServicio());
			ltsc_tipoServicio.setIs_tipoServicio(ltsc_tipoServicioCTSVO.getIs_tipoServicio());

			llts_tipoServicios.add(ltsc_tipoServicio);

		}

		return llts_tipoServicios;
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
	 * Especificamente convierte <b>de</b> TipoCriterioCTSIWSDTO <b>a</b>
	 * TipoCriterioCTSIVO, <br>
	 * En otras palabras, <b>de</b> Tipo criterio CTSIWSDTO <b>a</b> Tipo criterio
	 * CTSIVO.
	 *
	 * @param altc_tipoCriterios el parametro tipo criterios
	 * @return Resultado para convertir de lista de web service dto a lista de
	 *         valores de servicio, retornado como una lista de TipoCriterioCTSIVO
	 */
	public static List<TipoCriterioCTSIVO> dtoAVoCriterio(List<TipoCriterioCTSIWSDTO> altc_tipoCriterios) {
		List<TipoCriterioCTSIVO> lltc_criterios = new ArrayList<>();

		for (TipoCriterioCTSIWSDTO ltcc_tipoCriterios : altc_tipoCriterios) {
			TipoCriterioCTSIVO ltcc_tipoCriterio = new TipoCriterioCTSIVO();

			ltcc_tipoCriterio.setIs_codigo(ltcc_tipoCriterios.getIs_codigo());
			ltcc_tipoCriterio.setIs_valor(ltcc_tipoCriterios.getIs_valor());

			lltc_criterios.add(ltcc_tipoCriterio);
		}

		return lltc_criterios;

	}

}