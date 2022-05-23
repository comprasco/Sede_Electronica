/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ManejadorAutenticacionCompletada.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.security
 * Nombre del elemento: ManejadorAutenticacionCompletada
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.security;

import java.io.IOException;
import java.util.Objects;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IAsociacionUsuarioPersonaJuridicaBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IPersonaJuridicaBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IUsuarioBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.AsociacionUsuarioPersonaJuridicaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PersonaJuridicaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioSesionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumBoolean;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumParametrosURL;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.BeansLocales;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadSeguridad;

/**
 * Clase que maneja la autenticacion por usuario al loguearse.<br>
 * Implementa la interface AuthenticationSuccessHandler del framework spring
 * security
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ManejadorAutenticacionCompletada implements AuthenticationSuccessHandler {

	/**
	 * Define la constante INTENTOS_INICIALES.
	 */
	public static final Integer INTENTOS_INICIALES = 0;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.springframework.security.web.authentication.AuthenticationSuccessHandler#
	 * onAuthenticationSuccess(javax.servlet.http.HttpServletRequest,
	 * javax.servlet.http.HttpServletResponse,
	 * org.springframework.security.core.Authentication)
	 */
	@Override
	public void onAuthenticationSuccess(HttpServletRequest ahsr_solicitud, HttpServletResponse ahsr_respuesta,
			Authentication aa_autenticacion) throws IOException, ServletException {
		
		RedirectStrategy lrs_estrategiaRedireccion = new DefaultRedirectStrategy();

		String ls_documento = ahsr_solicitud.getParameter(EnumParametrosURL.NUMERO_DOCUMENTO.getIs_nombreParametro());
		String ls_tipoPersona = ahsr_solicitud
				.getParameter(EnumParametrosURL.TIPO_PERSONA_SELECT.getIs_nombreParametro());
		String ls_entidadEspecial = ahsr_solicitud.getParameter(EnumParametrosURL.ENTIDAD.getIs_nombreParametro());
		IPersonaJuridicaBusiness lipj_personaBusiness = BeansLocales.consultarPersonaJuridicaBusiness();

		IUsuarioBusiness lirb_usuarioBusiness = BeansLocales.consultarUsuarioBusiness();
		UsuarioDTO lu_usuarioDto = lirb_usuarioBusiness.consultarUsuario(aa_autenticacion.getName());
		UsuarioSesionDTO lus_usuarioDto = lirb_usuarioBusiness.consultarUsuarioSesion(aa_autenticacion.getName());

		// Si es persona juridica consulto razon social
		if (!Objects.isNull(ls_documento)
				&& ls_tipoPersona.equals(EnumParametrosURL.PERSONA_JURIDICA.getIs_nombreParametro())) {
			PersonaJuridicaDTO lpj_personaJuridicaDto = lipj_personaBusiness.consultarPersonaJuridica(ls_documento);
			lus_usuarioDto.setIs_razonSocial(lpj_personaJuridicaDto.getIs_razonSocial());
			if (lu_usuarioDto.getIpj_personaJuridicaDto() == null) {
				IAsociacionUsuarioPersonaJuridicaBusiness liaupj_asociacionUsuarioPersonaJuridicaBusiness = BeansLocales
						.consultarAsociacionPersonaJuridicaBusiness();
				AsociacionUsuarioPersonaJuridicaDTO laupj_asociacionUsuarioPersonaJuridica = liaupj_asociacionUsuarioPersonaJuridicaBusiness
						.consultarAsociacion(lu_usuarioDto.getIs_id(),
								lpj_personaJuridicaDto.getIp_personaDto().getIs_numeroDocumento());
				lus_usuarioDto.setIs_idAsociacion(laupj_asociacionUsuarioPersonaJuridica.getIs_idAsociacion());
			}
		}

		// Si es persona juridica consulto razon social
		if (!Objects.isNull(ls_entidadEspecial)) {
			lus_usuarioDto.setIs_entidadEspecial(ls_entidadEspecial);
			lus_usuarioDto.setIs_convenio(ls_entidadEspecial);
		}

		if (lu_usuarioDto != null) {
			lu_usuarioDto.setIi_intentosFallidosAcceso(INTENTOS_INICIALES);
			lirb_usuarioBusiness.actualizaUsuario(lu_usuarioDto);
		}

		lirb_usuarioBusiness.agregarUsuarioCache(lus_usuarioDto);
		String ls_enlace = UtilidadSeguridad.manejadorPostInicioSesionURL(aa_autenticacion);

		if (ahsr_respuesta.isCommitted()) {
			return;
		}

		lrs_estrategiaRedireccion.sendRedirect(ahsr_solicitud, ahsr_respuesta,
				ls_enlace + EnumParametrosURL.CONFIRMACION_SESION_PARAMETRO.getIs_nombreParametro()
						+ EnumBoolean.CHAR_S.getIs_valorString());

	}

}
