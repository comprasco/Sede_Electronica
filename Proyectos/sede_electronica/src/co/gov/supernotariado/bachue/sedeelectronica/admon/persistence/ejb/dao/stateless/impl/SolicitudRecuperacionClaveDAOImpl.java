/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: SolicitudRecuperacionClaveDAOImpl.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.impl
 * Nombre del elemento: SolicitudRecuperacionClaveDAOImpl
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

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesNegocio;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.ISolicitudRecuperacionClaveDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.SolicitudRecuperacionClave;
import co.gov.supernotariado.bachue.sedeelectronica.common.dao.singleton.interfaces.IEntityManagerFactory;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesRecuperarContrasena;

/**
 * Clase tipo objeto de acceso a datos (DAO). <br>
 * Permite interactuar con la base de datos manipulando y realizando operaciones
 * <br>
 * sobre el modelo de datos Solicitud recuperacion clave.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless
@LocalBean
public class SolicitudRecuperacionClaveDAOImpl implements ISolicitudRecuperacionClaveDAO {
	
	/**
	 * Atributo de instancia tipo IEntityManagerFactory para definir la propiedad
	 * entity factory.
	 */
	@EJB
	private IEntityManagerFactory iiemf_entityFactory;

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.ISolicitudRecuperacionClaveDAO#crearSolicitudRecuperacionClave(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.SolicitudRecuperacionClave)
	 */
	@Override
	public Boolean crearSolicitudRecuperacionClave(SolicitudRecuperacionClave asrc_solicitudRecuperacionClave) {
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
		lem_entityManager.persist(asrc_solicitudRecuperacionClave);
		return true;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.ISolicitudRecuperacionClaveDAO#consultaUsuariosRecuperacionClave(java.lang.String)
	 */
	@Override
	public SolicitudRecuperacionClave consultaUsuariosRecuperacionClave(String as_codigo) {
		
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
			TypedQuery<SolicitudRecuperacionClave> ltqsrc_resultadoSolicitudRecuperacionClave = lem_entityManager
					.createNamedQuery("SolicitudRecuperacionClave.findByUrlRecuperacionAndClaveTemporal", SolicitudRecuperacionClave.class);

			ltqsrc_resultadoSolicitudRecuperacionClave.setParameter("codigo", as_codigo);

			List<SolicitudRecuperacionClave> llsrc_listaSolicitudRecuperacionClave = ltqsrc_resultadoSolicitudRecuperacionClave.getResultList();
			if(llsrc_listaSolicitudRecuperacionClave.isEmpty())
				throw new ExcepcionesNegocio(EnumExcepcionesRecuperarContrasena.CLAVE_GENERICA_NO_COINCIDE);
			return llsrc_listaSolicitudRecuperacionClave.iterator().next();
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.ISolicitudRecuperacionClaveDAO#actualizarUsuariosRecuperacionClave(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.SolicitudRecuperacionClave)
	 */
	@Override
	public Boolean actualizarUsuariosRecuperacionClave(SolicitudRecuperacionClave asrc_solicitudRecuperacionClave) {
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
		lem_entityManager.merge(asrc_solicitudRecuperacionClave);
		return true;
	}

}
