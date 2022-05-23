/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BitacoraAudDAOImpl.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.impl
 * Nombre del elemento: BitacoraAudDAOImpl
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.impl;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IBitacoraAudDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.BitacoraAud;
import co.gov.supernotariado.bachue.sedeelectronica.common.dao.singleton.interfaces.IEntityManagerFactory;

/**
 * Clase tipo objeto de acceso a datos (DAO). <br>
 * Permite interactuar con la base de datos manipulando y realizando operaciones
 * <br>
 * sobre el modelo de datos Bitacora aud.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless
@LocalBean
public class BitacoraAudDAOImpl implements IBitacoraAudDAO {
	
	/**
	 * Atributo de instancia tipo IEntityManagerFactory para definir la propiedad
	 * entity factory.
	 */
	@EJB
	private IEntityManagerFactory iiemf_entityFactory;


	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IBitacoraAudDAO#crearBitacoraAud(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.BitacoraAud)
	 */
	@Override
	public Boolean crearBitacoraAud(BitacoraAud aba_bitacoraAud) {
		try {
			EntityManager lem_entityManager = iiemf_entityFactory.consultarEntityManager();
			lem_entityManager.persist(aba_bitacoraAud);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
}
