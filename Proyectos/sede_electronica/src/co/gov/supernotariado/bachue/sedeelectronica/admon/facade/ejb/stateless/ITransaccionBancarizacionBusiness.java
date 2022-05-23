package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless;

import java.util.Date;
import java.util.List;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionBancarizacionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TurnosBancarizacionDTO;

/**
 *
 * @version 1.0
 * @author Smartsoft Solutions S.A.S Nota: Interface de la capa de negocio.
 */
@Local
public interface ITransaccionBancarizacionBusiness {

	/**
	 * Metodo que permite consultar las transacciones de bancarizacion 
	 * @param as_IdUsuario identificador del usuario 
	 * @param ad_fechaInicial fecha inicial de la consulta
	 * @param ad_fechaFinal fecha final de la consulta
	 * @return  List<TransaccionBancarizacionDTO> lista de la transaccion bancarizacion
	 */
	public List<TransaccionBancarizacionDTO> consultarTransaccionBancarizacion(String as_IdUsuario, Date ad_fechaInicial,
			Date ad_fechaFinal);

	/**
	 * Metodo que inserta nuevas transaccion de bancarizacion
	 * @param atb_transaccionBancarizacion transaccion a insertar
	 * @return Boolean confirmacion de la insercion
	 */
	public Boolean insertarTransaccionBancarizacion(TransaccionBancarizacionDTO atb_transaccionBancarizacion);

	/**
	 * Metodo que inserta turnos a una bancarizacion
	 * @param altb_turnosTransaccionBancarizacion turno de la transaccion de bancarizaicon
	 * @param as_referenciaPago referencia de pago
	 * @return Boolean confirmacion de la insercion
	 */
	public Boolean insertarTurnosTransaccionBancarizacion(List<TurnosBancarizacionDTO> altb_turnosTransaccionBancarizacion,
			String as_referenciaPago);

	/**
	 * Metodo que actualiza el estado de los turnos de una transaccion
	 * @param as_codigoTransaccion codigo de la transaccion
	 * @return TransaccionBancarizacionDTO  transaccion actualizada
	 */
	public TransaccionBancarizacionDTO actualizarEstadoTurnos(String as_codigoTransaccion);


}
