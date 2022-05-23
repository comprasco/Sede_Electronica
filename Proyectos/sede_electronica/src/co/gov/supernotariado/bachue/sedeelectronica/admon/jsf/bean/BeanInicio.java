/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BeanInicio.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean
 * Nombre del elemento: BeanInicio
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean;

import java.io.IOException;
import java.io.Serializable;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IAsociacionUsuarioEntidadEspecialBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IAsociacionUsuarioPersonaJuridicaBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICatalogoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IConveniosBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IDepartamentoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IDetalleCatalogoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IIntegracionTemporalBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IMunicipioBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IPaisBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IParametroBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IRolPermisoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IUsuarioBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.AsociacionUsuarioPersonaJuridicaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioSesionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.AsociacionUsuarioPersonaJuridicaHelper;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumBoolean;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumExtension;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumParametros;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumParametrosURL;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumRol;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoExcepciones;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.EnumMensajesGenerales;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesInicioSesion;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.BeansLocales;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.GeneradorGrowlGenerico;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.LenguajeUtilidad;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadAutoridadUsuario;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadExcepciones;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadSeguridad;

/**
 * Clase tipo managed bean de la capa de UI (User Interface). <br>
 * Manipula operaciones y propiedades que permiten manejar <br>
 * la visualizacion de componentes JSF para Inicio.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@ManagedBean(name = "beanInicio")
@ViewScoped
public class BeanInicio implements Serializable {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Define la constante CS_MODIFICAR_CONTRASENA_USUARIO.
	 */
	private static final String CS_MODIFICAR_CONTRASENA_USUARIO = "modificarContrasenaUsuario";

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * confirmacion incio sesion.
	 */
	private String is_confirmacionIncioSesion;
	
	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad
	 * autenticado.
	 */
	private Boolean ib_autenticado;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad url
	 * cierre sesion.
	 */
	private String is_urlCierreSesion;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * encabezado.
	 */
	private String is_encabezado;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * cuerpo.
	 */
	private String is_cuerpo;
	
	/**
	 * Atributo de instancia tipo entero para definir la propiedad tiempo sesion.
	 */
	private Integer ii_tiempoSesion;
	
	/**
	 * Atributo de instancia tipo UsuarioSesionDTO para definir la propiedad usuario
	 * session.
	 */
	private UsuarioSesionDTO ius_usuarioSessionDto;

	/**
	 * Atributo de instancia tipo IUsuarioBusiness para definir la propiedad usuario
	 * business.
	 */
	@EJB
	private IUsuarioBusiness iiu_usuarioBusiness;
	
	/**
	 * Atributo de instancia tipo IPaisBusiness para definir la propiedad pais
	 * business.
	 */
	@EJB
	private IPaisBusiness iip_paisBusiness;
	
	/**
	 * Atributo de instancia tipo IDepartamentoBusiness para definir la propiedad
	 * departamento business.
	 */
	@EJB
	private IDepartamentoBusiness iid_departamentoBusiness;
	
	/**
	 * Atributo de instancia tipo IMunicipioBusiness para definir la propiedad
	 * municipio business.
	 */
	@EJB
	private IMunicipioBusiness iim_municipioBusiness;
	
	/**
	 * Atributo de instancia tipo IRolPermisoBusiness para definir la propiedad rol
	 * permiso business.
	 */
	@EJB
	private IRolPermisoBusiness iirp_rolPermisoBusiness;
	
	/**
	 * Atributo de instancia tipo IParametroBusiness para definir la propiedad
	 * parametros business.
	 */
	@EJB
	private IParametroBusiness iipb_parametrosBusiness;
	
	/**
	 * Atributo de instancia tipo IIntegracionTemporalBusiness para definir la
	 * propiedad integracion temporal business.
	 */
	@EJB
	private IIntegracionTemporalBusiness iiit_integracionTemporalBusiness;
	
	/**
	 * Atributo de instancia tipo ICatalogoBusiness para definir la propiedad
	 * catalogo business.
	 */
	@EJB
	private ICatalogoBusiness iic_catalogoBusiness;
	
	/**
	 * Atributo de instancia tipo IDetalleCatalogoBusiness para definir la propiedad
	 * detalle catalogo business.
	 */
	@EJB
	private IDetalleCatalogoBusiness iidc_detalleCatalogoBusiness;
	
	/**
	 * Atributo de instancia tipo IAsociacionUsuarioEntidadEspecialBusiness para
	 * definir la propiedad asociacion usuario entidad especial business.
	 */
	@EJB
	private IAsociacionUsuarioEntidadEspecialBusiness iiauee_asociacionUsuarioEntidadEspecialBusiness;
	
	/**
	 * Atributo de instancia tipo IConveniosBusiness para definir la propiedad
	 * convenio business.
	 */
	@EJB
	private IConveniosBusiness iicb_convenio;
	
	/**
	 * Metodo que inicializa y valida datos del usuario en sesion, tambien
	 * inicializa todos los mensajes de inicio de sesion.
	 */
	public void inicio() {

		FacesContext lfc_contexto = FacesContext.getCurrentInstance();
		String ls_rutaSolicitud = FacesContext.getCurrentInstance().getViewRoot().getViewId();

		if (!UtilidadSeguridad.validarAccesoLibre(ls_rutaSolicitud)) {

			Authentication la_autenticacion = SecurityContextHolder.getContext().getAuthentication();
			is_urlCierreSesion = UtilidadSeguridad.manejadorInicioSesionURL(la_autenticacion).substring(1);

			UsuarioSesionDTO lu_usuario = UtilidadAutoridadUsuario.consultarUsuarioSesion();

			if (Objects.isNull(lu_usuario)) {
				lu_usuario = new UsuarioSesionDTO();
				lu_usuario.setIs_rol(UtilidadAutoridadUsuario.consultarRolActual());
				iiu_usuarioBusiness.actualizarUsuarioSesionCache(lu_usuario);
			} else if (!lu_usuario.getIs_rol().equals(UtilidadAutoridadUsuario.consultarRolActual())) {
				lu_usuario.setIs_rol(UtilidadAutoridadUsuario.consultarRolActual());
				iiu_usuarioBusiness.actualizarUsuarioSesionCache(lu_usuario);
			}

			HttpServletRequest lhsr_solicitud = (HttpServletRequest) FacesContext.getCurrentInstance()
					.getExternalContext().getRequest();
			is_confirmacionIncioSesion = lhsr_solicitud
					.getParameter(EnumParametrosURL.CONFIRMACION_SESION.getIs_nombreParametro());
			lhsr_solicitud.removeAttribute(EnumParametrosURL.CONFIRMACION_SESION.getIs_nombreParametro());

			if (is_confirmacionIncioSesion != null
					&& is_confirmacionIncioSesion.equalsIgnoreCase(EnumBoolean.CHAR_S.getIs_valorString())) {

				String ls_mensaje = UtilidadExcepciones.consultarExcepcion(EnumExcepcionesInicioSesion.SESION_INICIADA,
						new String[] { EnumRol.consultarRol(UtilidadAutoridadUsuario.consultarRolActual())
								.consultarIs_nombreLegible() },
						LenguajeUtilidad.consultarIdioma(), EnumTipoExcepciones.VALIDACION_NEGOCIO);
				GeneradorGrowlGenerico.generarMensajeExitoso(ls_mensaje);
				is_confirmacionIncioSesion = null;

			}
			validarLabelUsuarioInicio(lu_usuario);
			if (!lu_usuario.getIs_rol().equals(EnumRol.SUPER_ADMIN.getIs_rol())
					&& lu_usuario.getIb_expiracionContrasena()
					&& !ls_rutaSolicitud.contains(CS_MODIFICAR_CONTRASENA_USUARIO)) {
				try {
					lfc_contexto.getExternalContext()
							.redirect(CS_MODIFICAR_CONTRASENA_USUARIO
									+ EnumExtension.JSF.getIs_extension()
									+ EnumParametrosURL.ALERTA_PARAMETRO.getIs_nombreParametro()
									+ EnumBoolean.CHAR_S.getIs_valorString());
				} catch (IOException aioe_excepcion) {
					GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(aioe_excepcion);
				}
			}

		}

		if (iirp_rolPermisoBusiness.consultarUrl(UtilidadSeguridad.convertirEstandarUrlPermiso(ls_rutaSolicitud))) {
			ib_autenticado = true;
			// Consulta el tiempo de sesion desde la bd
			ii_tiempoSesion = Integer.parseInt(iipb_parametrosBusiness
					.consultarParametro(EnumParametros.TIEMPO_CIERRE_SESION.getIs_nombreParametro()).getIs_valorUi());
			ii_tiempoSesion = (int) TimeUnit.MINUTES.toMillis(ii_tiempoSesion);
		}
	}

	/**
	 * Metodo que permite validar el label de inicio de sesion segun rol ingresado.
	 *
	 * @param aus_usuario usuario en sesion
	 */
	public void validarLabelUsuarioInicio(UsuarioSesionDTO aus_usuario) {
		ius_usuarioSessionDto = UtilidadAutoridadUsuario.consultarUsuarioSesion();
		// Si es usuario natural
		if (aus_usuario.getIs_rol().equals(EnumRol.PERSONA_NATURAL.consultarIs_rol())) {
			is_encabezado = LenguajeUtilidad.consultarMensaje(EnumMensajesGenerales.ENCABEZADO_GENERAL);
			is_cuerpo = EnumRol.PERSONA_NATURAL.consultarIs_nombreLegible();
		}
		// Si es usuario admin juridica
		else if (aus_usuario.getIs_rol().equals(EnumRol.ADMIN_PERSONA_JURIDICA.consultarIs_rol())) {
			is_encabezado = LenguajeUtilidad.consultarMensaje(EnumMensajesGenerales.ENCABEZADO_GENERAL);
			is_cuerpo = LenguajeUtilidad.consultarMensaje(EnumMensajesGenerales.CUERPO_PJ,
					new String[] { aus_usuario.getIs_razonSocial() });
		}
		// Si es usuario asociado a persona juridica
		else if (aus_usuario.getIs_rol().equals(EnumRol.PERSONA_JURIDICA.consultarIs_rol())) {
			IAsociacionUsuarioPersonaJuridicaBusiness liaupj_asociacionUsuarioPersonaJuridicaBusiness = BeansLocales
					.consultarAsociacionUsuarioPersonaJuridica();
			AsociacionUsuarioPersonaJuridicaDTO laupj_asociacionUsuarioPersonaJuridicaDto = AsociacionUsuarioPersonaJuridicaHelper
					.entidadADtoCompleto(liaupj_asociacionUsuarioPersonaJuridicaBusiness
							.consultarPorId(aus_usuario.getIs_idAsociacion()));
			aus_usuario.setIs_razonSocial(
					laupj_asociacionUsuarioPersonaJuridicaDto.getIpj_idPersonaJuridica().getIs_razonSocial());
			is_encabezado = LenguajeUtilidad.consultarMensaje(EnumMensajesGenerales.ENCABEZADO_ASOCIADO_GENERAL);
			is_cuerpo = LenguajeUtilidad.consultarMensaje(EnumMensajesGenerales.CUERPO_ASOCIADO_PJ,
					new String[] { aus_usuario.getIs_razonSocial() });
		}
		// Si es usuario admins ee
		else if (aus_usuario.getIs_rol().equals(EnumRol.EE_TEA.consultarIs_rol())
				|| aus_usuario.getIs_rol().equals(EnumRol.EE_TEJ.consultarIs_rol())
				|| aus_usuario.getIs_rol().equals(EnumRol.EE_TEE.consultarIs_rol())
				|| aus_usuario.getIs_rol().equals(EnumRol.EE_TEGE.consultarIs_rol())) {
			is_encabezado = LenguajeUtilidad.consultarMensaje(EnumMensajesGenerales.ENCABEZADO_EE,
					new String[] { aus_usuario.getIs_nombreUsuario() });
			is_cuerpo = LenguajeUtilidad.consultarMensaje(EnumMensajesGenerales.CUERPO_EE_GENERAL,
					new String[] { aus_usuario.getIs_razonSocial() });

		}
		// Si es usuario asociados ee
		else if (aus_usuario.getIs_rol().equals(EnumRol.EE_PN.consultarIs_rol())) {
			String ls_convenio = iicb_convenio.consultarConvenioCache();
			is_encabezado = LenguajeUtilidad.consultarMensaje(EnumMensajesGenerales.ENCABEZADO_ASOCIADO_GENERAL);
			is_cuerpo = LenguajeUtilidad.consultarMensaje(EnumMensajesGenerales.CUERPO_EE_CONVENIO,
					new String[] { ls_convenio });

		}
		// Si es usuario admins sistema
		else if (aus_usuario.getIs_rol().equals(EnumRol.SUPER_ADMIN.consultarIs_rol())
				|| aus_usuario.getIs_rol().equals(EnumRol.ADMIN_NEGOCIO.consultarIs_rol())
				|| aus_usuario.getIs_rol().equals(EnumRol.ADMIN_TECNICO.consultarIs_rol())) {

			is_encabezado = LenguajeUtilidad.consultarMensaje(EnumMensajesGenerales.ENCABEZADO_GENERAL);
			is_cuerpo = EnumRol.consultarRol(aus_usuario.getIs_rol()).getIs_nombreLegible();
		}
	}

	/**
	 * Obtiene el valor para la propiedad confirmacion incio sesion.
	 *
	 * @return El valor de la propiedad confirmacion incio sesion
	 */
	public String getIs_confirmacionIncioSesion() {
		return is_confirmacionIncioSesion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad confirmacion incio sesion.
	 *
	 * @param as_confirmacionIncioSesion el nuevo valor para la propiedad
	 *                                   confirmacion incio sesion
	 */
	public void setIs_confirmacionIncioSesion(String as_confirmacionIncioSesion) {
		this.is_confirmacionIncioSesion = as_confirmacionIncioSesion;
	}

	/**
	 * Obtiene el valor para la propiedad url cierre sesion.
	 *
	 * @return El valor de la propiedad url cierre sesion
	 */
	public String getIs_urlCierreSesion() {
		return is_urlCierreSesion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad url cierre sesion.
	 *
	 * @param as_urlCierreSesion el nuevo valor para la propiedad url cierre sesion
	 */
	public void setIs_urlCierreSesion(String as_urlCierreSesion) {
		this.is_urlCierreSesion = as_urlCierreSesion;
	}

	/**
	 * Obtiene el valor para la propiedad usuario.
	 *
	 * @return El valor de la propiedad usuario
	 */
	public IUsuarioBusiness getIu_usuario() {
		return iiu_usuarioBusiness;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad usuario.
	 *
	 * @param au_usuario el nuevo valor para la propiedad usuario
	 */
	public void setIu_usuario(IUsuarioBusiness au_usuario) {
		this.iiu_usuarioBusiness = au_usuario;
	}

	/**
	 * Obtiene el valor para la propiedad autenticado.
	 *
	 * @return El valor de la propiedad autenticado
	 */
	public Boolean getIb_autenticado() {
		return ib_autenticado;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad autenticado.
	 *
	 * @param ab_autenticado el nuevo valor para la propiedad autenticado
	 */
	public void setIb_autenticado(Boolean ab_autenticado) {
		this.ib_autenticado = ab_autenticado;
	}

	/**
	 * Obtiene el valor para la propiedad encabezado.
	 *
	 * @return El valor de la propiedad encabezado
	 */
	public String getIs_encabezado() {
		return is_encabezado;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad encabezado.
	 *
	 * @param as_encabezado el nuevo valor para la propiedad encabezado
	 */
	public void setIs_encabezado(String as_encabezado) {
		this.is_encabezado = as_encabezado;
	}

	/**
	 * Obtiene el valor para la propiedad cuerpo.
	 *
	 * @return El valor de la propiedad cuerpo
	 */
	public String getIs_cuerpo() {
		return is_cuerpo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad cuerpo.
	 *
	 * @param as_cuerpo el nuevo valor para la propiedad cuerpo
	 */
	public void setIs_cuerpo(String as_cuerpo) {
		this.is_cuerpo = as_cuerpo;
	}

	/**
	 * Obtiene el valor para la propiedad tiempo sesion.
	 *
	 * @return El valor de la propiedad tiempo sesion
	 */
	public Integer getIi_tiempoSesion() {
		return ii_tiempoSesion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tiempo sesion.
	 *
	 * @param ai_tiempoSesion el nuevo valor para la propiedad tiempo sesion
	 */
	public void setIi_tiempoSesion(Integer ai_tiempoSesion) {
		this.ii_tiempoSesion = ai_tiempoSesion;
	}

	/**
	 * Obtiene el valor para la propiedad usuario session dto.
	 *
	 * @return El valor de la propiedad usuario session dto
	 */
	public UsuarioSesionDTO getIus_usuarioSessionDto() {
		return ius_usuarioSessionDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad usuario session dto.
	 *
	 * @param aus_usuarioSessionDto el nuevo valor para la propiedad usuario session
	 *                              dto
	 */
	public void setIus_usuarioSessionDto(UsuarioSesionDTO aus_usuarioSessionDto) {
		this.ius_usuarioSessionDto = aus_usuarioSessionDto;
	}

}
