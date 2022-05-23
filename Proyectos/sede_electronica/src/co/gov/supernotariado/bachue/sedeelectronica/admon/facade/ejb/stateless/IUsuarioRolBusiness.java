/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IUsuarioRolBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless
 * Nombre del elemento: IUsuarioRolBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PersonaDireccionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioRolDTO;

/**
 * Interface de la capa de negocio. <br>
 * Permite definir las operaciones requeridas del recurso Usuario rol.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IUsuarioRolBusiness {

	/**
	 * Metodo que permite crear el objeto a una Entidad asociada a la capa DAO.
	 *
	 * @param aur_usuarioRolDto    el parametro usuario rol dto
	 * @param apd_personaDireccion el parametro persona direccion
	 * @return true si la operacion se realiza exitosamente.
	 */
	public Boolean crearUsuarioRol(UsuarioRolDTO aur_usuarioRolDto, PersonaDireccionDTO apd_personaDireccion);

	/**
	 * Metodo que permite consultar usuario vs rol por nombre de usuario.
	 *
	 * @param as_nombreUsuario el parametro nombre usuario
	 * @return Resultado para consultar usuario rol nombre activo retornado como
	 *         UsuarioRolDTO
	 */
	public UsuarioRolDTO consultarUsuarioRolNombreActivo(String as_nombreUsuario);
	
	/**
	 * Metodo que permite consultar el estado del usuario.
	 *
	 * @param as_nombreUsuario el parametro nombre usuario
	 * @return Resultado para consultar estado usuario rol retornado como
	 *         UsuarioRolDTO
	 */
	public UsuarioRolDTO consultarEstadoUsuarioRol(String as_nombreUsuario);
	
}
