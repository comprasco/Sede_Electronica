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
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ISolicitudInternaPoderBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.EntidadEspecialDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.SolicitudPendientePoderDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumParametrosURL;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTiposEstadoTransaccionSolicitudInterna;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTiposSolicitudesPoderes;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumURLRutas;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesGenerales;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.GeneradorGrowlGenerico;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadUsuarioSesion;

/**
 * Clase tipo managed bean de la capa de UI (User Interface). <br>
 * Manipula operaciones y propiedades que permiten manejar <br>
 * la visualizacion de componentes JSF para Solicitud consulta.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@ManagedBean(name = "beanSolicitudesPendientesPoderes")
@ViewScoped
public class BeanSolicitudesPendientesPoderes implements Serializable{

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	private List<SolicitudPendientePoderDTO> ilspp_solicitudes;
	private EntidadEspecialDTO iee_entidadEspecialOrigen;
	private String is_tituloEncabezado;
	private String is_tipoConsulta;

	/**
	 * Define la constante CL_LOGGER.
	 */
	private static final Logger CL_LOGGER = Logger.getLogger(BeanSolicitudesPendientesPoderes.class);

	@EJB
	private ISolicitudInternaPoderBusiness isppb_solicitudPendientePoderesBusiness;

	@PostConstruct
	public void init() {

		try {
			// Recibo los parametros del enlace
			HttpServletRequest lhsr_solicitud = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
			is_tipoConsulta = lhsr_solicitud.getParameter(EnumParametrosURL.TIPO.getIs_nombreParametro());
			iee_entidadEspecialOrigen = UtilidadUsuarioSesion.usuarioSesion().getIee_entidadEspecial();

			//Reviso si el tipo de solcitud es aplicable
			if (!EnumTiposSolicitudesPoderes.validarTipo(is_tipoConsulta)) {
				//Redireccione al inicio, pagina no valida
				FacesContext lfc_facesContext = FacesContext.getCurrentInstance();
				FacesContext.getCurrentInstance().getExternalContext().redirect(lfc_facesContext.getExternalContext().getApplicationContextPath() + EnumURLRutas.URL_INICIO.getIs_url());	

			}else {
				consultarSolicitudesPendietes();
			}

		} catch (Exception ae_excepcion) {
			CL_LOGGER.error(ae_excepcion);
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}

	}	

	/**
	 * Metodo que permite redireccionar una solicitud
	 * @param as_identificadorSolicitud identificador de la solicitud
	 */
	public void redireccionarSolicitud(String as_identificadorSolicitud) {

		try {

			if (as_identificadorSolicitud == null || as_identificadorSolicitud.isEmpty()) 
				throw new ExcepcionesDatosEntrada(EnumExcepcionesGenerales.ERROR_DATOS_VACIOS);

			FacesContext lfc_facesContext = FacesContext.getCurrentInstance();
			FacesContext.getCurrentInstance().getExternalContext()
			.redirect(lfc_facesContext.getExternalContext().getApplicationContextPath() + getUrlResumen(as_identificadorSolicitud));	

		} catch (Exception ae_excepcion) {
			CL_LOGGER.error(ae_excepcion);
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}

	}

	/**
	 * Metodo que genera la url del resumen de la solicitud
	 * @param as_identificadorSolicitud 
	 * @return URL de la solicitud final
	 */
	private String getUrlResumen(String as_identificadorSolicitud) {
		String ls_urlDetalleSolicitud;
		ls_urlDetalleSolicitud = EnumURLRutas.URL_DETALLE_SOLICITUD_INTERNA_PODER.getIs_url() + "?"
				+ EnumParametrosURL.IDENTIFICADOR_SOLICITUD.getIs_nombreParametro() + "=" + as_identificadorSolicitud ;		
		return ls_urlDetalleSolicitud;
	}

	/**
	 * Metodo que consulta solicitudes pendientes
	 */
	private void consultarSolicitudesPendietes() {
		ilspp_solicitudes = isppb_solicitudPendientePoderesBusiness.consultarSolicitudesPendientesPoderes(is_tipoConsulta, EnumTiposEstadoTransaccionSolicitudInterna.PENDIENTE.getIs_criterio(), iee_entidadEspecialOrigen);
	}

	public List<SolicitudPendientePoderDTO> getIlspp_solicitudes() {
		return ilspp_solicitudes;
	}

	public void setIlspp_solicitudes(List<SolicitudPendientePoderDTO> alspp_solicitudes) {
		this.ilspp_solicitudes = alspp_solicitudes;
	}

	public String getIs_tituloEncabezado() {
		return is_tituloEncabezado;
	}

	public void setIs_tituloEncabezado(String as_tituloEncabezado) {
		this.is_tituloEncabezado = as_tituloEncabezado;
	}

	public String getIs_tipoConsulta() {
		return is_tipoConsulta;
	}

	public void setIs_tipoConsulta(String as_tipoConsulta) {
		this.is_tipoConsulta = as_tipoConsulta;
	}

	public EntidadEspecialDTO getIee_entidadEspecialOrigen() {
		return iee_entidadEspecialOrigen;
	}

	public void setIee_entidadEspecialOrigen(EntidadEspecialDTO aee_entidadEspecialOrigen) {
		this.iee_entidadEspecialOrigen = aee_entidadEspecialOrigen;
	}


}
