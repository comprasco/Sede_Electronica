/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: RepositorioSesionesCache.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.cache.impl
 * Nombre del elemento: RepositorioSesionesCache
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.cache.impl;

import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Singleton;

import org.springframework.security.web.context.HttpSessionSecurityContextRepository;
import org.springframework.security.web.context.SecurityContextRepository;

import com.tangosol.net.CacheFactory;
import com.tangosol.net.NamedCache;

import co.gov.supernotariado.bachue.sedeelectronica.common.cache.interfaces.IRepositorioSesionesCache;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCache;
import co.gov.supernotariado.bachue.sedeelectronica.common.security.RepositorioSesionesContexto;

/**
 * El elemento Class RepositorioSesionesCache.<br>
 * Representa un/una repositorio sesiones cache.<br>
 * Clase que implementa la interfaz IRepositorioSesionesCache.
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Singleton(name = "RepositorioSesionesCache", mappedName = "RepositorioSesionesCache")
@LocalBean
public class RepositorioSesionesCache implements IRepositorioSesionesCache {

	/**
	 * Metodo ejecutado al iniciar el componente.
	 */
	@PostConstruct
	public void iniciar() {
		if (consultarSesiones() == null) {
			crearSesion();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.gov.supernotariado.bachue.sedeelectronica.common.cache.interfaces.
	 * IRepositorioSesionesCache#crearSesion()
	 */
	@Override
	public void crearSesion() {

		HttpSessionSecurityContextRepository lh_respositorioSesion = new RepositorioSesionesContexto();

		CacheFactory.ensureCluster();

		NamedCache<String, HttpSessionSecurityContextRepository> lncshsscr_cache = CacheFactory.getCache(EnumCache.SESIONES.getIs_nombreEsquema());

		if (!lncshsscr_cache.containsKey(EnumCache.SESIONES.getIs_nombreCache()))
			lncshsscr_cache.put(EnumCache.SESIONES.getIs_nombreCache(), lh_respositorioSesion);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.gov.supernotariado.bachue.sedeelectronica.common.cache.interfaces.
	 * IRepositorioSesionesCache#consultarSesiones()
	 */
	@Override
	public SecurityContextRepository consultarSesiones() {

		CacheFactory.ensureCluster();

		NamedCache<String, HttpSessionSecurityContextRepository>  lncshsscr_cache = CacheFactory.getCache(EnumCache.SESIONES.getIs_nombreEsquema());
		HttpSessionSecurityContextRepository lhssc_respositorioSesion;
		lhssc_respositorioSesion = lncshsscr_cache.get(EnumCache.SESIONES.getIs_nombreCache());

		return lhssc_respositorioSesion;
	}

}
