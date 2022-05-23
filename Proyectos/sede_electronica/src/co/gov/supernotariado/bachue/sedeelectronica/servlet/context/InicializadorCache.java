/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: InicializadorCache.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.servlet.context
 * Nombre del elemento: InicializadorCache
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.servlet.context;

import javax.ejb.EJB;
import javax.ejb.Schedule;
import javax.ejb.Stateless;
import javax.ejb.Timer;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICatalogoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IDepartamentoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IEntidadEspecialBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IMunicipioBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IPaisBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IRolBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IRolPermisoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoCatalogoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoDocumentoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoEjeBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoProcesoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl.TipoEstadoCuentaBusiness;

/**
 * El elemento Class InicializadorCache.<br>
 * Representa el inicializador cache.<br>
 * Clase que permite inicializar el cache una vez se haya desplegado el
 * aplicativo completamente.
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless
public class InicializadorCache {


	/**
	 * Atributo de instancia tipo IRolBusiness para definir la propiedad rol
	 * business.
	 */
	@EJB
	IRolBusiness iirb_rolBusiness;

	/**
	 * Atributo de instancia tipo IPaisBusiness para definir la propiedad pais
	 * business.
	 */
	@EJB
	IPaisBusiness iipb_paisBusiness;

	/**
	 * Atributo de instancia tipo IDepartamentoBusiness para definir la propiedad
	 * departamento business.
	 */
	@EJB
	IDepartamentoBusiness iidb_departamentoBusiness;

	/**
	 * Atributo de instancia tipo IMunicipioBusiness para definir la propiedad
	 * municipio business.
	 */
	@EJB
	IMunicipioBusiness iidb_municipioBusiness;

	/**
	 * Atributo de instancia tipo ITipoEjeBusiness para definir la propiedad tipo
	 * eje business.
	 */
	@EJB
	ITipoEjeBusiness iidb_tipoEjeBusiness;

	/**
	 * Atributo de instancia tipo ITipoCatalogoBusiness para definir la propiedad
	 * tipo catalogo busines.
	 */
	@EJB
	ITipoCatalogoBusiness iidb_tipoCatalogoBusines;

	/**
	 * Atributo de instancia tipo TipoEstadoCuentaBusiness para definir la propiedad
	 * tipo estado cuenta business.
	 */
	@EJB
	TipoEstadoCuentaBusiness iidb_tipoEstadoCuentaBusiness;

	/**
	 * Atributo de instancia tipo ITipoProcesoBusiness para definir la propiedad
	 * tipo proceso business.
	 */
	@EJB
	ITipoProcesoBusiness iidb_tipoProcesoBusiness;

	/**
	 * Atributo de instancia tipo ITipoDocumentoBusiness para definir la propiedad
	 * tipo documento business.
	 */
	@EJB
	ITipoDocumentoBusiness iidb_tipoDocumentoBusiness;

	/**
	 * Atributo de instancia tipo ICatalogoBusiness para definir la propiedad
	 * catalogo business.
	 */
	@EJB
	ICatalogoBusiness iidb_catalogoBusiness;

	/**
	 * Atributo de instancia tipo IRolPermisoBusiness para definir la propiedad rol
	 * permiso business.
	 */
	@EJB
	IRolPermisoBusiness iirpb_rolPermisoBusiness;

	/**
	 * Atributo de instancia tipo IEntidadEspecialBusiness para definir la propiedad
	 * entidades especiales business.
	 */
	@EJB
	IEntidadEspecialBusiness iiee_entidadesEspecialesBusiness;

	/**
	 * Inicializa el objeto.
	 *
	 * @param at_tiempo el parametro tiempo
	 */
	@Schedule(hour = "*", minute = "*", persistent = false)
	protected void init(Timer at_tiempo) {
		cargarCache();
		at_tiempo.cancel();
	}

	/**
	 * Metodo que permite actualizar cache total.
	 */
	public void cargarCache() {
		iirb_rolBusiness.actualizarRolesCache();
		iipb_paisBusiness.actualizarPaisesCache();
		iidb_departamentoBusiness.actualizarDepartamentosCache();
		iidb_tipoEjeBusiness.actualizarTipoEjeCache();
		iidb_tipoCatalogoBusines.actualizarTipoCatalogoCache();
		iidb_tipoEstadoCuentaBusiness.actualizarTipoEstadoCuentaCache();
		iidb_tipoProcesoBusiness.actualizarTipoProcesoCache();
		iidb_tipoDocumentoBusiness.actualizarTiposDocumentoCache();
		iidb_municipioBusiness.actualizarMunicipioCache();
		iidb_catalogoBusiness.actualizarCatalogoCache();
		iirpb_rolPermisoBusiness.actualizarRolesURLsCache();
	}
}