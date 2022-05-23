/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: CarritoDAOImpl.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.impl
 * Nombre del elemento: CarritoDAOImpl
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.impl;

import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.ICarritoDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Carrito;
import co.gov.supernotariado.bachue.sedeelectronica.common.dao.singleton.interfaces.IEntityManagerFactory;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumBoolean;

/**
 * Clase tipo objeto de acceso a datos (DAO). <br>
 * Permite interactuar con la base de datos manipulando y realizando operaciones
 * <br>
 * sobre el modelo de datos Carrito.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless
@LocalBean
public class CarritoDAOImpl implements ICarritoDAO{

	/**
	 * Define la constante CS_TIPO_SERVICIO.
	 */
	private static final String CS_TIPO_SERVICIO = "tipoServicio";
	
	/**
	 * Define la constante CS_SUB_TIPO_SERVICIO.
	 */
	private static final String CS_SUB_TIPO_SERVICIO = "subTipoServicio";
	
	/**
	 * Define la constante CS_MODO.
	 */
	private static final String CS_MODO = "modo";
	
	/**
	 * Define la constante CS_ACTIVO.
	 */
	private static final String CS_ACTIVO = "activo";
	
	/**
	 * Define la constante CS_USUARIO.
	 */
	private static final String CS_USUARIO = "usuario";
	
	/**
	 * Define la constante CS_CODIGO.
	 */
	private static final String CS_CODIGO = "codigo";
	
	/**
	 * Define la constante CS_ASOCIACION.
	 */
	private static final String CS_ASOCIACION = "idAsociacion";

	/**
	 * Atributo de instancia tipo IEntityManagerFactory para definir la propiedad
	 * entity factory.
	 */
	@EJB
	private IEntityManagerFactory iiemf_entityFactory;

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.ICarritoDAO#crearCarrito(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Carrito)
	 */
	@Override 
	public Boolean crearCarrito(Carrito ac_carrito) 
	{
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
		lem_entityManager.persist(ac_carrito);	
		return true;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.ICarritoDAO#consultarTransacionVigente(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Carrito)
	 */
	@Override
	public Carrito consultarTransacionVigente(Carrito ac_carrito) {
		try {
			EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
			TypedQuery<Carrito> ltqc_queryCarrito = lem_entityManager.createQuery("SELECT c FROM Carrito c WHERE c.codigoTipoServicio = :tipoServicio AND c.codigoTipoSubServicio = :subTipoServicio AND c.modo = :modo AND c.activo = :activo AND c.idUsuario = :usuario AND c.idAsociacion IS NULL", Carrito.class);
			ltqc_queryCarrito.setParameter(CS_TIPO_SERVICIO, ac_carrito.getCodigoTipoServicio());
			ltqc_queryCarrito.setParameter(CS_SUB_TIPO_SERVICIO, ac_carrito.getCodigoTipoSubServicio());
			ltqc_queryCarrito.setParameter(CS_MODO, ac_carrito.getModo());
			ltqc_queryCarrito.setParameter(CS_ACTIVO, EnumBoolean.CHAR_S.getIs_codigo());
			ltqc_queryCarrito.setParameter(CS_USUARIO, ac_carrito.getIdUsuario());
			Carrito lc_carrito;
			lc_carrito = ltqc_queryCarrito.getSingleResult();
			return lc_carrito;
		} catch (NoResultException e) {
			return null;
		}

	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.ICarritoDAO#consultarTransacionVigente(java.lang.String)
	 */
	@Override
	public Carrito consultarTransacionVigente(String as_carrito) {
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
		TypedQuery<Carrito> ltqc_queryCarrito = lem_entityManager.createNamedQuery("Carrito.findById", Carrito.class);
		ltqc_queryCarrito.setParameter(CS_CODIGO, as_carrito);
		ltqc_queryCarrito.setParameter(CS_ACTIVO, EnumBoolean.CHAR_S.getIs_codigo());
		Carrito lc_carrito;
		try {
			lc_carrito = ltqc_queryCarrito.getSingleResult();
		}catch(NoResultException anre_excepcionResultadoVacio)
		{
			return null;
		}
		return lc_carrito;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.ICarritoDAO#consultarTransacion(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Carrito)
	 */
	@Override
	public Carrito consultarTransacion(Carrito ac_carrito) {
		try {
			EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
			TypedQuery<Carrito> ltqc_queryCarrito = lem_entityManager.createQuery("SELECT c FROM Carrito c WHERE c.codigoTipoServicio = :tipoServicio AND c.codigoTipoSubServicio = :subTipoServicio AND c.modo = :modo AND c.idUsuario = :usuario AND c.idAsociacion IS NULL", Carrito.class);
			ltqc_queryCarrito.setParameter(CS_TIPO_SERVICIO, ac_carrito.getCodigoTipoServicio());
			ltqc_queryCarrito.setParameter(CS_SUB_TIPO_SERVICIO, ac_carrito.getCodigoTipoSubServicio());
			ltqc_queryCarrito.setParameter(CS_MODO, ac_carrito.getModo());
			ltqc_queryCarrito.setParameter(CS_USUARIO, ac_carrito.getIdUsuario());
			Carrito lc_carrito;
			lc_carrito = ltqc_queryCarrito.getSingleResult();
			return lc_carrito;
		} catch (NoResultException e) {
			return null;
		}

	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.ICarritoDAO#actualizarCarrito(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Carrito)
	 */
	@Override
	public Boolean actualizarCarrito(Carrito ac_carrito) {
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
		lem_entityManager.merge(ac_carrito);	
		return true;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.ICarritoDAO#consultarTransaciones(java.lang.String)
	 */
	@Override
	public List<Carrito> consultarTransaciones(String as_idUsuario) {
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
		TypedQuery<Carrito> ltqc_queryCarrito = lem_entityManager.createNamedQuery("Carrito.findByUser", Carrito.class);
		ltqc_queryCarrito.setParameter(CS_USUARIO, as_idUsuario);
		ltqc_queryCarrito.setParameter(CS_ACTIVO, EnumBoolean.CHAR_S.getIs_codigo());
		List<Carrito> llc_listaCarrito;
		llc_listaCarrito = ltqc_queryCarrito.getResultList();
		return llc_listaCarrito;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.ICarritoDAO#eliminarCarrito(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Carrito)
	 */
	@Override
	public Boolean eliminarCarrito(Carrito ac_carrito) {
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
		ac_carrito = lem_entityManager.find(Carrito.class, ac_carrito.getId());
		lem_entityManager.remove(ac_carrito);	
		return true;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.ICarritoDAO#consultarNumeroTransacionesVigentes(java.lang.String)
	 */
	@Override
	public int consultarNumeroTransacionesVigentes(String as_idUsuario) {
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
		TypedQuery<Long> ltqc_queryCarrito;
		ltqc_queryCarrito = lem_entityManager.createNamedQuery("Carrito.findByUserCounter",Long.class)
				.setParameter(CS_USUARIO, as_idUsuario)
				.setParameter(CS_ACTIVO, EnumBoolean.CHAR_S.getIs_codigo());	
		return ltqc_queryCarrito.getSingleResult().intValue();
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.ICarritoDAO#eliminarCarritoMasivo(java.util.Date)
	 */
	@Override
	public Boolean eliminarCarritoMasivo(Date ad_fechaLimite) {
		try{
			
			EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();

			lem_entityManager.createNamedQuery("Carrito.eliminarElementosCarritoFecha", Carrito.class)
			.setParameter("fechaLimite",ad_fechaLimite).executeUpdate();
			lem_entityManager.flush();

			return true;
		}catch (Exception ae_excepcion){
			return false;
		}
	}

	// Metodo de consulta para asociado
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.ICarritoDAO#consultarTransacionConAsociacion(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Carrito)
	 */
	@Override
	public Carrito consultarTransacionConAsociacion(Carrito ac_carrito) {
		try {
			EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
			TypedQuery<Carrito> ltqc_queryCarrito = lem_entityManager.createQuery("SELECT c FROM Carrito c WHERE c.codigoTipoServicio = :tipoServicio AND c.codigoTipoSubServicio = :subTipoServicio AND c.modo = :modo AND c.idUsuario = :usuario AND c.idAsociacion = :idAsociacion", Carrito.class);
			ltqc_queryCarrito.setParameter(CS_TIPO_SERVICIO, ac_carrito.getCodigoTipoServicio());
			ltqc_queryCarrito.setParameter(CS_SUB_TIPO_SERVICIO, ac_carrito.getCodigoTipoSubServicio());
			ltqc_queryCarrito.setParameter(CS_MODO, ac_carrito.getModo());
			ltqc_queryCarrito.setParameter(CS_USUARIO, ac_carrito.getIdUsuario());
			ltqc_queryCarrito.setParameter(CS_ASOCIACION, ac_carrito.getIdAsosiacion());
			Carrito lc_carrito;
			lc_carrito = ltqc_queryCarrito.getSingleResult();
			return lc_carrito;
		} catch (NoResultException anre_excepcionNoresultado) {
			return null;
		}
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.ICarritoDAO#consultarTransacionVigenteConAsociacion(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Carrito)
	 */
	@Override
	public Carrito consultarTransacionVigenteConAsociacion(Carrito ac_carrito) {
		
		try {
			EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
			TypedQuery<Carrito> ltqc_queryCarrito = lem_entityManager.createQuery("SELECT c FROM Carrito c WHERE c.codigoTipoServicio = :tipoServicio AND c.codigoTipoSubServicio = :subTipoServicio AND c.modo = :modo AND c.activo = :activo AND c.idUsuario = :usuario AND c.idAsociacion = :idAsociacion", Carrito.class);
			ltqc_queryCarrito.setParameter(CS_TIPO_SERVICIO, ac_carrito.getCodigoTipoServicio());
			ltqc_queryCarrito.setParameter(CS_SUB_TIPO_SERVICIO, ac_carrito.getCodigoTipoSubServicio());
			ltqc_queryCarrito.setParameter(CS_MODO, ac_carrito.getModo());
			ltqc_queryCarrito.setParameter(CS_ACTIVO, EnumBoolean.CHAR_S.getIs_codigo());
			ltqc_queryCarrito.setParameter(CS_USUARIO, ac_carrito.getIdUsuario());
			ltqc_queryCarrito.setParameter(CS_ASOCIACION, ac_carrito.getIdAsosiacion());
			Carrito lc_carrito;
			lc_carrito = ltqc_queryCarrito.getSingleResult();
			return lc_carrito;
		} catch (NoResultException anre_excepcionNoResultados) {
			return null;
		}
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.ICarritoDAO#consultarNumeroTransacionesVigentesConAsociacion(java.lang.String, java.lang.String)
	 */
	@Override
	public int consultarNumeroTransacionesVigentesConAsociacion(String as_idUsuario, String as_idAsociacion) {
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
		TypedQuery<Long> ltql_queryCarrito;
		ltql_queryCarrito = lem_entityManager.createNamedQuery("Carrito.findByUserCounterAsociado",Long.class)
				.setParameter(CS_USUARIO, as_idUsuario)
				.setParameter(CS_ACTIVO, EnumBoolean.CHAR_S.getIs_codigo())	
				.setParameter(CS_ASOCIACION, as_idAsociacion);
		return ltql_queryCarrito.getSingleResult().intValue();
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.ICarritoDAO#consultarTransacionesConAsociacion(java.lang.String, java.lang.String)
	 */
	@Override
	public List<Carrito> consultarTransacionesConAsociacion(String as_idUsuario, String as_idAsociacion) {
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
		TypedQuery<Carrito> ltqc_queryCarrito = lem_entityManager.createNamedQuery("Carrito.findByUserAsociado", Carrito.class);
		ltqc_queryCarrito.setParameter(CS_USUARIO, as_idUsuario);
		ltqc_queryCarrito.setParameter(CS_ACTIVO, EnumBoolean.CHAR_S.getIs_codigo());
		ltqc_queryCarrito.setParameter(CS_ASOCIACION, as_idAsociacion);
		List<Carrito> llc_listaCarrito;
		llc_listaCarrito = ltqc_queryCarrito.getResultList();
		return llc_listaCarrito;
	}
}
