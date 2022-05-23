/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ManejadorAutenticacionFallida.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.security
 * Nombre del elemento: ManejadorAutenticacionFallida
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.security;

import java.io.IOException;

import javax.ejb.EJBException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesNegocio;
import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.IEnumCatalogoMensajes;
import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.IExcepcionesGenericas;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumParametrosURL;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumRol;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesInicioSesion;

/**
 * Clase que permite manejar autenticacion fallida de forma tal que redirecciona
 * a la pagina correcta segun tipo de inicio de sesion. <br>
 * Implementa la interface AuthenticationFailureHandler del framework spring
 * security
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ManejadorAutenticacionFallida implements AuthenticationFailureHandler {

	/**
	 * Atributo para definir la propiedad crs redirect strategy.
	 */
	private RedirectStrategy crs_redirectStrategy = new DefaultRedirectStrategy();

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.springframework.security.web.authentication.AuthenticationFailureHandler#
	 * onAuthenticationFailure(javax.servlet.http.HttpServletRequest,
	 * javax.servlet.http.HttpServletResponse,
	 * org.springframework.security.core.AuthenticationException)
	 */
	@Override
	public void onAuthenticationFailure(HttpServletRequest ahsr_solicitud, HttpServletResponse ahsr_respuesta,
			AuthenticationException aae_autenticacionExcepcion) throws IOException, ServletException {
		String ls_servicio = ahsr_solicitud.getParameter(EnumParametrosURL.SERVICIO.getIs_nombreParametro());
		EnumRol ler_rol = EnumRol.consultarServicio(ls_servicio);
		IExcepcionesGenericas lieg_excepcion;

		try {
			if (ler_rol != null) {

				Class<?> lc_clase;

				if (aae_autenticacionExcepcion.getCause() instanceof EJBException) {
					lc_clase = aae_autenticacionExcepcion.getCause().getCause().getClass();
					lieg_excepcion = (IExcepcionesGenericas) aae_autenticacionExcepcion.getCause().getCause();
				} else if (aae_autenticacionExcepcion.getCause() instanceof BadCredentialsException) {
					throw new ExcepcionesNegocio(EnumExcepcionesInicioSesion.INICIO_SESION_INCORRECTO.name());
				} else {
					lc_clase = aae_autenticacionExcepcion.getCause().getClass();
					lieg_excepcion = (IExcepcionesGenericas) aae_autenticacionExcepcion.getCause();
				}

				Boolean lb_asignable = IExcepcionesGenericas.class.isAssignableFrom(lc_clase);

				if (lb_asignable) {

					IEnumCatalogoMensajes liecm_mensaje = lieg_excepcion.consultarCatalogo();
					EnumExcepcionesInicioSesion leeis_enumExcepcionesInicioSesion = EnumExcepcionesInicioSesion
							.consultarEnumCodigoError(liecm_mensaje.consultarIs_codigo());
					crs_redirectStrategy.sendRedirect(ahsr_solicitud, ahsr_respuesta,
							ler_rol.consultarIs_urlInicioSesion()
									+ EnumParametrosURL.ERROR_PARAMETRO.getIs_nombreParametro()
									+ leeis_enumExcepcionesInicioSesion.name());

				} else {
					throw new ExcepcionesNegocio(EnumExcepcionesInicioSesion.INICIO_SESION_INCORRECTO.name());
				}
			}
		} catch (Exception ae_excepcion) {
			crs_redirectStrategy.sendRedirect(ahsr_solicitud, ahsr_respuesta,
					ler_rol.consultarIs_urlInicioSesion() + EnumParametrosURL.ERROR_PARAMETRO.getIs_nombreParametro()
							+ EnumExcepcionesInicioSesion.INICIO_SESION_INCORRECTO.name());
		}

	}

}
