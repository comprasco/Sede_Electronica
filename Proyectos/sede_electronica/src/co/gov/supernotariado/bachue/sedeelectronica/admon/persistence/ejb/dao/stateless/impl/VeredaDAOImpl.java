/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: VeredaDAOImpl.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.impl
 * Nombre del elemento: VeredaDAOImpl
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
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IVeredaDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Vereda;
import co.gov.supernotariado.bachue.sedeelectronica.common.dao.singleton.interfaces.IEntityManagerFactory;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesGenerales;

/**
 * Clase tipo objeto de acceso a datos (DAO). <br>
 * Permite interactuar con la base de datos manipulando y realizando operaciones
 * <br>
 * sobre el modelo de datos Vereda.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless
@LocalBean
public class VeredaDAOImpl implements IVeredaDAO{

	/**
	 * Atributo de instancia tipo IEntityManagerFactory para definir la propiedad
	 * entity factory.
	 */
	@EJB
	private IEntityManagerFactory iiemf_entityFactory;
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IVeredaDAO#consultarVeredas()
	 */
	@Override
	public List<Vereda> consultarVeredas() {
		try {
			EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
			TypedQuery<Vereda> ltqv_resultadoVeredas = lem_entityManager.createNamedQuery("Vereda.findAll", Vereda.class);
			return ltqv_resultadoVeredas.getResultList();
		} catch (DatabaseException | PersistenceException ae_excepcion) {
			throw new ExcepcionesNegocio(EnumExcepcionesGenerales.ERROR_BASE_DATOS, new String[] {} , ae_excepcion);
		}
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IVeredaDAO#consultarVeredas(java.lang.Integer, java.lang.Integer)
	 */
	@Override
	public List<Vereda> consultarVeredas(Integer ai_valorIncialPag, Integer ai_valorFinalPag) {
		try {
			EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
			TypedQuery<Vereda> ltqv_resultadoVeredas = lem_entityManager.createNamedQuery("Vereda.findAll", Vereda.class);
			
			ltqv_resultadoVeredas.setFirstResult(ai_valorIncialPag);
			ltqv_resultadoVeredas.setMaxResults(ai_valorFinalPag);
			
			return ltqv_resultadoVeredas.getResultList();
			
		} catch (DatabaseException | PersistenceException ae_excepcion) {
			throw new ExcepcionesNegocio(EnumExcepcionesGenerales.ERROR_BASE_DATOS, new String[] {} , ae_excepcion);
		}
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IVeredaDAO#consultarVeredaMunicipio(java.lang.String)
	 */
	@Override
	public List<Vereda> consultarVeredaMunicipio(String as_idMunicipio) {
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
		TypedQuery<Vereda> ltqv_resultadoVeredasMunicipio = lem_entityManager.createNamedQuery("Vereda.findAllIdMunicipio", Vereda.class);
		ltqv_resultadoVeredasMunicipio.setParameter("idMunicipio", as_idMunicipio);
		return ltqv_resultadoVeredasMunicipio.getResultList();
	}

}
