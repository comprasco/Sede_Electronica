/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IRepositorioSesionesCache.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.cache.interfaces
 * Nombre del elemento: IRepositorioSesionesCache
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.cache.interfaces;

import javax.ejb.Local;

import org.springframework.security.web.context.SecurityContextRepository;

/**
 * Interfaz que define acciones sobre el cache del respositorio de cache.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Local
public interface IRepositorioSesionesCache {

	/**
	 * Metodo que permite consultar el repositorio con ls sesiones.
	 *
	 * @return repositorio
	 */
	public SecurityContextRepository consultarSesiones();

	/**
	 * Metodo que permite crear sesiones en el repositorio.
	 */
	public void crearSesion();

}
