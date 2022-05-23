/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: AsociacionUsuarioPersonaJuridicaBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl
 * Nombre del elemento: AsociacionUsuarioPersonaJuridicaBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesDatosEntrada;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IAsociacionUsuarioPersonaJuridicaBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.AsociacionUsuarioPersonaJuridicaBooleanoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.AsociacionUsuarioPersonaJuridicaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioSesionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IAsociacionUsuarioPersonaJuridicaDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IUsuarioDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.AsociacionUsuarioPersonaJuridicaHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.AsociarPersonaJuridicaBooleanoHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.PersonaHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.UsuarioHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.AsociacionUsuarioPersonaJuridica;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Persona;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Usuario;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesInicioSesion;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadAuditoria;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadAutoridadUsuario;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica de las operaciones del recurso Asociacion
 * usuario persona juridica. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "AsociacionUsuarioPersonaJuridicaBusiness", mappedName = "AsociacionUsuarioPersonaJuridicaBusiness")
@LocalBean
public class AsociacionUsuarioPersonaJuridicaBusiness implements IAsociacionUsuarioPersonaJuridicaBusiness {

	/**
	 * Atributo de instancia tipo IAsociacionUsuarioPersonaJuridicaDAO para definir
	 * la propiedad asociacion usuario persona juridica DAO.
	 */
	@EJB
	private IAsociacionUsuarioPersonaJuridicaDAO iiaupj_asociacionUsuarioPersonaJuridicaDAO;
	
