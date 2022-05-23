/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ModeloMinutaActoDAOImpl.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.impl
 * Nombre del elemento: ModeloMinutaActoDAOImpl
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
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IModeloMinutaActoDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.ModeloMinuta;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.ModeloMinutaActo;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.TipoActo;
import co.gov.supernotariado.bachue.sedeelectronica.common.dao.singleton.interfaces.IEntityManagerFactory;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesGenerales;

/**
 * Clase tipo objeto de acceso a datos (DAO). <br>
 * Permite interactuar con la base de datos manipulando y realizando operaciones
 * <br>
 * sobre el modelo de datos Modelo minuta acto.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless
@LocalBean
public class ModeloMinutaActoDAOImpl implements IModeloMinutaActoDAO {

	/**
	 * Atributo de instancia tipo IEntityManagerFactory para definir la propiedad
	 * entity factory.
	 */
	@EJB
	private IEntityManagerFactory iiemf_entityFactory;

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IModeloMinutaActoDAO#consultarMinutaPorTipoActo(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.TipoActo)
	 */
	@Override
	public List<ModeloMinutaActo> consultarMinutaPorTipoActo(TipoActo ata_tipoActo) {
		try {
			EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
			TypedQuery<ModeloMinutaActo> ltqmma_resultadoModeloActos = lem_entityManager
					.createNamedQuery("ModeloMinutaActo.findAllIdTipoActo", ModeloMinutaActo.class)
					.setParameter("idTipoActo", ata_tipoActo.getId());			
			List<ModeloMinutaActo> lmma_listaMinutaActos;
			lmma_listaMinutaActos = ltqmma_resultadoModeloActos.getResultList();
			return lmma_listaMinutaActos;

		} catch (DatabaseException | PersistenceException ae_excepcion) {
			throw new ExcepcionesNegocio(EnumExcepcionesGenerales.ERROR_BASE_DATOS, new String[] {}, ae_excepcion);
		}
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IModeloMinutaActoDAO#crearAsociarActo(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.ModeloMinutaActo)
	 */
	@Override
	public Boolean crearAsociarActo(ModeloMinutaActo amma_modeloMinutaActo) {
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
		lem_entityManager.persist(amma_modeloMinutaActo);
		lem_entityManager.flush();
		return true;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IModeloMinutaActoDAO#consultarTipoActoPorMinuta(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.ModeloMinuta)
	 */
	@Override
	public List<ModeloMinutaActo> consultarTipoActoPorMinuta(ModeloMinuta amm_modeloMinuta) {
		try {
			EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
			TypedQuery<ModeloMinutaActo> ltqmma_resultadoModeloActo = lem_entityManager
					.createNamedQuery("ModeloMinutaActo.findAllIdModeloMinuta", ModeloMinutaActo.class)
					.setParameter("idModeloMinuta", amm_modeloMinuta.getId());		
			
			List<ModeloMinutaActo> lmma_listaMinutaActos = ltqmma_resultadoModeloActo.getResultList();
			
			for (ModeloMinutaActo modeloMinutaActo : lmma_listaMinutaActos) {
				
				lem_entityManager.refresh(modeloMinutaActo);
			}
			
			return lmma_listaMinutaActos;
		} catch (DatabaseException | PersistenceException ae_excepcion) {
			throw new ExcepcionesNegocio(EnumExcepcionesGenerales.ERROR_BASE_DATOS, new String[] {}, ae_excepcion);
		}
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IModeloMinutaActoDAO#quitarAsociarActo(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.ModeloMinutaActo)
	 */
	@Override
	public Boolean quitarAsociarActo(ModeloMinutaActo amma_modeloMinutaActo) {
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
		//se realiza la consulta de la entidad por id para que se pueda eliminar satisfactoriamente
		ModeloMinutaActo lmma_entity = lem_entityManager.getReference(ModeloMinutaActo.class, amma_modeloMinutaActo.getId());
		lem_entityManager.remove(lmma_entity);
		lem_entityManager.flush();
		return true;
	}

}
