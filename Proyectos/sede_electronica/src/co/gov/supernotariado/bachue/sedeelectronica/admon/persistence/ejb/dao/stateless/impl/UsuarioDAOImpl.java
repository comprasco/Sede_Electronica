/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: UsuarioDAOImpl.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.impl
 * Nombre del elemento: UsuarioDAOImpl
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;
import javax.persistence.TypedQuery;

import org.eclipse.persistence.exceptions.DatabaseException;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesNegocio;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IUsuarioDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Direccion;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.HistoricoClave;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Persona;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.PersonaDireccion;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.PersonaJuridica;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Usuario;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.UsuarioRol;
import co.gov.supernotariado.bachue.sedeelectronica.common.dao.singleton.interfaces.IEntityManagerFactory;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumBoolean;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoEstadoCuenta;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesGenerales;

/**
 * Clase tipo objeto de acceso a datos (DAO). <br>
 * Permite interactuar con la base de datos manipulando y realizando operaciones
 * <br>
 * sobre el modelo de datos Usuario.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless
@LocalBean
public class UsuarioDAOImpl implements IUsuarioDAO {

	/**
	 * Define la constante CS_USUARIO.
	 */
	private static final String CS_USUARIO = "usuario";
	
	/**
	 * Define la constante CS_ESTADO.
	 */
	private static final String CS_ESTADO = "estado";
	
	/**
	 * Define la constante CS_ESTADO_CUENTA.
	 */
	private static final String CS_ESTADO_CUENTA = "estadoCuenta";
	
	/**
	 * Define la constante CS_ACTIVO.
	 */
	private static final String CS_ACTIVO = "activo";

	/**
	 * Atributo de instancia tipo IEntityManagerFactory para definir la propiedad
	 * entity factory.
	 */
	@EJB
	private IEntityManagerFactory iiemf_entityFactory;

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IUsuarioDAO#crearUsuarioRol(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Usuario, co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.UsuarioRol)
	 */
	@Override
	public Boolean crearUsuarioRol(Usuario au_usuario, UsuarioRol aur_usuarioRol) {

		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
		lem_entityManager.persist(au_usuario);
		aur_usuarioRol.setUsuario(au_usuario);
		lem_entityManager.persist(aur_usuarioRol);

		return true;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IUsuarioDAO#consultarUsuarioActivo(java.lang.String)
	 */
	@Override
	public Usuario consultarUsuarioActivo(String as_usuario) {

		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();

		TypedQuery<Usuario> ltqu_resultadoUsuario = lem_entityManager.createNamedQuery("Usuario.consultarUsuarioEstado",
				Usuario.class);
		ltqu_resultadoUsuario.setParameter(CS_USUARIO, as_usuario);
		ltqu_resultadoUsuario.setParameter(CS_ESTADO, EnumBoolean.CHAR_S.getIs_codigo());
		ltqu_resultadoUsuario.setParameter(CS_ESTADO_CUENTA, EnumTipoEstadoCuenta.ACTIVO.getIs_id());
		Usuario lu_user = ltqu_resultadoUsuario.getSingleResult();

		lem_entityManager.close();

		return lu_user;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IUsuarioDAO#consultarTodosUsuarios()
	 */
	@Override
	public List<Usuario> consultarTodosUsuarios() {

		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();

		TypedQuery<Usuario> ltqu_resultadoUsuario = lem_entityManager.createNamedQuery("Usuario.findAll",
				Usuario.class);
		List<Usuario> llu_user = ltqu_resultadoUsuario.getResultList();

		lem_entityManager.close();

		return llu_user;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IUsuarioDAO#consultarUsuarioEstadoActivo(java.lang.String)
	 */
	@Override
	public Usuario consultarUsuarioEstadoActivo(String as_usuario) {

		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();

		TypedQuery<Usuario> ltqu_resultadoUsuario = lem_entityManager
				.createNamedQuery("Usuario.consultarUsuarioEstadoActivo", Usuario.class);
		ltqu_resultadoUsuario.setParameter(CS_USUARIO, as_usuario);
		ltqu_resultadoUsuario.setParameter(CS_ACTIVO, EnumBoolean.CHAR_S.getIs_codigo());
		List<Usuario> llu_user = ltqu_resultadoUsuario.getResultList();

		if (llu_user.isEmpty())
			return null;

		Usuario lu_usuario = llu_user.iterator().next();
		lem_entityManager.close();

		return lu_usuario;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IUsuarioDAO#consultarUsuarioBloqueoNatural(java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public List<Usuario> consultarUsuarioBloqueoNatural(String as_tipoDocumento, String as_numeroDocumento,
			String as_usuarioBloqueo) {
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();

		TypedQuery<Usuario> ltqu_resultadoUsuario = lem_entityManager
				.createNamedQuery("Usuario.consultarUsuarioPersona", Usuario.class);
		ltqu_resultadoUsuario.setParameter("tipoDocumento", as_tipoDocumento);
		ltqu_resultadoUsuario.setParameter("numeroDocumento", as_numeroDocumento);
		ltqu_resultadoUsuario.setParameter("nombreUsuario", as_usuarioBloqueo);
		ltqu_resultadoUsuario.setParameter(CS_ACTIVO, EnumBoolean.CHAR_S.getIs_codigo());
		List<Usuario> lu_user = ltqu_resultadoUsuario.getResultList();

		lem_entityManager.close();

		return lu_user;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IUsuarioDAO#consultarUsuariosAsociacion(java.lang.String, java.lang.String)
	 */
	@Override
	public Usuario consultarUsuariosAsociacion(String as_tipoDocumento, String as_numeroDocumento) {
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();

		TypedQuery<Usuario> ltqu_resultadoUsuario = lem_entityManager
				.createNamedQuery("Usuario.consultarUsuariosAsociacion", Usuario.class);
		ltqu_resultadoUsuario.setParameter("tipoDocumento", as_tipoDocumento);
		ltqu_resultadoUsuario.setParameter("numeroDocumento", as_numeroDocumento);
		ltqu_resultadoUsuario.setParameter(CS_ACTIVO, EnumBoolean.CHAR_S.getIs_codigo());
		List<Usuario> llu_user = ltqu_resultadoUsuario.getResultList();

		if (llu_user.isEmpty()) {
			return null;
		}

		return llu_user.iterator().next();
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IUsuarioDAO#consultarUsuarioBloqueoEntidadEspecial(java.lang.String)
	 */
	@Override
	public List<Usuario> consultarUsuarioBloqueoEntidadEspecial(String as_usuarioBloqueo) {
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();

		TypedQuery<Usuario> ltqu_resultadoUsuario = lem_entityManager
				.createNamedQuery("Usuario.consultarUsuarioPersonaEntidadEspecial", Usuario.class);
		ltqu_resultadoUsuario.setParameter("usuarioNombre", as_usuarioBloqueo);
		ltqu_resultadoUsuario.setParameter(CS_ACTIVO, EnumBoolean.CHAR_S.getIs_codigo());
		List<Usuario> lu_user = ltqu_resultadoUsuario.getResultList();

		lem_entityManager.close();

		return lu_user;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IUsuarioDAO#consultaUsuarioPendienteAprobacion(java.lang.String)
	 */
	@Override
	public List<Usuario> consultaUsuarioPendienteAprobacion(String as_tipoEstadoCuenta) {

		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();

		TypedQuery<Usuario> ltqu_resultadoUsuario = lem_entityManager
				.createNamedQuery("Usuario.consultarUsuarioEstadoPA", Usuario.class);
		ltqu_resultadoUsuario.setParameter("estadoCuentaPA", as_tipoEstadoCuenta);
		List<Usuario> lu_user = ltqu_resultadoUsuario.getResultList();

		lem_entityManager.close();

		return lu_user;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IUsuarioDAO#consultarUsuarioUUIDActivacion(java.lang.String)
	 */
	@Override
	public Usuario consultarUsuarioUUIDActivacion(String as_codigo) {
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();

		TypedQuery<Usuario> ltqu_resultadoUsuario = lem_entityManager
				.createNamedQuery("Usuario.consultarUUIDActivacion", Usuario.class);
		ltqu_resultadoUsuario.setParameter("uuidUrlActivacion", as_codigo);
		List<Usuario> llu_user = ltqu_resultadoUsuario.getResultList();

		if (llu_user.isEmpty())
			return null;

		return llu_user.iterator().next();
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IUsuarioDAO#actualizaUsuario(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Usuario)
	 */
	@Override
	public Boolean actualizaUsuario(Usuario au_usuario) {
		try {
			EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
			lem_entityManager.merge(au_usuario);
			return true;
		} catch (DatabaseException | PersistenceException ae_excepcion) {
			throw new ExcepcionesNegocio(EnumExcepcionesGenerales.ERROR_BASE_DATOS, new String[] {}, ae_excepcion);
		}
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IUsuarioDAO#consultarUsuario(java.lang.String)
	 */
	@Override
	public Usuario consultarUsuario(String as_nombreUsuario) {
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();

		TypedQuery<Usuario> ltqu_resultadoUsuario = lem_entityManager.createNamedQuery("Usuario.consultarUsuario",
				Usuario.class);
		ltqu_resultadoUsuario.setParameter(CS_USUARIO, as_nombreUsuario);
		List<Usuario> llu_user = ltqu_resultadoUsuario.getResultList();

		if (llu_user.isEmpty()) {
			return null;
		}

		return llu_user.iterator().next();
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IUsuarioDAO#modificarContrasenaUsuario(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Usuario, co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.HistoricoClave)
	 */
	@Override
	public Boolean modificarContrasenaUsuario(Usuario au_usuario, HistoricoClave ahc_historicoClave) {

		EntityManager lem_em = iiemf_entityFactory.consultarEntityManager();
		lem_em.merge(au_usuario);
		ahc_historicoClave.setUsuario(au_usuario);
		lem_em.merge(ahc_historicoClave);

		return true;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IUsuarioDAO#crearUsuarioJuridico(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Persona, co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Direccion, co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.PersonaDireccion, co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.PersonaJuridica, co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Usuario, co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.UsuarioRol)
	 */
	@Override
	public Usuario crearUsuarioJuridico(Persona ap_persona, Direccion ad_direccion,
			PersonaDireccion apd_personDireccion, PersonaJuridica apj_personaJuridica, Usuario au_usuario,
			UsuarioRol aur_usuarioRol) {
		EntityManager lem_em = iiemf_entityFactory.consultarEntityManager();

		lem_em.persist(ap_persona);
		lem_em.persist(ad_direccion);

		apd_personDireccion.setDireccion(ad_direccion);
		apd_personDireccion.setPersona(ap_persona);

		lem_em.persist(apd_personDireccion);

		apj_personaJuridica.setPersona(ap_persona);
		lem_em.persist(apj_personaJuridica);

		au_usuario.setPersonaJuridica(apj_personaJuridica);
		au_usuario.setPersona(ap_persona);

		lem_em.persist(au_usuario);

		aur_usuarioRol.setUsuario(au_usuario);
		lem_em.persist(aur_usuarioRol);

		au_usuario.setUsuarioRols(new ArrayList<>());
		au_usuario.getUsuarioRols().add(aur_usuarioRol);
		return au_usuario;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IUsuarioDAO#consultarUsuariosNombre(java.lang.String)
	 */
	@Override
	public List<String> consultarUsuariosNombre(String as_nombreUsuario) {
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();

		TypedQuery<String> ltqu_resultadoUsuario = lem_entityManager.createNamedQuery("Usuario.consultarUsuariosNombre",
				String.class);
		ltqu_resultadoUsuario.setParameter(CS_USUARIO, as_nombreUsuario + "%");
		List<String> llu_user;
		llu_user = ltqu_resultadoUsuario.getResultList();

		return llu_user;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IUsuarioDAO#actualizarUsuarioAdministrador(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Usuario, co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.UsuarioRol)
	 */
	@Override
	public Boolean actualizarUsuarioAdministrador(Usuario au_usuario, UsuarioRol aur_usuarioRol) {

		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();

		lem_entityManager.merge(au_usuario);
		lem_entityManager.merge(aur_usuarioRol);

		return true;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IUsuarioDAO#consultarUsuarioPersonaJuridica(java.lang.String)
	 */
	@Override
	public Usuario consultarUsuarioPersonaJuridica(String as_idPersona) {
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();

		TypedQuery<Usuario> ltqu_resultadoUsuario = lem_entityManager
				.createNamedQuery("Usuario.consultarUsuariosPersonaJuridica", Usuario.class);
		ltqu_resultadoUsuario.setParameter("idPersonaJuridica", as_idPersona);
		List<Usuario> llu_usuario = ltqu_resultadoUsuario.getResultList();

		if (llu_usuario.isEmpty()) {
			return null;
		}

		return llu_usuario.iterator().next();
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IUsuarioDAO#eliminarUsuarioPJRechazado(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Usuario)
	 */
	@Override
	public Boolean eliminarUsuarioPJRechazado(Usuario au_usuario) {
		try {
			EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
			au_usuario = lem_entityManager.find(Usuario.class, au_usuario.getId());
			lem_entityManager.remove(au_usuario);
		} catch (DatabaseException | PersistenceException ae_excepcion) {
			throw new ExcepcionesNegocio(EnumExcepcionesGenerales.ERROR_BASE_DATOS, new String[] {}, ae_excepcion);
		}
		return true;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IUsuarioDAO#eliminarUsuario(java.lang.String)
	 */
	@Override
	public Boolean eliminarUsuario(String as_idUsuario) {
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
		Usuario lu_usuario = lem_entityManager.find(Usuario.class, as_idUsuario);
		lem_entityManager.remove(lu_usuario);
		return true;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IUsuarioDAO#consultarUsuariosEstado()
	 */
	@Override
	public List<Usuario> consultarUsuariosEstado() {
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();

		TypedQuery<Usuario> ltqu_resultadoUsuario = lem_entityManager
				.createNamedQuery("Usuario.consultarUsuariosEstado", Usuario.class);
		ltqu_resultadoUsuario.setParameter("tipoEstado", EnumTipoEstadoCuenta.REGISTRADO.getIs_id());

		List<Usuario> llu_usuario;
		llu_usuario = ltqu_resultadoUsuario.getResultList();

		return llu_usuario;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IUsuarioDAO#consultarCorreoElectronico(java.lang.String)
	 */
	@Override
	public Usuario consultarCorreoElectronico(String as_correoElectronico) {
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();

		TypedQuery<Usuario> ltqu_resultadoUsuario = lem_entityManager
				.createNamedQuery("Usuario.consultarCorreoElectronico", Usuario.class);
		ltqu_resultadoUsuario.setParameter("correoElectronico", as_correoElectronico);
		List<Usuario> llu_user = ltqu_resultadoUsuario.getResultList();

		if (llu_user.isEmpty()) {
			return null;
		}

		return llu_user.iterator().next();
	}
}
