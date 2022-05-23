/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ConsultarSaldosNotaCreditoWsDtoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: ConsultarSaldosNotaCreditoWsDtoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos.TipoAdminCSIVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos.TipoEntradaConsultarSaldosNotaCreditoVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos.TipoNotaCreditoCSNCVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos.TipoSalidaConsultarSaldosNotaCreditoVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoAdminWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarSaldosNotaCreditoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoNotaCreditoCSNCWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarSaldosNotaCreditoWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Consultar Saldos
 * Nota Credito Ws dto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ConsultarSaldosNotaCreditoWsDtoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ConsultarSaldosNotaCreditoWsDtoConverter.
	 */
	private ConsultarSaldosNotaCreditoWsDtoConverter() {
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
	 * @param atscsnc_tipoSalidaConsultarSaldosNotaCreditoVo el parametro tipo
	 *                                                       salida consultar
	 *                                                       movimientos
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como TipoSalidaConsultarMovimientosWSDTO
	 */
	public static TipoSalidaConsultarSaldosNotaCreditoWSDTO entidadAVo(
			TipoSalidaConsultarSaldosNotaCreditoVO atscsnc_tipoSalidaConsultarSaldosNotaCreditoVo) {
		TipoSalidaConsultarSaldosNotaCreditoWSDTO ltscsnc_tipoSalidaConsultarSaldosNotaCreditoWsDto = new TipoSalidaConsultarSaldosNotaCreditoWSDTO();
		ltscsnc_tipoSalidaConsultarSaldosNotaCreditoWsDto
				.setIbi_codigoMensaje(atscsnc_tipoSalidaConsultarSaldosNotaCreditoVo.getIbi_codigoMensaje());
		ltscsnc_tipoSalidaConsultarSaldosNotaCreditoWsDto
				.setIltnc_listaNotasCredito(listaNotasCreditoAListaNotasCreditoVo(
						atscsnc_tipoSalidaConsultarSaldosNotaCreditoVo.getIltnc_listaNotasCredito()));
		ltscsnc_tipoSalidaConsultarSaldosNotaCreditoWsDto
				.setIs_descripcionMensaje(atscsnc_tipoSalidaConsultarSaldosNotaCreditoVo.getIs_descripcionMensaje());
		return ltscsnc_tipoSalidaConsultarSaldosNotaCreditoWsDto;
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
	 * Especificamente convierte <b>de</b> una TipoNotaCreditoCSNCWSDTO <b>a</b> una
	 * TipoNotaCreditoCSNCWSDTO, <br>
	 * En otras palabras, <b>de</b> una TipoNotaCreditoCSNCWSVO <b>a</b> una
	 * TipoNotaCreditoCSNCWSDTO.
	 *
	 * @param altnc_tipoNotaCreditoVo el parametro tipo movimiento cmo vo
	 * @return Resultado para convertir de lista de valores de servicio a lista de
	 *         web service dto, retornado como una lista de TipoNotaCreditoCSNCWSDTO
	 */
	private static List<TipoNotaCreditoCSNCWSDTO> listaNotasCreditoAListaNotasCreditoVo(
			List<TipoNotaCreditoCSNCVO> altnc_tipoNotaCreditoVo) {
		List<TipoNotaCreditoCSNCWSDTO> lltnc_tipoNotaCreditoWsDto = new ArrayList<>();
		for (TipoNotaCreditoCSNCVO ltnc_tipoNotaCreditoVo : altnc_tipoNotaCreditoVo) {
			lltnc_tipoNotaCreditoWsDto.add(notaCreditoANotaCreditoVo(ltnc_tipoNotaCreditoVo));
		}
		return lltnc_tipoNotaCreditoWsDto;
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoNotaCreditoCSNCVO <b>a</b>
	 * TipoNotaCreditoCSNCWSDTO, <br>
	 * En otras palabras, <b>de</b> TipoNotaCreditoCSNCVO <b>a</b>
	 * TipoNotaCreditoCSNCWSDTO.
	 *
	 * @param atnc_tipoNotaCreditoVo el parametro tipo movimiento cmo vo
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como TipoNotaCreditoCSNCWSDTO
	 */
	private static TipoNotaCreditoCSNCWSDTO notaCreditoANotaCreditoVo(TipoNotaCreditoCSNCVO atnc_tipoNotaCreditoVo) {
		TipoNotaCreditoCSNCWSDTO ltnc_tipoNotaCredito = new TipoNotaCreditoCSNCWSDTO();
		ltnc_tipoNotaCredito.setId_fecha(atnc_tipoNotaCreditoVo.getId_fecha());
		ltnc_tipoNotaCredito.setIs_codigo(atnc_tipoNotaCreditoVo.getIs_codigo());
		ltnc_tipoNotaCredito.setIs_saldo(atnc_tipoNotaCreditoVo.getIs_saldo());
		ltnc_tipoNotaCredito.setIs_valorRecarga(atnc_tipoNotaCreditoVo.getIs_valorRecarga());

		return ltnc_tipoNotaCredito;
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
	 * TipoEntradaConsultarSaldosNotaCreditoWSDTO <b>a</b>
	 * TipoEntradaConsultarSaldosNotaCreditoVO, <br>
	 * En otras palabras, <b>de</b> Tipo entrada consultar saldos nota credito web
	 * service dto <b>a</b> Tipo entrada consultar saldos nota credito objeto con
	 * valores de servicio.
	 *
	 * @param atecsnc_tipoEntradaConsultarSaldosNotaCreditoWsDto el parametro tipo
	 *                                                           entrada consultar
	 *                                                           movimientos ws dto
	 * @return Resultado para convertir web service dto a objeto de valores de
	 *         servicio, retornado como TipoEntradaConsultarSaldosNotaCreditoVO
	 */
	public static TipoEntradaConsultarSaldosNotaCreditoVO voAEntidad(
			TipoEntradaConsultarSaldosNotaCreditoWSDTO atecsnc_tipoEntradaConsultarSaldosNotaCreditoWsDto) {
		TipoEntradaConsultarSaldosNotaCreditoVO ltecsnc_tipoEntradaConsultarSaldosNotaCreditoVo = new TipoEntradaConsultarSaldosNotaCreditoVO();
		ltecsnc_tipoEntradaConsultarSaldosNotaCreditoVo
				.setIta_adminVo(adminVoAAdmin(atecsnc_tipoEntradaConsultarSaldosNotaCreditoWsDto.getIta_adminVo()));
		ltecsnc_tipoEntradaConsultarSaldosNotaCreditoVo
				.setIs_idCuentaCupo(atecsnc_tipoEntradaConsultarSaldosNotaCreditoWsDto.getIs_idCuentaCupo());
		ltecsnc_tipoEntradaConsultarSaldosNotaCreditoVo
				.setIs_modulo(atecsnc_tipoEntradaConsultarSaldosNotaCreditoWsDto.getIs_modulo());
		return ltecsnc_tipoEntradaConsultarSaldosNotaCreditoVo;
	}

	/**
	 * Metodo que convierte de WSDTO a VO ( De Objeto de Transferencia de Datos de
	 * Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto WSDTO manipulado en la capa de negocio, en
	 * una entrada de datos para consumir una operacion de un servicio(objeto VO).
	 * <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoAdminWSDTO <b>a</b> TipoAdminCSIVO,
	 * <br>
	 * En otras palabras, <b>de</b> Tipo admin web service dto <b>a</b> Tipo admin
	 * objeto con valores de servicio.
	 *
	 * @param ata_adminWsDto el parametro admin ws dto
	 * @return Resultado para convertir web service dto a objeto de valores de
	 *         servicio, retornado como TipoAdminCSIVO
	 */
	private static TipoAdminCSIVO adminVoAAdmin(TipoAdminWSDTO ata_adminWsDto) {
		TipoAdminCSIVO lta_tipoAdminCsiVo = new TipoAdminCSIVO();
		lta_tipoAdminCsiVo.setIs_numDocAdmin(ata_adminWsDto.getIs_numDocAdmin());
		lta_tipoAdminCsiVo.setIs_tipoDocAdmin(ata_adminWsDto.getIs_tipoDocAdmin());
		return lta_tipoAdminCsiVo;
	}
}
