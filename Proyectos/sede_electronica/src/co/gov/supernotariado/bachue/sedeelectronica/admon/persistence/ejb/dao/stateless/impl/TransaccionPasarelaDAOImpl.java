/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TransaccionPasarelaDAOImpl.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.impl
 * Nombre del elemento: TransaccionPasarelaDAOImpl
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.impl;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesNegocio;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.ITransaccionPasarelaDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.TransaccionPasarela;
import co.gov.supernotariado.bachue.sedeelectronica.common.dao.singleton.interfaces.IEntityManagerFactory;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumEstadosPasarela;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesGenerales;

/**
 * Clase tipo objeto de acceso a datos (DAO). <br>
 * Permite interactuar con la base de datos manipulando y realizando operaciones
 * <br>
 * sobre el modelo de datos Transaccion pasarela.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless
@LocalBean
public class TransaccionPasarelaDAOImpl implements ITransaccionPasarelaDAO {
	
	/**
	 * Atributo de instancia tipo IEntityManagerFactory para definir la propiedad
	 * entity factory.
	 */
	@EJB
	private IEntityManagerFactory iiemf_entityFactory;

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.ITransaccionPasarelaDAO#crearTransaccionPasarela(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.TransaccionPasarela)
	 */
	@Override
	public Boolean crearTransaccionPasarela(TransaccionPasarela atp_transaccionPasarela) {
		try {
			EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
			lem_entityManager.persist(atp_transaccionPasarela);
		} catch (Exception ae_excepcion) {
			return false;
		}
		return true;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.ITransaccionPasarelaDAO#consultarTransaccionPasarela(java.lang.String)
	 */
	@Override
	public TransaccionPasarela consultarTransaccionPasarela(String as_token) {
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();

		TypedQuery<TransaccionPasarela> ltqtp_transaccionSolicitudCarguePoder = lem_entityManager.createNamedQuery("TransaccionPasarela.consultarToken", TransaccionPasarela.class);
		ltqtp_transaccionSolicitudCarguePoder.setParameter("token", as_token);

		TransaccionPasarela ltp_transaccionSolicitudCarguePoder;
		try {
			ltp_transaccionSolicitudCarguePoder = ltqtp_transaccionSolicitudCarguePoder.getSingleResult();
		} catch (NoResultException anre_excepcionResultadoVacio) {
			return null;
		}
		return ltp_transaccionSolicitudCarguePoder;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.ITransaccionPasarelaDAO#actualizarTransaccionPasarela(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.TransaccionPasarela)
	 */
	@Override
	public Boolean actualizarTransaccionPasarela(TransaccionPasarela atp_transaccion) {
		try {
			EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
			lem_entityManager.merge(atp_transaccion);
		} catch (Exception ae_excepcion) {
			throw new ExcepcionesNegocio(EnumExcepcionesGenerales.ERROR_BASE_DATOS, new String[] {}, ae_excepcion);
		}
		return true;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.ITransaccionPasarelaDAO#consultarTransaccionesPendientes()
	 */
	@Override
	public List<TransaccionPasarela> consultarTransaccionesPendientes() {
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();

		TypedQuery<TransaccionPasarela> ltqtp_transaccionSolicitudCarguePoder = lem_entityManager.createNamedQuery("TransaccionPasarela.consultarTransacciones", TransaccionPasarela.class);
		ltqtp_transaccionSolicitudCarguePoder.setParameter("estadoPasarela", EnumEstadosPasarela.ESTADO_PENDING.getIs_criterio());
		ltqtp_transaccionSolicitudCarguePoder.setParameter("estadoPasarelaDos", EnumEstadosPasarela.ESTADO_SIN_VALIDAR.getIs_criterio());
		ltqtp_transaccionSolicitudCarguePoder.setParameter("estadoPasarelaTres",EnumEstadosPasarela.ESTADO_OK.getIs_criterio());
		ltqtp_transaccionSolicitudCarguePoder.setParameter("estadoBachue", EnumEstadosPasarela.ESTADO_OK.getIs_criterio());

		List<TransaccionPasarela> lltp_transaccionSolicitudCarguePoder;
		lltp_transaccionSolicitudCarguePoder = ltqtp_transaccionSolicitudCarguePoder.getResultList();

		return lltp_transaccionSolicitudCarguePoder;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.ITransaccionPasarelaDAO#consutarTransaccionPasarela(java.lang.String)
	 */
	@Override
	public TransaccionPasarela consutarTransaccionPasarela(String as_nir) {
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();

		TypedQuery<TransaccionPasarela> ltqtp_transaccionSolicitudCarguePoder = lem_entityManager.createNamedQuery("TransaccionPasarela.consultarTransaccion", TransaccionPasarela.class);
		ltqtp_transaccionSolicitudCarguePoder.setParameter("nir", as_nir);
		
		List<TransaccionPasarela> ltscp_transaccionSolicitudCarguePoder;
		ltscp_transaccionSolicitudCarguePoder = ltqtp_transaccionSolicitudCarguePoder.getResultList();
		
		if (ltscp_transaccionSolicitudCarguePoder.isEmpty()) {
			return null;
		}

		return ltscp_transaccionSolicitudCarguePoder.iterator().next();
	}

	@Override
	public TransaccionPasarela consutarTransaccionPasarelaReferencia(String as_referencia) {
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();

		TypedQuery<TransaccionPasarela> ltqtp_transaccionSolicitudCarguePoder = lem_entityManager.createNamedQuery("TransaccionPasarela.consultarTransaccionPorReferenciaPago", TransaccionPasarela.class);
		ltqtp_transaccionSolicitudCarguePoder.setParameter("referencia", as_referencia);
		
		List<TransaccionPasarela> lltp_transaccionSolicitudCarguePoder;
		lltp_transaccionSolicitudCarguePoder = ltqtp_transaccionSolicitudCarguePoder.getResultList();
		
		if (lltp_transaccionSolicitudCarguePoder.isEmpty()) {
			return null;
		}

		return lltp_transaccionSolicitudCarguePoder.iterator().next();
	}

}
