/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: PersonaNaturalDAOImpl.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.impl
 * Nombre del elemento: PersonaNaturalDAOImpl
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IPersonaNaturalDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Direccion;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Persona;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.PersonaDireccion;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.PersonaNatural;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Usuario;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.UsuarioRol;
import co.gov.supernotariado.bachue.sedeelectronica.common.dao.singleton.interfaces.IEntityManagerFactory;

/**
 * Clase tipo objeto de acceso a datos (DAO). <br>
 * Permite interactuar con la base de datos manipulando y realizando operaciones
 * <br>
 * sobre el modelo de datos Persona natural.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless
@LocalBean
public class PersonaNaturalDAOImpl implements IPersonaNaturalDAO {
	
	/**
	 * Atributo de instancia tipo IEntityManagerFactory para definir la propiedad
	 * entity factory.
	 */
	@EJB
	private IEntityManagerFactory iiemf_entityFactory;

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IPersonaNaturalDAO#crearPersonaNatural(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.PersonaNatural)
	 */
	@Override
	public Boolean crearPersonaNatural(PersonaNatural apn_personaNatural) {
		try {
			EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
			lem_entityManager.persist(apn_personaNatural);
		} catch (Exception ae_excepcion) {
			return false;
		}
		return true;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IPersonaNaturalDAO#crearPersonaNatural(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Persona, co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.PersonaNatural, co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Usuario, co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.UsuarioRol, co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.PersonaDireccion, co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Direccion)
	 */
	@Override
	public Usuario crearPersonaNatural(Persona ap_persona, PersonaNatural apn_personaNatural, Usuario au_usuario, UsuarioRol aur_usuarioRol, PersonaDireccion apd_personaDireccion,Direccion ad_direccion) {

		EntityManager lem_em = iiemf_entityFactory.consultarEntityManager();
		//Insercion entidad persona
		lem_em.persist(ap_persona);
		//Insercion entidad persona Natural
		apn_personaNatural.setPersona(ap_persona);
		lem_em.persist(apn_personaNatural);
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
		au_usuario.setUsuarioRols(new ArrayList<>());
		au_usuario.getUsuarioRols().add(aur_usuarioRol);
		return au_usuario;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IPersonaNaturalDAO#modificarPersonaNatural(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.PersonaNatural)
	 */
	@Override
	public Boolean modificarPersonaNatural(PersonaNatural apn_personaNatural) {

		EntityManager lem_em = iiemf_entityFactory.consultarEntityManager();
		Persona lp_persona = lem_em.find(Persona.class, apn_personaNatural.getPersona().getId());
		apn_personaNatural.setPersona(lp_persona);
		lem_em.merge(apn_personaNatural);
		return true;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IPersonaNaturalDAO#consultarPersonaNatural(java.lang.String)
	 */
	@Override
	public PersonaNatural consultarPersonaNatural(String as_numeroDocumento) {
		EntityManager lem_em = iiemf_entityFactory.consultarEntityManager();

		TypedQuery<PersonaNatural> ltqpn_personaNatural = lem_em.createNamedQuery("PersonaNatural.consultarPersonaNatural", PersonaNatural.class);
		ltqpn_personaNatural.setParameter("numeroDocumento", as_numeroDocumento);

		List<PersonaNatural> llpj_personaNatural = ltqpn_personaNatural.getResultList();	

		if (llpj_personaNatural.isEmpty())
			return null;

		return llpj_personaNatural.iterator().next();
	}
}
