/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: HistoricoConsultaDAOImpl.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.impl
 * Nombre del elemento: HistoricoConsultaDAOImpl
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.impl;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IHistoricoConsultaDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.HistoricoConsulta;
import co.gov.supernotariado.bachue.sedeelectronica.common.dao.singleton.interfaces.IEntityManagerFactory;

/**
 * Clase tipo objeto de acceso a datos (DAO). <br>
 * Permite interactuar con la base de datos manipulando y realizando operaciones
 * <br>
 * sobre el modelo de datos Historico consulta.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless
@LocalBean
public class HistoricoConsultaDAOImpl implements IHistoricoConsultaDAO {
	
	/**
	 * Atributo de instancia tipo IEntityManagerFactory para definir la propiedad
	 * entity factory.
	 */
	@EJB
	private IEntityManagerFactory iiemf_entityFactory;


	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IHistoricoConsultaDAO#agregarHistorico(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.HistoricoConsulta)
	 */
	@Override
	public Boolean agregarHistorico(HistoricoConsulta ahc_historicoConsulta) {
		try {
			EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
			lem_entityManager.persist(ahc_historicoConsulta);
		} catch (Exception ae_excepcion) {
			return false;
		}
		return true;
	}
}
