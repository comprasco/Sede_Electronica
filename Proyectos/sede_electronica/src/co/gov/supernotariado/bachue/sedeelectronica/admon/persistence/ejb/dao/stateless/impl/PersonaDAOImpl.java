/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: PersonaDAOImpl.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.impl
 * Nombre del elemento: PersonaDAOImpl
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.impl;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IPersonaDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Direccion;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Persona;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.PersonaDireccion;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Usuario;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.UsuarioRol;
import co.gov.supernotariado.bachue.sedeelectronica.common.dao.singleton.interfaces.IEntityManagerFactory;

/**
 * Clase tipo objeto de acceso a datos (DAO). <br>
 * Permite interactuar con la base de datos manipulando y realizando operaciones
 * <br>
 * sobre el modelo de datos Persona.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless
@LocalBean
public class PersonaDAOImpl implements IPersonaDAO {

	/**
	 * Atributo de instancia tipo IEntityManagerFactory para definir la propiedad
	 * entity factory.
	 */
	@EJB
	private IEntityManagerFactory iiemf_entityFactory;

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IPersonaDAO#consultarPersonaDocumento(java.lang.String, java.lang.String)
	 */
	@Override
	public Persona consultarPersonaDocumento(String as_numeroDocumento, String as_tipoDocumento) {

		EntityManager lem_em = iiemf_entityFactory.consultarEntityManager();

		TypedQuery<Persona> ltqp_resultadoPersona = lem_em.createNamedQuery("Persona.findPersonByDocument", Persona.class);

		ltqp_resultadoPersona.setParameter("idTipoDocumento", as_tipoDocumento);  
		ltqp_resultadoPersona.setParameter("numeroDocumento", as_numeroDocumento);

		List<Persona> llp_personas = ltqp_resultadoPersona.getResultList();

		if (llp_personas.isEmpty()) 
			return null;

		return llp_personas.iterator().next();
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IPersonaDAO#consultarPersonaPorId(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Persona)
	 */
	@Override
	public Persona consultarPersonaPorId(Persona ap_persona) {
		EntityManager lem_em = iiemf_entityFactory.consultarEntityManager();
		return lem_em.find(Persona.class, ap_persona.getId()); 
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IPersonaDAO#crearPersona(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Persona)
	 */
	@Override
	public Boolean crearPersona(Persona ap_persona) {

		EntityManager lem_em = iiemf_entityFactory.consultarEntityManager();
		lem_em.persist(ap_persona);
		return true;

	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IPersonaDAO#crearPersona(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Persona, co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Usuario, co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.UsuarioRol, co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.PersonaDireccion, co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Direccion)
	 */
	@Override
	public Persona crearPersona(Persona ap_persona, Usuario au_usuario, UsuarioRol aur_usuarioRol,
			PersonaDireccion apd_personaDireccion, Direccion ad_direccion) {
		EntityManager lem_em = iiemf_entityFactory.consultarEntityManager();
		//Insercion entidad persona
		lem_em.persist(ap_persona);
		//Insercion entidad persona direccion
		lem_em.persist(ad_direccion);
		apd_personaDireccion.setPersona(ap_persona);
		apd_personaDireccion.setDireccion(ad_direccion);
		lem_em.persist(apd_personaDireccion);
		//Insercion entidad usuario
		au_usuario.setPersona(ap_persona);
		lem_em.persist(au_usuario);
		//Insercion entidad usuario rol
		aur_usuarioRol.setUsuario(au_usuario);
		lem_em.persist(aur_usuarioRol);
		return ap_persona;
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IPersonaDAO#consultarListaPersonaDocumento(java.lang.String, java.lang.String)
	 */
	@Override
	public List<Persona> consultarListaPersonaDocumento(String as_numeroDocumento, String as_tipoDocumento) {

		EntityManager lem_em = iiemf_entityFactory.consultarEntityManager();

		TypedQuery<Persona> ltqp_resultadoPersona = lem_em.createNamedQuery("Persona.findPersonByDocument", Persona.class);

		ltqp_resultadoPersona.setParameter("idTipoDocumento", as_tipoDocumento);  
		ltqp_resultadoPersona.setParameter("numeroDocumento", as_numeroDocumento);

		List<Persona> llp_personas = ltqp_resultadoPersona.getResultList();

		lem_em.close();

		return llp_personas;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IPersonaDAO#modificarPersona(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Persona)
	 */
	@Override
	public Persona modificarPersona(Persona ap_persona) {
		EntityManager lem_em = iiemf_entityFactory.consultarEntityManager();
		lem_em.merge(ap_persona);
		return ap_persona;
	}
}
