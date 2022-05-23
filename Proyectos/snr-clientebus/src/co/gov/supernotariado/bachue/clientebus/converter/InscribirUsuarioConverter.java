/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: InscribirUsuarioConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: InscribirUsuarioConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import co.gov.supernotariado.bachue.clientebus.enums.EnumTypesSoap;
import co.gov.supernotariado.bachue.clientebus.gestioncuentacupos.types.inscribirusuario.TipoAdminIUI;
import co.gov.supernotariado.bachue.clientebus.gestioncuentacupos.types.inscribirusuario.TipoEntradaInscribirUsuario;
import co.gov.supernotariado.bachue.clientebus.gestioncuentacupos.types.inscribirusuario.TipoSalidaInscribirUsuario;
import co.gov.supernotariado.bachue.clientebus.gestioncuentacupos.types.inscribirusuario.TipoUsuarioIUI;
import co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos.TipoAdminVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos.TipoEntradaInscribirUsuarioVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos.TipoSalidaInscribirUsuarioVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos.TipoUsuarioIUIVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Inscribir
 * usuario. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class InscribirUsuarioConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase InscribirUsuarioConverter.
	 */
	private InscribirUsuarioConverter() {
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
	 * Especificamente convierte <b>de</b> TipoSalidaInscribirUsuario <b>a</b>
	 * TipoSalidaInscribirUsuarioVO, <br>
	 * En otras palabras, <b>de</b> Tipo salida inscribir usuario (ComplexType
	 * relacionado a la representacion XML del servicio) <b>a</b> Tipo salida
	 * inscribir usuario objeto con valores de servicio.
	 *
	 * @param atsiu_tipoSalidaInscribirUsuario el parametro que representa el
	 *                                         complex type a convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como TipoSalidaInscribirUsuarioVO.
	 */
	public static TipoSalidaInscribirUsuarioVO tipoAVo(TipoSalidaInscribirUsuario atsiu_tipoSalidaInscribirUsuario) {
		TipoSalidaInscribirUsuarioVO ltsiu_tipoSalidaInscrivirUsuarioVo = new TipoSalidaInscribirUsuarioVO();
		ltsiu_tipoSalidaInscrivirUsuarioVo.setIs_codigoMensaje(atsiu_tipoSalidaInscribirUsuario.getCodigoMensaje());
		ltsiu_tipoSalidaInscrivirUsuarioVo
				.setIs_descripcionMensaje(atsiu_tipoSalidaInscribirUsuario.getDescripcionMensaje());
		return ltsiu_tipoSalidaInscrivirUsuarioVo;
	}

	/**
	 * Metodo que convierte de VO a ComplexType (De Objeto de valores de Servicio,
	 * entrada del cliente bus; a elemento especifico del esquema de un Servicio
	 * Web, entrada de una peticion de Servicio SOAP).<br>
	 * Se usa para convertir un objeto con las entradas de un servicio web (objeto
	 * VO), a un objeto ComplexType para ser enviado en una operacion de un
	 * servicio. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoEntradaInscribirUsuarioVO <b>a</b>
	 * TipoEntradaInscribirUsuario, <br>
	 * En otras palabras, <b>de</b> Tipo entrada inscribir usuario objeto con
	 * valores de servicio <b>a</b> Tipo entrada inscribir usuario (ComplexType
	 * relacionado a la representacion XML del servicio).
	 *
	 * @param ateiu_tipoEntradaInscribirUsuarioVo el parametro que representa el
	 *                                            objeto con valores de servicio a
	 *                                            convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como TipoEntradaInscribirUsuario.
	 */
	public static TipoEntradaInscribirUsuario voATipo(
			TipoEntradaInscribirUsuarioVO ateiu_tipoEntradaInscribirUsuarioVo) {
		TipoEntradaInscribirUsuario lteiu_tipoEntradaInscribirUsuario = new TipoEntradaInscribirUsuario();
		lteiu_tipoEntradaInscribirUsuario.setAdmin(adminVoAadmin(ateiu_tipoEntradaInscribirUsuarioVo.getIta_admin()));
		lteiu_tipoEntradaInscribirUsuario.setIDCuentaCupo(ateiu_tipoEntradaInscribirUsuarioVo.getIs_idCuentaCupo());
		lteiu_tipoEntradaInscribirUsuario.setModulo(ateiu_tipoEntradaInscribirUsuarioVo.getIs_modulo());
		lteiu_tipoEntradaInscribirUsuario
				.setUsuario(usuarioVoAUsuario(ateiu_tipoEntradaInscribirUsuarioVo.getItu_usuario()));
		return lteiu_tipoEntradaInscribirUsuario;
	}

	/**
	 * Metodo que convierte de VO a ComplexType (De Objeto de valores de Servicio,
	 * entrada del cliente bus; a elemento especifico del esquema de un Servicio
	 * Web, entrada de una peticion de Servicio SOAP).<br>
	 * Se usa para convertir un objeto con las entradas de un servicio web (objeto
	 * VO), a un objeto ComplexType para ser enviado en una operacion de un
	 * servicio. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoUsuarioIUIVO <b>a</b> TipoUsuarioIUI,
	 * <br>
	 * En otras palabras, <b>de</b> Tipo usuario IUIVO <b>a</b> Tipo usuario
	 * inscribir usuario input (ComplexType relacionado a la representacion XML del
	 * servicio).
	 *
	 * @param atu_usuario el parametro que representa el objeto con valores de
	 *                    servicio a convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como TipoUsuarioIUI.
	 */
	private static TipoUsuarioIUI usuarioVoAUsuario(TipoUsuarioIUIVO atu_usuario) {
		TipoUsuarioIUI ltu_tipoUsuarioIui = new TipoUsuarioIUI();
		ltu_tipoUsuarioIui
				.setCorreoElectronicoCorporativoUsuario(atu_usuario.getIs_correoElectronicoCorporativoUsuario());
		ltu_tipoUsuarioIui.setNumDocUsuario(atu_usuario.getIs_numDocUsuario());
		ltu_tipoUsuarioIui.setPrimerApellidoUsuario(atu_usuario.getIs_primerApellidoUsuario());
		ltu_tipoUsuarioIui.setPrimerNombreUsuario(atu_usuario.getIs_primerNombreUsuario());
		ltu_tipoUsuarioIui.setTipoDocUsuario(atu_usuario.getIs_tipoDocUsuario());
		QName lqn_segundoApellido = new QName(EnumTypesSoap.QNAME_SEGUNDO_APELLIDO_USUARIO.getIs_valor());
		JAXBElement<String> ljes_segundoApellido = new JAXBElement<>(lqn_segundoApellido, String.class,
				atu_usuario.getIs_segundoApellidoUsuario());
		QName lqn_segundoNombre = new QName(EnumTypesSoap.QNAME_SEGUNDO_NOMBRE_USUARIO.getIs_valor());
		JAXBElement<String> ljes_segundoNombre = new JAXBElement<>(lqn_segundoNombre, String.class,
				atu_usuario.getIs_segundoNombreUsuario());
		ltu_tipoUsuarioIui.setSegundoApellidoUsuario(ljes_segundoApellido);
		ltu_tipoUsuarioIui.setSegundoNombreUsuario(ljes_segundoNombre);
		return ltu_tipoUsuarioIui;
	}

	/**
	 * Metodo que convierte de VO a ComplexType (De Objeto de valores de Servicio,
	 * entrada del cliente bus; a elemento especifico del esquema de un Servicio
	 * Web, entrada de una peticion de Servicio SOAP).<br>
	 * Se usa para convertir un objeto con las entradas de un servicio web (objeto
	 * VO), a un objeto ComplexType para ser enviado en una operacion de un
	 * servicio. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoAdminVO <b>a</b> TipoAdminIUI, <br>
	 * En otras palabras, <b>de</b> Tipo admin objeto con valores de servicio
	 * <b>a</b> Tipo admin inscribir usuario input (ComplexType relacionado a la
	 * representacion XML del servicio).
	 *
	 * @param ata_tipoAdminVo el parametro que representa el objeto con valores de
	 *                        servicio a convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como TipoAdminIUI.
	 */
	private static TipoAdminIUI adminVoAadmin(TipoAdminVO ata_tipoAdminVo) {
		TipoAdminIUI lta_tipoAdminIui = new TipoAdminIUI();
		lta_tipoAdminIui.setNumDocAdmin(ata_tipoAdminVo.getIs_numDocAdmin());
		lta_tipoAdminIui.setTipoDocAdmin(ata_tipoAdminVo.getIs_tipoDocAdmin());
		return lta_tipoAdminIui;
	}
}
