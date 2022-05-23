/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IHistorialInicioSesionBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless
 * Nombre del elemento: IHistorialInicioSesionBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.HistorialInicioSesionDTO;

/**
 * Interface de la capa de negocio. <br>
 * Permite definir las operaciones requeridas del recurso Historial inicio
 * sesion.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IHistorialInicioSesionBusiness {
	
	/**
	 * Metodo que permite registrar en el historial una accion de inicio de sesion.
	 *
	 * @param ahs_historicoSesion el parametro historico sesion
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	public Boolean crearInicioSesion(HistorialInicioSesionDTO ahs_historicoSesion);

}
