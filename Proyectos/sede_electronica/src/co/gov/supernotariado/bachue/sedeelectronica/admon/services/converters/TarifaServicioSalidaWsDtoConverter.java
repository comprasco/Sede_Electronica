/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TarifaServicioSalidaWsDtoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: TarifaServicioSalidaWsDtoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.vo.operacionesfinancieras.TipoSalidaConsultarTarifaServicioVO;
import co.gov.supernotariado.bachue.clientebus.vo.operacionesfinancieras.TipoServicioCTSOVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarTarifaServicioWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoServicioCTSOWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Tarifa servicio
 * salida ws dto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TarifaServicioSalidaWsDtoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * TarifaServicioSalidaWsDtoConverter.
	 */
	private TarifaServicioSalidaWsDtoConverter() {
		// Constructor vacio de la clase
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaConsultarTarifaServicioVO
	 * <b>a</b> TipoSalidaConsultarTarifaServicioWSDTO, <br>
	 * En otras palabras, <b>de</b> Tipo salida consultar tarifa servicio objeto con
	 * valores de servicio <b>a</b> Tipo salida consultar tarifa servicio web
	 * service dto.
	 *
	 * @param ltscts_salidaConsultarTarifaServicioVo el parametro ltscts salida
	 *                                               consultar tarifa servicio vo
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como TipoSalidaConsultarTarifaServicioWSDTO
	 */
	public static TipoSalidaConsultarTarifaServicioWSDTO entidadAVo(
			TipoSalidaConsultarTarifaServicioVO ltscts_salidaConsultarTarifaServicioVo) {

		TipoSalidaConsultarTarifaServicioWSDTO ltscts_tarifaServicioWsDto = new TipoSalidaConsultarTarifaServicioWSDTO();
		if (ltscts_salidaConsultarTarifaServicioVo.getIlts_listaTipoServicioCtsoVo() != null)
			ltscts_tarifaServicioWsDto.setIlts_listaTipoServiciosTarifadosWsDto(
					entidadAVoServicio(ltscts_salidaConsultarTarifaServicioVo.getIlts_listaTipoServicioCtsoVo()));
		ltscts_tarifaServicioWsDto.setIbi_codigoMensaje(ltscts_salidaConsultarTarifaServicioVo.getIbi_codigoMensaje());
		ltscts_tarifaServicioWsDto
				.setIs_descripcionMensaje(ltscts_salidaConsultarTarifaServicioVo.getIs_descripcionMensaje());

		return ltscts_tarifaServicioWsDto;
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
	 * Especificamente convierte <b>de</b> una TipoServicioCTSOVO <b>a</b> una
	 * TipoServicioCTSOWSDTO, <br>
	 * En otras palabras, <b>de</b> una Tipo servicio CTSOVO <b>a</b> una Tipo
	 * servicio CTSOWSDTO.
	 *
	 * @param altsc_tipoServicio el parametro tipo servicio
	 * @return Resultado para convertir de lista de valores de servicio a lista de
	 *         web service dto, retornado como una lista de TipoServicioCTSOWSDTO
	 */
	public static List<TipoServicioCTSOWSDTO> entidadAVoServicio(List<TipoServicioCTSOVO> altsc_tipoServicio) {
		List<TipoServicioCTSOWSDTO> lltsc_tipoServicio = new ArrayList<>();

		for (TipoServicioCTSOVO lts_tipoServicioCTSOVO : altsc_tipoServicio) {

			TipoServicioCTSOWSDTO lst_servicioTarificado = new TipoServicioCTSOWSDTO();

			lst_servicioTarificado.setIbd_valorServicio(lts_tipoServicioCTSOVO.getIbd_valorServicio());
			lst_servicioTarificado.setIs_direccionPredio(lts_tipoServicioCTSOVO.getIs_direccionPredio());
			lst_servicioTarificado.setIs_estadoPredio(lts_tipoServicioCTSOVO.getIs_tipoServicio());
			lst_servicioTarificado.setIs_subtipoServicio(lts_tipoServicioCTSOVO.getIs_subtipoServicio());
			lst_servicioTarificado.setIs_tipoServicio(lts_tipoServicioCTSOVO.getIs_tipoServicio());

			lltsc_tipoServicio.add(lst_servicioTarificado);
		}

		return lltsc_tipoServicio;

	}

}
