/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: DepartamentoDAOImpl.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.impl
 * Nombre del elemento: DepartamentoDAOImpl
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

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IDepartamentoDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Departamento;
import co.gov.supernotariado.bachue.sedeelectronica.common.dao.singleton.interfaces.IEntityManagerFactory;

/**
 * Clase tipo objeto de acceso a datos (DAO). <br>
 * Permite interactuar con la base de datos manipulando y realizando operaciones
 * <br>
 * sobre el modelo de datos Departamento.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless
@LocalBean
public class DepartamentoDAOImpl implements IDepartamentoDAO {
	
	/**
	 * Atributo de instancia tipo IEntityManagerFactory para definir la propiedad
	 * entity factory.
	 */
	@EJB
	private IEntityManagerFactory iiemf_entityFactory;


	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IDepartamentoDAO#crearDepartamento(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Departamento)
	 */
	@Override
	public Boolean crearDepartamento(Departamento ad_departamento) {
		try {
			EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
			lem_entityManager.persist(ad_departamento);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IDepartamentoDAO#consultarDepartamentos()
	 */
	public List<Departamento> consultarDepartamentos() {

		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();

		TypedQuery<Departamento> lt_resultadoDepartamento = lem_entityManager.createNamedQuery("Departamento.findAll",
				Departamento.class);
		List<Departamento> ll_departamentos;
		ll_departamentos = lt_resultadoDepartamento.getResultList();
		return ll_departamentos;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IDepartamentoDAO#consultarDepartamento(java.lang.String)
	 */
	@Override
	public Departamento consultarDepartamento(String as_idDepartamento) {

		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
		TypedQuery<Departamento> lt_resultadoDepartamento = lem_entityManager
				.createNamedQuery("Departamento.findAllIdDepartamento", Departamento.class);
		lt_resultadoDepartamento.setParameter("idDepartamento", as_idDepartamento);
		List<Departamento> lld_departamento;
		
		
		lld_departamento = lt_resultadoDepartamento.getResultList();
		
		if (lld_departamento.isEmpty()) {
			return null;
		}
		return lld_departamento.iterator().next();
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IDepartamentoDAO#consultarDepartamentos(java.lang.String)
	 */
	@Override
	public List<Departamento> consultarDepartamentos(String as_idPais) {
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();

		TypedQuery<Departamento> lt_resultadoDepartamento = lem_entityManager
				.createNamedQuery("Departamento.findAllIdPais", Departamento.class);
		lt_resultadoDepartamento.setParameter("idPais", as_idPais);
		List<Departamento> ll_departamentos;
		ll_departamentos = lt_resultadoDepartamento.getResultList();
		return ll_departamentos;
	}
}
