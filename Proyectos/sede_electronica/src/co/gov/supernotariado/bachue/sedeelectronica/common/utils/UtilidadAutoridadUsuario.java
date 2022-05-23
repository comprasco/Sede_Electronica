/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: UtilidadAutoridadUsuario.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.utils
 * Nombre del elemento: UtilidadAutoridadUsuario
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.utils;

import java.io.IOException;
import java.util.Collection;
import java.util.Set;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.session.SessionInformation;
import org.springframework.security.core.userdetails.UserDetails;

import com.tangosol.net.CacheFactory;
import com.tangosol.net.NamedCache;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesNegocio;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IUsuarioBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioSesionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCache;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumRol;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumSeguridad;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesInicioSesion;
import co.gov.supernotariado.bachue.sedeelectronica.common.security.UsuarioSerializado;

/**
 * El elemento Class UtilidadAutoridadUsuario.<br>
 * Representa un/una utilidad autoridad usuario.<br>
 * Clase que tiene utilidades para la gestion de usuario
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class UtilidadAutoridadUsuario {

	/**
	 * Define la constante CL_LOGGER.
	 */
	static final Logger CL_LOGGER = Logger.getLogger(UtilidadAutoridadUsuario.class);

	/**
	 * Construye una nueva instancia/objeto de la clase UtilidadAutoridadUsuario.
	 */
	private UtilidadAutoridadUsuario() {
		// Constructor privado para metodos estaticos
	}

	/**
	 * Metodo que permite consultar rol por usuario.
	 *
	 * @param aud_usuario detalles de usuario
	 * @return rol del usuario
	 */
	public static String consultarRole(UserDetails aud_usuario) {
		Collection<? extends GrantedAuthority> lcga_autoridades = aud_usuario.getAuthorities();
		EnumRol lre_role = null;
		for (GrantedAuthority lga_autoridad : lcga_autoridades) {
			lre_role = EnumRol.consultarRol(
					(lga_autoridad.getAuthority()).replace(EnumSeguridad.PREFIJO_ROL.getIs_nombreParametro(), ""));
			if (lre_role == null) {
				continue;
			}
			return lre_role.consultarIs_rol();
		}

		return null;
	}

	/**
	 * Metodo que permite consultar rol por usuario.
	 *
	 * @return rol del usuario
	 */
	public static String consultarRolActual() {
		String ls_rol;
		UserDetails lud_usuario = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		ls_rol = consultarRole(lud_usuario);
		return ls_rol;
	}

	/**
	 * Metodo que permite validar existencia de usuario en la sesion.
	 *
	 * @return SessionInformation del usuario autenticado
	 */
	public static SessionInformation validarExistenciaUsuario() {
		try {
			HttpServletRequest lhsr_solicitud = (HttpServletRequest) FacesContext.getCurrentInstance()
					.getExternalContext().getRequest();
			SessionInformation lsi_usuario;
			String ls_id = lhsr_solicitud.getRequestedSessionId() != null ? lhsr_solicitud.getRequestedSessionId()
					: null;
			lsi_usuario = consultarSesion(ls_id);
			return lsi_usuario;
		} catch (NullPointerException anpe_excepcionDatoNulos) {
			return null;
		}
	}

	/**
	 * Metodo que valida la sesion.
	 */
	public static void validarSesion() {

		SessionInformation lsi_autoridad = UtilidadAutoridadUsuario.validarExistenciaUsuario();

		if (lsi_autoridad != null) {
			UserDetails lud_usuarioDetail = (UserDetails) SecurityContextHolder.getContext().getAuthentication()
					.getPrincipal();
			if (lud_usuarioDetail != null) {

				String ls_rol = UtilidadAutoridadUsuario.consultarRole(lud_usuarioDetail);
				String ls_url = EnumRol.consultarRol(ls_rol).consultarIs_urlPostInicioSesion();

				try {
					ExternalContext lec_contexto = FacesContext.getCurrentInstance().getExternalContext();
					lec_contexto.redirect(lec_contexto.getRequestContextPath() + ls_url);
				} catch (IOException lioe_excepcion) {
					GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(new ExcepcionesNegocio(
							EnumExcepcionesInicioSesion.INICIO_SESION_INCORRECTO, lioe_excepcion));
				}
			}
		}
	}

	/**
	 * Metodo que valida la sesion.
	 *
	 * @param aud_usuario el parametro usuario
	 * @return Resultado para consultar rol retornado como String
	 */
	public static String consultarRol(UserDetails aud_usuario) {
		String ls_rol = "";
		ls_rol = EnumRol.consultarRol(consultarRole(aud_usuario)).consultarIs_nombreLegible();
		return ls_rol;
	}

	/**
	 * Metodo consulta usuario en sesion.
	 *
	 * @return DTO con el usuario en sesion
	 */
	public static UsuarioSesionDTO consultarUsuarioSesion() {

		try {

			IUsuarioBusiness liub_usuario = BeansLocales.consultarUsuarioBusiness();
			UserDetails lud_usuario = (UserDetails) SecurityContextHolder.getContext().getAuthentication()
					.getPrincipal();
			String ls_usuario = lud_usuario.getUsername();
			UsuarioSesionDTO lu_usuario;
			lu_usuario = liub_usuario.consultarUsuarioCache(ls_usuario);

			return lu_usuario;
		} catch (Exception ae_excepcion) {
			CL_LOGGER.info(ae_excepcion.getMessage(), ae_excepcion);
			return null;
		}

	}

	/**
	 * Metodo que permite eliminar sesion en cache.
	 *
	 * @param ls_idSesion id de las sesion
	 */
	public static void eliminarSesion(String ls_idSesion) {
		NamedCache<String, SessionInformation> lncu_sesiones = CacheFactory
				.getCache(EnumCache.SESION_REGISTRO_USUARIOS.getIs_nombreEsquema());
		NamedCache<UsuarioSerializado, Set<String>> ln_principales = CacheFactory
				.getCache(EnumCache.SESION_REGISTRO_USUARIO_PRINCIPAL.getIs_nombreEsquema());
		if (lncu_sesiones.containsKey(ls_idSesion)) {
			SessionInformation lsi_sesion = lncu_sesiones.get(ls_idSesion);
			lsi_sesion.expireNow();
			lncu_sesiones.put(ls_idSesion, lsi_sesion);
			ln_principales.remove(lsi_sesion.getPrincipal());
		}
	}

	/**
	 * Metodo que permite consultar sesion en cache.
	 *
	 * @param ls_idSesion id de la sesion
	 * @return SessionInformation informacion de la sesion
	 */
	public static SessionInformation consultarSesion(String ls_idSesion) {
		NamedCache<String, SessionInformation> lncu_sesiones = CacheFactory
				.getCache(EnumCache.SESION_REGISTRO_USUARIOS.getIs_nombreEsquema());
		if (lncu_sesiones.containsKey(ls_idSesion)) {
			SessionInformation lsi_sesion = lncu_sesiones.get(ls_idSesion);
			return lncu_sesiones.put(ls_idSesion, lsi_sesion);
		}
		return null;
	}
}
