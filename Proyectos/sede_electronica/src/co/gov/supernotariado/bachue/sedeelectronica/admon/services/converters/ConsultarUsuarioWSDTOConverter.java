/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ConsultarUsuarioWSDTOConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: ConsultarUsuarioWSDTOConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos.TipoAdminVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos.TipoEntradaConsultarUsuarioVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos.TipoSalidaConsultarUsuarioVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos.TipoUsuarioCUIVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos.TipoUsuarioCUOVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoAdminWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarUsuarioWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarUsuarioWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoUsuarioCUIWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoUsuarioCUOWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Consultar
 * usuario WSDTO. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ConsultarUsuarioWSDTOConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ConsultarUsuarioWSDTOConverter.
	 */
	private ConsultarUsuarioWSDTOConverter() {
		// Constructor vacio de la clase
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaConsultarUsuarioVO <b>a</b>
	 * TipoSalidaConsultarUsuarioWSDTO, <br>
	 * En otras palabras, <b>de</b> Tipo salida consultar usuario objeto con valores
	 * de servicio <b>a</b> Tipo salida consultar usuario web service dto.
	 *
	 * @param atscu_tipoSalidaConsultarUsuarioVo el parametro tipo salida consultar
	 *                                           usuario vo
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como TipoSalidaConsultarUsuarioWSDTO
	 */
	public static TipoSalidaConsultarUsuarioWSDTO entidadAVo(
			TipoSalidaConsultarUsuarioVO atscu_tipoSalidaConsultarUsuarioVo) {
		TipoSalidaConsultarUsuarioWSDTO ltscu_tipoSalidaConsultarSalidaWsDto = new TipoSalidaConsultarUsuarioWSDTO();
		ltscu_tipoSalidaConsultarSalidaWsDto
				.setIbi_codigoMensaje(atscu_tipoSalidaConsultarUsuarioVo.getIbi_codigoMensaje());
		ltscu_tipoSalidaConsultarSalidaWsDto
				.setIs_descripcionMensaje(atscu_tipoSalidaConsultarUsuarioVo.getIs_descripcionMensaje());
		ltscu_tipoSalidaConsultarSalidaWsDto
				.setItuc_usuarioVo(tipoUsuarioATipoUsuarioVo(atscu_tipoSalidaConsultarUsuarioVo.getItuc_usuarioVo()));
		return ltscu_tipoSalidaConsultarSalidaWsDto;
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoUsuarioCUOVO <b>a</b>
	 * TipoUsuarioCUOWSDTO, <br>
	 * En otras palabras, <b>de</b> Tipo usuario CUOVO <b>a</b> Tipo usuario
	 * CUOWSDTO.
	 *
	 * @param atu_tipoUsuarioCuoVo el parametro tipo usuario cuo vo
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como TipoUsuarioCUOWSDTO
	 */
	private static TipoUsuarioCUOWSDTO tipoUsuarioATipoUsuarioVo(TipoUsuarioCUOVO atu_tipoUsuarioCuoVo) {
		TipoUsuarioCUOWSDTO ltu_tipoUsuarioCuoWsDto = new TipoUsuarioCUOWSDTO();
		ltu_tipoUsuarioCuoWsDto.setId_fechaCancelacion(atu_tipoUsuarioCuoVo.getId_fechaCancelacion());
		ltu_tipoUsuarioCuoWsDto.setId_fechaCreacion(atu_tipoUsuarioCuoVo.getId_fechaCreacion());
		ltu_tipoUsuarioCuoWsDto.setIs_correoElectronicoCorporativoUsuario(
				atu_tipoUsuarioCuoVo.getIs_correoElectronicoCorporativoUsuario());
		ltu_tipoUsuarioCuoWsDto.setIs_estado(atu_tipoUsuarioCuoVo.getIs_estado());
		ltu_tipoUsuarioCuoWsDto.setIs_numDocUsuario(atu_tipoUsuarioCuoVo.getIs_numDocUsuario());
		ltu_tipoUsuarioCuoWsDto.setIs_primerApellidoUsuario(atu_tipoUsuarioCuoVo.getIs_primerApellidoUsuario());
		ltu_tipoUsuarioCuoWsDto.setIs_primerNombreUsuario(atu_tipoUsuarioCuoVo.getIs_primerNombreUsuario());
		ltu_tipoUsuarioCuoWsDto.setIs_segundoApellidoUsuario(atu_tipoUsuarioCuoVo.getIs_segundoApellidoUsuario());
		ltu_tipoUsuarioCuoWsDto.setIs_segundoNombreUsuario(atu_tipoUsuarioCuoVo.getIs_segundoNombreUsuario());
		ltu_tipoUsuarioCuoWsDto.setIs_tipoDocUsuario(atu_tipoUsuarioCuoVo.getIs_tipoDocUsuario());
		return ltu_tipoUsuarioCuoWsDto;
	}

	/**
	 * Metodo que convierte de WSDTO a VO ( De Objeto de Transferencia de Datos de
	 * Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto WSDTO manipulado en la capa de negocio, en
	 * una entrada de datos para consumir una operacion de un servicio(objeto VO).
	 * <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoEntradaConsultarUsuarioWSDTO <b>a</b>
	 * TipoEntradaConsultarUsuarioVO, <br>
	 * En otras palabras, <b>de</b> Tipo entrada consultar usuario web service dto
	 * <b>a</b> Tipo entrada consultar usuario objeto con valores de servicio.
	 *
	 * @param atecu_tipoEntradaConsultarUsuarioWsDto el parametro tipo entrada
	 *                                               consultar usuario ws dto
	 * @return Resultado para convertir web service dto a objeto de valores de
	 *         servicio, retornado como TipoEntradaConsultarUsuarioVO
	 */
	public static TipoEntradaConsultarUsuarioVO voAEntidad(
			TipoEntradaConsultarUsuarioWSDTO atecu_tipoEntradaConsultarUsuarioWsDto) {
		TipoEntradaConsultarUsuarioVO ltecu_tipoEntradaConsultarUsuarioVo = new TipoEntradaConsultarUsuarioVO();
		ltecu_tipoEntradaConsultarUsuarioVo
				.setIta_adminVo(adminVoAAdmin(atecu_tipoEntradaConsultarUsuarioWsDto.getIta_adminVo()));
		ltecu_tipoEntradaConsultarUsuarioVo
				.setIs_idCuentaCupo(atecu_tipoEntradaConsultarUsuarioWsDto.getIs_idCuentaCupo());
		ltecu_tipoEntradaConsultarUsuarioVo.setIs_modulo(atecu_tipoEntradaConsultarUsuarioWsDto.getIs_modulo());
		ltecu_tipoEntradaConsultarUsuarioVo
				.setItuc_usuarioVo(usuarioVoAUsuario(atecu_tipoEntradaConsultarUsuarioWsDto.getItuc_usuarioVo()));
		return ltecu_tipoEntradaConsultarUsuarioVo;
	}

	/**
	 * Metodo que convierte de WSDTO a VO ( De Objeto de Transferencia de Datos de
	 * Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto WSDTO manipulado en la capa de negocio, en
	 * una entrada de datos para consumir una operacion de un servicio(objeto VO).
	 * <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoUsuarioCUIWSDTO <b>a</b>
	 * TipoUsuarioCUIVO, <br>
	 * En otras palabras, <b>de</b> Tipo usuario CUIWSDTO <b>a</b> Tipo usuario
	 * CUIVO.
	 *
	 * @param atuc_usuarioWsDto el parametro usuario ws dto
	 * @return Resultado para convertir web service dto a objeto de valores de
	 *         servicio, retornado como TipoUsuarioCUIVO
	 */
	private static TipoUsuarioCUIVO usuarioVoAUsuario(TipoUsuarioCUIWSDTO atuc_usuarioWsDto) {
		TipoUsuarioCUIVO ltu_tipoUsuarioVo = new TipoUsuarioCUIVO();
		ltu_tipoUsuarioVo.setIs_numDocUsuario(atuc_usuarioWsDto.getIs_numDocUsuario());
		ltu_tipoUsuarioVo.setIs_tipoDocUsuario(atuc_usuarioWsDto.getIs_tipoDocUsuario());
		return ltu_tipoUsuarioVo;
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
