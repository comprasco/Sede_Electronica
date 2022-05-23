/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: AsociacionUsuarioPersonaJuridicaDAOImpl.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.impl
 * Nombre del elemento: AsociacionUsuarioPersonaJuridicaDAOImpl
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.impl;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;
import javax.persistence.TypedQuery;

import org.eclipse.persistence.exceptions.DatabaseException;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesNegocio;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IAsociacionUsuarioPersonaJuridicaDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.AsociacionUsuarioPersonaJuridica;
import co.gov.supernotariado.bachue.sedeelectronica.common.dao.singleton.interfaces.IEntityManagerFactory;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesGenerales;

/**
 * Clase tipo objeto de acceso a datos (DAO). <br>
 * Permite interactuar con la base de datos manipulando y realizando operaciones
 * <br>
 * sobre el modelo de datos Asociacion usuario persona juridica.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless
@LocalBean
public class AsociacionUsuarioPersonaJuridicaDAOImpl implements IAsociacionUsuarioPersonaJuridicaDAO{
	
	/**
	 * Define la constante CS_USUARIO.
	 */
	private static final String CS_USUARIO = "idUsuario";
	
	/**
	 * Atributo de instancia tipo IEntityManagerFactory para definir la propiedad
	 * entity factory.
	 */
	@EJB
	private IEntityManagerFactory iiemf_entityFactory;

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IAsociacionUsuarioPersonaJuridicaDAO#consultarAsociacionUsuarioPersonaJuridicaId(java.lang.String, java.lang.String)
	 */
	@Override
	public AsociacionUsuarioPersonaJuridica consultarAsociacionUsuarioPersonaJuridicaId(String as_idUsuario, String as_idPersonaJuridica ) {

			EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
			
			TypedQuery<AsociacionUsuarioPersonaJuridica> ltqaupj_asociacion = lem_entityManager.createNamedQuery("AsociacionUsuarioPersonaJuridica.consultarAsociacionId", AsociacionUsuarioPersonaJuridica.class);
			ltqaupj_asociacion.setParameter(CS_USUARIO, as_idUsuario);
			ltqaupj_asociacion.setParameter("idPersonaJuridica", as_idPersonaJuridica);
			
			AsociacionUsuarioPersonaJuridica laupj_asociacion;
			laupj_asociacion = ltqaupj_asociacion.getSingleResult();			
			return laupj_asociacion;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IAsociacionUsuarioPersonaJuridicaDAO#consultarAsociacionUsuarioPersonaJuridica(java.lang.String, java.lang.String)
	 */
	@Override
	public AsociacionUsuarioPersonaJuridica consultarAsociacionUsuarioPersonaJuridica(String as_idUsuario, String as_numeroPersonaJuridica) {
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
		
		TypedQuery<AsociacionUsuarioPersonaJuridica> ltqaupj_asociacion = lem_entityManager.createNamedQuery("AsociacionUsuarioPersonaJuridica.consultarAsociaciones", AsociacionUsuarioPersonaJuridica.class);
		ltqaupj_asociacion.setParameter(CS_USUARIO, as_idUsuario);
		ltqaupj_asociacion.setParameter("numeroPersonaJuridica", as_numeroPersonaJuridica);
		
		List<AsociacionUsuarioPersonaJuridica> laupj_asociacion = ltqaupj_asociacion.getResultList();
		
		if (laupj_asociacion.isEmpty()) {
			return null;
		}
		return laupj_asociacion.iterator().next();
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IAsociacionUsuarioPersonaJuridicaDAO#consultarAsociacion(java.lang.String)
	 */
	@Override
	public AsociacionUsuarioPersonaJuridica consultarAsociacion(String as_idAsociacion) {
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
		
		TypedQuery<AsociacionUsuarioPersonaJuridica> ltqaupj_asociacion = lem_entityManager.createNamedQuery("AsociacionUsuarioPersonaJuridica.consultarAsociacionId", AsociacionUsuarioPersonaJuridica.class);
		ltqaupj_asociacion.setParameter("idAsociacion", as_idAsociacion);
		
		List<AsociacionUsuarioPersonaJuridica> laupj_asociacion = ltqaupj_asociacion.getResultList();
		
		if (laupj_asociacion.isEmpty()) 
			return null;
		
		return laupj_asociacion.iterator().next();
	}
	
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IAsociacionUsuarioPersonaJuridicaDAO#asociarUsuarioPersonaNatural(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.AsociacionUsuarioPersonaJuridica)
	 */
	@Override
	public Boolean asociarUsuarioPersonaNatural(AsociacionUsuarioPersonaJuridica aaupj_asociacionUsuarioPersonaJuridica)  {
		try {			
			EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
			lem_entityManager.persist(aaupj_asociacionUsuarioPersonaJuridica);
			return true;
		} catch (DatabaseException | PersistenceException ae_excepcion) {
			throw new ExcepcionesNegocio(EnumExcepcionesGenerales.ERROR_BASE_DATOS, new String[] {} , ae_excepcion);
		}
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IAsociacionUsuarioPersonaJuridicaDAO#consultarAsociacionesPJ(java.lang.String)
	 */
	@Override
	public List<AsociacionUsuarioPersonaJuridica> consultarAsociacionesPJ(String as_idPersonaJuridica) 
	{
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
		
		TypedQuery<AsociacionUsuarioPersonaJuridica> ltqra_resultadoAsociacion = lem_entityManager.createNamedQuery("AsociacionUsuarioPersonaJuridica.consultarAsociacionesPJ", AsociacionUsuarioPersonaJuridica.class);
		ltqra_resultadoAsociacion.setParameter("idPersonaJuridica", as_idPersonaJuridica);
		List<AsociacionUsuarioPersonaJuridica> la_asociados = ltqra_resultadoAsociacion.getResultList();
		
		lem_entityManager.close();
		return la_asociados;
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IAsociacionUsuarioPersonaJuridicaDAO#actualizaUsuario(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.AsociacionUsuarioPersonaJuridica)
	 */
	@Override
	public Boolean actualizaUsuario(AsociacionUsuarioPersonaJuridica aupj_asociacionUsuarioPJ) {
		try {
			EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
			lem_entityManager.merge(aupj_asociacionUsuarioPJ);
		} catch (Exception e) {
			e.getMessage();
			return false;
		}
		return true;
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IAsociacionUsuarioPersonaJuridicaDAO#consultarAsociacionesUsuarioPJ(java.lang.String)
	 */
	@Override
	public List<AsociacionUsuarioPersonaJuridica> consultarAsociacionesUsuarioPJ(String as_idUsuario) 
	{
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
		
		TypedQuery<AsociacionUsuarioPersonaJuridica> ltqra_resultadoAsociacion = lem_entityManager.createNamedQuery("AsociacionUsuarioPersonaJuridica.consultarAsociacionesUsuarioPJ", AsociacionUsuarioPersonaJuridica.class);
		ltqra_resultadoAsociacion.setParameter(CS_USUARIO, as_idUsuario);
		List<AsociacionUsuarioPersonaJuridica> la_asociados = ltqra_resultadoAsociacion.getResultList();
		
		lem_entityManager.close();
		return la_asociados;
	}
}