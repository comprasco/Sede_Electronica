/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: HistoricoClaveDAOImpl.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.impl
 * Nombre del elemento: HistoricoClaveDAOImpl
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

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IHistoricoClaveDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.HistoricoClave;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Usuario;
import co.gov.supernotariado.bachue.sedeelectronica.common.dao.singleton.interfaces.IEntityManagerFactory;

/**
 * Clase tipo objeto de acceso a datos (DAO). <br>
 * Permite interactuar con la base de datos manipulando y realizando operaciones
 * <br>
 * sobre el modelo de datos Historico clave.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless
@LocalBean
public class HistoricoClaveDAOImpl implements IHistoricoClaveDAO {
	
	/**
	 * Atributo de instancia tipo IEntityManagerFactory para definir la propiedad
	 * entity factory.
	 */
	@EJB
	private IEntityManagerFactory iiemf_entityFactory;

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IHistoricoClaveDAO#crearHistoricoClave(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.HistoricoClave)
	 */
	@Override
	public Boolean crearHistoricoClave(HistoricoClave ahc_historicoClave) {
		try {
			EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
			lem_entityManager.persist(ahc_historicoClave);
		} catch (Exception ae_exception) {
			return false;
		}
		return true;
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IHistoricoClaveDAO#consultarHistoricoUsuario(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Usuario)
	 */
	@Override
	public List<HistoricoClave> consultarHistoricoUsuario(Usuario au_usuario)
	{
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
		TypedQuery<HistoricoClave> ltqhc_sentenciahistorialClave = lem_entityManager.createNamedQuery("HistoricoClave.findByUsuario", HistoricoClave.class);
		ltqhc_sentenciahistorialClave.setParameter("usuario", au_usuario);
		return ltqhc_sentenciahistorialClave.getResultList();
	}
}
