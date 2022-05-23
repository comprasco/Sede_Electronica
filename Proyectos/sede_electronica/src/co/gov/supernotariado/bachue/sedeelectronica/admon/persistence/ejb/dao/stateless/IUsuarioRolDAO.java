/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IUsuarioRolDAO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless
 * Nombre del elemento: IUsuarioRolDAO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless;

import java.util.List;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.PersonaDireccion;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.UsuarioRol;

/**
 * Interface para definir operaciones sobre objetos de acceso a datos (DAO) <br>
 * Define operaciones para manipular el modelo de datos Usuario rol.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IUsuarioRolDAO {
	
	/**
	 * Metodo que permite crear usuarioRol en la base de datos.
	 *
	 * @param aur_usuarioRol       el parametro usuario rol
	 * @param apd_personaDireccion el parametro persona direccion
	 * @return true si se almacena exitosamente el usuarioRol.
	 */
	public Boolean crearUsuarioRol(UsuarioRol aur_usuarioRol, PersonaDireccion apd_personaDireccion);

	/**
	 * Metodo que permite consultar relacion usuario rol a partir del nombre del
	 * usuario.
	 *
	 * @param as_nombreUsuario Nombre del usuario
	 * @return Lista de usuario vs Rol encontrados a partir del nombre de usuario
	 *         seleccionado
	 */
	public List<UsuarioRol> consultarRolUsuarios(String as_nombreUsuario);

	/**
	 * Metodo que permite consultar relacion activa de usuario vs rol.
	 *
	 * @param as_nombreUsuario nombre del usuario
	 * @return Retorna entidad tipo de UsuarioRol
	 */
	public UsuarioRol consultarRolUsuarioNombre(String as_nombreUsuario);

	/**
	 * Metodo que permite consultar el estado del usuario.
	 *
	 * @param as_nombreUsuario el parametro nombre usuario
	 * @return Retorna entidad tipo de UsuarioRol
	 */
	public UsuarioRol consultarEstadoUsuarioRol(String as_nombreUsuario);

	/**
	 * Metodo que permite consultar la cantidad de usuarios por rol.
	 *
	 * @param as_roles el parametro roles
	 * @return Resultado para contar usuarios rol retornado como Integer
	 */
	public Integer contarUsuariosRol(String[] as_roles);

	/**
	 * Metodo que permite consultar todos los usuarios de forma paginada.
	 *
	 * @param ai_valorIncialPag el parametro valor incial pag
	 * @param ai_valorFinalPag  el parametro valor final pag
	 * @param as_roles          el parametro roles
	 * @return Lista de usuarios encontrados
	 */
	public List<UsuarioRol> consultarUsuariosRol(Integer ai_valorIncialPag, Integer ai_valorFinalPag, String[] as_roles);

	/**
	 * Metodo que consulta los usuario rol
	 * 
	 * @param as_roles roles a consultar
	 * @return List<UsuarioRol>
	 */
	public List<UsuarioRol> consultarUsuariosRol(String[] as_roles);

}
