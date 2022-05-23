/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ICacheBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless
 * Nombre del elemento: ICacheBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless;

import javax.ejb.Local;

import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCache;

/**
 * Interface de la capa de negocio. <br>
 * Permite definir las operaciones requeridas del recurso Cache.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface ICacheBusiness {

	/**
	 * Metodo que permite actualizar el cache de un grupo especifico.
	 *
	 * @param aec_cache Enum que define el cache a solicitar
	 */
	public void actualizarCacheEspecifico(EnumCache aec_cache);

	/**
	 * Metodo que permite actualizar todo el cache del sistema desde la base de
	 * datos.
	 */
	public void actualizarCompletoCache();

	/**
	 * Metodo que permite consultar un cache en especifico.
	 *
	 * @param aec_cache Enum con el cache solicitado
	 * @return Objeto con la informacion del cache solicitado
	 */
	public Object consultarCacheEspecifico(EnumCache aec_cache);

}
