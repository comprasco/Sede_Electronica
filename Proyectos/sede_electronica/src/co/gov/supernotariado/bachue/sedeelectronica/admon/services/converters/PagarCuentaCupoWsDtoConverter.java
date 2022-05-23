/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: PagarCuentaCupoWsDtoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: PagarCuentaCupoWsDtoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos.TipoEntradaPagarCuentaCupoVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos.TipoSalidaPagarCuentaCupoVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaPagarCuentaCupoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaPagarCuentaCupoWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Pagar cuenta
 * cupo ws dto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class PagarCuentaCupoWsDtoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * PagarCuentaCupoWsDtoConverter.
	 */
	private PagarCuentaCupoWsDtoConverter() {
		// Constructor vacio de la clase
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaPagarCuentaCupoVO <b>a</b>
	 * TipoSalidaPagarCuentaCupoWSDTO, <br>
	 * En otras palabras, <b>de</b> Tipo salida pagar cuenta cupo objeto con valores
	 * de servicio <b>a</b> Tipo salida pagar cuenta cupo web service dto.
	 *
	 * @param atspcc_tipoSalidaPagarCuentaCupoVo el parametro tipo salida pagar
	 *                                           cuenta cupo vo
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como TipoSalidaPagarCuentaCupoWSDTO
	 */
	public static TipoSalidaPagarCuentaCupoWSDTO entidadAVo(
			TipoSalidaPagarCuentaCupoVO atspcc_tipoSalidaPagarCuentaCupoVo) {
		TipoSalidaPagarCuentaCupoWSDTO ltspcc_tipoSalidaPagarCuentaCupoWsDto = new TipoSalidaPagarCuentaCupoWSDTO();
		ltspcc_tipoSalidaPagarCuentaCupoWsDto
				.setIbi_codigoMensaje(atspcc_tipoSalidaPagarCuentaCupoVo.getIbi_codigoMensaje());
		ltspcc_tipoSalidaPagarCuentaCupoWsDto
				.setIs_descripcionMensaje(atspcc_tipoSalidaPagarCuentaCupoVo.getIs_descripcionMensaje());
		return ltspcc_tipoSalidaPagarCuentaCupoWsDto;
	}

	/**
	 * Metodo que convierte de WSDTO a VO ( De Objeto de Transferencia de Datos de
	 * Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto WSDTO manipulado en la capa de negocio, en
	 * una entrada de datos para consumir una operacion de un servicio(objeto VO).
	 * <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoEntradaPagarCuentaCupoWSDTO <b>a</b>
	 * TipoEntradaPagarCuentaCupoVO, <br>
	 * En otras palabras, <b>de</b> Tipo entrada pagar cuenta cupo web service dto
	 * <b>a</b> Tipo entrada pagar cuenta cupo objeto con valores de servicio.
	 *
	 * @param atepcc_tipoEntradaPagarCuentaCupoWsDto el parametro tipo entrada pagar
	 *                                               cuenta cupo ws dto
	 * @return Resultado para convertir web service dto a objeto de valores de
	 *         servicio, retornado como TipoEntradaPagarCuentaCupoVO
	 */
	public static TipoEntradaPagarCuentaCupoVO voAEntidad(
			TipoEntradaPagarCuentaCupoWSDTO atepcc_tipoEntradaPagarCuentaCupoWsDto) {
		TipoEntradaPagarCuentaCupoVO ltepcc_tipoEntradaPagarCuentaCupoVo = new TipoEntradaPagarCuentaCupoVO();
		ltepcc_tipoEntradaPagarCuentaCupoVo.setIs_correoElectronicoCorporativoUsuario(
				atepcc_tipoEntradaPagarCuentaCupoWsDto.getIs_correoElectronicoCorporativoUsuario());
		ltepcc_tipoEntradaPagarCuentaCupoVo.setId_fechaPago(atepcc_tipoEntradaPagarCuentaCupoWsDto.getId_fechaPago());
		ltepcc_tipoEntradaPagarCuentaCupoVo
				.setIs_idCuentaCupo(atepcc_tipoEntradaPagarCuentaCupoWsDto.getIs_idCuentaCupo());
		ltepcc_tipoEntradaPagarCuentaCupoVo.setIs_modulo(atepcc_tipoEntradaPagarCuentaCupoWsDto.getIs_modulo());
		ltepcc_tipoEntradaPagarCuentaCupoVo.setIbd_montoPago(atepcc_tipoEntradaPagarCuentaCupoWsDto.getIbd_montoPago());
		ltepcc_tipoEntradaPagarCuentaCupoVo
				.setIs_referenciaPago(atepcc_tipoEntradaPagarCuentaCupoWsDto.getIs_referenciaPago());
		return ltepcc_tipoEntradaPagarCuentaCupoVo;
	}
}
