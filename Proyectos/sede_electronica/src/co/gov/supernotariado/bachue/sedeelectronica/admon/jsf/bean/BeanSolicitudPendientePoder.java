package co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IPoderesBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ISolicitudInternaPoderBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.EntidadEspecialDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ObservacionPoderDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.SolicitudPendientePoderDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters.PoderesConverter;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IPoderesWSBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.poderes.ParametroWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumEstadoPoder;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumParametrosURL;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumRol;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTiposEstadoTransaccionSolicitudInterna;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTiposSolicitudesPoderes;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumURLRutas;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.EnumMensajesSolicitudesInternas;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.GeneradorGrowlGenerico;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadFecha;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadUsuarioSesion;

/**
 * Clase tipo managed bean de la capa de UI (User Interface). <br>
 * Manipula operaciones y propiedades que permiten manejar <br>
 * la visualizacion de componentes JSF para Solicitud consulta.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@ManagedBean(name = "beanSolicitudPendientePoder")
@ViewScoped
public class BeanSolicitudPendientePoder implements Serializable{

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	private SolicitudPendientePoderDTO ispp_solicitudes;
	private ParametroWSDTO ip_poder;
	private String is_tituloEncabezado;
	private String is_identificadorSolicitudPendiente;
	private String is_tipoConsulta;
	private EntidadEspecialDTO iee_entidadEspecialOrigen;
	/**
	 * Define la constante CL_LOGGER.
	 */
	private static final Logger CL_LOGGER = Logger.getLogger(BeanSolicitudPendientePoder.class);

	@EJB
	private ISolicitudInternaPoderBusiness isppb_solicitudPendientePoderesBusiness;	

	@EJB
	private IPoderesWSBusiness iipwb_poderesBusiness;

	@EJB
	private IPoderesBusiness  iipb_poderesBusiness;
	
	private List<ObservacionPoderDTO> ilop_observacionesExistentes;

	@PostConstruct
	public void init() {

		try {
			// Recibo los parametros del enlace
			HttpServletRequest lhsr_solicitud = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
			is_identificadorSolicitudPendiente = lhsr_solicitud.getParameter(EnumParametrosURL.IDENTIFICADOR_SOLICITUD.getIs_nombreParametro());
			iee_entidadEspecialOrigen = UtilidadUsuarioSesion.usuarioSesion().getIee_entidadEspecial();
			
			//Reviso si el tipo de solcitud es aplicable
			if (is_identificadorSolicitudPendiente == null || is_identificadorSolicitudPendiente.isEmpty() ) {
				//Redireccione al inicio, pagina no valida				
				redireccionarInicioSolicitudes();
			}else {				
				consultarSolicitud();
			}

		} catch (Exception ae_excepcion) {
			CL_LOGGER.error(ae_excepcion);
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
			//Redireccione al inicio, pagina no valida				
			redireccionarInicioSolicitudes();
		}

	}

	/**
	 * Metodo que permite consultar una solicitud interna
	 */
	private void consultarSolicitud() {

		ispp_solicitudes = isppb_solicitudPendientePoderesBusiness.consultarSolicitudPendientePoder(is_identificadorSolicitudPendiente,iee_entidadEspecialOrigen);
		is_tipoConsulta = ispp_solicitudes.getIs_tipoTransaccion();

		if (!is_tipoConsulta.equals(EnumTiposSolicitudesPoderes.SOLICITUDES_PENDIENTES_CARGUE_PODER.getIs_criterio())) {
			ip_poder =	iipb_poderesBusiness.consultarPoder(ispp_solicitudes.getIs_idVersionPoder(), ispp_solicitudes.getIs_idPoder()).getIlp_parametros().iterator().next();
			PoderesConverter.generarObservaciones(ip_poder.getIs_xJustificacionUsado());
		}

	}

	/**
	 * Metodo que redirecciona al inicio de las solicitudes
	 */
	private void redireccionarInicioSolicitudes() {
		FacesContext lfc_facesContext = FacesContext.getCurrentInstance();
		try {
			FacesContext.getCurrentInstance().getExternalContext()
			.redirect(lfc_facesContext.getExternalContext().getApplicationContextPath() 
					+ EnumURLRutas.URL_SOLICITUDES_PODER.getIs_url() + "?" + EnumParametrosURL.TIPO.getIs_nombreParametro() + "=" + is_tipoConsulta);
		} catch (Exception ae_excepcion) {
			CL_LOGGER.error(ae_excepcion);
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo que redirecciona la aprobacion de la solicitud
	 */
	public void redireccionAprobacion() {
		FacesContext lfc_facesContext = FacesContext.getCurrentInstance();
		try {

			String ls_url = "";
			if (is_tipoConsulta.equals(EnumTiposSolicitudesPoderes.SOLICITUDES_PENDIENTES_CARGUE_PODER.getIs_criterio())) {
				ls_url = EnumURLRutas.URL_CARGUE_PODER.getIs_url() + "?" +EnumParametrosURL.IDENTIFICADOR_SOLICITUD.getIs_nombreParametro() + "=" + ispp_solicitudes.getIs_id() +"&" +EnumParametrosURL.TIPO.getIs_nombreParametro() + "=" + is_tipoConsulta;

			}else if(is_tipoConsulta.equals(EnumTiposSolicitudesPoderes.SOLICITUDES_PENDIENTES_CORRECCION.getIs_criterio())) {
				ls_url = EnumURLRutas.URL_CARGUE_PODER.getIs_url() + "?" +EnumParametrosURL.IDENTIFICADOR_SOLICITUD.getIs_nombreParametro() + "=" + ispp_solicitudes.getIs_id() +"&" +EnumParametrosURL.TIPO.getIs_nombreParametro() + "=" + is_tipoConsulta;

			}else if(is_tipoConsulta.equals(EnumTiposSolicitudesPoderes.SOLICITUDES_PENDIENTES_ANULACION.getIs_criterio())){
				ispp_solicitudes.setIs_estadoSolicitud(EnumTiposEstadoTransaccionSolicitudInterna.ACEPTADA.getIs_criterio());
				ip_poder.setIs_xEstadoPoder(EnumEstadoPoder.ANULADO.getIs_codigo());

				ObservacionPoderDTO lop_observacionPoder = new ObservacionPoderDTO();

				lop_observacionPoder.setIs_observaciones(generarObservacionAnulacion());
				lop_observacionPoder.setIs_fecha(UtilidadFecha.formatearFecha(new Date()));
				lop_observacionPoder.setIs_notariaCreadora(EnumRol.ADMIN_NEGOCIO.getIs_nombreLegible());
				lop_observacionPoder.setIs_tipoPoder(ip_poder.getIs_xTipoPoder());
				if(ilop_observacionesExistentes == null)
					ilop_observacionesExistentes = new ArrayList<>();
				ilop_observacionesExistentes.add(lop_observacionPoder);
				ip_poder.setIs_xJustificacionRevocado(ilop_observacionesExistentes.toString());

				isppb_solicitudPendientePoderesBusiness.actualizarSolicitud(ispp_solicitudes,ip_poder);
				ls_url = EnumURLRutas.URL_SOLICITUDES_PODER.getIs_url() + "?" +EnumParametrosURL.TIPO.getIs_nombreParametro() + "=" + is_tipoConsulta ;
			}	

			FacesContext.getCurrentInstance().getExternalContext().redirect(lfc_facesContext.getExternalContext().getApplicationContextPath() + ls_url);

		} catch (Exception ae_excepcion) {
			CL_LOGGER.error(ae_excepcion);
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	private String generarObservacionAnulacion() {
		String ls_observacion =				
				" - " + EnumTiposSolicitudesPoderes.SOLICITUDES_PENDIENTES_ANULACION.getIs_nombre() 
				+ " - " + EnumTiposEstadoTransaccionSolicitudInterna.ACEPTADA.getIs_criterio() 
				+ "-" + ispp_solicitudes.getIs_justificacion();

		return ls_observacion;
	}

	/**
	 * Metodo que verifica el estado de rechazo y lo persiste
	 */
	public void redireccionRechazo() {
		try {
			if (ispp_solicitudes == null || ispp_solicitudes.getIs_justificacion().isEmpty()) {
				GeneradorGrowlGenerico.generarMensajeError(EnumMensajesSolicitudesInternas.SOLICITUD_JUSTIFICACION);
				return;
			}

			ispp_solicitudes.setIs_estadoSolicitud(EnumTiposEstadoTransaccionSolicitudInterna.RECHAZADA.getIs_criterio());
			if (ispp_solicitudes.getIs_tipoTransaccion().equals(EnumTiposSolicitudesPoderes.SOLICITUDES_PENDIENTES_CARGUE_PODER.getIs_criterio())) {
				isppb_solicitudPendientePoderesBusiness.actualizarSolicitud(ispp_solicitudes,null);
			}else {
				//Se actualiza estado rechazado 
				ispp_solicitudes.setIs_estadoSolicitud(EnumTiposEstadoTransaccionSolicitudInterna.RECHAZADA.getIs_criterio());
				ip_poder.setIs_xEstadoPoder(EnumEstadoPoder.ACTIVO.getIs_codigo());
				isppb_solicitudPendientePoderesBusiness.actualizarSolicitud(ispp_solicitudes,ip_poder);
			}	

			redireccionarInicioSolicitudes();

		} catch (Exception ae_excepcion) {
			CL_LOGGER.error(ae_excepcion);
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}

	}

	public SolicitudPendientePoderDTO getIspp_solicitudes() {
		return ispp_solicitudes;
	}

	public void setIspp_solicitudes(SolicitudPendientePoderDTO aspp_solicitudes) {
		this.ispp_solicitudes = aspp_solicitudes;
	}

	public String getIs_tituloEncabezado() {
		return is_tituloEncabezado;
	}

	public void setIs_tituloEncabezado(String as_tituloEncabezado) {
		this.is_tituloEncabezado = as_tituloEncabezado;
	}

	public String getIs_identificadorSolicitudPendiente() {
		return is_identificadorSolicitudPendiente;
	}

	public void setIs_identificadorSolicitudPendiente(String as_identificadorSolicitudPendiente) {
		this.is_identificadorSolicitudPendiente = as_identificadorSolicitudPendiente;
	}

	public String getIs_tipoConsulta() {
		return is_tipoConsulta;
	}

	public void setIs_tipoConsulta(String as_tipoConsulta) {
		this.is_tipoConsulta = as_tipoConsulta;
	}

	public ParametroWSDTO getIp_poder() {
		return ip_poder;
	}

	public void setIp_poder(ParametroWSDTO ap_poder) {
		this.ip_poder = ap_poder;
	}
	
}
