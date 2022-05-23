/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BeanReceiverPasarela.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean
 * Nombre del elemento: BeanReceiverPasarela
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.AjaxBehaviorEvent;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IParametroBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IPasarelaBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionPasarelaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumParametrosURL;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumURLRutas;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesGenerales;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.GeneradorGrowlGenerico;

/**
 * Clase tipo managed bean de la capa de UI (User Interface). <br>
 * Manipula operaciones y propiedades que permiten manejar <br>
 * la visualizacion de componentes JSF para Receiver pasarela.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@ManagedBean(name = "beanReceiverPasarela")
@ViewScoped
public class BeanReceiverPasarela implements Serializable {

	/**
	 * Define la constante CL_LOGGER.
	 */
	private static final Logger CL_LOGGER = Logger.getLogger(BeanReceiverPasarela.class);

	/**
	 * Atributo de instancia tipo IPasarelaBusiness para definir la propiedad
	 * pasarela.
	 */
	@EJB
	private IPasarelaBusiness iipb_pasarela;

	/**
	 * Atributo de instancia tipo IParametroBusiness para definir la propiedad
	 * parametros business.
	 */
	@EJB
	private IParametroBusiness iipb_parametrosBusiness;
	
	/**
	 * Atributo de instancia tipo IPasarelaBusiness para definir la propiedad
	 * pasarela business.
	 */
	@EJB
	private IPasarelaBusiness iipb_pasarelaBusiness;

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * token.
	 */
	private String is_token;
	
	/**
	 * Atributo de instancia tipo TransaccionPasarelaDTO para definir la propiedad
	 * transaccion pasarela.
	 */
	private TransaccionPasarelaDTO itp_transaccionPasarela;

	/**
	 * Inicializa el objeto.
	 */
	@PostConstruct
	public void init() {
		HttpServletRequest lhsr_solicitud = (HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest();
		is_token = lhsr_solicitud.getParameter(EnumParametrosURL.TOKEN.getIs_nombreParametro());
		itp_transaccionPasarela = iipb_pasarelaBusiness.consultarTransaccionToken(is_token);
	}

	/**
	 * Metodo que permite redireccionar al resumen de la tranasaccion sin no antes
	 * validar el estado tanto en core bachue como en la pasarela.
	 */
	public void redireccionarResumen() {

		try {

			iipb_pasarela.validarTransaccionPendiente(itp_transaccionPasarela,null);

			redireccionFinal();
		} catch (Exception ae_excepcion) {
			CL_LOGGER.error(ae_excepcion.getMessage(),ae_excepcion);
			redireccionFinal();
		}

	}


	/**
	 * Redireccion final.
	 */
	private void redireccionFinal() {
		FacesContext lfc_facesContext = FacesContext.getCurrentInstance();
		try {
			FacesContext.getCurrentInstance().getExternalContext()
			.redirect(lfc_facesContext.getExternalContext().getApplicationContextPath() + EnumURLRutas.URL_RESUMEN_PAGO_PASARELA.getIs_url() + EnumParametrosURL.TOKEN_PARAMETRO.getIs_nombreParametro() + is_token);
		} catch (Exception ae_excepcion) {
			CL_LOGGER.error(ae_excepcion.getMessage(),ae_excepcion);
			GeneradorGrowlGenerico.generarMensajeError(EnumExcepcionesGenerales.ERROR_TECNICO);
		}
	}
	
	/**
	 * Metodo que permite redireccion referente al receiver.
	 *
	 * @param aabe_event Evento ajax
	 */
	public void onload(AjaxBehaviorEvent aabe_event) {
		redireccionarResumen();
	}

}