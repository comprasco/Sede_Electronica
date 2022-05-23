/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: ConsultarUsuarioConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: ConsultarUsuarioConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import co.gov.supernotariado.bachue.clientebus.gestioncuentacupos.types.consultarusuario.TipoAdminCUI;
import co.gov.supernotariado.bachue.clientebus.gestioncuentacupos.types.consultarusuario.TipoEntradaConsultarUsuario;
import co.gov.supernotariado.bachue.clientebus.gestioncuentacupos.types.consultarusuario.TipoSalidaConsultarUsuario;
import co.gov.supernotariado.bachue.clientebus.gestioncuentacupos.types.consultarusuario.TipoUsuarioCUI;
import co.gov.supernotariado.bachue.clientebus.gestioncuentacupos.types.consultarusuario.TipoUsuarioCUO;
import co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos.TipoAdminVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos.TipoEntradaConsultarUsuarioVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos.TipoSalidaConsultarUsuarioVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos.TipoUsuarioCUIVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos.TipoUsuarioCUOVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Consultar
 * usuario. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ConsultarUsuarioConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase ConsultarUsuarioConverter.
	 */
	private ConsultarUsuarioConverter() {
		// Metodo constructor privado y vacio
	}

	/**
	 * Metodo que convierte de ComplexType a VO ( De elemento especifico del esquema
	 * de un Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto con un resultado/salida de una peticion de
	 * Servicio SOAP, en un objeto de datos llamado VO; para ser retornado como
	 * resultado a la aplicacion o capa de negocio que consume el cliente de
	 * servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaConsultarUsuario <b>a</b>
	 * TipoSalidaConsultarUsuarioVO, <br>
	 * En otras palabras, <b>de</b> Tipo salida consultar usuario (ComplexType
	 * relacionado a la representacion XML del servicio) <b>a</b> Tipo salida
	 * consultar usuario objeto con valores de servicio.
	 *
	 * @param atscu_tipoSalidaConsultarUsuario el parametro que representa el
	 *                                         complex type a convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como TipoSalidaConsultarUsuarioVO.
	 */
	public static TipoSalidaConsultarUsuarioVO tipoAVo(TipoSalidaConsultarUsuario atscu_tipoSalidaConsultarUsuario) {
		TipoSalidaConsultarUsuarioVO ltscu_tipoSalidaConsultarSalida = new TipoSalidaConsultarUsuarioVO();
		ltscu_tipoSalidaConsultarSalida.setIbi_codigoMensaje(atscu_tipoSalidaConsultarUsuario.getCodigoMensaje());
		ltscu_tipoSalidaConsultarSalida
				.setIs_descripcionMensaje(atscu_tipoSalidaConsultarUsuario.getDescripcionMensaje());
		ltscu_tipoSalidaConsultarSalida
				.setItuc_usuarioVo(tipoUsuarioATipoUsuarioVo(atscu_tipoSalidaConsultarUsuario.getUsuario()));
		return ltscu_tipoSalidaConsultarSalida;
	}

	/**
	 * Metodo que convierte de ComplexType a VO ( De elemento especifico del esquema
	 * de un Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto con un resultado/salida de una peticion de
	 * Servicio SOAP, en un objeto de datos llamado VO; para ser retornado como
	 * resultado a la aplicacion o capa de negocio que consume el cliente de
	 * servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoUsuarioCUO <b>a</b> TipoUsuarioCUOVO,
	 * <br>
	 * En otras palabras, <b>de</b> Tipo usuario consultar usuario output
	 * (ComplexType relacionado a la representacion XML del servicio) <b>a</b> Tipo
	 * usuario CUOVO.
	 *
	 * @param atu_tipoUsuarioCuo el parametro que representa el complex type a
	 *                           convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como TipoUsuarioCUOVO.
	 */
	private static TipoUsuarioCUOVO tipoUsuarioATipoUsuarioVo(TipoUsuarioCUO atu_tipoUsuarioCuo) {
		TipoUsuarioCUOVO ltu_tipoUsuarioCuoVo = new TipoUsuarioCUOVO();
		if (atu_tipoUsuarioCuo.getFechaCancelacion() != null)
			ltu_tipoUsuarioCuoVo.setId_fechaCancelacion(
					atu_tipoUsuarioCuo.getFechaCancelacion().getValue().toGregorianCalendar().getTime());
		if (atu_tipoUsuarioCuo.getFechaCreacion() != null)
			ltu_tipoUsuarioCuoVo.setId_fechaCreacion(
					atu_tipoUsuarioCuo.getFechaCreacion().getValue().toGregorianCalendar().getTime());
		ltu_tipoUsuarioCuoVo
				.setIs_correoElectronicoCorporativoUsuario(atu_tipoUsuarioCuo.getCorreoElectronicoCorporativoUsuario());
		ltu_tipoUsuarioCuoVo.setIs_estado(atu_tipoUsuarioCuo.getEstado());
		ltu_tipoUsuarioCuoVo.setIs_numDocUsuario(atu_tipoUsuarioCuo.getNumDocUsuario());
		ltu_tipoUsuarioCuoVo.setIs_primerApellidoUsuario(atu_tipoUsuarioCuo.getPrimerApellidoUsuario());
		ltu_tipoUsuarioCuoVo.setIs_primerNombreUsuario(atu_tipoUsuarioCuo.getPrimerNombreUsuario());
		if (atu_tipoUsuarioCuo.getSegundoApellidoUsuario() != null)
			ltu_tipoUsuarioCuoVo
					.setIs_segundoApellidoUsuario(atu_tipoUsuarioCuo.getSegundoApellidoUsuario().getValue());
		if (atu_tipoUsuarioCuo.getSegundoNombreUsuario() != null)
			ltu_tipoUsuarioCuoVo.setIs_segundoNombreUsuario(atu_tipoUsuarioCuo.getSegundoNombreUsuario().getValue());
		ltu_tipoUsuarioCuoVo.setIs_tipoDocUsuario(atu_tipoUsuarioCuo.getTipoDocUsuario());
		return ltu_tipoUsuarioCuoVo;
	}

	/**
	 * Metodo que convierte de VO a ComplexType (De Objeto de valores de Servicio,
	 * entrada del cliente bus; a elemento especifico del esquema de un Servicio
	 * Web, entrada de una peticion de Servicio SOAP).<br>
	 * Se usa para convertir un objeto con las entradas de un servicio web (objeto
	 * VO), a un objeto ComplexType para ser enviado en una operacion de un
	 * servicio. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoEntradaConsultarUsuarioVO <b>a</b>
	 * TipoEntradaConsultarUsuario, <br>
	 * En otras palabras, <b>de</b> Tipo entrada consultar usuario objeto con
	 * valores de servicio <b>a</b> Tipo entrada consultar usuario (ComplexType
	 * relacionado a la representacion XML del servicio).
	 *
	 * @param atecu_tipoEntradaConsultarUsuarioVo el parametro que representa el
	 *                                            objeto con valores de servicio a
	 *                                            convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como TipoEntradaConsultarUsuario.
	 */
	public static TipoEntradaConsultarUsuario voATipo(
			TipoEntradaConsultarUsuarioVO atecu_tipoEntradaConsultarUsuarioVo) {
		TipoEntradaConsultarUsuario ltecu_tipoEntradaConsultarUsuario = new TipoEntradaConsultarUsuario();
		ltecu_tipoEntradaConsultarUsuario.setAdmin(adminVoAAdmin(atecu_tipoEntradaConsultarUsuarioVo.getIta_adminVo()));
		ltecu_tipoEntradaConsultarUsuario.setIDCuentaCupo(atecu_tipoEntradaConsultarUsuarioVo.getIs_idCuentaCupo());
		ltecu_tipoEntradaConsultarUsuario.setModulo(atecu_tipoEntradaConsultarUsuarioVo.getIs_modulo());
		ltecu_tipoEntradaConsultarUsuario
				.setUsuario(usuarioVoAUsuario(atecu_tipoEntradaConsultarUsuarioVo.getItuc_usuarioVo()));
		return ltecu_tipoEntradaConsultarUsuario;
	}

	/**
	 * Metodo que convierte de VO a ComplexType (De Objeto de valores de Servicio,
	 * entrada del cliente bus; a elemento especifico del esquema de un Servicio
	 * Web, entrada de una peticion de Servicio SOAP).<br>
	 * Se usa para convertir un objeto con las entradas de un servicio web (objeto
	 * VO), a un objeto ComplexType para ser enviado en una operacion de un
	 * servicio. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoUsuarioCUIVO <b>a</b> TipoUsuarioCUI,
	 * <br>
	 * En otras palabras, <b>de</b> Tipo usuario CUIVO <b>a</b> Tipo usuario
	 * consultar usuario input (ComplexType relacionado a la representacion XML del
	 * servicio).
	 *
	 * @param atuc_usuarioVo el parametro que representa el objeto con valores de
	 *                       servicio a convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como TipoUsuarioCUI.
	 */
	private static TipoUsuarioCUI usuarioVoAUsuario(TipoUsuarioCUIVO atuc_usuarioVo) {
		TipoUsuarioCUI ltu_tipoUsuario = new TipoUsuarioCUI();
		ltu_tipoUsuario.setNumDocUsuario(atuc_usuarioVo.getIs_numDocUsuario());
		ltu_tipoUsuario.setTipoDocUsuario(atuc_usuarioVo.getIs_tipoDocUsuario());
		return ltu_tipoUsuario;
	}

	/**
	 * Metodo que convierte de VO a ComplexType (De Objeto de valores de Servicio,
	 * entrada del cliente bus; a elemento especifico del esquema de un Servicio
	 * Web, entrada de una peticion de Servicio SOAP).<br>
	 * Se usa para convertir un objeto con las entradas de un servicio web (objeto
	 * VO), a un objeto ComplexType para ser enviado en una operacion de un
	 * servicio. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoAdminVO <b>a</b> TipoAdminCUI, <br>
	 * En otras palabras, <b>de</b> Tipo admin objeto con valores de servicio
	 * <b>a</b> Tipo admin consultar usuario input (ComplexType relacionado a la
	 * representacion XML del servicio).
	 *
	 * @param ata_adminVo el parametro que representa el objeto con valores de
	 *                    servicio a convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como TipoAdminCUI.
	 */
	private static TipoAdminCUI adminVoAAdmin(TipoAdminVO ata_adminVo) {
		TipoAdminCUI lta_tipoAdmin = new TipoAdminCUI();
		lta_tipoAdmin.setNumDocAdmin(ata_adminVo.getIs_numDocAdmin());
		lta_tipoAdmin.setTipoDocAdmin(ata_adminVo.getIs_tipoDocAdmin());
		return lta_tipoAdmin;
	}
}
