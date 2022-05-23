/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IntegracionDAOImpl.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.impl
 * Nombre del elemento: IntegracionDAOImpl
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
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IIntegracionDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.CirculoRegistral;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Integracion;
import co.gov.supernotariado.bachue.sedeelectronica.common.dao.singleton.interfaces.IEntityManagerFactory;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesGenerales;

/**
 * Clase tipo objeto de acceso a datos (DAO). <br>
 * Permite interactuar con la base de datos manipulando y realizando operaciones
 * <br>
 * sobre el modelo de datos Integracion.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless
@LocalBean
public class IntegracionDAOImpl implements IIntegracionDAO {
	
	/**
	 * Atributo de instancia tipo IEntityManagerFactory para definir la propiedad
	 * entity factory.
	 */
	@EJB
	private IEntityManagerFactory iiemf_entityFactory;


	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IIntegracionDAO#crearIntegracion(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Integracion)
	 */
	@Override
	public Boolean crearIntegracion(Integracion ai_integracion) {
		try {
			EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
			lem_entityManager.persist(ai_integracion);
		} catch (Exception ae_excepcion) {
			return false;
		}
		return true;
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IIntegracionDAO#consultarCirculoRegistral()
	 */
	@Override
	public List<CirculoRegistral> consultarCirculoRegistral() {
		try {
			EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
			TypedQuery<CirculoRegistral> ltqcr_typedQueryCirculoRegistral = lem_entityManager.createNamedQuery("CirculoRegistral.findAll",CirculoRegistral.class);
			return ltqcr_typedQueryCirculoRegistral.getResultList();
		} catch (DatabaseException | PersistenceException ae_excepcion) {
			throw new ExcepcionesNegocio(EnumExcepcionesGenerales.ERROR_BASE_DATOS,new String[] {} , ae_excepcion);
		}
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IIntegracionDAO#consultarHistorico()
	 */
	@Override
	public List<Integracion> consultarHistorico() {
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
		TypedQuery<Integracion> ltqit_typedQueryIntegracion = lem_entityManager.createNamedQuery("Integracion.findAll",Integracion.class);
		List<Integracion> llin_listaIntegracionTemporal;
		llin_listaIntegracionTemporal = ltqit_typedQueryIntegracion.getResultList();
		return llin_listaIntegracionTemporal;
	}
}
