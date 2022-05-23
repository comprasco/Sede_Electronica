/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: CacheGeneral.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.cache.impl
 * Nombre del elemento: CacheGeneral
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.cache.impl;

import java.util.HashMap;
import java.util.Map;

import com.tangosol.net.CacheFactory;
import com.tangosol.net.NamedCache;

/**
 * El elemento Class CacheGeneral.<br>
 * Representa un/una cache general.<br>
 * Clase que extiende de CacheGenerico.
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 * @param <T> el tipo generico
 */
public class CacheGeneral<T> extends CacheGenerico<T> {

	/**
	 * Metodo que permite agregar datos a cache.
	 *
	 * @param as_llave   key de almacenamiento
	 * @param at_objeto  objeto a alojar
	 * @param as_esquema esquema de coherence
	 */
	public void agregarDato(String as_llave, T at_objeto, String as_esquema) {

		CacheFactory.ensureCluster();
		NamedCache<String, T> lnc_cache = CacheFactory.getCache(as_esquema);
		lnc_cache.put(as_llave, at_objeto);

	}

	/**
	 * Metodo que permite consultar objetos en cache.
	 *
	 * @param as_llave   key de almacenamiento
	 * @param as_esquema esquema de coherence
	 * @return Retorno de objeto solicitado
	 */
	public T consultarDato(String as_llave, String as_esquema) {

		CacheFactory.ensureCluster();
		NamedCache<String, T> lnc_cache = CacheFactory.getCache(as_esquema);
		T sesion;
		sesion = lnc_cache.get(as_llave);
		return sesion;

	}

	/**
	 * Metodo que remueve un objeto en el cache.
	 *
	 * @param as_llave   llave para acceder al dato a remover
	 * @param as_esquema esquema de objeto solicitado en coherence
	 */
	public void removerDato(String as_llave, String as_esquema) {

		CacheFactory.ensureCluster();
		NamedCache<String, T> lnc_cache = CacheFactory.getCache(as_esquema);

		lnc_cache.remove(as_llave);

	}

	/**
	 * Metodo que permite permite consultar los lista de map de los objetos en un
	 * esquema.
	 *
	 * @param as_esquema esquema a consultar
	 * @return map con la llave y el objeto a alojar
	 */
	public Map<String, T> consultarDatos(String as_esquema) {

		CacheFactory.ensureCluster();
		NamedCache<String, T> lnc_cache = CacheFactory.getCache(as_esquema);

		Map<String, T> lm_datos = new HashMap<>();
		lnc_cache.forEach((k, v) -> lm_datos.put((String) k, (T) v));

		return lm_datos;

	}

}
