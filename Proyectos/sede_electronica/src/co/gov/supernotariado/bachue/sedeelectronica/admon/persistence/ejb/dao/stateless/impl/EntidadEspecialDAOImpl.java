/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EntidadEspecialDAOImpl.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.impl
 * Nombre del elemento: EntidadEspecialDAOImpl
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

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IEntidadEspecialDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.EntidadEspecial;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Usuario;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.UsuarioRol;
import co.gov.supernotariado.bachue.sedeelectronica.common.dao.singleton.interfaces.IEntityManagerFactory;

/**
 * Clase tipo objeto de acceso a datos (DAO). <br>
 * Permite interactuar con la base de datos manipulando y realizando operaciones
 * <br>
 * sobre el modelo de datos Entidad especial.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless
@LocalBean
public class EntidadEspecialDAOImpl implements IEntidadEspecialDAO {

	/**
	 * Atributo de instancia tipo IEntityManagerFactory para definir la propiedad
	 * entity factory.
	 */
	@EJB
	private IEntityManagerFactory iiemf_entityFactory;

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IEntidadEspecialDAO#consultarEntidadEspecial(java.lang.String)
	 */
	@Override
	public EntidadEspecial consultarEntidadEspecial(String as_documentoEntidadEspecial) {

		EntityManager lem_em = iiemf_entityFactory.consultarEntityManager();

		TypedQuery<EntidadEspecial> ltqee_entidadEspecial = lem_em
				.createNamedQuery("EntidadEspecial.consultarEntidadEspecialCod", EntidadEspecial.class);
		ltqee_entidadEspecial.setParameter("codigoEntidad", as_documentoEntidadEspecial);

		List<EntidadEspecial> llee_entidadEspcial = ltqee_entidadEspecial.getResultList();

		if (llee_entidadEspcial.isEmpty())
			return null;

		return llee_entidadEspcial.iterator().next();

	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IEntidadEspecialDAO#crearEntidadEspecial(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Usuario, co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.UsuarioRol, co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.EntidadEspecial)
	 */
	@Override
	public Boolean crearEntidadEspecial(Usuario au_usuario, UsuarioRol aur_usuarioRol,
			EntidadEspecial aee_entidadEspecial) {

		EntityManager lem_em = iiemf_entityFactory.consultarEntityManager();

		lem_em.persist(aee_entidadEspecial);
		au_usuario.setEntidadEspecial(aee_entidadEspecial);
		lem_em.persist(au_usuario);
		aur_usuarioRol.setUsuario(au_usuario);
		lem_em.persist(aur_usuarioRol);

		return true;

	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IEntidadEspecialDAO#consultarEntidadEspecial(java.lang.String, java.lang.String)
	 */
	@Override
	public EntidadEspecial consultarEntidadEspecial(String as_numeroDocumento, String as_tipoDocumento) {
		EntityManager lem_em = iiemf_entityFactory.consultarEntityManager();

		TypedQuery<EntidadEspecial> ltqee_entidadEspecial = lem_em.createNamedQuery("EntidadEspecial.consultarEntidadEspecialDoc", EntidadEspecial.class);
		ltqee_entidadEspecial.setParameter("numeroDocumento", as_numeroDocumento);
		ltqee_entidadEspecial.setParameter("tipoDocumento", as_tipoDocumento);
		
		List<EntidadEspecial> llee_entidadEspecial;
		llee_entidadEspecial = ltqee_entidadEspecial.getResultList();
		
		if (llee_entidadEspecial.isEmpty()) {
			return null;			
		}

		return llee_entidadEspecial.iterator().next();
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IEntidadEspecialDAO#consultarEntidadEspecialRazonSocial(java.lang.String)
	 */
	@Override
	public EntidadEspecial consultarEntidadEspecialRazonSocial(String as_entidadEspecial) {
		EntityManager lem_em = iiemf_entityFactory.consultarEntityManager();

		TypedQuery<EntidadEspecial> ltqee_entidadEspecial = lem_em
				.createNamedQuery("EntidadEspecial.consultarEntidadEspecialRazonSocial", EntidadEspecial.class);
		ltqee_entidadEspecial.setParameter("id", as_entidadEspecial);

		List<EntidadEspecial> llee_entidadEspecial;
		llee_entidadEspecial = ltqee_entidadEspecial.getResultList();

		if (llee_entidadEspecial.isEmpty()) {
			return null;
		}

		return llee_entidadEspecial.iterator().next();
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IEntidadEspecialDAO#modificarEntidadEspecial(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.EntidadEspecial)
	 */
	@Override
	public Boolean modificarEntidadEspecial(EntidadEspecial aee_entidadEspecialDTO) {
		EntityManager lem_em = iiemf_entityFactory.consultarEntityManager();
		lem_em.merge(aee_entidadEspecialDTO);
		return true;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IEntidadEspecialDAO#validarEntidadEspecial(java.lang.String)
	 */
	@Override
	public List<EntidadEspecial> validarEntidadEspecial(String as_id) {
		EntityManager lem_em = iiemf_entityFactory.consultarEntityManager();

		TypedQuery<EntidadEspecial> ltqee_entidadEspecial = lem_em.createNamedQuery("EntidadEspecial.consultarIdEntidadEspecial",
				EntidadEspecial.class);
		ltqee_entidadEspecial.setParameter("id", as_id);

		List<EntidadEspecial> llee_entidadEspecial;
		llee_entidadEspecial = ltqee_entidadEspecial.getResultList();

		return llee_entidadEspecial;
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IEntidadEspecialDAO#validarEntidadEspecial(java.lang.String)
	 */
	@Override
	public EntidadEspecial consultarIdEntidadEspecial(String as_id) {
		EntityManager lem_em = iiemf_entityFactory.consultarEntityManager();

		TypedQuery<EntidadEspecial> ltqee_entidadEspecial = lem_em.createNamedQuery("EntidadEspecial.consultarIdEntidadEspecial",
				EntidadEspecial.class);
		ltqee_entidadEspecial.setParameter("id", as_id);

		List<EntidadEspecial> llee_entidadEspecial;
		llee_entidadEspecial = ltqee_entidadEspecial.getResultList();
		
		if (llee_entidadEspecial.isEmpty()) {
			return null;
		}

		return llee_entidadEspecial.iterator().next();
	}

	@Override
	public List<EntidadEspecial> consultarEntidadesEspeciales() {
		EntityManager lem_em = iiemf_entityFactory.consultarEntityManager();

		TypedQuery<EntidadEspecial> ltqee_entidadEspecial = lem_em.createNamedQuery("EntidadEspecial.consultarEntidadesEspeciales",
				EntidadEspecial.class);

		List<EntidadEspecial> llee_entidadEspecial;
		llee_entidadEspecial = ltqee_entidadEspecial.getResultList();

		return llee_entidadEspecial;
	}

}
