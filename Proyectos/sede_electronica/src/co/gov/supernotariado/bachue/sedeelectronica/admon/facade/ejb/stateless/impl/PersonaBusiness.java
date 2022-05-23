/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: PersonaBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl
 * Nombre del elemento: PersonaBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl;

import java.util.Objects;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.PersistenceException;

import org.eclipse.persistence.exceptions.DatabaseException;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesNegocio;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IPersonaBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoDocumentoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IUsuarioBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PersonaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TipoDocumentoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IPersonaDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.PersonaHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.TipoDocumentoHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Persona;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.TipoDocumento;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesGenerales;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadAuditoria;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica de las operaciones del recurso Persona.
 * <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "PersonaBusiness", mappedName = "PersonaBusiness")
@LocalBean
public class PersonaBusiness implements IPersonaBusiness {

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
	private IUsuarioBusiness iiub_usuarioBusiness;

	/**
	 * Atributo de instancia tipo ITipoDocumentoBusiness para definir la propiedad
	 * tipo documento business.
	 */
	@EJB
	private ITipoDocumentoBusiness iitdb_tipoDocumentoBusiness;


	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IPersonaBusiness#crearPersona(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PersonaDTO)
	 */
	@Override
	public Boolean crearPersona(PersonaDTO ap_personaDto) {

		PersonaDTO lp_personaDto = (PersonaDTO) UtilidadAuditoria.adicionarDatosCreacion(ap_personaDto);
		Persona lp_persona = PersonaHelper.dtoAEntidadCompleto(lp_personaDto, new Persona());

		TipoDocumentoDTO ltd_tipoDocumento = iitdb_tipoDocumentoBusiness.consultarTipoDocumentoCompleto(ap_personaDto.getItd_tipoDocumentoDto().getIs_id());		
		lp_persona.setTipoDocumento(TipoDocumentoHelper.dtoAEntidadCompleto(ltd_tipoDocumento, new TipoDocumento()));
		Boolean lb_estadoCreacion = false;

		try {
			lb_estadoCreacion = iip_personaDao.crearPersona(lp_persona);
		} catch (DatabaseException | PersistenceException ae_excepcion) {
			throw new ExcepcionesNegocio(EnumExcepcionesGenerales.ERROR_BASE_DATOS);
		}

		return lb_estadoCreacion;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IPersonaBusiness#consultarPersonaDocumento(java.lang.String, java.lang.String)
	 */
	@Override
	public PersonaDTO consultarPersonaDocumento(String as_numeroDocumento, String as_tipoDocumento) {

		Persona lp_persona = iip_personaDao.consultarPersonaDocumento(as_numeroDocumento , as_tipoDocumento);

		if (lp_persona == null) 
			return null;

		PersonaDTO lp_personaDto;
		lp_personaDto = PersonaHelper.entidadADtoCompleto(lp_persona);

		return lp_personaDto;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IPersonaBusiness#consultarExistenciaPersonaDocumento(java.lang.String, java.lang.String)
	 */
	@Override
	public Boolean consultarExistenciaPersonaDocumento(String as_numeroDocumento, String as_tipoDocumento) {

		Persona lp_persona = iip_personaDao.consultarPersonaDocumento(as_numeroDocumento , as_tipoDocumento);

		return Objects.nonNull(lp_persona);

	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IPersonaBusiness#consultarPersonaPorId(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PersonaDTO)
	 */
	@Override
	public PersonaDTO consultarPersonaPorId(PersonaDTO ap_persona) {
		Persona lp_persona;
		lp_persona = iip_personaDao.consultarPersonaPorId(PersonaHelper.dtoAEntidadSimple(ap_persona, new Persona()));
		return PersonaHelper.entidadADtoCompleto(lp_persona);
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IPersonaBusiness#modificarPersona(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PersonaDTO)
	 */
	@Override
	public PersonaDTO modificarPersona(PersonaDTO apd_personaDto) {
		/*
		 * Datos de auditoria y complementarios al registro en el objecto personaDTO.
		 */
		apd_personaDto = (PersonaDTO) UtilidadAuditoria.adicionarDatosModificacion(apd_personaDto);
		Persona lp_persona = PersonaHelper.dtoAEntidadCompleto(apd_personaDto, new Persona());
		lp_persona = iip_personaDao.modificarPersona(lp_persona);
		return PersonaHelper.entidadADtoSimple(lp_persona);
	}
}
