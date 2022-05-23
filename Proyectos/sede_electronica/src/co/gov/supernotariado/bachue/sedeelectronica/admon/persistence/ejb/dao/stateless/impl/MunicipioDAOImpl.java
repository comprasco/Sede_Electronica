/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: MunicipioDAOImpl.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.impl
 * Nombre del elemento: MunicipioDAOImpl
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

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IMunicipioDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Municipio;
import co.gov.supernotariado.bachue.sedeelectronica.common.dao.singleton.interfaces.IEntityManagerFactory;

/**
 * Clase tipo objeto de acceso a datos (DAO). <br>
 * Permite interactuar con la base de datos manipulando y realizando operaciones
 * <br>
 * sobre el modelo de datos Municipio.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless
@LocalBean
public class MunicipioDAOImpl implements IMunicipioDAO {
	
	/**
	 * Atributo de instancia tipo IEntityManagerFactory para definir la propiedad
	 * entity factory.
	 */
	@EJB
	private IEntityManagerFactory iiemf_entityFactory;


	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IMunicipioDAO#crearMunicipio(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Municipio)
	 */
	@Override
	public Boolean crearMunicipio(Municipio am_municipio) {
		try {
			EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
			lem_entityManager.persist(am_municipio);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IMunicipioDAO#consultarMunicipio()
	 */
	public List<Municipio> consultarMunicipio() {
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
		TypedQuery<Municipio> ltqm_resultadoMunicipios = lem_entityManager.createNamedQuery("Municipio.findAll",
				Municipio.class);
		List<Municipio> llm_listaMunicipios;
		llm_listaMunicipios = ltqm_resultadoMunicipios.getResultList();
		return llm_listaMunicipios;

	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IMunicipioDAO#obtenerMunicipioXDepCodigoMunCodigo(java.lang.String, java.lang.String)
	 */
	@Override
	public Municipio obtenerMunicipioXDepCodigoMunCodigo(String as_depCodigo, String as_munCodigo) {
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
		TypedQuery<Municipio> ltqm_resultadoMunicipios = lem_entityManager.createNamedQuery("Municipio.findByIdDepIdMun",
				Municipio.class);
		ltqm_resultadoMunicipios.setParameter("idDepartamento", as_depCodigo);
		ltqm_resultadoMunicipios.setParameter("idMunicipio", as_munCodigo);
		Municipio lm_municipio;
		lm_municipio = ltqm_resultadoMunicipios.getSingleResult();
		return lm_municipio;
	}

	/**
	 * Metodo que permite consultar municipios por departamento en la base de datos.
	 *
	 * @param as_idDepartamento Id del departamento a consultar en la base de datos.
	 * @return Lista de Municipio con los registros pertenecientes al departamento.
	 */
	@Override
	public List<Municipio> consultarMunicipiosPorDepartamento(String as_idDepartamento) {
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();

		TypedQuery<Municipio> ltqm_resultadoMunicipio = lem_entityManager
				.createNamedQuery("Municipio.findAllIdDepartamento", Municipio.class);
		ltqm_resultadoMunicipio.setParameter("idDepartamento", as_idDepartamento);
		List<Municipio> llm_municipios;
		llm_municipios = ltqm_resultadoMunicipio.getResultList();
		return llm_municipios;
	}

}
