/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IHistorialSolicitudRegistroBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless
 * Nombre del elemento: IHistorialSolicitudRegistroBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.HistorialSolicitudRegistroDTO;

/**
 * Interface de la capa de negocio. <br>
 * Permite definir las operaciones requeridas del recurso Historial solicitud
 * registro.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IHistorialSolicitudRegistroBusiness {
	
	/**
	 * Metodo para crear solicitud registro.
	 *
	 * @param ahsr_historialSolicitudRegistroDto el parametro historial solicitud
	 *                                           registro dto
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	public Boolean crearSolicitudRegistro(HistorialSolicitudRegistroDTO ahsr_historialSolicitudRegistroDto);

	
}
