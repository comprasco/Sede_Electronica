/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TipoDocumentoDAOImpl.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.impl
 * Nombre del elemento: TipoDocumentoDAOImpl
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

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.ITipoDocumentoDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.TipoDocumento;
import co.gov.supernotariado.bachue.sedeelectronica.common.dao.singleton.interfaces.IEntityManagerFactory;

/**
 * Clase tipo objeto de acceso a datos (DAO). <br>
 * Permite interactuar con la base de datos manipulando y realizando operaciones
 * <br>
 * sobre el modelo de datos Tipo documento.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless
@LocalBean
public class TipoDocumentoDAOImpl implements ITipoDocumentoDAO {
	
	/**
	 * Atributo de instancia tipo IEntityManagerFactory para definir la propiedad
	 * entity factory.
	 */
	@EJB
	private IEntityManagerFactory iiemf_entityFactory;


	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.ITipoDocumentoDAO#crearTipoDocumento(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.TipoDocumento)
	 */
	@Override
	public Boolean crearTipoDocumento(TipoDocumento atd_tipoDocumento) {
		try {
			EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
			lem_entityManager.persist(atd_tipoDocumento);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.ITipoDocumentoDAO#consultarTiposDocumento()
	 */
	@Override
	public List<TipoDocumento> consultarTiposDocumento() {

		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
		TypedQuery<TipoDocumento> lt_resultadoTipoDocumento = lem_entityManager
				.createNamedQuery("TipoDocumento.findAll", TipoDocumento.class);
		List<TipoDocumento> lltd_documentos;
		lltd_documentos = lt_resultadoTipoDocumento.getResultList();
		return lltd_documentos;
	}
}

