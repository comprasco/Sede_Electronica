/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: HistoricoTransaccionesDescartadasDAOImpl.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.impl
 * Nombre del elemento: HistoricoTransaccionesDescartadasDAOImpl
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.impl;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IHistoricoTransaccionesDescartadasDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.HistoricoTransaccionesDescartadas;
import co.gov.supernotariado.bachue.sedeelectronica.common.dao.singleton.interfaces.IEntityManagerFactory;

/**
 * Clase tipo objeto de acceso a datos (DAO). <br>
 * Permite interactuar con la base de datos manipulando y realizando operaciones
 * <br>
 * sobre el modelo de datos Historico transacciones descartadas.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless
@LocalBean
public class HistoricoTransaccionesDescartadasDAOImpl implements IHistoricoTransaccionesDescartadasDAO {

	/**
	 * Atributo de instancia tipo IEntityManagerFactory para definir la propiedad
	 * entity factory.
	 */
	@EJB
	private IEntityManagerFactory iiemf_entityFactory;

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IHistoricoTransaccionesDescartadasDAO#actualizarHistoricoDescartes(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.HistoricoTransaccionesDescartadas)
	 */
	@Override
	public HistoricoTransaccionesDescartadas actualizarHistoricoDescartes(
			HistoricoTransaccionesDescartadas ahtd_historicoTransaccionesDescartadas) {
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
		lem_entityManager.merge(ahtd_historicoTransaccionesDescartadas);
		return ahtd_historicoTransaccionesDescartadas;
	}

}
