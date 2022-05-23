/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IHistoricoTransaccionesDescartadasBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless
 * Nombre del elemento: IHistoricoTransaccionesDescartadasBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.HistoricoTransaccionesDescartadasDTO;

/**
 * Interface de la capa de negocio. <br>
 * Permite definir las operaciones requeridas del recurso Historico
 * transacciones descartadas.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IHistoricoTransaccionesDescartadasBusiness {

	/**
	 * Metodo encargado de actualizar la tabla historico descarte cuando se elimina
	 * una transaccion.
	 *
	 * @param ahtd_historicoTransaccionesDescatadasDto el parametro historico
	 *                                                 transacciones descatadas dto
	 */
	public void actualizarHistoricoDescartes(
			HistoricoTransaccionesDescartadasDTO ahtd_historicoTransaccionesDescatadasDto);

}
