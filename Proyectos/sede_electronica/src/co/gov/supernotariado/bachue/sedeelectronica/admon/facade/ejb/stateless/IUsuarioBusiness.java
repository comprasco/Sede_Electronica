/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IUsuarioBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless
 * Nombre del elemento: IUsuarioBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless;

import java.util.List;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PersonaCompletaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PersonaDireccionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PersonaJuridicaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioRolDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioSesionDTO;

/**
 * Interface de la capa de negocio. <br>
 * Permite definir las operaciones requeridas del recurso Usuario.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IUsuarioBusiness {

	/**
	 * Consulta un usuario por su nombre.
	 *
	 * @param as_nombreUsuario el parametro nombre usuario
	 * @return Resultado para consultar usuario activo retornado como UsuarioDTO
	 */
	public UsuarioDTO consultarUsuarioActivo(String as_nombreUsuario);

	/**
	 * Metodo que retorna todos los usuarios existentes.
	 *
	 * @param as_uuidActivacion el parametro uuid activacion
	 * @return Resultado para consultar usuario UUID activacion retornado como
	 *         UsuarioDTO
	 */
	public UsuarioDTO consultarUsuarioUUIDActivacion(String as_uuidActivacion);

	/**
	 * Metodo que permite crear el objeto a una Entidad asociada a la capa DAO.
	 *
	 * @param au_usuarioDto       el parametro usuario dto
	 * @param apj_personaJuridica el parametro persona juridica
	 * @param aur_usuarioRol      el parametro usuario rol
	 * @param apd_direccion       el parametro direccion
	 * @return true si la operacion se realiza exitosamente.
	 */
	public Boolean crearUsuario(UsuarioDTO au_usuarioDto, PersonaJuridicaDTO apj_personaJuridica,
			UsuarioRolDTO aur_usuarioRol, PersonaDireccionDTO apd_direccion);

	/**
	 * Metodo que permite actualizar el objeto a una Entidad asociada a la capa DAO.
	 *
	 * @param au_usuarioDto el parametro usuario dto
	 * @return true si la operacion se realiza exitosamente.
	 */
	public Boolean actualizaUsuario(UsuarioDTO au_usuarioDto);

	/**
	 * Metodo que permite consultar usuario por su nombre de usuario.
	 *
	 * @param as_nombreUsuario nombre de usuario
	 * @return Resultado para consultar usuario retornado como UsuarioDTO
	 */
	public UsuarioDTO consultarUsuario(String as_nombreUsuario);

	/**
	 * Metodo que convierte el objeto DTO a una Entidad e invoca la modificacion de
	 * la contrasena del usuario en la capa DAO.
	 * 
	 * @param apcd_personaCompletaDto DTO Persona ha convertir.
	 * @return true si la operacion se realiza exitosamente.
	 */
	public Boolean modificarContrasenaUsuario(PersonaCompletaDTO apcd_personaCompletaDto);

	/**
	 * Metodo que permite consultar usuario de sesion en cache.
	 *
	 * @param as_nombreUsuario nombre de usuario solicitado
	 * @return usuario sesion dto
	 */
	public UsuarioSesionDTO consultarUsuarioCache(String as_nombreUsuario);

	/**
	 * Metodo para agregar un usuario en cache a partir de su nombre de usuario.
	 *
	 * @param as_nombreUsuario nombre de usuario
	 * @param as_idAsociacion  el parametro id asociacion
	 */
	public void agregarUsuarioCache(String as_nombreUsuario, String as_idAsociacion);

	/**
	 * Metodo que permite agregar un usuario a partir de un DTO de usuario de
	 * sesion.
	 *
	 * @param as_usuario usuario a agregar
	 */
	public void agregarUsuarioCache(UsuarioSesionDTO as_usuario);

	/**
	 * Metodo que permite remover un usuario de cache por su nombre de usuario.
	 *
	 * @param as_nombreUsuario nombre de usuario
	 */
	public void removerUsuarioCache(String as_nombreUsuario);

	/**
	 * Metodo que permite consultar usuario por su nombre de usuario.
	 *
	 * @param as_nombreUsuario el parametro nombre usuario
	 * @return Resultado para consultar usuario sesion retornado como
	 *         UsuarioSesionDTO
	 */
	public UsuarioSesionDTO consultarUsuarioSesion(String as_nombreUsuario);

	/**
	 * Metodo que permite actualizar un usuario en cache.
	 *
	 * @param aus_usuarioDto el parametro usuario dto
	 */
	public void actualizarUsuarioSesionCache(UsuarioSesionDTO aus_usuarioDto);

	/**
	 * Metodo que permite actualizar un usuario en cache.
	 *
	 * @param as_usuarioNombre el parametro usuario nombre
	 */
	public void actualizarUsuarioSesionCache(String as_usuarioNombre);

	/**
	 * Metodo que permite consultar todos los usuarios.
	 *
	 * @return Resultado para consultar todos usuarios retornado como una lista de
	 *         UsuarioDTO
	 */
	public List<UsuarioDTO> consultarTodosUsuarios();

	/**
	 * Metodo que permite consultar todos los usuarios por paginacion.
	 *
	 * @param ai_valorIncialPag valor incial de la paginacion
	 * @param ai_valorFinalPag  valor final de la paginacion
	 * @return Lista de usuarios
	 */
	public List<UsuarioDTO> consultarUsuariosAdministradores(Integer ai_valorIncialPag, Integer ai_valorFinalPag);

	/**
	 * Metodo que permite consultar la cantidad de usuarios administradores
	 * existentes.
	 *
	 * @return Resultado para contar usuarios administradores retornado como Integer
	 */
	public Integer contarUsuariosAdministradores();

	/**
	 * Metodo crear usuario.
	 *
	 * @param au_usuario DTO Usuario
	 * @return Estado de la transaccion
	 */
	public Boolean crearUsuario(UsuarioDTO au_usuario);

	/**
	 * Metodo consultar nombres de usuarios por comienzo de nombre clave.
	 *
	 * @param as_nombreUsuario Nombre de usuario
	 * @return lista de nombres de usuario
	 */
	public List<String> consultarUsuariosNombre(String as_nombreUsuario);

	/**
	 * Metodo que permite actualizar usuario administrador.
	 *
	 * @param au_usuarioDto usuario Administrador
	 * @return Estado de la transaccion
	 */
	public Boolean actualizaUsuarioAdministrador(UsuarioDTO au_usuarioDto);

	/**
	 * Metodo que permite consultar la existencia de un usuario.
	 *
	 * @param as_usuario nombre de usuario
	 * @return estado de existencia de la consulta
	 */
	public Boolean consultarExistenciaNombreUsuario(String as_usuario);

	/**
	 * Metodo que permite consultar un usuario persona juridica.
	 *
	 * @param as_idPersona id de la persona juridica
	 * @return UsuarioDTO, usuario encontrado
	 */
	public UsuarioDTO consultarUsuarioPersonaJuridica(String as_idPersona);

	/**
	 * Metodo que permie consultar todas las solicitudes de creacion persona
	 * juridica pendiente por aprobacion (PA).
	 *
	 * @param as_usuarioPendienteAprobacion el parametro usuario pendiente
	 *                                      aprobacion
	 * @return Resultado para consultar usuario pendiente aprobacion retornado como
	 *         una lista de UsuarioDTO
	 */
	public List<UsuarioDTO> consultarUsuarioPendienteAprobacion(String as_usuarioPendienteAprobacion);

	/**
	 * Metodo que permite consultar los usuarios para bloquear o desbloquear.
	 *
	 * @param as_tipoDocumento   el parametro tipo documento
	 * @param as_numeroDocumento el parametro numero documento
	 * @param as_usuarioBloqueo  el parametro usuario bloqueo
	 * @return Resultado para consultar usuarios bloqueo retornado como UsuarioDTO
	 */
	public UsuarioDTO consultarUsuariosBloqueo(String as_tipoDocumento, String as_numeroDocumento,
			String as_usuarioBloqueo);

	/**
	 * Metodo que se encarga de recibir un usuario de tipo persona jurididca cuando
	 * este es rechazado por el administrador.
	 *
	 * @param au_usuarioDto el parametro usuario dto
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	public Boolean eliminarUsuarioPJRechazado(UsuarioDTO au_usuarioDto);

	/**
	 * Metodo que consulta un usuario por el tipo de documento y el numero de
	 * documento.
	 *
	 * @param as_tipoDocumento   tipo de document como el id de la tabla
	 * @param as_numeroDocumento numero del documento a consultar
	 * @return Resultado para consultar usuarios asociacion retornado como
	 *         UsuarioDTO
	 */
	public UsuarioDTO consultarUsuariosAsociacion(String as_tipoDocumento, String as_numeroDocumento);

	/**
	 * Metodo que consulta un usuario con direccion.
	 *
	 * @param as_usuario el parametro usuario
	 * @return Resultado para consultar usuario con direccion retornado como
	 *         UsuarioDTO
	 */
	public UsuarioDTO consultarUsuarioConDireccion(String as_usuario);

	/**
	 * Metodo que consulta un usuario con direccion y persona juridica.
	 *
	 * @param as_usuario el parametro usuario
	 * @return Resultado para consultar usuario con direccion Y persona juridica
	 *         retornado como UsuarioDTO
	 */
	public UsuarioDTO consultarUsuarioConDireccionYPersonaJuridica(String as_usuario);

	/**
	 * Metodo que elimina un usuario por su ID.
	 *
	 * @param as_idUsuario id del usuario a eliminar
	 * @return estado de la eliminacion
	 */
	public Boolean eliminarUsuario(String as_idUsuario);

	/**
	 * Meotodo que permite eliminar usuarios con vigencia extendida.
	 *
	 * @return cantidad de columnas afectadas
	 */
	public Boolean eliminarUsuarioVigenciaCompletada();

	/**
	 * Metodo encargado de consultar si existe el correo electronico.
	 *
	 * @param as_correoElectronico el parametro correo electronico
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	public Boolean consultarExistenciaCorreoElectronico(String as_correoElectronico);

	/**
	 * Metodo que consulta los usuario rol administrador.
	 *
	 * @return Resultado para consultar usuarios administradores retornado como una
	 *         lista de UsuarioDTO
	 */
	public List<UsuarioDTO> consultarUsuariosAdministradores();
}
