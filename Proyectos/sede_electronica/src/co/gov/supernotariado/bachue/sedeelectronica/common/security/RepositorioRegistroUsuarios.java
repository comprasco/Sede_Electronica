/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: RepositorioRegistroUsuarios.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.security
 * Nombre del elemento: RepositorioRegistroUsuarios
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.security;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.security.core.session.SessionDestroyedEvent;
import org.springframework.security.core.session.SessionInformation;
import org.springframework.security.core.session.SessionRegistry;
import org.springframework.security.core.userdetails.User;
import org.springframework.util.Assert;

import com.tangosol.net.CacheFactory;
import com.tangosol.net.NamedCache;

import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCache;

import java.util.*;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * Clase que especifica el origen de las sesiones personalizado. <br>
 * Implementa las interfaces SessionRegistry, ApplicationListener del framework
 * spring security
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class RepositorioRegistroUsuarios implements SessionRegistry, ApplicationListener<SessionDestroyedEvent> {

	/**
	 * Atributo para definir la propiedad cl logger.
	 */
	protected final Log cl_logger = LogFactory.getLog(RepositorioRegistroUsuarios.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.springframework.security.core.session.SessionRegistry#getAllPrincipals()
	 */
	@Override
	public List<Object> getAllPrincipals() {
		NamedCache<UsuarioSerializado, Set<String>> lnc_principales = CacheFactory
				.getCache(EnumCache.SESION_REGISTRO_USUARIO_PRINCIPAL.getIs_nombreEsquema());
		return new ArrayList<>(lnc_principales.keySet());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.springframework.security.core.session.SessionRegistry#getAllSessions(java
	 * .lang.Object, boolean)
	 */
	@Override
	public List<SessionInformation> getAllSessions(Object ao_principal, boolean ab_sesionesExpiradasEliminacion) {
		NamedCache<UsuarioSerializado, Set<String>> lnc_principales = CacheFactory
				.getCache(EnumCache.SESION_REGISTRO_USUARIO_PRINCIPAL.getIs_nombreEsquema());

		UsuarioSerializado lu_usuarioDetalle = serializarUsuario((User) ao_principal);
		final Set<String> ls_sesionesUsadasPrincipal = lnc_principales.get(lu_usuarioDetalle);

		if (ls_sesionesUsadasPrincipal == null) {
			return Collections.emptyList();
		}

		List<SessionInformation> llsi_listaSesiones = new ArrayList<>(ls_sesionesUsadasPrincipal.size());

		for (String ls_sesionId : ls_sesionesUsadasPrincipal) {
			SessionInformation lsi_informacionSesion = getSessionInformation(ls_sesionId);

			if (lsi_informacionSesion == null) {
				continue;
			}

			if (ab_sesionesExpiradasEliminacion || !lsi_informacionSesion.isExpired()) {
				llsi_listaSesiones.add(lsi_informacionSesion);
			}
		}

		return llsi_listaSesiones;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.security.core.session.SessionRegistry#
	 * getSessionInformation(java.lang.String)
	 */
	@Override
	public SessionInformation getSessionInformation(String as_sesionId) {
		NamedCache<String, SessionInformation> lnc_sesiones = CacheFactory
				.getCache(EnumCache.SESION_REGISTRO_USUARIOS.getIs_nombreEsquema());
		return lnc_sesiones.get(as_sesionId);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.context.ApplicationListener#onApplicationEvent(org.
	 * springframework.context.ApplicationEvent)
	 */
	@Override
	public void onApplicationEvent(SessionDestroyedEvent asde_evento) {
		String ls_sesionId = asde_evento.getId();
		removeSessionInformation(ls_sesionId);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.springframework.security.core.session.SessionRegistry#refreshLastRequest(
	 * java.lang.String)
	 */
	@Override
	public void refreshLastRequest(String as_sesionId) {

		SessionInformation lsi_informacion = getSessionInformation(as_sesionId);

		if (lsi_informacion != null) {
			lsi_informacion.refreshLastRequest();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.springframework.security.core.session.SessionRegistry#registerNewSession(
	 * java.lang.String, java.lang.Object)
	 */
	@Override
	public void registerNewSession(String as_sesionId, Object ao_principal) {
		Assert.hasText(as_sesionId, "SessionId required as per interface contract");
		Assert.notNull(ao_principal, "Principal required as per interface contract");

		NamedCache<UsuarioSerializado, Set<String>> lnc_principales = CacheFactory
				.getCache(EnumCache.SESION_REGISTRO_USUARIO_PRINCIPAL.getIs_nombreEsquema());
		NamedCache<String, SessionInformation> lnc_sesiones = CacheFactory
				.getCache(EnumCache.SESION_REGISTRO_USUARIOS.getIs_nombreEsquema());

		UsuarioSerializado lu_usuario = serializarUsuario((User) ao_principal);

		if (cl_logger.isDebugEnabled()) {
			cl_logger.debug("Registering session " + as_sesionId + ", for principal " + ao_principal);
		}

		if (getSessionInformation(as_sesionId) != null) {
			removeSessionInformation(as_sesionId);
		}

		lnc_sesiones.forEach((a_k, a_v) -> {
			if (a_v != null) {
				UsuarioSerializado lu_usuarioDetalle = (UsuarioSerializado) a_v.getPrincipal();
				if (lu_usuarioDetalle.getUsername().equals(lu_usuario.getUsername())) {
					a_v.expireNow();
					lnc_sesiones.put(a_k, a_v);
				}
			}

		});

		lnc_sesiones.put(as_sesionId, new SessionInformation(lu_usuario, as_sesionId, new Date()));
		Set<String> lss_usuarioSesionPrincipal = lnc_principales.computeIfAbsent(lu_usuario,
				ls_usuarioLlave -> new CopyOnWriteArraySet<>());
		lss_usuarioSesionPrincipal.add(as_sesionId);

		if (cl_logger.isTraceEnabled()) {
			cl_logger.trace("Sessions used by '" + ao_principal + "' : " + lss_usuarioSesionPrincipal);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.security.core.session.SessionRegistry#
	 * removeSessionInformation(java.lang.String)
	 */
	@Override
	public void removeSessionInformation(String as_sesionId) {
		Assert.hasText(as_sesionId, "SessionId required as per interface contract");

		NamedCache<UsuarioSerializado, Set<String>> lnc_principales = CacheFactory
				.getCache(EnumCache.SESION_REGISTRO_USUARIO_PRINCIPAL.getIs_nombreEsquema());
		NamedCache<String, SessionInformation> lnc_sesiones = CacheFactory
				.getCache(EnumCache.SESION_REGISTRO_USUARIOS.getIs_nombreEsquema());
		SessionInformation lsi_informacion = getSessionInformation(as_sesionId);

		if (lsi_informacion == null) {
			return;
		}

		UsuarioSerializado lus_usuarioSerializado = (UsuarioSerializado) lsi_informacion.getPrincipal();

		if (cl_logger.isTraceEnabled()) {
			cl_logger.debug("Removing session " + as_sesionId + " from set of registered sessions");
		}

		lnc_sesiones.remove(as_sesionId);

		Set<String> ls_sesionUsuarioPrincipal = lnc_principales.get(lus_usuarioSerializado);

		if (ls_sesionUsuarioPrincipal == null) {
			return;
		}

		if (cl_logger.isDebugEnabled()) {
			cl_logger.debug("Removing session " + as_sesionId + " from principal's set of registered sessions");
		}

		ls_sesionUsuarioPrincipal.remove(as_sesionId);

		if (ls_sesionUsuarioPrincipal.isEmpty()) {
			// No need to keep object in principals Map anymore
			if (cl_logger.isDebugEnabled()) {
				cl_logger.debug("Removing principal " + lsi_informacion.getPrincipal() + " from registry");
			}
			lnc_principales.remove(lus_usuarioSerializado);
		} else {
			lnc_principales.put(lus_usuarioSerializado, ls_sesionUsuarioPrincipal);
		}

		if (cl_logger.isTraceEnabled()) {
			cl_logger.trace("Sessions used by '" + lus_usuarioSerializado + "' : " + ls_sesionUsuarioPrincipal);
		}
	}

	/**
	 * Metodo que serializa el usuario de tipo Spring UserDetail.
	 *
	 * @param au_usuario usuario a serializar
	 * @return Resultado para serializar usuario retornado como UsuarioSerializado
	 */
	private UsuarioSerializado serializarUsuario(User au_usuario) {
		UsuarioSerializado lus_usuarioSerializado;
		lus_usuarioSerializado = new UsuarioSerializado(au_usuario.getUsername(), au_usuario.getPassword(),
				au_usuario.isEnabled(), au_usuario.isEnabled(), au_usuario.isCredentialsNonExpired(),
				au_usuario.isAccountNonLocked(), au_usuario.getAuthorities());
		return lus_usuarioSerializado;
	}

}