/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: PermisoDAOImpl.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.impl
 * Nombre del elemento: PermisoDAOImpl
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
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IPermisoDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Permiso;
import co.gov.supernotariado.bachue.sedeelectronica.common.dao.singleton.interfaces.IEntityManagerFactory;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesGenerales;

/**
 * Clase tipo objeto de acceso a datos (DAO). <br>
 * Permite interactuar con la base de datos manipulando y realizando operaciones
 * <br>
 * sobre el modelo de datos Permiso.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless
@LocalBean
public class PermisoDAOImpl implements IPermisoDAO {
	
	/**
	 * Atributo de instancia tipo IEntityManagerFactory para definir la propiedad
	 * entity factory.
	 */
	@EJB
	private IEntityManagerFactory iiemf_entityFactory;

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IPermisoDAO#cambiarEstadoPermiso(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Permiso)
	 */
	@Override
	public Boolean cambiarEstadoPermiso(Permiso ap_permiso) {
		try {
			EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
			lem_entityManager.merge(ap_permiso);
		} catch (DatabaseException | PersistenceException ae_excepcion) {
			throw new ExcepcionesNegocio(EnumExcepcionesGenerales.ERROR_BASE_DATOS, new String[] {}, ae_excepcion);
		}
		return true;
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IPermisoDAO#consultarPermisos()
	 */
	@Override
	public List<Permiso> consultarPermisos() {
		try {
			EntityManager le_entityManager = iiemf_entityFactory.consultarEntityManager();
			TypedQuery<Permiso> ltqp_resultadoPermisos = le_entityManager.createNamedQuery("Permiso.findAll", Permiso.class);
			List<Permiso> llp_listaPermisos;
			llp_listaPermisos = ltqp_resultadoPermisos.getResultList();
			return llp_listaPermisos;
		} catch (DatabaseException | PersistenceException ae_excepcion) {
			throw new ExcepcionesNegocio(EnumExcepcionesGenerales.ERROR_BASE_DATOS, new String[] {}, ae_excepcion);
		}
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IPermisoDAO#consultarPermisosActivos()
	 */
	@Override
	public List<Permiso> consultarPermisosActivos() {
		try {
			EntityManager le_entityManager = iiemf_entityFactory.consultarEntityManager();
			TypedQuery<Permiso> ltqp_resultadoPermisos = le_entityManager.createNamedQuery("Permiso.findActivos", Permiso.class);
			List<Permiso> llp_listaPermisos;
			llp_listaPermisos = ltqp_resultadoPermisos.getResultList();
			return llp_listaPermisos;
		} catch (DatabaseException | PersistenceException ae_excepcion) {
			throw new ExcepcionesNegocio(EnumExcepcionesGenerales.ERROR_BASE_DATOS, new String[] {}, ae_excepcion);
		}
	}
	
}
