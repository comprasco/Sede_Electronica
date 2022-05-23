/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: AutenticadorUsuariosBD.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.security
 * Nombre del elemento: AutenticadorUsuariosBD
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.security;

import java.util.Objects;

import javax.persistence.NoResultException;
import javax.servlet.http.HttpServletRequest;

import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.bea.core.repackaged.springframework.stereotype.Component;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesDatosEntrada;
import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesNegocio;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IAsociacionUsuarioEntidadEspecialBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IAsociacionUsuarioPersonaJuridicaBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IPersonaBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IPersonaJuridicaBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IPersonaNaturalBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IUsuarioBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IUsuarioRolBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.AsociacionUsuarioEntidadEspecialDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.AsociacionUsuarioPersonaJuridicaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.EntidadEspecialDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoBaseDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PersonaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PersonaJuridicaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PersonaNaturalDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioRolDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumBoolean;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumInicioSesion;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumParametrosURL;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumRol;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoEstadoCuenta;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoPersona;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesEntidadEspecial;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesInicioSesion;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesPersonaJuridica;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.BeansLocales;

/**
 * Clase que permite configuracion de la autenticacion JPA para Spring Security
 * (Importante implementar UserDetailsService). <br>
 * Implementa la interface UserDetailsService del framework spring security
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Component
public class AutenticadorUsuariosBD implements UserDetailsService {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.security.core.userdetails.UserDetailsService#
	 * loadUserByUsername(java.lang.String)
	 */
	@Override
	public UserDetails loadUserByUsername(String as_nombreUsuario) {

		UsuarioRolDTO lur_usuarioRol;
		lur_usuarioRol = consultarRolUsuario(as_nombreUsuario);

		if (!(lur_usuarioRol.getIr_rolDto().getIs_activo().equals(EnumBoolean.CHAR_S.getIs_codigo())))
			throw new ExcepcionesDatosEntrada(EnumExcepcionesInicioSesion.USUARIO_NO_DISPONIBLE);

		UsuarioDTO lud_usuarioDto = lur_usuarioRol.getIu_usuarioDto();

		// Valida que el usuario tenga las condiciones para ingresar a sesion
		validarUsuarioSesion(lud_usuarioDto);

		HttpServletRequest lhsr_solicitud = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
				.getRequest();
		EnumRol ler_rol = null;

		// Consulta todos los parametros del formulario del login
		String ls_servicio = lhsr_solicitud.getParameter(EnumParametrosURL.SERVICIO.getIs_nombreParametro());

		// Genero el rol o estereotipo definitivo segun login
		if (ls_servicio.equals(EnumInicioSesion.INICIO_SESION_USUARIO.getIs_nombrePagInicio())) {
			ler_rol = generarRolCiudadano(lur_usuarioRol, lhsr_solicitud);
		} else if (ls_servicio.equals(EnumInicioSesion.INICIO_SESION_USUARIO_INTERNOS.getIs_nombrePagInicio())) {
			ler_rol = seleccionarRolUsuarioInterno(lur_usuarioRol);
		} else if (ls_servicio
				.equals(EnumInicioSesion.INICIO_SESION_USUARIO_ENTIDAD_ESPECIAL.getIs_nombrePagInicio())) {
			ler_rol = seleccionarRolEntidadEspecial(lur_usuarioRol, lhsr_solicitud);
		}

		if (ler_rol == null)
			throw new ExcepcionesDatosEntrada(EnumExcepcionesInicioSesion.INICIO_SESION_INCORRECTO);

		UserDetails lud_usuario;

		// Construye el usuario para la creacion de la sesion
		lud_usuario = crearUsuarioSesion(ls_servicio, ler_rol, lud_usuarioDto);

		return lud_usuario;

	}

	/**
	 * Metodo que identifica el estereotipo o rol para dar acceso a persona
	 * juridica.
	 *
	 * @param aur_usuarioRol usuario rol
	 * @param ahsr_solicitud solicitud
	 * @return Enum con los roles existentes
	 */
	private EnumRol generarRolCiudadano(UsuarioRolDTO aur_usuarioRol, HttpServletRequest ahsr_solicitud) {

		EnumRol ler_rol = EnumRol.consultarRol(aur_usuarioRol.getIr_rolDto().getIs_nombre());

		// Consulta el "a nombre de" del ingreso (persona juridica o asociado)
		String ls_tipoPersona = ahsr_solicitud.getParameter(EnumParametrosURL.TIPO_PERSONA.getIs_nombreParametro());
		String ls_documento = ahsr_solicitud.getParameter(EnumParametrosURL.NUMERO_DOCUMENTO.getIs_nombreParametro());
		String ls_documentoD = ahsr_solicitud
				.getParameter(EnumParametrosURL.NUMERO_DOCUMENTO_D.getIs_nombreParametro());
		String ls_tipoDocumento = ahsr_solicitud.getParameter(EnumParametrosURL.TIPO_DOCUMENTO.getIs_nombreParametro());

		IPersonaBusiness lp_personaBusiness;
		lp_personaBusiness = BeansLocales.consultarPersonaBusiness();

		PersonaDTO lpd_persona;

		if (EnumRol.PERSONA_NATURAL.consultarIs_rol().equals(ler_rol.consultarIs_rol())
				&& ls_tipoPersona.equals(EnumTipoPersona.NATURAL.getIs_codigo())) {
			IPersonaNaturalBusiness lipn_personaNaturalBusiness;
			lipn_personaNaturalBusiness = BeansLocales.consultarPersonaNaturalBusiness();

			PersonaNaturalDTO lpn_personaNatural;

			if (ls_documento == null)
				ls_documento = ls_documentoD;
			
			// Consulto la persona por su numero de documento
			lpn_personaNatural = lipn_personaNaturalBusiness.consultarPersonaNatural(ls_documento);
			lpd_persona = lp_personaBusiness.consultarPersonaPorId(lpn_personaNatural.getIp_personaDto());

			if (!(lpn_personaNatural.getIp_personaDto().getIs_numeroDocumento().equals(ls_documento)
					&& lpd_persona.getItd_tipoDocumentoDto().getIs_id().equals(ls_tipoDocumento)))
				throw new ExcepcionesDatosEntrada(EnumExcepcionesInicioSesion.TIPO_DOCUMENTO_INVALIDO);

			return EnumRol.PERSONA_NATURAL;
		}

		IPersonaJuridicaBusiness lipj_personaJuridicaBussines = BeansLocales.consultarPersonaJuridicaBusiness();

		// Consulto el parametro para conocer el numero de doucumentacion
		String ls_documentoOrganizacion = ahsr_solicitud
				.getParameter(EnumParametrosURL.NUMERO_DOCUMENTO.getIs_nombreParametro());

		// Verifico si existe la persona juridica ingresada
		PersonaJuridicaDTO lpj_personaJuridicaDto;
		lpj_personaJuridicaDto = lipj_personaJuridicaBussines.consultarPersonaJuridica(ls_documentoOrganizacion);
		lpd_persona = lp_personaBusiness.consultarPersonaPorId(lpj_personaJuridicaDto.getIp_personaDto());

		IUsuarioBusiness liu_usuarioBusines = BeansLocales.consultarUsuarioBusiness();
		UsuarioDTO lu_usuarioDto = liu_usuarioBusines
				.consultarUsuarioPersonaJuridica(lpj_personaJuridicaDto.getIs_idPersona());

		validarValores(lu_usuarioDto, lpd_persona, lpj_personaJuridicaDto, ls_tipoDocumento);

		if (EnumRol.PERSONA_NATURAL.consultarIs_rol().equals(ler_rol.consultarIs_rol())
				&& ls_tipoPersona.equals(EnumTipoPersona.JURIDICA.getIs_codigo())) {

			IAsociacionUsuarioPersonaJuridicaBusiness liaupj_asociacionesBusiness = BeansLocales
					.consultarAsociacionUsuarioPersonaJuridica();
			AsociacionUsuarioPersonaJuridicaDTO laupj_personaJuridica = liaupj_asociacionesBusiness
					.consultarAsociacion(aur_usuarioRol.getIu_usuarioDto().getIs_id(), ls_documentoOrganizacion);

			// Se verifica que la asociacion esta activa
			// Excepcion donde muestra que el usuario esta desactivado para acceder con
			// dicho rol
			if (!laupj_personaJuridica.getIs_activo().equals(EnumBoolean.CHAR_S.getIs_codigo()))
				throw new ExcepcionesDatosEntrada(EnumExcepcionesInicioSesion.USUARIO_NO_DISPONIBLE);

			return EnumRol.PERSONA_JURIDICA;
		} else if (!(EnumRol.ADMIN_PERSONA_JURIDICA.consultarIs_rol().equals(ler_rol.consultarIs_rol())
				&& ls_tipoPersona.equals(EnumTipoPersona.JURIDICA.getIs_codigo()))) {
			throw new ExcepcionesDatosEntrada(EnumExcepcionesInicioSesion.USUARIO_NO_REGISTRADO);
		}

		return ler_rol;
	}
	
	/**
	 * Metodo que permite identificar alguna expcepcion de los datos ingresados
	 * @param au_usuarioDto
	 * @param apd_persona
	 * @param apj_personaJuridicaDto
	 * @param as_tipoDocumento
	 */
	private void validarValores(UsuarioDTO au_usuarioDto, PersonaDTO apd_persona, GenericoBaseDTO apj_personaJuridicaDto, String as_tipoDocumento) {
		if (Objects.isNull(au_usuarioDto))
			throw new ExcepcionesDatosEntrada(EnumExcepcionesPersonaJuridica.PERSONA_JURIDICA_NO_DISPONIBLE);

		if (!au_usuarioDto.getItec_tipoEstadoCuentaDto().getIs_id().equals(EnumTipoEstadoCuenta.ACTIVO.getIs_id()))
			throw new ExcepcionesDatosEntrada(EnumExcepcionesPersonaJuridica.PERSONA_JURIDICA_NO_DISPONIBLE);

		if (!apd_persona.getItd_tipoDocumentoDto().getIs_id().equals(as_tipoDocumento))
			throw new ExcepcionesDatosEntrada(EnumExcepcionesInicioSesion.TIPO_DOCUMENTO_INVALIDO);

		if (!apj_personaJuridicaDto.getIs_activo().equals(EnumBoolean.CHAR_S.getIs_codigo()))
			throw new ExcepcionesNegocio(EnumExcepcionesInicioSesion.USUARIO_NO_DISPONIBLE);

	}

	/**
	 * Metodo que identifica el estereotipo o rol para dar acceso.
	 *
	 * @param aur_usuarioRol usuario rol
	 * @param ahsr_solicitud solicitud
	 * @return Enum con los roles existentes
	 */
	private EnumRol seleccionarRolEntidadEspecial(UsuarioRolDTO aur_usuarioRol, HttpServletRequest ahsr_solicitud) {
		EnumRol ler_rol = EnumRol.consultarRol(aur_usuarioRol.getIr_rolDto().getIs_nombre());

		if (EnumRol.EE_TEA.consultarIs_rol().equals(ler_rol.consultarIs_rol())
				|| EnumRol.EE_TEJ.consultarIs_rol().equals(ler_rol.consultarIs_rol())
				|| EnumRol.EE_TEE.consultarIs_rol().equals(ler_rol.consultarIs_rol())
				|| EnumRol.EE_TEGE.consultarIs_rol().equals(ler_rol.consultarIs_rol())) {
			return ler_rol;
		}
		String ls_entidadEspecial = ahsr_solicitud.getParameter(EnumParametrosURL.ENTIDAD.getIs_nombreParametro());
		EntidadEspecialDTO lee_entidadEspecial = BeansLocales.consultarEntidadEspecial()
				.consultarEntidadEspecial(ls_entidadEspecial);

		if (!lee_entidadEspecial.getIs_activo().equals(EnumBoolean.CHAR_S.getIs_codigo()))
			throw new ExcepcionesNegocio(EnumExcepcionesInicioSesion.USUARIO_NO_DISPONIBLE);

		if (EnumRol.PERSONA_NATURAL.consultarIs_rol().equals(ler_rol.consultarIs_rol())) {

			IAsociacionUsuarioEntidadEspecialBusiness liauee_asociacionesBusiness = BeansLocales
					.consultarAsociacionUsuarioEntidadEspecial();
			AsociacionUsuarioEntidadEspecialDTO laueej_entidadEspecial = liauee_asociacionesBusiness
					.consultarAsociacion(ls_entidadEspecial, aur_usuarioRol.getIu_usuarioDto().getIs_id());

			if (!laueej_entidadEspecial.getIs_activo().equals(EnumBoolean.CHAR_S.getIs_codigo()))
				throw new ExcepcionesNegocio(EnumExcepcionesEntidadEspecial.ENTIDAD_ESPECIAL_INEXISTENTE);

			return EnumRol.EE_PN;

		} else if (!verificarRolEntidadEspecial(ler_rol.consultarIs_rol())
				|| aur_usuarioRol.getIu_usuarioDto().getIs_entidadEspecial() == null
				|| !lee_entidadEspecial.getIs_id().equals(aur_usuarioRol.getIu_usuarioDto().getIs_entidadEspecial())) {
			throw new ExcepcionesDatosEntrada(EnumExcepcionesInicioSesion.INICIO_SESION_INCORRECTO);
		}

		return ler_rol;

	}

	/**
	 * Metodo que identifica el estereotipo o rol para dar acceso.
	 *
	 * @param aur_usuarioRol usuario rol
	 * @return Enum con los roles existentes
	 */
	private EnumRol seleccionarRolUsuarioInterno(UsuarioRolDTO aur_usuarioRol) {
		EnumRol ler_rol;
		ler_rol = EnumRol.consultarRol(aur_usuarioRol.getIr_rolDto().getIs_nombre());
		return ler_rol;
	}

	/**
	 * Metodo que permite crear un UserDetails con la informacion respectiva de la
	 * solicitud.
	 *
	 * @param as_servicio   servicio por el que se solicita
	 * @param aer_rol       rol autenticado
	 * @param au_usuarioDto usuario autenticado
	 * @return Resultado para crear usuario sesion retornado como UserDetails
	 */
	private UserDetails crearUsuarioSesion(String as_servicio, EnumRol aer_rol, UsuarioDTO au_usuarioDto) {

		if (as_servicio.equals(aer_rol.consultarIs_nombrePagInicio())) {

			UserBuilder lub_builder = null;

			lub_builder = org.springframework.security.core.userdetails.User
					.withUsername(au_usuarioDto.getIs_usuario());
			lub_builder.password(au_usuarioDto.getIs_claveHash());
			lub_builder.roles(aer_rol.consultarIs_rol());

			UserDetails lud_usuario;

			lud_usuario = lub_builder.build();

			return lud_usuario;

		} else {
			throw new ExcepcionesDatosEntrada(EnumExcepcionesInicioSesion.INICIO_SESION_INCORRECTO);
		}

	}

	/**
	 * Metodo que valida el estado de negocio del usuario que intenta acceder a la
	 * sesion.
	 *
	 * @param au_usuario datos del usuario que esta ingresando
	 */
	private void validarUsuarioSesion(UsuarioDTO au_usuario) {

		if (au_usuario == null)
			throw new ExcepcionesDatosEntrada(EnumExcepcionesInicioSesion.USUARIO_NO_DISPONIBLE);

		if (au_usuario.getItec_tipoEstadoCuentaDto().getIs_id()
				.equals(EnumTipoEstadoCuenta.BLOQUEADO_POR_EL_SISTEMAS.getIs_id()))
			throw new ExcepcionesDatosEntrada(EnumExcepcionesInicioSesion.USUARIO_BLOQUEADO_SISTEMA);
		else if (au_usuario.getItec_tipoEstadoCuentaDto().getIs_id()
				.equals(EnumTipoEstadoCuenta.BLOQUEADO_POR_ADMINISTRADOR.getIs_id()))
			throw new ExcepcionesDatosEntrada(EnumExcepcionesInicioSesion.USUARIO_BLOQUEADO_ADMIN);
		else if (!(au_usuario.getItec_tipoEstadoCuentaDto().getIs_id().equals(EnumTipoEstadoCuenta.ACTIVO.getIs_id())))
			throw new ExcepcionesDatosEntrada(EnumExcepcionesInicioSesion.USUARIO_NO_DISPONIBLE);
		else if (au_usuario.getIs_activo().equals(EnumBoolean.CHAR_N.getIs_codigo()))
			throw new ExcepcionesDatosEntrada(EnumExcepcionesInicioSesion.USUARIO_NO_DISPONIBLE);

	}

	/**
	 * Metodo que permite consultar un usuario y validarlo a la hora de iniciar
	 * sesion.
	 *
	 * @param as_nombreUsuario nombre del usuario
	 * @return Resultado para consultar rol usuario retornado como UsuarioRolDTO
	 */
	private UsuarioRolDTO consultarRolUsuario(String as_nombreUsuario) {

		UsuarioRolDTO lur_usuarioRol;
		IUsuarioRolBusiness liurb_usuarioRolBussines = BeansLocales.consultarUsuarioRolBusiness();

		try {
			lur_usuarioRol = liurb_usuarioRolBussines.consultarUsuarioRolNombreActivo(as_nombreUsuario);
			return lur_usuarioRol;
		} catch (NoResultException ae_excepcion) {
			throw new ExcepcionesDatosEntrada(EnumExcepcionesInicioSesion.USUARIO_NO_DISPONIBLE);
		}
	}

	/**
	 * Metodo que verifica el rol de la entidad especial sefun sea administrador.
	 *
	 * @param as_rol rol del usuario que intenta acceder
	 * @return verificacion si es o no un usuario
	 */
	private Boolean verificarRolEntidadEspecial(String as_rol) {
		return (as_rol.equals(EnumRol.EE_TEA.consultarIs_rol()) || as_rol.equals(EnumRol.EE_TEJ.consultarIs_rol())
				|| as_rol.equals(EnumRol.EE_TEE.consultarIs_rol()) || as_rol.equals(EnumRol.EE_TEGE.consultarIs_rol()));
	}

}