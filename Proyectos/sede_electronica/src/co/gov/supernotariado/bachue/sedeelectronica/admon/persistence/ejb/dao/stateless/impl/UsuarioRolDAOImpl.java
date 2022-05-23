/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: UsuarioRolDAOImpl.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.impl
 * Nombre del elemento: UsuarioRolDAOImpl
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.impl;

import java.util.Arrays;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IUsuarioRolDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.PersonaDireccion;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.UsuarioRol;
import co.gov.supernotariado.bachue.sedeelectronica.common.dao.singleton.interfaces.IEntityManagerFactory;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumBoolean;

/**
 * Clase tipo objeto de acceso a datos (DAO). <br>
 * Permite interactuar con la base de datos manipulando y realizando operaciones
 * <br>
 * sobre el modelo de datos Usuario rol.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless
@LocalBean
public class UsuarioRolDAOImpl implements IUsuarioRolDAO {

	/**
	 * Atributo de instancia tipo IEntityManagerFactory para definir la propiedad
	 * entity factory.
	 */
	@EJB
	private IEntityManagerFactory iiemf_entityFactory;

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IUsuarioRolDAO#crearUsuarioRol(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.UsuarioRol, co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.PersonaDireccion)
	 */
	@Override
	public Boolean crearUsuarioRol(UsuarioRol aur_usuarioRol, PersonaDireccion apd_personaDireccion) {
		try {
			EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
			lem_entityManager.persist(apd_personaDireccion.getPersona());
			lem_entityManager.persist(apd_personaDireccion.getPersona().getPersonaJuridica());
			lem_entityManager.persist(apd_personaDireccion);
			lem_entityManager.persist(aur_usuarioRol.getUsuario());
			lem_entityManager.persist(aur_usuarioRol);
		} catch (Exception ae_excepcion) {
			return false;
		}
		return true;
	}

	/**
	 * Metodo que se encarga de consultar rol de usuario.
	 *
	 * @param as_nombreUsuario el parametro nombre usuario
	 * @return Resultado para consultar rol usuario nombre retornado como UsuarioRol
	 */
	public UsuarioRol consultarRolUsuarioNombre(String as_nombreUsuario) {
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
		TypedQuery<UsuarioRol> ltqur_usuariosRoles = lem_entityManager
				.createNamedQuery("UsuarioRol.consultaUsuarioRolNombre", UsuarioRol.class);
		ltqur_usuariosRoles.setParameter("nombreUsuario", as_nombreUsuario);

		List<UsuarioRol> lur_usuario;
		lur_usuario = ltqur_usuariosRoles.getResultList();

		if (lur_usuario.isEmpty()) {
			return null;
		}
		return lur_usuario.iterator().next();
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IUsuarioRolDAO#consultarEstadoUsuarioRol(java.lang.String)
	 */
	@Override
	public UsuarioRol consultarEstadoUsuarioRol(String as_nombreUsuario) {

		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
		TypedQuery<UsuarioRol> ltqur_usuariosRoles = lem_entityManager
				.createNamedQuery("UsuarioRol.consultaUsuarioEstadoRol", UsuarioRol.class);
		ltqur_usuariosRoles.setParameter("estado", EnumBoolean.CHAR_S.getIs_codigo());
		ltqur_usuariosRoles.setParameter("nombreUsuario", as_nombreUsuario);
		UsuarioRol lur_usuario;
		lur_usuario = ltqur_usuariosRoles.getSingleResult();

		return lur_usuario;

	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IUsuarioRolDAO#consultarRolUsuarios(java.lang.String)
	 */
	@Override
	public List<UsuarioRol> consultarRolUsuarios(String as_nombreUsuario) {
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
		TypedQuery<UsuarioRol> ltqur_resultadoTipoDocumento = lem_entityManager.createNamedQuery("UsuarioRol.findAll",
				UsuarioRol.class);
		List<UsuarioRol> llur_usuario;
		llur_usuario = ltqur_resultadoTipoDocumento.getResultList();

		return llur_usuario;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IUsuarioRolDAO#consultarUsuariosRol(java.lang.Integer, java.lang.Integer, java.lang.String[])
	 */
	@Override
	public List<UsuarioRol> consultarUsuariosRol(Integer ai_valorIncialPag, Integer ai_valorFinalPag,
			String[] as_roles) {

		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();

		TypedQuery<UsuarioRol> ltqu_usuarios = lem_entityManager.createNamedQuery("UsuarioRol.consultarUsuarioRol",
				UsuarioRol.class);
		ltqu_usuarios.setParameter("listaRol", Arrays.asList(as_roles));
		ltqu_usuarios.setFirstResult(ai_valorIncialPag);
		ltqu_usuarios.setMaxResults(ai_valorFinalPag);

		List<UsuarioRol> llu_usuarios;

		llu_usuarios = ltqu_usuarios.getResultList();
		return llu_usuarios;
	}
	
	@Override
	public List<UsuarioRol> consultarUsuariosRol(
			String[] as_roles) {

		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();

		TypedQuery<UsuarioRol> ltqu_usuarios = lem_entityManager.createNamedQuery("UsuarioRol.consultarUsuarioRol",
				UsuarioRol.class);
		ltqu_usuarios.setParameter("listaRol", Arrays.asList(as_roles));

		List<UsuarioRol> llu_usuarios;

		llu_usuarios = ltqu_usuarios.getResultList();
		return llu_usuarios;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IUsuarioRolDAO#contarUsuariosRol(java.lang.String[])
	 */
	@Override
	public Integer contarUsuariosRol(String[] as_roles) {
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();

		TypedQuery<Long> ltql_cuentaUsuarios = lem_entityManager.createNamedQuery("UsuarioRol.contarUsuariosRol",
				Long.class);
		ltql_cuentaUsuarios.setParameter("listaRol", Arrays.asList(as_roles));

		return (int) (long) ltql_cuentaUsuarios.getSingleResult();
	}

}
