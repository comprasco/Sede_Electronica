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
import org.primefaces.PrimeFaces;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesDatosEntrada;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICatalogoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IEntidadEspecialBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IPoderesBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ISolicitudInternaPoderBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CatalogoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.EntidadEspecialDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.SolicitudPendientePoderDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IPoderesWSBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumParametrosURL;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoCatalogo;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTiposEstadoTransaccionSolicitudInterna;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTiposSolicitudesPoderes;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumURLRutas;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.EnumMensajesSolicitudesInternas;
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
@ManagedBean(name = "beanCreacionSolicitudPendientePoder")
@ViewScoped
public class BeanCreacionSolicitudPendientePoder implements Serializable{

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	private List<EntidadEspecialDTO> ilee_entidadesEspeciales;
	private List<CatalogoDTO> ilc_catalogo;
	private SolicitudPendientePoderDTO ispp_solicitudes;
	private EntidadEspecialDTO iee_entidadEspecialSolicitante;
	private EntidadEspecialDTO iee_entidadEspecialOrigen;
	private String is_tipoConsulta;
	/**
	 * Atributo de instancia tipo CatalogoDTO para definir la propiedad catalogo
	 * criterio datos basicos.
	 */
	private CatalogoDTO ic_catalogoTipoPoder;
	/**
	 * Define la constante CL_LOGGER.
	 */
	private static final Logger CL_LOGGER = Logger.getLogger(BeanCreacionSolicitudPendientePoder.class);

	@EJB
	private ISolicitudInternaPoderBusiness iisipb_solicitudPendientePoderesBusiness;
	
	@EJB
	private IPoderesWSBusiness iipwb_poderesBusiness;	
	
	@EJB
	private IPoderesBusiness  iipb_poderesBusiness;
	@EJB
	private IEntidadEspecialBusiness iiee_entidadesEspecialesBusiness;

	@EJB
	private ICatalogoBusiness iic_catalogosBusiness;

