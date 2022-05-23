/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: PersonaNaturalBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl
 * Nombre del elemento: PersonaNaturalBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import org.apache.log4j.Logger;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesNegocio;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IHistoricoClaveBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IPersonaBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IPersonaNaturalBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IUsuarioBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.DireccionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.HistoricoClaveDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PersonaCompletaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PersonaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PersonaDireccionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PersonaNaturalDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioRolDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IPersonaNaturalDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.DireccionHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.PersonaDireccionHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.PersonaHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.PersonaNaturalHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.UsuarioHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.UsuarioRolHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Direccion;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Persona;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.PersonaDireccion;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.PersonaNatural;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Usuario;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.UsuarioRol;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumBoolean;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesPersona;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadAuditoria;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica de las operaciones del recurso Persona
 * natural. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "PersonaNaturalBusiness", mappedName = "PersonaNaturalBusiness")
@LocalBean
public class PersonaNaturalBusiness implements IPersonaNaturalBusiness {

	/**
	 * Define la constante CL_LOGGER.
	 */
	private static final Logger CL_LOGGER = Logger.getLogger(PersonaNaturalBusiness.class);
	
	/**
	 * Atributo de instancia tipo IPersonaNaturalDAO para definir la propiedad
	 * persona natural DAO.
	 */
	@EJB
	private IPersonaNaturalDAO iipn_personaNaturalDAO;
	
	/**
	 * Atributo de instancia tipo IPersonaBusiness para definir la propiedad persona
	 * business.
	 */
	@EJB
	private IPersonaBusiness iip_personaBusiness;
	
	/**
	 * Atributo de instancia tipo IUsuarioBusiness para definir la propiedad usuario
	 * business.
	 */
	@EJB
	private IUsuarioBusiness iiu_usuarioBusiness;
	
