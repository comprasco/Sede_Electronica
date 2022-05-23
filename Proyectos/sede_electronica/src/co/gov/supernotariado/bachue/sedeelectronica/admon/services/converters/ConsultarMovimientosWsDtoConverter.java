/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ConsultarMovimientosWsDtoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: ConsultarMovimientosWsDtoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos.TipoAdminVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos.TipoEntradaConsultarMovimientosVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos.TipoMovimientoCMOVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos.TipoNotaCreditoCMOVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos.TipoReciboCajaCMOVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos.TipoSalidaConsultarMovimientosVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoAdminWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarMovimientosWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoMovimientoCMOWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoNotaCreditoCMOWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoReciboCajaCMOWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarMovimientosWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Consultar
 * movimientos ws dto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ConsultarMovimientosWsDtoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ConsultarMovimientosWsDtoConverter.
	 */
	private ConsultarMovimientosWsDtoConverter() {
		// Constructor vacio de la clase
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaConsultarMovimientosVO <b>a</b>
	 * TipoSalidaConsultarMovimientosWSDTO, <br>
	 * En otras palabras, <b>de</b> Tipo salida consultar movimientos objeto con
	 * valores de servicio <b>a</b> Tipo salida consultar movimientos web service
	 * dto.
	 *
	 * @param atscm_tipoSalidaConsultarMovimientos el parametro tipo salida
	 *                                             consultar movimientos
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como TipoSalidaConsultarMovimientosWSDTO
	 */
	public static TipoSalidaConsultarMovimientosWSDTO entidadAVo(
			TipoSalidaConsultarMovimientosVO atscm_tipoSalidaConsultarMovimientos) {
		TipoSalidaConsultarMovimientosWSDTO ltscm_tipoSalidaConsultarMovimientosVo = new TipoSalidaConsultarMovimientosWSDTO();
		ltscm_tipoSalidaConsultarMovimientosVo
				.setIbi_codigoMensaje(atscm_tipoSalidaConsultarMovimientos.getIbi_codigoMensaje());
		ltscm_tipoSalidaConsultarMovimientosVo.setIltm_movimientos(
				listaMovimientosAListaMovimientosVo(atscm_tipoSalidaConsultarMovimientos.getIltm_movimientos()));
		ltscm_tipoSalidaConsultarMovimientosVo
				.setIs_descripcionMensaje(atscm_tipoSalidaConsultarMovimientos.getIs_descripcionMensaje());
		return ltscm_tipoSalidaConsultarMovimientosVo;
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
	 * Especificamente convierte <b>de</b> una TipoMovimientoCMOVO <b>a</b> una
	 * TipoMovimientoCMOWSDTO, <br>
	 * En otras palabras, <b>de</b> una Tipo movimiento CMOVO <b>a</b> una Tipo
	 * movimiento CMOWSDTO.
	 *
	 * @param altm_tipoMovimientoCmoVo el parametro tipo movimiento cmo vo
	 * @return Resultado para convertir de lista de valores de servicio a lista de
	 *         web service dto, retornado como una lista de TipoMovimientoCMOWSDTO
	 */
	private static List<TipoMovimientoCMOWSDTO> listaMovimientosAListaMovimientosVo(
			List<TipoMovimientoCMOVO> altm_tipoMovimientoCmoVo) {
		List<TipoMovimientoCMOWSDTO> lltm_listaTipoMovimientoCmoWsDto = new ArrayList<>();
		for (TipoMovimientoCMOVO ltm_tipoMovimientoCmoVo : altm_tipoMovimientoCmoVo) {
			lltm_listaTipoMovimientoCmoWsDto.add(movimientosAMovimientosVo(ltm_tipoMovimientoCmoVo));
		}
		return lltm_listaTipoMovimientoCmoWsDto;
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoMovimientoCMOVO <b>a</b>
	 * TipoMovimientoCMOWSDTO, <br>
	 * En otras palabras, <b>de</b> Tipo movimiento CMOVO <b>a</b> Tipo movimiento
	 * CMOWSDTO.
	 *
	 * @param atm_tipoMovimientoCmoVo el parametro tipo movimiento cmo vo
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como TipoMovimientoCMOWSDTO
	 */
	private static TipoMovimientoCMOWSDTO movimientosAMovimientosVo(TipoMovimientoCMOVO atm_tipoMovimientoCmoVo) {
		TipoMovimientoCMOWSDTO ltm_tipoMovimientoCmoVo = new TipoMovimientoCMOWSDTO();
		ltm_tipoMovimientoCmoVo.setId_fechaMovimiento(atm_tipoMovimientoCmoVo.getId_fechaMovimiento());
		ltm_tipoMovimientoCmoVo.setIs_id(atm_tipoMovimientoCmoVo.getIs_id());
		ltm_tipoMovimientoCmoVo.setIs_tipo(atm_tipoMovimientoCmoVo.getIs_tipo());
		ltm_tipoMovimientoCmoVo.setItnc_notaCredito(notaANotaVo(atm_tipoMovimientoCmoVo.getItnc_notaCredito()));
		ltm_tipoMovimientoCmoVo.setItrc_reciboCaja(reciboAReciboVo(atm_tipoMovimientoCmoVo.getItrc_reciboCaja()));
		return ltm_tipoMovimientoCmoVo;
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoReciboCajaCMOVO <b>a</b>
	 * TipoReciboCajaCMOWSDTO, <br>
	 * En otras palabras, <b>de</b> Tipo recibo caja CMOVO <b>a</b> Tipo recibo caja
	 * CMOWSDTO.
	 *
	 * @param atrc_tipoReciboCajaCmoVo el parametro tipo recibo caja cmo vo
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como TipoReciboCajaCMOWSDTO
	 */
	private static TipoReciboCajaCMOWSDTO reciboAReciboVo(TipoReciboCajaCMOVO atrc_tipoReciboCajaCmoVo) {
		TipoReciboCajaCMOWSDTO ltrc_tipoReciboCajaCmoVo = new TipoReciboCajaCMOWSDTO();
		ltrc_tipoReciboCajaCmoVo.setIbd_valor(atrc_tipoReciboCajaCmoVo.getIbd_valor());
		ltrc_tipoReciboCajaCmoVo.setIs_numero(atrc_tipoReciboCajaCmoVo.getIs_numero());
		return ltrc_tipoReciboCajaCmoVo;
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoNotaCreditoCMOVO <b>a</b>
	 * TipoNotaCreditoCMOWSDTO, <br>
	 * En otras palabras, <b>de</b> Tipo nota credito CMOVO <b>a</b> Tipo nota
	 * credito CMOWSDTO.
	 *
	 * @param atnc_tipoNotaCreditoCmoVo el parametro tipo nota credito cmo vo
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como TipoNotaCreditoCMOWSDTO
	 */
	private static TipoNotaCreditoCMOWSDTO notaANotaVo(TipoNotaCreditoCMOVO atnc_tipoNotaCreditoCmoVo) {
		TipoNotaCreditoCMOWSDTO ltnc_tipoNotaCreditoCmoVo = new TipoNotaCreditoCMOWSDTO();
		ltnc_tipoNotaCreditoCmoVo.setIbd_valor(atnc_tipoNotaCreditoCmoVo.getIbd_valor());
		ltnc_tipoNotaCreditoCmoVo.setIs_numero(atnc_tipoNotaCreditoCmoVo.getIs_numero());
		return ltnc_tipoNotaCreditoCmoVo;
	}

	/**
	 * Metodo que convierte de WSDTO a VO ( De Objeto de Transferencia de Datos de
	 * Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto WSDTO manipulado en la capa de negocio, en
	 * una entrada de datos para consumir una operacion de un servicio(objeto VO).
	 * <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoEntradaConsultarMovimientosWSDTO
	 * <b>a</b> TipoEntradaConsultarMovimientosVO, <br>
	 * En otras palabras, <b>de</b> Tipo entrada consultar movimientos web service
	 * dto <b>a</b> Tipo entrada consultar movimientos objeto con valores de
	 * servicio.
	 *
	 * @param atecm_tipoEntradaConsultarMovimientosWsDto el parametro tipo entrada
	 *                                                   consultar movimientos ws
	 *                                                   dto
	 * @return Resultado para convertir web service dto a objeto de valores de
	 *         servicio, retornado como TipoEntradaConsultarMovimientosVO
	 */
	public static TipoEntradaConsultarMovimientosVO voAEntidad(
			TipoEntradaConsultarMovimientosWSDTO atecm_tipoEntradaConsultarMovimientosWsDto) {
		TipoEntradaConsultarMovimientosVO ltecm_tipoEntradaConsultarMovimientosVo = new TipoEntradaConsultarMovimientosVO();
		ltecm_tipoEntradaConsultarMovimientosVo
				.setIta_adminVo(adminVoAAdmin(atecm_tipoEntradaConsultarMovimientosWsDto.getIta_adminVo()));
		ltecm_tipoEntradaConsultarMovimientosVo
				.setId_fechaFinal(atecm_tipoEntradaConsultarMovimientosWsDto.getId_fechaFinal());
		ltecm_tipoEntradaConsultarMovimientosVo
				.setId_fechaInicial(atecm_tipoEntradaConsultarMovimientosWsDto.getId_fechaInicial());
		ltecm_tipoEntradaConsultarMovimientosVo
				.setIs_idCuentaCupo(atecm_tipoEntradaConsultarMovimientosWsDto.getIs_idCuentaCupo());
		ltecm_tipoEntradaConsultarMovimientosVo.setIs_modulo(atecm_tipoEntradaConsultarMovimientosWsDto.getIs_modulo());
		return ltecm_tipoEntradaConsultarMovimientosVo;
	}

	/**
	 * Metodo que convierte de WSDTO a VO ( De Objeto de Transferencia de Datos de
	 * Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto WSDTO manipulado en la capa de negocio, en
	 * una entrada de datos para consumir una operacion de un servicio(objeto VO).
	 * <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoAdminWSDTO <b>a</b> TipoAdminVO, <br>
	 * En otras palabras, <b>de</b> Tipo admin web service dto <b>a</b> Tipo admin
	 * objeto con valores de servicio.
	 *
	 * @param ata_adminWsDto el parametro admin ws dto
	 * @return Resultado para convertir web service dto a objeto de valores de
	 *         servicio, retornado como TipoAdminVO
	 */
	private static TipoAdminVO adminVoAAdmin(TipoAdminWSDTO ata_adminWsDto) {
		TipoAdminVO lta_tipoAdminCmi = new TipoAdminVO();
		lta_tipoAdminCmi.setIs_numDocAdmin(ata_adminWsDto.getIs_numDocAdmin());
		lta_tipoAdminCmi.setIs_tipoDocAdmin(ata_adminWsDto.getIs_tipoDocAdmin());
		return lta_tipoAdminCmi;
	}
}