	@PostConstruct
	public void init() {
		try {
			// Recibo los parametros del enlace
			HttpServletRequest lhsr_solicitud = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
			is_tipoConsulta = lhsr_solicitud.getParameter(EnumParametrosURL.TIPO.getIs_nombreParametro());
			//Reviso si el tipo de solcitud es aplicable
			if (!EnumTiposSolicitudesPoderes.validarTipo(is_tipoConsulta)) {
				//Redireccione al inicio, pagina no valida
				FacesContext lfc_facesContext = FacesContext.getCurrentInstance();
				FacesContext.getCurrentInstance().getExternalContext().redirect(lfc_facesContext.getExternalContext().getApplicationContextPath() + EnumURLRutas.URL_INICIO.getIs_url());	

			}else {
				cargarDatos();
			}

		} catch (Exception ae_excepcion) {
			CL_LOGGER.error(ae_excepcion);
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo que se encarga de cargar los datos de las variables globales
	 */
	private void cargarDatos() {
		ispp_solicitudes = new SolicitudPendientePoderDTO();
		ilee_entidadesEspeciales = iiee_entidadesEspecialesBusiness.consultarEntidadesEspeciales();
		iee_entidadEspecialSolicitante = UtilidadUsuarioSesion.usuarioSesion().getIee_entidadEspecial();		
		//Dicho catalogo hay que actualizarlo en la bd recurrentemente del servicio bachue
		ilc_catalogo =  iic_catalogosBusiness.consultarCatalogosTipo(EnumTipoCatalogo.TIPO_PODER_CREACION.getIs_codigo());
	}

	/**
	 * Metodo que permite agregar solicitud interna a la base de datos
	 */
	public void agregarSolicitud() {		

		PrimeFaces lpf_current = PrimeFaces.current();
		try {
			if (is_tipoConsulta.equals(EnumTiposSolicitudesPoderes.SOLICITUDES_PENDIENTES_CARGUE_PODER.getIs_criterio())) {
				
				if (ispp_solicitudes.getIs_observacion() == null || ispp_solicitudes.getIs_observacion().isEmpty()) {
					throw new ExcepcionesDatosEntrada(EnumExcepcionesGenerales.DATOS_OBSERVACION_REQUERIDOS);
				}
				
				if(iee_entidadEspecialSolicitante.getIs_id().equals(iee_entidadEspecialOrigen.getIs_id())) {
					throw new ExcepcionesDatosEntrada(EnumExcepcionesGenerales.DATOS_USUARIO_EE_INCORRECTO);
				}
				
				ispp_solicitudes.setIs_estadoSolicitud(EnumTiposEstadoTransaccionSolicitudInterna.PENDIENTE.getIs_criterio());
				ispp_solicitudes.setIs_idNotariaOrigen(iee_entidadEspecialOrigen.getIs_id());
				ispp_solicitudes.setIs_idNotariaSolicitante(iee_entidadEspecialSolicitante.getIs_id());
				ispp_solicitudes.setIs_tipoPoder(ic_catalogoTipoPoder.getIs_nombre());
				ispp_solicitudes.setIee_entidadEspecialSolicitante(iee_entidadEspecialSolicitante);
				ispp_solicitudes.setIee_entidadEspecialOrigen(iee_entidadEspecialOrigen);				
				ispp_solicitudes.setIs_tipoTransaccion(is_tipoConsulta);
				iisipb_solicitudPendientePoderesBusiness.actualizarSolicitud(ispp_solicitudes, null);
				
				GeneradorGrowlGenerico.generarMensajeExitoso(EnumMensajesSolicitudesInternas.SOLICITUD_GUARDADA_EXITOSAMENTE);
				
				lpf_current.executeScript(
						"PF('blockUI-Loading').hide();PF('modalSolicitudCreadaExitosamente').show()");
			
			}
		} catch (Exception ae_excepcion) {
			CL_LOGGER.error(ae_excepcion);
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
			lpf_current.executeScript("PF('blockUI-Loading').hide();PF('modalConfirmacionSolicitud').hide();");
		}
	}

	public List<EntidadEspecialDTO> getIlee_entidadesEspeciales() {
		return ilee_entidadesEspeciales;
	}

	public void setIlee_entidadesEspeciales(List<EntidadEspecialDTO> alee_entidadesEspeciales) {
		this.ilee_entidadesEspeciales = alee_entidadesEspeciales;
	}

	public SolicitudPendientePoderDTO getIspp_solicitudes() {
		return ispp_solicitudes;
	}

	public void setIspp_solicitudes(SolicitudPendientePoderDTO aspp_solicitudes) {
		this.ispp_solicitudes = aspp_solicitudes;
	}

	public String getIs_tipoConsulta() {
		return is_tipoConsulta;
	}

	public void setIs_tipoConsulta(String as_tipoConsulta) {
		this.is_tipoConsulta = as_tipoConsulta;
	}

	public EntidadEspecialDTO getIee_entidadEspecialSolicitante() {
		return iee_entidadEspecialSolicitante;
	}

	public void setIee_entidadEspecialSolicitante(EntidadEspecialDTO aee_entidadEspecialSolicitante) {
		this.iee_entidadEspecialSolicitante = aee_entidadEspecialSolicitante;
	}

	public List<CatalogoDTO> getIlc_catalogo() {
		return ilc_catalogo;
	}

	public void setIlc_catalogo(List<CatalogoDTO> alc_catalogo) {
		this.ilc_catalogo = alc_catalogo;
	}

	public CatalogoDTO getIc_catalogoTipoPoder() {
		return ic_catalogoTipoPoder;
	}

	public void setIc_catalogoTipoPoder(CatalogoDTO ac_catalogoTipoPoder) {
		this.ic_catalogoTipoPoder = ac_catalogoTipoPoder;
	}

	public EntidadEspecialDTO getIee_entidadEspecialOrigen() {
		return iee_entidadEspecialOrigen;
	}

	public void setIee_entidadEspecialOrigen(EntidadEspecialDTO aee_entidadEspecialOrigen) {
		this.iee_entidadEspecialOrigen = aee_entidadEspecialOrigen;
	}

}
