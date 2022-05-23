/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: DetalleCatalogoDAOImpl.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.impl
 * Nombre del elemento: DetalleCatalogoDAOImpl
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

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IDetalleCatalogoDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Catalogo;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.DetalleCatalogo;
import co.gov.supernotariado.bachue.sedeelectronica.common.dao.singleton.interfaces.IEntityManagerFactory;

/**
 * Clase tipo objeto de acceso a datos (DAO). <br>
 * Permite interactuar con la base de datos manipulando y realizando operaciones
 * <br>
 * sobre el modelo de datos Detalle catalogo.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless
@LocalBean
public class DetalleCatalogoDAOImpl implements IDetalleCatalogoDAO {

	/**
	 * Atributo de instancia tipo IEntityManagerFactory para definir la propiedad
	 * entity factory.
	 */
	@EJB
	private IEntityManagerFactory iiemf_entityFactory;
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IDetalleCatalogoDAO#consultarDetallesCatalogos()
	 */
	@Override
	public List<DetalleCatalogo> consultarDetallesCatalogos() {
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
		TypedQuery<DetalleCatalogo> ltqdc_queryDetalleCatalogo = lem_entityManager.createNamedQuery("DetalleCatalogo.findAll",DetalleCatalogo.class);		
		return ltqdc_queryDetalleCatalogo.getResultList();
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IDetalleCatalogoDAO#consultarDetallesCatalogos(java.lang.String)
	 */
	@Override
	public List<DetalleCatalogo> consultarDetallesCatalogos(String as_codigoServicio) {
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
		TypedQuery<DetalleCatalogo> ltqdc_queryDetalleCatalogo = lem_entityManager.createNamedQuery("DetalleCatalogo.findByCodigoServicio",DetalleCatalogo.class);
		ltqdc_queryDetalleCatalogo.setParameter("codigoServicio", as_codigoServicio);
		return ltqdc_queryDetalleCatalogo.getResultList();
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IDetalleCatalogoDAO#consultarDetalleCatalogo(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Catalogo)
	 */
	@Override
	public DetalleCatalogo consultarDetalleCatalogo(Catalogo ac_catalogo) {
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
		TypedQuery<DetalleCatalogo> ltqdc_queryDetalleCatalogo = lem_entityManager.createNamedQuery("DetalleCatalogo.findByCatalogo",DetalleCatalogo.class);
		ltqdc_queryDetalleCatalogo.setParameter("catalogo", ac_catalogo);
		return ltqdc_queryDetalleCatalogo.getSingleResult();
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IDetalleCatalogoDAO#consultarDetalleCatalogo(java.lang.String)
	 */
	@Override
	public DetalleCatalogo consultarDetalleCatalogo(String as_codigoSubServicio) {
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
		TypedQuery<DetalleCatalogo> ltqdc_queryDetalleCatalogo = lem_entityManager.createNamedQuery("DetalleCatalogo.findBySubServicio",DetalleCatalogo.class);
		ltqdc_queryDetalleCatalogo.setParameter("subServicio", as_codigoSubServicio);
		return ltqdc_queryDetalleCatalogo.getSingleResult();
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IDetalleCatalogoDAO#consultarDetalleCatalogoTipoDocumental(java.lang.String)
	 */
	@Override
	public List<DetalleCatalogo> consultarDetalleCatalogoTipoDocumental(String as_idCodigoServicio) {
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
		TypedQuery<DetalleCatalogo> ltqdc_queryDetalleCatalogo = lem_entityManager.createNamedQuery("DetalleCatalogo.findByIdCodigoServicio",DetalleCatalogo.class);
		ltqdc_queryDetalleCatalogo.setParameter("idCodigoServicio", as_idCodigoServicio);
		return ltqdc_queryDetalleCatalogo.getResultList();
	}
}
