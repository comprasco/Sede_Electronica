/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: AutenticadorListener.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.security
 * Nombre del elemento: AutenticadorListener
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.security;

import java.util.Date;

import org.springframework.context.ApplicationListener;
import org.springframework.security.authentication.event.AbstractAuthenticationEvent;
import org.springframework.security.authentication.event.AuthenticationFailureBadCredentialsEvent;

import com.bea.core.repackaged.springframework.stereotype.Component;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IParametroBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IUsuarioBloqueoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IUsuarioBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TipoEstadoCuentaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioBloqueoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumParametros;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoEstadoCuenta;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.BeansLocales;

/**
 * Clase tipo Listener que se encarga de capturar el evento de las acciones de
 * autenticación del usuario.<br>
 * Implementa la interface ApplicationListener del framework spring security
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Component
public class AutenticadorListener implements ApplicationListener<AbstractAuthenticationEvent> {

	/**
	 * Define la constante INICIO_SESIONES_FALLIDAS.
	 */
	private static final Integer INICIO_SESIONES_FALLIDAS = 1;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.context.ApplicationListener#onApplicationEvent(org.
	 * springframework.context.ApplicationEvent)
	 */
	@Override
	public void onApplicationEvent(AbstractAuthenticationEvent laae_evento) {

		IParametroBusiness lipb_parametroBusines = BeansLocales.consultarParametroBusiness();
		IUsuarioBloqueoBusiness liub_usuarioBloqueoBusiness = BeansLocales.consultarUsuarioBloqueoBusiness();

		Date ld_date = new Date();

		if (laae_evento instanceof AuthenticationFailureBadCredentialsEvent) {

			AuthenticationFailureBadCredentialsEvent lafbce_event = (AuthenticationFailureBadCredentialsEvent) laae_evento;
			String ls_nombreUsuario = lafbce_event.getAuthentication().getName();
			Integer li_intentosMaximos = Integer.parseInt(lipb_parametroBusines
					.consultarParametro(
							EnumParametros.CANTIDAD_INTENTOS_FALLIDOS_BLOQUEO_CUENTA.getIs_nombreParametro())
					.getIs_valor());

			IUsuarioBusiness lirb_usuarioBusiness = BeansLocales.consultarUsuarioBusiness();
			UsuarioDTO lu_usarioDto = lirb_usuarioBusiness.consultarUsuario(ls_nombreUsuario);
			lu_usarioDto.setId_fechaUltimoIntento(ld_date);

			if (lu_usarioDto.getIi_intentosFallidosAcceso() == null) {
				lu_usarioDto.setIi_intentosFallidosAcceso(INICIO_SESIONES_FALLIDAS);
				lirb_usuarioBusiness.actualizaUsuario(lu_usarioDto);

			} else if (lu_usarioDto.getIi_intentosFallidosAcceso() >= li_intentosMaximos - INICIO_SESIONES_FALLIDAS) {
				TipoEstadoCuentaDTO itec_tipoEstadoCuentaDto = new TipoEstadoCuentaDTO(
						EnumTipoEstadoCuenta.BLOQUEADO_POR_EL_SISTEMAS.getIs_id());
				lu_usarioDto.setItec_tipoEstadoCuentaDto(itec_tipoEstadoCuentaDto);

				if (lu_usarioDto.getIubd_usuarioBloqueoDto() == null) {
					UsuarioBloqueoDTO lub_usuario = new UsuarioBloqueoDTO();
					lub_usuario.setIud_usuarioDto(lu_usarioDto);
					lu_usarioDto.setIubd_usuarioBloqueoDto(lub_usuario);
				}
				// Se agrega objeto usuarioBloqueoDto al usuarioDTO - Revisar para el caso de
				// actualizacion
				lu_usarioDto.getIubd_usuarioBloqueoDto().setId_fechaBloqueoInicio(ld_date);
				lirb_usuarioBusiness.actualizaUsuario(lu_usarioDto);
				liub_usuarioBloqueoBusiness.bloqueoUsuario(lu_usarioDto,
						EnumTipoEstadoCuenta.BLOQUEADO_POR_EL_SISTEMAS.getIs_nombre());

			} else {
				lu_usarioDto.setIi_intentosFallidosAcceso(
						lu_usarioDto.getIi_intentosFallidosAcceso() + INICIO_SESIONES_FALLIDAS);
				lirb_usuarioBusiness.actualizaUsuario(lu_usarioDto);
			}
		}
	}

}
