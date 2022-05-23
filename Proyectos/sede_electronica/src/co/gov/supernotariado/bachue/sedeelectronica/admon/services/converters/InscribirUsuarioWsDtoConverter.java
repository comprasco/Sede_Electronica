/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: InscribirUsuarioWsDtoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: InscribirUsuarioWsDtoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos.TipoAdminVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos.TipoEntradaInscribirUsuarioVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos.TipoSalidaInscribirUsuarioVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos.TipoUsuarioIUIVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoAdminWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaInscribirUsuarioWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaInscribirUsuarioWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoUsuarioIUIWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Inscribir
 * usuario ws dto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class InscribirUsuarioWsDtoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * InscribirUsuarioWsDtoConverter.
	 */
	private InscribirUsuarioWsDtoConverter() {
		// Constructor vacio de la clase
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaInscribirUsuarioVO <b>a</b>
	 * TipoSalidaInscribirUsuarioWSDTO, <br>
	 * En otras palabras, <b>de</b> Tipo salida inscribir usuario objeto con valores
	 * de servicio <b>a</b> Tipo salida inscribir usuario web service dto.
	 *
	 * @param atsiu_tipoSalidaInscribirUsuarioVo el parametro tipo salida inscribir
	 *                                           usuario vo
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como TipoSalidaInscribirUsuarioWSDTO
	 */
	public static TipoSalidaInscribirUsuarioWSDTO entidadAVo(
			TipoSalidaInscribirUsuarioVO atsiu_tipoSalidaInscribirUsuarioVo) {
		TipoSalidaInscribirUsuarioWSDTO ltsiu_tipoSalidaInscrivirUsuarioWsDto = new TipoSalidaInscribirUsuarioWSDTO();
		ltsiu_tipoSalidaInscrivirUsuarioWsDto
				.setIbi_codigoMensaje(atsiu_tipoSalidaInscribirUsuarioVo.getIs_codigoMensaje());
		ltsiu_tipoSalidaInscrivirUsuarioWsDto
				.setIs_descripcionMensaje(atsiu_tipoSalidaInscribirUsuarioVo.getIs_descripcionMensaje());
		return ltsiu_tipoSalidaInscrivirUsuarioWsDto;
	}

	/**
	 * Metodo que convierte de WSDTO a VO ( De Objeto de Transferencia de Datos de
	 * Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto WSDTO manipulado en la capa de negocio, en
	 * una entrada de datos para consumir una operacion de un servicio(objeto VO).
	 * <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoEntradaInscribirUsuarioWSDTO <b>a</b>
	 * TipoEntradaInscribirUsuarioVO, <br>
	 * En otras palabras, <b>de</b> Tipo entrada inscribir usuario web service dto
	 * <b>a</b> Tipo entrada inscribir usuario objeto con valores de servicio.
	 *
	 * @param ateiu_tipoEntradaInscribirUsuarioWsDto el parametro tipo entrada
	 *                                               inscribir usuario ws dto
	 * @return Resultado para convertir web service dto a objeto de valores de
	 *         servicio, retornado como TipoEntradaInscribirUsuarioVO
	 */
	public static TipoEntradaInscribirUsuarioVO voAEntidad(
			TipoEntradaInscribirUsuarioWSDTO ateiu_tipoEntradaInscribirUsuarioWsDto) {
		TipoEntradaInscribirUsuarioVO lteiu_tipoEntradaInscribirUsuarioVo = new TipoEntradaInscribirUsuarioVO();
		lteiu_tipoEntradaInscribirUsuarioVo
				.setIta_admin(adminVoAadmin(ateiu_tipoEntradaInscribirUsuarioWsDto.getIta_admin()));
		lteiu_tipoEntradaInscribirUsuarioVo
				.setIs_idCuentaCupo(ateiu_tipoEntradaInscribirUsuarioWsDto.getIs_idCuentaCupo());
		lteiu_tipoEntradaInscribirUsuarioVo.setIs_modulo(ateiu_tipoEntradaInscribirUsuarioWsDto.getIs_modulo());
		lteiu_tipoEntradaInscribirUsuarioVo
				.setItu_usuario(usuarioVoAUsuario(ateiu_tipoEntradaInscribirUsuarioWsDto.getItu_usuario()));
		return lteiu_tipoEntradaInscribirUsuarioVo;
	}

	/**
	 * Metodo que convierte de WSDTO a VO ( De Objeto de Transferencia de Datos de
	 * Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto WSDTO manipulado en la capa de negocio, en
	 * una entrada de datos para consumir una operacion de un servicio(objeto VO).
	 * <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoUsuarioIUIWSDTO <b>a</b>
	 * TipoUsuarioIUIVO, <br>
	 * En otras palabras, <b>de</b> Tipo usuario IUIWSDTO <b>a</b> Tipo usuario
	 * IUIVO.
	 *
	 * @param atu_usuarioWsDto el parametro usuario ws dto
	 * @return Resultado para convertir web service dto a objeto de valores de
	 *         servicio, retornado como TipoUsuarioIUIVO
	 */
	private static TipoUsuarioIUIVO usuarioVoAUsuario(TipoUsuarioIUIWSDTO atu_usuarioWsDto) {
		TipoUsuarioIUIVO ltu_tipoUsuarioIuiVo = new TipoUsuarioIUIVO();
		ltu_tipoUsuarioIuiVo.setIs_correoElectronicoCorporativoUsuario(
				atu_usuarioWsDto.getIs_correoElectronicoCorporativoUsuario());
		ltu_tipoUsuarioIuiVo.setIs_numDocUsuario(atu_usuarioWsDto.getIs_numDocUsuario());
		ltu_tipoUsuarioIuiVo.setIs_primerApellidoUsuario(atu_usuarioWsDto.getIs_primerApellidoUsuario());
		ltu_tipoUsuarioIuiVo.setIs_primerNombreUsuario(atu_usuarioWsDto.getIs_primerNombreUsuario());
		ltu_tipoUsuarioIuiVo.setIs_tipoDocUsuario(atu_usuarioWsDto.getIs_tipoDocUsuario());
		ltu_tipoUsuarioIuiVo.setIs_segundoApellidoUsuario(atu_usuarioWsDto.getIs_segundoApellidoUsuario());
		ltu_tipoUsuarioIuiVo.setIs_segundoNombreUsuario(atu_usuarioWsDto.getIs_segundoNombreUsuario());
		return ltu_tipoUsuarioIuiVo;
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
	 * @param ata_tipoAdminWsDto el parametro tipo admin ws dto
	 * @return Resultado para convertir web service dto a objeto de valores de
	 *         servicio, retornado como TipoAdminVO
	 */
	private static TipoAdminVO adminVoAadmin(TipoAdminWSDTO ata_tipoAdminWsDto) {
		TipoAdminVO lta_tipoAdminIuiVo = new TipoAdminVO();
		lta_tipoAdminIuiVo.setIs_numDocAdmin(ata_tipoAdminWsDto.getIs_numDocAdmin());
		lta_tipoAdminIuiVo.setIs_tipoDocAdmin(ata_tipoAdminWsDto.getIs_tipoDocAdmin());
		return lta_tipoAdminIuiVo;
	}
}
