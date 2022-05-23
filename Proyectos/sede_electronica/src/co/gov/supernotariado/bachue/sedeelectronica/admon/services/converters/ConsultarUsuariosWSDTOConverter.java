/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ConsultarUsuariosWSDTOConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: ConsultarUsuariosWSDTOConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos.TipoAdminVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos.TipoEntradaConsultarUsuariosVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos.TipoSalidaConsultarUsuariosVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos.TipoUsuarioCUSOVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoAdminWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarUsuariosWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarUsuariosWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoUsuarioCUSOWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Consultar
 * usuarios WSDTO. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ConsultarUsuariosWSDTOConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ConsultarUsuariosWSDTOConverter.
	 */
	private ConsultarUsuariosWSDTOConverter() {
		// Constructor vacio de la clase
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaConsultarUsuariosVO <b>a</b>
	 * TipoSalidaConsultarUsuariosWSDTO, <br>
	 * En otras palabras, <b>de</b> Tipo salida consultar usuarios objeto con
	 * valores de servicio <b>a</b> Tipo salida consultar usuarios web service dto.
	 *
	 * @param atscu_tipoSalidaConsultarUsuariosVo el parametro tipo salida consultar
	 *                                            usuarios vo
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como TipoSalidaConsultarUsuariosWSDTO
	 */
	public static TipoSalidaConsultarUsuariosWSDTO entidadAVo(
			TipoSalidaConsultarUsuariosVO atscu_tipoSalidaConsultarUsuariosVo) {
		TipoSalidaConsultarUsuariosWSDTO ltscu_tipoSalidaConsultarUsuariosVo = new TipoSalidaConsultarUsuariosWSDTO();
		ltscu_tipoSalidaConsultarUsuariosVo
				.setIbi_codigoMensaje(atscu_tipoSalidaConsultarUsuariosVo.getIbi_codigoMensaje());
		ltscu_tipoSalidaConsultarUsuariosVo
				.setIs_descripcionMensaje(atscu_tipoSalidaConsultarUsuariosVo.getIs_descripcionMensaje());
		ltscu_tipoSalidaConsultarUsuariosVo.setIltu_usuarios(
				listaUsuarioAListaUsuarioWSDTO(atscu_tipoSalidaConsultarUsuariosVo.getIltu_usuarios()));
		return ltscu_tipoSalidaConsultarUsuariosVo;
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
	 * Especificamente convierte <b>de</b> una TipoUsuarioCUSOVO <b>a</b> una
	 * TipoUsuarioCUSOWSDTO, <br>
	 * En otras palabras, <b>de</b> una Tipo usuario CUSOVO <b>a</b> una Tipo
	 * usuario CUSOWSDTO.
	 *
	 * @param altu_listaTipoUsuariocusoVo el parametro lista tipo usuariocuso vo
	 * @return Resultado para convertir de lista de valores de servicio a lista de
	 *         web service dto, retornado como una lista de TipoUsuarioCUSOWSDTO
	 */
	private static List<TipoUsuarioCUSOWSDTO> listaUsuarioAListaUsuarioWSDTO(
			List<TipoUsuarioCUSOVO> altu_listaTipoUsuariocusoVo) {
		List<TipoUsuarioCUSOWSDTO> lltu_listaTipoUsuarioCusoWsDto = new ArrayList<>();
		for (TipoUsuarioCUSOVO ltuc_tipoUsuarioCusoVo : altu_listaTipoUsuariocusoVo) {
			lltu_listaTipoUsuarioCusoWsDto.add(usuarioAusuarioVo(ltuc_tipoUsuarioCusoVo));
		}
		return lltu_listaTipoUsuarioCusoWsDto;
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoUsuarioCUSOVO <b>a</b>
	 * TipoUsuarioCUSOWSDTO, <br>
	 * En otras palabras, <b>de</b> Tipo usuario CUSOVO <b>a</b> Tipo usuario
	 * CUSOWSDTO.
	 *
	 * @param atu_tipoUsuarioCusoVo el parametro tipo usuario cuso vo
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como TipoUsuarioCUSOWSDTO
	 */
	private static TipoUsuarioCUSOWSDTO usuarioAusuarioVo(TipoUsuarioCUSOVO atu_tipoUsuarioCusoVo) {
		TipoUsuarioCUSOWSDTO ltu_tipoUsuarioCusoWsDto = new TipoUsuarioCUSOWSDTO();
		ltu_tipoUsuarioCusoWsDto.setId_fechaCancelacion(atu_tipoUsuarioCusoVo.getId_fechaCancelacion());
		ltu_tipoUsuarioCusoWsDto.setId_fechaCreacion(atu_tipoUsuarioCusoVo.getId_fechaCreacion());
		ltu_tipoUsuarioCusoWsDto.setIs_correoElectronicoCorporativoUsuario(
				atu_tipoUsuarioCusoVo.getIs_correoElectronicoCorporativoUsuario());
		ltu_tipoUsuarioCusoWsDto.setIs_estado(atu_tipoUsuarioCusoVo.getIs_estado());
		ltu_tipoUsuarioCusoWsDto.setIs_numDocUsuario(atu_tipoUsuarioCusoVo.getIs_numDocUsuario());
		ltu_tipoUsuarioCusoWsDto.setIs_primerApellidoUsuario(atu_tipoUsuarioCusoVo.getIs_primerApellidoUsuario());
		ltu_tipoUsuarioCusoWsDto.setIs_primerNombreUsuario(atu_tipoUsuarioCusoVo.getIs_primerNombreUsuario());
		ltu_tipoUsuarioCusoWsDto.setIs_segundoApellidoUsuario(atu_tipoUsuarioCusoVo.getIs_segundoApellidoUsuario());
		ltu_tipoUsuarioCusoWsDto.setIs_segundoNombreUsuario(atu_tipoUsuarioCusoVo.getIs_segundoNombreUsuario());
		ltu_tipoUsuarioCusoWsDto.setIs_tipoDocUsuario(atu_tipoUsuarioCusoVo.getIs_tipoDocUsuario());
		return ltu_tipoUsuarioCusoWsDto;
	}

	/**
	 * Metodo que convierte de WSDTO a VO ( De Objeto de Transferencia de Datos de
	 * Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto WSDTO manipulado en la capa de negocio, en
	 * una entrada de datos para consumir una operacion de un servicio(objeto VO).
	 * <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoEntradaConsultarUsuariosWSDTO
	 * <b>a</b> TipoEntradaConsultarUsuariosVO, <br>
	 * En otras palabras, <b>de</b> Tipo entrada consultar usuarios web service dto
	 * <b>a</b> Tipo entrada consultar usuarios objeto con valores de servicio.
	 *
	 * @param atecu_tipoEntradaConsultarUsuariosWsDto el parametro tipo entrada
	 *                                                consultar usuarios ws dto
	 * @return Resultado para convertir web service dto a objeto de valores de
	 *         servicio, retornado como TipoEntradaConsultarUsuariosVO
	 */
	public static TipoEntradaConsultarUsuariosVO voAEntidad(
			TipoEntradaConsultarUsuariosWSDTO atecu_tipoEntradaConsultarUsuariosWsDto) {
		TipoEntradaConsultarUsuariosVO ltecu_tipoEntradaConsultarUsuariosVo = new TipoEntradaConsultarUsuariosVO();
		ltecu_tipoEntradaConsultarUsuariosVo
				.setIta_adminVo(adminVoAAdmin(atecu_tipoEntradaConsultarUsuariosWsDto.getItac_adminVo()));
		ltecu_tipoEntradaConsultarUsuariosVo
				.setIs_idCuentaCupo(atecu_tipoEntradaConsultarUsuariosWsDto.getIs_idCuentaCupo());
		ltecu_tipoEntradaConsultarUsuariosVo.setIs_modulo(atecu_tipoEntradaConsultarUsuariosWsDto.getIs_modulo());
		return ltecu_tipoEntradaConsultarUsuariosVo;
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
	 * @param atac_adminWsDto el parametro admin ws dto
	 * @return Resultado para convertir web service dto a objeto de valores de
	 *         servicio, retornado como TipoAdminVO
	 */
	private static TipoAdminVO adminVoAAdmin(TipoAdminWSDTO atac_adminWsDto) {
		TipoAdminVO ltac_tipoAdminVo = new TipoAdminVO();
		ltac_tipoAdminVo.setIs_numDocAdmin(atac_adminWsDto.getIs_numDocAdmin());
		ltac_tipoAdminVo.setIs_tipoDocAdmin(atac_adminWsDto.getIs_tipoDocAdmin());
		return ltac_tipoAdminVo;
	}
}
