/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BeanNupre.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean
 * Nombre del elemento: BeanNupre
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IParametroBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ParametroDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumBoolean;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumParametros;

/**
 * Clase tipo managed bean de la capa de UI (User Interface). <br>
 * Manipula operaciones y propiedades que permiten manejar <br>
 * la visualizacion de componentes JSF para Nupre.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@ManagedBean(name = "beanNupre")
@ViewScoped
public class BeanNupre implements Serializable{

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo IParametroBusiness para definir la propiedad
	 * parametro business.
	 */
	@EJB
	private IParametroBusiness iip_parametroBusiness;
	
	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad ocultar
	 * nupre.
	 */
	private Boolean ib_ocultarNupre;
	
	/**
	 * Inicializa el objeto.
	 */
	@PostConstruct
	public void init() {
		consultarParametro();
	}
	
	/**
	 * Metodo que consulta el estado del parametro de ocultar banner para el mismo
	 * proposito.
	 */
	public void consultarParametro() {
		ParametroDTO lp_parametroDto = iip_parametroBusiness.consultarParametro(EnumParametros.OCULTAR_NUPRE.getIs_nombreParametro());
		Boolean lb_valorParametro = EnumBoolean.buscarBooleano(lp_parametroDto.getIs_valorUi()).getIb_valor();
		ib_ocultarNupre = lb_valorParametro;
	}

	/**
	 * Obtiene el valor para la propiedad ocultar nupre.
	 *
	 * @return El valor de la propiedad ocultar nupre
	 */
	public Boolean getIb_ocultarNupre() {
		return ib_ocultarNupre;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad ocultar nupre.
	 *
	 * @param ab_ocultarNupre el nuevo valor para la propiedad ocultar nupre
	 */
	public void setIb_ocultarNupre(Boolean ab_ocultarNupre) {
		this.ib_ocultarNupre = ab_ocultarNupre;
	}

	
	
	
}
