/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IHistoricoTransaccionesDescartadasDAO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless
 * Nombre del elemento: IHistoricoTransaccionesDescartadasDAO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.HistoricoTransaccionesDescartadas;

/**
 * Interface para definir operaciones sobre objetos de acceso a datos (DAO) <br>
 * Define operaciones para manipular el modelo de datos Historico transacciones
 * descartadas.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IHistoricoTransaccionesDescartadasDAO {

	/**
	 * Metodo encargado de actualizar la tabla historico descarte.
	 *
	 * @param ahtd_historicoTransaccionesDescartadas el parametro historico
	 *                                               transacciones descartadas
	 * @return Resultado para actualizar historico descartes retornado como
	 *         HistoricoTransaccionesDescartadas
	 */
	public HistoricoTransaccionesDescartadas actualizarHistoricoDescartes(
			HistoricoTransaccionesDescartadas ahtd_historicoTransaccionesDescartadas);

}