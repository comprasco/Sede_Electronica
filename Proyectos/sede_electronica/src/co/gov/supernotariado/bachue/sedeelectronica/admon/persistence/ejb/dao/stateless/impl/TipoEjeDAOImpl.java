/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TipoEjeDAOImpl.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.impl
 * Nombre del elemento: TipoEjeDAOImpl
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

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.ITipoEjeDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.TipoEje;
import co.gov.supernotariado.bachue.sedeelectronica.common.dao.singleton.interfaces.IEntityManagerFactory;

/**
 * Clase tipo objeto de acceso a datos (DAO). <br>
 * Permite interactuar con la base de datos manipulando y realizando operaciones
 * <br>
 * sobre el modelo de datos Tipo eje.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless
@LocalBean
public class TipoEjeDAOImpl implements ITipoEjeDAO {
	
	/**
	 * Atributo de instancia tipo IEntityManagerFactory para definir la propiedad
	 * entity factory.
	 */
	@EJB
	private IEntityManagerFactory iiemf_entityFactory;


	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.ITipoEjeDAO#crearTipoEje(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.TipoEje)
	 */
	@Override
	public Boolean crearTipoEje(TipoEje ate_tipoEje) {
		try {
			EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
			lem_entityManager.persist(ate_tipoEje);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.ITipoEjeDAO#consultarTiposEje()
	 */
	@Override
	public List<TipoEje> consultarTiposEje() {

		EntityManager le_entityManager = iiemf_entityFactory.consultarEntityManager();

		TypedQuery<TipoEje> lt_resultadoTipoEje = le_entityManager.createNamedQuery("TipoEje.findAll", TipoEje.class);
		List<TipoEje> llte_tipoEje;
		llte_tipoEje = lt_resultadoTipoEje.getResultList();
		return llte_tipoEje;
	}
}
