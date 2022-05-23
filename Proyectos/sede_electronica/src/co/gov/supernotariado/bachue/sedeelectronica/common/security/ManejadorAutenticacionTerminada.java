/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ManejadorAutenticacionTerminada.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.security
 * Nombre del elemento: ManejadorAutenticacionTerminada
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IUsuarioBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumParametrosURL;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumRol;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.BeansLocales;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadSeguridad;

/**
 * Clase que maneja la autenticacion por usuario al cerrar sesion.<br>
 * Implementa la interface LogoutSuccessHandler del framework spring security
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ManejadorAutenticacionTerminada implements LogoutSuccessHandler {

	/**
	 * Atributo para definir la propiedad crs redirect strategy.
	 */
	private RedirectStrategy crs_redirectStrategy = new DefaultRedirectStrategy();

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.springframework.security.web.authentication.logout.LogoutSuccessHandler#
	 * onLogoutSuccess(javax.servlet.http.HttpServletRequest,
	 * javax.servlet.http.HttpServletResponse,
	 * org.springframework.security.core.Authentication)
	 */
	@Override
	public void onLogoutSuccess(HttpServletRequest ahsr_solicitud, HttpServletResponse ahsr_respuesta,
			Authentication aa_autenticacion) throws IOException, ServletException {

		HttpSession lhs_sesion = ahsr_solicitud.getSession();
		IUsuarioBusiness liub_usuarioBusiness = BeansLocales.consultarUsuarioBusiness();
		String ls_url;

		if (aa_autenticacion != null) {
			ls_url = UtilidadSeguridad.manejadorInicioSesionURL(aa_autenticacion);
			liub_usuarioBusiness.removerUsuarioCache(aa_autenticacion.getName());
		} else {
			String ls_nombreUsuario = ahsr_solicitud
					.getParameter(EnumParametrosURL.NOMBRE_USUARIO.getIs_nombreParametro());
			String ls_rolUsuario = ahsr_solicitud.getParameter(EnumParametrosURL.ROL_USUARIO.getIs_nombreParametro());
			ls_url = EnumRol.consultarRol(ls_rolUsuario).consultarIs_urlInicioSesion();
			liub_usuarioBusiness.removerUsuarioCache(ls_nombreUsuario);

		}

		String ls_cierreSesion = ahsr_solicitud.getParameter(EnumParametrosURL.ALERTA.getIs_nombreParametro());

		if (ls_cierreSesion != null && ls_cierreSesion.equals(EnumParametrosURL.AFIRMACION.getIs_nombreParametro())) {
			ls_cierreSesion = EnumParametrosURL.ALERTA_PARAMETRO.getIs_nombreParametro()
					+ EnumParametrosURL.AFIRMACION.getIs_nombreParametro();
		} else {
			ls_cierreSesion = "";
		}

		if (lhs_sesion != null) {
			lhs_sesion.removeAttribute(EnumParametrosURL.USER.getIs_nombreParametro());
		}

		crs_redirectStrategy.sendRedirect(ahsr_solicitud, ahsr_respuesta, ls_url + ls_cierreSesion);
	}

}
