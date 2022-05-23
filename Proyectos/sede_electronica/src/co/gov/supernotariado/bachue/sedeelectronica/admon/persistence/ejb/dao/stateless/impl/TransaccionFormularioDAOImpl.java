/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TransaccionFormularioDAOImpl.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.impl
 * Nombre del elemento: TransaccionFormularioDAOImpl
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
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.ITransaccionFormularioDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.FormularioUsuario;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.TransaccionFormulario;
import co.gov.supernotariado.bachue.sedeelectronica.common.dao.singleton.interfaces.IEntityManagerFactory;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesGenerales;

/**
 * Clase tipo objeto de acceso a datos (DAO). <br>
 * Permite interactuar con la base de datos manipulando y realizando operaciones
 * <br>
 * sobre el modelo de datos Transaccion formulario.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless
@LocalBean
public class TransaccionFormularioDAOImpl implements ITransaccionFormularioDAO {

	/**
	 * Atributo de instancia tipo IEntityManagerFactory para definir la propiedad
	 * entity factory.
	 */
	@EJB
	private IEntityManagerFactory iiemf_entityFactory;

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.ITransaccionFormularioDAO#crearTransaccionSolicitudCuentaCupo(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.TransaccionFormulario)
	 */
	@Override
	public TransaccionFormulario crearTransaccionSolicitudFormulario(
			TransaccionFormulario atf_transaccionFormulario) {
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
		lem_entityManager.persist(atf_transaccionFormulario);
		return atf_transaccionFormulario;
		
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.ITransaccionFormularioDAO#eliminarTransaccionCuentaCupo(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.TransaccionFormulario)
	 */
	@Override
	public Boolean eliminarTransaccion(TransaccionFormulario atf_transaccionFormulario) {
		try {
			EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
			atf_transaccionFormulario = lem_entityManager.find(TransaccionFormulario.class, atf_transaccionFormulario.getId());
			lem_entityManager.remove(atf_transaccionFormulario);
		} catch (DatabaseException | PersistenceException ae_excepcion) {
			throw new ExcepcionesNegocio(EnumExcepcionesGenerales.ERROR_BASE_DATOS, new String[] {} , ae_excepcion);
		}
		return true;
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.ITransaccionFormularioDAO#consultarNir(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.TransaccionFormulario)
	 */
	@Override
	public TransaccionFormulario consultarNir(TransaccionFormulario atf_transaccionFormulario) {
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();

		TypedQuery<TransaccionFormulario> ltqtf_transaccionFormulario = lem_entityManager.createNamedQuery("TransaccionSolicitudCuentaCupo.consultarNir", TransaccionFormulario.class);
		ltqtf_transaccionFormulario.setParameter("nir", atf_transaccionFormulario.getNir());

		TransaccionFormulario ltf_transaccionFormulario;
		try {
			ltf_transaccionFormulario = ltqtf_transaccionFormulario.getSingleResult();
		} catch (NoResultException anre_excepcionResultadoVacio) {
			return null;
		}
		return ltf_transaccionFormulario;
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.ITransaccionFormularioDAO#consultarUsuarioPorId(java.lang.String)
	 */
	@Override
	public TransaccionFormulario consultarUsuarioPorId(String as_idUsuario) {
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();

		TypedQuery<TransaccionFormulario> ltqtf_transaccionFormulario = lem_entityManager.createNamedQuery("TransaccionSolicitudCuentaCupo.consultarUsuarioPorId", TransaccionFormulario.class);
		ltqtf_transaccionFormulario.setParameter("idUsuario", as_idUsuario);

		TransaccionFormulario ltf_transaccionFormulario;
		try {
			ltf_transaccionFormulario = ltqtf_transaccionFormulario.getSingleResult();
		} catch (NoResultException anre_excepcionResultadoVacio) {
			return null;
		}
		return ltf_transaccionFormulario;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.ITransaccionFormularioDAO#actualizarEstadoCuentaCupo(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.TransaccionFormulario)
	 */
	@Override
	public Boolean actualizarEstadoCuentaCupo(TransaccionFormulario atf_transaccionFormulario) {
		try {
			EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
			TransaccionFormulario ltf_transaccionFormulario;
			ltf_transaccionFormulario = lem_entityManager.find(TransaccionFormulario.class, atf_transaccionFormulario.getId());
			ltf_transaccionFormulario.setEstadoTransaccion(atf_transaccionFormulario.getEstadoTransaccion());
			lem_entityManager.merge(ltf_transaccionFormulario);
			return true;
		} catch (DatabaseException | PersistenceException ae_excepcion) {
			throw new ExcepcionesNegocio(EnumExcepcionesGenerales.ERROR_BASE_DATOS, new String[] {}, ae_excepcion);
		}
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.ITransaccionFormularioDAO#actualizarCantidadIntentosFallidos(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.TransaccionFormulario)
	 */
	@Override
	public Boolean actualizarCantidadIntentosFallidos(TransaccionFormulario atf_transaccionFormulario) {
		try {
			EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
			TransaccionFormulario ltf_transaccionFormulario;
			ltf_transaccionFormulario = lem_entityManager.find(TransaccionFormulario.class, atf_transaccionFormulario.getId());
			ltf_transaccionFormulario.setIntentosVerificacionFallida(atf_transaccionFormulario.getIntentosVerificacionFallida());
			lem_entityManager.merge(ltf_transaccionFormulario);
			return true;
		} catch (DatabaseException | PersistenceException ae_excepcion) {
			throw new ExcepcionesNegocio(EnumExcepcionesGenerales.ERROR_BASE_DATOS, new String[] {}, ae_excepcion);
		}
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.ITransaccionFormularioDAO#validarEstadoCuentaCupo(java.lang.String)
	 */
	@Override
	public TransaccionFormulario validarEstadoCuentaCupo(String as_estadoCuentaCupo) {
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();

		TypedQuery<TransaccionFormulario> ltqtf_transaccionFormulario = lem_entityManager.createNamedQuery("EstadoTransaccionSolicitudCuentaCupo.consultarEstadoCuentaCupo", TransaccionFormulario.class);
		ltqtf_transaccionFormulario.setParameter("estadoTransaccion", as_estadoCuentaCupo);

		TransaccionFormulario ltf_transaccionFormulario;
		try {
			ltf_transaccionFormulario = ltqtf_transaccionFormulario.getSingleResult();
		} catch (NoResultException anre_excepcionResultadoVacio) {
			return null;
		}
		return ltf_transaccionFormulario;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.ITransaccionFormularioDAO#consultarTransaccionCuentaCupo(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.FormularioUsuario)
	 */
	@Override
	public TransaccionFormulario consultarTransaccionFormulario(FormularioUsuario afu_formularioUsuario) {
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
		TypedQuery<TransaccionFormulario> ltqtf_transaccionFormulario = lem_entityManager.createNamedQuery("TransaccionFormulario.consultarFormularioUsuario",TransaccionFormulario.class);
		ltqtf_transaccionFormulario.setParameter("formularioUsuario", afu_formularioUsuario);
		TransaccionFormulario ltf_transaccionFormulario;
		try {
			ltf_transaccionFormulario = ltqtf_transaccionFormulario.getSingleResult();
		} catch (NoResultException anre_excepcionResultadoVacio) {
			return null;
		}
		return ltf_transaccionFormulario;
	}

}
