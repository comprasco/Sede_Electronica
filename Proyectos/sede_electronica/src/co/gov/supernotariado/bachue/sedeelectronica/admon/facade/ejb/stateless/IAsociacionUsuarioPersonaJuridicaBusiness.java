/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IAsociacionUsuarioPersonaJuridicaBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless
 * Nombre del elemento: IAsociacionUsuarioPersonaJuridicaBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless;

import java.util.List;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.AsociacionUsuarioPersonaJuridicaBooleanoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.AsociacionUsuarioPersonaJuridicaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.AsociacionUsuarioPersonaJuridica;

/**
 * Interface de la capa de negocio. <br>
 * Permite definir las operaciones requeridas del recurso Asociacion usuario
 * persona juridica.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IAsociacionUsuarioPersonaJuridicaBusiness {

	/**
	 * Metodo que permite consultar las asociaciones de personas juridicas.
	 *
	 * @param as_idUsuario                el parametro id usuario
	 * @param as_documentoPersonaJuridica el parametro documento persona juridica
	 * @return Resultado para consultar asociacion retornado como
	 *         AsociacionUsuarioPersonaJuridicaDTO, la asociacion respectiva
	 */
	public AsociacionUsuarioPersonaJuridicaDTO consultarAsociacion(String as_idUsuario,
			String as_documentoPersonaJuridica);

	/**
	 * Metodo que permie consultar todas las personas naturales asociadas a la
	 * persona juridica.
	 *
	 * @return Resultado para consultar asociaciones persona juridica retornado como
	 *         una lista de AsociacionUsuarioPersonaJuridicaDTO
	 */
	public List<AsociacionUsuarioPersonaJuridicaDTO> consultarAsociacionesPJ();

	/**
	 * Metodo que permie la consulta del id de las asociaciones de personas
	 * naturales a juridicas.
	 *
	 * @param as_idUsuario el parametro id usuario
	 * @return Resultado para consultar asociaciones persona juridica retornado como
	 *         una lista de AsociacionUsuarioPersonaJuridicaDTO
	 */
	public List<AsociacionUsuarioPersonaJuridicaDTO> consultarAsociacionesPersonaJuridica(String as_idUsuario);
	
	/**
	 * Metodo que permite consultar los usuarios asociados a persona juridica que
	 * esta en la sesion actual.
	 *
	 * @param as_idUsuario el parametro id usuario
	 * @return Resultado para consultar asociaciones usuario persona juridica
	 *         retornado como una lista de AsociacionUsuarioPersonaJuridicaDTO
	 */
	public List<AsociacionUsuarioPersonaJuridicaDTO> consultarAsociacionesUsuarioPJ(String as_idUsuario);
	
	/**
	 * Metodo que permite consultar el estado de la asociacion de una persona
	 * natural.
	 *
	 * @param aaupj_asociarUsuarioPersonaJuridicaDto el parametro asociar usuario
	 *                                               persona juridica dto
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	public Boolean asociarUsuario(AsociacionUsuarioPersonaJuridicaBooleanoDTO aaupj_asociarUsuarioPersonaJuridicaDto);
	
	/**
	 * Metodo que permite consultar el estado de la cuenta cupo de una persona
	 * natural.
	 *
	 * @param aaupj_asociarUsuarioPersonaJuridicaDto el parametro asociar usuario
	 *                                               persona juridica dto
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	public Boolean estadoCuentaCupo(AsociacionUsuarioPersonaJuridicaBooleanoDTO aaupj_asociarUsuarioPersonaJuridicaDto);
	
	/**
	 * Metodo que permite consultar si la asociación si una persona natural ya
	 * existe o no.
	 *
	 * @param aaupj_asociarUsuarioPersonaJuridicaDto el parametro asociar usuario
	 *                                               persona juridica dto
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	public Boolean asociarUsuarioPersonaNatural(AsociacionUsuarioPersonaJuridicaDTO aaupj_asociarUsuarioPersonaJuridicaDto);
	
	/**
	 * Metodo que permite consultar los usuarios asociados a persona juridica
	 * Boolean.
	 *
	 * @return Resultado para consultar asociaciones persona juridica booleano
	 *         retornado como una lista de
	 *         AsociacionUsuarioPersonaJuridicaBooleanoDTO
	 */
	public List<AsociacionUsuarioPersonaJuridicaBooleanoDTO> consultarAsociacionesPJBooleano();

	/**
	 * Metodo que valida si es posible una nueva asociacion entre una persona
	 * natural y una persona juridica.
	 *
	 * @param as_numeroDocumento el parametro numero documento
	 * @param as_tipoDocumento   el parametro tipo documento
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	public Boolean validarNuevaAsociacion(String as_numeroDocumento, String as_tipoDocumento);
	
	/**
	 * Metodo que consulta una asociacion por su id.
	 *
	 * @param as_idAsociacion id de la asociacion
	 * @return Resultado para consultar por id retornado como
	 *         AsociacionUsuarioPersonaJuridica
	 */
	public AsociacionUsuarioPersonaJuridica consultarPorId(String as_idAsociacion);
	
	/**
	 * Metodo para modificar el correo corporativo y celular corporativo.
	 *
	 * @param aaupj_asociarUsuarioPersonaJuridicaDto el parametro asociar usuario
	 *                                               persona juridica dto
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	public Boolean modificacionCorreoCelular(AsociacionUsuarioPersonaJuridicaBooleanoDTO aaupj_asociarUsuarioPersonaJuridicaDto);
}
