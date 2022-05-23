/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: UtilidadAuditoria.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.utils
 * Nombre del elemento: UtilidadAuditoria
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.utils;

import java.util.Date;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioSesionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.interfaces.IAuditableDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumBoolean;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumRol;

/**
 * El elemento Class UtilidadAuditoria.<br>
 * Representa un/una utilidad auditoria.<br>
 * Clase de utilidades de auditoria, que permite sobrecargar los DTOs con datos
 * basicos de auditoria (IP, ROL:ESTEREOTIPO, USUARIO). Tanto para creacion de
 * registros, como para modificaciones. <br>
 * Se apoya en la implementacion que hacen los DTOs de la interface
 * {@link IAuditableDTO}
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class UtilidadAuditoria {

	/**
	 * Construye una nueva instancia/objeto de la clase UtilidadAuditoria.
	 */
	private UtilidadAuditoria() {

	}

	/**
	 * Define la constante CS_SYSTEM.
	 */
	private static final String CS_SYSTEM = "SYSTEM";

	/**
	 * Define la constante CS_HEADER.
	 */
	private static final String CS_HEADER = "X-FORWARDED-FOR";

	/**
	 * Define la constante CS_IP_NO_DISPONIBLE.
	 */
	private static final String CS_IP_NO_DISPONIBLE = "IP_NO_DISPONIBLE";

	/**
	 * Define la constante CS_IPVSEIS.
	 */
	private static final String CS_IPVSEIS = "0:0:0:0:0:0:0:1";

	/**
	 * Define la constante CS_USUARIO_SIN_AUTENTICACION.
	 */
	private static final String CS_USUARIO_SIN_AUTENTICACION = "SIN_AUTENTICACION";

	/**
	 * Metodo que se encarga de obtener la Ip del usuario cliente que realiza la
	 * peticion.
	 *
	 * @return String Ip del cliente que esta realizando la peticion
	 */
	public static String getDireccionIp() {
		String ls_direccionIp;
		try {
			HttpServletRequest lhsr_httpServletRequest = (HttpServletRequest) FacesContext.getCurrentInstance()
					.getExternalContext().getRequest();
			ls_direccionIp = lhsr_httpServletRequest.getHeader(CS_HEADER);
			if (ls_direccionIp == null) {
				ls_direccionIp = lhsr_httpServletRequest.getRemoteAddr();

				if (ls_direccionIp.equals(CS_IPVSEIS)) {
					ls_direccionIp = CS_IP_NO_DISPONIBLE;
				}
			}
		} catch (NullPointerException anpe_excepcion) {
			ls_direccionIp = CS_IP_NO_DISPONIBLE;
		}

		return ls_direccionIp;
	}

	/**
	 * Metodo que obtiene con el cache el id del usuario en session.
	 *
	 * @return String la id del usuario que esta en session
	 */
	private static String getIdUsuarioSesion() {
		try {
			UsuarioSesionDTO lus_usuarioSesionDto;
			lus_usuarioSesionDto = UtilidadAutoridadUsuario.consultarUsuarioSesion();
			if (lus_usuarioSesionDto == null)
				return CS_USUARIO_SIN_AUTENTICACION;
			if (lus_usuarioSesionDto.getIs_estereotipo().equals(EnumRol.PERSONA_JURIDICA.getIs_estereotipo()))
				return lus_usuarioSesionDto.getIs_idAsociacion();
			return lus_usuarioSesionDto.getIs_idUsuario();
		} catch (ClassCastException | NullPointerException ae_excepcion) {
			return CS_USUARIO_SIN_AUTENTICACION;
		}
	}

	/**
	 * Obtiene el valor para la propiedad rol.
	 *
	 * @return El valor de la propiedad rol
	 */
	private static String getRol() {
		try {
			UsuarioSesionDTO lus_usuarioSesionDto;
			lus_usuarioSesionDto = UtilidadAutoridadUsuario.consultarUsuarioSesion();
			if (lus_usuarioSesionDto == null)
				return CS_USUARIO_SIN_AUTENTICACION;
			return lus_usuarioSesionDto.getIs_estereotipo();
		} catch (ClassCastException | NullPointerException ae_excepcion) {
			return "";
		}
	}

	/**
	 * Metodo que se encarga de cargar el DTO con los datos de modificacion para
	 * auditoria de la tabla.
	 *
	 * @param aia_interfazAuditableDto el parametro interfaz auditable dto
	 * @return IAuditableDTO que es la interfaz del Dto auditable ya cargado con los
	 *         datos
	 */
	public static IAuditableDTO adicionarDatosModificacion(IAuditableDTO aia_interfazAuditableDto) {
		aia_interfazAuditableDto.setId_fechaModificacion(new Date());
		String ls_direccionIp = getDireccionIp();
		String ls_ipUsuarioSession = getIdUsuarioSesion();
		String ls_rol = getRol();

		aia_interfazAuditableDto.setIs_ipModificacion(ls_direccionIp);
		aia_interfazAuditableDto.setIs_idUsuarioModificacion(ls_ipUsuarioSession);
		aia_interfazAuditableDto.setIs_estereotipoModificacion(ls_rol);
		return aia_interfazAuditableDto;
	}

	/**
	 * Metodo que se encarga de cargar los datos de auditoria de creacion y
	 * modificacion de la tabla.
	 *
	 * @param aia_interfazAuditableDto el parametro interfaz auditable dto
	 * @return IAuditableDTO que es la interfaz del Dto auditable ya cargado con los
	 *         datos
	 */

	public static IAuditableDTO adicionarDatosCreacion(IAuditableDTO aia_interfazAuditableDto) {
		Date ld_fechaActual = new Date();
		String ls_direccionIp = getDireccionIp();
		String ls_idUsuarioSession = getIdUsuarioSesion();
		String ls_rol = getRol();

		aia_interfazAuditableDto.setId_fechaCreacion(ld_fechaActual);
		aia_interfazAuditableDto.setIs_ipCreacion(ls_direccionIp);
		aia_interfazAuditableDto.setIs_idUsuarioCreacion(ls_idUsuarioSession);
		if (ls_rol != null) {
			aia_interfazAuditableDto.setIs_estereotipoCreacion(ls_rol);
			aia_interfazAuditableDto.setIs_estereotipoModificacion(ls_rol);
		} else {
			aia_interfazAuditableDto.setIs_estereotipoCreacion(CS_SYSTEM);
			aia_interfazAuditableDto.setIs_estereotipoModificacion(CS_SYSTEM);
		}
		aia_interfazAuditableDto.setId_fechaModificacion(ld_fechaActual);
		aia_interfazAuditableDto.setIs_ipModificacion(ls_direccionIp);
		aia_interfazAuditableDto.setIs_idUsuarioModificacion(ls_idUsuarioSession);
		aia_interfazAuditableDto.setIs_activo(EnumBoolean.CHAR_S.getIs_codigo());
		return aia_interfazAuditableDto;
	}
}
