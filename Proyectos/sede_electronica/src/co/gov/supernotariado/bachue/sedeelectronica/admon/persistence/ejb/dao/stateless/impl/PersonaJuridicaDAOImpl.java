/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: PersonaJuridicaDAOImpl.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.impl
 * Nombre del elemento: PersonaJuridicaDAOImpl
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.impl;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;
import javax.persistence.TypedQuery;

import org.eclipse.persistence.exceptions.DatabaseException;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesNegocio;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IPersonaJuridicaDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Persona;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.PersonaJuridica;
import co.gov.supernotariado.bachue.sedeelectronica.common.dao.singleton.interfaces.IEntityManagerFactory;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesGenerales;

/**
 * Clase tipo objeto de acceso a datos (DAO). <br>
 * Permite interactuar con la base de datos manipulando y realizando operaciones
 * <br>
 * sobre el modelo de datos Persona juridica.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless
@LocalBean
public class PersonaJuridicaDAOImpl implements IPersonaJuridicaDAO {

	/**
	 * Atributo de instancia tipo IEntityManagerFactory para definir la propiedad
	 * entity factory.
	 */
	@EJB
	private IEntityManagerFactory iiemf_entityFactory;

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IPersonaJuridicaDAO#modificarPersonaJuridica(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.PersonaJuridica)
	 */
	@Override
	public Boolean modificarPersonaJuridica(PersonaJuridica apj_personaJuridica) {

		EntityManager lem_em = iiemf_entityFactory.consultarEntityManager();
		Persona lp_persona = lem_em.find(Persona.class, apj_personaJuridica.getPersona().getId());
		apj_personaJuridica.setPersona(lp_persona);
		lem_em.merge(apj_personaJuridica);
		return true;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IPersonaJuridicaDAO#consultarPersonaJuridica(java.lang.String)
	 */
	@Override
	public PersonaJuridica consultarPersonaJuridica(String as_numeroDocumento) {

		EntityManager lem_em = iiemf_entityFactory.consultarEntityManager();

		TypedQuery<PersonaJuridica> ltqpj_personaJuridica = lem_em.createNamedQuery("PersonaJuridica.consultarPersonaJuridica", PersonaJuridica.class);
		ltqpj_personaJuridica.setParameter("numeroDocumento", as_numeroDocumento);

		List<PersonaJuridica> llpj_personaJuridica = ltqpj_personaJuridica.getResultList();	

		if (llpj_personaJuridica.isEmpty())
			return null;

		return llpj_personaJuridica.iterator().next();
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IPersonaJuridicaDAO#consultarDocumento(java.lang.String)
	 */
	@Override
	public List<PersonaJuridica> consultarDocumento(String as_documento) {
		try {
			EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
			TypedQuery<PersonaJuridica> ltqpj_query = lem_entityManager.createNamedQuery("PersonaJuridicaDocumento.findByNombre",
					PersonaJuridica.class);
			ltqpj_query.setParameter("nombreDocumentoCamara", as_documento);
			return ltqpj_query.getResultList();

		} catch (DatabaseException | PersistenceException ae_excepcion) {
			throw new ExcepcionesNegocio(EnumExcepcionesGenerales.ERROR_BASE_DATOS, new String[] {}, ae_excepcion);
		}
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IPersonaJuridicaDAO#crearPersonaJuridica(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.PersonaJuridica)
	 */
	@Override
	public Boolean crearPersonaJuridica(PersonaJuridica apj_personaJuridica) {
		EntityManager lem_em = iiemf_entityFactory.consultarEntityManager();
		lem_em.persist(apj_personaJuridica);

		return true;
	}
	
}
