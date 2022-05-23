/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IDireccionBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless
 * Nombre del elemento: IDireccionBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.DireccionDTO;

/**
 * Interface de la capa de negocio. <br>
 * Permite definir las operaciones requeridas del recurso Direccion.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IDireccionBusiness {

	/**
	 * Metodo que permite crear una direccion.
	 *
	 * @param ad_direccion direccion dto para registrar
	 * @return true, si se cumple o la accion se realiza exitosamente
	 */
	public Boolean crearDireccion(DireccionDTO ad_direccion);

	/**
	 * Metodo que permite modificar una direccion.
	 *
	 * @param ad_direccionDto direccion dto para modificar
	 * @return true, si se cumple o la accion se realiza exitosamente
	 */
	public Boolean modificarDireccion(DireccionDTO ad_direccionDto);
}
