/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: SesionListener.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.security
 * Nombre del elemento: SesionListener
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.security;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IParametroBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumParametros;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.BeansLocales;

/**
 * Clase que captura tanto cierre de sesion como apertura de la misma para
 * definir cierre de la misma.<br>
 * Implementa la interface HttpSessionListener de
 * javax.servlet.http.HttpSessionListener
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class SesionListener implements HttpSessionListener {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * javax.servlet.http.HttpSessionListener#sessionCreated(javax.servlet.http.
	 * HttpSessionEvent)
	 */
	@Override
	public void sessionCreated(HttpSessionEvent ahse_event) {

		IParametroBusiness lipb_parametrosBusiness = BeansLocales.consultarParametroBusiness();

		// Consulta el tiempo de sesion desde la bd
		Integer li_tiempoCierreSesion = Integer.parseInt(lipb_parametrosBusiness
				.consultarParametro(EnumParametros.TIEMPO_CIERRE_SESION.getIs_nombreParametro()).getIs_valor());

		// Se define el tiempo de sesion a la sesion creada
		ahse_event.getSession().setMaxInactiveInterval(li_tiempoCierreSesion * 60);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * javax.servlet.http.HttpSessionListener#sessionDestroyed(javax.servlet.http.
	 * HttpSessionEvent)
	 */
	@Override
	public void sessionDestroyed(HttpSessionEvent ahse_event) {
		// Acciones en caso que una sesion sea destruida
	}
}