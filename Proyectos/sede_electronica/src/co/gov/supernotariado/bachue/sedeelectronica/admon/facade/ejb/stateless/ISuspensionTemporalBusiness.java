/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ICorreccionesBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless
 * Nombre del elemento: ICorreccionesBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PersonaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionSuspensionTemporalDTO;

/**
 * Interface de la capa de negocio. <br>
 * Permite definir las operaciones requeridas del recurso Suspension Temporal.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface ISuspensionTemporalBusiness {

	/**
	 * Metodo que se encarga de consumir el servicio de generar solicitud sin costo.
	 *
	 * @param atst_suspensionTemporalDto datos de la transaccion a generar la
	 *                                     solicitud de suspension
	 * @return String Nir de la solicitud
	 */
	public String generarSuspensionTemporal(TransaccionSuspensionTemporalDTO atst_suspensionTemporalDto);

	/**
	 * Metodo que devuelve el usuario logueado.
	 *
	 * @return Resultado para consultar usuario session retornado como PersonaDTO
	 */
	public PersonaDTO consultarUsuarioSession();

	/**
	 * Metodo que se encarga de guardar la transaccion en la tabla de transaccion
	 * solicitud Metodo
	 * 
	 *
	 * @param atst_suspensionTemporalDto datos de la transaccion suspension
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	public Boolean guardarTransaccion(TransaccionSuspensionTemporalDTO atst_suspensionTemporalDto);

	/**
	 * Metodo que consulta la transaccion vigente.
	 *
	 * @param atst_suspensionTemporalDto datos de la transaccion
	 * @return Resultado para consultar transaccion vigente retornado como
	 *         TransaccionSuspensionTemporalDTO
	 */
	public TransaccionSuspensionTemporalDTO consultarTransaccionVigenteSuspension(TransaccionSuspensionTemporalDTO atst_suspensionTemporalDto);

	/**
	 * Metodo que se encarga de eliminar la Transaccion de suspension.
	 *
	 * @param atst_suspensionTemporalDto transaccion a eliminar
	 * @return Resultado para eliminar transaccion retornado como
	 *         TransaccionSuspensionTemporalDTO con una nueva transaccion
	 */
	public TransaccionSuspensionTemporalDTO eliminarTransaccion(TransaccionSuspensionTemporalDTO atst_suspensionTemporalDto);

	/**
	 * Metodo que se encarga de iniciar la transaccion con los datos del usuario y
	 * el tipo de proceso.
	 *
	 * @return Resultado para iniciar transaccion suspension temporal retornado como
	 *         TransaccionSuspensionTemporalDTO
	 */
	public TransaccionSuspensionTemporalDTO iniciarTransaccionSuspensionTemporal();

}
