/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BeanAlcaldia.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean
 * Nombre del elemento: BeanAlcaldia
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.jboss.logging.Logger;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IAlcaldiaBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.AlcaldiaParametrizacionDTO;


/**
 * Clase tipo managed bean de la capa de UI (User Interface). <br>
 * Manipula operaciones y propiedades que permiten manejar <br>
 * la visualizacion de componentes JSF para Alcaldia.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@ManagedBean(name = "BeanAlcaldia")
@ViewScoped
public class BeanAlcaldia implements Serializable {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Define la constante CL_LOGGER.
	 */
	static final Logger CL_LOGGER = Logger.getLogger(BeanAlcaldia.class);
	
	/**
	 * Atributo de instancia tipo IAlcaldiaBusiness para definir la propiedad
	 * alcadia business.
	 */
	@EJB
	public IAlcaldiaBusiness iia_alcadiaBusiness;
	
	/**
	 * Atributo de instancia tipo lista de AlcaldiaParametrizacionDTO para definir
	 * la propiedad alcaldias.
	 */
	private List<AlcaldiaParametrizacionDTO> ilap_alcaldias;
	
	/**
	 * Atributo de instancia tipo lista de AlcaldiaParametrizacionDTO para definir
	 * la propiedad filtro alcaldias.
	 */
	private List<AlcaldiaParametrizacionDTO> ilap_filtroAlcaldias;
	
	/**
	 * Inicio.
	 */
	@PostConstruct
	public void inicio() {
		ilap_alcaldias = iia_alcadiaBusiness.consultarAlcaldiasParametrizadas();	 
	}	
	
	/**
	 * Metodo que permite redireccionar a la pagina de modificar alcaldia.
	 *
	 * @param as_idAlcaldia el parametro id alcaldia
	 * @return Retorno url
	 */
	public String modificarAlcaldia(String as_idAlcaldia) {
		return "parametrizacionAlcadia?faces-redirect=true&id="+as_idAlcaldia;
	}
	
	/**
	 * Obtiene el valor para la propiedad alcadia business.
	 *
	 * @return El valor de la propiedad alcadia business
	 */
	public IAlcaldiaBusiness getIia_alcadiaBusiness() {
		return iia_alcadiaBusiness;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad alcadia business.
	 *
	 * @param aia_alcadiaBusiness el nuevo valor para la propiedad alcadia business
	 */
	public void setIia_alcadiaBusiness(IAlcaldiaBusiness aia_alcadiaBusiness) {
		this.iia_alcadiaBusiness = aia_alcadiaBusiness;
	}

	/**
	 * Obtiene el valor para la propiedad alcaldias.
	 *
	 * @return El valor de la propiedad alcaldias
	 */
	public List<AlcaldiaParametrizacionDTO> getIlap_alcaldias() {
		return ilap_alcaldias;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad alcaldias.
	 *
	 * @param alap_alcaldias el nuevo valor para la propiedad alcaldias
	 */
	public void setIlap_alcaldias(List<AlcaldiaParametrizacionDTO> alap_alcaldias) {
		this.ilap_alcaldias = alap_alcaldias;
	}

	/**
	 * Obtiene el valor para la propiedad filtro alcaldias.
	 *
	 * @return El valor de la propiedad filtro alcaldias
	 */
	public List<AlcaldiaParametrizacionDTO> getIlap_filtroAlcaldias() {
		return ilap_filtroAlcaldias;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad filtro alcaldias.
	 *
	 * @param alap_filtroAlcaldias el nuevo valor para la propiedad filtro alcaldias
	 */
	public void setIlap_filtroAlcaldias(List<AlcaldiaParametrizacionDTO> alap_filtroAlcaldias) {
		this.ilap_filtroAlcaldias = alap_filtroAlcaldias;
	}



}
