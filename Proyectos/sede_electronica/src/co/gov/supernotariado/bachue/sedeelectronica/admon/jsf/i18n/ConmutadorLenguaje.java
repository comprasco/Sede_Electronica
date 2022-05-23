/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ConmutadorLenguaje.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.i18n
 * Nombre del elemento: ConmutadorLenguaje
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.i18n;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import java.util.Locale;

/**
 * Clase tipo managed bean de la capa de UI (User Interface). <br>
 * Implementa operaciones y propiedades que permiten manejar <br>
 * la visualizacion de componentes JSF para ConmutadorLenguaje. <br>
 * Representa un/una conmutador lenguaje.<br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@ManagedBean
@RequestScoped
public class ConmutadorLenguaje {

	/**
	 * Atributo de instancia tipo Locale para definir la propiedad locale.
	 */
	private Locale il_locale = FacesContext.getCurrentInstance().getViewRoot().getLocale();

	/**
	 * Obtiene el valor para la propiedad locale.
	 *
	 * @return El valor de la propiedad locale
	 */
	public Locale getLocale() {
		return il_locale;
	}

	/**
	 * Obtiene el valor para la propiedad lenguaje.
	 *
	 * @return El valor de la propiedad lenguaje
	 */
	public String getLenguaje() {
		return il_locale.getLanguage();
	}

	/**
	 * Cambiar lenguaje.
	 *
	 * @param as_lenguaje el parametro lenguaje
	 */
	public void cambiarLenguaje(String as_lenguaje) {
		il_locale = new Locale(as_lenguaje);
		FacesContext.getCurrentInstance().getViewRoot().setLocale(new Locale(as_lenguaje));
	}

}