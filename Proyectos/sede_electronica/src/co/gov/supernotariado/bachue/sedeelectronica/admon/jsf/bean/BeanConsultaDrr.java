/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BeanConsultaDrr.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean
 * Nombre del elemento: BeanConsultaDrr
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
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesDatosEntrada;
import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesNegocio;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICatalogoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICirculoRegistralBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IParametroBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CatalogoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CirculoRegistralDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCriterioConsultaDrr;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumParametros;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumParametrosURL;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoCatalogo;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoCriterioConsultaDrr;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumURLRutas;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesConsultaDrr;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.GeneradorGrowlGenerico;

/**
 * Clase tipo managed bean de la capa de UI (User Interface). <br>
 * Manipula operaciones y propiedades que permiten manejar <br>
 * la visualizacion de componentes JSF para Consulta Drr.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@ManagedBean(name = "beanConsultaDrr")
@ViewScoped
public class BeanConsultaDrr implements Serializable {

	/**
	 * Define la constante CL_LOGGER.
	 */
	private static final Logger CL_LOGGER = Logger.getLogger(BeanConsultaDrr.class);

	/**
	 * Generated serial version.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo ICirculoRegistralBusiness para definir la
	 * propiedad circulo registral business.
	 */
	@EJB
	private ICirculoRegistralBusiness iicr_circuloRegistralBusiness;

	/**
	 * Atributo de instancia tipo ICirculoRegistralBusiness para definir la
	 * propiedad Parametro Business.
	 */
	@EJB
	private IParametroBusiness iipb_parametroBusiness;

	/**
	 * Atributo de instancia tipo ICatalogoBusiness para definir la propiedad tipo
	 * catalogo business.
	 */
	@EJB
	private ICatalogoBusiness iic_tipoCatalogoBusiness;

	private String is_codigoOficina;
	private String is_numeroBusqueda;

	private List<CatalogoDTO> ilc_listaCatalogoCriterioBusqueda;
	/**
	 * Atributo de instancia tipo CatalogoDTO para definir la propiedad catalogo
	 * criterio datos basicos.
	 */
	private CatalogoDTO ic_catalogoCriterio;

	/**
	 * Atributo de instancia tipo CirculoRegistralDTO para definir la propiedad
	 * circulo registral.
	 */
	private CirculoRegistralDTO icr_circuloRegistralDto;

	/**
	 * Atributo de instancia tipo lista de CirculoRegistralDTO para definir la
	 * propiedad lista circulo registral.
	 */
	private List<CirculoRegistralDTO> ilcr_listaCirculoRegistralDto;

	/**
	 * Inicializa el objeto.
	 */
	@PostConstruct
	public void init() {

		try {
			// Recibo los parametros del enlace
			HttpServletRequest lhsr_solicitud = (HttpServletRequest) FacesContext.getCurrentInstance()
					.getExternalContext().getRequest();
			String ls_estado = lhsr_solicitud.getParameter(EnumParametrosURL.RESULTADO.getIs_nombreParametro());

			icr_circuloRegistralDto = new CirculoRegistralDTO();
			ilc_listaCatalogoCriterioBusqueda = iic_tipoCatalogoBusiness
					.consultarCatalogosTipo(EnumTipoCatalogo.TIPO_CONSULTA_DRR.getIs_codigo());
			ic_catalogoCriterio = ilc_listaCatalogoCriterioBusqueda.get(2);
			cargarListaCirculoRegistral();
			if (ls_estado != null && !(Boolean.parseBoolean(ls_estado))) {
				throw new ExcepcionesNegocio(EnumExcepcionesConsultaDrr.DATOS_NO_ENCONTRADOS);
			}
		} catch (Exception ae_excepcion) {
			CL_LOGGER.error(ae_excepcion);
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo que redirecciona al resumen de la transaccion
	 * 
	 * @return String Url
	 */
	public String getUrlResumen() {

		validadorFormato();

		String ls_valorFinal = is_numeroBusqueda;
		String ls_criterioBusqueda = EnumTipoCriterioConsultaDrr
				.consultarCriterioBusqueda(ic_catalogoCriterio.getIs_codigoValor()).getIs_criterioBusqueda();

		if (ic_catalogoCriterio.getIs_codigoValor().equals(EnumCriterioConsultaDrr.NUMERO_MATRICULA.getIs_criterio()))
			ls_valorFinal = icr_circuloRegistralDto.getIs_id() + ls_valorFinal;

		String ls_resumen;
		ls_resumen = EnumURLRutas.URL_RESULTADO_DRR.getIs_url() + "?"
				+ EnumParametrosURL.NUMERO_PARAMETRO.getIs_nombreParametro() + ls_valorFinal + "&"
				+ EnumParametrosURL.CRITERIO_PARAMETRO.getIs_nombreParametro() + ls_criterioBusqueda;

		return ls_resumen;

	}

	/**
	 * Metodo que valida el formato cuando el valor es una matricula
	 */
	private void validadorFormato() {
		if (is_numeroBusqueda == null || is_numeroBusqueda.isEmpty())
			throw new ExcepcionesDatosEntrada(EnumExcepcionesConsultaDrr.INGRESE_VALOR);

		if (ic_catalogoCriterio.getIs_codigoValor().equals(EnumCriterioConsultaDrr.NUMERO_MATRICULA.getIs_criterio())
				&& (icr_circuloRegistralDto == null || icr_circuloRegistralDto.getIs_id().isEmpty())) {
			throw new ExcepcionesDatosEntrada(EnumExcepcionesConsultaDrr.OFICINA_NO_SELECCIONADA);
		}
	}

	/**
	 * Metodo que redirecciona a la vista que realiza la consulta
	 */
	public void consultarDrr() {
		try {
			FacesContext lfc_facesContext = FacesContext.getCurrentInstance();
			FacesContext.getCurrentInstance().getExternalContext()
					.redirect(lfc_facesContext.getExternalContext().getApplicationContextPath() + getUrlResumen());
		} catch (Exception ae_excepcion) {
			CL_LOGGER.error(ae_excepcion);
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo que consuta mensaje de confirmacion
	 * 
	 * @return String mensaje a mostrar
	 */
	public String consultarMensajeConfirmacion() {
		String ls_mensaje;
		ls_mensaje = iipb_parametroBusiness
				.consultarParametro(EnumParametros.CONFIRMACION_DRR_MENSAJE.getIs_nombreParametro()).getIs_valor();
		return ls_mensaje;
	}

	/**
	 * Metodo que se encarga de cargar la lista de circulos registrales(Orip)
	 * 
	 * <b>Resultado: </b> Se carga la lista de circuloRegistral(Orip) desde la base
	 * de datos,.
	 */
	private void cargarListaCirculoRegistral() {
		this.ilcr_listaCirculoRegistralDto = iicr_circuloRegistralBusiness.obtenerListaCirculoRegistral();
	}

	public String getIs_codigoOficina() {
		return is_codigoOficina;
	}

	public void setIs_codigoOficina(String as_codigoOficina) {
		this.is_codigoOficina = as_codigoOficina;
	}

	public List<CatalogoDTO> getIlc_listaCatalogoCriterioBusqueda() {
		return ilc_listaCatalogoCriterioBusqueda;
	}

	public void setIlc_listaCatalogoCriterioBusqueda(List<CatalogoDTO> alc_listaCatalogoCriterioBusqueda) {
		this.ilc_listaCatalogoCriterioBusqueda = alc_listaCatalogoCriterioBusqueda;
	}

	public List<CirculoRegistralDTO> getIlcr_listaCirculoRegistralDto() {
		return ilcr_listaCirculoRegistralDto;
	}

	public void setIlcr_listaCirculoRegistralDto(List<CirculoRegistralDTO> alcr_listaCirculoRegistralDto) {
		this.ilcr_listaCirculoRegistralDto = alcr_listaCirculoRegistralDto;
	}

	public CirculoRegistralDTO getIcr_circuloRegistralDto() {
		return icr_circuloRegistralDto;
	}

	public void setIcr_circuloRegistralDto(CirculoRegistralDTO acr_circuloRegistralDto) {
		this.icr_circuloRegistralDto = acr_circuloRegistralDto;
	}

	public CatalogoDTO getIc_catalogoCriterio() {
		return ic_catalogoCriterio;
	}

	public void setIc_catalogoCriterio(CatalogoDTO ac_catalogoCriterio) {
		this.ic_catalogoCriterio = ac_catalogoCriterio;
	}

	public String getIs_numeroBusqueda() {
		return is_numeroBusqueda;
	}

	public void setIs_numeroBusqueda(String as_numeroBusqueda) {
		this.is_numeroBusqueda = as_numeroBusqueda;
	}

}
