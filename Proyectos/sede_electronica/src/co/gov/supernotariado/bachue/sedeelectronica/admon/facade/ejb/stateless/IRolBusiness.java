/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IRolBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless
 * Nombre del elemento: IRolBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless;

import java.util.List;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.RolBooleanoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.RolDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Rol;

/**
 * Interface de la capa de negocio. <br>
 * Permite definir las operaciones requeridas del recurso Rol.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IRolBusiness {

	/**
	 * Metodo que permite actualizar todos los roles existentes en cache.
	 */
	public void actualizarRolesCache();

	/**
	 * Metodo que permite actualizar todos los roles existentes en cache asignandole
	 * directamente una lista de roles.
	 *
	 * @param alr_roles el parametro roles
	 */
	public void actualizarRolesCache(List<Rol> alr_roles);

	/**
	 * Metodo que activa o inactiva el rol.
	 *
	 * @param arb_rolBooleanoDto el parametro rol booleano dto
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	public Boolean cambiarEstadoRol(RolBooleanoDTO arb_rolBooleanoDto);

	/**
	 * Metodo que consulta todos los roles existentes en la base de datos.
	 *
	 * @return Resultado para consultar roles retornado como una lista de RolDTO
	 */
	public List<RolDTO> consultarRoles();

	/**
	 * Metodo que consulta todos los roles existentes en la base de datos.
	 *
	 * @param as_nombreRol el parametro nombre rol
	 * @return Resultado para consultar roles retornado como RolDTO
	 */
	public RolDTO consultarRoles(String as_nombreRol);

	/**
	 * Metodo que entrega todos los roles activos existentes.
	 *
	 * @return Resultado para consultar roles activos retornado como una lista de
	 *         RolBooleanoDTO
	 */
	public List<RolBooleanoDTO> consultarRolesActivos();

	/**
	 * Metodo que entrega todos los roles con boleanos existentes.
	 *
	 * @return Resultado para consultar roles booleano retornado como una lista de
	 *         RolBooleanoDTO
	 */
	public List<RolBooleanoDTO> consultarRolesBooleano();

	/**
	 * Metodo que permite crear el objeto a una Entidad asociada a la capa DAO.
	 *
	 * @param arb_rolDto el parametro rol dto
	 * @return true si la operacion se realiza exitosamente.
	 */
	public Boolean crearRol(RolBooleanoDTO arb_rolDto);

	/**
	 * Metodo que permite consultar los roles en cache.
	 *
	 * @return Resultado para consultar cache rol retornado como una lista de RolDTO
	 */
	public List<RolDTO> consultarCacheRol();

	/**
	 * Metodo que permite listar los roles administradores.
	 *
	 * @return Resultado para consultar roles administradores retornado como una
	 *         lista de RolDTO, lista de roles administradores
	 */
	public List<RolDTO> consultarRolesAdministradores();
}
