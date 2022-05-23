/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TransaccionSolicitudModeloDAOImpl.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.impl
 * Nombre del elemento: TransaccionSolicitudModeloDAOImpl
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.impl;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceException;
import javax.persistence.TypedQuery;

import org.eclipse.persistence.exceptions.DatabaseException;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesNegocio;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.ITransaccionSolicitudModeloDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.TipoProceso;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.TransaccionSolicitudModelo;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Usuario;
import co.gov.supernotariado.bachue.sedeelectronica.common.dao.singleton.interfaces.IEntityManagerFactory;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumEstadoSolicitudSinPago;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesGenerales;

/**
 * Clase tipo objeto de acceso a datos (DAO). <br>
 * Permite interactuar con la base de datos manipulando y realizando operaciones
 * <br>
 * sobre el modelo de datos Transaccion solicitud modelo.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless
@LocalBean
public class TransaccionSolicitudModeloDAOImpl implements ITransaccionSolicitudModeloDAO {

	/**
	 * Atributo de instancia tipo IEntityManagerFactory para definir la propiedad
	 * entity factory.
	 */
	@EJB
	private IEntityManagerFactory iiemf_entityFactory;

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.ITransaccionSolicitudModeloDAO#crearTransaccionSolicitudModelo(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.TransaccionSolicitudModelo)
	 */
	@Override
	public TransaccionSolicitudModelo crearTransaccionSolicitudModelo(
			TransaccionSolicitudModelo atsm_transaccionSolicitudModelo) {
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
		atsm_transaccionSolicitudModelo
				.setIdUsuario(lem_entityManager.find(Usuario.class,
						atsm_transaccionSolicitudModelo.getIdUsuario().getId()));
		lem_entityManager.persist(atsm_transaccionSolicitudModelo);
		return atsm_transaccionSolicitudModelo;
		
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.ITransaccionSolicitudModeloDAO#consultarNir(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.TransaccionSolicitudModelo)
	 */
	@Override
	public TransaccionSolicitudModelo consultarNir(TransaccionSolicitudModelo atsm_transaccionSolicitudModelo) {
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();

		TypedQuery<TransaccionSolicitudModelo> ltqtsm_transaccionSolicitudModelo = lem_entityManager.createNamedQuery("TransaccionSolicitudModelo.consultarNir", TransaccionSolicitudModelo.class);
		ltqtsm_transaccionSolicitudModelo.setParameter("nir", atsm_transaccionSolicitudModelo.getNir());

		TransaccionSolicitudModelo ltsm_transaccionSolicitudModelo;
		try {
			ltsm_transaccionSolicitudModelo = ltqtsm_transaccionSolicitudModelo.getSingleResult();
		} catch (NoResultException anre_excepcionResultadoVacio) {
			return null;
		}
		return ltsm_transaccionSolicitudModelo;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.ITransaccionSolicitudModeloDAO#consultarTransaccionSolicitudModeloVigente(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Usuario, co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.TipoProceso)
	 */
	@Override
	public TransaccionSolicitudModelo consultarTransaccionSolicitudModeloVigente(Usuario lu_usuarioDto,
			TipoProceso ltp_tipoProceso) {
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
		TypedQuery<TransaccionSolicitudModelo> ltqtsm_transaccionSolicitudModelo = lem_entityManager
				.createNamedQuery("TransaccionSolicitudModelo.consultarTransaccion", TransaccionSolicitudModelo.class);
		ltqtsm_transaccionSolicitudModelo.setParameter("usuario", lu_usuarioDto);
		ltqtsm_transaccionSolicitudModelo.setParameter("tipoProceso", ltp_tipoProceso);
		ltqtsm_transaccionSolicitudModelo.setParameter("estadoTransaccion",
				EnumEstadoSolicitudSinPago.EN_CURSO.getIs_codigo());

		TransaccionSolicitudModelo ltsm_transaccionSolicitudModelo;
		try {
			ltsm_transaccionSolicitudModelo = ltqtsm_transaccionSolicitudModelo.getSingleResult();
		} catch (NoResultException anre_excepcionResultadoVacio) {
			return null;
		}
		return ltsm_transaccionSolicitudModelo;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.ITransaccionSolicitudModeloDAO#eliminarTansaccion(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.TransaccionSolicitudModelo)
	 */
	@Override
	public void eliminarTansaccion(TransaccionSolicitudModelo atsm_transaccionSolicitudModelo) {
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
		TransaccionSolicitudModelo ltsm_transaccionSolicitudModelo = lem_entityManager
				.find(TransaccionSolicitudModelo.class, atsm_transaccionSolicitudModelo.getId());
		lem_entityManager.remove(ltsm_transaccionSolicitudModelo);
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.ITransaccionSolicitudModeloDAO#modificarTransaccionSolicitudModelo(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.TransaccionSolicitudModelo)
	 */
	@Override
	public void modificarTransaccionSolicitudModelo(TransaccionSolicitudModelo atsm_transaccionSolicitudModelo) {
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
		lem_entityManager.merge(atsm_transaccionSolicitudModelo);
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.ITransaccionSolicitudModeloDAO#eliminarTransaccionAlertaTierras(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.TransaccionSolicitudModelo)
	 */
	@Override
	public Boolean eliminarTransaccionAlertaTierras(TransaccionSolicitudModelo atsm_transaccionSolicitudModelo) {
		try {
			EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
			atsm_transaccionSolicitudModelo = lem_entityManager.find(TransaccionSolicitudModelo.class, atsm_transaccionSolicitudModelo.getId());
			lem_entityManager.remove(atsm_transaccionSolicitudModelo);
		} catch (DatabaseException | PersistenceException ae_excepcion) {
			throw new ExcepcionesNegocio(EnumExcepcionesGenerales.ERROR_BASE_DATOS, new String[] {} , ae_excepcion);
		}
		return true;
	}

}
