/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IPermisoDAO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless
 * Nombre del elemento: IPermisoDAO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless;

import java.util.List;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Permiso;

/**
 * Interface para definir operaciones sobre objetos de acceso a datos (DAO) <br>
 * Define operaciones para manipular el modelo de datos Permiso.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IPermisoDAO {
	
	/**
	 * Metodo que permite cambiar el estado de un permiso de la base de datos.
	 * 
	 * @param ap_permiso Entidad a la cual se le cambiara el estado de activo
	 * @return true si se cambia el estado correctamente en la base de datos.
	 */
	public Boolean cambiarEstadoPermiso(Permiso ap_permiso);

	/**
	 * Metodo que permite consultar los permisos de la base de datos.
	 * 
	 * @return Lista de permisos si existen permisos en la base de datos.
	 */
	public List<Permiso> consultarPermisos();

	/**
	 * Metodo que permite consultar los permisos activos de la base de datos.
	 * 
	 * @return Lista de permisos si existen permisos activos en la base de datos.
	 */
	public List<Permiso> consultarPermisosActivos();

}
