/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BeansLocales.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.utils
 * Nombre del elemento: BeansLocales
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.utils;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IAsociacionUsuarioEntidadEspecialBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IAsociacionUsuarioPersonaJuridicaBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICatalogoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IEntidadEspecialBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IEnvioCorreoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IGestionTareasProgramadasBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IHistoricoConsultaBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IIntegracionBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IMunicipioBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IPaisBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IParametroBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IPasarelaBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IPermisoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IPersonaBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IPersonaJuridicaBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IPersonaNaturalBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IRegistroAlertaBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IRolPermisoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IServicioIntegracionBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoEjeBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IUsuarioBloqueoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IUsuarioBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IUsuarioRolBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IVeredaBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.common.cache.interfaces.IRepositorioSesionesCache;

/**
 * El elemento Class BeansLocales.<br>
 * Representa un/una beans locales.<br>
 * Clase que permite acceder por JNDI a los beans existentes en el contenedor
 * EJB.
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class BeansLocales {

	/**
	 * Construye una nueva instancia/objeto de la clase BeansLocales.
	 */
	private BeansLocales() {
		// Metodo constructor privado
	}

	/**
	 * Metodo para generar EJB fuera del contexto.
	 *
	 * @return Resultado para consultar usuario rol business retornado como
	 *         IUsuarioRolBusiness
	 */
	public static IUsuarioRolBusiness consultarUsuarioRolBusiness() {
		InitialContext lic_contexto;
		try {
			lic_contexto = new InitialContext();
			IUsuarioRolBusiness liurb_usuarioRolBusiness;
			liurb_usuarioRolBusiness = (IUsuarioRolBusiness) lic_contexto.lookup(crearRutaEJB(
					"UsuarioRolBusiness!co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl.UsuarioRolBusiness",
					lic_contexto));
			return liurb_usuarioRolBusiness;
		} catch (Exception ae_excepcion) {
			return null;
		}
	}

	/**
	 * Metodo para generar EJB fuera del contexto.
	 *
	 * @return Resultado para consultar integracion business retornado como
	 *         IIntegracionBusiness
	 */
	public static IIntegracionBusiness consultarIntegracionBusiness() {
		InitialContext lic_contexto;
		try {
			lic_contexto = new InitialContext();
			IIntegracionBusiness liib_integracionBusiness;
			liib_integracionBusiness = (IIntegracionBusiness) lic_contexto.lookup(crearRutaEJB(
					"IntegracionBusiness!co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl.IntegracionBusiness",
					lic_contexto));
			return liib_integracionBusiness;
		} catch (Exception ae_excepcion) {
			return null;
		}
	}

	/**
	 * Metodo para generar EJB fuera del contexto.
	 *
	 * @return Resultado para consultar envio correo business retornado como
	 *         IEnvioCorreoBusiness
	 */
	public static IEnvioCorreoBusiness consultarEnvioCorreoBusiness() {
		InitialContext lic_contexto;
		try {
			lic_contexto = new InitialContext();
			IEnvioCorreoBusiness liec_envioCorreoBusiness;
			liec_envioCorreoBusiness = (IEnvioCorreoBusiness) lic_contexto.lookup(crearRutaEJB(
					"EnvioCorreoBusiness!co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl.EnvioCorreoBusiness",
					lic_contexto));
			return liec_envioCorreoBusiness;
		} catch (Exception ae_excepcion) {
			return null;
		}
	}

	/**
	 * Metodo para generar EJB fuera del contexto.
	 *
	 * @return Resultado para consultar pasarela business retornado como
	 *         IPasarelaBusiness
	 */
	public static IPasarelaBusiness consultarPasarelaBusiness() {
		InitialContext lic_contexto;
		try {
			lic_contexto = new InitialContext();
			IPasarelaBusiness lipb_pasarelaBusiness;
			lipb_pasarelaBusiness = (IPasarelaBusiness) lic_contexto.lookup(crearRutaEJB(
					"PasarelaBusiness!co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl.PasarelaBusiness",
					lic_contexto));
			return lipb_pasarelaBusiness;
		} catch (Exception ae_excepcion) {
			return null;
		}
	}

	/**
	 * Metodo para generar EJB fuera del contexto.
	 *
	 * @return Resultado para consultar gestion alerta business retornado como
	 *         IRegistroAlertaBusiness
	 */
	public static IRegistroAlertaBusiness consultarGestionAlertaBusiness() {
		InitialContext lic_contexto;
		try {
			lic_contexto = new InitialContext();
			IRegistroAlertaBusiness lirab_registroAlertaBusiness;
			lirab_registroAlertaBusiness = (IRegistroAlertaBusiness) lic_contexto.lookup(crearRutaEJB(
					"RegistroAlertaBusiness!co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl.RegistroAlertaBusiness",
					lic_contexto));
			return lirab_registroAlertaBusiness;
		} catch (Exception ae_excepcion) {
			return null;
		}
	}

	/**
	 * Metodo para generar EJB fuera del contexto.
	 *
	 * @return Resultado para consultar gestion tareas programadas business
	 *         retornado como IGestionTareasProgramadasBusiness
	 */
	public static IGestionTareasProgramadasBusiness consultarGestionTareasProgramadasBusiness() {
		InitialContext lic_contexto;
		try {
			lic_contexto = new InitialContext();
			IGestionTareasProgramadasBusiness lgtp_gestionTareaProgramadaBusiness;
			lgtp_gestionTareaProgramadaBusiness = (IGestionTareasProgramadasBusiness) lic_contexto.lookup(crearRutaEJB(
					"GestionTareasProgramadasBusiness!co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl.GestionTareasProgramadasBusiness",
					lic_contexto));
			return lgtp_gestionTareaProgramadaBusiness;
		} catch (Exception ae_excepcion) {
			return null;
		}
	}

	/**
	 * Metodo para generar EJB fuera del contexto.
	 *
	 * @return Resultado para consultar tipo eje business retornado como
	 *         ITipoEjeBusiness
	 */
	public static ITipoEjeBusiness consultarTipoEjeBusiness() {
		InitialContext lic_contexto;
		try {
			lic_contexto = new InitialContext();
			ITipoEjeBusiness lte_tipoEjeBusiness;
			lte_tipoEjeBusiness = (ITipoEjeBusiness) lic_contexto.lookup(crearRutaEJB(
					"TipoEjeBusiness!co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl.TipoEjeBusiness",
					lic_contexto));
			return lte_tipoEjeBusiness;
		} catch (Exception ae_excepcion) {
			return null;
		}
	}

	/**
	 * Metodo para generar EJB fuera del contexto.
	 *
	 * @return Resultado para consultar vereda business retornado como
	 *         IVeredaBusiness
	 */
	public static IVeredaBusiness consultarVeredaBusiness() {
		InitialContext lic_contexto;
		try {
			lic_contexto = new InitialContext();
			IVeredaBusiness liv_veredaBusiness;
			liv_veredaBusiness = (IVeredaBusiness) lic_contexto.lookup(crearRutaEJB(
					"VeredaBusiness!co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl.VeredaBusiness",
					lic_contexto));
			return liv_veredaBusiness;
		} catch (Exception ae_excepcion) {
			return null;
		}
	}

	/**
	 * Metodo para generar EJB fuera del contexto.
	 *
	 * @return Resultado para consultar municipios business retornado como
	 *         IMunicipioBusiness
	 */
	public static IMunicipioBusiness consultarMunicipiosBusiness() {
		InitialContext lic_contexto;
		try {
			lic_contexto = new InitialContext();
			IMunicipioBusiness lim_municipiosBusiness;
			lim_municipiosBusiness = (IMunicipioBusiness) lic_contexto.lookup(crearRutaEJB(
					"MunicipioBusiness!co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl.MunicipioBusiness",
					lic_contexto));
			return lim_municipiosBusiness;
		} catch (Exception ae_excepcion) {
			return null;
		}
	}

	/**
	 * Metodo para generar EJB fuera del contexto.
	 *
	 * @return Resultado para consultar asociacion usuario persona juridica
	 *         retornado como IAsociacionUsuarioPersonaJuridicaBusiness
	 */
	public static IAsociacionUsuarioPersonaJuridicaBusiness consultarAsociacionUsuarioPersonaJuridica() {
		InitialContext lic_contexto;
		try {
			lic_contexto = new InitialContext();
			IAsociacionUsuarioPersonaJuridicaBusiness liaupj_asociacionPersonaJuridicaBusiness;
			liaupj_asociacionPersonaJuridicaBusiness = (IAsociacionUsuarioPersonaJuridicaBusiness) lic_contexto
					.lookup(crearRutaEJB(
							"AsociacionUsuarioPersonaJuridicaBusiness!co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl.AsociacionUsuarioPersonaJuridicaBusiness",
							lic_contexto));
			return liaupj_asociacionPersonaJuridicaBusiness;
		} catch (Exception ae_excepcion) {
			return null;
		}
	}

	/**
	 * Metodo para generar EJB fuera del contexto.
	 *
	 * @return Resultado para consultar persona juridica business retornado como
	 *         IPersonaJuridicaBusiness
	 */
	public static IPersonaJuridicaBusiness consultarPersonaJuridicaBusiness() {
		InitialContext lic_contexto;
		try {
			lic_contexto = new InitialContext();
			IPersonaJuridicaBusiness lipj_personaJuridicaBusiness;
			lipj_personaJuridicaBusiness = (IPersonaJuridicaBusiness) lic_contexto.lookup(crearRutaEJB(
					"PersonaJuridicaBusiness!co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl.PersonaJuridicaBusiness",
					lic_contexto));
			return lipj_personaJuridicaBusiness;
		} catch (Exception ae_excepcion) {
			return null;
		}
	}

	/**
	 * Metodo para generar EJB fuera del contexto.
	 *
	 * @return Resultado para consultar entidad especial retornado como
	 *         IEntidadEspecialBusiness
	 */
	public static IEntidadEspecialBusiness consultarEntidadEspecial() {
		InitialContext lic_contexto;
		try {
			lic_contexto = new InitialContext();
			IEntidadEspecialBusiness liaupj_entidadEspecialBusiness;
			liaupj_entidadEspecialBusiness = (IEntidadEspecialBusiness) lic_contexto.lookup(crearRutaEJB(
					"EntidadEspecialBusiness!co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl.EntidadEspecialBusiness",
					lic_contexto));
			return liaupj_entidadEspecialBusiness;
		} catch (Exception ae_excepcion) {
			return null;
		}
	}

	/**
	 * Metodo para generar EJB fuera del contexto.
	 *
	 * @return Resultado para consultar asociacion usuario entidad especial
	 *         retornado como IAsociacionUsuarioEntidadEspecialBusiness
	 */
	public static IAsociacionUsuarioEntidadEspecialBusiness consultarAsociacionUsuarioEntidadEspecial() {
		InitialContext lic_contexto;
		try {
			lic_contexto = new InitialContext();
			IAsociacionUsuarioEntidadEspecialBusiness liaupj_asociacionEntidadEspecialBusiness;
			liaupj_asociacionEntidadEspecialBusiness = (IAsociacionUsuarioEntidadEspecialBusiness) lic_contexto
					.lookup(crearRutaEJB(
							"AsociacionUsuarioEntidadEspecialBusiness!co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl.AsociacionUsuarioEntidadEspecialBusiness",
							lic_contexto));
			return liaupj_asociacionEntidadEspecialBusiness;
		} catch (Exception ae_excepcion) {
			return null;
		}
	}

	/**
	 * Metodo para generar EJB fuera del contexto.
	 *
	 * @return Resultado para consultar catalogos retornado como ICatalogoBusiness
	 */
	public static ICatalogoBusiness consultarCatalogos() {
		InitialContext lic_contexto;
		try {
			lic_contexto = new InitialContext();
			ICatalogoBusiness lic_catalogoBusiness;
			lic_catalogoBusiness = (ICatalogoBusiness) lic_contexto.lookup(crearRutaEJB(
					"CatalogoBusiness!co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl.CatalogoBusiness",
					lic_contexto));
			return lic_catalogoBusiness;
		} catch (Exception ae_excepcion) {
			return null;
		}
	}

	/**
	 * Metodo para generar EJB fuera del contexto.
	 *
	 * @return Resultado para consultar persona natural business retornado como
	 *         IPersonaNaturalBusiness
	 */
	public static IPersonaNaturalBusiness consultarPersonaNaturalBusiness() {
		InitialContext lic_contexto;
		try {
			lic_contexto = new InitialContext();
			IPersonaNaturalBusiness lipn_personaNaturalBusiness;
			lipn_personaNaturalBusiness = (IPersonaNaturalBusiness) lic_contexto.lookup(crearRutaEJB(
					"PersonaNaturalBusiness!co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl.PersonaNaturalBusiness",
					lic_contexto));
			return lipn_personaNaturalBusiness;
		} catch (Exception ae_excepcion) {
			return null;
		}
	}

	/**
	 * Metodo para generar EJB fuera del contexto.
	 *
	 * @return Resultado para consultar persona business retornado como
	 *         IPersonaBusiness
	 */
	public static IPersonaBusiness consultarPersonaBusiness() {
		InitialContext lic_contexto;
		try {
			lic_contexto = new InitialContext();
			IPersonaBusiness lip_personaBusiness;
			lip_personaBusiness = (IPersonaBusiness) lic_contexto.lookup(crearRutaEJB(
					"PersonaBusiness!co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl.PersonaBusiness",
					lic_contexto));
			return lip_personaBusiness;
		} catch (Exception ae_excepcion) {
			return null;
		}
	}

	/**
	 * Metodo para generar EJB fuera del contexto.
	 *
	 * @return Resultado para consultar entidad especial business retornado como
	 *         IEntidadEspecialBusiness
	 */
	public static IEntidadEspecialBusiness consultarEntidadEspecialBusiness() {
		InitialContext lic_contexto;
		try {
			lic_contexto = new InitialContext();
			IEntidadEspecialBusiness liee_entidadEspecialBusiness;
			liee_entidadEspecialBusiness = (IEntidadEspecialBusiness) lic_contexto.lookup(crearRutaEJB(
					"EntidadEspecialBusiness!co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl.EntidadEspecialBusiness",
					lic_contexto));
			return liee_entidadEspecialBusiness;
		} catch (Exception ae_excepcion) {
			return null;
		}
	}

	/**
	 * Metodo para generar EJB fuera del contexto.
	 *
	 * @return Resultado para consultar parametro business retornado como
	 *         IParametroBusiness
	 */
	public static IParametroBusiness consultarParametroBusiness() {
		InitialContext lic_contexto;
		try {
			lic_contexto = new InitialContext();
			IParametroBusiness lipb_parametroBusiness;
			lipb_parametroBusiness = (IParametroBusiness) lic_contexto.lookup(crearRutaEJB(
					"ParametroBusiness!co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl.ParametroBusiness",
					lic_contexto));
			return lipb_parametroBusiness;
		} catch (Exception ae_excepcion) {
			return null;
		}
	}

	/**
	 * Metodo para generar EJB fuera del contexto.
	 *
	 * @return Resultado para consultar permiso business retornado como
	 *         IPermisoBusiness
	 */
	public static IPermisoBusiness consultarPermisoBusiness() {
		InitialContext lic_contexto;
		try {
			lic_contexto = new InitialContext();
			IPermisoBusiness lp_permisoBusiness;
			lp_permisoBusiness = (IPermisoBusiness) lic_contexto.lookup(crearRutaEJB(
					"PermisoBusiness!co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl.PermisoBusiness",
					lic_contexto));
			return lp_permisoBusiness;
		} catch (Exception ae_excepcion) {
			return null;
		}
	}

	/**
	 * Metodo para generar EJB fuera del contexto.
	 *
	 * @return Resultado para consultar usuario bloqueo business retornado como
	 *         IUsuarioBloqueoBusiness
	 */
	public static IUsuarioBloqueoBusiness consultarUsuarioBloqueoBusiness() {
		InitialContext lic_contexto;
		try {
			lic_contexto = new InitialContext();
			IUsuarioBloqueoBusiness liub_usuarioBloqueoBusiness;
			liub_usuarioBloqueoBusiness = (IUsuarioBloqueoBusiness) lic_contexto.lookup(crearRutaEJB(
					"UsuarioBloqueoBusiness!co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl.UsuarioBloqueoBusiness",
					lic_contexto));
			return liub_usuarioBloqueoBusiness;
		} catch (Exception ae_excepcion) {
			return null;
		}
	}

	/**
	 * Metodo para generar EJB fuera del contexto.
	 *
	 * @return Resultado para consultar rol permiso business retornado como
	 *         IRolPermisoBusiness
	 */
	public static IRolPermisoBusiness consultarRolPermisoBusiness() {
		InitialContext lic_contexto;
		try {
			lic_contexto = new InitialContext();
			IRolPermisoBusiness lp_rolPermisoBusiness;
			lp_rolPermisoBusiness = (IRolPermisoBusiness) lic_contexto.lookup(crearRutaEJB(
					"RolPermisoBusiness!co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl.RolPermisoBusiness",
					lic_contexto));
			return lp_rolPermisoBusiness;
		} catch (Exception ae_excepcion) {
			return null;
		}
	}

	/**
	 * Metodo para generar EJB fuera del contexto.
	 *
	 * @return Resultado para consultar usuario business retornado como
	 *         IUsuarioBusiness
	 */
	public static IUsuarioBusiness consultarUsuarioBusiness() {
		try {
			InitialContext lic_contexto = new InitialContext();
			IUsuarioBusiness lu_usuarioBusiness;
			lu_usuarioBusiness = (IUsuarioBusiness) lic_contexto.lookup(crearRutaEJB(
					"UsuarioBusiness!co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl.UsuarioBusiness",
					lic_contexto));

			return lu_usuarioBusiness;
		} catch (Exception ae_excepcion) {
			return null;
		}
	}

	/**
	 * Metodo para generar EJB fuera del contexto.
	 *
	 * @return Resultado para consultar repositorio sesiones cache retornado como
	 *         IRepositorioSesionesCache
	 */
	public static IRepositorioSesionesCache consultarRepositorioSesionesCache() {
		try {

			InitialContext lic_contexto = new InitialContext();
			IRepositorioSesionesCache lu_repositorioSesiones;
			lu_repositorioSesiones = (IRepositorioSesionesCache) lic_contexto.lookup(crearRutaEJB(
					"RepositorioSesionesCache!co.gov.supernotariado.bachue.sedeelectronica.common.cache.impl.RepositorioSesionesCache",
					lic_contexto));

			return lu_repositorioSesiones;
		} catch (Exception ae_excepcion) {
			return null;
		}
	}

	/**
	 * Metodo para generar EJB fuera del contexto.
	 *
	 * @return Resultado para consultar servicio integracion retornado como
	 *         IServicioIntegracionBusiness
	 */
	public static IServicioIntegracionBusiness consultarServicioIntegracion() {
		try {

			InitialContext lic_contexto = new InitialContext();
			IServicioIntegracionBusiness lisib_servicioIntegracionBusiness;
			lisib_servicioIntegracionBusiness = (IServicioIntegracionBusiness) lic_contexto.lookup(crearRutaEJB(
					"ServicioIntegracionBusiness!co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl.ServicioIntegracionBusiness",
					lic_contexto));

			return lisib_servicioIntegracionBusiness;
		} catch (Exception ae_excepcion) {
			return null;
		}
	}

	/**
	 * Metodo para generar EJB fuera del contexto.
	 *
	 * @return Resultado para consultar pais business retornado como IPaisBusiness
	 */
	public static IPaisBusiness consultarPaisBusiness() {
		try {

			InitialContext lic_contexto = new InitialContext();
			IPaisBusiness lp_paisBusiness;
			lp_paisBusiness = (IPaisBusiness) lic_contexto.lookup(crearRutaEJB(
					"PaisBusiness!co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl.PaisBusiness",
					lic_contexto));

			return lp_paisBusiness;
		} catch (Exception ae_excepcion) {
			return null;
		}
	}

	/**
	 * Metodo para generar EJB fuera del contexto.
	 *
	 * @param as_nameJndi el parametro name jndi
	 * @param ai_contexto el parametro contexto
	 * @return Resultado para crear ruta EJB retornado como String
	 * @throws NamingException la excepcion naming exception
	 */
	private static String crearRutaEJB(String as_nameJndi, InitialContext ai_contexto) throws NamingException {

		String ls_moduleName = (String) ai_contexto.lookup("java:module/ModuleName");
		String ls_applicationName = (String) ai_contexto.lookup("java:app/AppName");
		String ls_rutaEJB;
		ls_rutaEJB = "java:global." + ls_applicationName + "."
				+ (ls_moduleName.equals(ls_applicationName) ? "" : ls_moduleName + ".") + as_nameJndi;
		return ls_rutaEJB;

	}

	/**
	 * Metodo que permite consultar un bean de tipo asociacion persona juridica.
	 *
	 * @return Resultado para consultar asociacion persona juridica business
	 *         retornado como IAsociacionUsuarioPersonaJuridicaBusiness
	 */
	public static IAsociacionUsuarioPersonaJuridicaBusiness consultarAsociacionPersonaJuridicaBusiness() {
		try {

			InitialContext lic_contexto = new InitialContext();
			IAsociacionUsuarioPersonaJuridicaBusiness liaupj_asociacionUsuarioPersonaJuridicaBusiness;
			liaupj_asociacionUsuarioPersonaJuridicaBusiness = (IAsociacionUsuarioPersonaJuridicaBusiness) lic_contexto
					.lookup(crearRutaEJB(
							"AsociacionUsuarioPersonaJuridicaBusiness!co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl.AsociacionUsuarioPersonaJuridicaBusiness",
							lic_contexto));

			return liaupj_asociacionUsuarioPersonaJuridicaBusiness;
		} catch (Exception ae_excepcion) {
			return null;
		}
	}

	/**
	 * Metodo que permite consultar un bean de tipo historico consultas.
	 *
	 * @return Resultado para consultar historico consultas business retornado como
	 *         IHistoricoConsultaBusiness
	 */
	public static IHistoricoConsultaBusiness consultarHistoricoConsultasBusiness() {
		try {

			InitialContext lic_contexto = new InitialContext();
			IHistoricoConsultaBusiness lihcb_historicoConsultaBusiness;
			lihcb_historicoConsultaBusiness = (IHistoricoConsultaBusiness) lic_contexto.lookup(crearRutaEJB(
					"HistoricoConsultaBusiness!co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl.HistoricoConsultaBusiness",
					lic_contexto));

			return lihcb_historicoConsultaBusiness;
		} catch (Exception ae_excepcion) {
			return null;
		}
	}

}
