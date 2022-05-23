/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ParametroDAOImpl.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.impl
 * Nombre del elemento: ParametroDAOImpl
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

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IParametroDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Parametro;
import co.gov.supernotariado.bachue.sedeelectronica.common.dao.singleton.interfaces.IEntityManagerFactory;

/**
 * Clase tipo objeto de acceso a datos (DAO). <br>
 * Permite interactuar con la base de datos manipulando y realizando operaciones
 * <br>
 * sobre el modelo de datos Parametro.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless
@LocalBean
public class ParametroDAOImpl implements IParametroDAO {

	/**
	 * Atributo de instancia tipo IEntityManagerFactory para definir la propiedad
	 * entity factory.
	 */
	@EJB
	private IEntityManagerFactory iiemf_entityFactory;

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IParametroDAO#consultarParametros()
	 */
	@Override
	public List<Parametro> consultarParametros() {	
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
		TypedQuery<Parametro> ltqp_parametroSentencia = lem_entityManager.createNamedQuery("Parametro.findAll", Parametro.class);
		List<Parametro> llp_parametros;
		llp_parametros = ltqp_parametroSentencia.getResultList();
		return llp_parametros;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IParametroDAO#actualizarParametro(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Parametro)
	 */
	@Override
	public Parametro actualizarParametro(Parametro ap_parametro) {	
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
		lem_entityManager.merge(ap_parametro);
		lem_entityManager.flush();
		return ap_parametro;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IParametroDAO#actualizarParametro(java.util.List)
	 */
	@Override
	public Boolean actualizarParametro(List<Parametro> alp_parametro) {
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
		for(Parametro obj:alp_parametro ) {
			lem_entityManager.merge(obj);
		}
		return true;	
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IParametroDAO#consultaParametro(java.lang.String)
	 */
	@Override
	public Parametro consultaParametro(String as_codigoParametro) {
		try {

			EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
			TypedQuery<Parametro> ltqp_parametroSentencia = lem_entityManager.createNamedQuery("Parametro.consultarParametroCodigo", Parametro.class);
			ltqp_parametroSentencia.setParameter("codigoParametro", as_codigoParametro);
			Parametro llp_parametros;
			llp_parametros = ltqp_parametroSentencia.getSingleResult();
			return llp_parametros;
		}
		catch (NoResultException anre_excepcion) { 
			return null;
		}
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IParametroDAO#consultarParametroPorIdTipoProceso(java.lang.String)
	 */
	@Override
	public List<Parametro> consultarParametroPorIdTipoProceso(String as_idTipoProceso) {
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();

		TypedQuery<Parametro> ltqp_resultadoParametro = lem_entityManager.createNamedQuery("Parametro.consultarParametroIdTipoProceso", Parametro.class);
		ltqp_resultadoParametro.setParameter("idTipoProceso", as_idTipoProceso);
		List<Parametro> llp_listaParametro;
		llp_listaParametro = ltqp_resultadoParametro.getResultList();
		return llp_listaParametro;
	}

}
