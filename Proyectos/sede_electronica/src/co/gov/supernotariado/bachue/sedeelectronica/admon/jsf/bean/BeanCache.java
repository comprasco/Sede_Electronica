/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BeanCache.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean
 * Nombre del elemento: BeanCache
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.PrimeFaces;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICacheBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCache;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoExcepciones;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.EnumMensajesCache;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.GeneradorGrowlGenerico;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.LenguajeUtilidad;

/**
 * Clase tipo managed bean de la capa de UI (User Interface). <br>
 * Manipula operaciones y propiedades que permiten manejar <br>
 * la visualizacion de componentes JSF para Cache.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@ManagedBean(name = "beanCache")
@ViewScoped
public class BeanCache implements Serializable{

	/**
	 * Atributo de instancia tipo ICacheBusiness para definir la propiedad cache
	 * business.
	 */
	@EJB
	ICacheBusiness iic_cacheBusiness;

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * valor grupo cache.
	 */
	private String is_valorGrupoCache;
	
	/**
	 * Atributo de instancia tipo lista de EnumCache para definir la propiedad lista
	 * enum cache.
	 */
	private List<EnumCache> il_listaEnumCache;
	
	/**
	 * Atributo de instancia tipo String para definir la propiedad enum cache
	 * seleccionado.
	 */
	private String iec_enumCacheSeleccionado;
	
	/**
	 * Atributo de instancia tipo PrimeFaces para definir la propiedad current.
	 */
	private transient PrimeFaces ipf_current;

	/**
	 * Metodo que inicializa las variables en la creacion del Bean.
	 */
	@PostConstruct
	public void init() {
		this.ipf_current = PrimeFaces.current();
		il_listaEnumCache = Arrays.asList(EnumCache.values()); 
		iec_enumCacheSeleccionado = il_listaEnumCache.iterator().next().getIs_nombreCache();
		actualizarGruposCache();
	}

	/**
	 * Metodo que actaliza todo el cache del sistema.
	 */
	public void actualizarCache() {
		try {
			iic_cacheBusiness.actualizarCompletoCache();
			ipf_current.executeScript("PF('dialog-validacionActualizacion').hide();");
			GeneradorGrowlGenerico.generarMensajeInformacion(LenguajeUtilidad.consultarMensaje(EnumMensajesCache.OPERACION_EXITOSA, EnumTipoExcepciones.VALIDACION_NEGOCIO));
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo que actualiza el cache general.
	 */
	public void actualizarCacheGrupo() {
		try {
			iic_cacheBusiness.actualizarCacheEspecifico(EnumCache.consultarCache(iec_enumCacheSeleccionado));
			ipf_current.executeScript("PF('dialog-validacionActualizacionGrupo').hide();");
			GeneradorGrowlGenerico.generarMensajeInformacion(LenguajeUtilidad.consultarMensaje(EnumMensajesCache.OPERACION_EXITOSA, EnumTipoExcepciones.VALIDACION_NEGOCIO));
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo que genera modal para la confirmacion de la actualizacion de cache.
	 */
	public void validarActualizacionCache() {
		ipf_current.executeScript("PF('dialog-validacionActualizacion').show();");
	}

	/**
	 * Metodo que genera modal para la confirmacion de la actualizacion de cache por
	 * grupos.
	 */
	public void validarActualizacionCacheGrupo() {
		ipf_current.executeScript("PF('dialog-validacionActualizacionGrupo').show();");
	}

	/**
	 * Metodo que permite actualizar grupo cache especifico.
	 */
	public void actualizarGruposCache() {
		is_valorGrupoCache = iic_cacheBusiness.consultarCacheEspecifico(EnumCache.consultarCache(iec_enumCacheSeleccionado)).toString();
	}

	/**
	 * Obtiene el valor para la propiedad cache business.
	 *
	 * @return El valor de la propiedad cache business
	 */
	public ICacheBusiness getIic_cacheBusiness() {
		return iic_cacheBusiness;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad cache business.
	 *
	 * @param iic_cacheBusiness el nuevo valor para la propiedad cache business
	 */
	public void setIic_cacheBusiness(ICacheBusiness iic_cacheBusiness) {
		this.iic_cacheBusiness = iic_cacheBusiness;
	}

	/**
	 * Obtiene el valor para la propiedad valor grupo cache.
	 *
	 * @return El valor de la propiedad valor grupo cache
	 */
	public String getIs_valorGrupoCache() {
		return is_valorGrupoCache;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad valor grupo cache.
	 *
	 * @param is_valorGrupoCache el nuevo valor para la propiedad valor grupo cache
	 */
	public void setIs_valorGrupoCache(String is_valorGrupoCache) {
		this.is_valorGrupoCache = is_valorGrupoCache;
	}

	/**
	 * Obtiene el valor para la propiedad lista enum cache.
	 *
	 * @return El valor de la propiedad lista enum cache
	 */
	public List<EnumCache> getIl_listaEnumCache() {
		return il_listaEnumCache;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista enum cache.
	 *
	 * @param il_listaEnumCache el nuevo valor para la propiedad lista enum cache
	 */
	public void setIl_listaEnumCache(List<EnumCache> il_listaEnumCache) {
		this.il_listaEnumCache = il_listaEnumCache;
	}

	/**
	 * Obtiene el valor para la propiedad enum cache seleccionado.
	 *
	 * @return El valor de la propiedad enum cache seleccionado
	 */
	public String getIec_enumCacheSeleccionado() {
		return iec_enumCacheSeleccionado;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad enum cache seleccionado.
	 *
	 * @param iec_enumCacheSeleccionado el nuevo valor para la propiedad enum cache
	 *                                  seleccionado
	 */
	public void setIec_enumCacheSeleccionado(String iec_enumCacheSeleccionado) {
		this.iec_enumCacheSeleccionado = iec_enumCacheSeleccionado;
	}

	/**
	 * Obtiene el valor para la propiedad nombre caches.
	 *
	 * @return El valor de la propiedad nombre caches
	 */
	public String getNombreCaches() {
		StringBuilder lsb_cache = new StringBuilder();

		for (EnumCache enumCache : il_listaEnumCache) {	
			if (EnumCache.SESION_REGISTRO_USUARIO_PRINCIPAL == enumCache || 
					EnumCache.SESIONES == enumCache ||
					EnumCache.SESION_REGISTRO_USUARIOS == enumCache) {
				continue;
			}
			lsb_cache.append(enumCache.getIs_nombreCache());
			lsb_cache.append(", ");
		}

		return lsb_cache.toString();
	}

}
