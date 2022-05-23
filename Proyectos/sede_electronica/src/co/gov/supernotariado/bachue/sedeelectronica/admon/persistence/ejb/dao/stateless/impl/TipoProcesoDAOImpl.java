/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TipoProcesoDAOImpl.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.impl
 * Nombre del elemento: TipoProcesoDAOImpl
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

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.ITipoProcesoDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.TipoProceso;
import co.gov.supernotariado.bachue.sedeelectronica.common.dao.singleton.interfaces.IEntityManagerFactory;

/**
 * Clase tipo objeto de acceso a datos (DAO). <br>
 * Permite interactuar con la base de datos manipulando y realizando operaciones
 * <br>
 * sobre el modelo de datos Tipo proceso.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless
@LocalBean
public class TipoProcesoDAOImpl implements ITipoProcesoDAO {

	/**
	 * Atributo de instancia tipo IEntityManagerFactory para definir la propiedad
	 * entity factory.
	 */
	@EJB
	private IEntityManagerFactory iiemf_entityFactory;


	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.ITipoProcesoDAO#crearTipoProceso(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.TipoProceso)
	 */
	@Override
	public Boolean crearTipoProceso(TipoProceso atp_tipoProceso) {
		try {
			EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
			lem_entityManager.persist(atp_tipoProceso);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.ITipoProcesoDAO#consultarTiposProceso()
	 */
	@Override
	public List<TipoProceso> consultarTiposProceso() {

		EntityManager le_entityManager = iiemf_entityFactory.consultarEntityManager();
		TypedQuery<TipoProceso> lt_resultadoTipoProceso = le_entityManager.createNamedQuery("TipoProceso.findAll",
				TipoProceso.class);
		List<TipoProceso> lltp_tiposProceso;
		lltp_tiposProceso = lt_resultadoTipoProceso.getResultList();
		return lltp_tiposProceso;
	}

}
