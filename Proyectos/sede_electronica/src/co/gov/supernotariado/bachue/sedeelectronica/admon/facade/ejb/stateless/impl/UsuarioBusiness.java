/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: UsuarioBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl
 * Nombre del elemento: UsuarioBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import org.jboss.logging.Logger;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesDatosEntrada;
import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesNegocio;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IHistorialSolicitudRegistroBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IHistoricoClaveBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IParametroBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IPersonaBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IRolBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IUsuarioBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IUsuarioRolBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.interceptors.AuditoriaInicioSesionAnotacion;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.HistorialSolicitudRegistroDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.HistoricoClaveDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ParametroDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PersonaCompletaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PersonaDireccionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PersonaJuridicaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.RolDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioRolDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioSesionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IUsuarioDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IUsuarioRolDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.DireccionHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.HistoricoClaveHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.PersonaDireccionHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.PersonaHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.PersonaJuridicaHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.UsuarioHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.UsuarioRolHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.UsuarioSesionHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Direccion;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.HistoricoClave;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Persona;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.PersonaDireccion;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.PersonaJuridica;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Usuario;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.UsuarioRol;
import co.gov.supernotariado.bachue.sedeelectronica.common.cache.impl.CacheGeneral;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumBoolean;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCache;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumEstadoActivo;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumHistorialRegistro;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumMensajesLog;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumParametros;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumRol;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesGenerales;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesInicioSesion;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadAuditoria;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadAutoridadUsuario;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadFecha;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadSeguridad;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica de las operaciones del recurso Usuario.
 * <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "UsuarioBusiness", mappedName = "UsuarioBusiness")
@LocalBean
public class UsuarioBusiness extends CacheGeneral<UsuarioSesionDTO> implements IUsuarioBusiness {



	/**
	 * Atributo de instancia tipo IUsuarioDAO para definir la propiedad usuario DAO.
	 */
	@EJB
	private IUsuarioDAO iiu_usuarioDAO;

	/**
	 * Atributo de instancia tipo IUsuarioRolDAO para definir la propiedad usuario
	 * rol DAO.
	 */
	@EJB
	private IUsuarioRolDAO iiur_usuarioRolDAO;

	/**
	 * Atributo de instancia tipo IParametroBusiness para definir la propiedad
	 * parametros business.
	 */
	@EJB
	private IParametroBusiness iip_parametrosBusiness;

	/**
	 * Atributo para definir la propiedad iihistorial solicitud registro.
	 */
	@EJB
	private IHistorialSolicitudRegistroBusiness iihistorialSolicitudRegistro;

	/**
	 * Atributo de instancia tipo IPersonaBusiness para definir la propiedad persona
	 * business.
	 */
	@EJB
	private IPersonaBusiness iip_personaBusiness;

	/**
	 * Atributo de instancia tipo IUsuarioRolBusiness para definir la propiedad
	 * usuario rol business.
	 */
	@EJB
	private IUsuarioRolBusiness iip_usuarioRolBusiness;

	/**
	 * Atributo de instancia tipo IHistoricoClaveBusiness para definir la propiedad
	 * historico clave business.
	 */
	@EJB
	private IHistoricoClaveBusiness iihc_historicoClaveBusiness;

	/**
	 * Atributo de instancia tipo IRolBusiness para definir la propiedad rol
	 * business.
	 */
	@EJB
	private IRolBusiness iir_rolBusiness;

