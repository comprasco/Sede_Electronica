/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: AlcaldiaDAOImpl.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.impl
 * Nombre del elemento: AlcaldiaDAOImpl
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

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IAlcaldiaDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.AlcaldiaParametrizacion;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.ParametrosDinamicosAlcaldia;
import co.gov.supernotariado.bachue.sedeelectronica.common.dao.singleton.interfaces.IEntityManagerFactory;

/**
 * Clase tipo objeto de acceso a datos (DAO). <br>
 * Permite interactuar con la base de datos manipulando y realizando operaciones
 * <br>
 * sobre el modelo de datos Alcaldia.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless
@LocalBean
public class AlcaldiaDAOImpl implements IAlcaldiaDAO {
	
	/**
	 * Atributo de instancia tipo IEntityManagerFactory para definir la propiedad
	 * entity factory.
	 */
	@EJB
	private IEntityManagerFactory iiemf_entityFactory;

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IAlcaldiaDAO#consultarAlcaldiasParametrizadas()
	 */
	@Override
	public List<AlcaldiaParametrizacion> consultarAlcaldiasParametrizadas() {
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();

		TypedQuery<AlcaldiaParametrizacion> ltqap_resultadoAlcadias = lem_entityManager.createNamedQuery("AlcaldiaParametrizacion.findAll", AlcaldiaParametrizacion.class);
		List<AlcaldiaParametrizacion> llap_alcaldias = ltqap_resultadoAlcadias.getResultList();

		lem_entityManager.close();
		return llap_alcaldias;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IAlcaldiaDAO#consultarAlcaldiaParametrizada(java.lang.String)
	 */
	@Override
	public AlcaldiaParametrizacion consultarAlcaldiaParametrizada(String as_idAlcaldia) {

		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();

		TypedQuery<AlcaldiaParametrizacion> ltqap_resultadoAlcadias = lem_entityManager.createNamedQuery("AlcaldiaParametrizacion.consultarId", AlcaldiaParametrizacion.class);
		ltqap_resultadoAlcadias.setParameter("idAlcaldia", as_idAlcaldia);		
		List<AlcaldiaParametrizacion> llap_alcaldias = ltqap_resultadoAlcadias.getResultList();

		if (llap_alcaldias.isEmpty()) {
			return null;
		}

		lem_entityManager.close();
		return llap_alcaldias.iterator().next();
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IAlcaldiaDAO#consultarAlcaldiaParametrizada(java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public List<AlcaldiaParametrizacion> consultarAlcaldiaParametrizada(String as_idPais, String as_idDepartamento, String as_municipio) {

		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();

		TypedQuery<AlcaldiaParametrizacion> ltqap_resultadoAlcadias = lem_entityManager.createNamedQuery("AlcaldiaParametrizacion.consultarMunicipio", AlcaldiaParametrizacion.class);
		ltqap_resultadoAlcadias.setParameter("idPais", as_idPais);		
		ltqap_resultadoAlcadias.setParameter("idDepartamento", as_idDepartamento);		
		ltqap_resultadoAlcadias.setParameter("idMunicipio", as_municipio);		
		List<AlcaldiaParametrizacion> llap_alcaldias = ltqap_resultadoAlcadias.getResultList();
		lem_entityManager.close();
		return llap_alcaldias;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IAlcaldiaDAO#actualizarAlcaldia(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.AlcaldiaParametrizacion)
	 */
	@Override
	public Boolean actualizarAlcaldia(AlcaldiaParametrizacion aap_alcadiaParametrizada) {
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();

		for (ParametrosDinamicosAlcaldia lpda_parametros : aap_alcadiaParametrizada.getParametrosDinamicosAlcaldias()) {
			lem_entityManager.merge(lpda_parametros);
		}

		lem_entityManager.merge(aap_alcadiaParametrizada);
		return true;
	}



}
