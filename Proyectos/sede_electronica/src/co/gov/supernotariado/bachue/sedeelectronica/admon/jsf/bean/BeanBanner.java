/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BeanBanner.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean
 * Nombre del elemento: BeanBanner
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
 * la visualizacion de componentes JSF para Banner.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@ManagedBean(name = "beanBanner")
@ViewScoped
public class BeanBanner implements Serializable{

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
	 * banners.
	 */
	private Boolean ib_ocultarBanners;

	/**
	 * Inicializa el objeto.
	 */
	@PostConstruct
	public void init() {
		consultarParametro();
	}
	
	/**
	 * metodo que consulta el estado del parametro de ocultar banner para el mismo
	 * proposito.
	 */
	public void consultarParametro() {
		ParametroDTO lp_parametroDto = iip_parametroBusiness.consultarParametro(EnumParametros.OCULTAR_BANNERS.getIs_nombreParametro());
		Boolean lb_valorParametro = EnumBoolean.buscarBooleano(lp_parametroDto.getIs_valorUi()).getIb_valor();
		ib_ocultarBanners = lb_valorParametro;
	}

	/**
	 * Obtiene el valor para la propiedad ocultar banners.
	 *
	 * @return El valor de la propiedad ocultar banners
	 */
	public Boolean getIb_ocultarBanners() {
		return ib_ocultarBanners;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad ocultar banners.
	 *
	 * @param ab_ocultarBanners el nuevo valor para la propiedad ocultar banners
	 */
	public void setIb_ocultarBanners(Boolean ab_ocultarBanners) {
		this.ib_ocultarBanners = ab_ocultarBanners;
	}

	
}
