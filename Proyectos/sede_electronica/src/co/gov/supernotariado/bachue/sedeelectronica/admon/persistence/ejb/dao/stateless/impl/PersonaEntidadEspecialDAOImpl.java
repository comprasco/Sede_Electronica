/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: PersonaEntidadEspecialDAOImpl.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.impl
 * Nombre del elemento: PersonaEntidadEspecialDAOImpl
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.impl;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IPersonaEntidadEspecialDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Persona;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.PersonaDireccion;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.PersonaJuridica;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Usuario;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.UsuarioRol;
import co.gov.supernotariado.bachue.sedeelectronica.common.dao.singleton.interfaces.IEntityManagerFactory;

/**
 * Clase tipo objeto de acceso a datos (DAO). <br>
 * Permite interactuar con la base de datos manipulando y realizando operaciones
 * <br>
 * sobre el modelo de datos Persona entidad especial.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless
@LocalBean
public class PersonaEntidadEspecialDAOImpl implements IPersonaEntidadEspecialDAO{

	/**
	 * Atributo de instancia tipo IEntityManagerFactory para definir la propiedad
	 * entity factory.
	 */
	@EJB
	private IEntityManagerFactory iiemf_entityFactory;

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IPersonaEntidadEspecialDAO#crearPersonaEntidadEspecial(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.PersonaJuridica)
	 */
	@Override
	public Boolean crearPersonaEntidadEspecial(PersonaJuridica apj_personaEntidadEspecial) {

		try {
			EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
			lem_entityManager.persist(apj_personaEntidadEspecial);
		} catch (Exception ae_exception) {
			return false;
		}
		return true;
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IPersonaEntidadEspecialDAO#crearPersonaEntidadEspecial(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Persona, co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.PersonaJuridica, co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Usuario, co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.UsuarioRol, co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.PersonaDireccion)
	 */
	@Override
	public Boolean crearPersonaEntidadEspecial(Persona ap_persona, PersonaJuridica apj_personaEntidadEspecial, Usuario au_usuario, UsuarioRol aur_usuarioRol, PersonaDireccion apd_personaDireccion) {

		EntityManager lem_em = iiemf_entityFactory.consultarEntityManager();
		//Insercion entidad persona
		lem_em.persist(ap_persona);
		//Insercion entidad persona entidad especial
		apj_personaEntidadEspecial.setPersona(ap_persona);
		lem_em.persist(apj_personaEntidadEspecial);
		//Insercion entidad persona direccion
		apd_personaDireccion.setPersona(ap_persona);
		lem_em.persist(apd_personaDireccion);
		//Insercion entidad usuario
		au_usuario.setPersona(ap_persona);
		lem_em.persist(au_usuario);
		//Insercion entidad usuario rol
		aur_usuarioRol.setUsuario(au_usuario);
		lem_em.persist(aur_usuarioRol);
		return true;
	}
	
}
