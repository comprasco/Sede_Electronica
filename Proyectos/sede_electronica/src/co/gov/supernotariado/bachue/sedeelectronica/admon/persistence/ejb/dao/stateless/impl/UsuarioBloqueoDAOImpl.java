/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: UsuarioBloqueoDAOImpl.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.impl
 * Nombre del elemento: UsuarioBloqueoDAOImpl
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

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IUsuarioBloqueoDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Usuario;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.UsuarioBloqueo;
import co.gov.supernotariado.bachue.sedeelectronica.common.dao.singleton.interfaces.IEntityManagerFactory;

/**
 * Clase tipo objeto de acceso a datos (DAO). <br>
 * Permite interactuar con la base de datos manipulando y realizando operaciones
 * <br>
 * sobre el modelo de datos Usuario bloqueo.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless
@LocalBean
public class UsuarioBloqueoDAOImpl implements IUsuarioBloqueoDAO {

	/**
	 * Atributo de instancia tipo IEntityManagerFactory para definir la propiedad
	 * entity factory.
	 */
	@EJB
	private IEntityManagerFactory iiemf_entityFactory;

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.
	 * stateless.IUsuarioBloqueoDAO#crearUsuarioBloqueo(co.gov.supernotariado.bachue
	 * .sedeelectronica.admon.persistence.model.UsuarioBloqueo)
	 */
	@Override
	public Boolean crearUsuarioBloqueo(UsuarioBloqueo aub_usuarioBloqueo) {
		try {
			EntityManager em = iiemf_entityFactory.consultarEntityManager();
			em.persist(aub_usuarioBloqueo);
		} catch (Exception ae_e) {
			return false;
		}
		return true;
	}

	/**
	 * Metodo que permite realizar la persistencia del bloqueo de usuarios, se
	 * encarga de actualizar la tabla de usuarios y de registrar en la tabla de
	 * bloqueos segun sea el caso (bloqueo o desbloqueo).
	 *
	 * @param au_usuario         Usuario al cual se le va aplicar el cambio de
	 *                           estado de cuenta
	 * @param aub_usuarioBloqueo Registro del bloqueo o desbloqueo del usuario *
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	@Override
	public Boolean mantenimientoUsuarios(Usuario au_usuario, UsuarioBloqueo aub_usuarioBloqueo) {
		try {
			EntityManager lem_em = iiemf_entityFactory.consultarEntityManager();

			/* actualizacion usuario */
			lem_em.merge(au_usuario);
			/* insercion usuarioBloqueo */
			aub_usuarioBloqueo.setUsuario(au_usuario);
			lem_em.persist(aub_usuarioBloqueo);

		} catch (Exception ae_e) {
			return false;
		}

		return true;
	}
	
	@Override
	public List<UsuarioBloqueo> consultarBloqueoUsuario(Usuario au_usuario) {
		EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();

		TypedQuery<UsuarioBloqueo> ltqub_resultadoUsuarioBloqueo = lem_entityManager.createNamedQuery("UsuarioBloqueo.findByUser", UsuarioBloqueo.class);
		ltqub_resultadoUsuarioBloqueo.setParameter("usuario", au_usuario);
		List<UsuarioBloqueo> llub_usuarioBloqueo = ltqub_resultadoUsuarioBloqueo.getResultList();

		lem_entityManager.close();
		return llub_usuarioBloqueo;
	}

}
