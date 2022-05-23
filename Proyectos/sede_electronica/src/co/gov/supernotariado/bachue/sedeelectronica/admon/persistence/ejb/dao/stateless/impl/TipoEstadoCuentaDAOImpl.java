/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TipoEstadoCuentaDAOImpl.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.impl
 * Nombre del elemento: TipoEstadoCuentaDAOImpl
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

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.ITipoEstadoCuentaDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.TipoEstadoCuenta;
import co.gov.supernotariado.bachue.sedeelectronica.common.dao.singleton.interfaces.IEntityManagerFactory;

/**
 * Clase tipo objeto de acceso a datos (DAO). <br>
 * Permite interactuar con la base de datos manipulando y realizando operaciones
 * <br>
 * sobre el modelo de datos Tipo estado cuenta.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless
@LocalBean
public class TipoEstadoCuentaDAOImpl implements ITipoEstadoCuentaDAO {
	
	/**
	 * Atributo de instancia tipo IEntityManagerFactory para definir la propiedad
	 * entity factory.
	 */
	@EJB
	private IEntityManagerFactory iiemf_entityFactory;


	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.ITipoEstadoCuentaDAO#crearTipoEstadoCuenta(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.TipoEstadoCuenta)
	 */
	@Override
	public Boolean crearTipoEstadoCuenta(TipoEstadoCuenta atec_tipoEstadoCuenta) {
		try {
			EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
			lem_entityManager.persist(atec_tipoEstadoCuenta);
		} catch (Exception ae_excepcion) {
			return false;
		}
		return true;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.ITipoEstadoCuentaDAO#consultarTiposEstadoCuenta()
	 */
	@Override
	public List<TipoEstadoCuenta> consultarTiposEstadoCuenta() {
		EntityManager le_entityManager = iiemf_entityFactory.consultarEntityManager();

		TypedQuery<TipoEstadoCuenta> lt_resultadoTipoEstadoCuenta = le_entityManager
				.createNamedQuery("TipoEstadoCuenta.findAll", TipoEstadoCuenta.class);
		List<TipoEstadoCuenta> lltec_tiposEstadoCuenta;
		lltec_tiposEstadoCuenta = lt_resultadoTipoEstadoCuenta.getResultList(); 
		return lltec_tiposEstadoCuenta;
	}
}
