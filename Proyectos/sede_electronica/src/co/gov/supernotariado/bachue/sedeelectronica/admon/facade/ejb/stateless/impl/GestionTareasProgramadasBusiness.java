/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: GestionTareasProgramadasBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl
 * Nombre del elemento: GestionTareasProgramadasBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICarritoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICatalogoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IDepartamentoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IEntidadEspecialBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IGestionTareasProgramadasBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IMunicipioBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IPaisBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IRolBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IRolPermisoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoCatalogoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoDocumentoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoEjeBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoProcesoBusiness;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica de las operaciones del recurso Gestion
 * tareas programadas. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "GestionTareasProgramadasBusiness", mappedName = "GestionTareasProgramadasBusiness")
@LocalBean
public class GestionTareasProgramadasBusiness implements IGestionTareasProgramadasBusiness {


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
	IMunicipioBusiness iim_municipioBusiness;

	/**
	 * Atributo de instancia tipo ITipoEjeBusiness para definir la propiedad tipo
	 * eje business.
	 */
	@EJB
	ITipoEjeBusiness iite_tipoEjeBusiness;

	/**
	 * Atributo de instancia tipo ITipoCatalogoBusiness para definir la propiedad
	 * tipo catalogo busines.
	 */
	@EJB
	ITipoCatalogoBusiness iitc_tipoCatalogoBusines;

	/**
	 * Atributo de instancia tipo TipoEstadoCuentaBusiness para definir la propiedad
	 * tipo estado cuenta business.
	 */
	@EJB
	TipoEstadoCuentaBusiness iitec_tipoEstadoCuentaBusiness;

	/**
	 * Atributo de instancia tipo ITipoProcesoBusiness para definir la propiedad
	 * tipo proceso business.
	 */
	@EJB
	ITipoProcesoBusiness iitp_tipoProcesoBusiness;

	/**
	 * Atributo de instancia tipo ITipoDocumentoBusiness para definir la propiedad
	 * tipo documento business.
	 */
	@EJB
	ITipoDocumentoBusiness iitd_tipoDocumentoBusiness;

	/**
	 * Atributo de instancia tipo ICatalogoBusiness para definir la propiedad
	 * catalogo business.
	 */
	@EJB
	ICatalogoBusiness iic_catalogoBusiness;

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
	 * Atributo de instancia tipo ICarritoBusiness para definir la propiedad carrito
	 * business.
	 */
	@EJB
	ICarritoBusiness iic_carritoBusiness;

	/**
	 * Metodo que permite actualizar cache total.
	 */
	@Override
	public void cargarCache() {
		iirb_rolBusiness.actualizarRolesCache();
		iipb_paisBusiness.actualizarPaisesCache();
		iidb_departamentoBusiness.actualizarDepartamentosCache();
		iite_tipoEjeBusiness.actualizarTipoEjeCache();
		iitc_tipoCatalogoBusines.actualizarTipoCatalogoCache();
		iitec_tipoEstadoCuentaBusiness.actualizarTipoEstadoCuentaCache();
		iitp_tipoProcesoBusiness.actualizarTipoProcesoCache();
		iitd_tipoDocumentoBusiness.actualizarTiposDocumentoCache();
		iim_municipioBusiness.actualizarMunicipioCache();
		iic_catalogoBusiness.actualizarCatalogoCache();
		iirpb_rolPermisoBusiness.actualizarRolesURLsCache();
	}

	/**
	 * Metodo que permite actualizar cache total.
	 *
	 * @param ai_eliminarCarrito el parametro eliminar carrito
	 */
	@Override
	public void eliminarCarrito(Integer ai_eliminarCarrito) {		
		iic_carritoBusiness.eliminarCarritoMasivo(ai_eliminarCarrito);
	}
}