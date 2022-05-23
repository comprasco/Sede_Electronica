/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IGestionTareasProgramadasBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless
 * Nombre del elemento: IGestionTareasProgramadasBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless;

import javax.ejb.Local;

/**
 * Interface de la capa de negocio. <br>
 * Permite definir las operaciones requeridas del recurso Gestion tareas
 * programadas.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IGestionTareasProgramadasBusiness {

	/**
	 * Metodo que permite actualizar cache.
	 */
	public void cargarCache();

	/**
	 * Metodo que permite eliminar del carrito .
	 *
	 * @param ai_eliminarCarrito numero de dias para eliminar carrito
	 */
	public void eliminarCarrito(Integer ai_eliminarCarrito);

}
