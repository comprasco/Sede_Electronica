/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: CatalogoDAOImpl.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.impl
 * Nombre del elemento: CatalogoDAOImpl
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

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.ICatalogoDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Catalogo;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.TipoCatalogo;
import co.gov.supernotariado.bachue.sedeelectronica.common.dao.singleton.interfaces.IEntityManagerFactory;

/**
 * Clase tipo objeto de acceso a datos (DAO). <br>
 * Permite interactuar con la base de datos manipulando y realizando operaciones
 * <br>
 * sobre el modelo de datos Catalogo.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless
@LocalBean
public class CatalogoDAOImpl implements ICatalogoDAO {

	/**
	 * Atributo de instancia tipo IEntityManagerFactory para definir la propiedad
	 * entity factory.
	 */
	@EJB
	private IEntityManagerFactory iiemf_entityFactory;

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.ICatalogoDAO#actualizarCatalogo(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Catalogo)
	 */
	@Override
	public Boolean actualizarCatalogo(Catalogo ac_catalogo) {
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
		lem_entityManager.merge(ac_catalogo);
		return true;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.ICatalogoDAO#consultarCatalogoPorTipoCatalogo(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.TipoCatalogo)
	 */
	@Override
	public List<Catalogo> consultarCatalogoPorTipoCatalogo(TipoCatalogo atc_tipoCatalogo) {
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
		TypedQuery<Catalogo> ltqc_resultadoCatalogos = lem_entityManager
				.createNamedQuery("Catalogo.findAllIdTipoCatalogo", Catalogo.class)
				.setParameter("idTipoCatalogo", atc_tipoCatalogo.getId());
		List<Catalogo> llc_listaCatalogos;
		llc_listaCatalogos = ltqc_resultadoCatalogos.getResultList();
		return llc_listaCatalogos;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.ICatalogoDAO#consultarCatalogo()
	 */
	@Override
	public List<Catalogo> consultarCatalogo() {
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();

		TypedQuery<Catalogo> ltqc_resultadosCatalogos = lem_entityManager.createNamedQuery("Catalogo.findAll",
				Catalogo.class);
		List<Catalogo> llc_catalogos;
		llc_catalogos = ltqc_resultadosCatalogos.getResultList();

		return llc_catalogos;

	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.ICatalogoDAO#consultarCatalogos(java.lang.String)
	 */
	@Override
	public List<Catalogo> consultarCatalogos(String as_idTipoCatalogo) {
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();

		TypedQuery<Catalogo> ltqc_resultadoCatalogo = lem_entityManager
				.createNamedQuery("Catalogo.findAllIdTipoCatalogo", Catalogo.class);
		ltqc_resultadoCatalogo.setParameter("idTipoCatalogo", as_idTipoCatalogo);
		List<Catalogo> llc_catalogos;
		llc_catalogos = ltqc_resultadoCatalogo.getResultList();

		return llc_catalogos;
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.ICatalogoDAO#consultarCatalogosCodigoValor(java.lang.String)
	 */
	@Override
	public Catalogo consultarCatalogosCodigoValor(String as_codigo) {
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
		TypedQuery<Catalogo> ltqc_typedQueryCatalogo = lem_entityManager.createNamedQuery("Catalogo.consultarCatalogosCodigoValor",Catalogo.class);
		ltqc_typedQueryCatalogo.setParameter("codigoValor", as_codigo);
		return ltqc_typedQueryCatalogo.getSingleResult();
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.ICatalogoDAO#consultarCatalogosNombre(java.lang.String)
	 */
	@Override
	public Catalogo consultarCatalogosNombre(String as_nombre) {
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
		TypedQuery<Catalogo> ltqc_typedQueryCatalogo = lem_entityManager.createNamedQuery("Catalogo.consultarCatalogosNombre",Catalogo.class);
		ltqc_typedQueryCatalogo.setParameter("nombre", as_nombre);
		return ltqc_typedQueryCatalogo.getSingleResult();
	}

}
