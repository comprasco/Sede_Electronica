/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IPersonaDireccionDAO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless
 * Nombre del elemento: IPersonaDireccionDAO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.PersonaDireccion;

/**
 * Interface para definir operaciones sobre objetos de acceso a datos (DAO) <br>
 * Define operaciones para manipular el modelo de datos Persona direccion.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IPersonaDireccionDAO {
	
	/**
	 * Metodo que permite crear personaDireccion en la base de datos.
	 *
	 * @param apd_personaDireccion el parametro persona direccion
	 * @return true si se almacena exitosamente la personaDireccion.
	 */
	public Boolean crearPersonaDireccion(PersonaDireccion apd_personaDireccion);

}