	/**
	 * Atributo de instancia tipo IHistoricoClaveBusiness para definir la propiedad
	 * historico clave business.
	 */
	@EJB
	private IHistoricoClaveBusiness iihc_historicoClaveBusiness;

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IPersonaNaturalBusiness#crearPersonaNatural(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PersonaNaturalDTO)
	 */
	@Override
	public Boolean crearPersonaNatural(PersonaNaturalDTO apn_personaNaturalDto) {
		try {
			apn_personaNaturalDto = (PersonaNaturalDTO) UtilidadAuditoria.adicionarDatosCreacion(apn_personaNaturalDto);
			return iipn_personaNaturalDAO.crearPersonaNatural(
					PersonaNaturalHelper.dtoAEntidadCompleto(apn_personaNaturalDto, new PersonaNatural()));
		} catch (Exception ae_excepcion) {
			CL_LOGGER.error(ae_excepcion.getMessage(),ae_excepcion);
			
			return false;
		}
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IPersonaNaturalBusiness#crearPersonaNatural(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PersonaCompletaDTO)
	 */
	@Override
	public Boolean crearPersonaNatural(PersonaCompletaDTO apcd_personaCompletaDto) {
		try {
			/*
			 * Datos de auditoria al registro en el objecto personaDTO.
			 */
			PersonaDTO lp_personaDto = (PersonaDTO) UtilidadAuditoria.adicionarDatosCreacion(apcd_personaCompletaDto.getIpd_personaDto());

			/*
			 * Datos de auditoria al registro en el objecto personaNaturalDTO.
			 */
			PersonaNaturalDTO lpn_personaNaturalDto = (PersonaNaturalDTO) UtilidadAuditoria.adicionarDatosCreacion(apcd_personaCompletaDto.getIpnd_personaNaturalDto());

			lpn_personaNaturalDto.setIs_activo(EnumBoolean.CHAR_S.getIs_codigo());
			
			/*
			 * Datos de auditoria al registro en el objecto usuarioDTO.
			 */
			UsuarioDTO lu_usuarioDto = (UsuarioDTO) UtilidadAuditoria.adicionarDatosCreacion(apcd_personaCompletaDto.getIud_usuarioDto());
			
			lu_usuarioDto.setIs_celularConfirmado(EnumBoolean.CHAR_N.getIs_codigo());
			lu_usuarioDto.setIs_correoElectronicoConfirmado(EnumBoolean.CHAR_N.getIs_codigo());

			/*
			 * Datos de auditoria al registro en el objecto usuarioRolDTO.
			 */
			UsuarioRolDTO lur_usuariorOLdTO = (UsuarioRolDTO) UtilidadAuditoria.adicionarDatosCreacion(apcd_personaCompletaDto.getIur_usuarioRolDto());

			/*
			 * Datos de auditoria al registro en el objecto PersonaDireccionDto.
			 */
			DireccionDTO ld_direccionDto = (DireccionDTO) UtilidadAuditoria.adicionarDatosCreacion(apcd_personaCompletaDto.getIpd_personaDireccionDto());

			PersonaDireccionDTO lpd_personaDireccionDto = new PersonaDireccionDTO();
			lpd_personaDireccionDto.setId_direccion(ld_direccionDto);
			lpd_personaDireccionDto.setIs_activo(EnumBoolean.CHAR_S.getIs_codigo());
			lpd_personaDireccionDto = (PersonaDireccionDTO) UtilidadAuditoria.adicionarDatosCreacion(lpd_personaDireccionDto);
			
			Direccion ld_direccion = DireccionHelper.dtoAEntidadCompleto(ld_direccionDto, new Direccion());
			Persona lp_persona = PersonaHelper.dtoAEntidadCompleto(lp_personaDto, new Persona());
			PersonaDireccion lpd_personaDireccion = PersonaDireccionHelper.dtoAEntidadCompleto(lpd_personaDireccionDto, new PersonaDireccion());			
			PersonaNatural lpn_personaNatural = PersonaNaturalHelper.dtoAEntidadCompleto(lpn_personaNaturalDto, new PersonaNatural());
			Usuario lu_usuario = UsuarioHelper.dtoAEntidadCompleto(lu_usuarioDto, new Usuario());
			UsuarioRol lu_usuarioRol = UsuarioRolHelper.dtoAEntidadCompleto(lur_usuariorOLdTO, new UsuarioRol());
			Boolean lb_estado;
			lu_usuario = iipn_personaNaturalDAO.crearPersonaNatural(lp_persona,	lpn_personaNatural, lu_usuario, lu_usuarioRol, lpd_personaDireccion,ld_direccion);
			HistoricoClaveDTO lhc_historicoClaveDto = new HistoricoClaveDTO();
			lhc_historicoClaveDto.setIs_activo(EnumBoolean.CHAR_S.getIs_codigo());
			lhc_historicoClaveDto.setIs_claveHash(lu_usuario.getClaveHash());
			lhc_historicoClaveDto.setIu_usuarioDto(UsuarioHelper.entidadADtoCompleto(lu_usuario));
			lb_estado = iihc_historicoClaveBusiness.crearHistoricoClave(lhc_historicoClaveDto);
			return lb_estado;

		} catch (Exception ae_excepcion) {
			CL_LOGGER.error(ae_excepcion.getMessage(),ae_excepcion);			
			return false;
		}
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IPersonaNaturalBusiness#modificarPersonaNatural(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PersonaCompletaDTO)
	 */
	@Override
	public Boolean modificarPersonaNatural(PersonaCompletaDTO apcd_personaCompletaDto) {
			iip_personaBusiness.modificarPersona(apcd_personaCompletaDto.getIpd_personaDto());
			iiu_usuarioBusiness.actualizaUsuario(apcd_personaCompletaDto.getIud_usuarioDto());
			/*
			 * Datos de auditoria y modificados al registro en el objecto personaNaturalDTO.
			 */
			PersonaNaturalDTO lpn_personaNaturalDto = (PersonaNaturalDTO) UtilidadAuditoria.adicionarDatosModificacion(apcd_personaCompletaDto.getIpnd_personaNaturalDto());
			PersonaNatural lpn_personaNatural = PersonaNaturalHelper.dtoAEntidadCompleto(lpn_personaNaturalDto, new PersonaNatural());
			return iipn_personaNaturalDAO.modificarPersonaNatural(lpn_personaNatural);
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IPersonaNaturalBusiness#consultarPersonaNatural(java.lang.String)
	 */
	@Override
	public PersonaNaturalDTO consultarPersonaNatural(String as_numeroDocumento) {
		PersonaNatural lpn_personaNatural = iipn_personaNaturalDAO.consultarPersonaNatural(as_numeroDocumento);
		PersonaNaturalDTO lpn_personaNaturalDto;
		if (lpn_personaNatural == null) 
			throw new ExcepcionesNegocio(EnumExcepcionesPersona.NUMERO_DOCUMENTO_EXISTENTE);

		lpn_personaNaturalDto = PersonaNaturalHelper.entidadADtoCompleto(lpn_personaNatural);

		return lpn_personaNaturalDto;

	}
}