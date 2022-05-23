/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ServicioIntegracionDAOImpl.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.impl
 * Nombre del elemento: ServicioIntegracionDAOImpl
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

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IServicioIntegracionDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.ServicioIntegracion;
import co.gov.supernotariado.bachue.sedeelectronica.common.dao.singleton.interfaces.IEntityManagerFactory;

/**
 * Clase tipo objeto de acceso a datos (DAO). <br>
 * Permite interactuar con la base de datos manipulando y realizando operaciones
 * <br>
 * sobre el modelo de datos Servicio integracion.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless
@LocalBean
public class ServicioIntegracionDAOImpl implements IServicioIntegracionDAO{

	/**
	 * Atributo de instancia tipo IEntityManagerFactory para definir la propiedad
	 * entity factory.
	 */
	@EJB
	private IEntityManagerFactory iiemf_entityFactory;

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IServicioIntegracionDAO#consultarServiciosIntegraciones()
	 */
	@Override
	public List<ServicioIntegracion> consultarServiciosIntegraciones() {

		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
		
		TypedQuery<ServicioIntegracion> ltqsi_servicioIntegracion = lem_entityManager
				.createNamedQuery("ServicioIntegracion.findAll", ServicioIntegracion.class);
		List<ServicioIntegracion> llsi_listaServiciosIntegracion = ltqsi_servicioIntegracion.getResultList();
		lem_entityManager.close();
		
		return llsi_listaServiciosIntegracion;

	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IServicioIntegracionDAO#consultarServicioIntegracion(java.lang.String)
	 */
	@Override
	public ServicioIntegracion consultarServicioIntegracion(String as_nombre) {

		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
		TypedQuery<ServicioIntegracion> ltqsi_servicioIntegracion = lem_entityManager
				.createNamedQuery("ServicioIntegracion.consultarNombreServicio", ServicioIntegracion.class);
		ltqsi_servicioIntegracion.setParameter("nombre", as_nombre);
		List<ServicioIntegracion> llsi_servicioIntegracion = ltqsi_servicioIntegracion.getResultList();
		if (llsi_servicioIntegracion.isEmpty()) {
			return null;
		}		
		ServicioIntegracion lsi_servicioIntegracion = llsi_servicioIntegracion.iterator().next();
		lem_entityManager.close();
		
		return lsi_servicioIntegracion;

	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IServicioIntegracionDAO#actualizarServicioIntegracion(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.ServicioIntegracion)
	 */
	@Override
	public boolean actualizarServicioIntegracion(ServicioIntegracion asi_servicioIntegracion) {
		try {
			EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
			lem_entityManager.merge(asi_servicioIntegracion);
			lem_entityManager.flush();
		} catch (Exception ae_excepcion) {
			return false;
		}
		return true;
	}

}