	/**
	 * Define la constante CL_LOGGER.
	 */
	static final Logger CL_LOGGER = Logger.getLogger(UsuarioBusiness.class);

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IUsuarioBusiness#crearUsuario(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioDTO, co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PersonaJuridicaDTO, co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioRolDTO, co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PersonaDireccionDTO)
	 */
	@Override
	public Boolean crearUsuario(UsuarioDTO au_usuarioDto, PersonaJuridicaDTO apj_personaJuridica,
			UsuarioRolDTO aur_usuarioRol, PersonaDireccionDTO apd_direccion) {

		if (validarNuevoUsuario(au_usuarioDto)) {
			throw new ExcepcionesDatosEntrada(EnumExcepcionesInicioSesion.DOCUMENTO_YA_EXISTENTE);
		}

		apd_direccion = (PersonaDireccionDTO) UtilidadAuditoria.adicionarDatosCreacion(apd_direccion);
		au_usuarioDto = (UsuarioDTO) UtilidadAuditoria.adicionarDatosCreacion(au_usuarioDto);

		Persona lp_persona = PersonaHelper.dtoAEntidadCompleto(apj_personaJuridica.getIp_personaDto(), new Persona());
		PersonaDireccion lpd_personDireccion = PersonaDireccionHelper.dtoAEntidadCompleto(apd_direccion,
				new PersonaDireccion());
		PersonaJuridica lpj_personaJuridica = PersonaJuridicaHelper.dtoAEntidadCompleto(apj_personaJuridica,
				new PersonaJuridica());
		Usuario lu_usuario = UsuarioHelper.dtoAEntidadCompleto(au_usuarioDto, new Usuario());
		UsuarioRol lur_usuarioRol = UsuarioRolHelper.dtoAEntidadCompleto(aur_usuarioRol, new UsuarioRol());
		Direccion ld_direccion = DireccionHelper.dtoAEntidadCompleto(apd_direccion.getId_direccion(), new Direccion());

		Boolean lb_estado;
		lu_usuario = iiu_usuarioDAO.crearUsuarioJuridico(lp_persona, ld_direccion, lpd_personDireccion,
				lpj_personaJuridica, lu_usuario, lur_usuarioRol);
		HistoricoClaveDTO lhc_historicoClaveDto = new HistoricoClaveDTO();
		lhc_historicoClaveDto.setIs_activo(EnumBoolean.CHAR_S.getIs_codigo());
		lhc_historicoClaveDto.setIs_claveHash(lu_usuario.getClaveHash());
		lhc_historicoClaveDto.setIu_usuarioDto(UsuarioHelper.entidadADtoCompleto(lu_usuario));
		lb_estado = iihc_historicoClaveBusiness.crearHistoricoClave(lhc_historicoClaveDto);
		return lb_estado;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IUsuarioBusiness#consultarUsuarioActivo(java.lang.String)
	 */
	@Override
	public UsuarioDTO consultarUsuarioActivo(String as_nombreUsuario) {
		UsuarioDTO lu_usuarioDTO;

		Usuario lu_usuario = iiu_usuarioDAO.consultarUsuarioEstadoActivo(as_nombreUsuario);

		if (lu_usuario == null)
			throw new ExcepcionesDatosEntrada(EnumExcepcionesInicioSesion.USUARIO_NO_REGISTRADO);

		lu_usuarioDTO = UsuarioHelper.entidadADtoCompleto(lu_usuario);

		return lu_usuarioDTO;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IUsuarioBusiness#consultarUsuariosBloqueo(java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public UsuarioDTO consultarUsuariosBloqueo(String as_tipoDocumento, String as_numeroDocumento,
			String as_usuarioBloqueo) {

		UsuarioDTO lu_usuarioDto = UsuarioHelper
				.listaEntidadADtoCompletoDTO(iiu_usuarioDAO.consultarUsuarioBloqueoEntidadEspecial(as_usuarioBloqueo))
				.get(0);

		if (lu_usuarioDto.getIpj_personaJuridicaDto() != null
				&& !lu_usuarioDto.getIp_personaDto().getIs_numeroDocumento().equals(as_numeroDocumento)
				|| !lu_usuarioDto.getIp_personaDto().getItd_tipoDocumentoDto().getIs_id().equals(as_tipoDocumento)) {
			throw new ExcepcionesDatosEntrada(EnumExcepcionesInicioSesion.USUARIO_NO_REGISTRADO);
		}
		return lu_usuarioDto;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IUsuarioBusiness#consultarUsuariosAsociacion(java.lang.String, java.lang.String)
	 */
	@Override
	public UsuarioDTO consultarUsuariosAsociacion(String as_tipoDocumento, String as_numeroDocumento) {

		UsuarioDTO lu_usuarioDTO;

		Usuario lu_usuario = iiu_usuarioDAO.consultarUsuariosAsociacion(as_tipoDocumento, as_numeroDocumento);

		if (lu_usuario == null)
			throw new ExcepcionesDatosEntrada(EnumExcepcionesGenerales.DATOS_INEXISTENTES);

		lu_usuarioDTO = UsuarioHelper.entidadADtoCompletoDTO(lu_usuario);

		return lu_usuarioDTO;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IUsuarioBusiness#consultarUsuarioPendienteAprobacion(java.lang.String)
	 */
	@Override
	public List<UsuarioDTO> consultarUsuarioPendienteAprobacion(String as_pendienteAprobacion) {
		List<UsuarioDTO> llu_usuarioDTO;

		List<Usuario> llu_usuario = iiu_usuarioDAO.consultaUsuarioPendienteAprobacion(as_pendienteAprobacion);

		if (llu_usuario == null)
			throw new ExcepcionesDatosEntrada(EnumExcepcionesGenerales.DATOS_INEXISTENTES);

		llu_usuarioDTO = UsuarioHelper.listaEntidadADtoCompletoDTO(llu_usuario);

		return llu_usuarioDTO;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IUsuarioBusiness#consultarUsuarioUUIDActivacion(java.lang.String)
	 */
	@Override
	public UsuarioDTO consultarUsuarioUUIDActivacion(String as_uuidActivacion) {

		Usuario lu_usuario = iiu_usuarioDAO.consultarUsuarioUUIDActivacion(as_uuidActivacion);

		if (Objects.isNull(lu_usuario))
			return null;

		UsuarioDTO lu_usuarioDTO;
		lu_usuarioDTO = UsuarioHelper.entidadADtoCompleto(lu_usuario);

		return lu_usuarioDTO;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IUsuarioBusiness#actualizaUsuario(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioDTO)
	 */
	@Override
	public Boolean actualizaUsuario(UsuarioDTO au_usuarioDto) {
		try {
			au_usuarioDto = (UsuarioDTO) UtilidadAuditoria.adicionarDatosModificacion(au_usuarioDto);
			return iiu_usuarioDAO.actualizaUsuario(UsuarioHelper.dtoAEntidadCompleto(au_usuarioDto, new Usuario()));
		} catch (Exception ae_exception) {
			ae_exception.getMessage();
			return false;
		}
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IUsuarioBusiness#actualizaUsuarioAdministrador(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioDTO)
	 */
	@Override
	public Boolean actualizaUsuarioAdministrador(UsuarioDTO au_usuarioDto) {
		try {
			au_usuarioDto = (UsuarioDTO) UtilidadAuditoria.adicionarDatosModificacion(au_usuarioDto);

			UsuarioRolDTO lur_usuarioRolDto = iip_usuarioRolBusiness
					.consultarEstadoUsuarioRol(au_usuarioDto.getIs_usuario());
			lur_usuarioRolDto.setIr_rolDto(iir_rolBusiness.consultarRoles(au_usuarioDto.getIs_rol()));

			Usuario lu_usuario = UsuarioHelper.dtoAEntidadCompleto(au_usuarioDto, new Usuario());
			UsuarioRol lur_usuarioRol = UsuarioRolHelper.dtoAEntidadCompleto(lur_usuarioRolDto, new UsuarioRol());

			Boolean lb_estadoActualizacion;
			lb_estadoActualizacion = iiu_usuarioDAO.actualizarUsuarioAdministrador(lu_usuario, lur_usuarioRol);

			return lb_estadoActualizacion;
		} catch (Exception ae_exception) {
			throw new ExcepcionesNegocio(EnumExcepcionesGenerales.ACTUALIZACION_FALLIDA, ae_exception);
		}
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IUsuarioBusiness#consultarUsuarioConDireccion(java.lang.String)
	 */
	@Override
	public UsuarioDTO consultarUsuarioConDireccion(String as_usuario) {

		UsuarioDTO lu_usuarioDTO;

		Usuario lu_usuario = consultarUsuarioPorNombre(as_usuario);

		lu_usuarioDTO = UsuarioHelper.entidadADtoPersonaConDireccion(lu_usuario);
		return lu_usuarioDTO;

	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IUsuarioBusiness#consultarUsuario(java.lang.String)
	 */
	@Override
	public UsuarioDTO consultarUsuario(String as_usuario) {

		UsuarioDTO lu_usuarioDTO;
		Usuario lu_usuario = consultarUsuarioPorNombre(as_usuario);

		lu_usuarioDTO = UsuarioHelper.entidadADtoCompletoPersonaConTipoDPerNatDireccion(lu_usuario);
		return lu_usuarioDTO;

	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IUsuarioBusiness#consultarUsuarioConDireccionYPersonaJuridica(java.lang.String)
	 */
	@Override
	public UsuarioDTO consultarUsuarioConDireccionYPersonaJuridica(String as_usuario) {

		UsuarioDTO lu_usuarioDTO;

		Usuario lu_usuario = consultarUsuarioPorNombre(as_usuario);

		lu_usuarioDTO = UsuarioHelper.entidadADtoDireccionPersonaJuridaSinArchivo(lu_usuario);
		return lu_usuarioDTO;

	}

	/**
	 * Metodo encargado de consultar usuario por nombre.
	 *
	 * @param as_usuario el parametro usuario
	 * @return Resultado para consultar usuario por nombre retornado como Usuario
	 */
	private Usuario consultarUsuarioPorNombre(String as_usuario) {
		Usuario lu_usuario = iiu_usuarioDAO.consultarUsuario(as_usuario);
		if (Objects.isNull(lu_usuario)) {
			throw new ExcepcionesDatosEntrada(EnumExcepcionesInicioSesion.USUARIO_NO_REGISTRADO);
		}
		return lu_usuario;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IUsuarioBusiness#consultarExistenciaNombreUsuario(java.lang.String)
	 */
	@Override
	public Boolean consultarExistenciaNombreUsuario(String as_usuario) {
		try {
			consultarUsuario(as_usuario);
			return true;
		} catch (ExcepcionesDatosEntrada ae_excepcion) {
			return false;
		}

	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IUsuarioBusiness#modificarContrasenaUsuario(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PersonaCompletaDTO)
	 */
	@Override
	public Boolean modificarContrasenaUsuario(PersonaCompletaDTO apcd_personaCompletaDto) {
		try {

			apcd_personaCompletaDto.getIud_usuarioDto().setIs_claveHash(
					UtilidadSeguridad.encriptarTexto(apcd_personaCompletaDto.getIud_usuarioDto().getIs_contrasena()));
			apcd_personaCompletaDto.setIud_usuarioDto((UsuarioDTO) UtilidadAuditoria
					.adicionarDatosModificacion(apcd_personaCompletaDto.getIud_usuarioDto()));
			apcd_personaCompletaDto.getIhc_historicoClaveDTO().setIs_claveHash(
					UtilidadSeguridad.encriptarTexto(apcd_personaCompletaDto.getIud_usuarioDto().getIs_contrasena()));

			UsuarioDTO lu_usuarioDto = apcd_personaCompletaDto.getIud_usuarioDto();
			lu_usuarioDto.setId_fechaModificacionClave(new Date());

			if (apcd_personaCompletaDto.getIhc_historicoClaveDTO().getId_fechaCreacion() == null) {
				apcd_personaCompletaDto.setIhc_historicoClaveDTO((HistoricoClaveDTO) UtilidadAuditoria
						.adicionarDatosCreacion(apcd_personaCompletaDto.getIhc_historicoClaveDTO()));
			}

			apcd_personaCompletaDto.setIhc_historicoClaveDTO(((HistoricoClaveDTO) UtilidadAuditoria
					.adicionarDatosModificacion(apcd_personaCompletaDto.getIhc_historicoClaveDTO())));

			Boolean lb_estado;
			lb_estado = iiu_usuarioDAO.modificarContrasenaUsuario(
					UsuarioHelper.dtoAEntidadCompleto(lu_usuarioDto, new Usuario()),
					HistoricoClaveHelper.dtoAEntidadCompleto(apcd_personaCompletaDto.getIhc_historicoClaveDTO(),
							new HistoricoClave()));

			return lb_estado;

		} catch (Exception ae_exception) {
			return false;
		}
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IUsuarioBusiness#consultarUsuarioSesion(java.lang.String)
	 */
	@Override
	public UsuarioSesionDTO consultarUsuarioSesion(String as_usuario) {

		Usuario lu_usuario = iiu_usuarioDAO.consultarUsuario(as_usuario);
		UsuarioSesionDTO lus_usuarioDTO = UsuarioSesionHelper.entidadADtoCompleto(lu_usuario);

		String ls_rol = UtilidadAutoridadUsuario.consultarRolActual();
		String ls_estereotipo = EnumRol.consultarRol(ls_rol).getIs_estereotipo();
		lus_usuarioDTO.setIs_rol(ls_rol);
		lus_usuarioDTO.setIs_estereotipo(ls_estereotipo);
		Integer li_dias;
		if (lu_usuario.getFechaModificacionClave() != null) {
			li_dias = UtilidadFecha.contarDias(new Date(), lu_usuario.getFechaModificacionClave());
			String ls_diasVigencia = iip_parametrosBusiness
					.consultarParametro(EnumParametros.VIGENCIA_CLAVE.getIs_nombreParametro()).getIs_valor();

			lus_usuarioDTO
					.setIb_expiracionContrasena(!(li_dias != null && (li_dias < Integer.parseInt(ls_diasVigencia))));
		} else {
			lus_usuarioDTO.setIb_expiracionContrasena(true);
		}
		return lus_usuarioDTO;

	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IUsuarioBusiness#consultarUsuarioCache(java.lang.String)
	 */
	@Override
	public UsuarioSesionDTO consultarUsuarioCache(String as_nombreUsuario) {
		UsuarioSesionDTO lu_usuario;
		lu_usuario = consultarDato(as_nombreUsuario, EnumCache.USUARIOS.getIs_nombreEsquema());
		return lu_usuario;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IUsuarioBusiness#agregarUsuarioCache(java.lang.String, java.lang.String)
	 */
	@Override
	public void agregarUsuarioCache(String as_nombreUsuario, String as_idAsociacion) {
		UsuarioSesionDTO lu_usuario = consultarUsuarioSesion(as_nombreUsuario);
		lu_usuario.setIs_idAsociacion(as_idAsociacion);
		agregarDato(lu_usuario.getIs_nombreUsuario(), lu_usuario, EnumCache.USUARIOS.getIs_nombreEsquema());
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IUsuarioBusiness#agregarUsuarioCache(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioSesionDTO)
	 */
	@AuditoriaInicioSesionAnotacion
	@Override
	public void agregarUsuarioCache(UsuarioSesionDTO as_usuario) {
		agregarDato(as_usuario.getIs_nombreUsuario(), as_usuario, EnumCache.USUARIOS.getIs_nombreEsquema());
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IUsuarioBusiness#removerUsuarioCache(java.lang.String)
	 */
	@Override
	public void removerUsuarioCache(String as_nombreUsuario) {
		removerDato(as_nombreUsuario, EnumCache.USUARIOS.getIs_nombreEsquema());
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IUsuarioBusiness#actualizarUsuarioSesionCache(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioSesionDTO)
	 */
	@Override
	public void actualizarUsuarioSesionCache(UsuarioSesionDTO aus_usuarioDto) {
		removerUsuarioCache(aus_usuarioDto.getIs_nombreUsuario());
		agregarUsuarioCache(aus_usuarioDto.getIs_nombreUsuario(), aus_usuarioDto.getIs_idAsociacion());
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IUsuarioBusiness#actualizarUsuarioSesionCache(java.lang.String)
	 */
	@Override
	public void actualizarUsuarioSesionCache(String as_usuarioNombre) {
		actualizarUsuarioSesionCache(
				UsuarioSesionHelper.entidadADtoCompleto(iiu_usuarioDAO.consultarUsuario(as_usuarioNombre)));
	}

	/**
	 * Metodo que permite validar si un nuevo usuario existe en la bd.
	 *
	 * @param au_usuario usuario a cerificar
	 * @return estado si existe o no el usuario
	 */
	private Boolean validarNuevoUsuario(UsuarioDTO au_usuario) {
		return iip_personaBusiness.consultarExistenciaPersonaDocumento(
				au_usuario.getIp_personaDto().getIs_numeroDocumento(),
				au_usuario.getIp_personaDto().getItd_tipoDocumentoDto().getIs_id());
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IUsuarioBusiness#consultarTodosUsuarios()
	 */
	@Override
	public List<UsuarioDTO> consultarTodosUsuarios() {
		return UsuarioHelper.listaEntidadADtoCompleto(iiu_usuarioDAO.consultarTodosUsuarios());
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IUsuarioBusiness#consultarUsuariosAdministradores(java.lang.Integer, java.lang.Integer)
	 */
	@Override
	public List<UsuarioDTO> consultarUsuariosAdministradores(Integer ai_valorIncialPag, Integer ai_valorFinalPag) {

		String[] ls_roles = new String[] { EnumRol.ADMIN_TECNICO.getIs_rol(), EnumRol.ADMIN_NEGOCIO.getIs_rol() };

		List<UsuarioDTO> llu_usuariosDto = new ArrayList<>();
		List<UsuarioRol> llur_usuarios = iiur_usuarioRolDAO.consultarUsuariosRol(ai_valorIncialPag, ai_valorFinalPag,
				ls_roles);

		if (Objects.isNull(llur_usuarios))
			return llu_usuariosDto;

		for (UsuarioRol lur_usuarioRol : llur_usuarios)
			llu_usuariosDto.add(UsuarioHelper.entidadADtoCompleto(lur_usuarioRol.getUsuario()));

		return llu_usuariosDto;
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IUsuarioBusiness#consultarUsuariosAdministradores()
	 */
	@Override
	public List<UsuarioDTO> consultarUsuariosAdministradores() {

		String[] ls_roles = new String[] { EnumRol.ADMIN_TECNICO.getIs_rol(), EnumRol.ADMIN_NEGOCIO.getIs_rol() };

		List<UsuarioDTO> llu_usuariosDto = new ArrayList<>();
		List<UsuarioRol> llur_usuarios = iiur_usuarioRolDAO.consultarUsuariosRol(ls_roles);

		if (Objects.isNull(llur_usuarios))
			return llu_usuariosDto;

		for (UsuarioRol lur_usuarioRol : llur_usuarios)
			llu_usuariosDto.add(UsuarioHelper.entidadADtoCompleto(lur_usuarioRol.getUsuario()));

		return llu_usuariosDto;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IUsuarioBusiness#contarUsuariosAdministradores()
	 */
	@Override
	public Integer contarUsuariosAdministradores() {

		String[] ls_roles = new String[] { EnumRol.ADMIN_TECNICO.getIs_rol(), EnumRol.ADMIN_NEGOCIO.getIs_rol() };
		Integer li_cantidadUsuario;
		li_cantidadUsuario = iiur_usuarioRolDAO.contarUsuariosRol(ls_roles);

		return li_cantidadUsuario;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IUsuarioBusiness#crearUsuario(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioDTO)
	 */
	@Override
	public Boolean crearUsuario(UsuarioDTO au_usuario) {

		Usuario lu_usuario = UsuarioHelper.dtoAEntidadCompleto(au_usuario, new Usuario());
		UsuarioRol lur_usuarioRol;
		UsuarioRolDTO lur_usuarioRolDto = new UsuarioRolDTO();

		RolDTO lr_rolDto = iir_rolBusiness.consultarRoles(au_usuario.getIs_rol());

		lur_usuarioRolDto.setIs_activoDefecto(EnumEstadoActivo.VARCHAR_ACTIVO_S.getIs_codigo());
		lur_usuarioRolDto.setIs_activo(EnumEstadoActivo.VARCHAR_ACTIVO_S.getIs_codigo());
		lur_usuarioRolDto.setIr_rolDto(lr_rolDto);
		lur_usuarioRolDto = (UsuarioRolDTO) UtilidadAuditoria.adicionarDatosCreacion(lur_usuarioRolDto);

		lur_usuarioRol = UsuarioRolHelper.dtoAEntidadCompleto(lur_usuarioRolDto, new UsuarioRol());
		lur_usuarioRol.setUsuario(lu_usuario);

		return iiu_usuarioDAO.crearUsuarioRol(lu_usuario, lur_usuarioRol);
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IUsuarioBusiness#consultarUsuariosNombre(java.lang.String)
	 */
	@Override
	public List<String> consultarUsuariosNombre(String as_nombreUsuario) {
		return iiu_usuarioDAO.consultarUsuariosNombre(as_nombreUsuario);
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IUsuarioBusiness#consultarUsuarioPersonaJuridica(java.lang.String)
	 */
	@Override
	public UsuarioDTO consultarUsuarioPersonaJuridica(String as_idPersona) {
		Usuario lu_usuario = iiu_usuarioDAO.consultarUsuarioPersonaJuridica(as_idPersona);

		if (Objects.isNull(lu_usuario)) {
			return null;
		}

		return UsuarioHelper.entidadADtoCompleto(lu_usuario);
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IUsuarioBusiness#eliminarUsuarioPJRechazado(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioDTO)
	 */
	@Override
	public Boolean eliminarUsuarioPJRechazado(UsuarioDTO au_usuarioDto) {
		Boolean lb_resultado;
		lb_resultado = iiu_usuarioDAO
				.eliminarUsuarioPJRechazado(UsuarioHelper.dtoAEntidadCompleto(au_usuarioDto, new Usuario()));
		return lb_resultado;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IUsuarioBusiness#eliminarUsuario(java.lang.String)
	 */
	@Override
	public Boolean eliminarUsuario(String as_idUsuario) {
		Boolean lb_resultado;
		lb_resultado = iiu_usuarioDAO.eliminarUsuario(as_idUsuario);
		return lb_resultado;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IUsuarioBusiness#eliminarUsuarioVigenciaCompletada()
	 */
	@Override
	public Boolean eliminarUsuarioVigenciaCompletada() {
		List<Usuario> llu_resultado;

		ParametroDTO lp_parametro = iip_parametrosBusiness
				.consultarParametro(EnumParametros.DIAS_VIGENCIA_ACTIVACION.getIs_nombreParametro());
		Integer li_diasVigencia = Integer.parseInt(lp_parametro.getIs_valor());

		llu_resultado = iiu_usuarioDAO.consultarUsuariosEstado();
		Date ld_fecha = new Date();

		for (int li_contador = 0; li_contador < llu_resultado.size(); li_contador++) {
			if (UtilidadFecha.contarDias(ld_fecha,
					llu_resultado.get(li_contador).getFechaCreacion()) > li_diasVigencia) {
				iiu_usuarioDAO.eliminarUsuario(llu_resultado.get(li_contador).getId());
				HistorialSolicitudRegistroDTO lhsr_historialSolicitudRegistroDto = generarHistorialRegistro(
						UsuarioHelper.entidadADtoCompleto(llu_resultado.get(li_contador)));
				iihistorialSolicitudRegistro.crearSolicitudRegistro(lhsr_historialSolicitudRegistroDto);
				CL_LOGGER.info(
						EnumMensajesLog.USUARIO_ELIMINADO.getIs_criterio() + llu_resultado.get(li_contador).getId());
			}
		}

		return true;
	}

	/**
	 * Metodo que permite generar un historico de registro de un usuario.
	 *
	 * @param au_usuario usuario a crear historico
	 * @return Resultado para generar historial registro retornado como
	 *         HistorialSolicitudRegistroDTO
	 */
	private static HistorialSolicitudRegistroDTO generarHistorialRegistro(UsuarioDTO au_usuario) {

		HistorialSolicitudRegistroDTO lhsr_historicoSolicitudRegistro = new HistorialSolicitudRegistroDTO();

		lhsr_historicoSolicitudRegistro.setIs_datoSolicitudRegistro(au_usuario.toString());
		lhsr_historicoSolicitudRegistro
				.setIs_estadoSolicitud(EnumHistorialRegistro.TIEMPO_ACTIVACION_VENCIDO.getIs_criterio());
		lhsr_historicoSolicitudRegistro.setIs_idUsuarioAccion(EnumHistorialRegistro.SYSTEM.getIs_criterio());
		lhsr_historicoSolicitudRegistro
				.setIs_observaciones(EnumHistorialRegistro.MENSAJE_TIEMPO_ACTIVACION_VENCIDO.getIs_criterio());
		lhsr_historicoSolicitudRegistro.setIu_usuarioAccionDto(au_usuario);

		return (HistorialSolicitudRegistroDTO) UtilidadAuditoria
				.adicionarDatosCreacion(lhsr_historicoSolicitudRegistro);

	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IUsuarioBusiness#consultarExistenciaCorreoElectronico(java.lang.String)
	 */
	@Override
	public Boolean consultarExistenciaCorreoElectronico(String as_correoElectronico) {
		Boolean lb_correoElectronico;
		Usuario lu_usuario = iiu_usuarioDAO.consultarCorreoElectronico(as_correoElectronico);
		if (Objects.isNull(lu_usuario)) {
			lb_correoElectronico = false;
		}else {
			lb_correoElectronico = true;
		}
		return lb_correoElectronico;
	}
}
