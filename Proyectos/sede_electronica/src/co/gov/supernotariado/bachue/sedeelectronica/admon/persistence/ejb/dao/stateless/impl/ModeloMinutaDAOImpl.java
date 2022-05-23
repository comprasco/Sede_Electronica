/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ModeloMinutaDAOImpl.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.impl
 * Nombre del elemento: ModeloMinutaDAOImpl
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
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IModeloMinutaDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.ModeloMinuta;
import co.gov.supernotariado.bachue.sedeelectronica.common.dao.singleton.interfaces.IEntityManagerFactory;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesGenerales;

/**
 * Clase tipo objeto de acceso a datos (DAO). <br>
 * Permite interactuar con la base de datos manipulando y realizando operaciones
 * <br>
 * sobre el modelo de datos Modelo minuta.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless
@LocalBean
public class ModeloMinutaDAOImpl implements IModeloMinutaDAO {

	/**
	 * Atributo de instancia tipo IEntityManagerFactory para definir la propiedad
	 * entity factory.
	 */
	@EJB
	private IEntityManagerFactory iiemf_entityFactory;

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IModeloMinutaDAO#guardarModeloMinuta(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.ModeloMinuta)
	 */
	@Override
	public boolean guardarModeloMinuta(ModeloMinuta entity) {
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
		try {

			lem_entityManager.persist(entity);
			
		} catch (DatabaseException | PersistenceException ae_excepcion) {
			throw new ExcepcionesNegocio(EnumExcepcionesGenerales.ERROR_BASE_DATOS, new String[] {}, ae_excepcion);

		}finally {
			lem_entityManager.flush();
		}
		return true;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IModeloMinutaDAO#consultarModeloMinutaPorNombre(java.lang.String)
	 */
	@Override
	public ModeloMinuta consultarModeloMinutaPorNombre(String as_nombre) {
		try {
			EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
			TypedQuery<ModeloMinuta> ltq_query = lem_entityManager.createNamedQuery("ModeloMinuta.findByNombre",
					ModeloMinuta.class);
			ltq_query.setParameter("nombre", as_nombre);
			return ltq_query.getSingleResult();

		} catch (DatabaseException | PersistenceException ae_excepcion) {
			throw new ExcepcionesNegocio(EnumExcepcionesGenerales.ERROR_BASE_DATOS, new String[] {}, ae_excepcion);
		}
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IModeloMinutaDAO#consultarModelosMinuta()
	 */
	@Override
	public List<ModeloMinuta> consultarModelosMinuta() {
		try {
			EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
			TypedQuery<ModeloMinuta> ltq_query = lem_entityManager.createNamedQuery("ModeloMinuta.findAll",
					ModeloMinuta.class);

			return ltq_query.getResultList();

		} catch (DatabaseException | PersistenceException ae_excepcion) {
			throw new ExcepcionesNegocio(EnumExcepcionesGenerales.ERROR_BASE_DATOS, new String[] {}, ae_excepcion);
		}
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IModeloMinutaDAO#actualizarModeloMinuta(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.ModeloMinuta)
	 */
	@Override
	public boolean actualizarModeloMinuta(ModeloMinuta entity) {
		try {
			EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
			lem_entityManager.merge(entity);
			lem_entityManager.flush();
		} catch (Exception ae_excepcion) {
			return false;
		}
		return true;
	}
}
