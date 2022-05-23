/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ConfiguracionCampoDAOImpl.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.impl
 * Nombre del elemento: ConfiguracionCampoDAOImpl
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.impl;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IConfiguracionCampoDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.ConfiguracionCampo;
import co.gov.supernotariado.bachue.sedeelectronica.common.dao.singleton.interfaces.IEntityManagerFactory;

/**
 * Clase tipo objeto de acceso a datos (DAO). <br>
 * Permite interactuar con la base de datos manipulando y realizando operaciones
 * <br>
 * sobre el modelo de datos Configuracion campo.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless
@LocalBean
public class ConfiguracionCampoDAOImpl implements IConfiguracionCampoDAO {

	/**
	 * Atributo de instancia tipo IEntityManagerFactory para definir la propiedad
	 * entity factory.
	 */
	@EJB
	private IEntityManagerFactory iiemf_entityFactory;
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IConfiguracionCampoDAO#consultarPorNombre(java.lang.String)
	 */
	@Override
	public ConfiguracionCampo consultarPorNombre(String as_nombreCampo) {
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
		TypedQuery<ConfiguracionCampo> ltqcc_typedQueryConfiguracionCampo = lem_entityManager.createNamedQuery("ConfiguracionCampo.consultarPorNombre",ConfiguracionCampo.class);
		ltqcc_typedQueryConfiguracionCampo.setParameter("nombre", as_nombreCampo);
		return ltqcc_typedQueryConfiguracionCampo.getSingleResult();
	}

}
