/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: CierreSesionListener.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.security
 * Nombre del elemento: CierreSesionListener
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.security;

import org.springframework.context.ApplicationListener;
import org.springframework.security.core.session.SessionDestroyedEvent;
import org.springframework.stereotype.Component;

import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadAutoridadUsuario;

/**
 * Clase que permite eliminar en el cache la sesion cada vez que un usuario o el
 * timeout activan el cierre de sesion. <br>
 * Implementa la interface ApplicationListener del framework spring security
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Component
public class CierreSesionListener implements ApplicationListener<SessionDestroyedEvent> {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.context.ApplicationListener#onApplicationEvent(org.
	 * springframework.context.ApplicationEvent)
	 */
	@Override
	public void onApplicationEvent(SessionDestroyedEvent asde_evento) {
		UtilidadAutoridadUsuario.eliminarSesion(asde_evento.getId());
	}

}
