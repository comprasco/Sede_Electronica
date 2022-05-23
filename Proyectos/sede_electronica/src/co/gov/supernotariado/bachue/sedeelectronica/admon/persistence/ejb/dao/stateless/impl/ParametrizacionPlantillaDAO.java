/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ParametrizacionPlantillaDAO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.impl
 * Nombre del elemento: ParametrizacionPlantillaDAO
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

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IParametrizacionPlantillaDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.ParametrizacionPlantilla;
import co.gov.supernotariado.bachue.sedeelectronica.common.dao.singleton.interfaces.IEntityManagerFactory;

/**
 * Clase tipo objeto de acceso a datos (DAO). <br>
 * Permite interactuar con la base de datos manipulando y realizando operaciones
 * <br>
 * sobre el modelo de datos Parametrizacion plantilla.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless
@LocalBean
public class ParametrizacionPlantillaDAO implements IParametrizacionPlantillaDAO{

	/**
	 * Atributo de instancia tipo IEntityManagerFactory para definir la propiedad
	 * entity factory.
	 */
	@EJB
	private IEntityManagerFactory iiemf_entityFactory;

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IParametrizacionPlantillaDAO#consultarPlantilla(java.lang.String)
	 */
	@Override
	public ParametrizacionPlantilla consultarPlantilla(String as_codigoPlantilla) {

		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();

		TypedQuery<ParametrizacionPlantilla> ltqpp_sentenciaPlantilla = lem_entityManager.createNamedQuery("ParametrizacionPlantilla.consultarPorCodigo", ParametrizacionPlantilla.class);
		ltqpp_sentenciaPlantilla.setParameter("codigo", as_codigoPlantilla);
		List<ParametrizacionPlantilla> llpp_parametros;
		llpp_parametros = ltqpp_sentenciaPlantilla.getResultList();

		if (llpp_parametros.isEmpty())
			return null;

		return llpp_parametros.iterator().next();

	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IParametrizacionPlantillaDAO#consultarPlantillas()
	 */
	@Override
	public List<ParametrizacionPlantilla> consultarPlantillas() {
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();

		TypedQuery<ParametrizacionPlantilla> ltqpp_sentenciaPlantilla = lem_entityManager.createNamedQuery("ParametrizacionPlantilla.findAll", ParametrizacionPlantilla.class);
		List<ParametrizacionPlantilla> llpp_parametros;
		llpp_parametros = ltqpp_sentenciaPlantilla.getResultList();		

		return llpp_parametros;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IParametrizacionPlantillaDAO#actualizarPlantilla(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.ParametrizacionPlantilla)
	 */
	@Override
	public Boolean actualizarPlantilla(ParametrizacionPlantilla app_plantilla) {
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
		lem_entityManager.merge(app_plantilla);
		return true;
	}

}
