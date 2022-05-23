/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: RepositorioSesionesContextoCache.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.security
 * Nombre del elemento: RepositorioSesionesContextoCache
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.security;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.web.context.HttpRequestResponseHolder;
import org.springframework.security.web.context.SecurityContextRepository;

import co.gov.supernotariado.bachue.sedeelectronica.common.utils.BeansLocales;

/**
 * Clase que especifica repositorio de los contextos de las sesion en cache y
 * permite su acceso.<br>
 * Implementa la interface SecurityContextRepository del framework spring
 * security
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class RepositorioSesionesContextoCache implements SecurityContextRepository {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.security.web.context.SecurityContextRepository#
	 * loadContext(org.springframework.security.web.context.
	 * HttpRequestResponseHolder)
	 */
	@Override
	public SecurityContext loadContext(HttpRequestResponseHolder ahrrh_solicitud) {
		return BeansLocales.consultarRepositorioSesionesCache().consultarSesiones().loadContext(ahrrh_solicitud);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.security.web.context.SecurityContextRepository#
	 * saveContext(org.springframework.security.core.context.SecurityContext,
	 * javax.servlet.http.HttpServletRequest,
	 * javax.servlet.http.HttpServletResponse)
	 */
	@Override
	public void saveContext(SecurityContext psc_contexto, HttpServletRequest ahsr_solicitud,
			HttpServletResponse ahsr_respuesta) {
		BeansLocales.consultarRepositorioSesionesCache().consultarSesiones().saveContext(psc_contexto, ahsr_solicitud,
				ahsr_respuesta);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.security.web.context.SecurityContextRepository#
	 * containsContext(javax.servlet.http.HttpServletRequest)
	 */
	@Override
	public boolean containsContext(HttpServletRequest ahsr_solicitud) {
		return BeansLocales.consultarRepositorioSesionesCache().consultarSesiones().containsContext(ahsr_solicitud);
	}

}