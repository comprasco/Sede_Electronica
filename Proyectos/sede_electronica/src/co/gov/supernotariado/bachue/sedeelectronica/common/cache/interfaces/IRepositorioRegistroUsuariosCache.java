/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IRepositorioRegistroUsuariosCache.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.cache.interfaces
 * Nombre del elemento: IRepositorioRegistroUsuariosCache
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.cache.interfaces;

import java.util.Map;

import javax.ejb.Local;

import org.springframework.security.core.session.SessionInformation;

/**
 * Interface que permite definir los metodos para gestionar el repositorio de
 * registro de usuarios cache.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IRepositorioRegistroUsuariosCache {

	/**
	 * Metodo que permite agregar usuario teniendo en cuenta su sesion y la
	 * informacion del mismo.
	 *
	 * @param as_idSesion          el parametro id sesion
	 * @param as_sesionInformation el parametro sesion information
	 */
	public void agregarUsuarioSesion(String as_idSesion, SessionInformation as_sesionInformation);

	/**
	 * Metodo que permite consulta usuario en el cache por su id.
	 *
	 * @param as_idSesion el parametro id sesion
	 * @return Informacion de la sesion
	 */
	public SessionInformation consultarUsuario(String as_idSesion);

	/**
	 * Metodo que permite eliminar una sesion por su id.
	 *
	 * @param as_idSesion el parametro id sesion
	 */
	public void eliminarUsuario(String as_idSesion);

	/**
	 * Metodo que permite eliminar una sesion por su nombre de usuario.
	 *
	 * @param as_nombreUsuario el parametro nombre usuario
	 */
	public void eliminarUsuarioNombre(String as_nombreUsuario);

	/**
	 * Metodo que permite consultar sesiones registradas.
	 *
	 * @return Map que conetiene id de la sesion como llave y en su valor su
	 *         respectiva informacion de sesion
	 */
	public Map<String, SessionInformation> consultarSesionesRegistradas();

	/**
	 * Consultar usuario nombre.
	 *
	 * @param as_nombreUsuario el parametro nombre usuario
	 * @return Resultado para consultar usuario nombre retornado como String
	 */
	public String consultarUsuarioNombre(String as_nombreUsuario);

}
