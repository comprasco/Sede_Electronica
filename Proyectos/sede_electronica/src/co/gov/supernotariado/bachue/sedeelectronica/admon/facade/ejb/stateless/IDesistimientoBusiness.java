/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IDesistimientoBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless
 * Nombre del elemento: IDesistimientoBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless;

//import java.util.List;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionDesistimientoDTO;

/**
 * Interface de la capa de negocio. <br>
 * Permite definir las operaciones requeridas del recurso Desistimiento.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IDesistimientoBusiness extends IGenericoTransaccionModeloBusiness{

	/**
	 * Metodo que se encarga de consumir el servicio de generar solicitud sin costo.
	 *
	 * @param atd_transaccionDesistimientoDto datos de la transaccion a generar la
	 *                                     solicitud de desistimiento
	 * @return String Nir de la solicitud
	 */
	public String generarSolicitudDesistimiento(TransaccionDesistimientoDTO atd_transaccionDesistimientoDto);



}
