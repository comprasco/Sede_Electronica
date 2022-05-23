/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IAsociacionUsuarioPersonaJuridicaDAO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless
 * Nombre del elemento: IAsociacionUsuarioPersonaJuridicaDAO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless;

import java.util.List;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.AsociacionUsuarioPersonaJuridica;

/**
 * Interface para definir operaciones sobre objetos de acceso a datos (DAO) <br>
 * Define operaciones para manipular el modelo de datos Asociacion usuario
 * persona juridica.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IAsociacionUsuarioPersonaJuridicaDAO {

	/**
	 * Metodo que permite cosnultar asociaciones por id de persona juridica y
	 * usuario.
	 *
	 * @param as_idUsuario         id del usuario
	 * @param as_idPersonaJuridica id de la persona juridica
	 * @return Asociacion de persona juridica
	 */
	public AsociacionUsuarioPersonaJuridica consultarAsociacionUsuarioPersonaJuridicaId(String as_idUsuario, String as_idPersonaJuridica);
	
	/**
	 * Metodo que permite consultar asociaciones por id de usuario y numero persona
	 * juridica.
	 *
	 * @param as_idUsuario             el parametro id usuario
	 * @param as_numeroPersonaJuridica el parametro numero persona juridica
	 * @return Asociacion de persona juridica
	 */
	public AsociacionUsuarioPersonaJuridica consultarAsociacionUsuarioPersonaJuridica(String as_idUsuario, String as_numeroPersonaJuridica);
	
	/**
	 * Metodo que permite consultar asociaciones por Id usuario persona juridica.
	 *
	 * @param as_idUsuarioPJ el parametro id usuario PJ
	 * @return List<AsociacionUsuarioPersonaJuridica>
	 */
	public List<AsociacionUsuarioPersonaJuridica> consultarAsociacionesPJ(String as_idUsuarioPJ);
	
	
	/**
	 * Metodo que permite consultar la actualizacion del estado de la persona
	 * asociada.
	 *
	 * @param aaupj_asociarUsuarioPersonaJuridica el parametro asociar usuario
	 *                                            persona juridica
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	public Boolean actualizaUsuario(AsociacionUsuarioPersonaJuridica aaupj_asociarUsuarioPersonaJuridica);
	
	/**
	 * Metodo que permite consultar la asociacion de una persona natural a una
	 * persona juridica.
	 *
	 * @param aaupj_asociacionUsuarioPersonaJuridica el parametro asociacion usuario
	 *                                               persona juridica
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	public Boolean asociarUsuarioPersonaNatural(AsociacionUsuarioPersonaJuridica aaupj_asociacionUsuarioPersonaJuridica);

	/**
	 * Metodo que permite consultar asociaciones por Id usuario.
	 *
	 * @param as_idUsuario el parametro id usuario
	 * @return Resultado para consultar asociaciones usuario PJ retornado como List
	 */
	public List<AsociacionUsuarioPersonaJuridica> consultarAsociacionesUsuarioPJ(String as_idUsuario);

	/**
	 * Metodo que permite consultar por id asociacion.
	 *
	 * @param as_idAsociacion el parametro id asociacion
	 * @return Resultado para consultar asociacion retornado como
	 *         AsociacionUsuarioPersonaJuridica
	 */
	public AsociacionUsuarioPersonaJuridica consultarAsociacion(String as_idAsociacion);

}
