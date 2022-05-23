/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IRolDAO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless
 * Nombre del elemento: IRolDAO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless;

import java.util.List;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Rol;

/**
 * Interface para definir operaciones sobre objetos de acceso a datos (DAO) <br>
 * Define operaciones para manipular el modelo de datos Rol.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IRolDAO {

	/**
	 * Metodo que consulta los roles en la base de datos.
	 * 
	 * @return Lista de Rol si existen roles en la base de datos.
	 */
	public List<Rol> consultarRoles();
	
	/**
	 * Metodo que permite guardar un rol en la base de datos.
	 * 
	 * @param ar_rol Entidad Rol a guardar en la base de datos.
	 * @return true si se almacena exitosamente en la base de datos.
	 */
	public Boolean crearRol(Rol ar_rol);

	/**
	 * Metodo que permite cambiar el estado de un rol en la base de datos.
	 * 
	 * @param ar_rol Entidad a la cual cambiar el activo en la base de datos.
	 * @return true si se almacena exitosamente en la base de datos.
	 */
	public Boolean cambiarEstadoRol(Rol ar_rol);


}
