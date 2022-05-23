/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BeanWizard.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean.interfaces
 * Nombre del elemento: BeanWizard
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean.interfaces;

import javax.faces.context.FacesContext;

import org.primefaces.event.FlowEvent;

import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumURLRutas;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.GeneradorGrowlGenerico;

/**
 * Interface tipo managed bean de la capa de UI (User Interface). <br>
 * Define operaciones e implementaciones default que permiten manejar <br>
 * la visualizacion de componentes JSF para Wizard.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public interface BeanWizard {
	
	/**
	 * Metodo que se encarga de validar en el wizard antes de pasar al siguiente
	 * tab.
	 *
	 * @param afe_evento Evento de pasar a la siguiente iteracion del wizard
	 * @return String Id del tab al cual debe pasar
	 */
	public default String validarSiguiente(FlowEvent afe_evento) {
		return afe_evento.getNewStep();
	}
	
	/**
	 * Metodo que se encarga de redireccionar al usuario a la vista para consultar
	 * la matricula
	 * 
	 * <b>Resultado: </b> Se redirige al usuario a la pagina de buscar matricula, si
	 * falla envia growl con el error.
	 */
	public default void buscarMatricula() {
		FacesContext lfc_facesContext = FacesContext.getCurrentInstance();
		try {
			FacesContext.getCurrentInstance().getExternalContext()
			.redirect(lfc_facesContext.getExternalContext().getApplicationContextPath() + EnumURLRutas.URL_CONSULTAS.getIs_url());
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}
}
