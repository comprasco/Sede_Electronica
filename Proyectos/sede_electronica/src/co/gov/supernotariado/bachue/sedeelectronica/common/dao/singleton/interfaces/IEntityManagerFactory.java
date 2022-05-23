/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IEntityManagerFactory.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.dao.singleton.interfaces
 * Nombre del elemento: IEntityManagerFactory
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.dao.singleton.interfaces;

import javax.persistence.EntityManager;
import javax.ejb.Local;

/**
 * El elemento Interface IEntityManagerFactory.<br>
 * Representa un/una interfaz entity manager factory.<br>
 * Interfaz que define los metodos disponibles para la gestionar el
 * EntityManagerFactory
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IEntityManagerFactory {

	/**
	 * Metodo que permite realizar consultar un entityManager.
	 *
	 * @return Resultado para consultar entity manager retornado como EntityManager
	 */
	public EntityManager consultarEntityManager();
}
