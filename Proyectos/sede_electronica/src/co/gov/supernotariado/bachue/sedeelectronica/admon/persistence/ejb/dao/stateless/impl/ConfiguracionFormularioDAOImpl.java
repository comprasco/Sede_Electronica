/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ConfiguracionFormularioDAOImpl.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.impl
 * Nombre del elemento: ConfiguracionFormularioDAOImpl
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.impl;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IConfiguracionFormularioDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.ConfiguracionFormulario;
import co.gov.supernotariado.bachue.sedeelectronica.common.dao.singleton.interfaces.IEntityManagerFactory;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumBoolean;

/**
 * Clase tipo objeto de acceso a datos (DAO). <br>
 * Permite interactuar con la base de datos manipulando y realizando operaciones
 * <br>
 * sobre el modelo de datos Configuracion formulario.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless
@LocalBean
public class ConfiguracionFormularioDAOImpl implements IConfiguracionFormularioDAO {

	/**
	 * Atributo de instancia tipo IEntityManagerFactory para definir la propiedad
	 * entity factory.
	 */
	@EJB
	private IEntityManagerFactory iiemf_entityFactory;

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IConfiguracionFormularioDAO#consultarIdConfiguracionFormulario(java.lang.String)
	 */
	@Override
	public ConfiguracionFormulario consultarIdConfiguracionFormulario(String as_nombreFormulario) {
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
		TypedQuery<ConfiguracionFormulario> ltqcf_queryConfiguracionFormulario = lem_entityManager
				.createNamedQuery("ConfiguracionFormulario.consultaNombreFormulario", ConfiguracionFormulario.class);
		ltqcf_queryConfiguracionFormulario.setParameter("nombreFormulario", as_nombreFormulario);
		ltqcf_queryConfiguracionFormulario.setParameter("activo", EnumBoolean.CHAR_S.getIs_codigo());
		ConfiguracionFormulario lcf_configuracionFormulario;
		try {
			lcf_configuracionFormulario = ltqcf_queryConfiguracionFormulario.getSingleResult();
		} catch (NoResultException anre_excepcionResultadoVacio) {
			return null;
		}
		return lcf_configuracionFormulario;
	}

}
