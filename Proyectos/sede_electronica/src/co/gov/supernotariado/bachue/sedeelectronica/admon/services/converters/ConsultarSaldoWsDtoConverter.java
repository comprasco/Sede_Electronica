/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ConsultarSaldoWsDtoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: ConsultarSaldoWsDtoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos.TipoAdminVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos.TipoEntradaConsultarSaldoVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos.TipoSalidaConsultarSaldoVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos.TipoUsuarioCSIVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoAdminWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarSaldoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarSaldoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoUsuarioCSIWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Consultar saldo
 * ws dto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ConsultarSaldoWsDtoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ConsultarSaldoWsDtoConverter.
	 */
	private ConsultarSaldoWsDtoConverter() {
		// Constructor vacio de la clase
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaConsultarSaldoVO <b>a</b>
	 * TipoSalidaConsultarSaldoWSDTO, <br>
	 * En otras palabras, <b>de</b> Tipo salida consultar saldo objeto con valores
	 * de servicio <b>a</b> Tipo salida consultar saldo web service dto.
	 *
	 * @param atscs_tipoSalidaConsultarSaldoVo el parametro tipo salida consultar
	 *                                         saldo vo
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como TipoSalidaConsultarSaldoWSDTO
	 */
	public static TipoSalidaConsultarSaldoWSDTO entidadAVo(
			TipoSalidaConsultarSaldoVO atscs_tipoSalidaConsultarSaldoVo) {
		TipoSalidaConsultarSaldoWSDTO ltscs_tipoSalidaConsultarSaldoWsDto = new TipoSalidaConsultarSaldoWSDTO();
		ltscs_tipoSalidaConsultarSaldoWsDto.setIbd_saldoActual(atscs_tipoSalidaConsultarSaldoVo.getIbd_saldoActual());
		ltscs_tipoSalidaConsultarSaldoWsDto
				.setIbd_ultimaRecargaValor(atscs_tipoSalidaConsultarSaldoVo.getIbd_ultimaRecargaValor());
		ltscs_tipoSalidaConsultarSaldoWsDto
				.setIbi_codigoMensaje(atscs_tipoSalidaConsultarSaldoVo.getIbi_codigoMensaje());
		ltscs_tipoSalidaConsultarSaldoWsDto
				.setId_ultimaRecargaFecha(atscs_tipoSalidaConsultarSaldoVo.getId_ultimaRecargaFecha());
		ltscs_tipoSalidaConsultarSaldoWsDto
				.setIs_descripcionMensaje(atscs_tipoSalidaConsultarSaldoVo.getIs_descripcionMensaje());
		return ltscs_tipoSalidaConsultarSaldoWsDto;
	}

	/**
	 * Metodo que convierte de WSDTO a VO ( De Objeto de Transferencia de Datos de
	 * Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto WSDTO manipulado en la capa de negocio, en
	 * una entrada de datos para consumir una operacion de un servicio(objeto VO).
	 * <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoEntradaConsultarSaldoWSDTO <b>a</b>
	 * TipoEntradaConsultarSaldoVO, <br>
	 * En otras palabras, <b>de</b> Tipo entrada consultar saldo web service dto
	 * <b>a</b> Tipo entrada consultar saldo objeto con valores de servicio.
	 *
	 * @param atecs_tipoEntradaConsultarSaldoWsDto el parametro tipo entrada
	 *                                             consultar saldo ws dto
	 * @return Resultado para convertir web service dto a objeto de valores de
	 *         servicio, retornado como TipoEntradaConsultarSaldoVO
	 */
	public static TipoEntradaConsultarSaldoVO voAEntidad(
			TipoEntradaConsultarSaldoWSDTO atecs_tipoEntradaConsultarSaldoWsDto) {
		TipoEntradaConsultarSaldoVO ltecs_tipoEntradaConsultarSaldoVo = new TipoEntradaConsultarSaldoVO();
		ltecs_tipoEntradaConsultarSaldoVo
				.setIta_adminVo(adminVoAAdmin(atecs_tipoEntradaConsultarSaldoWsDto.getIta_adminWSDto()));
		ltecs_tipoEntradaConsultarSaldoVo.setIs_idCuentaCupo(atecs_tipoEntradaConsultarSaldoWsDto.getIs_idCuentaCupo());
		ltecs_tipoEntradaConsultarSaldoVo.setIs_modulo(atecs_tipoEntradaConsultarSaldoWsDto.getIs_modulo());
		ltecs_tipoEntradaConsultarSaldoVo
				.setItu_usuarioCsi(usuarioVoAUsuario(atecs_tipoEntradaConsultarSaldoWsDto.getItu_usuarioCsi()));
		return ltecs_tipoEntradaConsultarSaldoVo;
	}

	/**
	 * Metodo que convierte de WSDTO a VO ( De Objeto de Transferencia de Datos de
	 * Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto WSDTO manipulado en la capa de negocio, en
	 * una entrada de datos para consumir una operacion de un servicio(objeto VO).
	 * <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoUsuarioCSIWSDTO <b>a</b>
	 * TipoUsuarioCSIVO, <br>
	 * En otras palabras, <b>de</b> Tipo usuario CSIWSDTO <b>a</b> Tipo usuario
	 * CSIVO.
	 *
	 * @param atu_usuarioCsiWsDto el parametro usuario csi ws dto
	 * @return Resultado para convertir web service dto a objeto de valores de
	 *         servicio, retornado como TipoUsuarioCSIVO
	 */
	private static TipoUsuarioCSIVO usuarioVoAUsuario(TipoUsuarioCSIWSDTO atu_usuarioCsiWsDto) {
		TipoUsuarioCSIVO ltu_tipoUsuarioCsiVo = new TipoUsuarioCSIVO();
		ltu_tipoUsuarioCsiVo.setIs_numDocUsuario(atu_usuarioCsiWsDto.getIs_numDocUsuario());
		ltu_tipoUsuarioCsiVo.setIs_tipoDocUsuario(atu_usuarioCsiWsDto.getIs_tipoDocUsuario());
		return ltu_tipoUsuarioCsiVo;
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
		TipoAdminVO lta_tipoAdminVo = new TipoAdminVO();
		lta_tipoAdminVo.setIs_numDocAdmin(ata_adminWsDto.getIs_numDocAdmin());
		lta_tipoAdminVo.setIs_tipoDocAdmin(ata_adminWsDto.getIs_tipoDocAdmin());
		return lta_tipoAdminVo;
	}

}
