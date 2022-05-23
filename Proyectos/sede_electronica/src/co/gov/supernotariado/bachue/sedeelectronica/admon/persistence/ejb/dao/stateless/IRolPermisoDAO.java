/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IRolPermisoDAO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless
 * Nombre del elemento: IRolPermisoDAO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless;

import java.util.List;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.RolPermiso;

/**
 * Interface para definir operaciones sobre objetos de acceso a datos (DAO) <br>
 * Define operaciones para manipular el modelo de datos Rol permiso.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IRolPermisoDAO {
	
	/**
	 * Metodo que permite crear rolPermiso en la base de datos.
	 *
	 * @param arp_rolPermiso el parametro rol permiso
	 * @return true si se almacena exitosamente la rolPermiso.
	 */
	public Boolean crearRolPermiso(RolPermiso arp_rolPermiso);

	/**
	 * Metodo que permite buscar todas las asociaciones de rolPermiso en la base de datos.
	 * @return Lista de RolPermiso lista de asociaciones
	 */
	public List<RolPermiso> consultarAsociaciones();
	
	
	/**
	 * Metodo que permite buscar una asociacion de rolPermiso en la base de datos.
	 *
	 * @param arp_rolPermiso el parametro rol permiso
	 * @return Resultado para consultar rol permiso retornado como RolPermiso
	 */
	public RolPermiso consultarRolPermiso(RolPermiso arp_rolPermiso);

	/**
	 * Metodo que permite actualizar una asociacion de rolPermiso en la base de
	 * datos.
	 *
	 * @param arp_rolPermiso el parametro rol permiso
	 * @return true, si se cumple o la accion se realiza exitosamente
	 */
	public Boolean actualizarRolPermiso(RolPermiso arp_rolPermiso);

	/**
	 * Metodo que permite buscar todas las asociaciones de rolPermiso en la base de datos.
	 * @return Lista de RolPermiso, lista de asociaciones
	 */
	public List<RolPermiso> consultarTodasAsociaciones();

	
}
