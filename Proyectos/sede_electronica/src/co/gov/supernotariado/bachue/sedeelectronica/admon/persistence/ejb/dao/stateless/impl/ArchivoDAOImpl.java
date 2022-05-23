/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ArchivoDAOImpl.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.impl
 * Nombre del elemento: ArchivoDAOImpl
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

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IArchivoDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Archivo;
import co.gov.supernotariado.bachue.sedeelectronica.common.dao.singleton.interfaces.IEntityManagerFactory;

/**
 * Clase tipo objeto de acceso a datos (DAO). <br>
 * Permite interactuar con la base de datos manipulando y realizando operaciones
 * <br>
 * sobre el modelo de datos Archivo.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless
@LocalBean
public class ArchivoDAOImpl implements IArchivoDAO {
	
	/**
	 * Atributo de instancia tipo IEntityManagerFactory para definir la propiedad
	 * entity factory.
	 */
	@EJB
	private IEntityManagerFactory iiemf_entityFactory;

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IArchivoDAO#consultarArchivoPorCodigo(java.lang.String)
	 */
	@Override
	public Archivo consultarArchivoPorCodigo(String as_codigo) {
			EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
			TypedQuery<Archivo> ltqa_tipoConsultaArchvio = lem_entityManager.createNamedQuery("Archivo.findCodigo",Archivo.class);
			ltqa_tipoConsultaArchvio.setParameter("codigo", as_codigo);
			List<Archivo> lla_archicos = ltqa_tipoConsultaArchvio.getResultList();
			if (lla_archicos.isEmpty()) 
				return null;
			return lla_archicos.iterator().next();
		
	}
}
