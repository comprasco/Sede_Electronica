/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: CirculoRegistralDAOImpl.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.impl
 * Nombre del elemento: CirculoRegistralDAOImpl
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

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.ICirculoRegistralDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.CirculoRegistral;
import co.gov.supernotariado.bachue.sedeelectronica.common.dao.singleton.interfaces.IEntityManagerFactory;


/**
 * Clase tipo objeto de acceso a datos (DAO). <br>
 * Permite interactuar con la base de datos manipulando y realizando operaciones
 * <br>
 * sobre el modelo de datos Circulo registral.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless
@LocalBean
public class CirculoRegistralDAOImpl implements ICirculoRegistralDAO {

	/**
	 * Atributo de instancia tipo IEntityManagerFactory para definir la propiedad
	 * entity factory.
	 */
	@EJB
	private IEntityManagerFactory iiemf_entityFactory;

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.ICirculoRegistralDAO#obtenerOrips()
	 */
	@Override
	public List<CirculoRegistral> obtenerOrips() {
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
		TypedQuery<CirculoRegistral> ltqcr_resultadoCirculo = lem_entityManager
				.createNamedQuery("CirculoRegistral.findAll", CirculoRegistral.class);
		List<CirculoRegistral> llcr_listaCirculoRegistral;
		llcr_listaCirculoRegistral = ltqcr_resultadoCirculo.getResultList();
		return llcr_listaCirculoRegistral;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.ICirculoRegistralDAO#obtenerOripXCodigo(java.lang.String)
	 */
	@Override
	public CirculoRegistral obtenerOripXCodigo(String as_codigoCirculo) {
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
		TypedQuery<CirculoRegistral> ltqcr_resultadoCirculo = lem_entityManager
				.createNamedQuery("CirculoRegistral.findByCodigo", CirculoRegistral.class);
		ltqcr_resultadoCirculo.setParameter("id", as_codigoCirculo);
		CirculoRegistral lcr_circuloRegistral;
		lcr_circuloRegistral = ltqcr_resultadoCirculo.getSingleResult();
		return lcr_circuloRegistral;
	}

}
