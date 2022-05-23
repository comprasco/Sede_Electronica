/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: CacheBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl
 * Nombre del elemento: CacheBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesNegocio;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICacheBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICatalogoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IDepartamentoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IMunicipioBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IPaisBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IParametroBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IRolBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IRolPermisoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoCatalogoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoDocumentoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoEjeBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoProcesoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCache;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesCache;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica de las operaciones del recurso Cache. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "CacheBusiness", mappedName = "CacheBusiness")
@LocalBean
public class CacheBusiness implements ICacheBusiness{

	/**
	 * Atributo de instancia tipo IRolBusiness para definir la propiedad rol
	 * business.
	 */
	@EJB
	IRolBusiness iir_rolBusiness;

	/**
	 * Atributo de instancia tipo IPaisBusiness para definir la propiedad pais
	 * business.
	 */
	@EJB
	IPaisBusiness iipb_paisBusiness;

	/**
	 * Atributo de instancia tipo IParametroBusiness para definir la propiedad
	 * parametro business.
	 */
	@EJB
	IParametroBusiness iipb_parametroBusiness;

	/**
	 * Atributo de instancia tipo IDepartamentoBusiness para definir la propiedad
	 * departamento business.
	 */
	@EJB
	IDepartamentoBusiness iidb_departamentoBusiness;

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
	 * Atributo de instancia tipo IMunicipioBusiness para definir la propiedad
	 * municipio business.
	 */
	@EJB
	IMunicipioBusiness iidb_municipioBusiness;

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

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICacheBusiness#actualizarCompletoCache()
	 */
	@Override
	public void actualizarCompletoCache()  {

		try {
			iirpb_rolPermisoBusiness.actualizarRolesURLsCache();
			iir_rolBusiness.actualizarRolesCache();
			iipb_paisBusiness.actualizarPaisesCache();
			iidb_departamentoBusiness.actualizarDepartamentosCache();
			iidb_tipoEjeBusiness.actualizarTipoEjeCache();
			iidb_tipoCatalogoBusines.actualizarTipoCatalogoCache();
			iidb_tipoEstadoCuentaBusiness.actualizarTipoEstadoCuentaCache();
			iidb_tipoProcesoBusiness.actualizarTipoProcesoCache();
			iidb_tipoDocumentoBusiness.actualizarTiposDocumentoCache();
			iidb_catalogoBusiness.actualizarCatalogoCache();
			iidb_municipioBusiness.actualizarMunicipioCache();
		} catch (Exception e) {
			throw new ExcepcionesNegocio(EnumExcepcionesCache.CACHE_NO_ACTUALIZADO);
		}
		
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICacheBusiness#actualizarCacheEspecifico(co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCache)
	 */
	@Override
	public void actualizarCacheEspecifico(EnumCache aec_cache) {

		switch (aec_cache) {
		case CATALOGO:
			iidb_catalogoBusiness.actualizarCatalogoCache();
			break;
		case DEPARTAMENTOS:
			iidb_departamentoBusiness.actualizarDepartamentosCache();
			break;

		case MUNICIPIOS:
			iidb_municipioBusiness.actualizarMunicipioCache();
			break;

		case PAISES:
			iipb_paisBusiness.actualizarPaisesCache();
			break;

		case PARAMETRO:
			iipb_parametroBusiness.actualizarParametroCache();
			break;

		case ROLES:
			iir_rolBusiness.actualizarRolesCache();
			break;

		case ROLES_PERMISOS:
			iirpb_rolPermisoBusiness.actualizarRolesURLsCache();			
			break;

		case TIPO_CATALOGOS:
			iidb_tipoCatalogoBusines.actualizarTipoCatalogoCache();
			break;

		case TIPO_DOCUMENTOS:
			iidb_tipoDocumentoBusiness.actualizarTiposDocumentoCache();
			break;

		case TIPO_EJE:
			iidb_tipoEjeBusiness.actualizarTipoEjeCache();
			break;

		case TIPO_ESTADO_CUENTA:
			iidb_tipoEstadoCuentaBusiness.actualizarTipoEstadoCuentaCache();
			break;
		case TIPO_PROCESO:
			iidb_tipoProcesoBusiness.actualizarTipoProcesoCache();
			break;

		default:
			throw new ExcepcionesNegocio(EnumExcepcionesCache.CACHE_NO_ACTUALIZADO);
		}
	}	
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICacheBusiness#consultarCacheEspecifico(co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCache)
	 */
	@Override
	public Object consultarCacheEspecifico(EnumCache aec_cache) {
		switch (aec_cache) {
		case CATALOGO:
			return iidb_catalogoBusiness.consultarCacheCatalogo();
			
		case DEPARTAMENTOS:
			return iidb_departamentoBusiness.consultarCacheDepartamentos();
		
		case MUNICIPIOS:
			return 	iidb_municipioBusiness.consultarCacheMunicipios();

		case PAISES:
			return 	iipb_paisBusiness.consultarCachePais();

		case PARAMETRO:
			return 	iipb_parametroBusiness.consultarCacheParametro();

		case ROLES:
			return 	iir_rolBusiness.consultarCacheRol();

		case TIPO_CATALOGOS:
			return 	iidb_tipoCatalogoBusines.consultarCacheTipoCatalogo();

		case TIPO_DOCUMENTOS:
			return 	iidb_tipoDocumentoBusiness.consultarCacheTipoDocumento();

		case TIPO_EJE:
			return 	iidb_tipoEjeBusiness.consultarCacheTipoEje();

		case TIPO_ESTADO_CUENTA:
			return 	iidb_tipoEstadoCuentaBusiness.consultarCacheTipoEstadoCuenta();
					case TIPO_PROCESO:
			return 	iidb_tipoProcesoBusiness.consultarCacheTipoProceso();
		
		default:
			throw new ExcepcionesNegocio(EnumExcepcionesCache.CACHE_NO_ACTUALIZADO);
		}
	}

}
