/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BeanRecuperacionClave.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean
 * Nombre del elemento: BeanRecuperacionClave
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean;

import java.io.IOException;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.event.ComponentSystemEvent;

import org.jboss.logging.Logger;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesNegocio;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IHistoricoClaveBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IParametroBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ISolicitudRecuperacionClaveBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoProcesoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IUsuarioBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.HistoricoClaveDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ParametroDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.SolicitudRecuperacionClaveDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumBoolean;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumParametros;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoEstadoCuenta;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoProceso;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesRecuperarContrasena;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.GeneradorGrowlGenerico;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadContrasenaValidacion;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadSeguridad;

/**
 * Clase tipo managed bean de la capa de UI (User Interface). <br>
 * Manipula operaciones y propiedades que permiten manejar <br>
 * la visualizacion de componentes JSF para Recuperacion clave.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@ManagedBean(name = "beanRecuperacionClave")
@ViewScoped
public class BeanRecuperacionClave implements Serializable {

	/**
	 * Define la constante CL_LOGGER.
	 */
	static final Logger CL_LOGGER = Logger.getLogger(BeanRecuperacionClave.class);
	
	/**
	 * Generated serial version.
	 */
	private static final long serialVersionUID = -1395721233302068636L;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * msg.
	 */
	private String is_msg;

	/**
	 * Atributo de instancia tipo ISolicitudRecuperacionClaveBusiness para definir
	 * la propiedad solicitud recuperacion clave business.
	 */
	@EJB
	private ISolicitudRecuperacionClaveBusiness iisrc_solicitudRecuperacionClaveBusiness;

	/**
	 * Atributo de instancia tipo IParametroBusiness para definir la propiedad
	 * parametro business.
	 */
	@EJB
	private IParametroBusiness iipb_parametroBusiness;

	/**
	 * Atributo de instancia tipo IUsuarioBusiness para definir la propiedad usuario
	 * business.
	 */
	@EJB
	private IUsuarioBusiness iiub_usuarioBusiness;

	/**
	 * Atributo de instancia tipo ITipoProcesoBusiness para definir la propiedad
	 * tipo proceso business.
	 */
	@EJB
	private ITipoProcesoBusiness iitpb_tipoProcesoBusiness;
	
	/**
	 * Atributo de instancia tipo IHistoricoClaveBusiness para definir la propiedad
	 * historico clave business.
	 */
	@EJB
	private IHistoricoClaveBusiness iihc_historicoClaveBusiness;

	/**
	 * Atributo de instancia tipo SolicitudRecuperacionClaveDTO para definir la
	 * propiedad solicitud recuperacion clave.
	 */
	private SolicitudRecuperacionClaveDTO isrc_solicitudRecuperacionClaveDto;

	/**
	 * Atributo de instancia tipo HistoricoClaveDTO para definir la propiedad
	 * historico clave.
	 */
	private HistoricoClaveDTO ihc_historicoClaveDTO;
	
	/**
	 * Atributo de instancia tipo Map con claves String y valores Integer para
	 * definir la propiedad mapa parametros.
	 */
	private Map<String, Integer> imsi_mapaParametros;

	/**
	 * Atributo de instancia tipo ResourceBundle para definir la propiedad bundle
	 * exc recuperar contrasena.
	 */
	@ManagedProperty(value = "#{txt_excepcion_recuperar_contrasena}")
	private transient ResourceBundle irb_bundleExcRecuperarContrasena;

	/**
	 * Inicializa el objeto.
	 */
	@PostConstruct
	public void init() {
		this.setIsrc_solicitudRecuperacionClaveDto(new SolicitudRecuperacionClaveDTO());
		this.setIhc_historicoClaveDTO(new HistoricoClaveDTO());
		obtenerParametrosValidacionContrasena();
	}

	/**
	 * Metodo que se encarga de consultar .
	 *
	 * @return Resultado para obtener parametros validacion contrasena retornado
	 *         como Map (String, Integer)
	 */
	private Map<String, Integer> obtenerParametrosValidacionContrasena() {

		Map<String, Integer> lmsi_mapaParametros = new HashMap<>();

		try {
			List<ParametroDTO> llpd_listaParametroDto = this.iipb_parametroBusiness
					.consultarParametrosPorTipoProceso(EnumTipoProceso.SEGURIDAD);

			if (llpd_listaParametroDto != null && !llpd_listaParametroDto.isEmpty()) {
				for (ParametroDTO parametroDTO : llpd_listaParametroDto) {
					lmsi_mapaParametros.put(parametroDTO.getIs_codigoParametro(),
							Integer.parseInt(parametroDTO.getIs_valorUi()));
				}
			}
		} catch (Exception ae_exception) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_exception);
		}
		imsi_mapaParametros = lmsi_mapaParametros; 
		return lmsi_mapaParametros;
	}

	/**
	 * Es formato valido.
	 *
	 * @param as_contrasena el parametro contrasena
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	public Boolean esFormatoValido(String as_contrasena) {
		Map<String, Integer> lm_mapaParametros = obtenerParametrosValidacionContrasena();
		Boolean lb_estado; 

		lb_estado = !(as_contrasena.length() < lm_mapaParametros.get(EnumParametros.LONGITUD_MINIMA_CLAVE.getIs_nombreParametro()) || 
				as_contrasena.length() > lm_mapaParametros.get(EnumParametros.LONGITUD_MAXIMA_CLAVE.getIs_nombreParametro()) ||
				UtilidadContrasenaValidacion.contadorMinusculas(as_contrasena) < lm_mapaParametros.get(EnumParametros.CANTIDAD_MINIMA_MINUSCULAS_CLAVE.getIs_nombreParametro()) ||
				UtilidadContrasenaValidacion.contadorMayusculas(as_contrasena) < lm_mapaParametros.get(EnumParametros.CANTIDAD_MINIMA_MAYUSCULAS_CLAVE.getIs_nombreParametro()) || 
				UtilidadContrasenaValidacion.contadorCaracteresEspeciales(as_contrasena) < lm_mapaParametros.get(EnumParametros.CANTIDAD_MINIMA_CARACTERES_ESPECIALES_CLAVE.getIs_nombreParametro()));

		return lb_estado;
	}

	/**
	 * Se encarga de validar la creacion de la nueva clave del usuario pendiente por
	 * ajuste de if anidados .
	 *
	 * @throws IOException Indica que una I/O exception ha occurrido.
	 */
	public void validarClaveUsuario() throws IOException {
		SolicitudRecuperacionClaveDTO lsrc_solicitudRecuperacionClaveDto;
		FacesContext lfc_facesContext = FacesContext.getCurrentInstance();
		ExternalContext lec_externalContext = lfc_facesContext.getExternalContext();
		ParametroDTO lp_parametroDTO = null;
		try {
			if(!(this.isrc_solicitudRecuperacionClaveDto.getIs_codigo() != null
					&& esFormatoValido(getIsrc_solicitudRecuperacionClaveDto().getIs_clave())))
			{
				is_msg = irb_bundleExcRecuperarContrasena.getString("clave.formato.no.valido");
				throw new ExcepcionesNegocio(EnumExcepcionesRecuperarContrasena.CLAVE_FORMATO_NO_VALIDO);
			}
			lsrc_solicitudRecuperacionClaveDto = iisrc_solicitudRecuperacionClaveBusiness.consultaUsuariosRecuperacionClave(this.isrc_solicitudRecuperacionClaveDto.getIs_codigo());
			if(!(isrc_solicitudRecuperacionClaveDto.getIs_claveGenerica() != null && lsrc_solicitudRecuperacionClaveDto.getId_fechaSolicitud() != null &&
						lsrc_solicitudRecuperacionClaveDto.getId_fechaCierreSolicitud() != null))
			{
				is_msg = irb_bundleExcRecuperarContrasena.getString("clave.generica.no.coincide");
				throw new ExcepcionesNegocio(EnumExcepcionesRecuperarContrasena.CLAVE_GENERICA_NO_COINCIDE);
			}
			if(!UtilidadSeguridad.validarContrasena(isrc_solicitudRecuperacionClaveDto.getIs_claveGenerica(), lsrc_solicitudRecuperacionClaveDto.getIs_claveTemporal()))
			{
				is_msg = irb_bundleExcRecuperarContrasena.getString("clave.generica.no.coincide");
				throw new ExcepcionesNegocio(EnumExcepcionesRecuperarContrasena.CLAVE_GENERICA_NO_COINCIDE);
			}
			if(!(isrc_solicitudRecuperacionClaveDto.getIs_clave()
								.equals(isrc_solicitudRecuperacionClaveDto.getIs_claveConfirmacion()))){
				is_msg = irb_bundleExcRecuperarContrasena.getString("clave.no.coincide");
				throw new ExcepcionesNegocio(EnumExcepcionesRecuperarContrasena.CLAVE_NO_COINCIDE);
			}
			lp_parametroDTO = iipb_parametroBusiness.consultarParametro(
					EnumParametros.VIGENCIA_CLAVE_RECUPERACION.getIs_nombreParametro());
			validarParametro(lsrc_solicitudRecuperacionClaveDto, lec_externalContext, lp_parametroDTO);
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Método que permite validar el parametro para creación de nueva clave de
	 * usuario.
	 *
	 * @param asrc_solicitudRecuperacionClaveDto el parametro solicitud recuperacion
	 *                                           clave dto
	 * @param aec_externalContext                el parametro external context
	 * @param ap_parametroDTO                    el parametro parametro DTO
	 * @throws IOException Indica que una I/O exception ha occurrido.
	 */
	private void validarParametro(SolicitudRecuperacionClaveDTO asrc_solicitudRecuperacionClaveDto,
			ExternalContext aec_externalContext, ParametroDTO ap_parametroDTO) throws IOException {
		UsuarioDTO lud_usuarioDTO;
		if (ap_parametroDTO != null) {
			int li_parametroVencimientoClave = Integer
					.parseInt(ap_parametroDTO.getIs_valor());
			Boolean lb_validaVencimientoClaveGenerica = numeroHorasEntreDosFechas(
					asrc_solicitudRecuperacionClaveDto.getId_fechaSolicitud(), new Date(), li_parametroVencimientoClave);
			if (lb_validaVencimientoClaveGenerica) {
				// Setean valores a isrc_solicitudRecuperacionClaveDto

				// Setean valores a usuarioDTO
				// Actualiza hash usuario

				lud_usuarioDTO = iiub_usuarioBusiness.consultarUsuario(asrc_solicitudRecuperacionClaveDto.getIu_usuarioDto().getIs_usuario());
				Integer li_valorRecuperacionClave = imsi_mapaParametros.get(EnumParametros.NUMERO_CLAVES_DESPUES_REUTILIZAR.getIs_nombreParametro());
				List<HistoricoClaveDTO> llhc_historicoClaveDto = iihc_historicoClaveBusiness.consultarCantidadHistorialClaveUsuario(lud_usuarioDTO, li_valorRecuperacionClave);
				for(HistoricoClaveDTO lhc_historicoClaveDto: llhc_historicoClaveDto)
				{
					if(UtilidadSeguridad.validarContrasena(isrc_solicitudRecuperacionClaveDto.getIs_claveConfirmacion(),lhc_historicoClaveDto.getIs_claveHash()))
						throw new ExcepcionesNegocio(EnumExcepcionesRecuperarContrasena.CLAVE_REPETIDO, new String[] {li_valorRecuperacionClave.toString()});
				}
				
				lud_usuarioDTO.setIs_claveHash(UtilidadSeguridad.encriptarTexto(
						isrc_solicitudRecuperacionClaveDto.getIs_claveConfirmacion()));
				lud_usuarioDTO.setIi_intentosFallidosAcceso(0);
				if (lud_usuarioDTO.getItec_tipoEstadoCuentaDto().getIs_id().equals(
						EnumTipoEstadoCuenta.BLOQUEADO_POR_EL_SISTEMAS.getIs_id())) {
					lud_usuarioDTO.getItec_tipoEstadoCuentaDto()
					.setIs_id(EnumTipoEstadoCuenta.ACTIVO.getIs_id());
				}
				
				// Inserta en la en la tabla autenticacion historico
				this.ihc_historicoClaveDTO
				.setIs_claveHash(lud_usuarioDTO.getIs_claveHash());
				this.ihc_historicoClaveDTO.setIu_usuarioDto(lud_usuarioDTO);
				
				// Actualiza codigo temporal a usado
				this.isrc_solicitudRecuperacionClaveDto
				.setIs_claveTemporalUsada(EnumBoolean.CHAR_S.getIs_codigo());
				this.isrc_solicitudRecuperacionClaveDto
				.setIs_uuidUrlRecuperacion(asrc_solicitudRecuperacionClaveDto.getIs_uuidUrlRecuperacion());
				
				iisrc_solicitudRecuperacionClaveBusiness.actualizarClaveUsuario(lud_usuarioDTO,isrc_solicitudRecuperacionClaveDto,ihc_historicoClaveDTO);

				// Se abre popup de login

				aec_externalContext.redirect(aec_externalContext.getRequestContextPath()
						+ "/pages/personas/confirmacionClave.jsf?faces-redirect=true");
			} else {
				is_msg = irb_bundleExcRecuperarContrasena.getString("clave.expiro");
				throw new ExcepcionesNegocio(EnumExcepcionesRecuperarContrasena.CLAVE_EXPIRO);
			}
		}
	}

	/**
	 * Metodo para sumar horas entre dos fechas.
	 *
	 * @param ad_fechaInicial              el parametro fecha inicial
	 * @param ad_fechaFinal                el parametro fecha final
	 * @param ai_parametroVencimientoClave el parametro parametro vencimiento clave
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	public Boolean numeroHorasEntreDosFechas(Date ad_fechaInicial, Date ad_fechaFinal,
			int ai_parametroVencimientoClave) {

		int li_numeroHoras = 0;
		Boolean lb_validaHoras = false;
		try {
			Calendar lc_calendarFechaInical = Calendar.getInstance();
			Calendar lc_calendarFechaFinal = Calendar.getInstance();

			lc_calendarFechaInical.setTime(ad_fechaInicial);
			lc_calendarFechaFinal.setTime(ad_fechaFinal);

			li_numeroHoras = (lc_calendarFechaFinal.get(Calendar.HOUR_OF_DAY)
					- lc_calendarFechaInical.get(Calendar.HOUR_OF_DAY));
			if (li_numeroHoras <= ai_parametroVencimientoClave) {
				lb_validaHoras = true;
			}

		} catch (Exception ae_exception) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_exception);
		}

		return lb_validaHoras;
	}

	/**
	 * Metodo para sumar minutos entre dos fechas.
	 *
	 * @param ad_dateInicio el parametro date inicio
	 * @param ad_dateFinal  el parametro date final
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	public Boolean numeroMinutosEntreDosFechas(Date ad_dateInicio, Date ad_dateFinal) {

		Boolean lb_valida = false;
		int li_inicial = 0;
		int li_final = 0;

		Calendar lc_fechaInicial = Calendar.getInstance();
		Calendar lc_fechaFinal = Calendar.getInstance();
		lc_fechaInicial.setTime(ad_dateInicio);
		lc_fechaFinal.setTime(ad_dateFinal);
		li_final = (lc_fechaFinal.get(Calendar.MINUTE));
		li_inicial = lc_fechaInicial.get(Calendar.MINUTE);

		if (li_inicial >= li_final) {
			lb_valida = true;

		}
		return lb_valida;

	}

	/**
	 * Metodo que toma el evento del parametro.
	 *
	 * @param acse_event el parametro event
	 */
	public void valorParametro(ComponentSystemEvent acse_event) {

		try {
			if (!FacesContext.getCurrentInstance().isPostback()) {
				isrc_solicitudRecuperacionClaveDto.getIs_keyUrlValidacion();
				CL_LOGGER.debug(acse_event);
			}

		} catch (Exception ae_exception) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_exception);
		}

	}

	/**
	 * Obtiene el valor para la propiedad msg.
	 *
	 * @return El valor de la propiedad msg
	 */
	public String getIs_msg() {
		return is_msg;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad msg.
	 *
	 * @param as_msg el nuevo valor para la propiedad msg
	 */
	public void setIs_msg(String as_msg) {
		this.is_msg = as_msg;
	}

	/**
	 * Obtiene el valor para la propiedad solicitud recuperacion clave business.
	 *
	 * @return El valor de la propiedad solicitud recuperacion clave business
	 */
	public ISolicitudRecuperacionClaveBusiness getIisrc_solicitudRecuperacionClaveBusiness() {
		return iisrc_solicitudRecuperacionClaveBusiness;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad solicitud recuperacion clave
	 * business.
	 *
	 * @param aisrc_solicitudRecuperacionClaveBusiness el nuevo valor para la
	 *                                                 propiedad solicitud
	 *                                                 recuperacion clave business
	 */
	public void setIisrc_solicitudRecuperacionClaveBusiness(
			ISolicitudRecuperacionClaveBusiness aisrc_solicitudRecuperacionClaveBusiness) {
		this.iisrc_solicitudRecuperacionClaveBusiness = aisrc_solicitudRecuperacionClaveBusiness;
	}

	/**
	 * Obtiene el valor para la propiedad solicitud recuperacion clave dto.
	 *
	 * @return El valor de la propiedad solicitud recuperacion clave dto
	 */
	public SolicitudRecuperacionClaveDTO getIsrc_solicitudRecuperacionClaveDto() {
		return isrc_solicitudRecuperacionClaveDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad solicitud recuperacion clave dto.
	 *
	 * @param asrc_solicitudRecuperacionClaveDto el nuevo valor para la propiedad
	 *                                           solicitud recuperacion clave dto
	 */
	public void setIsrc_solicitudRecuperacionClaveDto(
			SolicitudRecuperacionClaveDTO asrc_solicitudRecuperacionClaveDto) {
		this.isrc_solicitudRecuperacionClaveDto = asrc_solicitudRecuperacionClaveDto;
	}

	/**
	 * Obtiene el valor para la propiedad historico clave DTO.
	 *
	 * @return El valor de la propiedad historico clave DTO
	 */
	public HistoricoClaveDTO getIhc_historicoClaveDTO() {
		return ihc_historicoClaveDTO;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad historico clave DTO.
	 *
	 * @param ahc_historicoClaveDTO el nuevo valor para la propiedad historico clave
	 *                              DTO
	 */
	public void setIhc_historicoClaveDTO(HistoricoClaveDTO ahc_historicoClaveDTO) {
		this.ihc_historicoClaveDTO = ahc_historicoClaveDTO;
	}

	/**
	 * Obtiene el valor para la propiedad bundle exc recuperar contrasena.
	 *
	 * @return El valor de la propiedad bundle exc recuperar contrasena
	 */
	public ResourceBundle getIrb_bundleExcRecuperarContrasena() {
		return irb_bundleExcRecuperarContrasena;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad bundle exc recuperar contrasena.
	 *
	 * @param arb_bundleExcRecuperarContrasena el nuevo valor para la propiedad
	 *                                         bundle exc recuperar contrasena
	 */
	public void setIrb_bundleExcRecuperarContrasena(ResourceBundle arb_bundleExcRecuperarContrasena) {
		this.irb_bundleExcRecuperarContrasena = arb_bundleExcRecuperarContrasena;
	}

}
