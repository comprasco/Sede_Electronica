/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: AsociacionUsuarioEntidadEspeciaDAOImpl.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.impl
 * Nombre del elemento: AsociacionUsuarioEntidadEspeciaDAOImpl
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

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesDatosEntrada;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IAsociacionUsuarioEntidadEspecialDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.AsociacionUsuarioEntidadEspecial;
import co.gov.supernotariado.bachue.sedeelectronica.common.dao.singleton.interfaces.IEntityManagerFactory;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesGenerales;

/**
 * Clase tipo objeto de acceso a datos (DAO). <br>
 * Permite interactuar con la base de datos manipulando y realizando operaciones
 * <br>
 * sobre el modelo de datos Asociacion usuario entidad especia.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless
@LocalBean
public class AsociacionUsuarioEntidadEspeciaDAOImpl implements IAsociacionUsuarioEntidadEspecialDAO{

	/**
	 * Atributo de instancia tipo IEntityManagerFactory para definir la propiedad
	 * entity factory.
	 */
	@EJB
	private IEntityManagerFactory iiemf_entityFactory;
	
	/**
	 * Define la constante CS_ID_USUARIO.
	 */
	private static final String CS_ID_USUARIO = "idUsuario";

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IAsociacionUsuarioEntidadEspecialDAO#consultarAsociacion(java.lang.String, java.lang.String)
	 */
	@Override
	public AsociacionUsuarioEntidadEspecial consultarAsociacion(String as_nombreEntidadEspecial, String as_idUsuario) {
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();

		TypedQuery<AsociacionUsuarioEntidadEspecial> ltqauee_asociacion = lem_entityManager.createNamedQuery("AsociacionUsuarioEntidadEspecial.consultarAsociacion", AsociacionUsuarioEntidadEspecial.class);
		ltqauee_asociacion.setParameter(CS_ID_USUARIO, as_idUsuario);
		ltqauee_asociacion.setParameter("entidadEspecial", as_nombreEntidadEspecial);

		List<AsociacionUsuarioEntidadEspecial> llauee_asociacion = ltqauee_asociacion.getResultList();

		if (llauee_asociacion.isEmpty()) 
			return null;

		return llauee_asociacion.iterator().next();
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IAsociacionUsuarioEntidadEspecialDAO#consultarAsociacionesEE(java.lang.String)
	 */
	@Override
	public List<AsociacionUsuarioEntidadEspecial> consultarAsociacionesEE(String as_idUsuarioEE) 
	{
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();

		TypedQuery<AsociacionUsuarioEntidadEspecial> ltqra_resultadoAsociacion = lem_entityManager.createNamedQuery("AsociacionUsuarioEntidadEspecial.consultarAsociacionesEE", AsociacionUsuarioEntidadEspecial.class);
		ltqra_resultadoAsociacion.setParameter("idEntidadEspecial", as_idUsuarioEE);
		List<AsociacionUsuarioEntidadEspecial> la_asociados = ltqra_resultadoAsociacion.getResultList();

		lem_entityManager.close();
		return la_asociados;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IAsociacionUsuarioEntidadEspecialDAO#consultarAsociacionesEEPN(java.lang.String, java.lang.String)
	 */
	@Override
	public AsociacionUsuarioEntidadEspecial consultarAsociacionesEEPN(String as_idUsuarioEE,String as_idUsuarioPN) 
	{
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();

		TypedQuery<AsociacionUsuarioEntidadEspecial> ltqauee_asociacion = lem_entityManager.createNamedQuery("AsociacionUsuarioEntidadEspecial.consultarAsociacionEEPN", AsociacionUsuarioEntidadEspecial.class);
		ltqauee_asociacion.setParameter(CS_ID_USUARIO, as_idUsuarioPN);
		ltqauee_asociacion.setParameter("idUsuarioEE", as_idUsuarioEE);

		List<AsociacionUsuarioEntidadEspecial> llauee_asociacion = ltqauee_asociacion.getResultList();

		if (llauee_asociacion.isEmpty()) 
			return null;

		return llauee_asociacion.iterator().next();
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IAsociacionUsuarioEntidadEspecialDAO#consultarAsociacionesUsuarioEE(java.lang.String)
	 */
	@Override
	public List<AsociacionUsuarioEntidadEspecial> consultarAsociacionesUsuarioEE(String as_idUsuario) 
	{
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();

		TypedQuery<AsociacionUsuarioEntidadEspecial> ltqra_resultadoAsociacion = lem_entityManager.createNamedQuery("AsociacionUsuarioEntidadEspecial.consultarAsociacionesUsuarioEE", AsociacionUsuarioEntidadEspecial.class);
		ltqra_resultadoAsociacion.setParameter(CS_ID_USUARIO, as_idUsuario);
		List<AsociacionUsuarioEntidadEspecial> la_asociados = ltqra_resultadoAsociacion.getResultList();

		lem_entityManager.close();
		return la_asociados; 
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IAsociacionUsuarioEntidadEspecialDAO#actualizarUsuario(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.AsociacionUsuarioEntidadEspecial)
	 */
	@Override
	public Boolean actualizarUsuario(AsociacionUsuarioEntidadEspecial aauee_asociacionUsuarioEntidadEspecial) {
		try {
			EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
			lem_entityManager.merge(aauee_asociacionUsuarioEntidadEspecial);
		} catch (Exception ae_exception) {
			ae_exception.getMessage();
			return false;
		}
		return true;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IAsociacionUsuarioEntidadEspecialDAO#asociarUsuarioPersonaNatural(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.AsociacionUsuarioEntidadEspecial)
	 */
	@Override
	public Boolean asociarUsuarioPersonaNatural(
			AsociacionUsuarioEntidadEspecial aauee_asociacionUsuarioEntidadEspecial) {
		try {
			EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
			lem_entityManager.persist(aauee_asociacionUsuarioEntidadEspecial);
			return true;
		} catch (DatabaseException | PersistenceException abpe_excepcion) {
			throw new ExcepcionesDatosEntrada(EnumExcepcionesGenerales.ERROR_BASE_DATOS, new String[] {}, abpe_excepcion);
		}
	}


}
