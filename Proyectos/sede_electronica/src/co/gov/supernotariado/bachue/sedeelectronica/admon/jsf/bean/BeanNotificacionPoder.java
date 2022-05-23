/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BeanNotificacionPoder.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean
 * Nombre del elemento: BeanNotificacionPoder
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
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

import org.jboss.logging.Logger;
import org.primefaces.PrimeFaces;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesDatosEntrada;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IEntidadEspecialBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IPoderesBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ActualizacionPoderCorreoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.EntidadEspecialDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IPoderesWSBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.poderes.NotificacionWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.poderes.ParametroWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.poderes.TipoEntradaActualizarMetadatosPoderWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.poderes.TipoSalidaActualizarMetadatosPoderWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumBoolean;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCodigosRespuestas;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCriterio;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumMensajesLog;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumParametrosURL;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTiposSolicitudesPoderes;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumURLRutas;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.EnumMensajesSolicitudesInternas;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesGenerales;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesPoder;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.GeneradorGrowlGenerico;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadFecha;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadUsuarioSesion;

/**
 * Clase tipo managed bean de la capa de UI (User Interface). <br>
 * Manipula operaciones y propiedades que permiten manejar <br>
 * la visualizacion de componentes JSF para Accion.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@ManagedBean(name = "beanNotificacionPoder")
@ViewScoped
public class BeanNotificacionPoder implements Serializable {


	/**
	 * Define la constante CL_LOGGER.
	 */
	static final Logger CL_LOGGER = Logger.getLogger(BeanNotificacionPoder.class);
	private static final String CS_SEPARADOR_OBSERVACION = "\n ------- \n";


	/**
	 * Generated serial version.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo IAccionBusiness para definir la propiedad IPoderesBusiness
	 * business.
	 */
	@EJB
	private IPoderesBusiness iipb_poderesBusiness;

	/**
	 * Atributo de instancia tipo IAccionBusiness para definir la propiedad IPoderesWSBusiness
	 * business.
	 */
	@EJB
	private IPoderesWSBusiness iipb_poderBusinessWS;
	
	@EJB
	private IEntidadEspecialBusiness iieeb_entidadEspecial;

	private TipoEntradaActualizarMetadatosPoderWSDTO iteamp_tipoEntradaMetadatosPoder;

	private ParametroWSDTO ip_parametros;

	private String is_idPoder;

	private String is_notificaciones;

	private String is_notificacion;

	private String is_idVersionPoder;
	
	private EntidadEspecialDTO iee_notariaDestino;
	
	private EntidadEspecialDTO iee_notariaActual;
	


	/**
	 * Inicializa el objeto.
	 */
	@PostConstruct
	public void init() {
		try {
			cargarParametrosSolicitud();
			iteamp_tipoEntradaMetadatosPoder = iipb_poderesBusiness.consultarPoder(is_idVersionPoder, is_idPoder);
			ip_parametros = iteamp_tipoEntradaMetadatosPoder.getIlp_parametros().iterator().next();
			EnumBoolean leb_enumBoolean = EnumBoolean.buscarBooleano(ip_parametros.getIs_diligenciaReconocimiento());
			if(leb_enumBoolean != null)
				ip_parametros.setIs_diligenciaReconocimiento(leb_enumBoolean.getIs_valorString());
			iee_notariaDestino = iieeb_entidadEspecial.consultarEntidadEspecialCodigo(ip_parametros.getIs_notariaOrigen());
			iee_notariaActual = UtilidadUsuarioSesion.usuarioSesion().getIee_entidadEspecial();
			is_notificaciones = formatearNotificaciones(ip_parametros.getIln_notificaciones());
			
		}
		catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
			redireccionarPaginaInicio();
		}

	}

	/**
	 * Metodo que carga parametros de la solicitud a revisar
	 */
	private void cargarParametrosSolicitud() {
		// Recibo los parametros del enlace
		HttpServletRequest lhsr_solicitud = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
		is_idPoder = lhsr_solicitud.getParameter(EnumParametrosURL.INDENTIFICADOR_PODER.getIs_nombreParametro());
		is_idVersionPoder = lhsr_solicitud.getParameter(EnumParametrosURL.VERSION_PODER.getIs_nombreParametro());

		if (!validarParametrosSolicitud(is_idVersionPoder, is_idPoder)) {
			CL_LOGGER.info(EnumMensajesLog.URL_INCORRECTA.getIs_criterio());
			redireccionarPaginaInicio();
		}

	}

	/**
	 * Metodo que redirecciona al inicio
	 */
	public void redireccionarPaginaInicio() {
		FacesContext lfc_facesContext = FacesContext.getCurrentInstance();
		String ls_url = "";
		ls_url = EnumURLRutas.URL_INICIO.getIs_url();
		try {
			FacesContext.getCurrentInstance().getExternalContext()
			.redirect(lfc_facesContext.getExternalContext().getApplicationContextPath() + ls_url);
		} catch (Exception ae_excepcion) {
			CL_LOGGER.error(ae_excepcion);
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}

	}

	/**
	 * Metodo que permite validar los parametros de una solicitud
	 * @param as_idVersionPoder parametro de consulta
	 * @param as_idPoder identificador del poder
	 * @return Boolean del estado
	 */
	private Boolean validarParametrosSolicitud(String as_idVersionPoder, String as_idPoder) {
		return (as_idVersionPoder != null && !as_idVersionPoder.isEmpty() && as_idPoder != null && !as_idPoder.isEmpty());
	}

	/**
	 * Metodo que reorganiza las notificaciones creadas
	 * @param aln_notificaciones
	 * @return String con las notificaciones
	 */
	private String formatearNotificaciones(List<NotificacionWSDTO> aln_notificaciones) {

		StringBuilder lsb_notificaciones = new StringBuilder();

		if (aln_notificaciones != null && !aln_notificaciones.isEmpty()) {
			aln_notificaciones.forEach(ls_notificacion -> 
				lsb_notificaciones
				.append(ls_notificacion.getIs_fecha())
				.append(":")
				.append(ls_notificacion.getIs_nombreNotaria())
				.append(":")
				.append(ls_notificacion.getIs_did())
				.append(":")		
				.append("\n")
				.append(ls_notificacion.getIs_notificacion())
				.append(CS_SEPARADOR_OBSERVACION)
			);
		}	

		return lsb_notificaciones.toString();
	}

	/**
	 * Metodo que guarda cambios en el poder
	 */
	public void guardarCambios() {
		try {

			List<ParametroWSDTO> llp_parametros = new ArrayList<>();
			
			if (ip_parametros.getIln_notificaciones()==null || ip_parametros.getIln_notificaciones().isEmpty()) {
				ip_parametros.setIln_notificaciones(new ArrayList<NotificacionWSDTO>());				
			}

			ip_parametros.getIln_notificaciones().add(generarNotificacionNueva());
			
			llp_parametros.add(ip_parametros);

			iteamp_tipoEntradaMetadatosPoder.setIlp_parametros(llp_parametros);
			iteamp_tipoEntradaMetadatosPoder.setIs_sistemaOrigen(EnumCriterio.CANAL_ORIGEN.getIs_criterio());
			iteamp_tipoEntradaMetadatosPoder.setIs_dDocName(is_idPoder + "-" + is_idVersionPoder);

			TipoSalidaActualizarMetadatosPoderWSDTO lsamp_tipoSalidaActualizarMetadatosPoderWSDTO = iipb_poderBusinessWS.actualizarMetadataPoder(iteamp_tipoEntradaMetadatosPoder);

			Boolean lb_estadoActualizacion = lsamp_tipoSalidaActualizarMetadatosPoderWSDTO.getIi_codigoMensaje()
					.equals(new Integer(EnumCodigosRespuestas.CODIGO_200.getIs_codigo()));

			if (lb_estadoActualizacion) {
				
				EntidadEspecialDTO llee_entidadEspecialSolicitante = UtilidadUsuarioSesion.usuarioSesion().getIee_entidadEspecial();	
				
				ActualizacionPoderCorreoDTO lapc_actualizacionPoderCorreo = new ActualizacionPoderCorreoDTO();
				
				lapc_actualizacionPoderCorreo.setIs_identificacionDestino(ip_parametros.getIs_notariaOrigen());
				lapc_actualizacionPoderCorreo.setIs_identificacionOrigen(llee_entidadEspecialSolicitante.getIs_id());
				lapc_actualizacionPoderCorreo.setIs_nombreDestino(iee_notariaDestino.getIs_nombreEntidadExterna());
				lapc_actualizacionPoderCorreo.setIs_nombreOrigen(iee_notariaActual.getIs_nombreEntidadExterna());
				lapc_actualizacionPoderCorreo.setIs_identificacionTipoSolicitud(is_idPoder + "-" + is_idVersionPoder);
				lapc_actualizacionPoderCorreo.setIs_observaciones(is_notificacion);
				lapc_actualizacionPoderCorreo.setIs_tipoSolicitud(EnumTiposSolicitudesPoderes.NOTIFICACION.getIs_nombre());
				
				lapc_actualizacionPoderCorreo.setIs_correoDestino(iee_notariaDestino.getIu_usuarioDto().getIs_correoElectronico());				
				
				//Se envia correo electronico a la entidad origen
				iipb_poderesBusiness.notificarActualizacionNotariaOrigen(lapc_actualizacionPoderCorreo);
				
				PrimeFaces lpf_current = PrimeFaces.current();
				GeneradorGrowlGenerico.generarMensajeExitoso(EnumMensajesSolicitudesInternas.NOTIFICACION_GUARDAD_EXITO);
				lpf_current.executeScript("PF('confirmacionNotificacionCreada').show()");

			} else {
				throw new ExcepcionesDatosEntrada(EnumExcepcionesPoder.ERROR_DATOS_NO_ACTUALIZADO);
			}

		} catch (Exception ae_excepcion) {
			CL_LOGGER.error(ae_excepcion);
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo que genera una notificacion nueva
	 * @return NotificacionWSDTO
	 */
	private NotificacionWSDTO generarNotificacionNueva() {

		if ( is_notificacion == null || is_notificacion.isEmpty()) 
			throw new ExcepcionesDatosEntrada(EnumExcepcionesGenerales.DATOS_REQUERIDOS);

		NotificacionWSDTO ln_notificacion = new NotificacionWSDTO();
		ln_notificacion.setIs_fecha(UtilidadFecha.formatearFecha(new Date()));
		ln_notificacion.setIs_fecha(ln_notificacion.getIs_fecha());
		ln_notificacion.setIs_did(is_idVersionPoder);
		ln_notificacion.setIs_notificacion(is_notificacion);
		ln_notificacion.setIs_nombreNotaria(iee_notariaActual.getIs_nombreEntidadExterna());

		return ln_notificacion;
	}


	public TipoEntradaActualizarMetadatosPoderWSDTO getIteamp_tipoEntradaMetadatosPoder() {
		return iteamp_tipoEntradaMetadatosPoder;
	}

	public void setIteamp_tipoEntradaMetadatosPoder(
			TipoEntradaActualizarMetadatosPoderWSDTO ateamp_tipoEntradaMetadatosPoder) {
		this.iteamp_tipoEntradaMetadatosPoder = ateamp_tipoEntradaMetadatosPoder;
	}

	public String getIs_idPoder() {
		return is_idPoder;
	}

	public void setIs_idPoder(String as_idPoder) {
		this.is_idPoder = as_idPoder;
	}

	public String getIs_idVersionPoder() {
		return is_idVersionPoder;
	}

	public void setIs_idVersionPoder(String as_idVersionPoder) {
		this.is_idVersionPoder = as_idVersionPoder;
	}

	public String getIs_notificaciones() {
		return is_notificaciones;
	}

	public void setIs_notificaciones(String as_notificaciones) {
		this.is_notificaciones = as_notificaciones;
	}

	public String getIs_notificacion() {
		return is_notificacion;
	}

	public void setIs_notificacion(String as_notificacion) {
		this.is_notificacion = as_notificacion;
	}

	public ParametroWSDTO getIp_parametros() {
		return ip_parametros;
	}

	public void setIp_parametros(ParametroWSDTO ap_parametros) {
		this.ip_parametros = ap_parametros;
	}

	public EntidadEspecialDTO getIee_notariaDestino() {
		return iee_notariaDestino;
	}

	public void setIee_notariaDestino(EntidadEspecialDTO aee_notariaDestino) {
		this.iee_notariaDestino = aee_notariaDestino;
	}

	public EntidadEspecialDTO getIee_notariaActual() {
		return iee_notariaActual;
	}

	public void setIee_notariaActual(EntidadEspecialDTO aee_notariaActual) {
		this.iee_notariaActual = aee_notariaActual;
	}


}
