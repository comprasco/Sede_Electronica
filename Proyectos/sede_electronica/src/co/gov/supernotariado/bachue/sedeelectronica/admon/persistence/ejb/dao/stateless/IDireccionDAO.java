/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IDireccionDAO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless
 * Nombre del elemento: IDireccionDAO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Direccion;

/**
 * Interface para definir operaciones sobre objetos de acceso a datos (DAO) <br>
 * Define operaciones para manipular el modelo de datos Direccion.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IDireccionDAO {

	/**
	 * Metodo que permite crear una direccion referente a una persona.
	 *
	 * @param apd_personaDireccion direccion de la persona
	 * @return exito o no de la transaccion
	 */
	public Boolean crearDireccion(Direccion apd_personaDireccion);

	/**
	 * Metodo que permite modifcar una direccion referente a una persona.
	 *
	 * @param ad_direccion direccion a modificar
	 * @return exito o no de la transaccion
	 */
	public Boolean modificarDireccion(Direccion ad_direccion);

}
