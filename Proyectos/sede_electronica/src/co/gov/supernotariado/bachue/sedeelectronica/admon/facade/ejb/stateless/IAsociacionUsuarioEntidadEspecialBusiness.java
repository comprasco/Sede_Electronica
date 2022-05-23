/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IAsociacionUsuarioEntidadEspecialBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless
 * Nombre del elemento: IAsociacionUsuarioEntidadEspecialBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless;

import java.util.List;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.AsociacionUsuarioEntidadEspecialBooleanoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.AsociacionUsuarioEntidadEspecialDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.EntidadEspecialDTO;

/**
 * Interface de la capa de negocio. <br>
 * Permite definir las operaciones requeridas del recurso Asociacion usuario
 * entidad especial.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IAsociacionUsuarioEntidadEspecialBusiness {

	/**
	 * Metodo que permite consultar asociaciones de usuario con entidades
	 * especiales.
	 *
	 * @param as_codigoEntidadEspecial codigo de la entidad especial
	 * @param as_idUsuario             id del usuario asociado
	 * @return Resultado para consultar asociacion retornado como
	 *         AsociacionUsuarioEntidadEspecialDTO
	 */
	public AsociacionUsuarioEntidadEspecialDTO consultarAsociacion(String as_codigoEntidadEspecial,
			String as_idUsuario);

	/**
	 * Metodo que consulta las asociaciones del usuario loguado.
	 *
	 * @return Resultado para consultar asociaciones entidad especial retornado como
	 *         una lista de AsociacionUsuarioEntidadEspecialDTO
	 */
	public List<AsociacionUsuarioEntidadEspecialDTO> consultarAsociacionesEE();

	/**
	 * Metodo que consulta las asociaciones de una entidad especial por el id de
	 * esta.
	 *
	 * @param as_idUsuario id del usuario de la entidad especial
	 * @return Resultado para consultar asociaciones entidad especial retornado como
	 *         una lista de AsociacionUsuarioEntidadEspecialDTO
	 */
	public List<AsociacionUsuarioEntidadEspecialDTO> consultarAsociacionesEntidadEspecial(String as_idUsuario);

	/**
	 * Metodo que cambia el estado de una asociacion existente.
	 *
	 * @param aauee_asociacionUsuarioEntidadEspecialDto relacion a modificar
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	public Boolean asociarUsuario(
			AsociacionUsuarioEntidadEspecialBooleanoDTO aauee_asociacionUsuarioEntidadEspecialDto);

	/**
	 * Metodo que consulta las asociaciones del usuario y se convierten en
	 * booleanos.
	 *
	 * @return Resultado para consultar asociaciones entidad especial boleano
	 *         retornado como una lista de
	 *         AsociacionUsuarioEntidadEspecialBooleanoDTO
	 */
	public List<AsociacionUsuarioEntidadEspecialBooleanoDTO> consultarAsociacionesEEBoleano();

	/**
	 * Metodo que consulta las asociaciones de un usuario natural.
	 *
	 * @param as_idUsuario usuario de persona natural para consultar
	 * @return Resultado para consultar asociaciones entidad especial retornado como
	 *         una lista de AsociacionUsuarioEntidadEspecialDTO
	 */
	public List<AsociacionUsuarioEntidadEspecialDTO> consultarAsociacionesEE(String as_idUsuario);

	/**
	 * Metodo que guarda una nueva asociacion.
	 *
	 * @param aauee_asociacionUsuarioEntidadEspecialDto datos de la nueva asociacion
	 * @return Resultado para asociar usuario persona natural retornado como
	 *         AsociacionUsuarioEntidadEspecialDTO
	 */
	public AsociacionUsuarioEntidadEspecialDTO asociarUsuarioPersonaNatural(
			AsociacionUsuarioEntidadEspecialDTO aauee_asociacionUsuarioEntidadEspecialDto);

	/**
	 * Metodo que permite consultar las asociaciones de usuario entidad especial.
	 *
	 * @param as_idUsuario el parametro id usuario
	 * @return Resultado para consultar asociaciones usuario entidad especial
	 *         retornado como una lista de AsociacionUsuarioEntidadEspecialDTO
	 */
	public List<AsociacionUsuarioEntidadEspecialDTO> consultarAsociacionesUsuarioEE(String as_idUsuario);

	/**
	 * Metodo que valida si una asociacion ya existe para el usuario logueado.
	 *
	 * @param as_idUsuario usuario para validar si existe asociacion con el usuario
	 *                     logueado
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	public Boolean validarAsociacionExistente(String as_idUsuario);

	/**
	 * Metodo encargado de consultar usuario entidad especial.
	 *
	 * @param as_idUsuario el parametro id usuario
	 * @return Resultado para consultar usuario entidad especial retornado como una
	 *         lista de EntidadEspecialDTO
	 */
	public List<EntidadEspecialDTO> consultarUsuarioEntidadEspecial(String as_idUsuario);
}

