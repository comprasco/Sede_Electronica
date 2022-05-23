/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IUsuarioBloqueoBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless
 * Nombre del elemento: IUsuarioBloqueoBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioBloqueoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioDTO;

/**
 * Interface de la capa de negocio. <br>
 * Permite definir las operaciones requeridas del recurso Usuario bloqueo.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IUsuarioBloqueoBusiness {

	/**
	 * Metodo que permite crear el objeto a una Entidad asociada a la capa DAO.
	 *
	 * @param aubd_usuarioBloqueo el parametro usuario bloqueo
	 * @return true si la operacion se realiza exitosamente.
	 */
	public Boolean crearUsuarioBloqueo(UsuarioBloqueoDTO aubd_usuarioBloqueo);

	/**
	 * Metodo que permite bloquear un usuario por medio de las entidades, bloqueo
	 * por el administrador.
	 *
	 * @param aud_usuario         usuarioDTO al cual se va cambiar el estado
	 * @param aubd_usuarioBloqueo usuarioBloqueoDTO registro del bloqueo de usuario
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	public Boolean bloqueoUsuario(UsuarioDTO aud_usuario, UsuarioBloqueoDTO aubd_usuarioBloqueo);

	/**
	 * Metodo que permite desbloquear un usuario por medio de las entidades,
	 * desbloqueo por el administrador .
	 *
	 * @param aud_usuario            usuarioDTO al cual se va cambiar el estado
	 * @param aubd_usuarioDesbloqueo usuarioBloqueoDTO registro del desbloqueo de
	 *                               usuario
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	public Boolean desbloqueoUsuario(UsuarioDTO aud_usuario, UsuarioBloqueoDTO aubd_usuarioDesbloqueo);

	/**
	 * Metodo que registra bloqueo de Usuario, bloqueo por el sistema .
	 *
	 * @param aud_usuario    usuario bloqueado
	 * @param as_observacion observacion insercion
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	public Boolean bloqueoUsuario(UsuarioDTO aud_usuario, String as_observacion);

}
