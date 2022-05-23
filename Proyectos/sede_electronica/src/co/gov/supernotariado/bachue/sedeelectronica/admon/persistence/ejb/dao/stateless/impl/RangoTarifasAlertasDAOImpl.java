/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: RangoTarifasAlertasDAOImpl.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.impl
 * Nombre del elemento: RangoTarifasAlertasDAOImpl
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

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IRangoTarifasAlertasDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.RangoTarifasAlerta;
import co.gov.supernotariado.bachue.sedeelectronica.common.dao.singleton.interfaces.IEntityManagerFactory;

/**
 * Clase tipo objeto de acceso a datos (DAO). <br>
 * Permite interactuar con la base de datos manipulando y realizando operaciones
 * <br>
 * sobre el modelo de datos Rango tarifas alertas.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless
@LocalBean
public class RangoTarifasAlertasDAOImpl implements IRangoTarifasAlertasDAO{

	/**
	 * Atributo de instancia tipo IEntityManagerFactory para definir la propiedad
	 * entity factory.
	 */
	@EJB
	private IEntityManagerFactory iiemf_entityFactory;
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IRangoTarifasAlertasDAO#consultarTarifasAlertas()
	 */
	@Override
	public List<RangoTarifasAlerta> consultarTarifasAlertas() {
		EntityManager lem_em = iiemf_entityFactory.consultarEntityManager();
		TypedQuery<RangoTarifasAlerta> ltqrta_queryRangoTarifasAlerta = lem_em.createNamedQuery("RangoTarifasAlerta.findAll",RangoTarifasAlerta.class);
		List<RangoTarifasAlerta> llrta_listaRangoTarifasAlerta;
		llrta_listaRangoTarifasAlerta = ltqrta_queryRangoTarifasAlerta.getResultList();
		return llrta_listaRangoTarifasAlerta;
	}

}
