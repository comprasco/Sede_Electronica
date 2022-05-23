/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TipoCatalogoDAOImpl.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.impl
 * Nombre del elemento: TipoCatalogoDAOImpl
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

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.ITipoCatalogoDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.TipoCatalogo;
import co.gov.supernotariado.bachue.sedeelectronica.common.dao.singleton.interfaces.IEntityManagerFactory;

/**
 * Clase tipo objeto de acceso a datos (DAO). <br>
 * Permite interactuar con la base de datos manipulando y realizando operaciones
 * <br>
 * sobre el modelo de datos Tipo catalogo.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless
@LocalBean
public class TipoCatalogoDAOImpl implements ITipoCatalogoDAO {
	
	/**
	 * Atributo de instancia tipo IEntityManagerFactory para definir la propiedad
	 * entity factory.
	 */
	@EJB
	private IEntityManagerFactory iiemf_entityFactory;


	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.ITipoCatalogoDAO#crearTipoCatalogo(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.TipoCatalogo)
	 */
	@Override
	public Boolean crearTipoCatalogo(TipoCatalogo atc_tipoCatalogo) {

		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
		lem_entityManager.persist(atc_tipoCatalogo);
		return true;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.ITipoCatalogoDAO#consultarTipoCatalogoPorCodigo(java.lang.String)
	 */
	@Override
	public TipoCatalogo consultarTipoCatalogoPorCodigo(String as_codigo) {
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
		TypedQuery<TipoCatalogo> ltqtc_resultadoTipoCatalogos = lem_entityManager
				.createNamedQuery("TipoCatalogo.findByCodigo", TipoCatalogo.class).setParameter("codigo", as_codigo);
		TipoCatalogo ltc_tipoCatalogo;
		ltc_tipoCatalogo = ltqtc_resultadoTipoCatalogos.getSingleResult();
		return ltc_tipoCatalogo;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.ITipoCatalogoDAO#consultarCatalogos()
	 */
	@Override
	public List<TipoCatalogo> consultarCatalogos() {
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
		TypedQuery<TipoCatalogo> lt_resultadoTipoCatalogos = lem_entityManager.createNamedQuery("TipoCatalogo.findAll",
				TipoCatalogo.class);
		List<TipoCatalogo> lltc_catalogos;
		lltc_catalogos = lt_resultadoTipoCatalogos.getResultList();

		return lltc_catalogos;
	}
}
