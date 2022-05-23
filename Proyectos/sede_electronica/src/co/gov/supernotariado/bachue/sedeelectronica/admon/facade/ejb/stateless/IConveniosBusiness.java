/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IConveniosBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless
 * Nombre del elemento: IConveniosBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless;

import javax.ejb.Local;

/**
 * Interface de la capa de negocio. Permite definir las operaciones requeridas
 * del recurso convenios entidad especial.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IConveniosBusiness {

	/**
	 * Metodo encargado de actualizar cache convenios
	 * 
	 * @param as_convenio
	 */
	public void actualizarConvenioCache(String as_convenio);

	/**
	 * Metodo encargado de consultar un convenio de cache
	 * 
	 * @return String
	 */
	public String consultarConvenioCache();

	/**
	 * Metodo encargado de eliminar un convenio de cache
	 * 
	 * @param as_convenio
	 */
	public void eliminarConvenioCache(String as_convenio);

}
