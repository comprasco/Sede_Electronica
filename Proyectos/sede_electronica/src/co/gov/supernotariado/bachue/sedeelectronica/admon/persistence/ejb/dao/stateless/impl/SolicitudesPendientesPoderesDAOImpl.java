/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: AccionDAOImpl.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.impl
 * Nombre del elemento: AccionDAOImpl
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

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.ISolicitudPendientePoderDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.SolicitudPendientePoder;
import co.gov.supernotariado.bachue.sedeelectronica.common.dao.singleton.interfaces.IEntityManagerFactory;

/**
 * Clase tipo objeto de acceso a datos (DAO). <br>
 * Permite interactuar con la base de datos manipulando y realizando operaciones
 * <br>
 * sobre el modelo de datos Accion.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless
@LocalBean
public class SolicitudesPendientesPoderesDAOImpl implements ISolicitudPendientePoderDAO {

	/**
	 * Atributo de instancia tipo IEntityManagerFactory para definir la propiedad
	 * entity factory.
	 */
	@EJB
	private IEntityManagerFactory iiemf_entityFactory;

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IAlcaldiaDAO#consultarAlcaldiasParametrizadas()
	 */
	@Override
	public List<SolicitudPendientePoder> consultarSolicitudesPendientesPoderes() {

		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();

		TypedQuery<SolicitudPendientePoder> ltqspp_resultadoAlcadias = lem_entityManager.createNamedQuery("SolicitudPendientePoder.findAll", SolicitudPendientePoder.class);
		List<SolicitudPendientePoder> llspp_alcaldias = ltqspp_resultadoAlcadias.getResultList();

		lem_entityManager.close();

		return llspp_alcaldias;
	}

	@Override
	public List<SolicitudPendientePoder> consultarSolicitudesPendientesPoderes(String as_tipoTransaccion, String as_estadoSolicitud, String as_idNotariaOrigen) {

		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();

		TypedQuery<SolicitudPendientePoder> ltqspp_resultadoSolicitudesPendientePoderes = lem_entityManager.createNamedQuery("SolicitudPendientePoder.findByType", SolicitudPendientePoder.class);
		ltqspp_resultadoSolicitudesPendientePoderes.setParameter("tipoTransaccion", as_tipoTransaccion);
		ltqspp_resultadoSolicitudesPendientePoderes.setParameter("estadoSolicitud", as_estadoSolicitud);
		ltqspp_resultadoSolicitudesPendientePoderes.setParameter("idNotariaOrigen", as_idNotariaOrigen);
		List<SolicitudPendientePoder> llspp_resultadoSolicitudesPendientePoderes = ltqspp_resultadoSolicitudesPendientePoderes.getResultList();

		lem_entityManager.close();

		return llspp_resultadoSolicitudesPendientePoderes;
	}

	@Override
	public List<SolicitudPendientePoder> consultarSolicitudesPendientesPoderes(String as_tipoTransaccion, String as_estadoSolicitud) {

		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();

		TypedQuery<SolicitudPendientePoder> ltqspp_resultadoSolicitudesPendientePoderes = lem_entityManager.createNamedQuery("SolicitudPendientePoder.findByTypeClean", SolicitudPendientePoder.class);
		ltqspp_resultadoSolicitudesPendientePoderes.setParameter("tipoTransaccion", as_tipoTransaccion);
		ltqspp_resultadoSolicitudesPendientePoderes.setParameter("estadoSolicitud", as_estadoSolicitud);
		List<SolicitudPendientePoder> llspp_resultadoSolicitudesPendientePoderes = ltqspp_resultadoSolicitudesPendientePoderes.getResultList();

		lem_entityManager.close();

		return llspp_resultadoSolicitudesPendientePoderes;
	}
	
	@Override
	public SolicitudPendientePoder consultarSolicitudPendientePoder(String as_identificadorSolicitudPendiente, String as_idNotariaOrigen) {

		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();

		TypedQuery<SolicitudPendientePoder> ltspp_resultadoSolicitudesPendientePoderes = lem_entityManager.createNamedQuery("SolicitudPendientePoder.findById", SolicitudPendientePoder.class);
		ltspp_resultadoSolicitudesPendientePoderes.setParameter("id", as_identificadorSolicitudPendiente);
		ltspp_resultadoSolicitudesPendientePoderes.setParameter("idNotariaOrigen", as_idNotariaOrigen);

		List<SolicitudPendientePoder> llspp_resultadoSolicitudesPendientePoderes = ltspp_resultadoSolicitudesPendientePoderes.getResultList();

		if (llspp_resultadoSolicitudesPendientePoderes.isEmpty()) 
			return null;		

		SolicitudPendientePoder lspp_resultadoSolicitudesPendientePoderes = llspp_resultadoSolicitudesPendientePoderes.iterator().next();

		lem_entityManager.close();

		return lspp_resultadoSolicitudesPendientePoderes;
	}
	
	@Override
	public SolicitudPendientePoder consultarSolicitudPendientePoder(String as_identificadorSolicitudPendiente) {

		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();

		TypedQuery<SolicitudPendientePoder> ltqspp_resultadoSolicitudesPendientePoderes = lem_entityManager.createNamedQuery("SolicitudPendientePoder.findByIdClean", SolicitudPendientePoder.class);
		ltqspp_resultadoSolicitudesPendientePoderes.setParameter("id", as_identificadorSolicitudPendiente);

		List<SolicitudPendientePoder> llspp_resultadoSolicitudesPendientePoderes = ltqspp_resultadoSolicitudesPendientePoderes.getResultList();

		if (llspp_resultadoSolicitudesPendientePoderes.isEmpty()) 
			return null;		

		SolicitudPendientePoder lspp_resultadoSolicitudesPendientePoderes = llspp_resultadoSolicitudesPendientePoderes.iterator().next();

		lem_entityManager.close();

		return lspp_resultadoSolicitudesPendientePoderes;
	}

	@Override
	public String actualizarSolicitudPendientePoder(SolicitudPendientePoder aspp_solicitudPendientePoder) {
		
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
		SolicitudPendientePoder lspp_solicitudPendiente = lem_entityManager.merge(aspp_solicitudPendientePoder);		
		lem_entityManager.close();
		
		return lspp_solicitudPendiente.getId();
	}
}
