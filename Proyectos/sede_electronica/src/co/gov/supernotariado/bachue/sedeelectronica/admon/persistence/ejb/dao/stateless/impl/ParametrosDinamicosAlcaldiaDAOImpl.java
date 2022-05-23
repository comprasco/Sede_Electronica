/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ParametrosDinamicosAlcaldiaDAOImpl.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.impl
 * Nombre del elemento: ParametrosDinamicosAlcaldiaDAOImpl
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.impl;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IParametrosDinamicosAlcaldiaDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.AlcaldiaParametrizacion;
import co.gov.supernotariado.bachue.sedeelectronica.common.dao.singleton.interfaces.IEntityManagerFactory;

/**
 * Clase tipo objeto de acceso a datos (DAO). <br>
 * Permite interactuar con la base de datos manipulando y realizando operaciones
 * <br>
 * sobre el modelo de datos Parametros dinamicos alcaldia.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless
@LocalBean
public class ParametrosDinamicosAlcaldiaDAOImpl implements IParametrosDinamicosAlcaldiaDAO
{
	
	/**
	 * Define la constante CS_PAIS.
	 */
	private static final String CS_PAIS = "idPais";
	
	/**
	 * Define la constante CS_DEPARTAMENTO.
	 */
	private static final String CS_DEPARTAMENTO = "idDepartamento";
	
	/**
	 * Define la constante CS_MUNICIPIO.
	 */
	private static final String CS_MUNICIPIO = "idMunicipio";
	
	/**
	 * Atributo de instancia tipo IEntityManagerFactory para definir la propiedad
	 * entity factory.
	 */
	@EJB
	private IEntityManagerFactory iiemf_entityFactory;
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IParametrosDinamicosAlcaldiaDAO#consultaAlcaldiaParametrizada(java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public AlcaldiaParametrizacion consultaAlcaldiaParametrizada(String as_idPais, String as_idDepartamento, String as_idMunicipio) 
	{
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
		TypedQuery<AlcaldiaParametrizacion> ltqap_alcaldiaParametrizada = lem_entityManager.createNamedQuery("AlcaldiaParametrizacion.consultarPazYSalvo", AlcaldiaParametrizacion.class);
		ltqap_alcaldiaParametrizada.setParameter(CS_PAIS, as_idPais);
		ltqap_alcaldiaParametrizada.setParameter(CS_DEPARTAMENTO, as_idDepartamento);
		ltqap_alcaldiaParametrizada.setParameter(CS_MUNICIPIO, as_idMunicipio);
		AlcaldiaParametrizacion lap_alcaldiaParametrizada = ltqap_alcaldiaParametrizada.getSingleResult();
		lem_entityManager.close();
		return lap_alcaldiaParametrizada;
	}
	
}
