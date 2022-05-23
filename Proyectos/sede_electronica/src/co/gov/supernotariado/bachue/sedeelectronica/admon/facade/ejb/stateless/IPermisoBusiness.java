/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IPermisoBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless
 * Nombre del elemento: IPermisoBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless;

import java.util.List;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PermisoBooleanoDTO;

/**
 * Interface de la capa de negocio. <br>
 * Permite definir las operaciones requeridas del recurso Permiso.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IPermisoBusiness {

	/**
	 * Metodo que realiza cambio de estado activo a inactivo y viceversa de los
	 * permisos.
	 *
	 * @param apb_permisoBooleanoDto el parametro permiso booleano dto
	 * @return Boolean true: si se hace correctamente
	 */
	public Boolean cambiarEstadoPermiso(PermisoBooleanoDTO apb_permisoBooleanoDto);

	/**
	 * Metodo que permite consultar los permisos registrados en la base de datos.
	 *
	 * @return Lista de PermisoBooleanoDTO, si existen permisos en la base de datos.
	 */
	public List<PermisoBooleanoDTO> consultarPermisos();

	/**
	 * Metodo que permite consultar los permisos activos registrados en la base de
	 * datos.
	 *
	 * @return Resultado para consultar permisos activos retornado como una lista de
	 *         PermisoBooleanoDTO
	 */
	public List<PermisoBooleanoDTO> consultarPermisosActivos();
}