	/**
	 * Atributo de instancia tipo IUsuarioDAO para definir la propiedad usuario dao.
	 */
	@EJB
	private IUsuarioDAO iiu_usuarioDao;

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IAsociacionUsuarioPersonaJuridicaBusiness#consultarAsociacion(java.lang.String, java.lang.String)
	 */
	@Override
	public AsociacionUsuarioPersonaJuridicaDTO consultarAsociacion(String as_idUsuario, String as_idPersonaJuridica) {

		AsociacionUsuarioPersonaJuridicaDTO laupj_asociacionDto;
		AsociacionUsuarioPersonaJuridica laupj_asociacion = iiaupj_asociacionUsuarioPersonaJuridicaDAO
				.consultarAsociacionUsuarioPersonaJuridica(as_idUsuario, as_idPersonaJuridica);

		if (laupj_asociacion == null)
			throw new ExcepcionesDatosEntrada(EnumExcepcionesInicioSesion.INICIO_SESION_INCORRECTO);

		laupj_asociacionDto = AsociacionUsuarioPersonaJuridicaHelper.entidadADtoCompleto(laupj_asociacion);

		return laupj_asociacionDto;

	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IAsociacionUsuarioPersonaJuridicaBusiness#asociarUsuario(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.AsociacionUsuarioPersonaJuridicaBooleanoDTO)
	 */
	@Override
	public Boolean asociarUsuario(AsociacionUsuarioPersonaJuridicaBooleanoDTO aaupj_asociarUsuarioPersonaJuridicaDto) {

		AsociacionUsuarioPersonaJuridica laupj_asociacion = iiaupj_asociacionUsuarioPersonaJuridicaDAO
				.consultarAsociacion(aaupj_asociarUsuarioPersonaJuridicaDto.getIs_idAsociacion());
		laupj_asociacion.setEstadoAsociacion(aaupj_asociarUsuarioPersonaJuridicaDto.getIs_estadoAsociacion());

		return iiaupj_asociacionUsuarioPersonaJuridicaDAO.actualizaUsuario(laupj_asociacion);
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IAsociacionUsuarioPersonaJuridicaBusiness#estadoCuentaCupo(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.AsociacionUsuarioPersonaJuridicaBooleanoDTO)
	 */
	@Override
	public Boolean estadoCuentaCupo(
			AsociacionUsuarioPersonaJuridicaBooleanoDTO aaupj_asociarUsuarioPersonaJuridicaDto) {
		AsociacionUsuarioPersonaJuridica laupj_asociacionUsuarioPersonaJuridica = iiaupj_asociacionUsuarioPersonaJuridicaDAO
				.consultarAsociacion(aaupj_asociarUsuarioPersonaJuridicaDto.getIs_idAsociacion());
		laupj_asociacionUsuarioPersonaJuridica
				.setEstadoCuentaCupo(aaupj_asociarUsuarioPersonaJuridicaDto.getIs_estadoCuentaCupo());
		return iiaupj_asociacionUsuarioPersonaJuridicaDAO.actualizaUsuario(laupj_asociacionUsuarioPersonaJuridica);
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IAsociacionUsuarioPersonaJuridicaBusiness#modificacionCorreoCelular(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.AsociacionUsuarioPersonaJuridicaBooleanoDTO)
	 */
	@Override
	public Boolean modificacionCorreoCelular(
			AsociacionUsuarioPersonaJuridicaBooleanoDTO aaupj_asociarUsuarioPersonaJuridicaDto) {

		AsociacionUsuarioPersonaJuridica laupj_asociarUsuarioPersonaJuridicaDto = iiaupj_asociacionUsuarioPersonaJuridicaDAO
				.consultarAsociacion(aaupj_asociarUsuarioPersonaJuridicaDto.getIs_idAsociacion());
		laupj_asociarUsuarioPersonaJuridicaDto.setCorreoElectronicoCorporativo(
				aaupj_asociarUsuarioPersonaJuridicaDto.getIs_correoElectronicoCorporativo());
		laupj_asociarUsuarioPersonaJuridicaDto
				.setCelularCorporativo(aaupj_asociarUsuarioPersonaJuridicaDto.getIs_celularCorporativo());
		return iiaupj_asociacionUsuarioPersonaJuridicaDAO.actualizaUsuario(laupj_asociarUsuarioPersonaJuridicaDto);
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IAsociacionUsuarioPersonaJuridicaBusiness#asociarUsuarioPersonaNatural(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.AsociacionUsuarioPersonaJuridicaDTO)
	 */
	@Override
	public Boolean asociarUsuarioPersonaNatural(
			AsociacionUsuarioPersonaJuridicaDTO aaupj_asociarUsuarioPersonaJuridicaDto) {

		AsociacionUsuarioPersonaJuridicaDTO laupj_asociarUsuarioPersonaJuridicaDto = (AsociacionUsuarioPersonaJuridicaDTO) UtilidadAuditoria
				.adicionarDatosCreacion(aaupj_asociarUsuarioPersonaJuridicaDto);

		UsuarioSesionDTO lus_usuarioSesionDto;
		lus_usuarioSesionDto = UtilidadAutoridadUsuario.consultarUsuarioSesion();
		Usuario lu_usuarioAutenticado = iiu_usuarioDao.consultarUsuario(lus_usuarioSesionDto.getIs_nombreUsuario());

		UsuarioDTO lu_usuarioAutenticadoDto = UsuarioHelper.entidadADtoCompletoDTO(lu_usuarioAutenticado);
		aaupj_asociarUsuarioPersonaJuridicaDto
				.setIpj_idPersonaJuridica(lu_usuarioAutenticadoDto.getIp_personaDto().getIpj_personaJuridicaDto());

		AsociacionUsuarioPersonaJuridica laupj_asociacionUsuarioPersonaJuridica = AsociacionUsuarioPersonaJuridicaHelper
				.dtoAEntidadCompleto(laupj_asociarUsuarioPersonaJuridicaDto, new AsociacionUsuarioPersonaJuridica());

		return iiaupj_asociacionUsuarioPersonaJuridicaDAO
				.asociarUsuarioPersonaNatural(laupj_asociacionUsuarioPersonaJuridica);
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IAsociacionUsuarioPersonaJuridicaBusiness#consultarAsociacionesPJ()
	 */
	@Override
	public List<AsociacionUsuarioPersonaJuridicaDTO> consultarAsociacionesPJ() {
		UsuarioSesionDTO lus_usuarioSesionDto = null;
		UsuarioDTO lu_usuarioDto = null;
		Usuario lu_usuario;

		lus_usuarioSesionDto = UtilidadAutoridadUsuario.consultarUsuarioSesion();
		lu_usuario = iiu_usuarioDao.consultarUsuario(lus_usuarioSesionDto.getIs_nombreUsuario());

		lu_usuarioDto = UsuarioHelper.entidadADtoDireccionPersonaJuridaSinArchivo(lu_usuario);
		List<AsociacionUsuarioPersonaJuridicaDTO> llaupj_listaAsociacionUsuarioPersonaJuridicaDto;
		llaupj_listaAsociacionUsuarioPersonaJuridicaDto = consultarAsociacionesPersonaJuridica(
				lu_usuarioDto.getIpj_personaJuridicaDto().getIs_idPersona());
		return llaupj_listaAsociacionUsuarioPersonaJuridicaDto;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IAsociacionUsuarioPersonaJuridicaBusiness#consultarAsociacionesPJBooleano()
	 */
	@Override
	public List<AsociacionUsuarioPersonaJuridicaBooleanoDTO> consultarAsociacionesPJBooleano() {
		List<AsociacionUsuarioPersonaJuridicaDTO> llaupj_asociacionUsuarioPersonaJuridicaDto = consultarAsociacionesPJ();
		return AsociarPersonaJuridicaBooleanoHelper.listaDtoABooleanoSimple(llaupj_asociacionUsuarioPersonaJuridicaDto);
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IAsociacionUsuarioPersonaJuridicaBusiness#consultarAsociacionesPersonaJuridica(java.lang.String)
	 */
	@Override
	public List<AsociacionUsuarioPersonaJuridicaDTO> consultarAsociacionesPersonaJuridica(String as_idUsuario) {
		List<AsociacionUsuarioPersonaJuridica> llaupj_listaAsociacionUsuarioPersonaJuridica = iiaupj_asociacionUsuarioPersonaJuridicaDAO
				.consultarAsociacionesPJ(as_idUsuario);
		List<AsociacionUsuarioPersonaJuridicaDTO> llaupj_listaAsociacionUsuarioPersonaJuridicaDto;
		llaupj_listaAsociacionUsuarioPersonaJuridicaDto = AsociacionUsuarioPersonaJuridicaHelper
				.listaentidadADtoCompleto(llaupj_listaAsociacionUsuarioPersonaJuridica);
		return llaupj_listaAsociacionUsuarioPersonaJuridicaDto;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IAsociacionUsuarioPersonaJuridicaBusiness#consultarAsociacionesUsuarioPJ(java.lang.String)
	 */
	@Override
	public List<AsociacionUsuarioPersonaJuridicaDTO> consultarAsociacionesUsuarioPJ(String as_idUsuario) {
		List<AsociacionUsuarioPersonaJuridica> llaupj_listaAsociacionUsuarioPersonaJuridica = iiaupj_asociacionUsuarioPersonaJuridicaDAO
				.consultarAsociacionesUsuarioPJ(as_idUsuario);
		List<AsociacionUsuarioPersonaJuridicaDTO> llaupj_listaAsociacionUsuarioPersonaJuridicaDto = new ArrayList<>();
		for (AsociacionUsuarioPersonaJuridica laupj_asosiacionPersonaJuridica : llaupj_listaAsociacionUsuarioPersonaJuridica) {
			Persona lp_persona;

			AsociacionUsuarioPersonaJuridicaDTO laupj_asosiacionPersonaJuridicaDto = AsociacionUsuarioPersonaJuridicaHelper
					.entidadADtoCompleto(laupj_asosiacionPersonaJuridica);
			lp_persona = laupj_asosiacionPersonaJuridica.getUsuario().getPersona();
			UsuarioDTO lu_usuarioAsosiacionDto = new UsuarioDTO(
					laupj_asosiacionPersonaJuridicaDto.getIs_idUsuarioPersonaNatural());
			lu_usuarioAsosiacionDto.setIp_personaDto(PersonaHelper.entidadADtoCompleto(lp_persona));
			laupj_asosiacionPersonaJuridicaDto.setIu_usuarioDto(lu_usuarioAsosiacionDto);

			Persona lp_personaJuridica;
			lp_personaJuridica = laupj_asosiacionPersonaJuridica.getPersonaJuridica().getPersona();
			laupj_asosiacionPersonaJuridicaDto.getIpj_idPersonaJuridica()
					.setIp_personaDto(PersonaHelper.entidadADtoCompleto(lp_personaJuridica));
			llaupj_listaAsociacionUsuarioPersonaJuridicaDto.add(laupj_asosiacionPersonaJuridicaDto);
		}
		return llaupj_listaAsociacionUsuarioPersonaJuridicaDto;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IAsociacionUsuarioPersonaJuridicaBusiness#validarNuevaAsociacion(java.lang.String, java.lang.String)
	 */
	@Override
	public Boolean validarNuevaAsociacion(String as_numeroDocumento, String as_tipoDocumento) {
		UsuarioSesionDTO lus_usuarioSesionDto = null;
		lus_usuarioSesionDto = UtilidadAutoridadUsuario.consultarUsuarioSesion();
		UsuarioDTO lu_usuarioDto;
		lu_usuarioDto = UsuarioHelper.entidadADtoCompletoConPersonaTipoDocumento(
				iiu_usuarioDao.consultarUsuario(lus_usuarioSesionDto.getIs_nombreUsuario()));
		Usuario lu_usuario = iiu_usuarioDao.consultarUsuariosAsociacion(as_tipoDocumento, as_numeroDocumento);
		AsociacionUsuarioPersonaJuridica laupj_asociacionUsuarioPersonaJuridica = iiaupj_asociacionUsuarioPersonaJuridicaDAO
				.consultarAsociacionUsuarioPersonaJuridica(lu_usuario.getId(),
						lu_usuarioDto.getIp_personaDto().getIs_numeroDocumento());
		return laupj_asociacionUsuarioPersonaJuridica == null
				&& !lu_usuarioDto.getIp_personaDto().getIs_numeroDocumento().equals(as_numeroDocumento)
				&& !lu_usuarioDto.getIp_personaDto().getItd_tipoDocumentoDto().getIs_nombre().equals(as_tipoDocumento);
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IAsociacionUsuarioPersonaJuridicaBusiness#consultarPorId(java.lang.String)
	 */
	@Override
	public AsociacionUsuarioPersonaJuridica consultarPorId(String as_idAsociacion) {
		AsociacionUsuarioPersonaJuridica laupj_asociacionUsuarioPersonaJuridica;
		laupj_asociacionUsuarioPersonaJuridica = iiaupj_asociacionUsuarioPersonaJuridicaDAO
				.consultarAsociacion(as_idAsociacion);
		return laupj_asociacionUsuarioPersonaJuridica;
	}

}
