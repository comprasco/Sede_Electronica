/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IIntegracionBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless
 * Nombre del elemento: IIntegracionBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless;

import java.util.List;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.IntegracionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.IntegracionTemporalDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionIndividualDTO;

/**
 * Interface de la capa de negocio. <br>
 * Permite definir las operaciones requeridas del recurso Integracion.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IIntegracionBusiness {

	/**
	 * Metodo que permite crear el objeto a una Entidad asociada a la capa DAO.
	 *
	 * @param ai_integracionDto el parametro integracion dto
	 * @return true si la operacion se realiza exitosamente.
	 */
	public Boolean crearIntegracion(IntegracionDTO ai_integracionDto);

	/**
	 * Metodo para consultar lo que existe en la tabla de integracion .
	 *
	 * @param ati_transaccionDto transaccion individual
	 * @return Lista de TransaccionIndividualDTO, lista de transaccion Individual
	 */
	public List<TransaccionIndividualDTO> consultarHistorico(TransaccionIndividualDTO ati_transaccionDto);

	/**
	 * Metodo para consultar el servicio de consultar estado liquidacion.
	 *
	 * @param ait_integracionTemporalDto integracion temporal con los datos de la
	 *                                   transaccion referencia de pago
	 * @return Resultado para consultar estado liquidacion retornado como
	 *         IntegracionDTO
	 */
	public IntegracionDTO consultarEstadoLiquidacion(IntegracionTemporalDTO ait_integracionTemporalDto);

	/**
	 * Metodo que se encarga de consultar la transacciones de la tabla de
	 * integracion temporal consultar en el core bachue y si se encuentran pagas
	 * cambiar a TXIntegracion<br>
	 * 
	 * <b> Resultado: </b> Si se encuentra alguna transaccion paga se pasa a
	 * TxIntegracion.
	 */
	public void administrarTransaccionesPagas();

	/**
	 * Metodo que permite anular una recarga.
	 *
	 * @param ait_integracionTemporalDto el parametro integracion temporal dto
	 * @param as_resultado               el parametro resultado
	 * @param as_salida                  el parametro salida
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	public Boolean anularRecargaCuenta(IntegracionTemporalDTO ait_integracionTemporalDto, String as_resultado,
			String as_salida);

	/**
	 * Metodo que permite confirmar integraciones temporales a la tabla de
	 * integraciones .
	 *
	 * @param ait_integracionTemporalDto el parametro integracion temporal dto
	 * @param as_operacion               el parametro operacion
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	public Boolean confirmarIntegracionTemporal(IntegracionTemporalDTO ait_integracionTemporalDto, String as_operacion);

}
