/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: PersonaJuridicaBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl
 * Nombre del elemento: PersonaJuridicaBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import org.apache.log4j.Logger;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesNegocio;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IPersonaBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IPersonaJuridicaBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IUsuarioBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PersonaCompletaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PersonaJuridicaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IPersonaDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IPersonaJuridicaDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.PersonaHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.PersonaJuridicaHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Persona;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.PersonaJuridica;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesInicioSesion;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadAuditoria;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica de las operaciones del recurso Persona
 * juridica. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "PersonaJuridicaBusiness", mappedName = "PersonaJuridicaBusiness")
@LocalBean
public class PersonaJuridicaBusiness implements IPersonaJuridicaBusiness {

	/**
	 * Define la constante CL_LOGGER.
	 */
	private static final Logger CL_LOGGER = Logger.getLogger(PersonaJuridicaBusiness.class);
	
	/**
	 * Atributo de instancia tipo IPersonaJuridicaDAO para definir la propiedad
	 * persona juridica DAO.
	 */
	@EJB
	private IPersonaJuridicaDAO iipj_personaJuridicaDAO;
	
	/**
	 * Atributo de instancia tipo IPersonaBusiness para definir la propiedad persona
	 * business.
	 */
	@EJB
	private IPersonaBusiness iip_personaBusiness;
	
	/**
	 * Atributo de instancia tipo IPersonaDAO para definir la propiedad persona dao.
	 */
	@EJB
	private IPersonaDAO iip_personaDao;
	
	/**
	 * Atributo de instancia tipo IUsuarioBusiness para definir la propiedad usuario
	 * business.
	 */
	@EJB
	private IUsuarioBusiness iiu_usuarioBusiness;
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IPersonaJuridicaBusiness#crearPersonaJuridica(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PersonaCompletaDTO)
	 */
	@Override
	public Boolean crearPersonaJuridica(PersonaCompletaDTO apcd_personaCompletaDto) {

		/*
		 * Datos de auditoria al registro en el objecto personaJuridicaDTO.
		 */
		PersonaJuridicaDTO lpj_personaJuridicaDto = (PersonaJuridicaDTO) UtilidadAuditoria.adicionarDatosCreacion(apcd_personaCompletaDto.getIpjd_personaJuridicaDto());
		PersonaJuridica lpj_personaJuridica = PersonaJuridicaHelper.dtoAEntidadCompleto(lpj_personaJuridicaDto, new PersonaJuridica());
		Persona lp_persona = iip_personaDao.consultarPersonaPorId(PersonaHelper.dtoAEntidadCompleto(lpj_personaJuridicaDto.getIp_personaDto(), new Persona()));
		lpj_personaJuridica.setPersona(lp_persona);
		return iipj_personaJuridicaDAO.crearPersonaJuridica(lpj_personaJuridica);
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IPersonaJuridicaBusiness#modificarPersonaJuridica(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PersonaCompletaDTO)
	 */
	@Override
	public Boolean modificarPersonaJuridica(PersonaCompletaDTO apcd_personaCompletaDto) {
		try {
			
			/*
			 * Datos de auditoria y modificados al registro en el objecto personaJuridicaDTO.
			 */
			UtilidadAuditoria.adicionarDatosModificacion(apcd_personaCompletaDto.getIpjd_personaJuridicaDto());
			PersonaJuridica lpj_personaJuridica = PersonaJuridicaHelper.dtoAEntidadCompleto(apcd_personaCompletaDto.getIpjd_personaJuridicaDto(), new PersonaJuridica());

			iip_personaBusiness.modificarPersona(apcd_personaCompletaDto.getIpd_personaDto());
			iiu_usuarioBusiness.actualizaUsuario(apcd_personaCompletaDto.getIud_usuarioDto());
			return iipj_personaJuridicaDAO.modificarPersonaJuridica(lpj_personaJuridica);
		} catch (Exception ae_excepcion) {
			CL_LOGGER.error(ae_excepcion.getMessage(),ae_excepcion);
			return false;
		}
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IPersonaJuridicaBusiness#consultarPersonaJuridica(java.lang.String)
	 */
	@Override
	public PersonaJuridicaDTO consultarPersonaJuridica(String numeroDocumento) {

		PersonaJuridica lpj_personaJuridica = iipj_personaJuridicaDAO.consultarPersonaJuridica(numeroDocumento);

		if (lpj_personaJuridica == null) 
			throw new ExcepcionesNegocio(EnumExcepcionesInicioSesion.USUARIO_NO_REGISTRADO);

		PersonaJuridicaDTO lpj_personaJuridicaDto;
		lpj_personaJuridicaDto = PersonaJuridicaHelper.entidadADtoCompleto(lpj_personaJuridica);
		return lpj_personaJuridicaDto;

	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IPersonaJuridicaBusiness#crearPersonaJuridica(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PersonaJuridicaDTO)
	 */
	@Override
	public Boolean crearPersonaJuridica(PersonaJuridicaDTO apj_personaJuridicaDto) {
		Boolean lb_estadoCreacion;
		PersonaJuridica lpj_personaJuridica = PersonaJuridicaHelper.dtoAEntidadCompleto(apj_personaJuridicaDto, new PersonaJuridica());
		lb_estadoCreacion = iipj_personaJuridicaDAO.crearPersonaJuridica(lpj_personaJuridica);
		
		return lb_estadoCreacion;
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IPersonaJuridicaBusiness#consultarDocumento(java.lang.String)
	 */
	@Override
	public List<PersonaJuridicaDTO> consultarDocumento(String as_documento) {
		return PersonaJuridicaHelper.listaEntidadADtoCompleto(iipj_personaJuridicaDAO.consultarDocumento(as_documento));
	}

}
