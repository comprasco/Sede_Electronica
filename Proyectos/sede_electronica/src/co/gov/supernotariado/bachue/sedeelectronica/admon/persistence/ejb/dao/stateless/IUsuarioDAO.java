/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IUsuarioDAO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless
 * Nombre del elemento: IUsuarioDAO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless;

import java.util.List;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Direccion;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.HistoricoClave;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Persona;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.PersonaDireccion;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.PersonaJuridica;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Usuario;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.UsuarioRol;

/**
 * Interface para definir operaciones sobre objetos de acceso a datos (DAO) <br>
 * Define operaciones para manipular el modelo de datos Usuario.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IUsuarioDAO {
	
	/**
	 * Metodo que permite crear usuario en la base de datos.
	 *
	 * @param au_usuario     el parametro usuario
	 * @param aur_usuarioRol el parametro usuario rol
	 * @return true si se almacena exitosamente el usuario.
	 */
	public Boolean crearUsuarioRol(Usuario au_usuario, UsuarioRol aur_usuarioRol);

	/**
	 * Metodo que permite consultar un usuario activo.
	 *
	 * @param as_documentoUsuario documento del usuario
	 * @return usuario encontrado
	 */
	public Usuario consultarUsuarioActivo(String as_documentoUsuario);

	/**
	 * Metodo que permite consultar usuario por su codigo de autenticacion.
	 *
	 * @param as_uuidActivacion el parametro uuid activacion
	 * @return Resultado para consultar usuario UUID activacion retornado como
	 *         Usuario
	 */
	public Usuario consultarUsuarioUUIDActivacion(String as_uuidActivacion);

	/**
	 * Metodo que permite actualizar usuarios en la base de datos.
	 *
	 * @param au_usuario a actualizar en la base de datos.
	 * @return true, si se cumple o la accion se realiza exitosamente
	 */
	public Boolean actualizaUsuario(Usuario au_usuario);

	/**
	 * Metodo que permite consultar usuario por su nombre.
	 *
	 * @param as_nombreUsuario nombre de usuario
	 * @return entidad del usuario solicitado
	 */
	public Usuario consultarUsuario(String as_nombreUsuario);

	/**
	 * Metodo que permite modificar la contrasena del usuario, se realiza insercion
	 * en dos tablas diferentes de la base de datos.
	 *
	 * @param au_usuario         Entidad Usuario a modificar en la base de datos.
	 * @param ahc_historicoClave el parametro historico clave
	 * @return true si se modifica exitosamente la persona.
	 */
	public Boolean modificarContrasenaUsuario(Usuario au_usuario, HistoricoClave ahc_historicoClave);

	/**
	 * Metodo que permie consultar estado de un usuario.
	 *
	 * @param as_usuario nombre de usuario
	 * @return Resultado para consultar usuario estado activo retornado como Usuario
	 */
	public Usuario consultarUsuarioEstadoActivo(String as_usuario);

	/**
	 * Metodo que permite crear una persona juridica especificamente.
	 *
	 * @param ap_persona           persona a persistir
	 * @param ad_direccion         direccion
	 * @param apd_personaDireccion persona direccion
	 * @param apj_personaJuridica  persona juridica
	 * @param au_usuario           usuario
	 * @param aur_usuarioRol       relacion de usuario y respectivo rol
	 * @return Usuario si la transaccion fue correcta
	 */
	public Usuario crearUsuarioJuridico(Persona ap_persona, Direccion ad_direccion,
			PersonaDireccion apd_personaDireccion, PersonaJuridica apj_personaJuridica, Usuario au_usuario,
			UsuarioRol aur_usuarioRol);

	/**
	 * Metodo que permie consultar todas las solicitudes de creacion persona
	 * juridica pendiente por aprobacion (PA).
	 *
	 * @param as_usuarioPendienteAprobacion el parametro usuario pendiente
	 *                                      aprobacion
	 * @return Resultado para consulta usuario pendiente aprobacion retornado como
	 *         List
	 */
	public List<Usuario> consultaUsuarioPendienteAprobacion(String as_usuarioPendienteAprobacion);

	/**
	 * Metodo que permite consultar los usuarios para bloquear o desbloquear.
	 *
	 * @param as_tipoDocumento   el parametro tipo documento
	 * @param as_numeroDocumento el parametro numero documento
	 * @param as_usuarioBloqueo  el parametro usuario bloqueo
	 * @return Resultado para consultar usuario bloqueo natural retornado como List
	 */
	public List<Usuario> consultarUsuarioBloqueoNatural(String as_tipoDocumento, String as_numeroDocumento,
			String as_usuarioBloqueo);

	/**
	 * Metodo que permite consultar los usuarios para bloquear o desbloquear.
	 *
	 * @param as_usuarioBloqueo el parametro usuario bloqueo
	 * @return List<UsuarioDTO> usuario
	 */
	public List<Usuario> consultarUsuarioBloqueoEntidadEspecial(String as_usuarioBloqueo);

	/**
	 * Metodo que permite consultar todos los usuarios.
	 *
	 * @return Resultado para consultar todos usuarios retornado como List
	 */
	public List<Usuario> consultarTodosUsuarios();

	/**
	 * Metodo que permite consultar lisa de nombres de usuario por un conjunto de
	 * letras iniciales.
	 *
	 * @param as_nombreUsuario inicial del nombre de usuario
	 * @return Resultado para consultar usuarios nombre retornado como List
	 */
	public List<String> consultarUsuariosNombre(String as_nombreUsuario);

	/**
	 * Metodo que permite actualizar usuario administradores.
	 *
	 * @param au_usuario     entidad completa a actualizar
	 * @param aur_usuarioRol rol y usuario para actualizar
	 * @return true, si se cumple o la accion se realiza exitosamente
	 */
	public Boolean actualizarUsuarioAdministrador(Usuario au_usuario, UsuarioRol aur_usuarioRol);

	/**
	 * Metodo que permite consultar un usuario por persona juridica.
	 *
	 * @param as_idPersona id de la persona juridica
	 * @return Resultado para consultar usuario persona juridica retornado como
	 *         Usuario
	 */
	public Usuario consultarUsuarioPersonaJuridica(String as_idPersona);

	/**
	 * Metodo que se encarga de recibir un usuario de tipo persona jurididca cuando
	 * este es rechazado por el administrador.
	 *
	 * @param au_usuario el parametro usuario
	 * @return true, si se cumple o la accion se realiza exitosamente
	 */
	public Boolean eliminarUsuarioPJRechazado(Usuario au_usuario);

	/**
	 * Consultar usuarios asociacion.
	 *
	 * @param as_tipoDocumento   el parametro tipo documento
	 * @param as_numeroDocumento el parametro numero documento
	 * @return Resultado para consultar usuarios asociacion retornado como Usuario
	 */
	public Usuario consultarUsuariosAsociacion(String as_tipoDocumento, String as_numeroDocumento);

	/**
	 * Metodo que permite eliminar un usuario por su id.
	 *
	 * @param as_idUsuario id del usuario a eliminar
	 * @return true si fue exitoso la eliminacion
	 */
	public Boolean eliminarUsuario(String as_idUsuario);

	/**
	 * Metodo que permite eliminar usuarios que tengan la vigencia completada.
	 *
	 * @return retorna la cantidad de filas eliminadas
	 */
	public List<Usuario> consultarUsuariosEstado();

	/**
	 * Metodo encargado de consultar la existencia de un correo electronico.
	 *
	 * @param as_correoElectronico el parametro correo electronico
	 * @return Resultado para consultar correo electronico retornado como Usuario
	 */
	public Usuario consultarCorreoElectronico(String as_correoElectronico);
}
