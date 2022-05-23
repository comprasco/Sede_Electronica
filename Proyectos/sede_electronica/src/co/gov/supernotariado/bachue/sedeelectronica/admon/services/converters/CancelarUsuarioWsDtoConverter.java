/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: CancelarUsuarioWsDtoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: CancelarUsuarioWsDtoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos.TipoAdminVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos.TipoEntradaCancelarUsuarioVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos.TipoSalidaCancelarUsuarioVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos.TipoUsuarioCNUIVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoAdminWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaCancelarUsuarioWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaCancelarUsuarioWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoUsuarioCNUIWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Cancelar usuario
 * ws dto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class CancelarUsuarioWsDtoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * CancelarUsuarioWsDtoConverter.
	 */
	private CancelarUsuarioWsDtoConverter() {
		// Constructor vacio de la clase
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaCancelarUsuarioVO <b>a</b>
	 * TipoSalidaCancelarUsuarioWSDTO, <br>
	 * En otras palabras, <b>de</b> Tipo salida cancelar usuario objeto con valores
	 * de servicio <b>a</b> Tipo salida cancelar usuario web service dto.
	 *
	 * @param atscu_tipoSalidaCancelarUsuarioVo el parametro tipo salida cancelar
	 *                                          usuario vo
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como TipoSalidaCancelarUsuarioWSDTO
	 */
	public static TipoSalidaCancelarUsuarioWSDTO entidadAVo(
			TipoSalidaCancelarUsuarioVO atscu_tipoSalidaCancelarUsuarioVo) {
		TipoSalidaCancelarUsuarioWSDTO ltscau_tipoSalidaCancelarUsuarioVo = new TipoSalidaCancelarUsuarioWSDTO();
		ltscau_tipoSalidaCancelarUsuarioVo
				.setIbi_codigoMensaje(atscu_tipoSalidaCancelarUsuarioVo.getIbi_codigoMensaje());
		ltscau_tipoSalidaCancelarUsuarioVo
				.setIs_descripcionMensaje(atscu_tipoSalidaCancelarUsuarioVo.getIs_descripcionMensaje());
		return ltscau_tipoSalidaCancelarUsuarioVo;
	}

	/**
	 * Metodo que convierte de WSDTO a VO ( De Objeto de Transferencia de Datos de
	 * Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto WSDTO manipulado en la capa de negocio, en
	 * una entrada de datos para consumir una operacion de un servicio(objeto VO).
	 * <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoEntradaCancelarUsuarioWSDTO <b>a</b>
	 * TipoEntradaCancelarUsuarioVO, <br>
	 * En otras palabras, <b>de</b> Tipo entrada cancelar usuario web service dto
	 * <b>a</b> Tipo entrada cancelar usuario objeto con valores de servicio.
	 *
	 * @param atecu_tipoEntradaCancelarUsuarioWsDto el parametro tipo entrada
	 *                                              cancelar usuario ws dto
	 * @return Resultado para convertir web service dto a objeto de valores de
	 *         servicio, retornado como TipoEntradaCancelarUsuarioVO
	 */
	public static TipoEntradaCancelarUsuarioVO voAEntidad(
			TipoEntradaCancelarUsuarioWSDTO atecu_tipoEntradaCancelarUsuarioWsDto) {
		TipoEntradaCancelarUsuarioVO ltecu_tipoEntradaCancelarUsuarioVo = new TipoEntradaCancelarUsuarioVO();
		ltecu_tipoEntradaCancelarUsuarioVo
				.setIs_idCuentaCupo(atecu_tipoEntradaCancelarUsuarioWsDto.getIs_idCuentaCupo());
		ltecu_tipoEntradaCancelarUsuarioVo.setIs_modulo(atecu_tipoEntradaCancelarUsuarioWsDto.getIs_modulo());
		ltecu_tipoEntradaCancelarUsuarioVo
				.setIta_administradorVo(adminVoAadmin(atecu_tipoEntradaCancelarUsuarioWsDto.getIta_administradorVo()));
		ltecu_tipoEntradaCancelarUsuarioVo
				.setItucnui_usuarioVo(usuarioVoAusuario(atecu_tipoEntradaCancelarUsuarioWsDto.getItucnui_usuarioVo()));
		return ltecu_tipoEntradaCancelarUsuarioVo;
	}

	/**
	 * Metodo que convierte de WSDTO a VO ( De Objeto de Transferencia de Datos de
	 * Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto WSDTO manipulado en la capa de negocio, en
	 * una entrada de datos para consumir una operacion de un servicio(objeto VO).
	 * <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoUsuarioCNUIWSDTO <b>a</b>
	 * TipoUsuarioCNUIVO, <br>
	 * En otras palabras, <b>de</b> Tipo usuario CNUIWSDTO <b>a</b> Tipo usuario
	 * CNUIVO.
	 *
	 * @param atucnui_usuarioWsDto el parametro usuario ws dto
	 * @return Resultado para convertir web service dto a objeto de valores de
	 *         servicio, retornado como TipoUsuarioCNUIVO
	 */
	private static TipoUsuarioCNUIVO usuarioVoAusuario(TipoUsuarioCNUIWSDTO atucnui_usuarioWsDto) {
		TipoUsuarioCNUIVO ltuc_tipoUsuarioCnuiVo = new TipoUsuarioCNUIVO();
		ltuc_tipoUsuarioCnuiVo.setIs_correoElectronicoCorporativoUsuario(
				atucnui_usuarioWsDto.getIs_correoElectronicoCorporativoUsuario());
		ltuc_tipoUsuarioCnuiVo.setIs_numDocUsuario(atucnui_usuarioWsDto.getIs_numDocUsuario());
		ltuc_tipoUsuarioCnuiVo.setIs_primerApellidoUsuario(atucnui_usuarioWsDto.getIs_primerApellidoUsuario());
		ltuc_tipoUsuarioCnuiVo.setIs_primerNombreUsuario(atucnui_usuarioWsDto.getIs_primerNombreUsuario());
		ltuc_tipoUsuarioCnuiVo.setIs_tipoDocUsuario(atucnui_usuarioWsDto.getIs_tipoDocUsuario());
		ltuc_tipoUsuarioCnuiVo.setIs_segundoApellidoUsuario(atucnui_usuarioWsDto.getIs_segundoApellidoUsuario());
		ltuc_tipoUsuarioCnuiVo.setIs_segundoNombreUsuario(atucnui_usuarioWsDto.getIs_segundoNombreUsuario());
		return ltuc_tipoUsuarioCnuiVo;
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
	 * @param ata_administradorWsDto el parametro administrador ws dto
	 * @return Resultado para convertir web service dto a objeto de valores de
	 *         servicio, retornado como TipoAdminVO
	 */
	private static TipoAdminVO adminVoAadmin(TipoAdminWSDTO ata_administradorWsDto) {
		TipoAdminVO ltac_tipoAdminVo = new TipoAdminVO();
		ltac_tipoAdminVo.setIs_numDocAdmin(ata_administradorWsDto.getIs_numDocAdmin());
		ltac_tipoAdminVo.setIs_tipoDocAdmin(ata_administradorWsDto.getIs_tipoDocAdmin());
		return ltac_tipoAdminVo;
	}
}
