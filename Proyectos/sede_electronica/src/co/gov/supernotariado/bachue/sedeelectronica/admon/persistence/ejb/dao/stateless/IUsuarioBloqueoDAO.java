/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IUsuarioBloqueoDAO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless
 * Nombre del elemento: IUsuarioBloqueoDAO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless;

import java.util.List;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Usuario;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.UsuarioBloqueo;

/**
 * Interface para definir operaciones sobre objetos de acceso a datos (DAO) <br>
 * Define operaciones para manipular el modelo de datos Usuario bloqueo.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IUsuarioBloqueoDAO {
	
	/**
	 * Metodo que permite crear usuarioBloqueo en la base de datos.
	 * @param aub_usuarioBloqueo Entidad UsuarioBloqueo a crear en la base de datos.
	 * @return true si se almacena exitosamente el usuarioBloqueo.
	 */
	public Boolean crearUsuarioBloqueo(UsuarioBloqueo aub_usuarioBloqueo);
	
	/**
	 * Metodo que permite hacer el almacenamiento y actualizacion en la base de
	 * datos de la funcionalidad de bloqueo y desbloqueo de un usuario interno o
	 * externo.
	 *
	 * @param au_usuario         Usuario que sera cambiado de estado
	 * @param aub_usuarioBloqueo Registro del bloqueo o desbloqueo del usuario
	 * @return true si se almacena exitosamente el bloqueo o desbloqueo
	 */
	public Boolean mantenimientoUsuarios(Usuario au_usuario, UsuarioBloqueo aub_usuarioBloqueo);

	/**
	 * Metodo encargado de consultar la lista de bloqueos de un usuario
	 * 
	 * @param au_usuario usuario para consultar sus bloqueos
	 * @return Lista de usuario bloqueo, del parametro consultado
	 */
	public List<UsuarioBloqueo> consultarBloqueoUsuario(Usuario au_usuario);

}