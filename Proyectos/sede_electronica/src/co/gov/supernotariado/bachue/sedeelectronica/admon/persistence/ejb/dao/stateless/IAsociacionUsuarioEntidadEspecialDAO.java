/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IAsociacionUsuarioEntidadEspecialDAO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless
 * Nombre del elemento: IAsociacionUsuarioEntidadEspecialDAO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless;

import java.util.List;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.AsociacionUsuarioEntidadEspecial;

/**
 * Interface para definir operaciones sobre objetos de acceso a datos (DAO) <br>
 * Define operaciones para manipular el modelo de datos Asociacion usuario
 * entidad especial.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IAsociacionUsuarioEntidadEspecialDAO {

	/**
	 * Metodo que permite consultar asociaciones de usuarios con entidades
	 * especiales.
	 *
	 * @param as_codigoEntidadEspecial el parametro codigo entidad especial
	 * @param as_idUsuario             el parametro id usuario
	 * @return Resultado para consultar asociacion retornado como
	 *         AsociacionUsuarioEntidadEspecial
	 */
	public AsociacionUsuarioEntidadEspecial consultarAsociacion(String as_codigoEntidadEspecial, String as_idUsuario);

	
	/**
	 * Metodo que permite consultar asociaciones de usuarios con entidades
	 * especiales.
	 *
	 * @param as_idUsuarioPJ el parametro id usuario PJ
	 * @return Resultado para consultar asociaciones EE retornado como List
	 */
	public List<AsociacionUsuarioEntidadEspecial> consultarAsociacionesEE(String as_idUsuarioPJ);

	/**
	 * Metodo que actualiza la asociacion de un usuario con una entidad especial.
	 *
	 * @param aauee_asociacionUsuarioEntidadEspecial asociacion a modificar
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	public Boolean actualizarUsuario(AsociacionUsuarioEntidadEspecial aauee_asociacionUsuarioEntidadEspecial);
	
	/**
	 * Metodo que crea una nueva asociacion entre un usuario con la entidad
	 * especial.
	 *
	 * @param aauee_asociacionUsuarioEntidadEspecial datos de la nueva asociacion a
	 *                                               crear
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	public Boolean asociarUsuarioPersonaNatural(AsociacionUsuarioEntidadEspecial aauee_asociacionUsuarioEntidadEspecial);
	
	/**
	 * Metodo que permite consultar asociaciones de usuarios con entidades por id
	 * usuario.
	 *
	 * @param as_idUsuario el parametro id usuario
	 * @return Resultado para consultar asociaciones usuario EE retornado como List
	 */
	public List<AsociacionUsuarioEntidadEspecial> consultarAsociacionesUsuarioEE(String as_idUsuario);

	/**
	 * Metodo que consulta una asociacion entre un usuario y una entidad especial
	 * especifica.
	 *
	 * @param as_idUsuarioEE entidad especial de la asociacion
	 * @param as_idUsuarioPN persona natural de la asociacion
	 * @return Resultado para consultar asociaciones EEPN retornado como
	 *         AsociacionUsuarioEntidadEspecial
	 */
	public AsociacionUsuarioEntidadEspecial consultarAsociacionesEEPN(String as_idUsuarioEE, String as_idUsuarioPN);

}
