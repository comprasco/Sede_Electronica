/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ColaEnvioDAO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.impl
 * Nombre del elemento: ColaEnvioDAO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.impl;

import java.util.List;
import java.util.Objects;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesDatosEntrada;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IColaEnvioDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.ColaEnvio;
import co.gov.supernotariado.bachue.sedeelectronica.common.dao.singleton.interfaces.IEntityManagerFactory;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesGenerales;

/**
 * Clase tipo objeto de acceso a datos (DAO). <br>
 * Permite interactuar con la base de datos manipulando y realizando operaciones
 * <br>
 * sobre el modelo de datos Cola envio.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless
@LocalBean
public class ColaEnvioDAO implements IColaEnvioDAO {

	/**
	 * Atributo de instancia tipo IEntityManagerFactory para definir la propiedad
	 * entity factory.
	 */
	@EJB
	private IEntityManagerFactory iiemf_entityFactory;

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IColaEnvioDAO#encolarCorreo(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.ColaEnvio)
	 */
	@Override
	public Boolean encolarCorreo(ColaEnvio ace_colaEnvio) {

		if (Objects.isNull(ace_colaEnvio)) 
			throw new ExcepcionesDatosEntrada(EnumExcepcionesGenerales.ERROR_DATOS_ENTRADA);

		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
		lem_entityManager.persist(ace_colaEnvio);

		return true;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IColaEnvioDAO#consultarCorreosPendientes(java.lang.Integer)
	 */
	@Override
	public List<ColaEnvio> consultarCorreosPendientes(Integer as_cantidadIntentos) {

		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();

		TypedQuery<ColaEnvio> ltqce_resultadoUsuario = lem_entityManager.createNamedQuery("ColaEnvio.consultarCorreosPendientes",ColaEnvio.class);
		ltqce_resultadoUsuario.setParameter("cantidadIntentos", as_cantidadIntentos.toString());

		List<ColaEnvio> llce_colaEnvio;
		llce_colaEnvio = ltqce_resultadoUsuario.getResultList();

		return llce_colaEnvio;
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IColaEnvioDAO#consultarCorreosVencidos(java.lang.Integer)
	 */
	@Override
	public List<ColaEnvio> consultarCorreosVencidos(Integer as_cantidadIntentos) {

		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();

		TypedQuery<ColaEnvio> ltqce_resultadoUsuario = lem_entityManager.createNamedQuery("ColaEnvio.consultarCorreosVencidos",ColaEnvio.class);
		ltqce_resultadoUsuario.setParameter("cantidadIntentos", as_cantidadIntentos.toString());

		List<ColaEnvio> llce_colaEnvio;
		llce_colaEnvio = ltqce_resultadoUsuario.getResultList();

		return llce_colaEnvio;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IColaEnvioDAO#eliminarCorreoCola(java.lang.String)
	 */
	@Override
	public Integer eliminarCorreoCola(String as_idCola) {
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();

		TypedQuery<Integer> ltqi_resultadoUsuario = lem_entityManager.createNamedQuery("ColaEnvio.eliminarCorreoCola",Integer.class);
		ltqi_resultadoUsuario.setParameter("id", as_idCola);
		Integer li_resultado;
		li_resultado = ltqi_resultadoUsuario.executeUpdate();
		
		return li_resultado;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IColaEnvioDAO#actualizarCorreoColaEnvio(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.ColaEnvio)
	 */
	@Override
	public Boolean actualizarCorreoColaEnvio(ColaEnvio ace_colaEnvio) {
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
		lem_entityManager.merge(ace_colaEnvio);
		return true;		
	}


}
