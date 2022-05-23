package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless;

import java.util.Date;
import java.util.List;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.TransaccionBancarizacion;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.TurnosBancarizacion;

@Local
public interface ITransaccionBancarizacionDAO {

	/**
	 * Metodo que consulta transacciones de bancarizacion por id de usuario y fechas de busqueda
	 * @param as_IdUsuario Identificador del usuario
	 * @param ad_fechaInicial fecha inicial de la busqueda
	 * @param ad_fechaFinal fecha final de la busqueda
	 * @return List<TransaccionBancarizacion> Lista de transacciones encontradas
	 */
	public List<TransaccionBancarizacion> consultarTransaccionBancarizacion(String as_IdUsuario, Date ad_fechaInicial,
			Date ad_fechaFinal);

	/**
	 * Metodo que inserta una transaccion de bancarizacion
	 * @param atb_transaccionBancarizacion transaccion a insertar
	 * @return estado si fue exitosa o no la inserción
	 */
	public Boolean insertarTransaccionBancarizacion(TransaccionBancarizacion atb_transaccionBancarizacion);

	/**
	 * Metodo que permite consultar una transaccion por su codigo de transaccion
	 * @param as_codigoTransaccion codigo de la transaccion
	 * @return TransaccionBancarizacion transaccion encontrada
	 */
	public TransaccionBancarizacion consultarTransaccionBancarizacion(String as_codigoTransaccion);

	public Boolean insertarTurnosBancarizacion(TransaccionBancarizacion atb_transaccionBancarizacion,
			List<TurnosBancarizacion> atb_turnos);

}
