/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: CancelarUsuarioConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: CancelarUsuarioConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import co.gov.supernotariado.bachue.clientebus.enums.EnumTypesSoap;
import co.gov.supernotariado.bachue.clientebus.gestioncuentacupos.types.cancelarusuario.TipoAdminCNUI;
import co.gov.supernotariado.bachue.clientebus.gestioncuentacupos.types.cancelarusuario.TipoEntradaCancelarUsuario;
import co.gov.supernotariado.bachue.clientebus.gestioncuentacupos.types.cancelarusuario.TipoSalidaCancelarUsuario;
import co.gov.supernotariado.bachue.clientebus.gestioncuentacupos.types.cancelarusuario.TipoUsuarioCNUI;
import co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos.TipoAdminVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos.TipoEntradaCancelarUsuarioVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos.TipoSalidaCancelarUsuarioVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos.TipoUsuarioCNUIVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Cancelar
 * usuario. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class CancelarUsuarioConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase CancelarUsuarioConverter.
	 */
	private CancelarUsuarioConverter() {
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
	 * Especificamente convierte <b>de</b> TipoSalidaCancelarUsuario <b>a</b>
	 * TipoSalidaCancelarUsuarioVO, <br>
	 * En otras palabras, <b>de</b> Tipo salida cancelar usuario (ComplexType
	 * relacionado a la representacion XML del servicio) <b>a</b> Tipo salida
	 * cancelar usuario objeto con valores de servicio.
	 *
	 * @param atscu_tipoSalidaCancelarUsuario el parametro que representa el complex
	 *                                        type a convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como TipoSalidaCancelarUsuarioVO.
	 */
	public static TipoSalidaCancelarUsuarioVO tipoAVo(TipoSalidaCancelarUsuario atscu_tipoSalidaCancelarUsuario) {
		TipoSalidaCancelarUsuarioVO ltscu_tipoSalidaCancelarUsuarioVo = new TipoSalidaCancelarUsuarioVO();
		ltscu_tipoSalidaCancelarUsuarioVo.setIbi_codigoMensaje(atscu_tipoSalidaCancelarUsuario.getCodigoMensaje());
		ltscu_tipoSalidaCancelarUsuarioVo
				.setIs_descripcionMensaje(atscu_tipoSalidaCancelarUsuario.getDescripcionMensaje());
		return ltscu_tipoSalidaCancelarUsuarioVo;
	}

	/**
	 * Metodo que convierte de VO a ComplexType (De Objeto de valores de Servicio,
	 * entrada del cliente bus; a elemento especifico del esquema de un Servicio
	 * Web, entrada de una peticion de Servicio SOAP).<br>
	 * Se usa para convertir un objeto con las entradas de un servicio web (objeto
	 * VO), a un objeto ComplexType para ser enviado en una operacion de un
	 * servicio. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoEntradaCancelarUsuarioVO <b>a</b>
	 * TipoEntradaCancelarUsuario, <br>
	 * En otras palabras, <b>de</b> Tipo entrada cancelar usuario objeto con valores
	 * de servicio <b>a</b> Tipo entrada cancelar usuario (ComplexType relacionado a
	 * la representacion XML del servicio).
	 *
	 * @param atecu_tipoEntradaCancelarUsuarioVo el parametro que representa el
	 *                                           objeto con valores de servicio a
	 *                                           convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como TipoEntradaCancelarUsuario.
	 */
	public static TipoEntradaCancelarUsuario voATipo(TipoEntradaCancelarUsuarioVO atecu_tipoEntradaCancelarUsuarioVo) {
		TipoEntradaCancelarUsuario ltecu_tipoEntradaCancelarUsuario = new TipoEntradaCancelarUsuario();
		ltecu_tipoEntradaCancelarUsuario.setIDCuentaCupo(atecu_tipoEntradaCancelarUsuarioVo.getIs_idCuentaCupo());
		ltecu_tipoEntradaCancelarUsuario.setModulo(atecu_tipoEntradaCancelarUsuarioVo.getIs_modulo());
		ltecu_tipoEntradaCancelarUsuario
				.setAdmin(adminVoAadmin(atecu_tipoEntradaCancelarUsuarioVo.getIta_administradorVo()));
		ltecu_tipoEntradaCancelarUsuario
				.setUsuario(usuarioVoAusuario(atecu_tipoEntradaCancelarUsuarioVo.getItucnui_usuarioVo()));
		return ltecu_tipoEntradaCancelarUsuario;
	}

	/**
	 * Metodo que convierte de VO a ComplexType (De Objeto de valores de Servicio,
	 * entrada del cliente bus; a elemento especifico del esquema de un Servicio
	 * Web, entrada de una peticion de Servicio SOAP).<br>
	 * Se usa para convertir un objeto con las entradas de un servicio web (objeto
	 * VO), a un objeto ComplexType para ser enviado en una operacion de un
	 * servicio. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoUsuarioCNUIVO <b>a</b>
	 * TipoUsuarioCNUI, <br>
	 * En otras palabras, <b>de</b> Tipo usuario CNUIVO <b>a</b> Tipo usuario
	 * cancelar usuario input (ComplexType relacionado a la representacion XML del
	 * servicio).
	 *
	 * @param atuc_usuarioVo el parametro que representa el objeto con valores de
	 *                       servicio a convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como TipoUsuarioCNUI.
	 */
	private static TipoUsuarioCNUI usuarioVoAusuario(TipoUsuarioCNUIVO atuc_usuarioVo) {
		TipoUsuarioCNUI ltuc_tipoUsuarioCnui = new TipoUsuarioCNUI();
		ltuc_tipoUsuarioCnui
				.setCorreoElectronicoCorporativoUsuario(atuc_usuarioVo.getIs_correoElectronicoCorporativoUsuario());
		ltuc_tipoUsuarioCnui.setNumDocUsuario(atuc_usuarioVo.getIs_numDocUsuario());
		ltuc_tipoUsuarioCnui.setPrimerApellidoUsuario(atuc_usuarioVo.getIs_primerApellidoUsuario());
		ltuc_tipoUsuarioCnui.setPrimerNombreUsuario(atuc_usuarioVo.getIs_primerNombreUsuario());
		ltuc_tipoUsuarioCnui.setTipoDocUsuario(atuc_usuarioVo.getIs_tipoDocUsuario());
		QName lqn_segundoApellido = new QName(EnumTypesSoap.QNAME_SEGUNDO_APELLIDO_USUARIO.getIs_valor());
		JAXBElement<String> ljes_segundoApellido = new JAXBElement<>(lqn_segundoApellido, String.class,
				atuc_usuarioVo.getIs_segundoApellidoUsuario());
		QName lqn_segundoNombre = new QName(EnumTypesSoap.QNAME_SEGUNDO_NOMBRE_USUARIO.getIs_valor());
		JAXBElement<String> ljes_segundoNombre = new JAXBElement<>(lqn_segundoNombre, String.class,
				atuc_usuarioVo.getIs_segundoNombreUsuario());
		ltuc_tipoUsuarioCnui.setSegundoApellidoUsuario(ljes_segundoApellido);
		ltuc_tipoUsuarioCnui.setSegundoNombreUsuario(ljes_segundoNombre);
		return ltuc_tipoUsuarioCnui;
	}

	/**
	 * Metodo que convierte de VO a ComplexType (De Objeto de valores de Servicio,
	 * entrada del cliente bus; a elemento especifico del esquema de un Servicio
	 * Web, entrada de una peticion de Servicio SOAP).<br>
	 * Se usa para convertir un objeto con las entradas de un servicio web (objeto
	 * VO), a un objeto ComplexType para ser enviado en una operacion de un
	 * servicio. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoAdminVO <b>a</b> TipoAdminCNUI, <br>
	 * En otras palabras, <b>de</b> Tipo admin objeto con valores de servicio
	 * <b>a</b> Tipo admin cancelar usuario input (ComplexType relacionado a la
	 * representacion XML del servicio).
	 *
	 * @param ata_administradorVo el parametro que representa el objeto con valores
	 *                            de servicio a convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como TipoAdminCNUI.
	 */
	private static TipoAdminCNUI adminVoAadmin(TipoAdminVO ata_administradorVo) {
		TipoAdminCNUI ltac_tipoAdminCnui = new TipoAdminCNUI();
		ltac_tipoAdminCnui.setNumDocAdmin(ata_administradorVo.getIs_numDocAdmin());
		ltac_tipoAdminCnui.setTipoDocAdmin(ata_administradorVo.getIs_tipoDocAdmin());
		return ltac_tipoAdminCnui;
	}
}
