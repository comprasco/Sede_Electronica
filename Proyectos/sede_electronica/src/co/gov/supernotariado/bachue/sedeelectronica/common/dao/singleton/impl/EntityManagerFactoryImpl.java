/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EntityManagerFactoryImpl.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.dao.singleton.impl
 * Nombre del elemento: EntityManagerFactoryImpl
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.dao.singleton.impl;

import javax.ejb.LocalBean;
import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

import co.gov.supernotariado.bachue.sedeelectronica.common.dao.singleton.interfaces.IEntityManagerFactory;

/**
 * El elemento Class EntityManagerFactoryImpl.<br>
 * Representa un/una entity manager factory impl.<br>
 * Clase que implementa IEntityManagerFactory.
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Singleton
@LocalBean
public class EntityManagerFactoryImpl implements IEntityManagerFactory {

	/**
	 * Atributo de instancia tipo EntityManagerFactory para definir la propiedad
	 * factory.
	 */
	@PersistenceUnit(name = "project-snr-base")
	EntityManagerFactory iemf_factory;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * co.gov.supernotariado.bachue.sedeelectronica.common.dao.singleton.interfaces.
	 * IEntityManagerFactory#consultarEntityManager()
	 */
	@Override
	public EntityManager consultarEntityManager() {
		return iemf_factory.createEntityManager();
	}
}
