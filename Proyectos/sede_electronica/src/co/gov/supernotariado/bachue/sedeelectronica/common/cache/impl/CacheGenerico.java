/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: CacheGenerico.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.cache.impl
 * Nombre del elemento: CacheGenerico
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.cache.impl;

import java.util.List;

import com.tangosol.net.CacheFactory;
import com.tangosol.net.NamedCache;

import co.gov.supernotariado.bachue.sedeelectronica.common.cache.interfaces.ICacheGenerico;

/**
 * El elemento Class CacheGenerico.<br>
 * Representa un/una cache generico.<br>
 * Clase abstracta que implementa la interfaz ICacheGenerico.
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 * @param <T> el tipo generico
 */
public abstract class CacheGenerico<T> implements ICacheGenerico<T> {


	/*
	 * (non-Javadoc)
	 * 
	 * @see co.gov.supernotariado.bachue.sedeelectronica.common.cache.interfaces.
	 * ICacheGenerico#consultarCache(java.lang.String, java.lang.String)
	 */
	@Override
	public T consultarCache(String as_esquema, String as_nombreCache) {

		CacheFactory.ensureCluster();
		NamedCache<String, T> lnc_cache = CacheFactory.getCache(as_esquema);

		T lt_datosCache;
		lt_datosCache = lnc_cache.get(as_nombreCache);

		return lt_datosCache;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.gov.supernotariado.bachue.sedeelectronica.common.cache.interfaces.
	 * ICacheGenerico#actualizarCache(java.lang.String, java.lang.String,
	 * java.lang.Object)
	 */
	@Override
	public void actualizarCache(String as_esquema, String as_nombreCache, T at_datosCache) {

		CacheFactory.ensureCluster();
		NamedCache<String, T> lnc_cache = CacheFactory.getCache(as_esquema);
		lnc_cache.put(as_nombreCache, at_datosCache);
	}

	/**
	 * Metodo que permite consultar lista de objetos segun esquema y nombre cache.
	 *
	 * @param as_esquema     esquema en coherence
	 * @param as_nombreCache nombre del cach
	 * @return lista de objetos
	 */
	@SuppressWarnings("unchecked")
	public List<T> consultarCacheLista(String as_esquema, String as_nombreCache) {

		CacheFactory.ensureCluster();
		NamedCache<String, T> lnc_cache = CacheFactory.getCache(as_esquema);
		List<T> lt_datosCache;
		lt_datosCache = (List<T>) lnc_cache.get(as_nombreCache);
		return lt_datosCache;
	}

	/**
	 * Metodo que permite actualizar lista de objetos según esquema, nombre de cache
	 * y datos de cache.
	 *
	 * @param as_esquema     nombre del esquema
	 * @param as_nombreCache nombre del cache
	 * @param at_datosCache  datos a alojar
	 */
	public void actualizarCacheLista(String as_esquema, String as_nombreCache, List<T> at_datosCache) {

		CacheFactory.ensureCluster();
		NamedCache<String, List<T>> lncslt_cache = CacheFactory.getCache(as_esquema);
		lncslt_cache.put(as_nombreCache, at_datosCache);

	}

}
