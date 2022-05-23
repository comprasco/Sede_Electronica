/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ICacheGenerico.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.cache.interfaces
 * Nombre del elemento: ICacheGenerico
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.cache.interfaces;

/**
 * Interface que define los metodos para acceder al cache.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 * @param <T> el tipo generico
 */
public interface ICacheGenerico<T> {

	/**
	 * Metodo que permite consultar la informacion del cache.
	 *
	 * @param as_esquema     nombre del esquema coherence
	 * @param as_nombreCache nombre del cache que contiene el cache
	 * @return objeto T que contiene la informacion en cache
	 */
	public T consultarCache(String as_esquema, String as_nombreCache);

	/**
	 * Metodo que permite acceder al cache y asignar informacion a este.
	 *
	 * @param as_esquema     el parametro esquema
	 * @param as_nombreCache el parametro nombre cache
	 * @param at_datosCache  el parametro datos cache
	 */
	public void actualizarCache(String as_esquema, String as_nombreCache, T at_datosCache);

}
