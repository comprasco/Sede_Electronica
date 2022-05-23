/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: RolPermisoDAOImpl.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.impl
 * Nombre del elemento: RolPermisoDAOImpl
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.impl;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;

import javax.persistence.TypedQuery;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IRolPermisoDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.RolPermiso;
import co.gov.supernotariado.bachue.sedeelectronica.common.dao.singleton.interfaces.IEntityManagerFactory;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumBoolean;

/**
 * Clase tipo objeto de acceso a datos (DAO). <br>
 * Permite interactuar con la base de datos manipulando y realizando operaciones
 * <br>
 * sobre el modelo de datos Rol permiso.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless
@LocalBean
public class RolPermisoDAOImpl implements IRolPermisoDAO {
	
	/**
	 * Atributo de instancia tipo IEntityManagerFactory para definir la propiedad
	 * entity factory.
	 */
	@EJB
	private IEntityManagerFactory iiemf_entityFactory;

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IRolPermisoDAO#consultarAsociaciones()
	 */
	@Override
	public List<RolPermiso> consultarAsociaciones() {
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
		TypedQuery<RolPermiso> ltqrp_resultadoRolesPermiso = lem_entityManager
				.createNamedQuery("RolPermiso.consultarRolPermisoTodosEstado", RolPermiso.class);
		ltqrp_resultadoRolesPermiso.setParameter("permisoEstado", EnumBoolean.CHAR_S.getIs_codigo());
		ltqrp_resultadoRolesPermiso.setParameter("rolEstado", EnumBoolean.CHAR_S.getIs_codigo());
		ltqrp_resultadoRolesPermiso.setParameter("activo", EnumBoolean.CHAR_S.getIs_codigo());
		List<RolPermiso> llrp_listaRolesPermisos = ltqrp_resultadoRolesPermiso.getResultList();
		lem_entityManager.close();

		return llrp_listaRolesPermisos;
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IRolPermisoDAO#consultarTodasAsociaciones()
	 */
	@Override
	public List<RolPermiso> consultarTodasAsociaciones() {
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
		TypedQuery<RolPermiso> ltqrp_resultadoRolesPermiso = lem_entityManager.createNamedQuery("RolPermiso.findAll", RolPermiso.class);
		List<RolPermiso> llrp_listaRolesPermisos = ltqrp_resultadoRolesPermiso.getResultList();
		lem_entityManager.close();

		return llrp_listaRolesPermisos;
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IRolPermisoDAO#actualizarRolPermiso(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.RolPermiso)
	 */
	@Override 
	public Boolean actualizarRolPermiso(RolPermiso arp_rolPermiso) {
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
		lem_entityManager.merge(arp_rolPermiso);
		return true;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IRolPermisoDAO#crearRolPermiso(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.RolPermiso)
	 */
	@Override
	public Boolean crearRolPermiso(RolPermiso arp_rolPermiso) {
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
		lem_entityManager.persist(arp_rolPermiso);
		return true;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IRolPermisoDAO#consultarRolPermiso(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.RolPermiso)
	 */
	@Override
	public RolPermiso consultarRolPermiso(RolPermiso arp_rolPermiso) {
		try {
			EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
			TypedQuery<RolPermiso> ltqrp_resultadoRolesPermiso = lem_entityManager.createNamedQuery("RolPermiso.consultarRolPermisoPorRolYPermiso", RolPermiso.class)
					.setParameter("rol", arp_rolPermiso.getRol())
					.setParameter("permiso", arp_rolPermiso.getPermiso());
			return ltqrp_resultadoRolesPermiso.getSingleResult();

		}catch(NoResultException arne_noResultadoException) {
			return null;
		}

	}
}
