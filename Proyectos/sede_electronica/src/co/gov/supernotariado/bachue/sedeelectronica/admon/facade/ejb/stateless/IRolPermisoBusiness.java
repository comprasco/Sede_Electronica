/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IRolPermisoBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless
 * Nombre del elemento: IRolPermisoBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless;

import java.util.List;
import java.util.Map;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.RolListaPermisosDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.RolPermisoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.RolPermiso;

/**
 * Interface de la capa de negocio. <br>
 * Permite definir las operaciones requeridas del recurso Rol permiso.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IRolPermisoBusiness {

	/**
	 * Metodo que consulta las asociaciones de los roles y permisos que existen en
	 * la base de datos.
	 *
	 * @return Lista de RolPermisoDTO si existen datos en la base de datos.
	 */
	public List<RolPermisoDTO> consultarTodasAsociaciones();

	/**
	 * Metodo que permite consultar roles vs url permitidas.<br>
	 * La clave es el path y el valor es una lista de roles
	 *
	 * @return Map con urls con sus roles permitidos
	 */
	public Map<String, String[]> consultarRolesURLs();

	/**
	 * Metodo que guarda los roles y permisos en la base de datos si ya existe ese
	 * rol con ese permiso se modifica, si no se crea.
	 *
	 * @param arlp_rolListaPermisoDto el parametro rol lista permiso dto
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	public Boolean guardarRolesPermisos(RolListaPermisosDTO arlp_rolListaPermisoDto);

	/**
	 * Metodo que permite organizar URLs vs sus roles.
	 *
	 * @param alrp_permisos lista de roles y permisos existentes en la base de datos
	 * @return Map que entrega URLs organizadas vs sus roles
	 */
	public Map<String, String[]> organizarURLs(List<RolPermiso> alrp_permisos);

	/**
	 * Metodo que permite actualizar roles y urls en el cache.
	 */
	public void actualizarRolesURLsCache();

	/**
	 * Metodo que permite actualizar roles y urls en el cache a partir de un map.
	 *
	 * @param ams_rolesURL map con la lista de urlPermisos
	 */
	public void actualizarRolesURLsCache(Map<String, String[]> ams_rolesURL);

	/**
	 * Metodo que consulta todos los roles vs permisos.
	 *
	 * @return Resultado para consultar lista rol lista permiso retornado como una
	 *         lista de RolListaPermisosDTO
	 */
	public List<RolListaPermisosDTO> consultarListaRolListaPermiso();

	/**
	 * Metodo que verifica la existencia de una url con permisos.
	 *
	 * @param as_url url a comprobar
	 * @return Booleno resumiendo existencia
	 */
	public Boolean consultarUrl(String as_url);

}
