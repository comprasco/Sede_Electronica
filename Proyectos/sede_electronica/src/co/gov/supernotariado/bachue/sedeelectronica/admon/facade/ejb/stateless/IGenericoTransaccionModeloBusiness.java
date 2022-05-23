package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PersonaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionSinPagoGenericaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoProceso;

/**
 * Interface de la capa de negocio. <br>
 * Permite definir las operaciones requeridas del recurso 
 * Generico transaccion modelo.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IGenericoTransaccionModeloBusiness {

	/**
	 * Metodo que se encarga de iniciar la transaccion con los datos del usuario y
	 * el tipo de proceso.
	 *
	 * @param aetp_enumTipoProceso enum con el tipo de proceso a consultar
	 * @return Resultado para iniciar transaccion modelo retornado como
	 *         TransaccionSinPagoGenericaDTO
	 */
	public TransaccionSinPagoGenericaDTO iniciarTransaccion(EnumTipoProceso aetp_enumTipoProceso);
	
	/**
	 * Metodo que devuelve el usuario logueado.
	 *
	 * @return Resultado para consultar usuario session retornado como PersonaDTO
	 */
	public PersonaDTO consultarUsuarioSession();

	/**
	 * Metodo que consulta la transaccion vigente.
	 *
	 * @param atspg_transaccionSinPagoGenericaDto datos de la transaccion
	 * @return Resultado para consultar transaccion vigente retornado como
	 *         TransaccionSinPagoGenericaDTO
	 */
	public TransaccionSinPagoGenericaDTO consultarTransaccionVigenteGenerico(
			TransaccionSinPagoGenericaDTO atspg_transaccionSinPagoGenericaDto);
	
	/**
	 * Metodo que se encarga de eliminar la Transaccion de traslado matricula.
	 *
	 * @param atspg_transaccionSinPagogenericaDto transaccion a eliminar
	 * @return Boolean para eliminar transaccion retornado como
	 *         valor verdadero o falso del resultado
	 */
	public Boolean eliminarTransaccionGenerica(TransaccionSinPagoGenericaDTO atspg_transaccionSinPagogenericaDto);
	
	/**
	 * Metodo que se encarga de guardar la transaccion en la tabla de transaccion
	 * solicitud Metodo
	 * 
	 *
	 * @param atspg_transaccionSinPagoGenericaDto datos de la transaccion traslado de matricula
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	public Boolean guardarTransaccion(TransaccionSinPagoGenericaDTO atspg_transaccionSinPagoGenericaDto);

}
