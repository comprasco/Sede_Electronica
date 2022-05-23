/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: DocumentosCargadosOwccDAOImpl.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.impl
 * Nombre del elemento: DocumentosCargadosOwccDAOImpl
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.impl;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;
import javax.persistence.TypedQuery;

import org.eclipse.persistence.exceptions.DatabaseException;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesNegocio;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IDocumentosCargadosOwccDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.DocumentosCargadosOwcc;
import co.gov.supernotariado.bachue.sedeelectronica.common.dao.singleton.interfaces.IEntityManagerFactory;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesGenerales;

/**
 * Clase tipo objeto de acceso a datos (DAO). <br>
 * Permite interactuar con la base de datos manipulando y realizando operaciones
 * <br>
 * sobre el modelo de datos Documentos cargados owcc.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless
@LocalBean
public class DocumentosCargadosOwccDAOImpl implements IDocumentosCargadosOwccDAO {

	/**
	 * Atributo de instancia tipo IEntityManagerFactory para definir la propiedad
	 * entity factory.
	 */
	@EJB
	private IEntityManagerFactory iiemf_entityFactory;

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IDocumentosCargadosOwccDAO#cargarDocumentosBD(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.DocumentosCargadosOwcc)
	 */
	@Override
	public DocumentosCargadosOwcc cargarDocumentosBD(DocumentosCargadosOwcc adco_documentosCargadosOwcc) {
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
		lem_entityManager.persist(adco_documentosCargadosOwcc);
		return adco_documentosCargadosOwcc;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IDocumentosCargadosOwccDAO#consultaNirDocumentosCargados(java.lang.String)
	 */
	@Override
	public List<DocumentosCargadosOwcc> consultaNirDocumentosCargados(String as_nir) {
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();

		TypedQuery<DocumentosCargadosOwcc> ltdco_documentosCargadosOwcc = lem_entityManager
				.createNamedQuery("DocumentosCargadosOwcc.consultarPorNir", DocumentosCargadosOwcc.class);
		ltdco_documentosCargadosOwcc.setParameter("nir", as_nir);

		List<DocumentosCargadosOwcc> ldco_documentosCargadosOwcc;
		ldco_documentosCargadosOwcc = ltdco_documentosCargadosOwcc.getResultList();

		return ldco_documentosCargadosOwcc;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IDocumentosCargadosOwccDAO#borrarDocumentosCargadosOwcc(java.lang.String)
	 */
	@Override
	public Boolean borrarDocumentosCargadosOwcc(String as_consultaNir) {
		try {
			List<DocumentosCargadosOwcc> lldco_documentosCargadosOwcc = consultaNirDocumentosCargados(as_consultaNir);
			EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
			for (DocumentosCargadosOwcc ldco_documentosCargadosOwcc : lldco_documentosCargadosOwcc) {
				ldco_documentosCargadosOwcc = lem_entityManager.find(DocumentosCargadosOwcc.class, ldco_documentosCargadosOwcc.getId());
				lem_entityManager.remove(ldco_documentosCargadosOwcc);
			}
		} catch (DatabaseException | PersistenceException ae_excepcion) {
			throw new ExcepcionesNegocio(EnumExcepcionesGenerales.ERROR_BASE_DATOS, new String[] {}, ae_excepcion);
		}
		return true;

	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IDocumentosCargadosOwccDAO#consultarFormularioCuentaCupo(java.lang.String, co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioDTO, java.lang.String)
	 */
	@Override
	public Boolean consultarFormularioCuentaCupo(String as_nombreFormulario, UsuarioDTO au_usuarioDto, String as_nir) {
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();

		TypedQuery<DocumentosCargadosOwcc> ltqdco_documentosCargadosOwcc = lem_entityManager
				.createNamedQuery("DocumentosCargadosOwcc.consultarFormularioCuentaCupo", DocumentosCargadosOwcc.class);
		ltqdco_documentosCargadosOwcc.setParameter("tipoDocumental", as_nombreFormulario);
		ltqdco_documentosCargadosOwcc.setParameter("idUsuarioCreacion", au_usuarioDto.getIs_id());
		ltqdco_documentosCargadosOwcc.setParameter("nir", as_nir);	
		
		List<DocumentosCargadosOwcc> lldc_documentosCargadosOwcc;
		lldc_documentosCargadosOwcc = ltqdco_documentosCargadosOwcc.getResultList();
		
		return !lldc_documentosCargadosOwcc.isEmpty();
	}	

}
