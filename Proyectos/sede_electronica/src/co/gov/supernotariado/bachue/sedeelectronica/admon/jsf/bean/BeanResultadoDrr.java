/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BeanResultadoDrr.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean
 * Nombre del elemento: BeanResultadoDrr
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesNegocio;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICirculoRegistralBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IMunicipioBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CirculoRegistralDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.MunicipioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IConsultaDrrBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.consultadrr.IResultadoDrrWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.consultadrr.RestriccionWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.consultadrr.TipoSalidaConsultarRRRMatriculasWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumParametrosURL;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumURLRutas;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesConsultaDrr;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.GeneradorGrowlGenerico;

/**
 * Clase tipo managed bean de la capa de UI (User Interface). <br>
 * Manipula operaciones y propiedades que permiten manejar <br>
 * la visualizacion de componentes JSF para Accion.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@ManagedBean(name = "beanResultadoDrr")
@ViewScoped
public class BeanResultadoDrr implements Serializable {

	/**
	 * Define la constante CL_LOGGER.
	 */
	private static final Logger CL_LOGGER = Logger.getLogger(BeanResultadoDrr.class);

	/**
	 * Generated serial version.
	 */
	private static final long serialVersionUID = 1L;

	@EJB
	private IConsultaDrrBusiness iicd_consultaDrrBusiness;
	@EJB
	private IMunicipioBusiness iimb_municipioBusiness;
	@EJB
	private ICirculoRegistralBusiness iicrb_circuloBusiness;

	private String is_numero;
	private String is_criterioBusqueda;
	private String is_tamanioCriterio;

	private MunicipioDTO im_municipio;
	private CirculoRegistralDTO icr_circuloRegistral;
	private TipoSalidaConsultarRRRMatriculasWSDTO itscrm_tipoSalidaConsultaRRRMatricula;
	private IResultadoDrrWSDTO iird_resultadoDrr;

	private Boolean ib_renderDetalle;

	private static final String CS_DERECHOS = "DERECHOS";
	private static final String CS_RESTRICCIONES = "RESTRICCIONES";
	private static final String CS_RESPONSABILIDADES = "RESPONSABILIDADES";
	private static final String CS_PUBLICIDADES = "PUBLICIDADES";
	private static final String CS_HIPOTECAS = "HIPOTECAS";

	/**
	 * Inicializa el objeto.
	 */
	@PostConstruct
	public void init() {
		try {

			// Recibo los parametros del enlace
			HttpServletRequest lhsr_solicitud = (HttpServletRequest) FacesContext.getCurrentInstance()
					.getExternalContext().getRequest();
			is_numero = lhsr_solicitud.getParameter(EnumParametrosURL.NUMERO.getIs_nombreParametro());
			is_criterioBusqueda = lhsr_solicitud.getParameter(EnumParametrosURL.CRITERIO.getIs_nombreParametro());
			ib_renderDetalle = false;

			// Validacion de parametros de entrada
			if (is_numero == null || is_criterioBusqueda == null)
				throw new ExcepcionesNegocio(EnumExcepcionesConsultaDrr.DATOS_NO_ENCONTRADOS);

			// Consulta DRR
			consultaDrr();
			//Consulta detalles del lugar
			consultarDetallesLugar();
			//Mensaje de exito de la consulta
			GeneradorGrowlGenerico.generarMensajeExitoso(EnumExcepcionesConsultaDrr.DATOS_ENCONTRADOS);

		} catch (Exception ae_excepcion) {
			// Maneja excepcion de forma tal que retorna al menu de consulta en caso de no
			// ser exitosa la consulta
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
			String ls_resumen = EnumURLRutas.URL_CONSULTA_DRR.getIs_url();
			FacesContext lfc_facesContext = FacesContext.getCurrentInstance();
			try {
				FacesContext.getCurrentInstance().getExternalContext()
						.redirect(lfc_facesContext.getExternalContext().getApplicationContextPath() + ls_resumen
								+  EnumParametrosURL.RESULTADO_PARAMETRO.getIs_nombreParametro() + false);
			} catch (IOException ae_exception) {
				CL_LOGGER.error(ae_exception);
			}
		}
	}

	/**
	 * Metodo que renderiza el debido detalle de anotacion
	 * 
	 * @param as_tipoDrr         tipo de drr seleccionado
	 * @param as_numeroAnotacion numero de anotacion a filtrar y especificar
	 */
	public void seleccionarDetalle(String as_tipoDrr, String as_numeroAnotacion) {
		renderizarDetalle();
		switch (as_tipoDrr) {
		case CS_DERECHOS:
			iird_resultadoDrr = consultarDrrSeleccionado(itscrm_tipoSalidaConsultaRRRMatricula.getIld_listaDerechos(),
					as_numeroAnotacion);
			break;
		case CS_RESTRICCIONES:
			iird_resultadoDrr = consultarDrrSeleccionado(itscrm_tipoSalidaConsultaRRRMatricula.getIld_listaDerechos(),
					as_numeroAnotacion);
			break;
		case CS_RESPONSABILIDADES:
			iird_resultadoDrr = consultarDrrSeleccionado(itscrm_tipoSalidaConsultaRRRMatricula.getIld_listaDerechos(),
					as_numeroAnotacion);
			break;
		case CS_PUBLICIDADES:
			iird_resultadoDrr = consultarDrrSeleccionado(itscrm_tipoSalidaConsultaRRRMatricula.getIld_listaDerechos(),
					as_numeroAnotacion);
			break;
		case CS_HIPOTECAS:
			iird_resultadoDrr = consultarDrrSeleccionado(itscrm_tipoSalidaConsultaRRRMatricula.getIld_listaDerechos(),
					as_numeroAnotacion);
			break;
		default:
			iird_resultadoDrr = new RestriccionWSDTO();
			break;
		}
	}

	/**
	 * Metodo que consulta detalles del lugar de la consulta
	 */
	private void consultarDetallesLugar() {
		// Consulta municipio
		im_municipio = iimb_municipioBusiness.consultarCiudadPorId(
				itscrm_tipoSalidaConsultaRRRMatricula.getIs_codMunicipio(),
				itscrm_tipoSalidaConsultaRRRMatricula.getIs_codDepartamento());
		// Consulta Circulo Registral
		icr_circuloRegistral = iicrb_circuloBusiness
				.obtenerCirculoRegistral(itscrm_tipoSalidaConsultaRRRMatricula.getIs_codCirculoRegistral());
	}

	/**
	 * Metodo que permite filtrar el tipo de resultaod drr
	 * 
	 * @param alird_resultadosDrr lista de resultados a filtrar
	 * @param as_numeroAnotacion  numero de anotacion a filtrar
	 * @return IResultadoDrrWSDTO anotacion filtrada
	 */
	private IResultadoDrrWSDTO consultarDrrSeleccionado(List<? extends IResultadoDrrWSDTO> alird_resultadosDrr,
			String as_numeroAnotacion) {
		for (IResultadoDrrWSDTO lird_iResultadoDrrWSDTO : alird_resultadosDrr) {
			if (lird_iResultadoDrrWSDTO.getIs_numAnotacion().equals(as_numeroAnotacion)) {
				return lird_iResultadoDrrWSDTO;
			}
		}
		return null;
	}

	/**
	 * Metodo que consulta el drr
	 */
	public void consultaDrr() {
		itscrm_tipoSalidaConsultaRRRMatricula = iicd_consultaDrrBusiness.consultaDrr(is_numero, is_criterioBusqueda);
	}

	/**
	 * Metodo que permite renderizar el detalle
	 */
	public void renderizarDetalle() {
		ib_renderDetalle = !ib_renderDetalle;
	}

	public String getIs_numero() {
		return is_numero;
	}

	public void setIs_numero(String as_numero) {
		this.is_numero = as_numero;
	}

	public String getIs_criterioBusqueda() {
		return is_criterioBusqueda;
	}

	public void setIs_criterioBusqueda(String as_criterioBusqueda) {
		this.is_criterioBusqueda = as_criterioBusqueda;
	}

	public TipoSalidaConsultarRRRMatriculasWSDTO getItscrm_tipoSalidaConsultaRRRMatricula() {
		return itscrm_tipoSalidaConsultaRRRMatricula;
	}

	public void setItscrm_tipoSalidaConsultaRRRMatricula(
			TipoSalidaConsultarRRRMatriculasWSDTO atscrm_tipoSalidaConsultaRRRMatricula) {
		this.itscrm_tipoSalidaConsultaRRRMatricula = atscrm_tipoSalidaConsultaRRRMatricula;
	}

	public IResultadoDrrWSDTO getIird_resultadoDrr() {
		return iird_resultadoDrr;
	}

	public void setIird_resultadoDrr(IResultadoDrrWSDTO aird_resultadoDrr) {
		this.iird_resultadoDrr = aird_resultadoDrr;
	}

	public Boolean getIb_renderDetalle() {
		return ib_renderDetalle;
	}

	public void setIb_renderDetalle(Boolean ab_renderDetalle) {
		this.ib_renderDetalle = ab_renderDetalle;
	}

	public MunicipioDTO getIm_municipio() {
		return im_municipio;
	}

	public void setIm_municipio(MunicipioDTO am_municipio) {
		this.im_municipio = am_municipio;
	}

	public CirculoRegistralDTO getIcr_circuloRegistral() {
		return icr_circuloRegistral;
	}

	public void setIcr_circuloRegistral(CirculoRegistralDTO acr_circuloRegistral) {
		this.icr_circuloRegistral = acr_circuloRegistral;
	}

	public String getIs_tamanioCriterio() {
		return is_tamanioCriterio;
	}

	public void setIs_tamanioCriterio(String as_tamanioCriterio) {
		this.is_tamanioCriterio = as_tamanioCriterio;
	}

	public String getCs_derechos() {
		return CS_DERECHOS;
	}

	public String getCs_restricciones() {
		return CS_RESTRICCIONES;
	}

	public String getCs_responsabilidades() {
		return CS_RESPONSABILIDADES;
	}

	public String getCs_publicidades() {
		return CS_PUBLICIDADES;
	}

	public String getCs_hipotecas() {
		return CS_HIPOTECAS;
	}
	
	

}
