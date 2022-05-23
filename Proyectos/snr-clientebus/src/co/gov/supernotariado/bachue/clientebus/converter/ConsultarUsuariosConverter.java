/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: ConsultarUsuariosConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.converter
 * Nombre del elemento: ConsultarUsuariosConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.converter;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.gestioncuentacupos.types.consultarusuarios.TipoAdminCUSI;
import co.gov.supernotariado.bachue.clientebus.gestioncuentacupos.types.consultarusuarios.TipoEntradaConsultarUsuarios;
import co.gov.supernotariado.bachue.clientebus.gestioncuentacupos.types.consultarusuarios.TipoSalidaConsultarUsuarios;
import co.gov.supernotariado.bachue.clientebus.gestioncuentacupos.types.consultarusuarios.TipoUsuarioCUSO;
import co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos.TipoAdminVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos.TipoEntradaConsultarUsuariosVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos.TipoSalidaConsultarUsuariosVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos.TipoUsuarioCUSOVO;

/**
 * Clase auxiliar (Converter) del proyecto Cliente BUS, que permite transformar
 * entre Value Object(VO) y ComplexType.<br>
 * <b>VO</b>, objeto que recibe o retorna el cliente de servicios cuando lo
 * invoca otra aplicacion o capa de negocio. <br>
 * <b>ComplexType</b>, objeto que representa un elemento especifico de un
 * esquema de servicios SOAP, relacionado a una representacion XML que sera
 * enviada o recibida al hacer ejecutar una operacion de un servicio. <br>
 * Contiene metodos de transformacion para el elemento u operacion Consultar
 * usuarios. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ConsultarUsuariosConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase ConsultarUsuariosConverter.
	 */
	private ConsultarUsuariosConverter() {
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
	 * Especificamente convierte <b>de</b> TipoSalidaConsultarUsuarios <b>a</b>
	 * TipoSalidaConsultarUsuariosVO, <br>
	 * En otras palabras, <b>de</b> Tipo salida consultar usuarios (ComplexType
	 * relacionado a la representacion XML del servicio) <b>a</b> Tipo salida
	 * consultar usuarios objeto con valores de servicio.
	 *
	 * @param atscu_tipoSalidaConsultarUsuarios el parametro que representa el
	 *                                          complex type a convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como TipoSalidaConsultarUsuariosVO.
	 */
	public static TipoSalidaConsultarUsuariosVO tipoAVo(TipoSalidaConsultarUsuarios atscu_tipoSalidaConsultarUsuarios) {
		TipoSalidaConsultarUsuariosVO ltscu_tipoSalidaConsultarUsuariosVo = new TipoSalidaConsultarUsuariosVO();
		ltscu_tipoSalidaConsultarUsuariosVo.setIbi_codigoMensaje(atscu_tipoSalidaConsultarUsuarios.getCodigoMensaje());
		ltscu_tipoSalidaConsultarUsuariosVo
				.setIs_descripcionMensaje(atscu_tipoSalidaConsultarUsuarios.getDescripcionMensaje());
		ltscu_tipoSalidaConsultarUsuariosVo.setIltu_usuarios(
				listaUsuarioAListaUsuarioVO(atscu_tipoSalidaConsultarUsuarios.getUsuarios().getUsuario()));
		return ltscu_tipoSalidaConsultarUsuariosVo;
	}

	/**
	 * Metodo que convierte de una lista de ComplexType a una lista de VO ( De una
	 * lista de elementos especificos del esquema de un Servicio Web, a una lista de
	 * Objetos de valores de Servicio).<br>
	 * Se usa para convertir una lista de objetos con un resultado/salida de una
	 * peticion de Servicio SOAP, en una lista de objetos de datos llamados VOs;
	 * para ser retornado como resultado a la aplicacion o capa de negocio que
	 * consume el cliente de servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoUsuarioCUSO <b>a</b>
	 * TipoUsuarioCUSOVO, <br>
	 * En otras palabras, <b>de</b> Tipo usuario CUSO (ComplexType relacionado a la
	 * representacion XML del servicio) <b>a</b> Tipo usuario CUSOVO.
	 *
	 * @param altu_listaTipoUsuariocuso el parametro que representa la lista de
	 *                                  complex types a convertir.
	 * @return Resultado para la conversion de lista de complex types a lista de
	 *         objetos con valores de servicio, en este caso como lista de
	 *         TipoUsuarioCUSOVO.
	 */
	private static List<TipoUsuarioCUSOVO> listaUsuarioAListaUsuarioVO(
			List<TipoUsuarioCUSO> altu_listaTipoUsuariocuso) {
		List<TipoUsuarioCUSOVO> lltu_listaTipoUsuarioCusoVo = new ArrayList<>();
		for (TipoUsuarioCUSO ltu_tipoUsuarioCuso : altu_listaTipoUsuariocuso) {
			lltu_listaTipoUsuarioCusoVo.add(usuarioAusuarioVo(ltu_tipoUsuarioCuso));
		}
		return lltu_listaTipoUsuarioCusoVo;
	}

	/**
	 * Metodo que convierte de ComplexType a VO ( De elemento especifico del esquema
	 * de un Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto con un resultado/salida de una peticion de
	 * Servicio SOAP, en un objeto de datos llamado VO; para ser retornado como
	 * resultado a la aplicacion o capa de negocio que consume el cliente de
	 * servicios. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoUsuarioCUSO <b>a</b>
	 * TipoUsuarioCUSOVO, <br>
	 * En otras palabras, <b>de</b> Tipo usuario CUSO (ComplexType relacionado a la
	 * representacion XML del servicio) <b>a</b> Tipo usuario CUSOVO.
	 *
	 * @param atu_tipoUsuarioCuso el parametro que representa el complex type a
	 *                            convertir.
	 * @return Resultado para la conversion de complex type a objeto con valores de
	 *         servicio, en este caso como TipoUsuarioCUSOVO.
	 */
	private static TipoUsuarioCUSOVO usuarioAusuarioVo(TipoUsuarioCUSO atu_tipoUsuarioCuso) {
		TipoUsuarioCUSOVO ltu_tipoUsuarioCusoVo = new TipoUsuarioCUSOVO();
		if (atu_tipoUsuarioCuso.getFechaCancelacion() != null)
			ltu_tipoUsuarioCusoVo.setId_fechaCancelacion(
					atu_tipoUsuarioCuso.getFechaCancelacion().getValue().toGregorianCalendar().getTime());
		if (atu_tipoUsuarioCuso.getFechaCreacion() != null)
			ltu_tipoUsuarioCusoVo.setId_fechaCreacion(
					atu_tipoUsuarioCuso.getFechaCreacion().getValue().toGregorianCalendar().getTime());
		ltu_tipoUsuarioCusoVo.setIs_correoElectronicoCorporativoUsuario(
				atu_tipoUsuarioCuso.getCorreoElectronicoCorporativoUsuario());
		ltu_tipoUsuarioCusoVo.setIs_estado(atu_tipoUsuarioCuso.getEstado());
		ltu_tipoUsuarioCusoVo.setIs_numDocUsuario(atu_tipoUsuarioCuso.getNumDocUsuario());
		ltu_tipoUsuarioCusoVo.setIs_primerApellidoUsuario(atu_tipoUsuarioCuso.getPrimerApellidoUsuario());
		ltu_tipoUsuarioCusoVo.setIs_primerNombreUsuario(atu_tipoUsuarioCuso.getPrimerNombreUsuario());
		if (atu_tipoUsuarioCuso.getSegundoApellidoUsuario() != null)
			ltu_tipoUsuarioCusoVo
					.setIs_segundoApellidoUsuario(atu_tipoUsuarioCuso.getSegundoApellidoUsuario().getValue());
		if (atu_tipoUsuarioCuso.getSegundoNombreUsuario() != null)
			ltu_tipoUsuarioCusoVo.setIs_segundoNombreUsuario(atu_tipoUsuarioCuso.getSegundoNombreUsuario().getValue());
		ltu_tipoUsuarioCusoVo.setIs_tipoDocUsuario(atu_tipoUsuarioCuso.getTipoDocUsuario());
		return ltu_tipoUsuarioCusoVo;
	}

	/**
	 * Metodo que convierte de VO a ComplexType (De Objeto de valores de Servicio,
	 * entrada del cliente bus; a elemento especifico del esquema de un Servicio
	 * Web, entrada de una peticion de Servicio SOAP).<br>
	 * Se usa para convertir un objeto con las entradas de un servicio web (objeto
	 * VO), a un objeto ComplexType para ser enviado en una operacion de un
	 * servicio. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoEntradaConsultarUsuariosVO <b>a</b>
	 * TipoEntradaConsultarUsuarios, <br>
	 * En otras palabras, <b>de</b> Tipo entrada consultar usuarios objeto con
	 * valores de servicio <b>a</b> Tipo entrada consultar usuarios (ComplexType
	 * relacionado a la representacion XML del servicio).
	 *
	 * @param atecu_tipoEntradaConsultarUsuariosVo el parametro que representa el
	 *                                             objeto con valores de servicio a
	 *                                             convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como TipoEntradaConsultarUsuarios.
	 */
	public static TipoEntradaConsultarUsuarios voATipo(
			TipoEntradaConsultarUsuariosVO atecu_tipoEntradaConsultarUsuariosVo) {
		TipoEntradaConsultarUsuarios ltecu_tipoEntradaConsultarUsuarios = new TipoEntradaConsultarUsuarios();
		ltecu_tipoEntradaConsultarUsuarios
				.setAdmin(adminVoAAdmin(atecu_tipoEntradaConsultarUsuariosVo.getIta_adminVo()));
		ltecu_tipoEntradaConsultarUsuarios.setIDCuentaCupo(atecu_tipoEntradaConsultarUsuariosVo.getIs_idCuentaCupo());
		ltecu_tipoEntradaConsultarUsuarios.setModulo(atecu_tipoEntradaConsultarUsuariosVo.getIs_modulo());
		return ltecu_tipoEntradaConsultarUsuarios;
	}

	/**
	 * Metodo que convierte de VO a ComplexType (De Objeto de valores de Servicio,
	 * entrada del cliente bus; a elemento especifico del esquema de un Servicio
	 * Web, entrada de una peticion de Servicio SOAP).<br>
	 * Se usa para convertir un objeto con las entradas de un servicio web (objeto
	 * VO), a un objeto ComplexType para ser enviado en una operacion de un
	 * servicio. <br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoAdminVO <b>a</b> TipoAdminCUSI, <br>
	 * En otras palabras, <b>de</b> Tipo admin objeto con valores de servicio
	 * <b>a</b> Tipo admin CUSI (ComplexType relacionado a la representacion XML del
	 * servicio).
	 *
	 * @param ata_adminVo el parametro que representa el objeto con valores de
	 *                    servicio a convertir.
	 * @return Resultado para la conversion de objeto de valores de servicio a
	 *         complex type, en este caso como TipoAdminCUSI.
	 */
	private static TipoAdminCUSI adminVoAAdmin(TipoAdminVO ata_adminVo) {
		TipoAdminCUSI ltac_tipoAdminCusi = new TipoAdminCUSI();
		ltac_tipoAdminCusi.setNumDocAdmin(ata_adminVo.getIs_numDocAdmin());
		ltac_tipoAdminCusi.setTipoDocAdmin(ata_adminVo.getIs_tipoDocAdmin());
		return ltac_tipoAdminCusi;
	}
}
