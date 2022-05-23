/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IntegracionTemporalDAOImpl.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.impl
 * Nombre del elemento: IntegracionTemporalDAOImpl
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
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IIntegracionTemporalDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.CirculoRegistral;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.IntegracionTemporal;
import co.gov.supernotariado.bachue.sedeelectronica.common.dao.singleton.interfaces.IEntityManagerFactory;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumEstadoActivo;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesGenerales;

/**
 * Clase tipo objeto de acceso a datos (DAO). <br>
 * Permite interactuar con la base de datos manipulando y realizando operaciones
 * <br>
 * sobre el modelo de datos Integracion temporal.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless
@LocalBean
public class IntegracionTemporalDAOImpl implements IIntegracionTemporalDAO {
	
	/**
	 * Atributo de instancia tipo IEntityManagerFactory para definir la propiedad
	 * entity factory.
	 */
	@EJB
	private IEntityManagerFactory iiemf_entityFactory;

	/**
	 * Define la constante CS_USUARIO_PARAM.
	 */
	private static final String CS_USUARIO_PARAM = "usuario";

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IIntegracionTemporalDAO#crearIntegracionTemporal(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.IntegracionTemporal)
	 */
	@Override
	public Boolean crearIntegracionTemporal(IntegracionTemporal ait_integracionTemporal) {
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
		lem_entityManager.persist(ait_integracionTemporal);
		return true;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IIntegracionTemporalDAO#eliminarTransacionTemporal(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.IntegracionTemporal)
	 */
	@Override
	public Boolean eliminarTransacionTemporal(IntegracionTemporal ait_integracionTemporal) {
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
		IntegracionTemporal lit_integracionTemporalEliminar = lem_entityManager.find(IntegracionTemporal.class,
				ait_integracionTemporal.getId());
		lem_entityManager.remove(lit_integracionTemporalEliminar);
		return true;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IIntegracionTemporalDAO#consultarCirculoRegistral()
	 */
	@Override
	public List<CirculoRegistral> consultarCirculoRegistral() {
		try {
			EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
			TypedQuery<CirculoRegistral> ltqcr_typedQueryCirculoRegistral = lem_entityManager
					.createNamedQuery("CirculoRegistral.findAll", CirculoRegistral.class);
			return ltqcr_typedQueryCirculoRegistral.getResultList();
		} catch (DatabaseException | PersistenceException ae_excepcion) {
			throw new ExcepcionesNegocio(EnumExcepcionesGenerales.ERROR_BASE_DATOS, new String[] {}, ae_excepcion);
		}
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IIntegracionTemporalDAO#consultarHistorico(java.lang.String)
	 */
	@Override
	public List<IntegracionTemporal> consultarHistorico(String as_idUsuario) {
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
		TypedQuery<IntegracionTemporal> ltqit_typedQueryIntegracion = lem_entityManager
				.createNamedQuery("IntegracionTemporal.findByUsuario", IntegracionTemporal.class);
		ltqit_typedQueryIntegracion.setParameter(CS_USUARIO_PARAM, as_idUsuario);
		ltqit_typedQueryIntegracion.setParameter("visibilidadNegativa",
				EnumEstadoActivo.VARCHAR_INACTIVO_N.getIs_codigo());
		List<IntegracionTemporal> llit_listaIntegracionTemporal;
		llit_listaIntegracionTemporal = ltqit_typedQueryIntegracion.getResultList();
		return llit_listaIntegracionTemporal;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IIntegracionTemporalDAO#consultarHistoricoConAsociacion(java.lang.String, java.lang.String)
	 */
	@Override
	public List<IntegracionTemporal> consultarHistoricoConAsociacion(String as_idUsuario, String as_idAsociacion) {
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
		TypedQuery<IntegracionTemporal> ltqit_typedQueryIntegracion = lem_entityManager
				.createNamedQuery("IntegracionTemporal.findByUsuarioConAsociacion", IntegracionTemporal.class);
		ltqit_typedQueryIntegracion.setParameter(CS_USUARIO_PARAM, as_idUsuario);
		ltqit_typedQueryIntegracion.setParameter("idAsocicacion", as_idAsociacion);
		ltqit_typedQueryIntegracion.setParameter("visibilidadNegativa",
				EnumEstadoActivo.VARCHAR_INACTIVO_N.getIs_codigo());
		List<IntegracionTemporal> llin_listaIntegracionTemporal;
		llin_listaIntegracionTemporal = ltqit_typedQueryIntegracion.getResultList();
		return llin_listaIntegracionTemporal;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IIntegracionTemporalDAO#consultarTransaccion(java.lang.String)
	 */
	@Override
	public IntegracionTemporal consultarTransaccion(String as_nir) {
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
		TypedQuery<IntegracionTemporal> ltqit_typedQueryIntegracion = lem_entityManager
				.createNamedQuery("IntegracionTemporal.findByNir", IntegracionTemporal.class);
		ltqit_typedQueryIntegracion.setParameter("nir", as_nir);
		IntegracionTemporal lin_integracionTemporal;
		lin_integracionTemporal = ltqit_typedQueryIntegracion.getSingleResult();
		return lin_integracionTemporal;
	}
	

	@Override
	public IntegracionTemporal consultarTransaccionReferencia(String as_referencia) {
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
		TypedQuery<IntegracionTemporal> ltqit_typedQueryIntegracion = lem_entityManager
				.createNamedQuery("IntegracionTemporal.findByRef", IntegracionTemporal.class);
		ltqit_typedQueryIntegracion.setParameter("referencia", as_referencia);
		IntegracionTemporal lit_integracionTemporal;
		lit_integracionTemporal = ltqit_typedQueryIntegracion.getSingleResult();
		return lit_integracionTemporal;
	}


	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IIntegracionTemporalDAO#consultarTipoProceso(java.lang.String, java.lang.String)
	 */
	@Override
	public IntegracionTemporal consultarTipoProceso(String as_tipoProceso, String as_idUsuario) {
		IntegracionTemporal lit_integracionTemporal = null;
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
		TypedQuery<IntegracionTemporal> ltqit_typedQueryIntegracion = lem_entityManager
				.createNamedQuery("IntegracionTemporal.findByRecarga", IntegracionTemporal.class);
		ltqit_typedQueryIntegracion.setParameter("tipoProceso", as_tipoProceso);
		ltqit_typedQueryIntegracion.setParameter(CS_USUARIO_PARAM, as_idUsuario);
		if (ltqit_typedQueryIntegracion.getSingleResult() != null)
			lit_integracionTemporal = ltqit_typedQueryIntegracion.getSingleResult();

		return lit_integracionTemporal;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IIntegracionTemporalDAO#modificarIntegracion(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.IntegracionTemporal)
	 */
	@Override
	public IntegracionTemporal modificarIntegracion(IntegracionTemporal ait_integracionTemporal) {
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
		lem_entityManager.merge(ait_integracionTemporal);
		return ait_integracionTemporal;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IIntegracionTemporalDAO#consultarIntegracionCE(java.lang.String, java.lang.String)
	 */
	@Override
	public List<IntegracionTemporal> consultarIntegracionCE(String as_visibilidad, String as_idUsuario) {
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
		TypedQuery<IntegracionTemporal> ltqit_typedQueryIntegracion = lem_entityManager
				.createNamedQuery("IntegracionTemporal.findByVisibilidad", IntegracionTemporal.class);
		ltqit_typedQueryIntegracion.setParameter(CS_USUARIO_PARAM, as_idUsuario);
		ltqit_typedQueryIntegracion.setParameter("visibilidad", as_visibilidad);
		List<IntegracionTemporal> llit_integracionTemporal = null;
		llit_integracionTemporal = ltqit_typedQueryIntegracion.getResultList();
		return llit_integracionTemporal;
	}

}
