/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BeanModificarAlcaldia.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean
 * Nombre del elemento: BeanModificarAlcaldia
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.ResourceBundle;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

import org.jboss.logging.Logger;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesDatosEntrada;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IAlcaldiaBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICatalogoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.AlcaldiaParametrizacionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CatalogoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ParametrosDinamicosAlcaldiaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumParametrosURL;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoCatalogo;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoParametrizacionAlcaldia;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumURLRutas;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesAlcaldiaParametrizacion;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.GeneradorGrowlGenerico;

/**
 * Clase tipo managed bean de la capa de UI (User Interface). <br>
 * Manipula operaciones y propiedades que permiten manejar <br>
 * la visualizacion de componentes JSF para Modificar alcaldia.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@ManagedBean(name = "BeanModificarAlcaldia")
@ViewScoped
public class BeanModificarAlcaldia implements Serializable {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Define la constante CS_SERVICIO_WEB.
	 */
	private static final String CS_SERVICIO_WEB = "tipo.servicio.web";
	
	/**
	 * Define la constante CS_PAGINA.
	 */
	private static final String CS_PAGINA = "tipo.servicio.pagina";

	/**
	 * Define la constante CL_LOGGER.
	 */
	static final Logger CL_LOGGER = Logger.getLogger(BeanModificarAlcaldia.class);

	/**
	 * Atributo de instancia tipo IAlcaldiaBusiness para definir la propiedad
	 * alcaldia business.
	 */
	@EJB
	public IAlcaldiaBusiness iia_alcaldiaBusiness;

	/**
	 * Atributo de instancia tipo ICatalogoBusiness para definir la propiedad
	 * catalogos.
	 */
	@EJB
	public ICatalogoBusiness iic_catalogos;

	/**
	 * Atributo de instancia tipo AlcaldiaParametrizacionDTO para definir la
	 * propiedad alcaldia parametrizada.
	 */
	private AlcaldiaParametrizacionDTO iap_alcaldiaParametrizada;

	/**
	 * Atributo de instancia tipo Map con claves String y valores String para
	 * definir la propiedad parametros.
	 */
	private Map<String, String> imss_parametros;

	/**
	 * Atributo de instancia tipo lista de CatalogoDTO para definir la propiedad
	 * lista tipo parametrizacion.
	 */
	private List<CatalogoDTO> ilc_listaTipoParametrizacion;
	
	/**
	 * Atributo para definir la propiedad lb formulario tipo parametrizacion.
	 */
	private Boolean lb_formularioTipoParametrizacion;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * titulo parametrizacion.
	 */
	private String is_tituloParametrizacion;

	/**
	 * Atributo de instancia tipo ResourceBundle para definir la propiedad bundle
	 * txt alcaldia.
	 */
	@ManagedProperty(value = "#{txt_alcaldia}")
	private transient ResourceBundle irb_bundleTxtAlcaldia;

	/**
	 * Metodo que inicializa el Bean.
	 */
	@PostConstruct
	public void inicio() {
		try {
			imss_parametros = new HashMap<>();
			HttpServletRequest lhsr_solicitud = (HttpServletRequest) FacesContext.getCurrentInstance()
					.getExternalContext().getRequest();
			String ls_idAlcaldia = lhsr_solicitud.getParameter(EnumParametrosURL.ID.getIs_nombreParametro());

			if (Objects.isNull(ls_idAlcaldia))
				throw new ExcepcionesDatosEntrada(EnumExcepcionesAlcaldiaParametrizacion.IDENTIFICADOR_INCORRECTO);

			iap_alcaldiaParametrizada = iia_alcaldiaBusiness.consultarAlcaldia(ls_idAlcaldia);

			actualizarParametros();

			if (Objects.isNull(iap_alcaldiaParametrizada))
				throw new ExcepcionesDatosEntrada(EnumExcepcionesAlcaldiaParametrizacion.ALCALDIA_NO_EXISTENTE);

			ilc_listaTipoParametrizacion = iic_catalogos
					.consultarCatalogosTipo(EnumTipoCatalogo.PARAMETRIZACION_ALCADIA.getIs_codigo());

			seleccionarTipoPagina();
		} catch (Exception ae_excepcion) {
			consultarAlcadias();
		}
	}
	
	
	/**
	 * Metodo que permite actualizar solamente los valores que son actualizados.
	 */
	private void actualizarParametros() {
		for (ParametrosDinamicosAlcaldiaDTO lpda_parametrosDinamicosAlcaldiaDto : iap_alcaldiaParametrizada
				.getIlpda_parametrosDinamicos())
			imss_parametros.put(lpda_parametrosDinamicosAlcaldiaDto.getIs_nombre(),
					lpda_parametrosDinamicosAlcaldiaDto.getIs_valor());
	}

	/**
	 * Metodo que permite seleccionar y renderizar la respectiva opcion de
	 * parametrizacion.
	 */
	public void seleccionarTipoPagina() {
		if (iap_alcaldiaParametrizada.getIs_tipoParametrizacion()
				.equals(EnumTipoParametrizacionAlcaldia.PAGINA_WEB.getIs_criterio())) {
			lb_formularioTipoParametrizacion = true;
			is_tituloParametrizacion = irb_bundleTxtAlcaldia.getString(CS_PAGINA);
		} else if (iap_alcaldiaParametrizada.getIs_tipoParametrizacion()
				.equals(EnumTipoParametrizacionAlcaldia.SERVICIO_WEB.getIs_criterio())) {
			lb_formularioTipoParametrizacion = false;
			is_tituloParametrizacion = irb_bundleTxtAlcaldia.getString(CS_SERVICIO_WEB);
		}
	}

	/**
	 * Metodo que permite modificar una alcaldia.
	 */
	public void modificarAlcadia() {
		try {
			Boolean lb_estadoTransaccion = iia_alcaldiaBusiness.actualizarAlcadia(iap_alcaldiaParametrizada, imss_parametros);


			if (lb_estadoTransaccion) {
				GeneradorGrowlGenerico
				.generarMensajeInformacion(EnumExcepcionesAlcaldiaParametrizacion.ALCALDIA_EXITOSO);
			} else {
				throw new ExcepcionesDatosEntrada(EnumExcepcionesAlcaldiaParametrizacion.ALCALDIA_FALLIDO);
			}

		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo que permite redireccinar a alcadias.
	 */
	public void consultarAlcadias() {
		FacesContext lfc_facesContext = FacesContext.getCurrentInstance();
		try {
			FacesContext.getCurrentInstance().getExternalContext()
			.redirect(lfc_facesContext.getExternalContext().getApplicationContextPath()
					+ EnumURLRutas.URL_CONSULTA_ALCALDIAS.getIs_url());
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Obtiene el valor para la propiedad alcaldia business.
	 *
	 * @return El valor de la propiedad alcaldia business
	 */
	public IAlcaldiaBusiness getIia_alcaldiaBusiness() {
		return iia_alcaldiaBusiness;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad alcaldia business.
	 *
	 * @param aia_alcaldiaBusiness el nuevo valor para la propiedad alcaldia
	 *                             business
	 */
	public void setIia_alcaldiaBusiness(IAlcaldiaBusiness aia_alcaldiaBusiness) {
		this.iia_alcaldiaBusiness = aia_alcaldiaBusiness;
	}

	/**
	 * Obtiene el valor para la propiedad catalogos.
	 *
	 * @return El valor de la propiedad catalogos
	 */
	public ICatalogoBusiness getIic_catalogos() {
		return iic_catalogos;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad catalogos.
	 *
	 * @param aic_catalogos el nuevo valor para la propiedad catalogos
	 */
	public void setIic_catalogos(ICatalogoBusiness aic_catalogos) {
		this.iic_catalogos = aic_catalogos;
	}

	/**
	 * Obtiene el valor para la propiedad alcaldia parametrizada.
	 *
	 * @return El valor de la propiedad alcaldia parametrizada
	 */
	public AlcaldiaParametrizacionDTO getIap_alcaldiaParametrizada() {
		return iap_alcaldiaParametrizada;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad alcaldia parametrizada.
	 *
	 * @param aap_alcaldiaParametrizada el nuevo valor para la propiedad alcaldia
	 *                                  parametrizada
	 */
	public void setIap_alcaldiaParametrizada(AlcaldiaParametrizacionDTO aap_alcaldiaParametrizada) {
		this.iap_alcaldiaParametrizada = aap_alcaldiaParametrizada;
	}

	/**
	 * Obtiene el valor para la propiedad lista tipo parametrizacion.
	 *
	 * @return El valor de la propiedad lista tipo parametrizacion
	 */
	public List<CatalogoDTO> getIlc_listaTipoParametrizacion() {
		return ilc_listaTipoParametrizacion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista tipo parametrizacion.
	 *
	 * @param alc_listaTipoParametrizacion el nuevo valor para la propiedad lista
	 *                                     tipo parametrizacion
	 */
	public void setIlc_listaTipoParametrizacion(List<CatalogoDTO> alc_listaTipoParametrizacion) {
		this.ilc_listaTipoParametrizacion = alc_listaTipoParametrizacion;
	}

	/**
	 * Obtiene el valor para la propiedad lb formulario tipo parametrizacion.
	 *
	 * @return El valor de la propiedad lb formulario tipo parametrizacion
	 */
	public Boolean getLb_formularioTipoParametrizacion() {
		return lb_formularioTipoParametrizacion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lb formulario tipo
	 * parametrizacion.
	 *
	 * @param ab_formularioTipoParametrizacion el nuevo valor para la propiedad lb
	 *                                         formulario tipo parametrizacion
	 */
	public void setLb_formularioTipoParametrizacion(Boolean ab_formularioTipoParametrizacion) {
		this.lb_formularioTipoParametrizacion = ab_formularioTipoParametrizacion;
	}

	/**
	 * Obtiene el valor para la propiedad titulo parametrizacion.
	 *
	 * @return El valor de la propiedad titulo parametrizacion
	 */
	public String getIs_tituloParametrizacion() {
		return is_tituloParametrizacion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad titulo parametrizacion.
	 *
	 * @param as_tituloParametrizacion el nuevo valor para la propiedad titulo
	 *                                 parametrizacion
	 */
	public void setIs_tituloParametrizacion(String as_tituloParametrizacion) {
		this.is_tituloParametrizacion = as_tituloParametrizacion;
	}

	/**
	 * Obtiene el valor para la propiedad bundle txt alcaldia.
	 *
	 * @return El valor de la propiedad bundle txt alcaldia
	 */
	public ResourceBundle getIrb_bundleTxtAlcaldia() {
		return irb_bundleTxtAlcaldia;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad bundle txt alcaldia.
	 *
	 * @param arb_bundleTxtAlcalcia el nuevo valor para la propiedad bundle txt
	 *                              alcaldia
	 */
	public void setIrb_bundleTxtAlcaldia(ResourceBundle arb_bundleTxtAlcalcia) {
		this.irb_bundleTxtAlcaldia = arb_bundleTxtAlcalcia;
	}
}
